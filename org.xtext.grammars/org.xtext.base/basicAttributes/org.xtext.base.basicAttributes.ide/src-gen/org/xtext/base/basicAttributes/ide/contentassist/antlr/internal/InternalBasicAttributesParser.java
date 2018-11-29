package org.xtext.base.basicAttributes.ide.contentassist.antlr.internal;

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
import org.xtext.base.basicAttributes.services.BasicAttributesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBasicAttributesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'*'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'", "':'", "';'", "'='", "'.'", "'-'", "'InlineEnumeration'", "'{'", "'}'", "'['", "']'", "','"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBasicAttributesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBasicAttributesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBasicAttributesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBasicAttributes.g"; }


    	private BasicAttributesGrammarAccess grammarAccess;

    	public void setGrammarAccess(BasicAttributesGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalBasicAttributes.g:94:1: entryRuleAttributeDefinition : ruleAttributeDefinition EOF ;
    public final void entryRuleAttributeDefinition() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:95:1: ( ruleAttributeDefinition EOF )
            // InternalBasicAttributes.g:96:1: ruleAttributeDefinition EOF
            {
             before(grammarAccess.getAttributeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeDefinition"


    // $ANTLR start "ruleAttributeDefinition"
    // InternalBasicAttributes.g:103:1: ruleAttributeDefinition : ( ( rule__AttributeDefinition__Group__0 ) ) ;
    public final void ruleAttributeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:107:2: ( ( ( rule__AttributeDefinition__Group__0 ) ) )
            // InternalBasicAttributes.g:108:2: ( ( rule__AttributeDefinition__Group__0 ) )
            {
            // InternalBasicAttributes.g:108:2: ( ( rule__AttributeDefinition__Group__0 ) )
            // InternalBasicAttributes.g:109:3: ( rule__AttributeDefinition__Group__0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup()); 
            // InternalBasicAttributes.g:110:3: ( rule__AttributeDefinition__Group__0 )
            // InternalBasicAttributes.g:110:4: rule__AttributeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeDefinition"


    // $ANTLR start "entryRuleFQN"
    // InternalBasicAttributes.g:119:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:120:1: ( ruleFQN EOF )
            // InternalBasicAttributes.g:121:1: ruleFQN EOF
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
    // InternalBasicAttributes.g:128:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:132:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalBasicAttributes.g:133:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalBasicAttributes.g:133:2: ( ( rule__FQN__Group__0 ) )
            // InternalBasicAttributes.g:134:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalBasicAttributes.g:135:3: ( rule__FQN__Group__0 )
            // InternalBasicAttributes.g:135:4: rule__FQN__Group__0
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
    // InternalBasicAttributes.g:144:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:145:1: ( ruleEBoolean EOF )
            // InternalBasicAttributes.g:146:1: ruleEBoolean EOF
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
    // InternalBasicAttributes.g:153:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:157:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalBasicAttributes.g:158:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalBasicAttributes.g:158:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalBasicAttributes.g:159:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalBasicAttributes.g:160:3: ( rule__EBoolean__Alternatives )
            // InternalBasicAttributes.g:160:4: rule__EBoolean__Alternatives
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
    // InternalBasicAttributes.g:169:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:170:1: ( ruleEString EOF )
            // InternalBasicAttributes.g:171:1: ruleEString EOF
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
    // InternalBasicAttributes.g:178:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:182:2: ( ( RULE_STRING ) )
            // InternalBasicAttributes.g:183:2: ( RULE_STRING )
            {
            // InternalBasicAttributes.g:183:2: ( RULE_STRING )
            // InternalBasicAttributes.g:184:3: RULE_STRING
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
    // InternalBasicAttributes.g:194:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:195:1: ( ruleEInt EOF )
            // InternalBasicAttributes.g:196:1: ruleEInt EOF
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
    // InternalBasicAttributes.g:203:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:207:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBasicAttributes.g:208:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBasicAttributes.g:208:2: ( ( rule__EInt__Group__0 ) )
            // InternalBasicAttributes.g:209:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBasicAttributes.g:210:3: ( rule__EInt__Group__0 )
            // InternalBasicAttributes.g:210:4: rule__EInt__Group__0
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
    // InternalBasicAttributes.g:219:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:220:1: ( ruleEDouble EOF )
            // InternalBasicAttributes.g:221:1: ruleEDouble EOF
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
    // InternalBasicAttributes.g:228:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:232:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalBasicAttributes.g:233:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalBasicAttributes.g:233:2: ( ( rule__EDouble__Group__0 ) )
            // InternalBasicAttributes.g:234:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalBasicAttributes.g:235:3: ( rule__EDouble__Group__0 )
            // InternalBasicAttributes.g:235:4: rule__EDouble__Group__0
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
    // InternalBasicAttributes.g:244:1: entryRuleEnumerationElement : ruleEnumerationElement EOF ;
    public final void entryRuleEnumerationElement() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:245:1: ( ruleEnumerationElement EOF )
            // InternalBasicAttributes.g:246:1: ruleEnumerationElement EOF
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
    // InternalBasicAttributes.g:253:1: ruleEnumerationElement : ( ( rule__EnumerationElement__Group__0 ) ) ;
    public final void ruleEnumerationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:257:2: ( ( ( rule__EnumerationElement__Group__0 ) ) )
            // InternalBasicAttributes.g:258:2: ( ( rule__EnumerationElement__Group__0 ) )
            {
            // InternalBasicAttributes.g:258:2: ( ( rule__EnumerationElement__Group__0 ) )
            // InternalBasicAttributes.g:259:3: ( rule__EnumerationElement__Group__0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup()); 
            // InternalBasicAttributes.g:260:3: ( rule__EnumerationElement__Group__0 )
            // InternalBasicAttributes.g:260:4: rule__EnumerationElement__Group__0
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
    // InternalBasicAttributes.g:269:1: entryRuleAbstractAttributeType : ruleAbstractAttributeType EOF ;
    public final void entryRuleAbstractAttributeType() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:270:1: ( ruleAbstractAttributeType EOF )
            // InternalBasicAttributes.g:271:1: ruleAbstractAttributeType EOF
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
    // InternalBasicAttributes.g:278:1: ruleAbstractAttributeType : ( ( rule__AbstractAttributeType__Alternatives ) ) ;
    public final void ruleAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:282:2: ( ( ( rule__AbstractAttributeType__Alternatives ) ) )
            // InternalBasicAttributes.g:283:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            {
            // InternalBasicAttributes.g:283:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            // InternalBasicAttributes.g:284:3: ( rule__AbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalBasicAttributes.g:285:3: ( rule__AbstractAttributeType__Alternatives )
            // InternalBasicAttributes.g:285:4: rule__AbstractAttributeType__Alternatives
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
    // InternalBasicAttributes.g:294:1: entryRuleInlineEnumerationType : ruleInlineEnumerationType EOF ;
    public final void entryRuleInlineEnumerationType() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:295:1: ( ruleInlineEnumerationType EOF )
            // InternalBasicAttributes.g:296:1: ruleInlineEnumerationType EOF
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
    // InternalBasicAttributes.g:303:1: ruleInlineEnumerationType : ( ( rule__InlineEnumerationType__Group__0 ) ) ;
    public final void ruleInlineEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:307:2: ( ( ( rule__InlineEnumerationType__Group__0 ) ) )
            // InternalBasicAttributes.g:308:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            {
            // InternalBasicAttributes.g:308:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            // InternalBasicAttributes.g:309:3: ( rule__InlineEnumerationType__Group__0 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); 
            // InternalBasicAttributes.g:310:3: ( rule__InlineEnumerationType__Group__0 )
            // InternalBasicAttributes.g:310:4: rule__InlineEnumerationType__Group__0
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
    // InternalBasicAttributes.g:319:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:320:1: ( ruleArrayType EOF )
            // InternalBasicAttributes.g:321:1: ruleArrayType EOF
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
    // InternalBasicAttributes.g:328:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:332:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalBasicAttributes.g:333:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalBasicAttributes.g:333:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalBasicAttributes.g:334:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalBasicAttributes.g:335:3: ( rule__ArrayType__Group__0 )
            // InternalBasicAttributes.g:335:4: rule__ArrayType__Group__0
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
    // InternalBasicAttributes.g:344:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:345:1: ( ruleCardinality EOF )
            // InternalBasicAttributes.g:346:1: ruleCardinality EOF
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
    // InternalBasicAttributes.g:353:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:357:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalBasicAttributes.g:358:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalBasicAttributes.g:358:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalBasicAttributes.g:359:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalBasicAttributes.g:360:3: ( rule__Cardinality__Alternatives )
            // InternalBasicAttributes.g:360:4: rule__Cardinality__Alternatives
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
    // InternalBasicAttributes.g:369:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:370:1: ( rulePrimitiveType EOF )
            // InternalBasicAttributes.g:371:1: rulePrimitiveType EOF
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
    // InternalBasicAttributes.g:378:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:382:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalBasicAttributes.g:383:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalBasicAttributes.g:383:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalBasicAttributes.g:384:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalBasicAttributes.g:385:3: ( rule__PrimitiveType__Group__0 )
            // InternalBasicAttributes.g:385:4: rule__PrimitiveType__Group__0
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
    // InternalBasicAttributes.g:394:1: entryRuleAbstractValue : ruleAbstractValue EOF ;
    public final void entryRuleAbstractValue() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:395:1: ( ruleAbstractValue EOF )
            // InternalBasicAttributes.g:396:1: ruleAbstractValue EOF
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
    // InternalBasicAttributes.g:403:1: ruleAbstractValue : ( ( rule__AbstractValue__Alternatives ) ) ;
    public final void ruleAbstractValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:407:2: ( ( ( rule__AbstractValue__Alternatives ) ) )
            // InternalBasicAttributes.g:408:2: ( ( rule__AbstractValue__Alternatives ) )
            {
            // InternalBasicAttributes.g:408:2: ( ( rule__AbstractValue__Alternatives ) )
            // InternalBasicAttributes.g:409:3: ( rule__AbstractValue__Alternatives )
            {
             before(grammarAccess.getAbstractValueAccess().getAlternatives()); 
            // InternalBasicAttributes.g:410:3: ( rule__AbstractValue__Alternatives )
            // InternalBasicAttributes.g:410:4: rule__AbstractValue__Alternatives
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
    // InternalBasicAttributes.g:419:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:420:1: ( ruleArrayValue EOF )
            // InternalBasicAttributes.g:421:1: ruleArrayValue EOF
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
    // InternalBasicAttributes.g:428:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:432:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalBasicAttributes.g:433:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalBasicAttributes.g:433:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalBasicAttributes.g:434:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalBasicAttributes.g:435:3: ( rule__ArrayValue__Group__0 )
            // InternalBasicAttributes.g:435:4: rule__ArrayValue__Group__0
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
    // InternalBasicAttributes.g:444:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalBasicAttributes.g:445:1: ( ruleSingleValue EOF )
            // InternalBasicAttributes.g:446:1: ruleSingleValue EOF
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
    // InternalBasicAttributes.g:453:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:457:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalBasicAttributes.g:458:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalBasicAttributes.g:458:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalBasicAttributes.g:459:3: ( rule__SingleValue__Alternatives )
            {
             before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            // InternalBasicAttributes.g:460:3: ( rule__SingleValue__Alternatives )
            // InternalBasicAttributes.g:460:4: rule__SingleValue__Alternatives
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
    // InternalBasicAttributes.g:469:1: rulePRIMITIVE_TYPE_NAME : ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) ;
    public final void rulePRIMITIVE_TYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:473:1: ( ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) )
            // InternalBasicAttributes.g:474:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            {
            // InternalBasicAttributes.g:474:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            // InternalBasicAttributes.g:475:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            {
             before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); 
            // InternalBasicAttributes.g:476:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            // InternalBasicAttributes.g:476:4: rule__PRIMITIVE_TYPE_NAME__Alternatives
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
    // InternalBasicAttributes.g:484:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:488:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalBasicAttributes.g:489:2: ( 'true' )
                    {
                    // InternalBasicAttributes.g:489:2: ( 'true' )
                    // InternalBasicAttributes.g:490:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBasicAttributes.g:495:2: ( 'false' )
                    {
                    // InternalBasicAttributes.g:495:2: ( 'false' )
                    // InternalBasicAttributes.g:496:3: 'false'
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
    // InternalBasicAttributes.g:505:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:509:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalBasicAttributes.g:510:2: ( 'E' )
                    {
                    // InternalBasicAttributes.g:510:2: ( 'E' )
                    // InternalBasicAttributes.g:511:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBasicAttributes.g:516:2: ( 'e' )
                    {
                    // InternalBasicAttributes.g:516:2: ( 'e' )
                    // InternalBasicAttributes.g:517:3: 'e'
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
    // InternalBasicAttributes.g:526:1: rule__AbstractAttributeType__Alternatives : ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) );
    public final void rule__AbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:530:1: ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=16 && LA3_0<=27)) ) {
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
                    // InternalBasicAttributes.g:531:2: ( rulePrimitiveType )
                    {
                    // InternalBasicAttributes.g:531:2: ( rulePrimitiveType )
                    // InternalBasicAttributes.g:532:3: rulePrimitiveType
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
                    // InternalBasicAttributes.g:537:2: ( ruleInlineEnumerationType )
                    {
                    // InternalBasicAttributes.g:537:2: ( ruleInlineEnumerationType )
                    // InternalBasicAttributes.g:538:3: ruleInlineEnumerationType
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
    // InternalBasicAttributes.g:547:1: rule__Cardinality__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:551:1: ( ( RULE_INT ) | ( '*' ) )
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
                    // InternalBasicAttributes.g:552:2: ( RULE_INT )
                    {
                    // InternalBasicAttributes.g:552:2: ( RULE_INT )
                    // InternalBasicAttributes.g:553:3: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBasicAttributes.g:558:2: ( '*' )
                    {
                    // InternalBasicAttributes.g:558:2: ( '*' )
                    // InternalBasicAttributes.g:559:3: '*'
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
    // InternalBasicAttributes.g:568:1: rule__AbstractValue__Alternatives : ( ( ruleSingleValue ) | ( ruleArrayValue ) );
    public final void rule__AbstractValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:572:1: ( ( ruleSingleValue ) | ( ruleArrayValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||(LA5_0>=11 && LA5_0<=12)||(LA5_0>=31 && LA5_0<=32)) ) {
                alt5=1;
            }
            else if ( (LA5_0==36) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBasicAttributes.g:573:2: ( ruleSingleValue )
                    {
                    // InternalBasicAttributes.g:573:2: ( ruleSingleValue )
                    // InternalBasicAttributes.g:574:3: ruleSingleValue
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
                    // InternalBasicAttributes.g:579:2: ( ruleArrayValue )
                    {
                    // InternalBasicAttributes.g:579:2: ( ruleArrayValue )
                    // InternalBasicAttributes.g:580:3: ruleArrayValue
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
    // InternalBasicAttributes.g:589:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:593:1: ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_INT) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==EOF||LA6_2==29||(LA6_2>=37 && LA6_2<=38)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==31) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==31) ) {
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

                if ( (LA6_2==EOF||LA6_2==29||(LA6_2>=37 && LA6_2<=38)) ) {
                    alt6=1;
                }
                else if ( (LA6_2==31) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 31:
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
                    // InternalBasicAttributes.g:594:2: ( ( rule__SingleValue__Group_0__0 ) )
                    {
                    // InternalBasicAttributes.g:594:2: ( ( rule__SingleValue__Group_0__0 ) )
                    // InternalBasicAttributes.g:595:3: ( rule__SingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_0()); 
                    // InternalBasicAttributes.g:596:3: ( rule__SingleValue__Group_0__0 )
                    // InternalBasicAttributes.g:596:4: rule__SingleValue__Group_0__0
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
                    // InternalBasicAttributes.g:600:2: ( ( rule__SingleValue__Group_1__0 ) )
                    {
                    // InternalBasicAttributes.g:600:2: ( ( rule__SingleValue__Group_1__0 ) )
                    // InternalBasicAttributes.g:601:3: ( rule__SingleValue__Group_1__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_1()); 
                    // InternalBasicAttributes.g:602:3: ( rule__SingleValue__Group_1__0 )
                    // InternalBasicAttributes.g:602:4: rule__SingleValue__Group_1__0
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
                    // InternalBasicAttributes.g:606:2: ( ( rule__SingleValue__Group_2__0 ) )
                    {
                    // InternalBasicAttributes.g:606:2: ( ( rule__SingleValue__Group_2__0 ) )
                    // InternalBasicAttributes.g:607:3: ( rule__SingleValue__Group_2__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_2()); 
                    // InternalBasicAttributes.g:608:3: ( rule__SingleValue__Group_2__0 )
                    // InternalBasicAttributes.g:608:4: rule__SingleValue__Group_2__0
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
                    // InternalBasicAttributes.g:612:2: ( ( rule__SingleValue__Group_3__0 ) )
                    {
                    // InternalBasicAttributes.g:612:2: ( ( rule__SingleValue__Group_3__0 ) )
                    // InternalBasicAttributes.g:613:3: ( rule__SingleValue__Group_3__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_3()); 
                    // InternalBasicAttributes.g:614:3: ( rule__SingleValue__Group_3__0 )
                    // InternalBasicAttributes.g:614:4: rule__SingleValue__Group_3__0
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
                    // InternalBasicAttributes.g:618:2: ( ( rule__SingleValue__Group_4__0 ) )
                    {
                    // InternalBasicAttributes.g:618:2: ( ( rule__SingleValue__Group_4__0 ) )
                    // InternalBasicAttributes.g:619:3: ( rule__SingleValue__Group_4__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_4()); 
                    // InternalBasicAttributes.g:620:3: ( rule__SingleValue__Group_4__0 )
                    // InternalBasicAttributes.g:620:4: rule__SingleValue__Group_4__0
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
    // InternalBasicAttributes.g:628:1: rule__PRIMITIVE_TYPE_NAME__Alternatives : ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PRIMITIVE_TYPE_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:632:1: ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) )
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
                    // InternalBasicAttributes.g:633:2: ( ( 'Int8' ) )
                    {
                    // InternalBasicAttributes.g:633:2: ( ( 'Int8' ) )
                    // InternalBasicAttributes.g:634:3: ( 'Int8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 
                    // InternalBasicAttributes.g:635:3: ( 'Int8' )
                    // InternalBasicAttributes.g:635:4: 'Int8'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBasicAttributes.g:639:2: ( ( 'Int16' ) )
                    {
                    // InternalBasicAttributes.g:639:2: ( ( 'Int16' ) )
                    // InternalBasicAttributes.g:640:3: ( 'Int16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 
                    // InternalBasicAttributes.g:641:3: ( 'Int16' )
                    // InternalBasicAttributes.g:641:4: 'Int16'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBasicAttributes.g:645:2: ( ( 'Int32' ) )
                    {
                    // InternalBasicAttributes.g:645:2: ( ( 'Int32' ) )
                    // InternalBasicAttributes.g:646:3: ( 'Int32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 
                    // InternalBasicAttributes.g:647:3: ( 'Int32' )
                    // InternalBasicAttributes.g:647:4: 'Int32'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBasicAttributes.g:651:2: ( ( 'Int64' ) )
                    {
                    // InternalBasicAttributes.g:651:2: ( ( 'Int64' ) )
                    // InternalBasicAttributes.g:652:3: ( 'Int64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 
                    // InternalBasicAttributes.g:653:3: ( 'Int64' )
                    // InternalBasicAttributes.g:653:4: 'Int64'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBasicAttributes.g:657:2: ( ( 'UInt8' ) )
                    {
                    // InternalBasicAttributes.g:657:2: ( ( 'UInt8' ) )
                    // InternalBasicAttributes.g:658:3: ( 'UInt8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 
                    // InternalBasicAttributes.g:659:3: ( 'UInt8' )
                    // InternalBasicAttributes.g:659:4: 'UInt8'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBasicAttributes.g:663:2: ( ( 'UInt16' ) )
                    {
                    // InternalBasicAttributes.g:663:2: ( ( 'UInt16' ) )
                    // InternalBasicAttributes.g:664:3: ( 'UInt16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 
                    // InternalBasicAttributes.g:665:3: ( 'UInt16' )
                    // InternalBasicAttributes.g:665:4: 'UInt16'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBasicAttributes.g:669:2: ( ( 'UInt32' ) )
                    {
                    // InternalBasicAttributes.g:669:2: ( ( 'UInt32' ) )
                    // InternalBasicAttributes.g:670:3: ( 'UInt32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 
                    // InternalBasicAttributes.g:671:3: ( 'UInt32' )
                    // InternalBasicAttributes.g:671:4: 'UInt32'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBasicAttributes.g:675:2: ( ( 'UInt64' ) )
                    {
                    // InternalBasicAttributes.g:675:2: ( ( 'UInt64' ) )
                    // InternalBasicAttributes.g:676:3: ( 'UInt64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 
                    // InternalBasicAttributes.g:677:3: ( 'UInt64' )
                    // InternalBasicAttributes.g:677:4: 'UInt64'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBasicAttributes.g:681:2: ( ( 'Float' ) )
                    {
                    // InternalBasicAttributes.g:681:2: ( ( 'Float' ) )
                    // InternalBasicAttributes.g:682:3: ( 'Float' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 
                    // InternalBasicAttributes.g:683:3: ( 'Float' )
                    // InternalBasicAttributes.g:683:4: 'Float'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalBasicAttributes.g:687:2: ( ( 'Double' ) )
                    {
                    // InternalBasicAttributes.g:687:2: ( ( 'Double' ) )
                    // InternalBasicAttributes.g:688:3: ( 'Double' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 
                    // InternalBasicAttributes.g:689:3: ( 'Double' )
                    // InternalBasicAttributes.g:689:4: 'Double'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalBasicAttributes.g:693:2: ( ( 'String' ) )
                    {
                    // InternalBasicAttributes.g:693:2: ( ( 'String' ) )
                    // InternalBasicAttributes.g:694:3: ( 'String' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 
                    // InternalBasicAttributes.g:695:3: ( 'String' )
                    // InternalBasicAttributes.g:695:4: 'String'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalBasicAttributes.g:699:2: ( ( 'Boolean' ) )
                    {
                    // InternalBasicAttributes.g:699:2: ( ( 'Boolean' ) )
                    // InternalBasicAttributes.g:700:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); 
                    // InternalBasicAttributes.g:701:3: ( 'Boolean' )
                    // InternalBasicAttributes.g:701:4: 'Boolean'
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


    // $ANTLR start "rule__AttributeDefinition__Group__0"
    // InternalBasicAttributes.g:709:1: rule__AttributeDefinition__Group__0 : rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 ;
    public final void rule__AttributeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:713:1: ( rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 )
            // InternalBasicAttributes.g:714:2: rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AttributeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__0"


    // $ANTLR start "rule__AttributeDefinition__Group__0__Impl"
    // InternalBasicAttributes.g:721:1: rule__AttributeDefinition__Group__0__Impl : ( ( rule__AttributeDefinition__NameAssignment_0 ) ) ;
    public final void rule__AttributeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:725:1: ( ( ( rule__AttributeDefinition__NameAssignment_0 ) ) )
            // InternalBasicAttributes.g:726:1: ( ( rule__AttributeDefinition__NameAssignment_0 ) )
            {
            // InternalBasicAttributes.g:726:1: ( ( rule__AttributeDefinition__NameAssignment_0 ) )
            // InternalBasicAttributes.g:727:2: ( rule__AttributeDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_0()); 
            // InternalBasicAttributes.g:728:2: ( rule__AttributeDefinition__NameAssignment_0 )
            // InternalBasicAttributes.g:728:3: rule__AttributeDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__0__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__1"
    // InternalBasicAttributes.g:736:1: rule__AttributeDefinition__Group__1 : rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 ;
    public final void rule__AttributeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:740:1: ( rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 )
            // InternalBasicAttributes.g:741:2: rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AttributeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__1"


    // $ANTLR start "rule__AttributeDefinition__Group__1__Impl"
    // InternalBasicAttributes.g:748:1: rule__AttributeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AttributeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:752:1: ( ( ':' ) )
            // InternalBasicAttributes.g:753:1: ( ':' )
            {
            // InternalBasicAttributes.g:753:1: ( ':' )
            // InternalBasicAttributes.g:754:2: ':'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__1__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__2"
    // InternalBasicAttributes.g:763:1: rule__AttributeDefinition__Group__2 : rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 ;
    public final void rule__AttributeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:767:1: ( rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 )
            // InternalBasicAttributes.g:768:2: rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__AttributeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__2"


    // $ANTLR start "rule__AttributeDefinition__Group__2__Impl"
    // InternalBasicAttributes.g:775:1: rule__AttributeDefinition__Group__2__Impl : ( ( rule__AttributeDefinition__TypeAssignment_2 ) ) ;
    public final void rule__AttributeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:779:1: ( ( ( rule__AttributeDefinition__TypeAssignment_2 ) ) )
            // InternalBasicAttributes.g:780:1: ( ( rule__AttributeDefinition__TypeAssignment_2 ) )
            {
            // InternalBasicAttributes.g:780:1: ( ( rule__AttributeDefinition__TypeAssignment_2 ) )
            // InternalBasicAttributes.g:781:2: ( rule__AttributeDefinition__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_2()); 
            // InternalBasicAttributes.g:782:2: ( rule__AttributeDefinition__TypeAssignment_2 )
            // InternalBasicAttributes.g:782:3: rule__AttributeDefinition__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__2__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__3"
    // InternalBasicAttributes.g:790:1: rule__AttributeDefinition__Group__3 : rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 ;
    public final void rule__AttributeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:794:1: ( rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 )
            // InternalBasicAttributes.g:795:2: rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__AttributeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__3"


    // $ANTLR start "rule__AttributeDefinition__Group__3__Impl"
    // InternalBasicAttributes.g:802:1: rule__AttributeDefinition__Group__3__Impl : ( ( rule__AttributeDefinition__Group_3__0 )? ) ;
    public final void rule__AttributeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:806:1: ( ( ( rule__AttributeDefinition__Group_3__0 )? ) )
            // InternalBasicAttributes.g:807:1: ( ( rule__AttributeDefinition__Group_3__0 )? )
            {
            // InternalBasicAttributes.g:807:1: ( ( rule__AttributeDefinition__Group_3__0 )? )
            // InternalBasicAttributes.g:808:2: ( rule__AttributeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup_3()); 
            // InternalBasicAttributes.g:809:2: ( rule__AttributeDefinition__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBasicAttributes.g:809:3: rule__AttributeDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__3__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__4"
    // InternalBasicAttributes.g:817:1: rule__AttributeDefinition__Group__4 : rule__AttributeDefinition__Group__4__Impl ;
    public final void rule__AttributeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:821:1: ( rule__AttributeDefinition__Group__4__Impl )
            // InternalBasicAttributes.g:822:2: rule__AttributeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__4"


    // $ANTLR start "rule__AttributeDefinition__Group__4__Impl"
    // InternalBasicAttributes.g:828:1: rule__AttributeDefinition__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__AttributeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:832:1: ( ( ( ';' )? ) )
            // InternalBasicAttributes.g:833:1: ( ( ';' )? )
            {
            // InternalBasicAttributes.g:833:1: ( ( ';' )? )
            // InternalBasicAttributes.g:834:2: ( ';' )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_4()); 
            // InternalBasicAttributes.g:835:2: ( ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBasicAttributes.g:835:3: ';'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__4__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group_3__0"
    // InternalBasicAttributes.g:844:1: rule__AttributeDefinition__Group_3__0 : rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1 ;
    public final void rule__AttributeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:848:1: ( rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1 )
            // InternalBasicAttributes.g:849:2: rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__AttributeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3__0"


    // $ANTLR start "rule__AttributeDefinition__Group_3__0__Impl"
    // InternalBasicAttributes.g:856:1: rule__AttributeDefinition__Group_3__0__Impl : ( '=' ) ;
    public final void rule__AttributeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:860:1: ( ( '=' ) )
            // InternalBasicAttributes.g:861:1: ( '=' )
            {
            // InternalBasicAttributes.g:861:1: ( '=' )
            // InternalBasicAttributes.g:862:2: '='
            {
             before(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group_3__1"
    // InternalBasicAttributes.g:871:1: rule__AttributeDefinition__Group_3__1 : rule__AttributeDefinition__Group_3__1__Impl ;
    public final void rule__AttributeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:875:1: ( rule__AttributeDefinition__Group_3__1__Impl )
            // InternalBasicAttributes.g:876:2: rule__AttributeDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3__1"


    // $ANTLR start "rule__AttributeDefinition__Group_3__1__Impl"
    // InternalBasicAttributes.g:882:1: rule__AttributeDefinition__Group_3__1__Impl : ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) ) ;
    public final void rule__AttributeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:886:1: ( ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) ) )
            // InternalBasicAttributes.g:887:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) )
            {
            // InternalBasicAttributes.g:887:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) )
            // InternalBasicAttributes.g:888:2: ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_3_1()); 
            // InternalBasicAttributes.g:889:2: ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 )
            // InternalBasicAttributes.g:889:3: rule__AttributeDefinition__DefaultvalueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__DefaultvalueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalBasicAttributes.g:898:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:902:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalBasicAttributes.g:903:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalBasicAttributes.g:910:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:914:1: ( ( RULE_ID ) )
            // InternalBasicAttributes.g:915:1: ( RULE_ID )
            {
            // InternalBasicAttributes.g:915:1: ( RULE_ID )
            // InternalBasicAttributes.g:916:2: RULE_ID
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
    // InternalBasicAttributes.g:925:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:929:1: ( rule__FQN__Group__1__Impl )
            // InternalBasicAttributes.g:930:2: rule__FQN__Group__1__Impl
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
    // InternalBasicAttributes.g:936:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:940:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalBasicAttributes.g:941:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalBasicAttributes.g:941:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalBasicAttributes.g:942:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalBasicAttributes.g:943:2: ( rule__FQN__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBasicAttributes.g:943:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalBasicAttributes.g:952:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:956:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalBasicAttributes.g:957:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalBasicAttributes.g:964:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:968:1: ( ( '.' ) )
            // InternalBasicAttributes.g:969:1: ( '.' )
            {
            // InternalBasicAttributes.g:969:1: ( '.' )
            // InternalBasicAttributes.g:970:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBasicAttributes.g:979:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:983:1: ( rule__FQN__Group_1__1__Impl )
            // InternalBasicAttributes.g:984:2: rule__FQN__Group_1__1__Impl
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
    // InternalBasicAttributes.g:990:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:994:1: ( ( RULE_ID ) )
            // InternalBasicAttributes.g:995:1: ( RULE_ID )
            {
            // InternalBasicAttributes.g:995:1: ( RULE_ID )
            // InternalBasicAttributes.g:996:2: RULE_ID
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
    // InternalBasicAttributes.g:1006:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1010:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBasicAttributes.g:1011:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBasicAttributes.g:1018:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1022:1: ( ( ( '-' )? ) )
            // InternalBasicAttributes.g:1023:1: ( ( '-' )? )
            {
            // InternalBasicAttributes.g:1023:1: ( ( '-' )? )
            // InternalBasicAttributes.g:1024:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBasicAttributes.g:1025:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBasicAttributes.g:1025:3: '-'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalBasicAttributes.g:1033:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1037:1: ( rule__EInt__Group__1__Impl )
            // InternalBasicAttributes.g:1038:2: rule__EInt__Group__1__Impl
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
    // InternalBasicAttributes.g:1044:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1048:1: ( ( RULE_INT ) )
            // InternalBasicAttributes.g:1049:1: ( RULE_INT )
            {
            // InternalBasicAttributes.g:1049:1: ( RULE_INT )
            // InternalBasicAttributes.g:1050:2: RULE_INT
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
    // InternalBasicAttributes.g:1060:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1064:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalBasicAttributes.g:1065:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBasicAttributes.g:1072:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1076:1: ( ( ( '-' )? ) )
            // InternalBasicAttributes.g:1077:1: ( ( '-' )? )
            {
            // InternalBasicAttributes.g:1077:1: ( ( '-' )? )
            // InternalBasicAttributes.g:1078:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalBasicAttributes.g:1079:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBasicAttributes.g:1079:3: '-'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalBasicAttributes.g:1087:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1091:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalBasicAttributes.g:1092:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalBasicAttributes.g:1099:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1103:1: ( ( ( RULE_INT )? ) )
            // InternalBasicAttributes.g:1104:1: ( ( RULE_INT )? )
            {
            // InternalBasicAttributes.g:1104:1: ( ( RULE_INT )? )
            // InternalBasicAttributes.g:1105:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalBasicAttributes.g:1106:2: ( RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBasicAttributes.g:1106:3: RULE_INT
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
    // InternalBasicAttributes.g:1114:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1118:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalBasicAttributes.g:1119:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalBasicAttributes.g:1126:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1130:1: ( ( '.' ) )
            // InternalBasicAttributes.g:1131:1: ( '.' )
            {
            // InternalBasicAttributes.g:1131:1: ( '.' )
            // InternalBasicAttributes.g:1132:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBasicAttributes.g:1141:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1145:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalBasicAttributes.g:1146:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalBasicAttributes.g:1153:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1157:1: ( ( RULE_INT ) )
            // InternalBasicAttributes.g:1158:1: ( RULE_INT )
            {
            // InternalBasicAttributes.g:1158:1: ( RULE_INT )
            // InternalBasicAttributes.g:1159:2: RULE_INT
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
    // InternalBasicAttributes.g:1168:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1172:1: ( rule__EDouble__Group__4__Impl )
            // InternalBasicAttributes.g:1173:2: rule__EDouble__Group__4__Impl
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
    // InternalBasicAttributes.g:1179:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1183:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalBasicAttributes.g:1184:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalBasicAttributes.g:1184:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalBasicAttributes.g:1185:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalBasicAttributes.g:1186:2: ( rule__EDouble__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=13 && LA14_0<=14)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBasicAttributes.g:1186:3: rule__EDouble__Group_4__0
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
    // InternalBasicAttributes.g:1195:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1199:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalBasicAttributes.g:1200:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBasicAttributes.g:1207:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1211:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalBasicAttributes.g:1212:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalBasicAttributes.g:1212:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalBasicAttributes.g:1213:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalBasicAttributes.g:1214:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalBasicAttributes.g:1214:3: rule__EDouble__Alternatives_4_0
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
    // InternalBasicAttributes.g:1222:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1226:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalBasicAttributes.g:1227:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalBasicAttributes.g:1234:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1238:1: ( ( ( '-' )? ) )
            // InternalBasicAttributes.g:1239:1: ( ( '-' )? )
            {
            // InternalBasicAttributes.g:1239:1: ( ( '-' )? )
            // InternalBasicAttributes.g:1240:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBasicAttributes.g:1241:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBasicAttributes.g:1241:3: '-'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalBasicAttributes.g:1249:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1253:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalBasicAttributes.g:1254:2: rule__EDouble__Group_4__2__Impl
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
    // InternalBasicAttributes.g:1260:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1264:1: ( ( RULE_INT ) )
            // InternalBasicAttributes.g:1265:1: ( RULE_INT )
            {
            // InternalBasicAttributes.g:1265:1: ( RULE_INT )
            // InternalBasicAttributes.g:1266:2: RULE_INT
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
    // InternalBasicAttributes.g:1276:1: rule__EnumerationElement__Group__0 : rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 ;
    public final void rule__EnumerationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1280:1: ( rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 )
            // InternalBasicAttributes.g:1281:2: rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBasicAttributes.g:1288:1: rule__EnumerationElement__Group__0__Impl : ( ( rule__EnumerationElement__NameAssignment_0 ) ) ;
    public final void rule__EnumerationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1292:1: ( ( ( rule__EnumerationElement__NameAssignment_0 ) ) )
            // InternalBasicAttributes.g:1293:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            {
            // InternalBasicAttributes.g:1293:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            // InternalBasicAttributes.g:1294:2: ( rule__EnumerationElement__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); 
            // InternalBasicAttributes.g:1295:2: ( rule__EnumerationElement__NameAssignment_0 )
            // InternalBasicAttributes.g:1295:3: rule__EnumerationElement__NameAssignment_0
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
    // InternalBasicAttributes.g:1303:1: rule__EnumerationElement__Group__1 : rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 ;
    public final void rule__EnumerationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1307:1: ( rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 )
            // InternalBasicAttributes.g:1308:2: rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalBasicAttributes.g:1315:1: rule__EnumerationElement__Group__1__Impl : ( ( rule__EnumerationElement__Group_1__0 )? ) ;
    public final void rule__EnumerationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1319:1: ( ( ( rule__EnumerationElement__Group_1__0 )? ) )
            // InternalBasicAttributes.g:1320:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            {
            // InternalBasicAttributes.g:1320:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            // InternalBasicAttributes.g:1321:2: ( rule__EnumerationElement__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup_1()); 
            // InternalBasicAttributes.g:1322:2: ( rule__EnumerationElement__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBasicAttributes.g:1322:3: rule__EnumerationElement__Group_1__0
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
    // InternalBasicAttributes.g:1330:1: rule__EnumerationElement__Group__2 : rule__EnumerationElement__Group__2__Impl ;
    public final void rule__EnumerationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1334:1: ( rule__EnumerationElement__Group__2__Impl )
            // InternalBasicAttributes.g:1335:2: rule__EnumerationElement__Group__2__Impl
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
    // InternalBasicAttributes.g:1341:1: rule__EnumerationElement__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__EnumerationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1345:1: ( ( ( ';' )? ) )
            // InternalBasicAttributes.g:1346:1: ( ( ';' )? )
            {
            // InternalBasicAttributes.g:1346:1: ( ( ';' )? )
            // InternalBasicAttributes.g:1347:2: ( ';' )?
            {
             before(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); 
            // InternalBasicAttributes.g:1348:2: ( ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBasicAttributes.g:1348:3: ';'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalBasicAttributes.g:1357:1: rule__EnumerationElement__Group_1__0 : rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 ;
    public final void rule__EnumerationElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1361:1: ( rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 )
            // InternalBasicAttributes.g:1362:2: rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBasicAttributes.g:1369:1: rule__EnumerationElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1373:1: ( ( '=' ) )
            // InternalBasicAttributes.g:1374:1: ( '=' )
            {
            // InternalBasicAttributes.g:1374:1: ( '=' )
            // InternalBasicAttributes.g:1375:2: '='
            {
             before(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBasicAttributes.g:1384:1: rule__EnumerationElement__Group_1__1 : rule__EnumerationElement__Group_1__1__Impl ;
    public final void rule__EnumerationElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1388:1: ( rule__EnumerationElement__Group_1__1__Impl )
            // InternalBasicAttributes.g:1389:2: rule__EnumerationElement__Group_1__1__Impl
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
    // InternalBasicAttributes.g:1395:1: rule__EnumerationElement__Group_1__1__Impl : ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1399:1: ( ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) )
            // InternalBasicAttributes.g:1400:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            {
            // InternalBasicAttributes.g:1400:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            // InternalBasicAttributes.g:1401:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); 
            // InternalBasicAttributes.g:1402:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            // InternalBasicAttributes.g:1402:3: rule__EnumerationElement__ValueAssignment_1_1
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
    // InternalBasicAttributes.g:1411:1: rule__InlineEnumerationType__Group__0 : rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 ;
    public final void rule__InlineEnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1415:1: ( rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 )
            // InternalBasicAttributes.g:1416:2: rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalBasicAttributes.g:1423:1: rule__InlineEnumerationType__Group__0__Impl : ( 'InlineEnumeration' ) ;
    public final void rule__InlineEnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1427:1: ( ( 'InlineEnumeration' ) )
            // InternalBasicAttributes.g:1428:1: ( 'InlineEnumeration' )
            {
            // InternalBasicAttributes.g:1428:1: ( 'InlineEnumeration' )
            // InternalBasicAttributes.g:1429:2: 'InlineEnumeration'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBasicAttributes.g:1438:1: rule__InlineEnumerationType__Group__1 : rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 ;
    public final void rule__InlineEnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1442:1: ( rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 )
            // InternalBasicAttributes.g:1443:2: rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalBasicAttributes.g:1450:1: rule__InlineEnumerationType__Group__1__Impl : ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) ;
    public final void rule__InlineEnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1454:1: ( ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) )
            // InternalBasicAttributes.g:1455:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            {
            // InternalBasicAttributes.g:1455:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            // InternalBasicAttributes.g:1456:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); 
            // InternalBasicAttributes.g:1457:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBasicAttributes.g:1457:3: rule__InlineEnumerationType__ArrayAssignment_1
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
    // InternalBasicAttributes.g:1465:1: rule__InlineEnumerationType__Group__2 : rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 ;
    public final void rule__InlineEnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1469:1: ( rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 )
            // InternalBasicAttributes.g:1470:2: rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalBasicAttributes.g:1477:1: rule__InlineEnumerationType__Group__2__Impl : ( '{' ) ;
    public final void rule__InlineEnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1481:1: ( ( '{' ) )
            // InternalBasicAttributes.g:1482:1: ( '{' )
            {
            // InternalBasicAttributes.g:1482:1: ( '{' )
            // InternalBasicAttributes.g:1483:2: '{'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBasicAttributes.g:1492:1: rule__InlineEnumerationType__Group__3 : rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 ;
    public final void rule__InlineEnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1496:1: ( rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 )
            // InternalBasicAttributes.g:1497:2: rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalBasicAttributes.g:1504:1: rule__InlineEnumerationType__Group__3__Impl : ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) ;
    public final void rule__InlineEnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1508:1: ( ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) )
            // InternalBasicAttributes.g:1509:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            {
            // InternalBasicAttributes.g:1509:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            // InternalBasicAttributes.g:1510:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            {
            // InternalBasicAttributes.g:1510:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) )
            // InternalBasicAttributes.g:1511:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalBasicAttributes.g:1512:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            // InternalBasicAttributes.g:1512:4: rule__InlineEnumerationType__EnumsAssignment_3
            {
            pushFollow(FOLLOW_16);
            rule__InlineEnumerationType__EnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 

            }

            // InternalBasicAttributes.g:1515:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            // InternalBasicAttributes.g:1516:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalBasicAttributes.g:1517:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBasicAttributes.g:1517:4: rule__InlineEnumerationType__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__InlineEnumerationType__EnumsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalBasicAttributes.g:1526:1: rule__InlineEnumerationType__Group__4 : rule__InlineEnumerationType__Group__4__Impl ;
    public final void rule__InlineEnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1530:1: ( rule__InlineEnumerationType__Group__4__Impl )
            // InternalBasicAttributes.g:1531:2: rule__InlineEnumerationType__Group__4__Impl
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
    // InternalBasicAttributes.g:1537:1: rule__InlineEnumerationType__Group__4__Impl : ( '}' ) ;
    public final void rule__InlineEnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1541:1: ( ( '}' ) )
            // InternalBasicAttributes.g:1542:1: ( '}' )
            {
            // InternalBasicAttributes.g:1542:1: ( '}' )
            // InternalBasicAttributes.g:1543:2: '}'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBasicAttributes.g:1553:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1557:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalBasicAttributes.g:1558:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBasicAttributes.g:1565:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1569:1: ( ( () ) )
            // InternalBasicAttributes.g:1570:1: ( () )
            {
            // InternalBasicAttributes.g:1570:1: ( () )
            // InternalBasicAttributes.g:1571:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // InternalBasicAttributes.g:1572:2: ()
            // InternalBasicAttributes.g:1572:3: 
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
    // InternalBasicAttributes.g:1580:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1584:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalBasicAttributes.g:1585:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalBasicAttributes.g:1592:1: rule__ArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1596:1: ( ( '[' ) )
            // InternalBasicAttributes.g:1597:1: ( '[' )
            {
            // InternalBasicAttributes.g:1597:1: ( '[' )
            // InternalBasicAttributes.g:1598:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBasicAttributes.g:1607:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1611:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalBasicAttributes.g:1612:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalBasicAttributes.g:1619:1: rule__ArrayType__Group__2__Impl : ( ( rule__ArrayType__LengthAssignment_2 )? ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1623:1: ( ( ( rule__ArrayType__LengthAssignment_2 )? ) )
            // InternalBasicAttributes.g:1624:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            {
            // InternalBasicAttributes.g:1624:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            // InternalBasicAttributes.g:1625:2: ( rule__ArrayType__LengthAssignment_2 )?
            {
             before(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); 
            // InternalBasicAttributes.g:1626:2: ( rule__ArrayType__LengthAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT||LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBasicAttributes.g:1626:3: rule__ArrayType__LengthAssignment_2
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
    // InternalBasicAttributes.g:1634:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1638:1: ( rule__ArrayType__Group__3__Impl )
            // InternalBasicAttributes.g:1639:2: rule__ArrayType__Group__3__Impl
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
    // InternalBasicAttributes.g:1645:1: rule__ArrayType__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1649:1: ( ( ']' ) )
            // InternalBasicAttributes.g:1650:1: ( ']' )
            {
            // InternalBasicAttributes.g:1650:1: ( ']' )
            // InternalBasicAttributes.g:1651:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBasicAttributes.g:1661:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1665:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalBasicAttributes.g:1666:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBasicAttributes.g:1673:1: rule__PrimitiveType__Group__0__Impl : ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1677:1: ( ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) )
            // InternalBasicAttributes.g:1678:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            {
            // InternalBasicAttributes.g:1678:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            // InternalBasicAttributes.g:1679:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); 
            // InternalBasicAttributes.g:1680:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            // InternalBasicAttributes.g:1680:3: rule__PrimitiveType__TypeNameAssignment_0
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
    // InternalBasicAttributes.g:1688:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1692:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalBasicAttributes.g:1693:2: rule__PrimitiveType__Group__1__Impl
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
    // InternalBasicAttributes.g:1699:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1703:1: ( ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) )
            // InternalBasicAttributes.g:1704:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            {
            // InternalBasicAttributes.g:1704:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            // InternalBasicAttributes.g:1705:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); 
            // InternalBasicAttributes.g:1706:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBasicAttributes.g:1706:3: rule__PrimitiveType__ArrayAssignment_1
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
    // InternalBasicAttributes.g:1715:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1719:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalBasicAttributes.g:1720:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBasicAttributes.g:1727:1: rule__ArrayValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1731:1: ( ( '[' ) )
            // InternalBasicAttributes.g:1732:1: ( '[' )
            {
            // InternalBasicAttributes.g:1732:1: ( '[' )
            // InternalBasicAttributes.g:1733:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBasicAttributes.g:1742:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1746:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalBasicAttributes.g:1747:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalBasicAttributes.g:1754:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_1 ) ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1758:1: ( ( ( rule__ArrayValue__ValuesAssignment_1 ) ) )
            // InternalBasicAttributes.g:1759:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            {
            // InternalBasicAttributes.g:1759:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            // InternalBasicAttributes.g:1760:2: ( rule__ArrayValue__ValuesAssignment_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); 
            // InternalBasicAttributes.g:1761:2: ( rule__ArrayValue__ValuesAssignment_1 )
            // InternalBasicAttributes.g:1761:3: rule__ArrayValue__ValuesAssignment_1
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
    // InternalBasicAttributes.g:1769:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1773:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalBasicAttributes.g:1774:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalBasicAttributes.g:1781:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )* ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1785:1: ( ( ( rule__ArrayValue__Group_2__0 )* ) )
            // InternalBasicAttributes.g:1786:1: ( ( rule__ArrayValue__Group_2__0 )* )
            {
            // InternalBasicAttributes.g:1786:1: ( ( rule__ArrayValue__Group_2__0 )* )
            // InternalBasicAttributes.g:1787:2: ( rule__ArrayValue__Group_2__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalBasicAttributes.g:1788:2: ( rule__ArrayValue__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBasicAttributes.g:1788:3: rule__ArrayValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ArrayValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalBasicAttributes.g:1796:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1800:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalBasicAttributes.g:1801:2: rule__ArrayValue__Group__3__Impl
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
    // InternalBasicAttributes.g:1807:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1811:1: ( ( ']' ) )
            // InternalBasicAttributes.g:1812:1: ( ']' )
            {
            // InternalBasicAttributes.g:1812:1: ( ']' )
            // InternalBasicAttributes.g:1813:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBasicAttributes.g:1823:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1827:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalBasicAttributes.g:1828:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBasicAttributes.g:1835:1: rule__ArrayValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1839:1: ( ( ',' ) )
            // InternalBasicAttributes.g:1840:1: ( ',' )
            {
            // InternalBasicAttributes.g:1840:1: ( ',' )
            // InternalBasicAttributes.g:1841:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBasicAttributes.g:1850:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1854:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalBasicAttributes.g:1855:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalBasicAttributes.g:1861:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1865:1: ( ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) )
            // InternalBasicAttributes.g:1866:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            {
            // InternalBasicAttributes.g:1866:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            // InternalBasicAttributes.g:1867:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); 
            // InternalBasicAttributes.g:1868:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            // InternalBasicAttributes.g:1868:3: rule__ArrayValue__ValuesAssignment_2_1
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
    // InternalBasicAttributes.g:1877:1: rule__SingleValue__Group_0__0 : rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 ;
    public final void rule__SingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1881:1: ( rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 )
            // InternalBasicAttributes.g:1882:2: rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBasicAttributes.g:1889:1: rule__SingleValue__Group_0__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1893:1: ( ( () ) )
            // InternalBasicAttributes.g:1894:1: ( () )
            {
            // InternalBasicAttributes.g:1894:1: ( () )
            // InternalBasicAttributes.g:1895:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getIntValueAction_0_0()); 
            // InternalBasicAttributes.g:1896:2: ()
            // InternalBasicAttributes.g:1896:3: 
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
    // InternalBasicAttributes.g:1904:1: rule__SingleValue__Group_0__1 : rule__SingleValue__Group_0__1__Impl ;
    public final void rule__SingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1908:1: ( rule__SingleValue__Group_0__1__Impl )
            // InternalBasicAttributes.g:1909:2: rule__SingleValue__Group_0__1__Impl
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
    // InternalBasicAttributes.g:1915:1: rule__SingleValue__Group_0__1__Impl : ( ( rule__SingleValue__ValueAssignment_0_1 ) ) ;
    public final void rule__SingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1919:1: ( ( ( rule__SingleValue__ValueAssignment_0_1 ) ) )
            // InternalBasicAttributes.g:1920:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            {
            // InternalBasicAttributes.g:1920:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            // InternalBasicAttributes.g:1921:2: ( rule__SingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); 
            // InternalBasicAttributes.g:1922:2: ( rule__SingleValue__ValueAssignment_0_1 )
            // InternalBasicAttributes.g:1922:3: rule__SingleValue__ValueAssignment_0_1
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
    // InternalBasicAttributes.g:1931:1: rule__SingleValue__Group_1__0 : rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 ;
    public final void rule__SingleValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1935:1: ( rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 )
            // InternalBasicAttributes.g:1936:2: rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBasicAttributes.g:1943:1: rule__SingleValue__Group_1__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1947:1: ( ( () ) )
            // InternalBasicAttributes.g:1948:1: ( () )
            {
            // InternalBasicAttributes.g:1948:1: ( () )
            // InternalBasicAttributes.g:1949:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0()); 
            // InternalBasicAttributes.g:1950:2: ()
            // InternalBasicAttributes.g:1950:3: 
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
    // InternalBasicAttributes.g:1958:1: rule__SingleValue__Group_1__1 : rule__SingleValue__Group_1__1__Impl ;
    public final void rule__SingleValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1962:1: ( rule__SingleValue__Group_1__1__Impl )
            // InternalBasicAttributes.g:1963:2: rule__SingleValue__Group_1__1__Impl
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
    // InternalBasicAttributes.g:1969:1: rule__SingleValue__Group_1__1__Impl : ( ( rule__SingleValue__ValueAssignment_1_1 ) ) ;
    public final void rule__SingleValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1973:1: ( ( ( rule__SingleValue__ValueAssignment_1_1 ) ) )
            // InternalBasicAttributes.g:1974:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            {
            // InternalBasicAttributes.g:1974:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            // InternalBasicAttributes.g:1975:2: ( rule__SingleValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_1_1()); 
            // InternalBasicAttributes.g:1976:2: ( rule__SingleValue__ValueAssignment_1_1 )
            // InternalBasicAttributes.g:1976:3: rule__SingleValue__ValueAssignment_1_1
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
    // InternalBasicAttributes.g:1985:1: rule__SingleValue__Group_2__0 : rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 ;
    public final void rule__SingleValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:1989:1: ( rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 )
            // InternalBasicAttributes.g:1990:2: rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBasicAttributes.g:1997:1: rule__SingleValue__Group_2__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2001:1: ( ( () ) )
            // InternalBasicAttributes.g:2002:1: ( () )
            {
            // InternalBasicAttributes.g:2002:1: ( () )
            // InternalBasicAttributes.g:2003:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getStringValueAction_2_0()); 
            // InternalBasicAttributes.g:2004:2: ()
            // InternalBasicAttributes.g:2004:3: 
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
    // InternalBasicAttributes.g:2012:1: rule__SingleValue__Group_2__1 : rule__SingleValue__Group_2__1__Impl ;
    public final void rule__SingleValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2016:1: ( rule__SingleValue__Group_2__1__Impl )
            // InternalBasicAttributes.g:2017:2: rule__SingleValue__Group_2__1__Impl
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
    // InternalBasicAttributes.g:2023:1: rule__SingleValue__Group_2__1__Impl : ( ( rule__SingleValue__ValueAssignment_2_1 ) ) ;
    public final void rule__SingleValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2027:1: ( ( ( rule__SingleValue__ValueAssignment_2_1 ) ) )
            // InternalBasicAttributes.g:2028:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            {
            // InternalBasicAttributes.g:2028:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            // InternalBasicAttributes.g:2029:2: ( rule__SingleValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_2_1()); 
            // InternalBasicAttributes.g:2030:2: ( rule__SingleValue__ValueAssignment_2_1 )
            // InternalBasicAttributes.g:2030:3: rule__SingleValue__ValueAssignment_2_1
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
    // InternalBasicAttributes.g:2039:1: rule__SingleValue__Group_3__0 : rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 ;
    public final void rule__SingleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2043:1: ( rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 )
            // InternalBasicAttributes.g:2044:2: rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBasicAttributes.g:2051:1: rule__SingleValue__Group_3__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2055:1: ( ( () ) )
            // InternalBasicAttributes.g:2056:1: ( () )
            {
            // InternalBasicAttributes.g:2056:1: ( () )
            // InternalBasicAttributes.g:2057:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getBoolValueAction_3_0()); 
            // InternalBasicAttributes.g:2058:2: ()
            // InternalBasicAttributes.g:2058:3: 
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
    // InternalBasicAttributes.g:2066:1: rule__SingleValue__Group_3__1 : rule__SingleValue__Group_3__1__Impl ;
    public final void rule__SingleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2070:1: ( rule__SingleValue__Group_3__1__Impl )
            // InternalBasicAttributes.g:2071:2: rule__SingleValue__Group_3__1__Impl
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
    // InternalBasicAttributes.g:2077:1: rule__SingleValue__Group_3__1__Impl : ( ( rule__SingleValue__ValueAssignment_3_1 ) ) ;
    public final void rule__SingleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2081:1: ( ( ( rule__SingleValue__ValueAssignment_3_1 ) ) )
            // InternalBasicAttributes.g:2082:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            {
            // InternalBasicAttributes.g:2082:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            // InternalBasicAttributes.g:2083:2: ( rule__SingleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_3_1()); 
            // InternalBasicAttributes.g:2084:2: ( rule__SingleValue__ValueAssignment_3_1 )
            // InternalBasicAttributes.g:2084:3: rule__SingleValue__ValueAssignment_3_1
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
    // InternalBasicAttributes.g:2093:1: rule__SingleValue__Group_4__0 : rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 ;
    public final void rule__SingleValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2097:1: ( rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 )
            // InternalBasicAttributes.g:2098:2: rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalBasicAttributes.g:2105:1: rule__SingleValue__Group_4__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2109:1: ( ( () ) )
            // InternalBasicAttributes.g:2110:1: ( () )
            {
            // InternalBasicAttributes.g:2110:1: ( () )
            // InternalBasicAttributes.g:2111:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0()); 
            // InternalBasicAttributes.g:2112:2: ()
            // InternalBasicAttributes.g:2112:3: 
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
    // InternalBasicAttributes.g:2120:1: rule__SingleValue__Group_4__1 : rule__SingleValue__Group_4__1__Impl ;
    public final void rule__SingleValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2124:1: ( rule__SingleValue__Group_4__1__Impl )
            // InternalBasicAttributes.g:2125:2: rule__SingleValue__Group_4__1__Impl
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
    // InternalBasicAttributes.g:2131:1: rule__SingleValue__Group_4__1__Impl : ( ( rule__SingleValue__ValueAssignment_4_1 ) ) ;
    public final void rule__SingleValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2135:1: ( ( ( rule__SingleValue__ValueAssignment_4_1 ) ) )
            // InternalBasicAttributes.g:2136:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            {
            // InternalBasicAttributes.g:2136:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            // InternalBasicAttributes.g:2137:2: ( rule__SingleValue__ValueAssignment_4_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_4_1()); 
            // InternalBasicAttributes.g:2138:2: ( rule__SingleValue__ValueAssignment_4_1 )
            // InternalBasicAttributes.g:2138:3: rule__SingleValue__ValueAssignment_4_1
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


    // $ANTLR start "rule__AttributeDefinition__NameAssignment_0"
    // InternalBasicAttributes.g:2147:1: rule__AttributeDefinition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttributeDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2151:1: ( ( RULE_ID ) )
            // InternalBasicAttributes.g:2152:2: ( RULE_ID )
            {
            // InternalBasicAttributes.g:2152:2: ( RULE_ID )
            // InternalBasicAttributes.g:2153:3: RULE_ID
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__NameAssignment_0"


    // $ANTLR start "rule__AttributeDefinition__TypeAssignment_2"
    // InternalBasicAttributes.g:2162:1: rule__AttributeDefinition__TypeAssignment_2 : ( ruleAbstractAttributeType ) ;
    public final void rule__AttributeDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2166:1: ( ( ruleAbstractAttributeType ) )
            // InternalBasicAttributes.g:2167:2: ( ruleAbstractAttributeType )
            {
            // InternalBasicAttributes.g:2167:2: ( ruleAbstractAttributeType )
            // InternalBasicAttributes.g:2168:3: ruleAbstractAttributeType
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__TypeAssignment_2"


    // $ANTLR start "rule__AttributeDefinition__DefaultvalueAssignment_3_1"
    // InternalBasicAttributes.g:2177:1: rule__AttributeDefinition__DefaultvalueAssignment_3_1 : ( ruleAbstractValue ) ;
    public final void rule__AttributeDefinition__DefaultvalueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2181:1: ( ( ruleAbstractValue ) )
            // InternalBasicAttributes.g:2182:2: ( ruleAbstractValue )
            {
            // InternalBasicAttributes.g:2182:2: ( ruleAbstractValue )
            // InternalBasicAttributes.g:2183:3: ruleAbstractValue
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractValue();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__DefaultvalueAssignment_3_1"


    // $ANTLR start "rule__EnumerationElement__NameAssignment_0"
    // InternalBasicAttributes.g:2192:1: rule__EnumerationElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2196:1: ( ( RULE_ID ) )
            // InternalBasicAttributes.g:2197:2: ( RULE_ID )
            {
            // InternalBasicAttributes.g:2197:2: ( RULE_ID )
            // InternalBasicAttributes.g:2198:3: RULE_ID
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
    // InternalBasicAttributes.g:2207:1: rule__EnumerationElement__ValueAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__EnumerationElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2211:1: ( ( ruleEInt ) )
            // InternalBasicAttributes.g:2212:2: ( ruleEInt )
            {
            // InternalBasicAttributes.g:2212:2: ( ruleEInt )
            // InternalBasicAttributes.g:2213:3: ruleEInt
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
    // InternalBasicAttributes.g:2222:1: rule__InlineEnumerationType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__InlineEnumerationType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2226:1: ( ( ruleArrayType ) )
            // InternalBasicAttributes.g:2227:2: ( ruleArrayType )
            {
            // InternalBasicAttributes.g:2227:2: ( ruleArrayType )
            // InternalBasicAttributes.g:2228:3: ruleArrayType
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
    // InternalBasicAttributes.g:2237:1: rule__InlineEnumerationType__EnumsAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__InlineEnumerationType__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2241:1: ( ( ruleEnumerationElement ) )
            // InternalBasicAttributes.g:2242:2: ( ruleEnumerationElement )
            {
            // InternalBasicAttributes.g:2242:2: ( ruleEnumerationElement )
            // InternalBasicAttributes.g:2243:3: ruleEnumerationElement
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
    // InternalBasicAttributes.g:2252:1: rule__ArrayType__LengthAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ArrayType__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2256:1: ( ( ruleCardinality ) )
            // InternalBasicAttributes.g:2257:2: ( ruleCardinality )
            {
            // InternalBasicAttributes.g:2257:2: ( ruleCardinality )
            // InternalBasicAttributes.g:2258:3: ruleCardinality
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
    // InternalBasicAttributes.g:2267:1: rule__PrimitiveType__TypeNameAssignment_0 : ( rulePRIMITIVE_TYPE_NAME ) ;
    public final void rule__PrimitiveType__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2271:1: ( ( rulePRIMITIVE_TYPE_NAME ) )
            // InternalBasicAttributes.g:2272:2: ( rulePRIMITIVE_TYPE_NAME )
            {
            // InternalBasicAttributes.g:2272:2: ( rulePRIMITIVE_TYPE_NAME )
            // InternalBasicAttributes.g:2273:3: rulePRIMITIVE_TYPE_NAME
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
    // InternalBasicAttributes.g:2282:1: rule__PrimitiveType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__PrimitiveType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2286:1: ( ( ruleArrayType ) )
            // InternalBasicAttributes.g:2287:2: ( ruleArrayType )
            {
            // InternalBasicAttributes.g:2287:2: ( ruleArrayType )
            // InternalBasicAttributes.g:2288:3: ruleArrayType
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
    // InternalBasicAttributes.g:2297:1: rule__ArrayValue__ValuesAssignment_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2301:1: ( ( ruleSingleValue ) )
            // InternalBasicAttributes.g:2302:2: ( ruleSingleValue )
            {
            // InternalBasicAttributes.g:2302:2: ( ruleSingleValue )
            // InternalBasicAttributes.g:2303:3: ruleSingleValue
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
    // InternalBasicAttributes.g:2312:1: rule__ArrayValue__ValuesAssignment_2_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2316:1: ( ( ruleSingleValue ) )
            // InternalBasicAttributes.g:2317:2: ( ruleSingleValue )
            {
            // InternalBasicAttributes.g:2317:2: ( ruleSingleValue )
            // InternalBasicAttributes.g:2318:3: ruleSingleValue
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
    // InternalBasicAttributes.g:2327:1: rule__SingleValue__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__SingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2331:1: ( ( ruleEInt ) )
            // InternalBasicAttributes.g:2332:2: ( ruleEInt )
            {
            // InternalBasicAttributes.g:2332:2: ( ruleEInt )
            // InternalBasicAttributes.g:2333:3: ruleEInt
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
    // InternalBasicAttributes.g:2342:1: rule__SingleValue__ValueAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__SingleValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2346:1: ( ( ruleEDouble ) )
            // InternalBasicAttributes.g:2347:2: ( ruleEDouble )
            {
            // InternalBasicAttributes.g:2347:2: ( ruleEDouble )
            // InternalBasicAttributes.g:2348:3: ruleEDouble
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
    // InternalBasicAttributes.g:2357:1: rule__SingleValue__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__SingleValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2361:1: ( ( ruleEString ) )
            // InternalBasicAttributes.g:2362:2: ( ruleEString )
            {
            // InternalBasicAttributes.g:2362:2: ( ruleEString )
            // InternalBasicAttributes.g:2363:3: ruleEString
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
    // InternalBasicAttributes.g:2372:1: rule__SingleValue__ValueAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__SingleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2376:1: ( ( ruleEBoolean ) )
            // InternalBasicAttributes.g:2377:2: ( ruleEBoolean )
            {
            // InternalBasicAttributes.g:2377:2: ( ruleEBoolean )
            // InternalBasicAttributes.g:2378:3: ruleEBoolean
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
    // InternalBasicAttributes.g:2387:1: rule__SingleValue__ValueAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__SingleValue__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicAttributes.g:2391:1: ( ( ( ruleFQN ) ) )
            // InternalBasicAttributes.g:2392:2: ( ( ruleFQN ) )
            {
            // InternalBasicAttributes.g:2392:2: ( ( ruleFQN ) )
            // InternalBasicAttributes.g:2393:3: ( ruleFQN )
            {
             before(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 
            // InternalBasicAttributes.g:2394:3: ( ruleFQN )
            // InternalBasicAttributes.g:2395:4: ruleFQN
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000020FFF0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001180001870L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000180000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000008020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000180001870L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001800L});

}