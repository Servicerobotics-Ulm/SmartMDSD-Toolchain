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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOCU_COMMENT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'*'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'", "'SystemParameterModel'", "'extendsSystem'", "'{'", "'}'", "'ComponentParameterInstance'", "'refinesParamStruct'", "'ParameterRefinement'", "'='", "';'", "'.'", "'-'", "'InlineEnumeration'", "'['", "']'", "','"
    };
    public static final int RULE_ML_DOCUMENTATION=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=11;
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
    // InternalSystemParameter.g:68:1: entryRuleSystemParamModel : ruleSystemParamModel EOF ;
    public final void entryRuleSystemParamModel() throws RecognitionException {
        try {
            // InternalSystemParameter.g:69:1: ( ruleSystemParamModel EOF )
            // InternalSystemParameter.g:70:1: ruleSystemParamModel EOF
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
    // InternalSystemParameter.g:77:1: ruleSystemParamModel : ( ( rule__SystemParamModel__Group__0 ) ) ;
    public final void ruleSystemParamModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:81:2: ( ( ( rule__SystemParamModel__Group__0 ) ) )
            // InternalSystemParameter.g:82:2: ( ( rule__SystemParamModel__Group__0 ) )
            {
            // InternalSystemParameter.g:82:2: ( ( rule__SystemParamModel__Group__0 ) )
            // InternalSystemParameter.g:83:3: ( rule__SystemParamModel__Group__0 )
            {
             before(grammarAccess.getSystemParamModelAccess().getGroup()); 
            // InternalSystemParameter.g:84:3: ( rule__SystemParamModel__Group__0 )
            // InternalSystemParameter.g:84:4: rule__SystemParamModel__Group__0
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
    // InternalSystemParameter.g:93:1: entryRuleComponentParameterInstance : ruleComponentParameterInstance EOF ;
    public final void entryRuleComponentParameterInstance() throws RecognitionException {
        try {
            // InternalSystemParameter.g:94:1: ( ruleComponentParameterInstance EOF )
            // InternalSystemParameter.g:95:1: ruleComponentParameterInstance EOF
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
    // InternalSystemParameter.g:102:1: ruleComponentParameterInstance : ( ( rule__ComponentParameterInstance__Group__0 ) ) ;
    public final void ruleComponentParameterInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:106:2: ( ( ( rule__ComponentParameterInstance__Group__0 ) ) )
            // InternalSystemParameter.g:107:2: ( ( rule__ComponentParameterInstance__Group__0 ) )
            {
            // InternalSystemParameter.g:107:2: ( ( rule__ComponentParameterInstance__Group__0 ) )
            // InternalSystemParameter.g:108:3: ( rule__ComponentParameterInstance__Group__0 )
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getGroup()); 
            // InternalSystemParameter.g:109:3: ( rule__ComponentParameterInstance__Group__0 )
            // InternalSystemParameter.g:109:4: rule__ComponentParameterInstance__Group__0
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
    // InternalSystemParameter.g:118:1: entryRuleParameterRefinement : ruleParameterRefinement EOF ;
    public final void entryRuleParameterRefinement() throws RecognitionException {
        try {
            // InternalSystemParameter.g:119:1: ( ruleParameterRefinement EOF )
            // InternalSystemParameter.g:120:1: ruleParameterRefinement EOF
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
    // InternalSystemParameter.g:127:1: ruleParameterRefinement : ( ( rule__ParameterRefinement__Group__0 ) ) ;
    public final void ruleParameterRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:131:2: ( ( ( rule__ParameterRefinement__Group__0 ) ) )
            // InternalSystemParameter.g:132:2: ( ( rule__ParameterRefinement__Group__0 ) )
            {
            // InternalSystemParameter.g:132:2: ( ( rule__ParameterRefinement__Group__0 ) )
            // InternalSystemParameter.g:133:3: ( rule__ParameterRefinement__Group__0 )
            {
             before(grammarAccess.getParameterRefinementAccess().getGroup()); 
            // InternalSystemParameter.g:134:3: ( rule__ParameterRefinement__Group__0 )
            // InternalSystemParameter.g:134:4: rule__ParameterRefinement__Group__0
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
    // InternalSystemParameter.g:143:1: entryRuleAttributeRefinement : ruleAttributeRefinement EOF ;
    public final void entryRuleAttributeRefinement() throws RecognitionException {
        try {
            // InternalSystemParameter.g:144:1: ( ruleAttributeRefinement EOF )
            // InternalSystemParameter.g:145:1: ruleAttributeRefinement EOF
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
    // InternalSystemParameter.g:152:1: ruleAttributeRefinement : ( ( rule__AttributeRefinement__Group__0 ) ) ;
    public final void ruleAttributeRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:156:2: ( ( ( rule__AttributeRefinement__Group__0 ) ) )
            // InternalSystemParameter.g:157:2: ( ( rule__AttributeRefinement__Group__0 ) )
            {
            // InternalSystemParameter.g:157:2: ( ( rule__AttributeRefinement__Group__0 ) )
            // InternalSystemParameter.g:158:3: ( rule__AttributeRefinement__Group__0 )
            {
             before(grammarAccess.getAttributeRefinementAccess().getGroup()); 
            // InternalSystemParameter.g:159:3: ( rule__AttributeRefinement__Group__0 )
            // InternalSystemParameter.g:159:4: rule__AttributeRefinement__Group__0
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
    // InternalSystemParameter.g:168:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalSystemParameter.g:169:1: ( ruleFQN EOF )
            // InternalSystemParameter.g:170:1: ruleFQN EOF
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
    // InternalSystemParameter.g:177:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:181:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalSystemParameter.g:182:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalSystemParameter.g:182:2: ( ( rule__FQN__Group__0 ) )
            // InternalSystemParameter.g:183:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalSystemParameter.g:184:3: ( rule__FQN__Group__0 )
            // InternalSystemParameter.g:184:4: rule__FQN__Group__0
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
    // InternalSystemParameter.g:193:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalSystemParameter.g:194:1: ( ruleEBoolean EOF )
            // InternalSystemParameter.g:195:1: ruleEBoolean EOF
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
    // InternalSystemParameter.g:202:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:206:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalSystemParameter.g:207:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalSystemParameter.g:207:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalSystemParameter.g:208:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalSystemParameter.g:209:3: ( rule__EBoolean__Alternatives )
            // InternalSystemParameter.g:209:4: rule__EBoolean__Alternatives
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
    // InternalSystemParameter.g:218:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSystemParameter.g:219:1: ( ruleEString EOF )
            // InternalSystemParameter.g:220:1: ruleEString EOF
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
    // InternalSystemParameter.g:227:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:231:2: ( ( RULE_STRING ) )
            // InternalSystemParameter.g:232:2: ( RULE_STRING )
            {
            // InternalSystemParameter.g:232:2: ( RULE_STRING )
            // InternalSystemParameter.g:233:3: RULE_STRING
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
    // InternalSystemParameter.g:243:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSystemParameter.g:244:1: ( ruleEInt EOF )
            // InternalSystemParameter.g:245:1: ruleEInt EOF
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
    // InternalSystemParameter.g:252:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:256:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSystemParameter.g:257:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSystemParameter.g:257:2: ( ( rule__EInt__Group__0 ) )
            // InternalSystemParameter.g:258:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSystemParameter.g:259:3: ( rule__EInt__Group__0 )
            // InternalSystemParameter.g:259:4: rule__EInt__Group__0
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
    // InternalSystemParameter.g:268:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalSystemParameter.g:269:1: ( ruleEDouble EOF )
            // InternalSystemParameter.g:270:1: ruleEDouble EOF
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
    // InternalSystemParameter.g:277:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:281:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalSystemParameter.g:282:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalSystemParameter.g:282:2: ( ( rule__EDouble__Group__0 ) )
            // InternalSystemParameter.g:283:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalSystemParameter.g:284:3: ( rule__EDouble__Group__0 )
            // InternalSystemParameter.g:284:4: rule__EDouble__Group__0
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
    // InternalSystemParameter.g:293:1: entryRuleEnumerationElement : ruleEnumerationElement EOF ;
    public final void entryRuleEnumerationElement() throws RecognitionException {
        try {
            // InternalSystemParameter.g:294:1: ( ruleEnumerationElement EOF )
            // InternalSystemParameter.g:295:1: ruleEnumerationElement EOF
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
    // InternalSystemParameter.g:302:1: ruleEnumerationElement : ( ( rule__EnumerationElement__Group__0 ) ) ;
    public final void ruleEnumerationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:306:2: ( ( ( rule__EnumerationElement__Group__0 ) ) )
            // InternalSystemParameter.g:307:2: ( ( rule__EnumerationElement__Group__0 ) )
            {
            // InternalSystemParameter.g:307:2: ( ( rule__EnumerationElement__Group__0 ) )
            // InternalSystemParameter.g:308:3: ( rule__EnumerationElement__Group__0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup()); 
            // InternalSystemParameter.g:309:3: ( rule__EnumerationElement__Group__0 )
            // InternalSystemParameter.g:309:4: rule__EnumerationElement__Group__0
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
    // InternalSystemParameter.g:318:1: entryRuleAbstractAttributeType : ruleAbstractAttributeType EOF ;
    public final void entryRuleAbstractAttributeType() throws RecognitionException {
        try {
            // InternalSystemParameter.g:319:1: ( ruleAbstractAttributeType EOF )
            // InternalSystemParameter.g:320:1: ruleAbstractAttributeType EOF
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
    // InternalSystemParameter.g:327:1: ruleAbstractAttributeType : ( ( rule__AbstractAttributeType__Alternatives ) ) ;
    public final void ruleAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:331:2: ( ( ( rule__AbstractAttributeType__Alternatives ) ) )
            // InternalSystemParameter.g:332:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            {
            // InternalSystemParameter.g:332:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            // InternalSystemParameter.g:333:3: ( rule__AbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalSystemParameter.g:334:3: ( rule__AbstractAttributeType__Alternatives )
            // InternalSystemParameter.g:334:4: rule__AbstractAttributeType__Alternatives
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
    // InternalSystemParameter.g:343:1: entryRuleInlineEnumerationType : ruleInlineEnumerationType EOF ;
    public final void entryRuleInlineEnumerationType() throws RecognitionException {
        try {
            // InternalSystemParameter.g:344:1: ( ruleInlineEnumerationType EOF )
            // InternalSystemParameter.g:345:1: ruleInlineEnumerationType EOF
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
    // InternalSystemParameter.g:352:1: ruleInlineEnumerationType : ( ( rule__InlineEnumerationType__Group__0 ) ) ;
    public final void ruleInlineEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:356:2: ( ( ( rule__InlineEnumerationType__Group__0 ) ) )
            // InternalSystemParameter.g:357:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            {
            // InternalSystemParameter.g:357:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            // InternalSystemParameter.g:358:3: ( rule__InlineEnumerationType__Group__0 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); 
            // InternalSystemParameter.g:359:3: ( rule__InlineEnumerationType__Group__0 )
            // InternalSystemParameter.g:359:4: rule__InlineEnumerationType__Group__0
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
    // InternalSystemParameter.g:368:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalSystemParameter.g:369:1: ( ruleArrayType EOF )
            // InternalSystemParameter.g:370:1: ruleArrayType EOF
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
    // InternalSystemParameter.g:377:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:381:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalSystemParameter.g:382:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalSystemParameter.g:382:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalSystemParameter.g:383:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalSystemParameter.g:384:3: ( rule__ArrayType__Group__0 )
            // InternalSystemParameter.g:384:4: rule__ArrayType__Group__0
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
    // InternalSystemParameter.g:393:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalSystemParameter.g:394:1: ( ruleCardinality EOF )
            // InternalSystemParameter.g:395:1: ruleCardinality EOF
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
    // InternalSystemParameter.g:402:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:406:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalSystemParameter.g:407:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalSystemParameter.g:407:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalSystemParameter.g:408:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalSystemParameter.g:409:3: ( rule__Cardinality__Alternatives )
            // InternalSystemParameter.g:409:4: rule__Cardinality__Alternatives
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
    // InternalSystemParameter.g:418:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalSystemParameter.g:419:1: ( rulePrimitiveType EOF )
            // InternalSystemParameter.g:420:1: rulePrimitiveType EOF
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
    // InternalSystemParameter.g:427:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:431:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalSystemParameter.g:432:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalSystemParameter.g:432:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalSystemParameter.g:433:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalSystemParameter.g:434:3: ( rule__PrimitiveType__Group__0 )
            // InternalSystemParameter.g:434:4: rule__PrimitiveType__Group__0
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
    // InternalSystemParameter.g:443:1: entryRuleAbstractValue : ruleAbstractValue EOF ;
    public final void entryRuleAbstractValue() throws RecognitionException {
        try {
            // InternalSystemParameter.g:444:1: ( ruleAbstractValue EOF )
            // InternalSystemParameter.g:445:1: ruleAbstractValue EOF
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
    // InternalSystemParameter.g:452:1: ruleAbstractValue : ( ( rule__AbstractValue__Alternatives ) ) ;
    public final void ruleAbstractValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:456:2: ( ( ( rule__AbstractValue__Alternatives ) ) )
            // InternalSystemParameter.g:457:2: ( ( rule__AbstractValue__Alternatives ) )
            {
            // InternalSystemParameter.g:457:2: ( ( rule__AbstractValue__Alternatives ) )
            // InternalSystemParameter.g:458:3: ( rule__AbstractValue__Alternatives )
            {
             before(grammarAccess.getAbstractValueAccess().getAlternatives()); 
            // InternalSystemParameter.g:459:3: ( rule__AbstractValue__Alternatives )
            // InternalSystemParameter.g:459:4: rule__AbstractValue__Alternatives
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
    // InternalSystemParameter.g:468:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalSystemParameter.g:469:1: ( ruleArrayValue EOF )
            // InternalSystemParameter.g:470:1: ruleArrayValue EOF
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
    // InternalSystemParameter.g:477:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:481:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalSystemParameter.g:482:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalSystemParameter.g:482:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalSystemParameter.g:483:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalSystemParameter.g:484:3: ( rule__ArrayValue__Group__0 )
            // InternalSystemParameter.g:484:4: rule__ArrayValue__Group__0
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
    // InternalSystemParameter.g:493:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalSystemParameter.g:494:1: ( ruleSingleValue EOF )
            // InternalSystemParameter.g:495:1: ruleSingleValue EOF
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
    // InternalSystemParameter.g:502:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:506:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalSystemParameter.g:507:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalSystemParameter.g:507:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalSystemParameter.g:508:3: ( rule__SingleValue__Alternatives )
            {
             before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            // InternalSystemParameter.g:509:3: ( rule__SingleValue__Alternatives )
            // InternalSystemParameter.g:509:4: rule__SingleValue__Alternatives
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
    // InternalSystemParameter.g:518:1: rulePRIMITIVE_TYPE_NAME : ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) ;
    public final void rulePRIMITIVE_TYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:522:1: ( ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) )
            // InternalSystemParameter.g:523:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            {
            // InternalSystemParameter.g:523:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            // InternalSystemParameter.g:524:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            {
             before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); 
            // InternalSystemParameter.g:525:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            // InternalSystemParameter.g:525:4: rule__PRIMITIVE_TYPE_NAME__Alternatives
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
    // InternalSystemParameter.g:533:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:537:1: ( ( 'true' ) | ( 'false' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSystemParameter.g:538:2: ( 'true' )
                    {
                    // InternalSystemParameter.g:538:2: ( 'true' )
                    // InternalSystemParameter.g:539:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:544:2: ( 'false' )
                    {
                    // InternalSystemParameter.g:544:2: ( 'false' )
                    // InternalSystemParameter.g:545:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalSystemParameter.g:554:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:558:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSystemParameter.g:559:2: ( 'E' )
                    {
                    // InternalSystemParameter.g:559:2: ( 'E' )
                    // InternalSystemParameter.g:560:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:565:2: ( 'e' )
                    {
                    // InternalSystemParameter.g:565:2: ( 'e' )
                    // InternalSystemParameter.g:566:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalSystemParameter.g:575:1: rule__AbstractAttributeType__Alternatives : ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) );
    public final void rule__AbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:579:1: ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=19 && LA3_0<=30)) ) {
                alt3=1;
            }
            else if ( (LA3_0==42) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSystemParameter.g:580:2: ( rulePrimitiveType )
                    {
                    // InternalSystemParameter.g:580:2: ( rulePrimitiveType )
                    // InternalSystemParameter.g:581:3: rulePrimitiveType
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
                    // InternalSystemParameter.g:586:2: ( ruleInlineEnumerationType )
                    {
                    // InternalSystemParameter.g:586:2: ( ruleInlineEnumerationType )
                    // InternalSystemParameter.g:587:3: ruleInlineEnumerationType
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
    // InternalSystemParameter.g:596:1: rule__Cardinality__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:600:1: ( ( RULE_INT ) | ( '*' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSystemParameter.g:601:2: ( RULE_INT )
                    {
                    // InternalSystemParameter.g:601:2: ( RULE_INT )
                    // InternalSystemParameter.g:602:3: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:607:2: ( '*' )
                    {
                    // InternalSystemParameter.g:607:2: ( '*' )
                    // InternalSystemParameter.g:608:3: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalSystemParameter.g:617:1: rule__AbstractValue__Alternatives : ( ( ruleSingleValue ) | ( ruleArrayValue ) );
    public final void rule__AbstractValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:621:1: ( ( ruleSingleValue ) | ( ruleArrayValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||(LA5_0>=14 && LA5_0<=15)||(LA5_0>=40 && LA5_0<=41)) ) {
                alt5=1;
            }
            else if ( (LA5_0==43) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSystemParameter.g:622:2: ( ruleSingleValue )
                    {
                    // InternalSystemParameter.g:622:2: ( ruleSingleValue )
                    // InternalSystemParameter.g:623:3: ruleSingleValue
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
                    // InternalSystemParameter.g:628:2: ( ruleArrayValue )
                    {
                    // InternalSystemParameter.g:628:2: ( ruleArrayValue )
                    // InternalSystemParameter.g:629:3: ruleArrayValue
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
    // InternalSystemParameter.g:638:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:642:1: ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_INT) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==EOF||(LA6_2>=RULE_ID && LA6_2<=RULE_DOCU_COMMENT)||LA6_2==34||LA6_2==39||(LA6_2>=44 && LA6_2<=45)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==40) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==40) ) {
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

                if ( (LA6_2==EOF||(LA6_2>=RULE_ID && LA6_2<=RULE_DOCU_COMMENT)||LA6_2==34||LA6_2==39||(LA6_2>=44 && LA6_2<=45)) ) {
                    alt6=1;
                }
                else if ( (LA6_2==40) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case 14:
            case 15:
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
                    // InternalSystemParameter.g:643:2: ( ( rule__SingleValue__Group_0__0 ) )
                    {
                    // InternalSystemParameter.g:643:2: ( ( rule__SingleValue__Group_0__0 ) )
                    // InternalSystemParameter.g:644:3: ( rule__SingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_0()); 
                    // InternalSystemParameter.g:645:3: ( rule__SingleValue__Group_0__0 )
                    // InternalSystemParameter.g:645:4: rule__SingleValue__Group_0__0
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
                    // InternalSystemParameter.g:649:2: ( ( rule__SingleValue__Group_1__0 ) )
                    {
                    // InternalSystemParameter.g:649:2: ( ( rule__SingleValue__Group_1__0 ) )
                    // InternalSystemParameter.g:650:3: ( rule__SingleValue__Group_1__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_1()); 
                    // InternalSystemParameter.g:651:3: ( rule__SingleValue__Group_1__0 )
                    // InternalSystemParameter.g:651:4: rule__SingleValue__Group_1__0
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
                    // InternalSystemParameter.g:655:2: ( ( rule__SingleValue__Group_2__0 ) )
                    {
                    // InternalSystemParameter.g:655:2: ( ( rule__SingleValue__Group_2__0 ) )
                    // InternalSystemParameter.g:656:3: ( rule__SingleValue__Group_2__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_2()); 
                    // InternalSystemParameter.g:657:3: ( rule__SingleValue__Group_2__0 )
                    // InternalSystemParameter.g:657:4: rule__SingleValue__Group_2__0
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
                    // InternalSystemParameter.g:661:2: ( ( rule__SingleValue__Group_3__0 ) )
                    {
                    // InternalSystemParameter.g:661:2: ( ( rule__SingleValue__Group_3__0 ) )
                    // InternalSystemParameter.g:662:3: ( rule__SingleValue__Group_3__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_3()); 
                    // InternalSystemParameter.g:663:3: ( rule__SingleValue__Group_3__0 )
                    // InternalSystemParameter.g:663:4: rule__SingleValue__Group_3__0
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
                    // InternalSystemParameter.g:667:2: ( ( rule__SingleValue__Group_4__0 ) )
                    {
                    // InternalSystemParameter.g:667:2: ( ( rule__SingleValue__Group_4__0 ) )
                    // InternalSystemParameter.g:668:3: ( rule__SingleValue__Group_4__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_4()); 
                    // InternalSystemParameter.g:669:3: ( rule__SingleValue__Group_4__0 )
                    // InternalSystemParameter.g:669:4: rule__SingleValue__Group_4__0
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
    // InternalSystemParameter.g:677:1: rule__PRIMITIVE_TYPE_NAME__Alternatives : ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PRIMITIVE_TYPE_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:681:1: ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            case 24:
                {
                alt7=6;
                }
                break;
            case 25:
                {
                alt7=7;
                }
                break;
            case 26:
                {
                alt7=8;
                }
                break;
            case 27:
                {
                alt7=9;
                }
                break;
            case 28:
                {
                alt7=10;
                }
                break;
            case 29:
                {
                alt7=11;
                }
                break;
            case 30:
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
                    // InternalSystemParameter.g:682:2: ( ( 'Int8' ) )
                    {
                    // InternalSystemParameter.g:682:2: ( ( 'Int8' ) )
                    // InternalSystemParameter.g:683:3: ( 'Int8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 
                    // InternalSystemParameter.g:684:3: ( 'Int8' )
                    // InternalSystemParameter.g:684:4: 'Int8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:688:2: ( ( 'Int16' ) )
                    {
                    // InternalSystemParameter.g:688:2: ( ( 'Int16' ) )
                    // InternalSystemParameter.g:689:3: ( 'Int16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 
                    // InternalSystemParameter.g:690:3: ( 'Int16' )
                    // InternalSystemParameter.g:690:4: 'Int16'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSystemParameter.g:694:2: ( ( 'Int32' ) )
                    {
                    // InternalSystemParameter.g:694:2: ( ( 'Int32' ) )
                    // InternalSystemParameter.g:695:3: ( 'Int32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 
                    // InternalSystemParameter.g:696:3: ( 'Int32' )
                    // InternalSystemParameter.g:696:4: 'Int32'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSystemParameter.g:700:2: ( ( 'Int64' ) )
                    {
                    // InternalSystemParameter.g:700:2: ( ( 'Int64' ) )
                    // InternalSystemParameter.g:701:3: ( 'Int64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 
                    // InternalSystemParameter.g:702:3: ( 'Int64' )
                    // InternalSystemParameter.g:702:4: 'Int64'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSystemParameter.g:706:2: ( ( 'UInt8' ) )
                    {
                    // InternalSystemParameter.g:706:2: ( ( 'UInt8' ) )
                    // InternalSystemParameter.g:707:3: ( 'UInt8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 
                    // InternalSystemParameter.g:708:3: ( 'UInt8' )
                    // InternalSystemParameter.g:708:4: 'UInt8'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSystemParameter.g:712:2: ( ( 'UInt16' ) )
                    {
                    // InternalSystemParameter.g:712:2: ( ( 'UInt16' ) )
                    // InternalSystemParameter.g:713:3: ( 'UInt16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 
                    // InternalSystemParameter.g:714:3: ( 'UInt16' )
                    // InternalSystemParameter.g:714:4: 'UInt16'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSystemParameter.g:718:2: ( ( 'UInt32' ) )
                    {
                    // InternalSystemParameter.g:718:2: ( ( 'UInt32' ) )
                    // InternalSystemParameter.g:719:3: ( 'UInt32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 
                    // InternalSystemParameter.g:720:3: ( 'UInt32' )
                    // InternalSystemParameter.g:720:4: 'UInt32'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSystemParameter.g:724:2: ( ( 'UInt64' ) )
                    {
                    // InternalSystemParameter.g:724:2: ( ( 'UInt64' ) )
                    // InternalSystemParameter.g:725:3: ( 'UInt64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 
                    // InternalSystemParameter.g:726:3: ( 'UInt64' )
                    // InternalSystemParameter.g:726:4: 'UInt64'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSystemParameter.g:730:2: ( ( 'Float' ) )
                    {
                    // InternalSystemParameter.g:730:2: ( ( 'Float' ) )
                    // InternalSystemParameter.g:731:3: ( 'Float' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 
                    // InternalSystemParameter.g:732:3: ( 'Float' )
                    // InternalSystemParameter.g:732:4: 'Float'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSystemParameter.g:736:2: ( ( 'Double' ) )
                    {
                    // InternalSystemParameter.g:736:2: ( ( 'Double' ) )
                    // InternalSystemParameter.g:737:3: ( 'Double' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 
                    // InternalSystemParameter.g:738:3: ( 'Double' )
                    // InternalSystemParameter.g:738:4: 'Double'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSystemParameter.g:742:2: ( ( 'String' ) )
                    {
                    // InternalSystemParameter.g:742:2: ( ( 'String' ) )
                    // InternalSystemParameter.g:743:3: ( 'String' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 
                    // InternalSystemParameter.g:744:3: ( 'String' )
                    // InternalSystemParameter.g:744:4: 'String'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSystemParameter.g:748:2: ( ( 'Boolean' ) )
                    {
                    // InternalSystemParameter.g:748:2: ( ( 'Boolean' ) )
                    // InternalSystemParameter.g:749:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); 
                    // InternalSystemParameter.g:750:3: ( 'Boolean' )
                    // InternalSystemParameter.g:750:4: 'Boolean'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalSystemParameter.g:758:1: rule__SystemParamModel__Group__0 : rule__SystemParamModel__Group__0__Impl rule__SystemParamModel__Group__1 ;
    public final void rule__SystemParamModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:762:1: ( rule__SystemParamModel__Group__0__Impl rule__SystemParamModel__Group__1 )
            // InternalSystemParameter.g:763:2: rule__SystemParamModel__Group__0__Impl rule__SystemParamModel__Group__1
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
    // InternalSystemParameter.g:770:1: rule__SystemParamModel__Group__0__Impl : ( () ) ;
    public final void rule__SystemParamModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:774:1: ( ( () ) )
            // InternalSystemParameter.g:775:1: ( () )
            {
            // InternalSystemParameter.g:775:1: ( () )
            // InternalSystemParameter.g:776:2: ()
            {
             before(grammarAccess.getSystemParamModelAccess().getSystemParamModelAction_0()); 
            // InternalSystemParameter.g:777:2: ()
            // InternalSystemParameter.g:777:3: 
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
    // InternalSystemParameter.g:785:1: rule__SystemParamModel__Group__1 : rule__SystemParamModel__Group__1__Impl rule__SystemParamModel__Group__2 ;
    public final void rule__SystemParamModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:789:1: ( rule__SystemParamModel__Group__1__Impl rule__SystemParamModel__Group__2 )
            // InternalSystemParameter.g:790:2: rule__SystemParamModel__Group__1__Impl rule__SystemParamModel__Group__2
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
    // InternalSystemParameter.g:797:1: rule__SystemParamModel__Group__1__Impl : ( 'SystemParameterModel' ) ;
    public final void rule__SystemParamModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:801:1: ( ( 'SystemParameterModel' ) )
            // InternalSystemParameter.g:802:1: ( 'SystemParameterModel' )
            {
            // InternalSystemParameter.g:802:1: ( 'SystemParameterModel' )
            // InternalSystemParameter.g:803:2: 'SystemParameterModel'
            {
             before(grammarAccess.getSystemParamModelAccess().getSystemParameterModelKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSystemParameter.g:812:1: rule__SystemParamModel__Group__2 : rule__SystemParamModel__Group__2__Impl rule__SystemParamModel__Group__3 ;
    public final void rule__SystemParamModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:816:1: ( rule__SystemParamModel__Group__2__Impl rule__SystemParamModel__Group__3 )
            // InternalSystemParameter.g:817:2: rule__SystemParamModel__Group__2__Impl rule__SystemParamModel__Group__3
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
    // InternalSystemParameter.g:824:1: rule__SystemParamModel__Group__2__Impl : ( ( rule__SystemParamModel__NameAssignment_2 ) ) ;
    public final void rule__SystemParamModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:828:1: ( ( ( rule__SystemParamModel__NameAssignment_2 ) ) )
            // InternalSystemParameter.g:829:1: ( ( rule__SystemParamModel__NameAssignment_2 ) )
            {
            // InternalSystemParameter.g:829:1: ( ( rule__SystemParamModel__NameAssignment_2 ) )
            // InternalSystemParameter.g:830:2: ( rule__SystemParamModel__NameAssignment_2 )
            {
             before(grammarAccess.getSystemParamModelAccess().getNameAssignment_2()); 
            // InternalSystemParameter.g:831:2: ( rule__SystemParamModel__NameAssignment_2 )
            // InternalSystemParameter.g:831:3: rule__SystemParamModel__NameAssignment_2
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
    // InternalSystemParameter.g:839:1: rule__SystemParamModel__Group__3 : rule__SystemParamModel__Group__3__Impl rule__SystemParamModel__Group__4 ;
    public final void rule__SystemParamModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:843:1: ( rule__SystemParamModel__Group__3__Impl rule__SystemParamModel__Group__4 )
            // InternalSystemParameter.g:844:2: rule__SystemParamModel__Group__3__Impl rule__SystemParamModel__Group__4
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
    // InternalSystemParameter.g:851:1: rule__SystemParamModel__Group__3__Impl : ( 'extendsSystem' ) ;
    public final void rule__SystemParamModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:855:1: ( ( 'extendsSystem' ) )
            // InternalSystemParameter.g:856:1: ( 'extendsSystem' )
            {
            // InternalSystemParameter.g:856:1: ( 'extendsSystem' )
            // InternalSystemParameter.g:857:2: 'extendsSystem'
            {
             before(grammarAccess.getSystemParamModelAccess().getExtendsSystemKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSystemParameter.g:866:1: rule__SystemParamModel__Group__4 : rule__SystemParamModel__Group__4__Impl rule__SystemParamModel__Group__5 ;
    public final void rule__SystemParamModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:870:1: ( rule__SystemParamModel__Group__4__Impl rule__SystemParamModel__Group__5 )
            // InternalSystemParameter.g:871:2: rule__SystemParamModel__Group__4__Impl rule__SystemParamModel__Group__5
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
    // InternalSystemParameter.g:878:1: rule__SystemParamModel__Group__4__Impl : ( ( rule__SystemParamModel__SystemAssignment_4 ) ) ;
    public final void rule__SystemParamModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:882:1: ( ( ( rule__SystemParamModel__SystemAssignment_4 ) ) )
            // InternalSystemParameter.g:883:1: ( ( rule__SystemParamModel__SystemAssignment_4 ) )
            {
            // InternalSystemParameter.g:883:1: ( ( rule__SystemParamModel__SystemAssignment_4 ) )
            // InternalSystemParameter.g:884:2: ( rule__SystemParamModel__SystemAssignment_4 )
            {
             before(grammarAccess.getSystemParamModelAccess().getSystemAssignment_4()); 
            // InternalSystemParameter.g:885:2: ( rule__SystemParamModel__SystemAssignment_4 )
            // InternalSystemParameter.g:885:3: rule__SystemParamModel__SystemAssignment_4
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
    // InternalSystemParameter.g:893:1: rule__SystemParamModel__Group__5 : rule__SystemParamModel__Group__5__Impl rule__SystemParamModel__Group__6 ;
    public final void rule__SystemParamModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:897:1: ( rule__SystemParamModel__Group__5__Impl rule__SystemParamModel__Group__6 )
            // InternalSystemParameter.g:898:2: rule__SystemParamModel__Group__5__Impl rule__SystemParamModel__Group__6
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
    // InternalSystemParameter.g:905:1: rule__SystemParamModel__Group__5__Impl : ( '{' ) ;
    public final void rule__SystemParamModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:909:1: ( ( '{' ) )
            // InternalSystemParameter.g:910:1: ( '{' )
            {
            // InternalSystemParameter.g:910:1: ( '{' )
            // InternalSystemParameter.g:911:2: '{'
            {
             before(grammarAccess.getSystemParamModelAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSystemParameter.g:920:1: rule__SystemParamModel__Group__6 : rule__SystemParamModel__Group__6__Impl rule__SystemParamModel__Group__7 ;
    public final void rule__SystemParamModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:924:1: ( rule__SystemParamModel__Group__6__Impl rule__SystemParamModel__Group__7 )
            // InternalSystemParameter.g:925:2: rule__SystemParamModel__Group__6__Impl rule__SystemParamModel__Group__7
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
    // InternalSystemParameter.g:932:1: rule__SystemParamModel__Group__6__Impl : ( ( rule__SystemParamModel__ComponentsAssignment_6 )* ) ;
    public final void rule__SystemParamModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:936:1: ( ( ( rule__SystemParamModel__ComponentsAssignment_6 )* ) )
            // InternalSystemParameter.g:937:1: ( ( rule__SystemParamModel__ComponentsAssignment_6 )* )
            {
            // InternalSystemParameter.g:937:1: ( ( rule__SystemParamModel__ComponentsAssignment_6 )* )
            // InternalSystemParameter.g:938:2: ( rule__SystemParamModel__ComponentsAssignment_6 )*
            {
             before(grammarAccess.getSystemParamModelAccess().getComponentsAssignment_6()); 
            // InternalSystemParameter.g:939:2: ( rule__SystemParamModel__ComponentsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSystemParameter.g:939:3: rule__SystemParamModel__ComponentsAssignment_6
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
    // InternalSystemParameter.g:947:1: rule__SystemParamModel__Group__7 : rule__SystemParamModel__Group__7__Impl ;
    public final void rule__SystemParamModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:951:1: ( rule__SystemParamModel__Group__7__Impl )
            // InternalSystemParameter.g:952:2: rule__SystemParamModel__Group__7__Impl
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
    // InternalSystemParameter.g:958:1: rule__SystemParamModel__Group__7__Impl : ( '}' ) ;
    public final void rule__SystemParamModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:962:1: ( ( '}' ) )
            // InternalSystemParameter.g:963:1: ( '}' )
            {
            // InternalSystemParameter.g:963:1: ( '}' )
            // InternalSystemParameter.g:964:2: '}'
            {
             before(grammarAccess.getSystemParamModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSystemParameter.g:974:1: rule__ComponentParameterInstance__Group__0 : rule__ComponentParameterInstance__Group__0__Impl rule__ComponentParameterInstance__Group__1 ;
    public final void rule__ComponentParameterInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:978:1: ( rule__ComponentParameterInstance__Group__0__Impl rule__ComponentParameterInstance__Group__1 )
            // InternalSystemParameter.g:979:2: rule__ComponentParameterInstance__Group__0__Impl rule__ComponentParameterInstance__Group__1
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
    // InternalSystemParameter.g:986:1: rule__ComponentParameterInstance__Group__0__Impl : ( 'ComponentParameterInstance' ) ;
    public final void rule__ComponentParameterInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:990:1: ( ( 'ComponentParameterInstance' ) )
            // InternalSystemParameter.g:991:1: ( 'ComponentParameterInstance' )
            {
            // InternalSystemParameter.g:991:1: ( 'ComponentParameterInstance' )
            // InternalSystemParameter.g:992:2: 'ComponentParameterInstance'
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getComponentParameterInstanceKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSystemParameter.g:1001:1: rule__ComponentParameterInstance__Group__1 : rule__ComponentParameterInstance__Group__1__Impl rule__ComponentParameterInstance__Group__2 ;
    public final void rule__ComponentParameterInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1005:1: ( rule__ComponentParameterInstance__Group__1__Impl rule__ComponentParameterInstance__Group__2 )
            // InternalSystemParameter.g:1006:2: rule__ComponentParameterInstance__Group__1__Impl rule__ComponentParameterInstance__Group__2
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
    // InternalSystemParameter.g:1013:1: rule__ComponentParameterInstance__Group__1__Impl : ( ( rule__ComponentParameterInstance__ComponentInstanceAssignment_1 ) ) ;
    public final void rule__ComponentParameterInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1017:1: ( ( ( rule__ComponentParameterInstance__ComponentInstanceAssignment_1 ) ) )
            // InternalSystemParameter.g:1018:1: ( ( rule__ComponentParameterInstance__ComponentInstanceAssignment_1 ) )
            {
            // InternalSystemParameter.g:1018:1: ( ( rule__ComponentParameterInstance__ComponentInstanceAssignment_1 ) )
            // InternalSystemParameter.g:1019:2: ( rule__ComponentParameterInstance__ComponentInstanceAssignment_1 )
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getComponentInstanceAssignment_1()); 
            // InternalSystemParameter.g:1020:2: ( rule__ComponentParameterInstance__ComponentInstanceAssignment_1 )
            // InternalSystemParameter.g:1020:3: rule__ComponentParameterInstance__ComponentInstanceAssignment_1
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
    // InternalSystemParameter.g:1028:1: rule__ComponentParameterInstance__Group__2 : rule__ComponentParameterInstance__Group__2__Impl rule__ComponentParameterInstance__Group__3 ;
    public final void rule__ComponentParameterInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1032:1: ( rule__ComponentParameterInstance__Group__2__Impl rule__ComponentParameterInstance__Group__3 )
            // InternalSystemParameter.g:1033:2: rule__ComponentParameterInstance__Group__2__Impl rule__ComponentParameterInstance__Group__3
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
    // InternalSystemParameter.g:1040:1: rule__ComponentParameterInstance__Group__2__Impl : ( ( rule__ComponentParameterInstance__Group_2__0 )? ) ;
    public final void rule__ComponentParameterInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1044:1: ( ( ( rule__ComponentParameterInstance__Group_2__0 )? ) )
            // InternalSystemParameter.g:1045:1: ( ( rule__ComponentParameterInstance__Group_2__0 )? )
            {
            // InternalSystemParameter.g:1045:1: ( ( rule__ComponentParameterInstance__Group_2__0 )? )
            // InternalSystemParameter.g:1046:2: ( rule__ComponentParameterInstance__Group_2__0 )?
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getGroup_2()); 
            // InternalSystemParameter.g:1047:2: ( rule__ComponentParameterInstance__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSystemParameter.g:1047:3: rule__ComponentParameterInstance__Group_2__0
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
    // InternalSystemParameter.g:1055:1: rule__ComponentParameterInstance__Group__3 : rule__ComponentParameterInstance__Group__3__Impl rule__ComponentParameterInstance__Group__4 ;
    public final void rule__ComponentParameterInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1059:1: ( rule__ComponentParameterInstance__Group__3__Impl rule__ComponentParameterInstance__Group__4 )
            // InternalSystemParameter.g:1060:2: rule__ComponentParameterInstance__Group__3__Impl rule__ComponentParameterInstance__Group__4
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
    // InternalSystemParameter.g:1067:1: rule__ComponentParameterInstance__Group__3__Impl : ( '{' ) ;
    public final void rule__ComponentParameterInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1071:1: ( ( '{' ) )
            // InternalSystemParameter.g:1072:1: ( '{' )
            {
            // InternalSystemParameter.g:1072:1: ( '{' )
            // InternalSystemParameter.g:1073:2: '{'
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSystemParameter.g:1082:1: rule__ComponentParameterInstance__Group__4 : rule__ComponentParameterInstance__Group__4__Impl rule__ComponentParameterInstance__Group__5 ;
    public final void rule__ComponentParameterInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1086:1: ( rule__ComponentParameterInstance__Group__4__Impl rule__ComponentParameterInstance__Group__5 )
            // InternalSystemParameter.g:1087:2: rule__ComponentParameterInstance__Group__4__Impl rule__ComponentParameterInstance__Group__5
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
    // InternalSystemParameter.g:1094:1: rule__ComponentParameterInstance__Group__4__Impl : ( ( rule__ComponentParameterInstance__ParametersAssignment_4 )* ) ;
    public final void rule__ComponentParameterInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1098:1: ( ( ( rule__ComponentParameterInstance__ParametersAssignment_4 )* ) )
            // InternalSystemParameter.g:1099:1: ( ( rule__ComponentParameterInstance__ParametersAssignment_4 )* )
            {
            // InternalSystemParameter.g:1099:1: ( ( rule__ComponentParameterInstance__ParametersAssignment_4 )* )
            // InternalSystemParameter.g:1100:2: ( rule__ComponentParameterInstance__ParametersAssignment_4 )*
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getParametersAssignment_4()); 
            // InternalSystemParameter.g:1101:2: ( rule__ComponentParameterInstance__ParametersAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_DOCU_COMMENT||LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSystemParameter.g:1101:3: rule__ComponentParameterInstance__ParametersAssignment_4
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
    // InternalSystemParameter.g:1109:1: rule__ComponentParameterInstance__Group__5 : rule__ComponentParameterInstance__Group__5__Impl ;
    public final void rule__ComponentParameterInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1113:1: ( rule__ComponentParameterInstance__Group__5__Impl )
            // InternalSystemParameter.g:1114:2: rule__ComponentParameterInstance__Group__5__Impl
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
    // InternalSystemParameter.g:1120:1: rule__ComponentParameterInstance__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentParameterInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1124:1: ( ( '}' ) )
            // InternalSystemParameter.g:1125:1: ( '}' )
            {
            // InternalSystemParameter.g:1125:1: ( '}' )
            // InternalSystemParameter.g:1126:2: '}'
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSystemParameter.g:1136:1: rule__ComponentParameterInstance__Group_2__0 : rule__ComponentParameterInstance__Group_2__0__Impl rule__ComponentParameterInstance__Group_2__1 ;
    public final void rule__ComponentParameterInstance__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1140:1: ( rule__ComponentParameterInstance__Group_2__0__Impl rule__ComponentParameterInstance__Group_2__1 )
            // InternalSystemParameter.g:1141:2: rule__ComponentParameterInstance__Group_2__0__Impl rule__ComponentParameterInstance__Group_2__1
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
    // InternalSystemParameter.g:1148:1: rule__ComponentParameterInstance__Group_2__0__Impl : ( 'refinesParamStruct' ) ;
    public final void rule__ComponentParameterInstance__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1152:1: ( ( 'refinesParamStruct' ) )
            // InternalSystemParameter.g:1153:1: ( 'refinesParamStruct' )
            {
            // InternalSystemParameter.g:1153:1: ( 'refinesParamStruct' )
            // InternalSystemParameter.g:1154:2: 'refinesParamStruct'
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getRefinesParamStructKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSystemParameter.g:1163:1: rule__ComponentParameterInstance__Group_2__1 : rule__ComponentParameterInstance__Group_2__1__Impl ;
    public final void rule__ComponentParameterInstance__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1167:1: ( rule__ComponentParameterInstance__Group_2__1__Impl )
            // InternalSystemParameter.g:1168:2: rule__ComponentParameterInstance__Group_2__1__Impl
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
    // InternalSystemParameter.g:1174:1: rule__ComponentParameterInstance__Group_2__1__Impl : ( ( rule__ComponentParameterInstance__ComponentParamAssignment_2_1 ) ) ;
    public final void rule__ComponentParameterInstance__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1178:1: ( ( ( rule__ComponentParameterInstance__ComponentParamAssignment_2_1 ) ) )
            // InternalSystemParameter.g:1179:1: ( ( rule__ComponentParameterInstance__ComponentParamAssignment_2_1 ) )
            {
            // InternalSystemParameter.g:1179:1: ( ( rule__ComponentParameterInstance__ComponentParamAssignment_2_1 ) )
            // InternalSystemParameter.g:1180:2: ( rule__ComponentParameterInstance__ComponentParamAssignment_2_1 )
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getComponentParamAssignment_2_1()); 
            // InternalSystemParameter.g:1181:2: ( rule__ComponentParameterInstance__ComponentParamAssignment_2_1 )
            // InternalSystemParameter.g:1181:3: rule__ComponentParameterInstance__ComponentParamAssignment_2_1
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
    // InternalSystemParameter.g:1190:1: rule__ParameterRefinement__Group__0 : rule__ParameterRefinement__Group__0__Impl rule__ParameterRefinement__Group__1 ;
    public final void rule__ParameterRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1194:1: ( rule__ParameterRefinement__Group__0__Impl rule__ParameterRefinement__Group__1 )
            // InternalSystemParameter.g:1195:2: rule__ParameterRefinement__Group__0__Impl rule__ParameterRefinement__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSystemParameter.g:1202:1: rule__ParameterRefinement__Group__0__Impl : ( ( rule__ParameterRefinement__DocumentationAssignment_0 )? ) ;
    public final void rule__ParameterRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1206:1: ( ( ( rule__ParameterRefinement__DocumentationAssignment_0 )? ) )
            // InternalSystemParameter.g:1207:1: ( ( rule__ParameterRefinement__DocumentationAssignment_0 )? )
            {
            // InternalSystemParameter.g:1207:1: ( ( rule__ParameterRefinement__DocumentationAssignment_0 )? )
            // InternalSystemParameter.g:1208:2: ( rule__ParameterRefinement__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getParameterRefinementAccess().getDocumentationAssignment_0()); 
            // InternalSystemParameter.g:1209:2: ( rule__ParameterRefinement__DocumentationAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DOCU_COMMENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSystemParameter.g:1209:3: rule__ParameterRefinement__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterRefinement__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterRefinementAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalSystemParameter.g:1217:1: rule__ParameterRefinement__Group__1 : rule__ParameterRefinement__Group__1__Impl rule__ParameterRefinement__Group__2 ;
    public final void rule__ParameterRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1221:1: ( rule__ParameterRefinement__Group__1__Impl rule__ParameterRefinement__Group__2 )
            // InternalSystemParameter.g:1222:2: rule__ParameterRefinement__Group__1__Impl rule__ParameterRefinement__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSystemParameter.g:1229:1: rule__ParameterRefinement__Group__1__Impl : ( 'ParameterRefinement' ) ;
    public final void rule__ParameterRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1233:1: ( ( 'ParameterRefinement' ) )
            // InternalSystemParameter.g:1234:1: ( 'ParameterRefinement' )
            {
            // InternalSystemParameter.g:1234:1: ( 'ParameterRefinement' )
            // InternalSystemParameter.g:1235:2: 'ParameterRefinement'
            {
             before(grammarAccess.getParameterRefinementAccess().getParameterRefinementKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParameterRefinementAccess().getParameterRefinementKeyword_1()); 

            }


            }

        }
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
    // InternalSystemParameter.g:1244:1: rule__ParameterRefinement__Group__2 : rule__ParameterRefinement__Group__2__Impl rule__ParameterRefinement__Group__3 ;
    public final void rule__ParameterRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1248:1: ( rule__ParameterRefinement__Group__2__Impl rule__ParameterRefinement__Group__3 )
            // InternalSystemParameter.g:1249:2: rule__ParameterRefinement__Group__2__Impl rule__ParameterRefinement__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSystemParameter.g:1256:1: rule__ParameterRefinement__Group__2__Impl : ( ( rule__ParameterRefinement__ParameterAssignment_2 ) ) ;
    public final void rule__ParameterRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1260:1: ( ( ( rule__ParameterRefinement__ParameterAssignment_2 ) ) )
            // InternalSystemParameter.g:1261:1: ( ( rule__ParameterRefinement__ParameterAssignment_2 ) )
            {
            // InternalSystemParameter.g:1261:1: ( ( rule__ParameterRefinement__ParameterAssignment_2 ) )
            // InternalSystemParameter.g:1262:2: ( rule__ParameterRefinement__ParameterAssignment_2 )
            {
             before(grammarAccess.getParameterRefinementAccess().getParameterAssignment_2()); 
            // InternalSystemParameter.g:1263:2: ( rule__ParameterRefinement__ParameterAssignment_2 )
            // InternalSystemParameter.g:1263:3: rule__ParameterRefinement__ParameterAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterRefinement__ParameterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterRefinementAccess().getParameterAssignment_2()); 

            }


            }

        }
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
    // InternalSystemParameter.g:1271:1: rule__ParameterRefinement__Group__3 : rule__ParameterRefinement__Group__3__Impl rule__ParameterRefinement__Group__4 ;
    public final void rule__ParameterRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1275:1: ( rule__ParameterRefinement__Group__3__Impl rule__ParameterRefinement__Group__4 )
            // InternalSystemParameter.g:1276:2: rule__ParameterRefinement__Group__3__Impl rule__ParameterRefinement__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalSystemParameter.g:1283:1: rule__ParameterRefinement__Group__3__Impl : ( '{' ) ;
    public final void rule__ParameterRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1287:1: ( ( '{' ) )
            // InternalSystemParameter.g:1288:1: ( '{' )
            {
            // InternalSystemParameter.g:1288:1: ( '{' )
            // InternalSystemParameter.g:1289:2: '{'
            {
             before(grammarAccess.getParameterRefinementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getParameterRefinementAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalSystemParameter.g:1298:1: rule__ParameterRefinement__Group__4 : rule__ParameterRefinement__Group__4__Impl rule__ParameterRefinement__Group__5 ;
    public final void rule__ParameterRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1302:1: ( rule__ParameterRefinement__Group__4__Impl rule__ParameterRefinement__Group__5 )
            // InternalSystemParameter.g:1303:2: rule__ParameterRefinement__Group__4__Impl rule__ParameterRefinement__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ParameterRefinement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterRefinement__Group__5();

            state._fsp--;


            }

        }
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
    // InternalSystemParameter.g:1310:1: rule__ParameterRefinement__Group__4__Impl : ( ( rule__ParameterRefinement__AttributesAssignment_4 )* ) ;
    public final void rule__ParameterRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1314:1: ( ( ( rule__ParameterRefinement__AttributesAssignment_4 )* ) )
            // InternalSystemParameter.g:1315:1: ( ( rule__ParameterRefinement__AttributesAssignment_4 )* )
            {
            // InternalSystemParameter.g:1315:1: ( ( rule__ParameterRefinement__AttributesAssignment_4 )* )
            // InternalSystemParameter.g:1316:2: ( rule__ParameterRefinement__AttributesAssignment_4 )*
            {
             before(grammarAccess.getParameterRefinementAccess().getAttributesAssignment_4()); 
            // InternalSystemParameter.g:1317:2: ( rule__ParameterRefinement__AttributesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_DOCU_COMMENT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSystemParameter.g:1317:3: rule__ParameterRefinement__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ParameterRefinement__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getParameterRefinementAccess().getAttributesAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ParameterRefinement__Group__5"
    // InternalSystemParameter.g:1325:1: rule__ParameterRefinement__Group__5 : rule__ParameterRefinement__Group__5__Impl ;
    public final void rule__ParameterRefinement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1329:1: ( rule__ParameterRefinement__Group__5__Impl )
            // InternalSystemParameter.g:1330:2: rule__ParameterRefinement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterRefinement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__Group__5"


    // $ANTLR start "rule__ParameterRefinement__Group__5__Impl"
    // InternalSystemParameter.g:1336:1: rule__ParameterRefinement__Group__5__Impl : ( '}' ) ;
    public final void rule__ParameterRefinement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1340:1: ( ( '}' ) )
            // InternalSystemParameter.g:1341:1: ( '}' )
            {
            // InternalSystemParameter.g:1341:1: ( '}' )
            // InternalSystemParameter.g:1342:2: '}'
            {
             before(grammarAccess.getParameterRefinementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getParameterRefinementAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__Group__5__Impl"


    // $ANTLR start "rule__AttributeRefinement__Group__0"
    // InternalSystemParameter.g:1352:1: rule__AttributeRefinement__Group__0 : rule__AttributeRefinement__Group__0__Impl rule__AttributeRefinement__Group__1 ;
    public final void rule__AttributeRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1356:1: ( rule__AttributeRefinement__Group__0__Impl rule__AttributeRefinement__Group__1 )
            // InternalSystemParameter.g:1357:2: rule__AttributeRefinement__Group__0__Impl rule__AttributeRefinement__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSystemParameter.g:1364:1: rule__AttributeRefinement__Group__0__Impl : ( ( rule__AttributeRefinement__DocumentationAssignment_0 )? ) ;
    public final void rule__AttributeRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1368:1: ( ( ( rule__AttributeRefinement__DocumentationAssignment_0 )? ) )
            // InternalSystemParameter.g:1369:1: ( ( rule__AttributeRefinement__DocumentationAssignment_0 )? )
            {
            // InternalSystemParameter.g:1369:1: ( ( rule__AttributeRefinement__DocumentationAssignment_0 )? )
            // InternalSystemParameter.g:1370:2: ( rule__AttributeRefinement__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getAttributeRefinementAccess().getDocumentationAssignment_0()); 
            // InternalSystemParameter.g:1371:2: ( rule__AttributeRefinement__DocumentationAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DOCU_COMMENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSystemParameter.g:1371:3: rule__AttributeRefinement__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeRefinement__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeRefinementAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalSystemParameter.g:1379:1: rule__AttributeRefinement__Group__1 : rule__AttributeRefinement__Group__1__Impl rule__AttributeRefinement__Group__2 ;
    public final void rule__AttributeRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1383:1: ( rule__AttributeRefinement__Group__1__Impl rule__AttributeRefinement__Group__2 )
            // InternalSystemParameter.g:1384:2: rule__AttributeRefinement__Group__1__Impl rule__AttributeRefinement__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalSystemParameter.g:1391:1: rule__AttributeRefinement__Group__1__Impl : ( ( rule__AttributeRefinement__AttributeAssignment_1 ) ) ;
    public final void rule__AttributeRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1395:1: ( ( ( rule__AttributeRefinement__AttributeAssignment_1 ) ) )
            // InternalSystemParameter.g:1396:1: ( ( rule__AttributeRefinement__AttributeAssignment_1 ) )
            {
            // InternalSystemParameter.g:1396:1: ( ( rule__AttributeRefinement__AttributeAssignment_1 ) )
            // InternalSystemParameter.g:1397:2: ( rule__AttributeRefinement__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeRefinementAccess().getAttributeAssignment_1()); 
            // InternalSystemParameter.g:1398:2: ( rule__AttributeRefinement__AttributeAssignment_1 )
            // InternalSystemParameter.g:1398:3: rule__AttributeRefinement__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeRefinement__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRefinementAccess().getAttributeAssignment_1()); 

            }


            }

        }
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
    // InternalSystemParameter.g:1406:1: rule__AttributeRefinement__Group__2 : rule__AttributeRefinement__Group__2__Impl rule__AttributeRefinement__Group__3 ;
    public final void rule__AttributeRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1410:1: ( rule__AttributeRefinement__Group__2__Impl rule__AttributeRefinement__Group__3 )
            // InternalSystemParameter.g:1411:2: rule__AttributeRefinement__Group__2__Impl rule__AttributeRefinement__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSystemParameter.g:1418:1: rule__AttributeRefinement__Group__2__Impl : ( '=' ) ;
    public final void rule__AttributeRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1422:1: ( ( '=' ) )
            // InternalSystemParameter.g:1423:1: ( '=' )
            {
            // InternalSystemParameter.g:1423:1: ( '=' )
            // InternalSystemParameter.g:1424:2: '='
            {
             before(grammarAccess.getAttributeRefinementAccess().getEqualsSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAttributeRefinementAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalSystemParameter.g:1433:1: rule__AttributeRefinement__Group__3 : rule__AttributeRefinement__Group__3__Impl rule__AttributeRefinement__Group__4 ;
    public final void rule__AttributeRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1437:1: ( rule__AttributeRefinement__Group__3__Impl rule__AttributeRefinement__Group__4 )
            // InternalSystemParameter.g:1438:2: rule__AttributeRefinement__Group__3__Impl rule__AttributeRefinement__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__AttributeRefinement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeRefinement__Group__4();

            state._fsp--;


            }

        }
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
    // InternalSystemParameter.g:1445:1: rule__AttributeRefinement__Group__3__Impl : ( ( rule__AttributeRefinement__ValueAssignment_3 ) ) ;
    public final void rule__AttributeRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1449:1: ( ( ( rule__AttributeRefinement__ValueAssignment_3 ) ) )
            // InternalSystemParameter.g:1450:1: ( ( rule__AttributeRefinement__ValueAssignment_3 ) )
            {
            // InternalSystemParameter.g:1450:1: ( ( rule__AttributeRefinement__ValueAssignment_3 ) )
            // InternalSystemParameter.g:1451:2: ( rule__AttributeRefinement__ValueAssignment_3 )
            {
             before(grammarAccess.getAttributeRefinementAccess().getValueAssignment_3()); 
            // InternalSystemParameter.g:1452:2: ( rule__AttributeRefinement__ValueAssignment_3 )
            // InternalSystemParameter.g:1452:3: rule__AttributeRefinement__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeRefinement__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRefinementAccess().getValueAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__AttributeRefinement__Group__4"
    // InternalSystemParameter.g:1460:1: rule__AttributeRefinement__Group__4 : rule__AttributeRefinement__Group__4__Impl ;
    public final void rule__AttributeRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1464:1: ( rule__AttributeRefinement__Group__4__Impl )
            // InternalSystemParameter.g:1465:2: rule__AttributeRefinement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeRefinement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__Group__4"


    // $ANTLR start "rule__AttributeRefinement__Group__4__Impl"
    // InternalSystemParameter.g:1471:1: rule__AttributeRefinement__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__AttributeRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1475:1: ( ( ( ';' )? ) )
            // InternalSystemParameter.g:1476:1: ( ( ';' )? )
            {
            // InternalSystemParameter.g:1476:1: ( ( ';' )? )
            // InternalSystemParameter.g:1477:2: ( ';' )?
            {
             before(grammarAccess.getAttributeRefinementAccess().getSemicolonKeyword_4()); 
            // InternalSystemParameter.g:1478:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSystemParameter.g:1478:3: ';'
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeRefinementAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__Group__4__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalSystemParameter.g:1487:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1491:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSystemParameter.g:1492:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSystemParameter.g:1499:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1503:1: ( ( RULE_ID ) )
            // InternalSystemParameter.g:1504:1: ( RULE_ID )
            {
            // InternalSystemParameter.g:1504:1: ( RULE_ID )
            // InternalSystemParameter.g:1505:2: RULE_ID
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
    // InternalSystemParameter.g:1514:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1518:1: ( rule__FQN__Group__1__Impl )
            // InternalSystemParameter.g:1519:2: rule__FQN__Group__1__Impl
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
    // InternalSystemParameter.g:1525:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1529:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSystemParameter.g:1530:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSystemParameter.g:1530:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSystemParameter.g:1531:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalSystemParameter.g:1532:2: ( rule__FQN__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSystemParameter.g:1532:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalSystemParameter.g:1541:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1545:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSystemParameter.g:1546:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalSystemParameter.g:1553:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1557:1: ( ( '.' ) )
            // InternalSystemParameter.g:1558:1: ( '.' )
            {
            // InternalSystemParameter.g:1558:1: ( '.' )
            // InternalSystemParameter.g:1559:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSystemParameter.g:1568:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1572:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSystemParameter.g:1573:2: rule__FQN__Group_1__1__Impl
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
    // InternalSystemParameter.g:1579:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1583:1: ( ( RULE_ID ) )
            // InternalSystemParameter.g:1584:1: ( RULE_ID )
            {
            // InternalSystemParameter.g:1584:1: ( RULE_ID )
            // InternalSystemParameter.g:1585:2: RULE_ID
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
    // InternalSystemParameter.g:1595:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1599:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSystemParameter.g:1600:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSystemParameter.g:1607:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1611:1: ( ( ( '-' )? ) )
            // InternalSystemParameter.g:1612:1: ( ( '-' )? )
            {
            // InternalSystemParameter.g:1612:1: ( ( '-' )? )
            // InternalSystemParameter.g:1613:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSystemParameter.g:1614:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSystemParameter.g:1614:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalSystemParameter.g:1622:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1626:1: ( rule__EInt__Group__1__Impl )
            // InternalSystemParameter.g:1627:2: rule__EInt__Group__1__Impl
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
    // InternalSystemParameter.g:1633:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1637:1: ( ( RULE_INT ) )
            // InternalSystemParameter.g:1638:1: ( RULE_INT )
            {
            // InternalSystemParameter.g:1638:1: ( RULE_INT )
            // InternalSystemParameter.g:1639:2: RULE_INT
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
    // InternalSystemParameter.g:1649:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1653:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalSystemParameter.g:1654:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSystemParameter.g:1661:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1665:1: ( ( ( '-' )? ) )
            // InternalSystemParameter.g:1666:1: ( ( '-' )? )
            {
            // InternalSystemParameter.g:1666:1: ( ( '-' )? )
            // InternalSystemParameter.g:1667:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalSystemParameter.g:1668:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSystemParameter.g:1668:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalSystemParameter.g:1676:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1680:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalSystemParameter.g:1681:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSystemParameter.g:1688:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1692:1: ( ( ( RULE_INT )? ) )
            // InternalSystemParameter.g:1693:1: ( ( RULE_INT )? )
            {
            // InternalSystemParameter.g:1693:1: ( ( RULE_INT )? )
            // InternalSystemParameter.g:1694:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalSystemParameter.g:1695:2: ( RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSystemParameter.g:1695:3: RULE_INT
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
    // InternalSystemParameter.g:1703:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1707:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalSystemParameter.g:1708:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalSystemParameter.g:1715:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1719:1: ( ( '.' ) )
            // InternalSystemParameter.g:1720:1: ( '.' )
            {
            // InternalSystemParameter.g:1720:1: ( '.' )
            // InternalSystemParameter.g:1721:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSystemParameter.g:1730:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1734:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalSystemParameter.g:1735:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalSystemParameter.g:1742:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1746:1: ( ( RULE_INT ) )
            // InternalSystemParameter.g:1747:1: ( RULE_INT )
            {
            // InternalSystemParameter.g:1747:1: ( RULE_INT )
            // InternalSystemParameter.g:1748:2: RULE_INT
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
    // InternalSystemParameter.g:1757:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1761:1: ( rule__EDouble__Group__4__Impl )
            // InternalSystemParameter.g:1762:2: rule__EDouble__Group__4__Impl
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
    // InternalSystemParameter.g:1768:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1772:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalSystemParameter.g:1773:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalSystemParameter.g:1773:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalSystemParameter.g:1774:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalSystemParameter.g:1775:2: ( rule__EDouble__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=16 && LA19_0<=17)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSystemParameter.g:1775:3: rule__EDouble__Group_4__0
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
    // InternalSystemParameter.g:1784:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1788:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalSystemParameter.g:1789:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSystemParameter.g:1796:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1800:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalSystemParameter.g:1801:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalSystemParameter.g:1801:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalSystemParameter.g:1802:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalSystemParameter.g:1803:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalSystemParameter.g:1803:3: rule__EDouble__Alternatives_4_0
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
    // InternalSystemParameter.g:1811:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1815:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalSystemParameter.g:1816:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSystemParameter.g:1823:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1827:1: ( ( ( '-' )? ) )
            // InternalSystemParameter.g:1828:1: ( ( '-' )? )
            {
            // InternalSystemParameter.g:1828:1: ( ( '-' )? )
            // InternalSystemParameter.g:1829:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalSystemParameter.g:1830:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSystemParameter.g:1830:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalSystemParameter.g:1838:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1842:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalSystemParameter.g:1843:2: rule__EDouble__Group_4__2__Impl
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
    // InternalSystemParameter.g:1849:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1853:1: ( ( RULE_INT ) )
            // InternalSystemParameter.g:1854:1: ( RULE_INT )
            {
            // InternalSystemParameter.g:1854:1: ( RULE_INT )
            // InternalSystemParameter.g:1855:2: RULE_INT
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
    // InternalSystemParameter.g:1865:1: rule__EnumerationElement__Group__0 : rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 ;
    public final void rule__EnumerationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1869:1: ( rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 )
            // InternalSystemParameter.g:1870:2: rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSystemParameter.g:1877:1: rule__EnumerationElement__Group__0__Impl : ( ( rule__EnumerationElement__NameAssignment_0 ) ) ;
    public final void rule__EnumerationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1881:1: ( ( ( rule__EnumerationElement__NameAssignment_0 ) ) )
            // InternalSystemParameter.g:1882:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            {
            // InternalSystemParameter.g:1882:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            // InternalSystemParameter.g:1883:2: ( rule__EnumerationElement__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); 
            // InternalSystemParameter.g:1884:2: ( rule__EnumerationElement__NameAssignment_0 )
            // InternalSystemParameter.g:1884:3: rule__EnumerationElement__NameAssignment_0
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
    // InternalSystemParameter.g:1892:1: rule__EnumerationElement__Group__1 : rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 ;
    public final void rule__EnumerationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1896:1: ( rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 )
            // InternalSystemParameter.g:1897:2: rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalSystemParameter.g:1904:1: rule__EnumerationElement__Group__1__Impl : ( ( rule__EnumerationElement__Group_1__0 )? ) ;
    public final void rule__EnumerationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1908:1: ( ( ( rule__EnumerationElement__Group_1__0 )? ) )
            // InternalSystemParameter.g:1909:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            {
            // InternalSystemParameter.g:1909:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            // InternalSystemParameter.g:1910:2: ( rule__EnumerationElement__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup_1()); 
            // InternalSystemParameter.g:1911:2: ( rule__EnumerationElement__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSystemParameter.g:1911:3: rule__EnumerationElement__Group_1__0
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
    // InternalSystemParameter.g:1919:1: rule__EnumerationElement__Group__2 : rule__EnumerationElement__Group__2__Impl ;
    public final void rule__EnumerationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1923:1: ( rule__EnumerationElement__Group__2__Impl )
            // InternalSystemParameter.g:1924:2: rule__EnumerationElement__Group__2__Impl
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
    // InternalSystemParameter.g:1930:1: rule__EnumerationElement__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__EnumerationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1934:1: ( ( ( ';' )? ) )
            // InternalSystemParameter.g:1935:1: ( ( ';' )? )
            {
            // InternalSystemParameter.g:1935:1: ( ( ';' )? )
            // InternalSystemParameter.g:1936:2: ( ';' )?
            {
             before(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); 
            // InternalSystemParameter.g:1937:2: ( ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSystemParameter.g:1937:3: ';'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalSystemParameter.g:1946:1: rule__EnumerationElement__Group_1__0 : rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 ;
    public final void rule__EnumerationElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1950:1: ( rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 )
            // InternalSystemParameter.g:1951:2: rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSystemParameter.g:1958:1: rule__EnumerationElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1962:1: ( ( '=' ) )
            // InternalSystemParameter.g:1963:1: ( '=' )
            {
            // InternalSystemParameter.g:1963:1: ( '=' )
            // InternalSystemParameter.g:1964:2: '='
            {
             before(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSystemParameter.g:1973:1: rule__EnumerationElement__Group_1__1 : rule__EnumerationElement__Group_1__1__Impl ;
    public final void rule__EnumerationElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1977:1: ( rule__EnumerationElement__Group_1__1__Impl )
            // InternalSystemParameter.g:1978:2: rule__EnumerationElement__Group_1__1__Impl
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
    // InternalSystemParameter.g:1984:1: rule__EnumerationElement__Group_1__1__Impl : ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1988:1: ( ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) )
            // InternalSystemParameter.g:1989:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            {
            // InternalSystemParameter.g:1989:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            // InternalSystemParameter.g:1990:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); 
            // InternalSystemParameter.g:1991:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            // InternalSystemParameter.g:1991:3: rule__EnumerationElement__ValueAssignment_1_1
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
    // InternalSystemParameter.g:2000:1: rule__InlineEnumerationType__Group__0 : rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 ;
    public final void rule__InlineEnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2004:1: ( rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 )
            // InternalSystemParameter.g:2005:2: rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSystemParameter.g:2012:1: rule__InlineEnumerationType__Group__0__Impl : ( 'InlineEnumeration' ) ;
    public final void rule__InlineEnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2016:1: ( ( 'InlineEnumeration' ) )
            // InternalSystemParameter.g:2017:1: ( 'InlineEnumeration' )
            {
            // InternalSystemParameter.g:2017:1: ( 'InlineEnumeration' )
            // InternalSystemParameter.g:2018:2: 'InlineEnumeration'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSystemParameter.g:2027:1: rule__InlineEnumerationType__Group__1 : rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 ;
    public final void rule__InlineEnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2031:1: ( rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 )
            // InternalSystemParameter.g:2032:2: rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSystemParameter.g:2039:1: rule__InlineEnumerationType__Group__1__Impl : ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) ;
    public final void rule__InlineEnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2043:1: ( ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) )
            // InternalSystemParameter.g:2044:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            {
            // InternalSystemParameter.g:2044:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            // InternalSystemParameter.g:2045:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); 
            // InternalSystemParameter.g:2046:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSystemParameter.g:2046:3: rule__InlineEnumerationType__ArrayAssignment_1
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
    // InternalSystemParameter.g:2054:1: rule__InlineEnumerationType__Group__2 : rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 ;
    public final void rule__InlineEnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2058:1: ( rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 )
            // InternalSystemParameter.g:2059:2: rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3
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
    // InternalSystemParameter.g:2066:1: rule__InlineEnumerationType__Group__2__Impl : ( '{' ) ;
    public final void rule__InlineEnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2070:1: ( ( '{' ) )
            // InternalSystemParameter.g:2071:1: ( '{' )
            {
            // InternalSystemParameter.g:2071:1: ( '{' )
            // InternalSystemParameter.g:2072:2: '{'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSystemParameter.g:2081:1: rule__InlineEnumerationType__Group__3 : rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 ;
    public final void rule__InlineEnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2085:1: ( rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 )
            // InternalSystemParameter.g:2086:2: rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSystemParameter.g:2093:1: rule__InlineEnumerationType__Group__3__Impl : ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) ;
    public final void rule__InlineEnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2097:1: ( ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) )
            // InternalSystemParameter.g:2098:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            {
            // InternalSystemParameter.g:2098:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            // InternalSystemParameter.g:2099:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            {
            // InternalSystemParameter.g:2099:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) )
            // InternalSystemParameter.g:2100:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalSystemParameter.g:2101:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            // InternalSystemParameter.g:2101:4: rule__InlineEnumerationType__EnumsAssignment_3
            {
            pushFollow(FOLLOW_28);
            rule__InlineEnumerationType__EnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 

            }

            // InternalSystemParameter.g:2104:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            // InternalSystemParameter.g:2105:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalSystemParameter.g:2106:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSystemParameter.g:2106:4: rule__InlineEnumerationType__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__InlineEnumerationType__EnumsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalSystemParameter.g:2115:1: rule__InlineEnumerationType__Group__4 : rule__InlineEnumerationType__Group__4__Impl ;
    public final void rule__InlineEnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2119:1: ( rule__InlineEnumerationType__Group__4__Impl )
            // InternalSystemParameter.g:2120:2: rule__InlineEnumerationType__Group__4__Impl
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
    // InternalSystemParameter.g:2126:1: rule__InlineEnumerationType__Group__4__Impl : ( '}' ) ;
    public final void rule__InlineEnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2130:1: ( ( '}' ) )
            // InternalSystemParameter.g:2131:1: ( '}' )
            {
            // InternalSystemParameter.g:2131:1: ( '}' )
            // InternalSystemParameter.g:2132:2: '}'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSystemParameter.g:2142:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2146:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalSystemParameter.g:2147:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSystemParameter.g:2154:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2158:1: ( ( () ) )
            // InternalSystemParameter.g:2159:1: ( () )
            {
            // InternalSystemParameter.g:2159:1: ( () )
            // InternalSystemParameter.g:2160:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // InternalSystemParameter.g:2161:2: ()
            // InternalSystemParameter.g:2161:3: 
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
    // InternalSystemParameter.g:2169:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2173:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalSystemParameter.g:2174:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSystemParameter.g:2181:1: rule__ArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2185:1: ( ( '[' ) )
            // InternalSystemParameter.g:2186:1: ( '[' )
            {
            // InternalSystemParameter.g:2186:1: ( '[' )
            // InternalSystemParameter.g:2187:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSystemParameter.g:2196:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2200:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalSystemParameter.g:2201:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalSystemParameter.g:2208:1: rule__ArrayType__Group__2__Impl : ( ( rule__ArrayType__LengthAssignment_2 )? ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2212:1: ( ( ( rule__ArrayType__LengthAssignment_2 )? ) )
            // InternalSystemParameter.g:2213:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            {
            // InternalSystemParameter.g:2213:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            // InternalSystemParameter.g:2214:2: ( rule__ArrayType__LengthAssignment_2 )?
            {
             before(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); 
            // InternalSystemParameter.g:2215:2: ( rule__ArrayType__LengthAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT||LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSystemParameter.g:2215:3: rule__ArrayType__LengthAssignment_2
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
    // InternalSystemParameter.g:2223:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2227:1: ( rule__ArrayType__Group__3__Impl )
            // InternalSystemParameter.g:2228:2: rule__ArrayType__Group__3__Impl
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
    // InternalSystemParameter.g:2234:1: rule__ArrayType__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2238:1: ( ( ']' ) )
            // InternalSystemParameter.g:2239:1: ( ']' )
            {
            // InternalSystemParameter.g:2239:1: ( ']' )
            // InternalSystemParameter.g:2240:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSystemParameter.g:2250:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2254:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalSystemParameter.g:2255:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalSystemParameter.g:2262:1: rule__PrimitiveType__Group__0__Impl : ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2266:1: ( ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) )
            // InternalSystemParameter.g:2267:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            {
            // InternalSystemParameter.g:2267:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            // InternalSystemParameter.g:2268:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); 
            // InternalSystemParameter.g:2269:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            // InternalSystemParameter.g:2269:3: rule__PrimitiveType__TypeNameAssignment_0
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
    // InternalSystemParameter.g:2277:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2281:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalSystemParameter.g:2282:2: rule__PrimitiveType__Group__1__Impl
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
    // InternalSystemParameter.g:2288:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2292:1: ( ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) )
            // InternalSystemParameter.g:2293:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            {
            // InternalSystemParameter.g:2293:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            // InternalSystemParameter.g:2294:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); 
            // InternalSystemParameter.g:2295:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSystemParameter.g:2295:3: rule__PrimitiveType__ArrayAssignment_1
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
    // InternalSystemParameter.g:2304:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2308:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalSystemParameter.g:2309:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSystemParameter.g:2316:1: rule__ArrayValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2320:1: ( ( '[' ) )
            // InternalSystemParameter.g:2321:1: ( '[' )
            {
            // InternalSystemParameter.g:2321:1: ( '[' )
            // InternalSystemParameter.g:2322:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalSystemParameter.g:2331:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2335:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalSystemParameter.g:2336:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSystemParameter.g:2343:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_1 ) ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2347:1: ( ( ( rule__ArrayValue__ValuesAssignment_1 ) ) )
            // InternalSystemParameter.g:2348:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            {
            // InternalSystemParameter.g:2348:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            // InternalSystemParameter.g:2349:2: ( rule__ArrayValue__ValuesAssignment_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); 
            // InternalSystemParameter.g:2350:2: ( rule__ArrayValue__ValuesAssignment_1 )
            // InternalSystemParameter.g:2350:3: rule__ArrayValue__ValuesAssignment_1
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
    // InternalSystemParameter.g:2358:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2362:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalSystemParameter.g:2363:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalSystemParameter.g:2370:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )* ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2374:1: ( ( ( rule__ArrayValue__Group_2__0 )* ) )
            // InternalSystemParameter.g:2375:1: ( ( rule__ArrayValue__Group_2__0 )* )
            {
            // InternalSystemParameter.g:2375:1: ( ( rule__ArrayValue__Group_2__0 )* )
            // InternalSystemParameter.g:2376:2: ( rule__ArrayValue__Group_2__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalSystemParameter.g:2377:2: ( rule__ArrayValue__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==45) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSystemParameter.g:2377:3: rule__ArrayValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ArrayValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalSystemParameter.g:2385:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2389:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalSystemParameter.g:2390:2: rule__ArrayValue__Group__3__Impl
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
    // InternalSystemParameter.g:2396:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2400:1: ( ( ']' ) )
            // InternalSystemParameter.g:2401:1: ( ']' )
            {
            // InternalSystemParameter.g:2401:1: ( ']' )
            // InternalSystemParameter.g:2402:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSystemParameter.g:2412:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2416:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalSystemParameter.g:2417:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSystemParameter.g:2424:1: rule__ArrayValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2428:1: ( ( ',' ) )
            // InternalSystemParameter.g:2429:1: ( ',' )
            {
            // InternalSystemParameter.g:2429:1: ( ',' )
            // InternalSystemParameter.g:2430:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSystemParameter.g:2439:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2443:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalSystemParameter.g:2444:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalSystemParameter.g:2450:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2454:1: ( ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) )
            // InternalSystemParameter.g:2455:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            {
            // InternalSystemParameter.g:2455:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            // InternalSystemParameter.g:2456:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); 
            // InternalSystemParameter.g:2457:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            // InternalSystemParameter.g:2457:3: rule__ArrayValue__ValuesAssignment_2_1
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
    // InternalSystemParameter.g:2466:1: rule__SingleValue__Group_0__0 : rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 ;
    public final void rule__SingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2470:1: ( rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 )
            // InternalSystemParameter.g:2471:2: rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSystemParameter.g:2478:1: rule__SingleValue__Group_0__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2482:1: ( ( () ) )
            // InternalSystemParameter.g:2483:1: ( () )
            {
            // InternalSystemParameter.g:2483:1: ( () )
            // InternalSystemParameter.g:2484:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getIntValueAction_0_0()); 
            // InternalSystemParameter.g:2485:2: ()
            // InternalSystemParameter.g:2485:3: 
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
    // InternalSystemParameter.g:2493:1: rule__SingleValue__Group_0__1 : rule__SingleValue__Group_0__1__Impl ;
    public final void rule__SingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2497:1: ( rule__SingleValue__Group_0__1__Impl )
            // InternalSystemParameter.g:2498:2: rule__SingleValue__Group_0__1__Impl
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
    // InternalSystemParameter.g:2504:1: rule__SingleValue__Group_0__1__Impl : ( ( rule__SingleValue__ValueAssignment_0_1 ) ) ;
    public final void rule__SingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2508:1: ( ( ( rule__SingleValue__ValueAssignment_0_1 ) ) )
            // InternalSystemParameter.g:2509:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            {
            // InternalSystemParameter.g:2509:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            // InternalSystemParameter.g:2510:2: ( rule__SingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); 
            // InternalSystemParameter.g:2511:2: ( rule__SingleValue__ValueAssignment_0_1 )
            // InternalSystemParameter.g:2511:3: rule__SingleValue__ValueAssignment_0_1
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
    // InternalSystemParameter.g:2520:1: rule__SingleValue__Group_1__0 : rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 ;
    public final void rule__SingleValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2524:1: ( rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 )
            // InternalSystemParameter.g:2525:2: rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSystemParameter.g:2532:1: rule__SingleValue__Group_1__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2536:1: ( ( () ) )
            // InternalSystemParameter.g:2537:1: ( () )
            {
            // InternalSystemParameter.g:2537:1: ( () )
            // InternalSystemParameter.g:2538:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0()); 
            // InternalSystemParameter.g:2539:2: ()
            // InternalSystemParameter.g:2539:3: 
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
    // InternalSystemParameter.g:2547:1: rule__SingleValue__Group_1__1 : rule__SingleValue__Group_1__1__Impl ;
    public final void rule__SingleValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2551:1: ( rule__SingleValue__Group_1__1__Impl )
            // InternalSystemParameter.g:2552:2: rule__SingleValue__Group_1__1__Impl
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
    // InternalSystemParameter.g:2558:1: rule__SingleValue__Group_1__1__Impl : ( ( rule__SingleValue__ValueAssignment_1_1 ) ) ;
    public final void rule__SingleValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2562:1: ( ( ( rule__SingleValue__ValueAssignment_1_1 ) ) )
            // InternalSystemParameter.g:2563:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            {
            // InternalSystemParameter.g:2563:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            // InternalSystemParameter.g:2564:2: ( rule__SingleValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_1_1()); 
            // InternalSystemParameter.g:2565:2: ( rule__SingleValue__ValueAssignment_1_1 )
            // InternalSystemParameter.g:2565:3: rule__SingleValue__ValueAssignment_1_1
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
    // InternalSystemParameter.g:2574:1: rule__SingleValue__Group_2__0 : rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 ;
    public final void rule__SingleValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2578:1: ( rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 )
            // InternalSystemParameter.g:2579:2: rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalSystemParameter.g:2586:1: rule__SingleValue__Group_2__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2590:1: ( ( () ) )
            // InternalSystemParameter.g:2591:1: ( () )
            {
            // InternalSystemParameter.g:2591:1: ( () )
            // InternalSystemParameter.g:2592:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getStringValueAction_2_0()); 
            // InternalSystemParameter.g:2593:2: ()
            // InternalSystemParameter.g:2593:3: 
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
    // InternalSystemParameter.g:2601:1: rule__SingleValue__Group_2__1 : rule__SingleValue__Group_2__1__Impl ;
    public final void rule__SingleValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2605:1: ( rule__SingleValue__Group_2__1__Impl )
            // InternalSystemParameter.g:2606:2: rule__SingleValue__Group_2__1__Impl
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
    // InternalSystemParameter.g:2612:1: rule__SingleValue__Group_2__1__Impl : ( ( rule__SingleValue__ValueAssignment_2_1 ) ) ;
    public final void rule__SingleValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2616:1: ( ( ( rule__SingleValue__ValueAssignment_2_1 ) ) )
            // InternalSystemParameter.g:2617:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            {
            // InternalSystemParameter.g:2617:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            // InternalSystemParameter.g:2618:2: ( rule__SingleValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_2_1()); 
            // InternalSystemParameter.g:2619:2: ( rule__SingleValue__ValueAssignment_2_1 )
            // InternalSystemParameter.g:2619:3: rule__SingleValue__ValueAssignment_2_1
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
    // InternalSystemParameter.g:2628:1: rule__SingleValue__Group_3__0 : rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 ;
    public final void rule__SingleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2632:1: ( rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 )
            // InternalSystemParameter.g:2633:2: rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSystemParameter.g:2640:1: rule__SingleValue__Group_3__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2644:1: ( ( () ) )
            // InternalSystemParameter.g:2645:1: ( () )
            {
            // InternalSystemParameter.g:2645:1: ( () )
            // InternalSystemParameter.g:2646:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getBoolValueAction_3_0()); 
            // InternalSystemParameter.g:2647:2: ()
            // InternalSystemParameter.g:2647:3: 
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
    // InternalSystemParameter.g:2655:1: rule__SingleValue__Group_3__1 : rule__SingleValue__Group_3__1__Impl ;
    public final void rule__SingleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2659:1: ( rule__SingleValue__Group_3__1__Impl )
            // InternalSystemParameter.g:2660:2: rule__SingleValue__Group_3__1__Impl
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
    // InternalSystemParameter.g:2666:1: rule__SingleValue__Group_3__1__Impl : ( ( rule__SingleValue__ValueAssignment_3_1 ) ) ;
    public final void rule__SingleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2670:1: ( ( ( rule__SingleValue__ValueAssignment_3_1 ) ) )
            // InternalSystemParameter.g:2671:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            {
            // InternalSystemParameter.g:2671:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            // InternalSystemParameter.g:2672:2: ( rule__SingleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_3_1()); 
            // InternalSystemParameter.g:2673:2: ( rule__SingleValue__ValueAssignment_3_1 )
            // InternalSystemParameter.g:2673:3: rule__SingleValue__ValueAssignment_3_1
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
    // InternalSystemParameter.g:2682:1: rule__SingleValue__Group_4__0 : rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 ;
    public final void rule__SingleValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2686:1: ( rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 )
            // InternalSystemParameter.g:2687:2: rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSystemParameter.g:2694:1: rule__SingleValue__Group_4__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2698:1: ( ( () ) )
            // InternalSystemParameter.g:2699:1: ( () )
            {
            // InternalSystemParameter.g:2699:1: ( () )
            // InternalSystemParameter.g:2700:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0()); 
            // InternalSystemParameter.g:2701:2: ()
            // InternalSystemParameter.g:2701:3: 
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
    // InternalSystemParameter.g:2709:1: rule__SingleValue__Group_4__1 : rule__SingleValue__Group_4__1__Impl ;
    public final void rule__SingleValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2713:1: ( rule__SingleValue__Group_4__1__Impl )
            // InternalSystemParameter.g:2714:2: rule__SingleValue__Group_4__1__Impl
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
    // InternalSystemParameter.g:2720:1: rule__SingleValue__Group_4__1__Impl : ( ( rule__SingleValue__ValueAssignment_4_1 ) ) ;
    public final void rule__SingleValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2724:1: ( ( ( rule__SingleValue__ValueAssignment_4_1 ) ) )
            // InternalSystemParameter.g:2725:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            {
            // InternalSystemParameter.g:2725:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            // InternalSystemParameter.g:2726:2: ( rule__SingleValue__ValueAssignment_4_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_4_1()); 
            // InternalSystemParameter.g:2727:2: ( rule__SingleValue__ValueAssignment_4_1 )
            // InternalSystemParameter.g:2727:3: rule__SingleValue__ValueAssignment_4_1
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
    // InternalSystemParameter.g:2736:1: rule__SystemParamModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SystemParamModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2740:1: ( ( RULE_ID ) )
            // InternalSystemParameter.g:2741:2: ( RULE_ID )
            {
            // InternalSystemParameter.g:2741:2: ( RULE_ID )
            // InternalSystemParameter.g:2742:3: RULE_ID
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
    // InternalSystemParameter.g:2751:1: rule__SystemParamModel__SystemAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__SystemParamModel__SystemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2755:1: ( ( ( ruleFQN ) ) )
            // InternalSystemParameter.g:2756:2: ( ( ruleFQN ) )
            {
            // InternalSystemParameter.g:2756:2: ( ( ruleFQN ) )
            // InternalSystemParameter.g:2757:3: ( ruleFQN )
            {
             before(grammarAccess.getSystemParamModelAccess().getSystemSystemComponentArchitectureCrossReference_4_0()); 
            // InternalSystemParameter.g:2758:3: ( ruleFQN )
            // InternalSystemParameter.g:2759:4: ruleFQN
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
    // InternalSystemParameter.g:2770:1: rule__SystemParamModel__ComponentsAssignment_6 : ( ruleComponentParameterInstance ) ;
    public final void rule__SystemParamModel__ComponentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2774:1: ( ( ruleComponentParameterInstance ) )
            // InternalSystemParameter.g:2775:2: ( ruleComponentParameterInstance )
            {
            // InternalSystemParameter.g:2775:2: ( ruleComponentParameterInstance )
            // InternalSystemParameter.g:2776:3: ruleComponentParameterInstance
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
    // InternalSystemParameter.g:2785:1: rule__ComponentParameterInstance__ComponentInstanceAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentParameterInstance__ComponentInstanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2789:1: ( ( ( ruleFQN ) ) )
            // InternalSystemParameter.g:2790:2: ( ( ruleFQN ) )
            {
            // InternalSystemParameter.g:2790:2: ( ( ruleFQN ) )
            // InternalSystemParameter.g:2791:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getComponentInstanceComponentInstanceCrossReference_1_0()); 
            // InternalSystemParameter.g:2792:3: ( ruleFQN )
            // InternalSystemParameter.g:2793:4: ruleFQN
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
    // InternalSystemParameter.g:2804:1: rule__ComponentParameterInstance__ComponentParamAssignment_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentParameterInstance__ComponentParamAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2808:1: ( ( ( ruleFQN ) ) )
            // InternalSystemParameter.g:2809:2: ( ( ruleFQN ) )
            {
            // InternalSystemParameter.g:2809:2: ( ( ruleFQN ) )
            // InternalSystemParameter.g:2810:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getComponentParamComponentParameterCrossReference_2_1_0()); 
            // InternalSystemParameter.g:2811:3: ( ruleFQN )
            // InternalSystemParameter.g:2812:4: ruleFQN
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
    // InternalSystemParameter.g:2823:1: rule__ComponentParameterInstance__ParametersAssignment_4 : ( ruleParameterRefinement ) ;
    public final void rule__ComponentParameterInstance__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2827:1: ( ( ruleParameterRefinement ) )
            // InternalSystemParameter.g:2828:2: ( ruleParameterRefinement )
            {
            // InternalSystemParameter.g:2828:2: ( ruleParameterRefinement )
            // InternalSystemParameter.g:2829:3: ruleParameterRefinement
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


    // $ANTLR start "rule__ParameterRefinement__DocumentationAssignment_0"
    // InternalSystemParameter.g:2838:1: rule__ParameterRefinement__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__ParameterRefinement__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2842:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalSystemParameter.g:2843:2: ( RULE_DOCU_COMMENT )
            {
            // InternalSystemParameter.g:2843:2: ( RULE_DOCU_COMMENT )
            // InternalSystemParameter.g:2844:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getParameterRefinementAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getParameterRefinementAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__DocumentationAssignment_0"


    // $ANTLR start "rule__ParameterRefinement__ParameterAssignment_2"
    // InternalSystemParameter.g:2853:1: rule__ParameterRefinement__ParameterAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ParameterRefinement__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2857:1: ( ( ( ruleFQN ) ) )
            // InternalSystemParameter.g:2858:2: ( ( ruleFQN ) )
            {
            // InternalSystemParameter.g:2858:2: ( ( ruleFQN ) )
            // InternalSystemParameter.g:2859:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterRefinementAccess().getParameterComponentParameterBaseCrossReference_2_0()); 
            // InternalSystemParameter.g:2860:3: ( ruleFQN )
            // InternalSystemParameter.g:2861:4: ruleFQN
            {
             before(grammarAccess.getParameterRefinementAccess().getParameterComponentParameterBaseFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getParameterRefinementAccess().getParameterComponentParameterBaseFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getParameterRefinementAccess().getParameterComponentParameterBaseCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__ParameterAssignment_2"


    // $ANTLR start "rule__ParameterRefinement__AttributesAssignment_4"
    // InternalSystemParameter.g:2872:1: rule__ParameterRefinement__AttributesAssignment_4 : ( ruleAttributeRefinement ) ;
    public final void rule__ParameterRefinement__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2876:1: ( ( ruleAttributeRefinement ) )
            // InternalSystemParameter.g:2877:2: ( ruleAttributeRefinement )
            {
            // InternalSystemParameter.g:2877:2: ( ruleAttributeRefinement )
            // InternalSystemParameter.g:2878:3: ruleAttributeRefinement
            {
             before(grammarAccess.getParameterRefinementAccess().getAttributesAttributeRefinementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeRefinement();

            state._fsp--;

             after(grammarAccess.getParameterRefinementAccess().getAttributesAttributeRefinementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__AttributesAssignment_4"


    // $ANTLR start "rule__AttributeRefinement__DocumentationAssignment_0"
    // InternalSystemParameter.g:2887:1: rule__AttributeRefinement__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__AttributeRefinement__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2891:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalSystemParameter.g:2892:2: ( RULE_DOCU_COMMENT )
            {
            // InternalSystemParameter.g:2892:2: ( RULE_DOCU_COMMENT )
            // InternalSystemParameter.g:2893:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getAttributeRefinementAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getAttributeRefinementAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__DocumentationAssignment_0"


    // $ANTLR start "rule__AttributeRefinement__AttributeAssignment_1"
    // InternalSystemParameter.g:2902:1: rule__AttributeRefinement__AttributeAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__AttributeRefinement__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2906:1: ( ( ( ruleFQN ) ) )
            // InternalSystemParameter.g:2907:2: ( ( ruleFQN ) )
            {
            // InternalSystemParameter.g:2907:2: ( ( ruleFQN ) )
            // InternalSystemParameter.g:2908:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionCrossReference_1_0()); 
            // InternalSystemParameter.g:2909:3: ( ruleFQN )
            // InternalSystemParameter.g:2910:4: ruleFQN
            {
             before(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__AttributeAssignment_1"


    // $ANTLR start "rule__AttributeRefinement__ValueAssignment_3"
    // InternalSystemParameter.g:2921:1: rule__AttributeRefinement__ValueAssignment_3 : ( ruleAbstractValue ) ;
    public final void rule__AttributeRefinement__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2925:1: ( ( ruleAbstractValue ) )
            // InternalSystemParameter.g:2926:2: ( ruleAbstractValue )
            {
            // InternalSystemParameter.g:2926:2: ( ruleAbstractValue )
            // InternalSystemParameter.g:2927:3: ruleAbstractValue
            {
             before(grammarAccess.getAttributeRefinementAccess().getValueAbstractValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractValue();

            state._fsp--;

             after(grammarAccess.getAttributeRefinementAccess().getValueAbstractValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__ValueAssignment_3"


    // $ANTLR start "rule__EnumerationElement__NameAssignment_0"
    // InternalSystemParameter.g:2936:1: rule__EnumerationElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2940:1: ( ( RULE_ID ) )
            // InternalSystemParameter.g:2941:2: ( RULE_ID )
            {
            // InternalSystemParameter.g:2941:2: ( RULE_ID )
            // InternalSystemParameter.g:2942:3: RULE_ID
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
    // InternalSystemParameter.g:2951:1: rule__EnumerationElement__ValueAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__EnumerationElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2955:1: ( ( ruleEInt ) )
            // InternalSystemParameter.g:2956:2: ( ruleEInt )
            {
            // InternalSystemParameter.g:2956:2: ( ruleEInt )
            // InternalSystemParameter.g:2957:3: ruleEInt
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
    // InternalSystemParameter.g:2966:1: rule__InlineEnumerationType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__InlineEnumerationType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2970:1: ( ( ruleArrayType ) )
            // InternalSystemParameter.g:2971:2: ( ruleArrayType )
            {
            // InternalSystemParameter.g:2971:2: ( ruleArrayType )
            // InternalSystemParameter.g:2972:3: ruleArrayType
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
    // InternalSystemParameter.g:2981:1: rule__InlineEnumerationType__EnumsAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__InlineEnumerationType__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2985:1: ( ( ruleEnumerationElement ) )
            // InternalSystemParameter.g:2986:2: ( ruleEnumerationElement )
            {
            // InternalSystemParameter.g:2986:2: ( ruleEnumerationElement )
            // InternalSystemParameter.g:2987:3: ruleEnumerationElement
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
    // InternalSystemParameter.g:2996:1: rule__ArrayType__LengthAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ArrayType__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3000:1: ( ( ruleCardinality ) )
            // InternalSystemParameter.g:3001:2: ( ruleCardinality )
            {
            // InternalSystemParameter.g:3001:2: ( ruleCardinality )
            // InternalSystemParameter.g:3002:3: ruleCardinality
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
    // InternalSystemParameter.g:3011:1: rule__PrimitiveType__TypeNameAssignment_0 : ( rulePRIMITIVE_TYPE_NAME ) ;
    public final void rule__PrimitiveType__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3015:1: ( ( rulePRIMITIVE_TYPE_NAME ) )
            // InternalSystemParameter.g:3016:2: ( rulePRIMITIVE_TYPE_NAME )
            {
            // InternalSystemParameter.g:3016:2: ( rulePRIMITIVE_TYPE_NAME )
            // InternalSystemParameter.g:3017:3: rulePRIMITIVE_TYPE_NAME
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
    // InternalSystemParameter.g:3026:1: rule__PrimitiveType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__PrimitiveType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3030:1: ( ( ruleArrayType ) )
            // InternalSystemParameter.g:3031:2: ( ruleArrayType )
            {
            // InternalSystemParameter.g:3031:2: ( ruleArrayType )
            // InternalSystemParameter.g:3032:3: ruleArrayType
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
    // InternalSystemParameter.g:3041:1: rule__ArrayValue__ValuesAssignment_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3045:1: ( ( ruleSingleValue ) )
            // InternalSystemParameter.g:3046:2: ( ruleSingleValue )
            {
            // InternalSystemParameter.g:3046:2: ( ruleSingleValue )
            // InternalSystemParameter.g:3047:3: ruleSingleValue
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
    // InternalSystemParameter.g:3056:1: rule__ArrayValue__ValuesAssignment_2_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3060:1: ( ( ruleSingleValue ) )
            // InternalSystemParameter.g:3061:2: ( ruleSingleValue )
            {
            // InternalSystemParameter.g:3061:2: ( ruleSingleValue )
            // InternalSystemParameter.g:3062:3: ruleSingleValue
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
    // InternalSystemParameter.g:3071:1: rule__SingleValue__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__SingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3075:1: ( ( ruleEInt ) )
            // InternalSystemParameter.g:3076:2: ( ruleEInt )
            {
            // InternalSystemParameter.g:3076:2: ( ruleEInt )
            // InternalSystemParameter.g:3077:3: ruleEInt
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
    // InternalSystemParameter.g:3086:1: rule__SingleValue__ValueAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__SingleValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3090:1: ( ( ruleEDouble ) )
            // InternalSystemParameter.g:3091:2: ( ruleEDouble )
            {
            // InternalSystemParameter.g:3091:2: ( ruleEDouble )
            // InternalSystemParameter.g:3092:3: ruleEDouble
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
    // InternalSystemParameter.g:3101:1: rule__SingleValue__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__SingleValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3105:1: ( ( ruleEString ) )
            // InternalSystemParameter.g:3106:2: ( ruleEString )
            {
            // InternalSystemParameter.g:3106:2: ( ruleEString )
            // InternalSystemParameter.g:3107:3: ruleEString
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
    // InternalSystemParameter.g:3116:1: rule__SingleValue__ValueAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__SingleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3120:1: ( ( ruleEBoolean ) )
            // InternalSystemParameter.g:3121:2: ( ruleEBoolean )
            {
            // InternalSystemParameter.g:3121:2: ( ruleEBoolean )
            // InternalSystemParameter.g:3122:3: ruleEBoolean
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
    // InternalSystemParameter.g:3131:1: rule__SingleValue__ValueAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__SingleValue__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3135:1: ( ( ( ruleFQN ) ) )
            // InternalSystemParameter.g:3136:2: ( ( ruleFQN ) )
            {
            // InternalSystemParameter.g:3136:2: ( ( ruleFQN ) )
            // InternalSystemParameter.g:3137:3: ( ruleFQN )
            {
             before(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 
            // InternalSystemParameter.g:3138:3: ( ruleFQN )
            // InternalSystemParameter.g:3139:4: ruleFQN
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002400000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000082L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000004000000C0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000B000000C070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000030000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000040020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000003000000C070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000000C000L});

}