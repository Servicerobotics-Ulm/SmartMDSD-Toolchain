package org.xtext.service.communicationObject.ide.contentassist.antlr.internal;

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
import org.xtext.service.communicationObject.services.CommunicationObjectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCommunicationObjectParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'*'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'", "'.*'", "'#import'", "';'", "'CommObjectsRepository'", "'{'", "'}'", "'version'", "'Dependency'", "'.'", "'CommObject'", "'Enumeration'", "'('", "')'", "':'", "'='", "'-'", "'InlineEnumeration'", "'['", "']'", "','"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalCommunicationObjectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCommunicationObjectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCommunicationObjectParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCommunicationObject.g"; }


    	private CommunicationObjectGrammarAccess grammarAccess;

    	public void setGrammarAccess(CommunicationObjectGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCommObjectModel"
    // InternalCommunicationObject.g:94:1: entryRuleCommObjectModel : ruleCommObjectModel EOF ;
    public final void entryRuleCommObjectModel() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:95:1: ( ruleCommObjectModel EOF )
            // InternalCommunicationObject.g:96:1: ruleCommObjectModel EOF
            {
             before(grammarAccess.getCommObjectModelRule()); 
            pushFollow(FOLLOW_1);
            ruleCommObjectModel();

            state._fsp--;

             after(grammarAccess.getCommObjectModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommObjectModel"


    // $ANTLR start "ruleCommObjectModel"
    // InternalCommunicationObject.g:103:1: ruleCommObjectModel : ( ( rule__CommObjectModel__Group__0 ) ) ;
    public final void ruleCommObjectModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:107:2: ( ( ( rule__CommObjectModel__Group__0 ) ) )
            // InternalCommunicationObject.g:108:2: ( ( rule__CommObjectModel__Group__0 ) )
            {
            // InternalCommunicationObject.g:108:2: ( ( rule__CommObjectModel__Group__0 ) )
            // InternalCommunicationObject.g:109:3: ( rule__CommObjectModel__Group__0 )
            {
             before(grammarAccess.getCommObjectModelAccess().getGroup()); 
            // InternalCommunicationObject.g:110:3: ( rule__CommObjectModel__Group__0 )
            // InternalCommunicationObject.g:110:4: rule__CommObjectModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommObjectModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommObjectModel"


    // $ANTLR start "entryRuleFQNW"
    // InternalCommunicationObject.g:119:1: entryRuleFQNW : ruleFQNW EOF ;
    public final void entryRuleFQNW() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:120:1: ( ruleFQNW EOF )
            // InternalCommunicationObject.g:121:1: ruleFQNW EOF
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
    // InternalCommunicationObject.g:128:1: ruleFQNW : ( ( rule__FQNW__Group__0 ) ) ;
    public final void ruleFQNW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:132:2: ( ( ( rule__FQNW__Group__0 ) ) )
            // InternalCommunicationObject.g:133:2: ( ( rule__FQNW__Group__0 ) )
            {
            // InternalCommunicationObject.g:133:2: ( ( rule__FQNW__Group__0 ) )
            // InternalCommunicationObject.g:134:3: ( rule__FQNW__Group__0 )
            {
             before(grammarAccess.getFQNWAccess().getGroup()); 
            // InternalCommunicationObject.g:135:3: ( rule__FQNW__Group__0 )
            // InternalCommunicationObject.g:135:4: rule__FQNW__Group__0
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


    // $ANTLR start "entryRuleCommRepositoryImport"
    // InternalCommunicationObject.g:144:1: entryRuleCommRepositoryImport : ruleCommRepositoryImport EOF ;
    public final void entryRuleCommRepositoryImport() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:145:1: ( ruleCommRepositoryImport EOF )
            // InternalCommunicationObject.g:146:1: ruleCommRepositoryImport EOF
            {
             before(grammarAccess.getCommRepositoryImportRule()); 
            pushFollow(FOLLOW_1);
            ruleCommRepositoryImport();

            state._fsp--;

             after(grammarAccess.getCommRepositoryImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommRepositoryImport"


    // $ANTLR start "ruleCommRepositoryImport"
    // InternalCommunicationObject.g:153:1: ruleCommRepositoryImport : ( ( rule__CommRepositoryImport__Group__0 ) ) ;
    public final void ruleCommRepositoryImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:157:2: ( ( ( rule__CommRepositoryImport__Group__0 ) ) )
            // InternalCommunicationObject.g:158:2: ( ( rule__CommRepositoryImport__Group__0 ) )
            {
            // InternalCommunicationObject.g:158:2: ( ( rule__CommRepositoryImport__Group__0 ) )
            // InternalCommunicationObject.g:159:3: ( rule__CommRepositoryImport__Group__0 )
            {
             before(grammarAccess.getCommRepositoryImportAccess().getGroup()); 
            // InternalCommunicationObject.g:160:3: ( rule__CommRepositoryImport__Group__0 )
            // InternalCommunicationObject.g:160:4: rule__CommRepositoryImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommRepositoryImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommRepositoryImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommRepositoryImport"


    // $ANTLR start "entryRuleCommObjectsRepository"
    // InternalCommunicationObject.g:169:1: entryRuleCommObjectsRepository : ruleCommObjectsRepository EOF ;
    public final void entryRuleCommObjectsRepository() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:170:1: ( ruleCommObjectsRepository EOF )
            // InternalCommunicationObject.g:171:1: ruleCommObjectsRepository EOF
            {
             before(grammarAccess.getCommObjectsRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleCommObjectsRepository();

            state._fsp--;

             after(grammarAccess.getCommObjectsRepositoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommObjectsRepository"


    // $ANTLR start "ruleCommObjectsRepository"
    // InternalCommunicationObject.g:178:1: ruleCommObjectsRepository : ( ( rule__CommObjectsRepository__Group__0 ) ) ;
    public final void ruleCommObjectsRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:182:2: ( ( ( rule__CommObjectsRepository__Group__0 ) ) )
            // InternalCommunicationObject.g:183:2: ( ( rule__CommObjectsRepository__Group__0 ) )
            {
            // InternalCommunicationObject.g:183:2: ( ( rule__CommObjectsRepository__Group__0 ) )
            // InternalCommunicationObject.g:184:3: ( rule__CommObjectsRepository__Group__0 )
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getGroup()); 
            // InternalCommunicationObject.g:185:3: ( rule__CommObjectsRepository__Group__0 )
            // InternalCommunicationObject.g:185:4: rule__CommObjectsRepository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommObjectsRepository"


    // $ANTLR start "entryRuleVersion"
    // InternalCommunicationObject.g:194:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:195:1: ( ruleVersion EOF )
            // InternalCommunicationObject.g:196:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalCommunicationObject.g:203:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:207:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalCommunicationObject.g:208:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalCommunicationObject.g:208:2: ( ( rule__Version__Group__0 ) )
            // InternalCommunicationObject.g:209:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalCommunicationObject.g:210:3: ( rule__Version__Group__0 )
            // InternalCommunicationObject.g:210:4: rule__Version__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleAbstractCommElement"
    // InternalCommunicationObject.g:219:1: entryRuleAbstractCommElement : ruleAbstractCommElement EOF ;
    public final void entryRuleAbstractCommElement() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:220:1: ( ruleAbstractCommElement EOF )
            // InternalCommunicationObject.g:221:1: ruleAbstractCommElement EOF
            {
             before(grammarAccess.getAbstractCommElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractCommElement();

            state._fsp--;

             after(grammarAccess.getAbstractCommElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractCommElement"


    // $ANTLR start "ruleAbstractCommElement"
    // InternalCommunicationObject.g:228:1: ruleAbstractCommElement : ( ( rule__AbstractCommElement__Alternatives ) ) ;
    public final void ruleAbstractCommElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:232:2: ( ( ( rule__AbstractCommElement__Alternatives ) ) )
            // InternalCommunicationObject.g:233:2: ( ( rule__AbstractCommElement__Alternatives ) )
            {
            // InternalCommunicationObject.g:233:2: ( ( rule__AbstractCommElement__Alternatives ) )
            // InternalCommunicationObject.g:234:3: ( rule__AbstractCommElement__Alternatives )
            {
             before(grammarAccess.getAbstractCommElementAccess().getAlternatives()); 
            // InternalCommunicationObject.g:235:3: ( rule__AbstractCommElement__Alternatives )
            // InternalCommunicationObject.g:235:4: rule__AbstractCommElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCommElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractCommElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractCommElement"


    // $ANTLR start "entryRuleCommunicationObject"
    // InternalCommunicationObject.g:244:1: entryRuleCommunicationObject : ruleCommunicationObject EOF ;
    public final void entryRuleCommunicationObject() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:245:1: ( ruleCommunicationObject EOF )
            // InternalCommunicationObject.g:246:1: ruleCommunicationObject EOF
            {
             before(grammarAccess.getCommunicationObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleCommunicationObject();

            state._fsp--;

             after(grammarAccess.getCommunicationObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommunicationObject"


    // $ANTLR start "ruleCommunicationObject"
    // InternalCommunicationObject.g:253:1: ruleCommunicationObject : ( ( rule__CommunicationObject__Group__0 ) ) ;
    public final void ruleCommunicationObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:257:2: ( ( ( rule__CommunicationObject__Group__0 ) ) )
            // InternalCommunicationObject.g:258:2: ( ( rule__CommunicationObject__Group__0 ) )
            {
            // InternalCommunicationObject.g:258:2: ( ( rule__CommunicationObject__Group__0 ) )
            // InternalCommunicationObject.g:259:3: ( rule__CommunicationObject__Group__0 )
            {
             before(grammarAccess.getCommunicationObjectAccess().getGroup()); 
            // InternalCommunicationObject.g:260:3: ( rule__CommunicationObject__Group__0 )
            // InternalCommunicationObject.g:260:4: rule__CommunicationObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommunicationObject"


    // $ANTLR start "entryRuleEnumeration"
    // InternalCommunicationObject.g:269:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:270:1: ( ruleEnumeration EOF )
            // InternalCommunicationObject.g:271:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalCommunicationObject.g:278:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:282:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalCommunicationObject.g:283:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalCommunicationObject.g:283:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalCommunicationObject.g:284:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalCommunicationObject.g:285:3: ( rule__Enumeration__Group__0 )
            // InternalCommunicationObject.g:285:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleAbstractAttributeType"
    // InternalCommunicationObject.g:294:1: entryRuleAbstractAttributeType : ruleAbstractAttributeType EOF ;
    public final void entryRuleAbstractAttributeType() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:295:1: ( ruleAbstractAttributeType EOF )
            // InternalCommunicationObject.g:296:1: ruleAbstractAttributeType EOF
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
    // InternalCommunicationObject.g:303:1: ruleAbstractAttributeType : ( ( rule__AbstractAttributeType__Alternatives ) ) ;
    public final void ruleAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:307:2: ( ( ( rule__AbstractAttributeType__Alternatives ) ) )
            // InternalCommunicationObject.g:308:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            {
            // InternalCommunicationObject.g:308:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            // InternalCommunicationObject.g:309:3: ( rule__AbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalCommunicationObject.g:310:3: ( rule__AbstractAttributeType__Alternatives )
            // InternalCommunicationObject.g:310:4: rule__AbstractAttributeType__Alternatives
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


    // $ANTLR start "entryRuleCommElementReference"
    // InternalCommunicationObject.g:319:1: entryRuleCommElementReference : ruleCommElementReference EOF ;
    public final void entryRuleCommElementReference() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:320:1: ( ruleCommElementReference EOF )
            // InternalCommunicationObject.g:321:1: ruleCommElementReference EOF
            {
             before(grammarAccess.getCommElementReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleCommElementReference();

            state._fsp--;

             after(grammarAccess.getCommElementReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommElementReference"


    // $ANTLR start "ruleCommElementReference"
    // InternalCommunicationObject.g:328:1: ruleCommElementReference : ( ( rule__CommElementReference__Group__0 ) ) ;
    public final void ruleCommElementReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:332:2: ( ( ( rule__CommElementReference__Group__0 ) ) )
            // InternalCommunicationObject.g:333:2: ( ( rule__CommElementReference__Group__0 ) )
            {
            // InternalCommunicationObject.g:333:2: ( ( rule__CommElementReference__Group__0 ) )
            // InternalCommunicationObject.g:334:3: ( rule__CommElementReference__Group__0 )
            {
             before(grammarAccess.getCommElementReferenceAccess().getGroup()); 
            // InternalCommunicationObject.g:335:3: ( rule__CommElementReference__Group__0 )
            // InternalCommunicationObject.g:335:4: rule__CommElementReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommElementReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommElementReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommElementReference"


    // $ANTLR start "entryRuleSingleValue"
    // InternalCommunicationObject.g:344:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:345:1: ( ruleSingleValue EOF )
            // InternalCommunicationObject.g:346:1: ruleSingleValue EOF
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
    // InternalCommunicationObject.g:353:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:357:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalCommunicationObject.g:358:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalCommunicationObject.g:358:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalCommunicationObject.g:359:3: ( rule__SingleValue__Alternatives )
            {
             before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            // InternalCommunicationObject.g:360:3: ( rule__SingleValue__Alternatives )
            // InternalCommunicationObject.g:360:4: rule__SingleValue__Alternatives
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


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalCommunicationObject.g:369:1: entryRuleAttributeDefinition : ruleAttributeDefinition EOF ;
    public final void entryRuleAttributeDefinition() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:370:1: ( ruleAttributeDefinition EOF )
            // InternalCommunicationObject.g:371:1: ruleAttributeDefinition EOF
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
    // InternalCommunicationObject.g:378:1: ruleAttributeDefinition : ( ( rule__AttributeDefinition__Group__0 ) ) ;
    public final void ruleAttributeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:382:2: ( ( ( rule__AttributeDefinition__Group__0 ) ) )
            // InternalCommunicationObject.g:383:2: ( ( rule__AttributeDefinition__Group__0 ) )
            {
            // InternalCommunicationObject.g:383:2: ( ( rule__AttributeDefinition__Group__0 ) )
            // InternalCommunicationObject.g:384:3: ( rule__AttributeDefinition__Group__0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup()); 
            // InternalCommunicationObject.g:385:3: ( rule__AttributeDefinition__Group__0 )
            // InternalCommunicationObject.g:385:4: rule__AttributeDefinition__Group__0
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
    // InternalCommunicationObject.g:394:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:395:1: ( ruleFQN EOF )
            // InternalCommunicationObject.g:396:1: ruleFQN EOF
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
    // InternalCommunicationObject.g:403:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:407:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalCommunicationObject.g:408:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalCommunicationObject.g:408:2: ( ( rule__FQN__Group__0 ) )
            // InternalCommunicationObject.g:409:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalCommunicationObject.g:410:3: ( rule__FQN__Group__0 )
            // InternalCommunicationObject.g:410:4: rule__FQN__Group__0
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
    // InternalCommunicationObject.g:419:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:420:1: ( ruleEBoolean EOF )
            // InternalCommunicationObject.g:421:1: ruleEBoolean EOF
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
    // InternalCommunicationObject.g:428:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:432:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalCommunicationObject.g:433:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalCommunicationObject.g:433:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalCommunicationObject.g:434:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalCommunicationObject.g:435:3: ( rule__EBoolean__Alternatives )
            // InternalCommunicationObject.g:435:4: rule__EBoolean__Alternatives
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
    // InternalCommunicationObject.g:444:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:445:1: ( ruleEString EOF )
            // InternalCommunicationObject.g:446:1: ruleEString EOF
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
    // InternalCommunicationObject.g:453:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:457:2: ( ( RULE_STRING ) )
            // InternalCommunicationObject.g:458:2: ( RULE_STRING )
            {
            // InternalCommunicationObject.g:458:2: ( RULE_STRING )
            // InternalCommunicationObject.g:459:3: RULE_STRING
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
    // InternalCommunicationObject.g:469:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:470:1: ( ruleEInt EOF )
            // InternalCommunicationObject.g:471:1: ruleEInt EOF
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
    // InternalCommunicationObject.g:478:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:482:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalCommunicationObject.g:483:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalCommunicationObject.g:483:2: ( ( rule__EInt__Group__0 ) )
            // InternalCommunicationObject.g:484:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalCommunicationObject.g:485:3: ( rule__EInt__Group__0 )
            // InternalCommunicationObject.g:485:4: rule__EInt__Group__0
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
    // InternalCommunicationObject.g:494:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:495:1: ( ruleEDouble EOF )
            // InternalCommunicationObject.g:496:1: ruleEDouble EOF
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
    // InternalCommunicationObject.g:503:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:507:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalCommunicationObject.g:508:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalCommunicationObject.g:508:2: ( ( rule__EDouble__Group__0 ) )
            // InternalCommunicationObject.g:509:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalCommunicationObject.g:510:3: ( rule__EDouble__Group__0 )
            // InternalCommunicationObject.g:510:4: rule__EDouble__Group__0
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
    // InternalCommunicationObject.g:519:1: entryRuleEnumerationElement : ruleEnumerationElement EOF ;
    public final void entryRuleEnumerationElement() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:520:1: ( ruleEnumerationElement EOF )
            // InternalCommunicationObject.g:521:1: ruleEnumerationElement EOF
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
    // InternalCommunicationObject.g:528:1: ruleEnumerationElement : ( ( rule__EnumerationElement__Group__0 ) ) ;
    public final void ruleEnumerationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:532:2: ( ( ( rule__EnumerationElement__Group__0 ) ) )
            // InternalCommunicationObject.g:533:2: ( ( rule__EnumerationElement__Group__0 ) )
            {
            // InternalCommunicationObject.g:533:2: ( ( rule__EnumerationElement__Group__0 ) )
            // InternalCommunicationObject.g:534:3: ( rule__EnumerationElement__Group__0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup()); 
            // InternalCommunicationObject.g:535:3: ( rule__EnumerationElement__Group__0 )
            // InternalCommunicationObject.g:535:4: rule__EnumerationElement__Group__0
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


    // $ANTLR start "entrySuperAbstractAttributeType"
    // InternalCommunicationObject.g:544:1: entrySuperAbstractAttributeType : superAbstractAttributeType EOF ;
    public final void entrySuperAbstractAttributeType() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:545:1: ( superAbstractAttributeType EOF )
            // InternalCommunicationObject.g:546:1: superAbstractAttributeType EOF
            {
             before(grammarAccess.getBasicAttributesAbstractAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            superAbstractAttributeType();

            state._fsp--;

             after(grammarAccess.getBasicAttributesAbstractAttributeTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entrySuperAbstractAttributeType"


    // $ANTLR start "superAbstractAttributeType"
    // InternalCommunicationObject.g:553:1: superAbstractAttributeType : ( ( superAbstractAttributeType__Alternatives ) ) ;
    public final void superAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:557:2: ( ( ( superAbstractAttributeType__Alternatives ) ) )
            // InternalCommunicationObject.g:558:2: ( ( superAbstractAttributeType__Alternatives ) )
            {
            // InternalCommunicationObject.g:558:2: ( ( superAbstractAttributeType__Alternatives ) )
            // InternalCommunicationObject.g:559:3: ( superAbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalCommunicationObject.g:560:3: ( superAbstractAttributeType__Alternatives )
            // InternalCommunicationObject.g:560:4: superAbstractAttributeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            superAbstractAttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superAbstractAttributeType"


    // $ANTLR start "entryRuleInlineEnumerationType"
    // InternalCommunicationObject.g:569:1: entryRuleInlineEnumerationType : ruleInlineEnumerationType EOF ;
    public final void entryRuleInlineEnumerationType() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:570:1: ( ruleInlineEnumerationType EOF )
            // InternalCommunicationObject.g:571:1: ruleInlineEnumerationType EOF
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
    // InternalCommunicationObject.g:578:1: ruleInlineEnumerationType : ( ( rule__InlineEnumerationType__Group__0 ) ) ;
    public final void ruleInlineEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:582:2: ( ( ( rule__InlineEnumerationType__Group__0 ) ) )
            // InternalCommunicationObject.g:583:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            {
            // InternalCommunicationObject.g:583:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            // InternalCommunicationObject.g:584:3: ( rule__InlineEnumerationType__Group__0 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); 
            // InternalCommunicationObject.g:585:3: ( rule__InlineEnumerationType__Group__0 )
            // InternalCommunicationObject.g:585:4: rule__InlineEnumerationType__Group__0
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
    // InternalCommunicationObject.g:594:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:595:1: ( ruleArrayType EOF )
            // InternalCommunicationObject.g:596:1: ruleArrayType EOF
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
    // InternalCommunicationObject.g:603:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:607:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalCommunicationObject.g:608:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalCommunicationObject.g:608:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalCommunicationObject.g:609:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalCommunicationObject.g:610:3: ( rule__ArrayType__Group__0 )
            // InternalCommunicationObject.g:610:4: rule__ArrayType__Group__0
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
    // InternalCommunicationObject.g:619:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:620:1: ( ruleCardinality EOF )
            // InternalCommunicationObject.g:621:1: ruleCardinality EOF
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
    // InternalCommunicationObject.g:628:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:632:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalCommunicationObject.g:633:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalCommunicationObject.g:633:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalCommunicationObject.g:634:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalCommunicationObject.g:635:3: ( rule__Cardinality__Alternatives )
            // InternalCommunicationObject.g:635:4: rule__Cardinality__Alternatives
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
    // InternalCommunicationObject.g:644:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:645:1: ( rulePrimitiveType EOF )
            // InternalCommunicationObject.g:646:1: rulePrimitiveType EOF
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
    // InternalCommunicationObject.g:653:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:657:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalCommunicationObject.g:658:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalCommunicationObject.g:658:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalCommunicationObject.g:659:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalCommunicationObject.g:660:3: ( rule__PrimitiveType__Group__0 )
            // InternalCommunicationObject.g:660:4: rule__PrimitiveType__Group__0
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
    // InternalCommunicationObject.g:669:1: entryRuleAbstractValue : ruleAbstractValue EOF ;
    public final void entryRuleAbstractValue() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:670:1: ( ruleAbstractValue EOF )
            // InternalCommunicationObject.g:671:1: ruleAbstractValue EOF
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
    // InternalCommunicationObject.g:678:1: ruleAbstractValue : ( ( rule__AbstractValue__Alternatives ) ) ;
    public final void ruleAbstractValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:682:2: ( ( ( rule__AbstractValue__Alternatives ) ) )
            // InternalCommunicationObject.g:683:2: ( ( rule__AbstractValue__Alternatives ) )
            {
            // InternalCommunicationObject.g:683:2: ( ( rule__AbstractValue__Alternatives ) )
            // InternalCommunicationObject.g:684:3: ( rule__AbstractValue__Alternatives )
            {
             before(grammarAccess.getAbstractValueAccess().getAlternatives()); 
            // InternalCommunicationObject.g:685:3: ( rule__AbstractValue__Alternatives )
            // InternalCommunicationObject.g:685:4: rule__AbstractValue__Alternatives
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
    // InternalCommunicationObject.g:694:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:695:1: ( ruleArrayValue EOF )
            // InternalCommunicationObject.g:696:1: ruleArrayValue EOF
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
    // InternalCommunicationObject.g:703:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:707:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalCommunicationObject.g:708:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalCommunicationObject.g:708:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalCommunicationObject.g:709:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalCommunicationObject.g:710:3: ( rule__ArrayValue__Group__0 )
            // InternalCommunicationObject.g:710:4: rule__ArrayValue__Group__0
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


    // $ANTLR start "entrySuperSingleValue"
    // InternalCommunicationObject.g:719:1: entrySuperSingleValue : superSingleValue EOF ;
    public final void entrySuperSingleValue() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:720:1: ( superSingleValue EOF )
            // InternalCommunicationObject.g:721:1: superSingleValue EOF
            {
             before(grammarAccess.getBasicAttributesSingleValueRule()); 
            pushFollow(FOLLOW_1);
            superSingleValue();

            state._fsp--;

             after(grammarAccess.getBasicAttributesSingleValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entrySuperSingleValue"


    // $ANTLR start "superSingleValue"
    // InternalCommunicationObject.g:728:1: superSingleValue : ( ( superSingleValue__Alternatives ) ) ;
    public final void superSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:732:2: ( ( ( superSingleValue__Alternatives ) ) )
            // InternalCommunicationObject.g:733:2: ( ( superSingleValue__Alternatives ) )
            {
            // InternalCommunicationObject.g:733:2: ( ( superSingleValue__Alternatives ) )
            // InternalCommunicationObject.g:734:3: ( superSingleValue__Alternatives )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getAlternatives()); 
            // InternalCommunicationObject.g:735:3: ( superSingleValue__Alternatives )
            // InternalCommunicationObject.g:735:4: superSingleValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            superSingleValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicAttributesSingleValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue"


    // $ANTLR start "rulePRIMITIVE_TYPE_NAME"
    // InternalCommunicationObject.g:744:1: rulePRIMITIVE_TYPE_NAME : ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) ;
    public final void rulePRIMITIVE_TYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:748:1: ( ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) )
            // InternalCommunicationObject.g:749:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            {
            // InternalCommunicationObject.g:749:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            // InternalCommunicationObject.g:750:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            {
             before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); 
            // InternalCommunicationObject.g:751:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            // InternalCommunicationObject.g:751:4: rule__PRIMITIVE_TYPE_NAME__Alternatives
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


    // $ANTLR start "rule__AbstractCommElement__Alternatives"
    // InternalCommunicationObject.g:759:1: rule__AbstractCommElement__Alternatives : ( ( ruleEnumeration ) | ( ruleCommunicationObject ) );
    public final void rule__AbstractCommElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:763:1: ( ( ruleEnumeration ) | ( ruleCommunicationObject ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==38) ) {
                alt1=1;
            }
            else if ( (LA1_0==37) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCommunicationObject.g:764:2: ( ruleEnumeration )
                    {
                    // InternalCommunicationObject.g:764:2: ( ruleEnumeration )
                    // InternalCommunicationObject.g:765:3: ruleEnumeration
                    {
                     before(grammarAccess.getAbstractCommElementAccess().getEnumerationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getAbstractCommElementAccess().getEnumerationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:770:2: ( ruleCommunicationObject )
                    {
                    // InternalCommunicationObject.g:770:2: ( ruleCommunicationObject )
                    // InternalCommunicationObject.g:771:3: ruleCommunicationObject
                    {
                     before(grammarAccess.getAbstractCommElementAccess().getCommunicationObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCommunicationObject();

                    state._fsp--;

                     after(grammarAccess.getAbstractCommElementAccess().getCommunicationObjectParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractCommElement__Alternatives"


    // $ANTLR start "rule__AbstractAttributeType__Alternatives"
    // InternalCommunicationObject.g:780:1: rule__AbstractAttributeType__Alternatives : ( ( ruleCommElementReference ) | ( superAbstractAttributeType ) );
    public final void rule__AbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:784:1: ( ( ruleCommElementReference ) | ( superAbstractAttributeType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=16 && LA2_0<=27)||LA2_0==44) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCommunicationObject.g:785:2: ( ruleCommElementReference )
                    {
                    // InternalCommunicationObject.g:785:2: ( ruleCommElementReference )
                    // InternalCommunicationObject.g:786:3: ruleCommElementReference
                    {
                     before(grammarAccess.getAbstractAttributeTypeAccess().getCommElementReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCommElementReference();

                    state._fsp--;

                     after(grammarAccess.getAbstractAttributeTypeAccess().getCommElementReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:791:2: ( superAbstractAttributeType )
                    {
                    // InternalCommunicationObject.g:791:2: ( superAbstractAttributeType )
                    // InternalCommunicationObject.g:792:3: superAbstractAttributeType
                    {
                     before(grammarAccess.getAbstractAttributeTypeAccess().getAbstractAttributeTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    superAbstractAttributeType();

                    state._fsp--;

                     after(grammarAccess.getAbstractAttributeTypeAccess().getAbstractAttributeTypeParserRuleCall_1()); 

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


    // $ANTLR start "rule__SingleValue__Alternatives"
    // InternalCommunicationObject.g:801:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( superSingleValue ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:805:1: ( ( ( rule__SingleValue__Group_0__0 ) ) | ( superSingleValue ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalCommunicationObject.g:806:2: ( ( rule__SingleValue__Group_0__0 ) )
                    {
                    // InternalCommunicationObject.g:806:2: ( ( rule__SingleValue__Group_0__0 ) )
                    // InternalCommunicationObject.g:807:3: ( rule__SingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_0()); 
                    // InternalCommunicationObject.g:808:3: ( rule__SingleValue__Group_0__0 )
                    // InternalCommunicationObject.g:808:4: rule__SingleValue__Group_0__0
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
                    // InternalCommunicationObject.g:812:2: ( superSingleValue )
                    {
                    // InternalCommunicationObject.g:812:2: ( superSingleValue )
                    // InternalCommunicationObject.g:813:3: superSingleValue
                    {
                     before(grammarAccess.getSingleValueAccess().getSingleValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    superSingleValue();

                    state._fsp--;

                     after(grammarAccess.getSingleValueAccess().getSingleValueParserRuleCall_1()); 

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


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalCommunicationObject.g:822:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:826:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCommunicationObject.g:827:2: ( 'true' )
                    {
                    // InternalCommunicationObject.g:827:2: ( 'true' )
                    // InternalCommunicationObject.g:828:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:833:2: ( 'false' )
                    {
                    // InternalCommunicationObject.g:833:2: ( 'false' )
                    // InternalCommunicationObject.g:834:3: 'false'
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
    // InternalCommunicationObject.g:843:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:847:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCommunicationObject.g:848:2: ( 'E' )
                    {
                    // InternalCommunicationObject.g:848:2: ( 'E' )
                    // InternalCommunicationObject.g:849:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:854:2: ( 'e' )
                    {
                    // InternalCommunicationObject.g:854:2: ( 'e' )
                    // InternalCommunicationObject.g:855:3: 'e'
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


    // $ANTLR start "superAbstractAttributeType__Alternatives"
    // InternalCommunicationObject.g:864:1: superAbstractAttributeType__Alternatives : ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) );
    public final void superAbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:868:1: ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=16 && LA6_0<=27)) ) {
                alt6=1;
            }
            else if ( (LA6_0==44) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCommunicationObject.g:869:2: ( rulePrimitiveType )
                    {
                    // InternalCommunicationObject.g:869:2: ( rulePrimitiveType )
                    // InternalCommunicationObject.g:870:3: rulePrimitiveType
                    {
                     before(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:875:2: ( ruleInlineEnumerationType )
                    {
                    // InternalCommunicationObject.g:875:2: ( ruleInlineEnumerationType )
                    // InternalCommunicationObject.g:876:3: ruleInlineEnumerationType
                    {
                     before(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInlineEnumerationType();

                    state._fsp--;

                     after(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1()); 

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
    // $ANTLR end "superAbstractAttributeType__Alternatives"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // InternalCommunicationObject.g:885:1: rule__Cardinality__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:889:1: ( ( RULE_INT ) | ( '*' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCommunicationObject.g:890:2: ( RULE_INT )
                    {
                    // InternalCommunicationObject.g:890:2: ( RULE_INT )
                    // InternalCommunicationObject.g:891:3: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:896:2: ( '*' )
                    {
                    // InternalCommunicationObject.g:896:2: ( '*' )
                    // InternalCommunicationObject.g:897:3: '*'
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
    // InternalCommunicationObject.g:906:1: rule__AbstractValue__Alternatives : ( ( ruleSingleValue ) | ( ruleArrayValue ) );
    public final void rule__AbstractValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:910:1: ( ( ruleSingleValue ) | ( ruleArrayValue ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||(LA8_0>=11 && LA8_0<=12)||LA8_0==36||LA8_0==43) ) {
                alt8=1;
            }
            else if ( (LA8_0==45) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCommunicationObject.g:911:2: ( ruleSingleValue )
                    {
                    // InternalCommunicationObject.g:911:2: ( ruleSingleValue )
                    // InternalCommunicationObject.g:912:3: ruleSingleValue
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
                    // InternalCommunicationObject.g:917:2: ( ruleArrayValue )
                    {
                    // InternalCommunicationObject.g:917:2: ( ruleArrayValue )
                    // InternalCommunicationObject.g:918:3: ruleArrayValue
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


    // $ANTLR start "superSingleValue__Alternatives"
    // InternalCommunicationObject.g:927:1: superSingleValue__Alternatives : ( ( ( superSingleValue__Group_0__0 ) ) | ( ( superSingleValue__Group_1__0 ) ) | ( ( superSingleValue__Group_2__0 ) ) | ( ( superSingleValue__Group_3__0 ) ) | ( ( superSingleValue__Group_4__0 ) ) );
    public final void superSingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:931:1: ( ( ( superSingleValue__Group_0__0 ) ) | ( ( superSingleValue__Group_1__0 ) ) | ( ( superSingleValue__Group_2__0 ) ) | ( ( superSingleValue__Group_3__0 ) ) | ( ( superSingleValue__Group_4__0 ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_INT) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==EOF||LA9_2==RULE_ID||LA9_2==30||LA9_2==33||(LA9_2>=46 && LA9_2<=47)) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==36) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA9_1==36) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==EOF||LA9_2==RULE_ID||LA9_2==30||LA9_2==33||(LA9_2>=46 && LA9_2<=47)) ) {
                    alt9=1;
                }
                else if ( (LA9_2==36) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case 11:
            case 12:
                {
                alt9=4;
                }
                break;
            case RULE_ID:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCommunicationObject.g:932:2: ( ( superSingleValue__Group_0__0 ) )
                    {
                    // InternalCommunicationObject.g:932:2: ( ( superSingleValue__Group_0__0 ) )
                    // InternalCommunicationObject.g:933:3: ( superSingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_0()); 
                    // InternalCommunicationObject.g:934:3: ( superSingleValue__Group_0__0 )
                    // InternalCommunicationObject.g:934:4: superSingleValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    superSingleValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:938:2: ( ( superSingleValue__Group_1__0 ) )
                    {
                    // InternalCommunicationObject.g:938:2: ( ( superSingleValue__Group_1__0 ) )
                    // InternalCommunicationObject.g:939:3: ( superSingleValue__Group_1__0 )
                    {
                     before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_1()); 
                    // InternalCommunicationObject.g:940:3: ( superSingleValue__Group_1__0 )
                    // InternalCommunicationObject.g:940:4: superSingleValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    superSingleValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCommunicationObject.g:944:2: ( ( superSingleValue__Group_2__0 ) )
                    {
                    // InternalCommunicationObject.g:944:2: ( ( superSingleValue__Group_2__0 ) )
                    // InternalCommunicationObject.g:945:3: ( superSingleValue__Group_2__0 )
                    {
                     before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_2()); 
                    // InternalCommunicationObject.g:946:3: ( superSingleValue__Group_2__0 )
                    // InternalCommunicationObject.g:946:4: superSingleValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    superSingleValue__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCommunicationObject.g:950:2: ( ( superSingleValue__Group_3__0 ) )
                    {
                    // InternalCommunicationObject.g:950:2: ( ( superSingleValue__Group_3__0 ) )
                    // InternalCommunicationObject.g:951:3: ( superSingleValue__Group_3__0 )
                    {
                     before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_3()); 
                    // InternalCommunicationObject.g:952:3: ( superSingleValue__Group_3__0 )
                    // InternalCommunicationObject.g:952:4: superSingleValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    superSingleValue__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCommunicationObject.g:956:2: ( ( superSingleValue__Group_4__0 ) )
                    {
                    // InternalCommunicationObject.g:956:2: ( ( superSingleValue__Group_4__0 ) )
                    // InternalCommunicationObject.g:957:3: ( superSingleValue__Group_4__0 )
                    {
                     before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_4()); 
                    // InternalCommunicationObject.g:958:3: ( superSingleValue__Group_4__0 )
                    // InternalCommunicationObject.g:958:4: superSingleValue__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    superSingleValue__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_4()); 

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
    // $ANTLR end "superSingleValue__Alternatives"


    // $ANTLR start "rule__PRIMITIVE_TYPE_NAME__Alternatives"
    // InternalCommunicationObject.g:966:1: rule__PRIMITIVE_TYPE_NAME__Alternatives : ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PRIMITIVE_TYPE_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:970:1: ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) )
            int alt10=12;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            case 21:
                {
                alt10=6;
                }
                break;
            case 22:
                {
                alt10=7;
                }
                break;
            case 23:
                {
                alt10=8;
                }
                break;
            case 24:
                {
                alt10=9;
                }
                break;
            case 25:
                {
                alt10=10;
                }
                break;
            case 26:
                {
                alt10=11;
                }
                break;
            case 27:
                {
                alt10=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCommunicationObject.g:971:2: ( ( 'Int8' ) )
                    {
                    // InternalCommunicationObject.g:971:2: ( ( 'Int8' ) )
                    // InternalCommunicationObject.g:972:3: ( 'Int8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 
                    // InternalCommunicationObject.g:973:3: ( 'Int8' )
                    // InternalCommunicationObject.g:973:4: 'Int8'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:977:2: ( ( 'Int16' ) )
                    {
                    // InternalCommunicationObject.g:977:2: ( ( 'Int16' ) )
                    // InternalCommunicationObject.g:978:3: ( 'Int16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 
                    // InternalCommunicationObject.g:979:3: ( 'Int16' )
                    // InternalCommunicationObject.g:979:4: 'Int16'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCommunicationObject.g:983:2: ( ( 'Int32' ) )
                    {
                    // InternalCommunicationObject.g:983:2: ( ( 'Int32' ) )
                    // InternalCommunicationObject.g:984:3: ( 'Int32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 
                    // InternalCommunicationObject.g:985:3: ( 'Int32' )
                    // InternalCommunicationObject.g:985:4: 'Int32'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCommunicationObject.g:989:2: ( ( 'Int64' ) )
                    {
                    // InternalCommunicationObject.g:989:2: ( ( 'Int64' ) )
                    // InternalCommunicationObject.g:990:3: ( 'Int64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 
                    // InternalCommunicationObject.g:991:3: ( 'Int64' )
                    // InternalCommunicationObject.g:991:4: 'Int64'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCommunicationObject.g:995:2: ( ( 'UInt8' ) )
                    {
                    // InternalCommunicationObject.g:995:2: ( ( 'UInt8' ) )
                    // InternalCommunicationObject.g:996:3: ( 'UInt8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 
                    // InternalCommunicationObject.g:997:3: ( 'UInt8' )
                    // InternalCommunicationObject.g:997:4: 'UInt8'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCommunicationObject.g:1001:2: ( ( 'UInt16' ) )
                    {
                    // InternalCommunicationObject.g:1001:2: ( ( 'UInt16' ) )
                    // InternalCommunicationObject.g:1002:3: ( 'UInt16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 
                    // InternalCommunicationObject.g:1003:3: ( 'UInt16' )
                    // InternalCommunicationObject.g:1003:4: 'UInt16'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCommunicationObject.g:1007:2: ( ( 'UInt32' ) )
                    {
                    // InternalCommunicationObject.g:1007:2: ( ( 'UInt32' ) )
                    // InternalCommunicationObject.g:1008:3: ( 'UInt32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 
                    // InternalCommunicationObject.g:1009:3: ( 'UInt32' )
                    // InternalCommunicationObject.g:1009:4: 'UInt32'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCommunicationObject.g:1013:2: ( ( 'UInt64' ) )
                    {
                    // InternalCommunicationObject.g:1013:2: ( ( 'UInt64' ) )
                    // InternalCommunicationObject.g:1014:3: ( 'UInt64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 
                    // InternalCommunicationObject.g:1015:3: ( 'UInt64' )
                    // InternalCommunicationObject.g:1015:4: 'UInt64'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCommunicationObject.g:1019:2: ( ( 'Float' ) )
                    {
                    // InternalCommunicationObject.g:1019:2: ( ( 'Float' ) )
                    // InternalCommunicationObject.g:1020:3: ( 'Float' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 
                    // InternalCommunicationObject.g:1021:3: ( 'Float' )
                    // InternalCommunicationObject.g:1021:4: 'Float'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCommunicationObject.g:1025:2: ( ( 'Double' ) )
                    {
                    // InternalCommunicationObject.g:1025:2: ( ( 'Double' ) )
                    // InternalCommunicationObject.g:1026:3: ( 'Double' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 
                    // InternalCommunicationObject.g:1027:3: ( 'Double' )
                    // InternalCommunicationObject.g:1027:4: 'Double'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCommunicationObject.g:1031:2: ( ( 'String' ) )
                    {
                    // InternalCommunicationObject.g:1031:2: ( ( 'String' ) )
                    // InternalCommunicationObject.g:1032:3: ( 'String' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 
                    // InternalCommunicationObject.g:1033:3: ( 'String' )
                    // InternalCommunicationObject.g:1033:4: 'String'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalCommunicationObject.g:1037:2: ( ( 'Boolean' ) )
                    {
                    // InternalCommunicationObject.g:1037:2: ( ( 'Boolean' ) )
                    // InternalCommunicationObject.g:1038:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); 
                    // InternalCommunicationObject.g:1039:3: ( 'Boolean' )
                    // InternalCommunicationObject.g:1039:4: 'Boolean'
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


    // $ANTLR start "rule__CommObjectModel__Group__0"
    // InternalCommunicationObject.g:1047:1: rule__CommObjectModel__Group__0 : rule__CommObjectModel__Group__0__Impl rule__CommObjectModel__Group__1 ;
    public final void rule__CommObjectModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1051:1: ( rule__CommObjectModel__Group__0__Impl rule__CommObjectModel__Group__1 )
            // InternalCommunicationObject.g:1052:2: rule__CommObjectModel__Group__0__Impl rule__CommObjectModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CommObjectModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectModel__Group__0"


    // $ANTLR start "rule__CommObjectModel__Group__0__Impl"
    // InternalCommunicationObject.g:1059:1: rule__CommObjectModel__Group__0__Impl : ( ( rule__CommObjectModel__ImportsAssignment_0 )* ) ;
    public final void rule__CommObjectModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1063:1: ( ( ( rule__CommObjectModel__ImportsAssignment_0 )* ) )
            // InternalCommunicationObject.g:1064:1: ( ( rule__CommObjectModel__ImportsAssignment_0 )* )
            {
            // InternalCommunicationObject.g:1064:1: ( ( rule__CommObjectModel__ImportsAssignment_0 )* )
            // InternalCommunicationObject.g:1065:2: ( rule__CommObjectModel__ImportsAssignment_0 )*
            {
             before(grammarAccess.getCommObjectModelAccess().getImportsAssignment_0()); 
            // InternalCommunicationObject.g:1066:2: ( rule__CommObjectModel__ImportsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCommunicationObject.g:1066:3: rule__CommObjectModel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CommObjectModel__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCommObjectModelAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectModel__Group__0__Impl"


    // $ANTLR start "rule__CommObjectModel__Group__1"
    // InternalCommunicationObject.g:1074:1: rule__CommObjectModel__Group__1 : rule__CommObjectModel__Group__1__Impl ;
    public final void rule__CommObjectModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1078:1: ( rule__CommObjectModel__Group__1__Impl )
            // InternalCommunicationObject.g:1079:2: rule__CommObjectModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectModel__Group__1"


    // $ANTLR start "rule__CommObjectModel__Group__1__Impl"
    // InternalCommunicationObject.g:1085:1: rule__CommObjectModel__Group__1__Impl : ( ( rule__CommObjectModel__RepositoryAssignment_1 )? ) ;
    public final void rule__CommObjectModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1089:1: ( ( ( rule__CommObjectModel__RepositoryAssignment_1 )? ) )
            // InternalCommunicationObject.g:1090:1: ( ( rule__CommObjectModel__RepositoryAssignment_1 )? )
            {
            // InternalCommunicationObject.g:1090:1: ( ( rule__CommObjectModel__RepositoryAssignment_1 )? )
            // InternalCommunicationObject.g:1091:2: ( rule__CommObjectModel__RepositoryAssignment_1 )?
            {
             before(grammarAccess.getCommObjectModelAccess().getRepositoryAssignment_1()); 
            // InternalCommunicationObject.g:1092:2: ( rule__CommObjectModel__RepositoryAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCommunicationObject.g:1092:3: rule__CommObjectModel__RepositoryAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommObjectModel__RepositoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommObjectModelAccess().getRepositoryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectModel__Group__1__Impl"


    // $ANTLR start "rule__FQNW__Group__0"
    // InternalCommunicationObject.g:1101:1: rule__FQNW__Group__0 : rule__FQNW__Group__0__Impl rule__FQNW__Group__1 ;
    public final void rule__FQNW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1105:1: ( rule__FQNW__Group__0__Impl rule__FQNW__Group__1 )
            // InternalCommunicationObject.g:1106:2: rule__FQNW__Group__0__Impl rule__FQNW__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCommunicationObject.g:1113:1: rule__FQNW__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1117:1: ( ( ruleFQN ) )
            // InternalCommunicationObject.g:1118:1: ( ruleFQN )
            {
            // InternalCommunicationObject.g:1118:1: ( ruleFQN )
            // InternalCommunicationObject.g:1119:2: ruleFQN
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
    // InternalCommunicationObject.g:1128:1: rule__FQNW__Group__1 : rule__FQNW__Group__1__Impl ;
    public final void rule__FQNW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1132:1: ( rule__FQNW__Group__1__Impl )
            // InternalCommunicationObject.g:1133:2: rule__FQNW__Group__1__Impl
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
    // InternalCommunicationObject.g:1139:1: rule__FQNW__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FQNW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1143:1: ( ( ( '.*' )? ) )
            // InternalCommunicationObject.g:1144:1: ( ( '.*' )? )
            {
            // InternalCommunicationObject.g:1144:1: ( ( '.*' )? )
            // InternalCommunicationObject.g:1145:2: ( '.*' )?
            {
             before(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); 
            // InternalCommunicationObject.g:1146:2: ( '.*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCommunicationObject.g:1146:3: '.*'
                    {
                    match(input,28,FOLLOW_2); 

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


    // $ANTLR start "rule__CommRepositoryImport__Group__0"
    // InternalCommunicationObject.g:1155:1: rule__CommRepositoryImport__Group__0 : rule__CommRepositoryImport__Group__0__Impl rule__CommRepositoryImport__Group__1 ;
    public final void rule__CommRepositoryImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1159:1: ( rule__CommRepositoryImport__Group__0__Impl rule__CommRepositoryImport__Group__1 )
            // InternalCommunicationObject.g:1160:2: rule__CommRepositoryImport__Group__0__Impl rule__CommRepositoryImport__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CommRepositoryImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommRepositoryImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepositoryImport__Group__0"


    // $ANTLR start "rule__CommRepositoryImport__Group__0__Impl"
    // InternalCommunicationObject.g:1167:1: rule__CommRepositoryImport__Group__0__Impl : ( '#import' ) ;
    public final void rule__CommRepositoryImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1171:1: ( ( '#import' ) )
            // InternalCommunicationObject.g:1172:1: ( '#import' )
            {
            // InternalCommunicationObject.g:1172:1: ( '#import' )
            // InternalCommunicationObject.g:1173:2: '#import'
            {
             before(grammarAccess.getCommRepositoryImportAccess().getImportKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCommRepositoryImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepositoryImport__Group__0__Impl"


    // $ANTLR start "rule__CommRepositoryImport__Group__1"
    // InternalCommunicationObject.g:1182:1: rule__CommRepositoryImport__Group__1 : rule__CommRepositoryImport__Group__1__Impl rule__CommRepositoryImport__Group__2 ;
    public final void rule__CommRepositoryImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1186:1: ( rule__CommRepositoryImport__Group__1__Impl rule__CommRepositoryImport__Group__2 )
            // InternalCommunicationObject.g:1187:2: rule__CommRepositoryImport__Group__1__Impl rule__CommRepositoryImport__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__CommRepositoryImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommRepositoryImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepositoryImport__Group__1"


    // $ANTLR start "rule__CommRepositoryImport__Group__1__Impl"
    // InternalCommunicationObject.g:1194:1: rule__CommRepositoryImport__Group__1__Impl : ( ( rule__CommRepositoryImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__CommRepositoryImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1198:1: ( ( ( rule__CommRepositoryImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalCommunicationObject.g:1199:1: ( ( rule__CommRepositoryImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalCommunicationObject.g:1199:1: ( ( rule__CommRepositoryImport__ImportedNamespaceAssignment_1 ) )
            // InternalCommunicationObject.g:1200:2: ( rule__CommRepositoryImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getCommRepositoryImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalCommunicationObject.g:1201:2: ( rule__CommRepositoryImport__ImportedNamespaceAssignment_1 )
            // InternalCommunicationObject.g:1201:3: rule__CommRepositoryImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommRepositoryImport__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommRepositoryImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepositoryImport__Group__1__Impl"


    // $ANTLR start "rule__CommRepositoryImport__Group__2"
    // InternalCommunicationObject.g:1209:1: rule__CommRepositoryImport__Group__2 : rule__CommRepositoryImport__Group__2__Impl ;
    public final void rule__CommRepositoryImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1213:1: ( rule__CommRepositoryImport__Group__2__Impl )
            // InternalCommunicationObject.g:1214:2: rule__CommRepositoryImport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommRepositoryImport__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepositoryImport__Group__2"


    // $ANTLR start "rule__CommRepositoryImport__Group__2__Impl"
    // InternalCommunicationObject.g:1220:1: rule__CommRepositoryImport__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__CommRepositoryImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1224:1: ( ( ( ';' )? ) )
            // InternalCommunicationObject.g:1225:1: ( ( ';' )? )
            {
            // InternalCommunicationObject.g:1225:1: ( ( ';' )? )
            // InternalCommunicationObject.g:1226:2: ( ';' )?
            {
             before(grammarAccess.getCommRepositoryImportAccess().getSemicolonKeyword_2()); 
            // InternalCommunicationObject.g:1227:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCommunicationObject.g:1227:3: ';'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCommRepositoryImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepositoryImport__Group__2__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group__0"
    // InternalCommunicationObject.g:1236:1: rule__CommObjectsRepository__Group__0 : rule__CommObjectsRepository__Group__0__Impl rule__CommObjectsRepository__Group__1 ;
    public final void rule__CommObjectsRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1240:1: ( rule__CommObjectsRepository__Group__0__Impl rule__CommObjectsRepository__Group__1 )
            // InternalCommunicationObject.g:1241:2: rule__CommObjectsRepository__Group__0__Impl rule__CommObjectsRepository__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CommObjectsRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__0"


    // $ANTLR start "rule__CommObjectsRepository__Group__0__Impl"
    // InternalCommunicationObject.g:1248:1: rule__CommObjectsRepository__Group__0__Impl : ( 'CommObjectsRepository' ) ;
    public final void rule__CommObjectsRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1252:1: ( ( 'CommObjectsRepository' ) )
            // InternalCommunicationObject.g:1253:1: ( 'CommObjectsRepository' )
            {
            // InternalCommunicationObject.g:1253:1: ( 'CommObjectsRepository' )
            // InternalCommunicationObject.g:1254:2: 'CommObjectsRepository'
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getCommObjectsRepositoryKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getCommObjectsRepositoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__0__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group__1"
    // InternalCommunicationObject.g:1263:1: rule__CommObjectsRepository__Group__1 : rule__CommObjectsRepository__Group__1__Impl rule__CommObjectsRepository__Group__2 ;
    public final void rule__CommObjectsRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1267:1: ( rule__CommObjectsRepository__Group__1__Impl rule__CommObjectsRepository__Group__2 )
            // InternalCommunicationObject.g:1268:2: rule__CommObjectsRepository__Group__1__Impl rule__CommObjectsRepository__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CommObjectsRepository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__1"


    // $ANTLR start "rule__CommObjectsRepository__Group__1__Impl"
    // InternalCommunicationObject.g:1275:1: rule__CommObjectsRepository__Group__1__Impl : ( ( rule__CommObjectsRepository__NameAssignment_1 ) ) ;
    public final void rule__CommObjectsRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1279:1: ( ( ( rule__CommObjectsRepository__NameAssignment_1 ) ) )
            // InternalCommunicationObject.g:1280:1: ( ( rule__CommObjectsRepository__NameAssignment_1 ) )
            {
            // InternalCommunicationObject.g:1280:1: ( ( rule__CommObjectsRepository__NameAssignment_1 ) )
            // InternalCommunicationObject.g:1281:2: ( rule__CommObjectsRepository__NameAssignment_1 )
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getNameAssignment_1()); 
            // InternalCommunicationObject.g:1282:2: ( rule__CommObjectsRepository__NameAssignment_1 )
            // InternalCommunicationObject.g:1282:3: rule__CommObjectsRepository__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__1__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group__2"
    // InternalCommunicationObject.g:1290:1: rule__CommObjectsRepository__Group__2 : rule__CommObjectsRepository__Group__2__Impl rule__CommObjectsRepository__Group__3 ;
    public final void rule__CommObjectsRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1294:1: ( rule__CommObjectsRepository__Group__2__Impl rule__CommObjectsRepository__Group__3 )
            // InternalCommunicationObject.g:1295:2: rule__CommObjectsRepository__Group__2__Impl rule__CommObjectsRepository__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__CommObjectsRepository__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__2"


    // $ANTLR start "rule__CommObjectsRepository__Group__2__Impl"
    // InternalCommunicationObject.g:1302:1: rule__CommObjectsRepository__Group__2__Impl : ( ( rule__CommObjectsRepository__Group_2__0 )? ) ;
    public final void rule__CommObjectsRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1306:1: ( ( ( rule__CommObjectsRepository__Group_2__0 )? ) )
            // InternalCommunicationObject.g:1307:1: ( ( rule__CommObjectsRepository__Group_2__0 )? )
            {
            // InternalCommunicationObject.g:1307:1: ( ( rule__CommObjectsRepository__Group_2__0 )? )
            // InternalCommunicationObject.g:1308:2: ( rule__CommObjectsRepository__Group_2__0 )?
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getGroup_2()); 
            // InternalCommunicationObject.g:1309:2: ( rule__CommObjectsRepository__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCommunicationObject.g:1309:3: rule__CommObjectsRepository__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommObjectsRepository__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__2__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group__3"
    // InternalCommunicationObject.g:1317:1: rule__CommObjectsRepository__Group__3 : rule__CommObjectsRepository__Group__3__Impl rule__CommObjectsRepository__Group__4 ;
    public final void rule__CommObjectsRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1321:1: ( rule__CommObjectsRepository__Group__3__Impl rule__CommObjectsRepository__Group__4 )
            // InternalCommunicationObject.g:1322:2: rule__CommObjectsRepository__Group__3__Impl rule__CommObjectsRepository__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__CommObjectsRepository__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__3"


    // $ANTLR start "rule__CommObjectsRepository__Group__3__Impl"
    // InternalCommunicationObject.g:1329:1: rule__CommObjectsRepository__Group__3__Impl : ( '{' ) ;
    public final void rule__CommObjectsRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1333:1: ( ( '{' ) )
            // InternalCommunicationObject.g:1334:1: ( '{' )
            {
            // InternalCommunicationObject.g:1334:1: ( '{' )
            // InternalCommunicationObject.g:1335:2: '{'
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__3__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group__4"
    // InternalCommunicationObject.g:1344:1: rule__CommObjectsRepository__Group__4 : rule__CommObjectsRepository__Group__4__Impl rule__CommObjectsRepository__Group__5 ;
    public final void rule__CommObjectsRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1348:1: ( rule__CommObjectsRepository__Group__4__Impl rule__CommObjectsRepository__Group__5 )
            // InternalCommunicationObject.g:1349:2: rule__CommObjectsRepository__Group__4__Impl rule__CommObjectsRepository__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__CommObjectsRepository__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__4"


    // $ANTLR start "rule__CommObjectsRepository__Group__4__Impl"
    // InternalCommunicationObject.g:1356:1: rule__CommObjectsRepository__Group__4__Impl : ( ( rule__CommObjectsRepository__Group_4__0 )? ) ;
    public final void rule__CommObjectsRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1360:1: ( ( ( rule__CommObjectsRepository__Group_4__0 )? ) )
            // InternalCommunicationObject.g:1361:1: ( ( rule__CommObjectsRepository__Group_4__0 )? )
            {
            // InternalCommunicationObject.g:1361:1: ( ( rule__CommObjectsRepository__Group_4__0 )? )
            // InternalCommunicationObject.g:1362:2: ( rule__CommObjectsRepository__Group_4__0 )?
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getGroup_4()); 
            // InternalCommunicationObject.g:1363:2: ( rule__CommObjectsRepository__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCommunicationObject.g:1363:3: rule__CommObjectsRepository__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommObjectsRepository__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__4__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group__5"
    // InternalCommunicationObject.g:1371:1: rule__CommObjectsRepository__Group__5 : rule__CommObjectsRepository__Group__5__Impl rule__CommObjectsRepository__Group__6 ;
    public final void rule__CommObjectsRepository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1375:1: ( rule__CommObjectsRepository__Group__5__Impl rule__CommObjectsRepository__Group__6 )
            // InternalCommunicationObject.g:1376:2: rule__CommObjectsRepository__Group__5__Impl rule__CommObjectsRepository__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__CommObjectsRepository__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__5"


    // $ANTLR start "rule__CommObjectsRepository__Group__5__Impl"
    // InternalCommunicationObject.g:1383:1: rule__CommObjectsRepository__Group__5__Impl : ( ( rule__CommObjectsRepository__ElementsAssignment_5 )* ) ;
    public final void rule__CommObjectsRepository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1387:1: ( ( ( rule__CommObjectsRepository__ElementsAssignment_5 )* ) )
            // InternalCommunicationObject.g:1388:1: ( ( rule__CommObjectsRepository__ElementsAssignment_5 )* )
            {
            // InternalCommunicationObject.g:1388:1: ( ( rule__CommObjectsRepository__ElementsAssignment_5 )* )
            // InternalCommunicationObject.g:1389:2: ( rule__CommObjectsRepository__ElementsAssignment_5 )*
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getElementsAssignment_5()); 
            // InternalCommunicationObject.g:1390:2: ( rule__CommObjectsRepository__ElementsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=37 && LA17_0<=38)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCommunicationObject.g:1390:3: rule__CommObjectsRepository__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CommObjectsRepository__ElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCommObjectsRepositoryAccess().getElementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__5__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group__6"
    // InternalCommunicationObject.g:1398:1: rule__CommObjectsRepository__Group__6 : rule__CommObjectsRepository__Group__6__Impl ;
    public final void rule__CommObjectsRepository__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1402:1: ( rule__CommObjectsRepository__Group__6__Impl )
            // InternalCommunicationObject.g:1403:2: rule__CommObjectsRepository__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__6"


    // $ANTLR start "rule__CommObjectsRepository__Group__6__Impl"
    // InternalCommunicationObject.g:1409:1: rule__CommObjectsRepository__Group__6__Impl : ( '}' ) ;
    public final void rule__CommObjectsRepository__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1413:1: ( ( '}' ) )
            // InternalCommunicationObject.g:1414:1: ( '}' )
            {
            // InternalCommunicationObject.g:1414:1: ( '}' )
            // InternalCommunicationObject.g:1415:2: '}'
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__6__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group_2__0"
    // InternalCommunicationObject.g:1425:1: rule__CommObjectsRepository__Group_2__0 : rule__CommObjectsRepository__Group_2__0__Impl rule__CommObjectsRepository__Group_2__1 ;
    public final void rule__CommObjectsRepository__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1429:1: ( rule__CommObjectsRepository__Group_2__0__Impl rule__CommObjectsRepository__Group_2__1 )
            // InternalCommunicationObject.g:1430:2: rule__CommObjectsRepository__Group_2__0__Impl rule__CommObjectsRepository__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__CommObjectsRepository__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_2__0"


    // $ANTLR start "rule__CommObjectsRepository__Group_2__0__Impl"
    // InternalCommunicationObject.g:1437:1: rule__CommObjectsRepository__Group_2__0__Impl : ( 'version' ) ;
    public final void rule__CommObjectsRepository__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1441:1: ( ( 'version' ) )
            // InternalCommunicationObject.g:1442:1: ( 'version' )
            {
            // InternalCommunicationObject.g:1442:1: ( 'version' )
            // InternalCommunicationObject.g:1443:2: 'version'
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getVersionKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getVersionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_2__0__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group_2__1"
    // InternalCommunicationObject.g:1452:1: rule__CommObjectsRepository__Group_2__1 : rule__CommObjectsRepository__Group_2__1__Impl ;
    public final void rule__CommObjectsRepository__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1456:1: ( rule__CommObjectsRepository__Group_2__1__Impl )
            // InternalCommunicationObject.g:1457:2: rule__CommObjectsRepository__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_2__1"


    // $ANTLR start "rule__CommObjectsRepository__Group_2__1__Impl"
    // InternalCommunicationObject.g:1463:1: rule__CommObjectsRepository__Group_2__1__Impl : ( ( rule__CommObjectsRepository__VersionAssignment_2_1 ) ) ;
    public final void rule__CommObjectsRepository__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1467:1: ( ( ( rule__CommObjectsRepository__VersionAssignment_2_1 ) ) )
            // InternalCommunicationObject.g:1468:1: ( ( rule__CommObjectsRepository__VersionAssignment_2_1 ) )
            {
            // InternalCommunicationObject.g:1468:1: ( ( rule__CommObjectsRepository__VersionAssignment_2_1 ) )
            // InternalCommunicationObject.g:1469:2: ( rule__CommObjectsRepository__VersionAssignment_2_1 )
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getVersionAssignment_2_1()); 
            // InternalCommunicationObject.g:1470:2: ( rule__CommObjectsRepository__VersionAssignment_2_1 )
            // InternalCommunicationObject.g:1470:3: rule__CommObjectsRepository__VersionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__VersionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getVersionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_2__1__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group_4__0"
    // InternalCommunicationObject.g:1479:1: rule__CommObjectsRepository__Group_4__0 : rule__CommObjectsRepository__Group_4__0__Impl rule__CommObjectsRepository__Group_4__1 ;
    public final void rule__CommObjectsRepository__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1483:1: ( rule__CommObjectsRepository__Group_4__0__Impl rule__CommObjectsRepository__Group_4__1 )
            // InternalCommunicationObject.g:1484:2: rule__CommObjectsRepository__Group_4__0__Impl rule__CommObjectsRepository__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__CommObjectsRepository__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_4__0"


    // $ANTLR start "rule__CommObjectsRepository__Group_4__0__Impl"
    // InternalCommunicationObject.g:1491:1: rule__CommObjectsRepository__Group_4__0__Impl : ( 'Dependency' ) ;
    public final void rule__CommObjectsRepository__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1495:1: ( ( 'Dependency' ) )
            // InternalCommunicationObject.g:1496:1: ( 'Dependency' )
            {
            // InternalCommunicationObject.g:1496:1: ( 'Dependency' )
            // InternalCommunicationObject.g:1497:2: 'Dependency'
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getDependencyKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getDependencyKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_4__0__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group_4__1"
    // InternalCommunicationObject.g:1506:1: rule__CommObjectsRepository__Group_4__1 : rule__CommObjectsRepository__Group_4__1__Impl rule__CommObjectsRepository__Group_4__2 ;
    public final void rule__CommObjectsRepository__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1510:1: ( rule__CommObjectsRepository__Group_4__1__Impl rule__CommObjectsRepository__Group_4__2 )
            // InternalCommunicationObject.g:1511:2: rule__CommObjectsRepository__Group_4__1__Impl rule__CommObjectsRepository__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__CommObjectsRepository__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_4__1"


    // $ANTLR start "rule__CommObjectsRepository__Group_4__1__Impl"
    // InternalCommunicationObject.g:1518:1: rule__CommObjectsRepository__Group_4__1__Impl : ( ( rule__CommObjectsRepository__DependencyAssignment_4_1 ) ) ;
    public final void rule__CommObjectsRepository__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1522:1: ( ( ( rule__CommObjectsRepository__DependencyAssignment_4_1 ) ) )
            // InternalCommunicationObject.g:1523:1: ( ( rule__CommObjectsRepository__DependencyAssignment_4_1 ) )
            {
            // InternalCommunicationObject.g:1523:1: ( ( rule__CommObjectsRepository__DependencyAssignment_4_1 ) )
            // InternalCommunicationObject.g:1524:2: ( rule__CommObjectsRepository__DependencyAssignment_4_1 )
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getDependencyAssignment_4_1()); 
            // InternalCommunicationObject.g:1525:2: ( rule__CommObjectsRepository__DependencyAssignment_4_1 )
            // InternalCommunicationObject.g:1525:3: rule__CommObjectsRepository__DependencyAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__DependencyAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getDependencyAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_4__1__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group_4__2"
    // InternalCommunicationObject.g:1533:1: rule__CommObjectsRepository__Group_4__2 : rule__CommObjectsRepository__Group_4__2__Impl ;
    public final void rule__CommObjectsRepository__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1537:1: ( rule__CommObjectsRepository__Group_4__2__Impl )
            // InternalCommunicationObject.g:1538:2: rule__CommObjectsRepository__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_4__2"


    // $ANTLR start "rule__CommObjectsRepository__Group_4__2__Impl"
    // InternalCommunicationObject.g:1544:1: rule__CommObjectsRepository__Group_4__2__Impl : ( ( ';' )? ) ;
    public final void rule__CommObjectsRepository__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1548:1: ( ( ( ';' )? ) )
            // InternalCommunicationObject.g:1549:1: ( ( ';' )? )
            {
            // InternalCommunicationObject.g:1549:1: ( ( ';' )? )
            // InternalCommunicationObject.g:1550:2: ( ';' )?
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getSemicolonKeyword_4_2()); 
            // InternalCommunicationObject.g:1551:2: ( ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCommunicationObject.g:1551:3: ';'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_4__2__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // InternalCommunicationObject.g:1560:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1564:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalCommunicationObject.g:1565:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // InternalCommunicationObject.g:1572:1: rule__Version__Group__0__Impl : ( ( rule__Version__MajorAssignment_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1576:1: ( ( ( rule__Version__MajorAssignment_0 ) ) )
            // InternalCommunicationObject.g:1577:1: ( ( rule__Version__MajorAssignment_0 ) )
            {
            // InternalCommunicationObject.g:1577:1: ( ( rule__Version__MajorAssignment_0 ) )
            // InternalCommunicationObject.g:1578:2: ( rule__Version__MajorAssignment_0 )
            {
             before(grammarAccess.getVersionAccess().getMajorAssignment_0()); 
            // InternalCommunicationObject.g:1579:2: ( rule__Version__MajorAssignment_0 )
            // InternalCommunicationObject.g:1579:3: rule__Version__MajorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Version__MajorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getMajorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // InternalCommunicationObject.g:1587:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1591:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalCommunicationObject.g:1592:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // InternalCommunicationObject.g:1599:1: rule__Version__Group__1__Impl : ( '.' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1603:1: ( ( '.' ) )
            // InternalCommunicationObject.g:1604:1: ( '.' )
            {
            // InternalCommunicationObject.g:1604:1: ( '.' )
            // InternalCommunicationObject.g:1605:2: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__2"
    // InternalCommunicationObject.g:1614:1: rule__Version__Group__2 : rule__Version__Group__2__Impl rule__Version__Group__3 ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1618:1: ( rule__Version__Group__2__Impl rule__Version__Group__3 )
            // InternalCommunicationObject.g:1619:2: rule__Version__Group__2__Impl rule__Version__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Version__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2"


    // $ANTLR start "rule__Version__Group__2__Impl"
    // InternalCommunicationObject.g:1626:1: rule__Version__Group__2__Impl : ( ( rule__Version__MinorAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1630:1: ( ( ( rule__Version__MinorAssignment_2 ) ) )
            // InternalCommunicationObject.g:1631:1: ( ( rule__Version__MinorAssignment_2 ) )
            {
            // InternalCommunicationObject.g:1631:1: ( ( rule__Version__MinorAssignment_2 ) )
            // InternalCommunicationObject.g:1632:2: ( rule__Version__MinorAssignment_2 )
            {
             before(grammarAccess.getVersionAccess().getMinorAssignment_2()); 
            // InternalCommunicationObject.g:1633:2: ( rule__Version__MinorAssignment_2 )
            // InternalCommunicationObject.g:1633:3: rule__Version__MinorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Version__MinorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getMinorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2__Impl"


    // $ANTLR start "rule__Version__Group__3"
    // InternalCommunicationObject.g:1641:1: rule__Version__Group__3 : rule__Version__Group__3__Impl ;
    public final void rule__Version__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1645:1: ( rule__Version__Group__3__Impl )
            // InternalCommunicationObject.g:1646:2: rule__Version__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__3"


    // $ANTLR start "rule__Version__Group__3__Impl"
    // InternalCommunicationObject.g:1652:1: rule__Version__Group__3__Impl : ( ( rule__Version__Group_3__0 )? ) ;
    public final void rule__Version__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1656:1: ( ( ( rule__Version__Group_3__0 )? ) )
            // InternalCommunicationObject.g:1657:1: ( ( rule__Version__Group_3__0 )? )
            {
            // InternalCommunicationObject.g:1657:1: ( ( rule__Version__Group_3__0 )? )
            // InternalCommunicationObject.g:1658:2: ( rule__Version__Group_3__0 )?
            {
             before(grammarAccess.getVersionAccess().getGroup_3()); 
            // InternalCommunicationObject.g:1659:2: ( rule__Version__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCommunicationObject.g:1659:3: rule__Version__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Version__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVersionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__3__Impl"


    // $ANTLR start "rule__Version__Group_3__0"
    // InternalCommunicationObject.g:1668:1: rule__Version__Group_3__0 : rule__Version__Group_3__0__Impl rule__Version__Group_3__1 ;
    public final void rule__Version__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1672:1: ( rule__Version__Group_3__0__Impl rule__Version__Group_3__1 )
            // InternalCommunicationObject.g:1673:2: rule__Version__Group_3__0__Impl rule__Version__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Version__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_3__0"


    // $ANTLR start "rule__Version__Group_3__0__Impl"
    // InternalCommunicationObject.g:1680:1: rule__Version__Group_3__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1684:1: ( ( '.' ) )
            // InternalCommunicationObject.g:1685:1: ( '.' )
            {
            // InternalCommunicationObject.g:1685:1: ( '.' )
            // InternalCommunicationObject.g:1686:2: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_3__0__Impl"


    // $ANTLR start "rule__Version__Group_3__1"
    // InternalCommunicationObject.g:1695:1: rule__Version__Group_3__1 : rule__Version__Group_3__1__Impl ;
    public final void rule__Version__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1699:1: ( rule__Version__Group_3__1__Impl )
            // InternalCommunicationObject.g:1700:2: rule__Version__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_3__1"


    // $ANTLR start "rule__Version__Group_3__1__Impl"
    // InternalCommunicationObject.g:1706:1: rule__Version__Group_3__1__Impl : ( ( rule__Version__PatchAssignment_3_1 ) ) ;
    public final void rule__Version__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1710:1: ( ( ( rule__Version__PatchAssignment_3_1 ) ) )
            // InternalCommunicationObject.g:1711:1: ( ( rule__Version__PatchAssignment_3_1 ) )
            {
            // InternalCommunicationObject.g:1711:1: ( ( rule__Version__PatchAssignment_3_1 ) )
            // InternalCommunicationObject.g:1712:2: ( rule__Version__PatchAssignment_3_1 )
            {
             before(grammarAccess.getVersionAccess().getPatchAssignment_3_1()); 
            // InternalCommunicationObject.g:1713:2: ( rule__Version__PatchAssignment_3_1 )
            // InternalCommunicationObject.g:1713:3: rule__Version__PatchAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Version__PatchAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getPatchAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group_3__1__Impl"


    // $ANTLR start "rule__CommunicationObject__Group__0"
    // InternalCommunicationObject.g:1722:1: rule__CommunicationObject__Group__0 : rule__CommunicationObject__Group__0__Impl rule__CommunicationObject__Group__1 ;
    public final void rule__CommunicationObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1726:1: ( rule__CommunicationObject__Group__0__Impl rule__CommunicationObject__Group__1 )
            // InternalCommunicationObject.g:1727:2: rule__CommunicationObject__Group__0__Impl rule__CommunicationObject__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CommunicationObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__Group__0"


    // $ANTLR start "rule__CommunicationObject__Group__0__Impl"
    // InternalCommunicationObject.g:1734:1: rule__CommunicationObject__Group__0__Impl : ( 'CommObject' ) ;
    public final void rule__CommunicationObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1738:1: ( ( 'CommObject' ) )
            // InternalCommunicationObject.g:1739:1: ( 'CommObject' )
            {
            // InternalCommunicationObject.g:1739:1: ( 'CommObject' )
            // InternalCommunicationObject.g:1740:2: 'CommObject'
            {
             before(grammarAccess.getCommunicationObjectAccess().getCommObjectKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCommunicationObjectAccess().getCommObjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__Group__0__Impl"


    // $ANTLR start "rule__CommunicationObject__Group__1"
    // InternalCommunicationObject.g:1749:1: rule__CommunicationObject__Group__1 : rule__CommunicationObject__Group__1__Impl rule__CommunicationObject__Group__2 ;
    public final void rule__CommunicationObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1753:1: ( rule__CommunicationObject__Group__1__Impl rule__CommunicationObject__Group__2 )
            // InternalCommunicationObject.g:1754:2: rule__CommunicationObject__Group__1__Impl rule__CommunicationObject__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__CommunicationObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__Group__1"


    // $ANTLR start "rule__CommunicationObject__Group__1__Impl"
    // InternalCommunicationObject.g:1761:1: rule__CommunicationObject__Group__1__Impl : ( ( rule__CommunicationObject__NameAssignment_1 ) ) ;
    public final void rule__CommunicationObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1765:1: ( ( ( rule__CommunicationObject__NameAssignment_1 ) ) )
            // InternalCommunicationObject.g:1766:1: ( ( rule__CommunicationObject__NameAssignment_1 ) )
            {
            // InternalCommunicationObject.g:1766:1: ( ( rule__CommunicationObject__NameAssignment_1 ) )
            // InternalCommunicationObject.g:1767:2: ( rule__CommunicationObject__NameAssignment_1 )
            {
             before(grammarAccess.getCommunicationObjectAccess().getNameAssignment_1()); 
            // InternalCommunicationObject.g:1768:2: ( rule__CommunicationObject__NameAssignment_1 )
            // InternalCommunicationObject.g:1768:3: rule__CommunicationObject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationObject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationObjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__Group__1__Impl"


    // $ANTLR start "rule__CommunicationObject__Group__2"
    // InternalCommunicationObject.g:1776:1: rule__CommunicationObject__Group__2 : rule__CommunicationObject__Group__2__Impl rule__CommunicationObject__Group__3 ;
    public final void rule__CommunicationObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1780:1: ( rule__CommunicationObject__Group__2__Impl rule__CommunicationObject__Group__3 )
            // InternalCommunicationObject.g:1781:2: rule__CommunicationObject__Group__2__Impl rule__CommunicationObject__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__CommunicationObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__Group__2"


    // $ANTLR start "rule__CommunicationObject__Group__2__Impl"
    // InternalCommunicationObject.g:1788:1: rule__CommunicationObject__Group__2__Impl : ( '{' ) ;
    public final void rule__CommunicationObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1792:1: ( ( '{' ) )
            // InternalCommunicationObject.g:1793:1: ( '{' )
            {
            // InternalCommunicationObject.g:1793:1: ( '{' )
            // InternalCommunicationObject.g:1794:2: '{'
            {
             before(grammarAccess.getCommunicationObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCommunicationObjectAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__Group__2__Impl"


    // $ANTLR start "rule__CommunicationObject__Group__3"
    // InternalCommunicationObject.g:1803:1: rule__CommunicationObject__Group__3 : rule__CommunicationObject__Group__3__Impl rule__CommunicationObject__Group__4 ;
    public final void rule__CommunicationObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1807:1: ( rule__CommunicationObject__Group__3__Impl rule__CommunicationObject__Group__4 )
            // InternalCommunicationObject.g:1808:2: rule__CommunicationObject__Group__3__Impl rule__CommunicationObject__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__CommunicationObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationObject__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__Group__3"


    // $ANTLR start "rule__CommunicationObject__Group__3__Impl"
    // InternalCommunicationObject.g:1815:1: rule__CommunicationObject__Group__3__Impl : ( ( rule__CommunicationObject__AttributesAssignment_3 )* ) ;
    public final void rule__CommunicationObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1819:1: ( ( ( rule__CommunicationObject__AttributesAssignment_3 )* ) )
            // InternalCommunicationObject.g:1820:1: ( ( rule__CommunicationObject__AttributesAssignment_3 )* )
            {
            // InternalCommunicationObject.g:1820:1: ( ( rule__CommunicationObject__AttributesAssignment_3 )* )
            // InternalCommunicationObject.g:1821:2: ( rule__CommunicationObject__AttributesAssignment_3 )*
            {
             before(grammarAccess.getCommunicationObjectAccess().getAttributesAssignment_3()); 
            // InternalCommunicationObject.g:1822:2: ( rule__CommunicationObject__AttributesAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCommunicationObject.g:1822:3: rule__CommunicationObject__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__CommunicationObject__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCommunicationObjectAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__Group__3__Impl"


    // $ANTLR start "rule__CommunicationObject__Group__4"
    // InternalCommunicationObject.g:1830:1: rule__CommunicationObject__Group__4 : rule__CommunicationObject__Group__4__Impl ;
    public final void rule__CommunicationObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1834:1: ( rule__CommunicationObject__Group__4__Impl )
            // InternalCommunicationObject.g:1835:2: rule__CommunicationObject__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationObject__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__Group__4"


    // $ANTLR start "rule__CommunicationObject__Group__4__Impl"
    // InternalCommunicationObject.g:1841:1: rule__CommunicationObject__Group__4__Impl : ( '}' ) ;
    public final void rule__CommunicationObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1845:1: ( ( '}' ) )
            // InternalCommunicationObject.g:1846:1: ( '}' )
            {
            // InternalCommunicationObject.g:1846:1: ( '}' )
            // InternalCommunicationObject.g:1847:2: '}'
            {
             before(grammarAccess.getCommunicationObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCommunicationObjectAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalCommunicationObject.g:1857:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1861:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalCommunicationObject.g:1862:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalCommunicationObject.g:1869:1: rule__Enumeration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1873:1: ( ( 'Enumeration' ) )
            // InternalCommunicationObject.g:1874:1: ( 'Enumeration' )
            {
            // InternalCommunicationObject.g:1874:1: ( 'Enumeration' )
            // InternalCommunicationObject.g:1875:2: 'Enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalCommunicationObject.g:1884:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1888:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalCommunicationObject.g:1889:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalCommunicationObject.g:1896:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1900:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalCommunicationObject.g:1901:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalCommunicationObject.g:1901:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalCommunicationObject.g:1902:2: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalCommunicationObject.g:1903:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalCommunicationObject.g:1903:3: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalCommunicationObject.g:1911:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1915:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalCommunicationObject.g:1916:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalCommunicationObject.g:1923:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1927:1: ( ( '{' ) )
            // InternalCommunicationObject.g:1928:1: ( '{' )
            {
            // InternalCommunicationObject.g:1928:1: ( '{' )
            // InternalCommunicationObject.g:1929:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalCommunicationObject.g:1938:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1942:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalCommunicationObject.g:1943:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalCommunicationObject.g:1950:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__EnumsAssignment_3 )* ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1954:1: ( ( ( rule__Enumeration__EnumsAssignment_3 )* ) )
            // InternalCommunicationObject.g:1955:1: ( ( rule__Enumeration__EnumsAssignment_3 )* )
            {
            // InternalCommunicationObject.g:1955:1: ( ( rule__Enumeration__EnumsAssignment_3 )* )
            // InternalCommunicationObject.g:1956:2: ( rule__Enumeration__EnumsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getEnumsAssignment_3()); 
            // InternalCommunicationObject.g:1957:2: ( rule__Enumeration__EnumsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCommunicationObject.g:1957:3: rule__Enumeration__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Enumeration__EnumsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getEnumsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalCommunicationObject.g:1965:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1969:1: ( rule__Enumeration__Group__4__Impl )
            // InternalCommunicationObject.g:1970:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalCommunicationObject.g:1976:1: rule__Enumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1980:1: ( ( '}' ) )
            // InternalCommunicationObject.g:1981:1: ( '}' )
            {
            // InternalCommunicationObject.g:1981:1: ( '}' )
            // InternalCommunicationObject.g:1982:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__CommElementReference__Group__0"
    // InternalCommunicationObject.g:1992:1: rule__CommElementReference__Group__0 : rule__CommElementReference__Group__0__Impl rule__CommElementReference__Group__1 ;
    public final void rule__CommElementReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1996:1: ( rule__CommElementReference__Group__0__Impl rule__CommElementReference__Group__1 )
            // InternalCommunicationObject.g:1997:2: rule__CommElementReference__Group__0__Impl rule__CommElementReference__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__CommElementReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommElementReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommElementReference__Group__0"


    // $ANTLR start "rule__CommElementReference__Group__0__Impl"
    // InternalCommunicationObject.g:2004:1: rule__CommElementReference__Group__0__Impl : ( ( rule__CommElementReference__TypeNameAssignment_0 ) ) ;
    public final void rule__CommElementReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2008:1: ( ( ( rule__CommElementReference__TypeNameAssignment_0 ) ) )
            // InternalCommunicationObject.g:2009:1: ( ( rule__CommElementReference__TypeNameAssignment_0 ) )
            {
            // InternalCommunicationObject.g:2009:1: ( ( rule__CommElementReference__TypeNameAssignment_0 ) )
            // InternalCommunicationObject.g:2010:2: ( rule__CommElementReference__TypeNameAssignment_0 )
            {
             before(grammarAccess.getCommElementReferenceAccess().getTypeNameAssignment_0()); 
            // InternalCommunicationObject.g:2011:2: ( rule__CommElementReference__TypeNameAssignment_0 )
            // InternalCommunicationObject.g:2011:3: rule__CommElementReference__TypeNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CommElementReference__TypeNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommElementReferenceAccess().getTypeNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommElementReference__Group__0__Impl"


    // $ANTLR start "rule__CommElementReference__Group__1"
    // InternalCommunicationObject.g:2019:1: rule__CommElementReference__Group__1 : rule__CommElementReference__Group__1__Impl ;
    public final void rule__CommElementReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2023:1: ( rule__CommElementReference__Group__1__Impl )
            // InternalCommunicationObject.g:2024:2: rule__CommElementReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommElementReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommElementReference__Group__1"


    // $ANTLR start "rule__CommElementReference__Group__1__Impl"
    // InternalCommunicationObject.g:2030:1: rule__CommElementReference__Group__1__Impl : ( ( rule__CommElementReference__ArrayAssignment_1 )? ) ;
    public final void rule__CommElementReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2034:1: ( ( ( rule__CommElementReference__ArrayAssignment_1 )? ) )
            // InternalCommunicationObject.g:2035:1: ( ( rule__CommElementReference__ArrayAssignment_1 )? )
            {
            // InternalCommunicationObject.g:2035:1: ( ( rule__CommElementReference__ArrayAssignment_1 )? )
            // InternalCommunicationObject.g:2036:2: ( rule__CommElementReference__ArrayAssignment_1 )?
            {
             before(grammarAccess.getCommElementReferenceAccess().getArrayAssignment_1()); 
            // InternalCommunicationObject.g:2037:2: ( rule__CommElementReference__ArrayAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCommunicationObject.g:2037:3: rule__CommElementReference__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommElementReference__ArrayAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommElementReferenceAccess().getArrayAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommElementReference__Group__1__Impl"


    // $ANTLR start "rule__SingleValue__Group_0__0"
    // InternalCommunicationObject.g:2046:1: rule__SingleValue__Group_0__0 : rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 ;
    public final void rule__SingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2050:1: ( rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 )
            // InternalCommunicationObject.g:2051:2: rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCommunicationObject.g:2058:1: rule__SingleValue__Group_0__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2062:1: ( ( () ) )
            // InternalCommunicationObject.g:2063:1: ( () )
            {
            // InternalCommunicationObject.g:2063:1: ( () )
            // InternalCommunicationObject.g:2064:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getCommElementValueAction_0_0()); 
            // InternalCommunicationObject.g:2065:2: ()
            // InternalCommunicationObject.g:2065:3: 
            {
            }

             after(grammarAccess.getSingleValueAccess().getCommElementValueAction_0_0()); 

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
    // InternalCommunicationObject.g:2073:1: rule__SingleValue__Group_0__1 : rule__SingleValue__Group_0__1__Impl rule__SingleValue__Group_0__2 ;
    public final void rule__SingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2077:1: ( rule__SingleValue__Group_0__1__Impl rule__SingleValue__Group_0__2 )
            // InternalCommunicationObject.g:2078:2: rule__SingleValue__Group_0__1__Impl rule__SingleValue__Group_0__2
            {
            pushFollow(FOLLOW_18);
            rule__SingleValue__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_0__2();

            state._fsp--;


            }

        }
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
    // InternalCommunicationObject.g:2085:1: rule__SingleValue__Group_0__1__Impl : ( ( rule__SingleValue__ValueAssignment_0_1 ) ) ;
    public final void rule__SingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2089:1: ( ( ( rule__SingleValue__ValueAssignment_0_1 ) ) )
            // InternalCommunicationObject.g:2090:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            {
            // InternalCommunicationObject.g:2090:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            // InternalCommunicationObject.g:2091:2: ( rule__SingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); 
            // InternalCommunicationObject.g:2092:2: ( rule__SingleValue__ValueAssignment_0_1 )
            // InternalCommunicationObject.g:2092:3: rule__SingleValue__ValueAssignment_0_1
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


    // $ANTLR start "rule__SingleValue__Group_0__2"
    // InternalCommunicationObject.g:2100:1: rule__SingleValue__Group_0__2 : rule__SingleValue__Group_0__2__Impl rule__SingleValue__Group_0__3 ;
    public final void rule__SingleValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2104:1: ( rule__SingleValue__Group_0__2__Impl rule__SingleValue__Group_0__3 )
            // InternalCommunicationObject.g:2105:2: rule__SingleValue__Group_0__2__Impl rule__SingleValue__Group_0__3
            {
            pushFollow(FOLLOW_19);
            rule__SingleValue__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_0__2"


    // $ANTLR start "rule__SingleValue__Group_0__2__Impl"
    // InternalCommunicationObject.g:2112:1: rule__SingleValue__Group_0__2__Impl : ( '(' ) ;
    public final void rule__SingleValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2116:1: ( ( '(' ) )
            // InternalCommunicationObject.g:2117:1: ( '(' )
            {
            // InternalCommunicationObject.g:2117:1: ( '(' )
            // InternalCommunicationObject.g:2118:2: '('
            {
             before(grammarAccess.getSingleValueAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSingleValueAccess().getLeftParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_0__2__Impl"


    // $ANTLR start "rule__SingleValue__Group_0__3"
    // InternalCommunicationObject.g:2127:1: rule__SingleValue__Group_0__3 : rule__SingleValue__Group_0__3__Impl ;
    public final void rule__SingleValue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2131:1: ( rule__SingleValue__Group_0__3__Impl )
            // InternalCommunicationObject.g:2132:2: rule__SingleValue__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_0__3"


    // $ANTLR start "rule__SingleValue__Group_0__3__Impl"
    // InternalCommunicationObject.g:2138:1: rule__SingleValue__Group_0__3__Impl : ( ')' ) ;
    public final void rule__SingleValue__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2142:1: ( ( ')' ) )
            // InternalCommunicationObject.g:2143:1: ( ')' )
            {
            // InternalCommunicationObject.g:2143:1: ( ')' )
            // InternalCommunicationObject.g:2144:2: ')'
            {
             before(grammarAccess.getSingleValueAccess().getRightParenthesisKeyword_0_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSingleValueAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_0__3__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__0"
    // InternalCommunicationObject.g:2154:1: rule__AttributeDefinition__Group__0 : rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 ;
    public final void rule__AttributeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2158:1: ( rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 )
            // InternalCommunicationObject.g:2159:2: rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCommunicationObject.g:2166:1: rule__AttributeDefinition__Group__0__Impl : ( ( rule__AttributeDefinition__NameAssignment_0 ) ) ;
    public final void rule__AttributeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2170:1: ( ( ( rule__AttributeDefinition__NameAssignment_0 ) ) )
            // InternalCommunicationObject.g:2171:1: ( ( rule__AttributeDefinition__NameAssignment_0 ) )
            {
            // InternalCommunicationObject.g:2171:1: ( ( rule__AttributeDefinition__NameAssignment_0 ) )
            // InternalCommunicationObject.g:2172:2: ( rule__AttributeDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_0()); 
            // InternalCommunicationObject.g:2173:2: ( rule__AttributeDefinition__NameAssignment_0 )
            // InternalCommunicationObject.g:2173:3: rule__AttributeDefinition__NameAssignment_0
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
    // InternalCommunicationObject.g:2181:1: rule__AttributeDefinition__Group__1 : rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 ;
    public final void rule__AttributeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2185:1: ( rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 )
            // InternalCommunicationObject.g:2186:2: rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCommunicationObject.g:2193:1: rule__AttributeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AttributeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2197:1: ( ( ':' ) )
            // InternalCommunicationObject.g:2198:1: ( ':' )
            {
            // InternalCommunicationObject.g:2198:1: ( ':' )
            // InternalCommunicationObject.g:2199:2: ':'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCommunicationObject.g:2208:1: rule__AttributeDefinition__Group__2 : rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 ;
    public final void rule__AttributeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2212:1: ( rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 )
            // InternalCommunicationObject.g:2213:2: rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalCommunicationObject.g:2220:1: rule__AttributeDefinition__Group__2__Impl : ( ( rule__AttributeDefinition__TypeAssignment_2 ) ) ;
    public final void rule__AttributeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2224:1: ( ( ( rule__AttributeDefinition__TypeAssignment_2 ) ) )
            // InternalCommunicationObject.g:2225:1: ( ( rule__AttributeDefinition__TypeAssignment_2 ) )
            {
            // InternalCommunicationObject.g:2225:1: ( ( rule__AttributeDefinition__TypeAssignment_2 ) )
            // InternalCommunicationObject.g:2226:2: ( rule__AttributeDefinition__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_2()); 
            // InternalCommunicationObject.g:2227:2: ( rule__AttributeDefinition__TypeAssignment_2 )
            // InternalCommunicationObject.g:2227:3: rule__AttributeDefinition__TypeAssignment_2
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
    // InternalCommunicationObject.g:2235:1: rule__AttributeDefinition__Group__3 : rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 ;
    public final void rule__AttributeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2239:1: ( rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 )
            // InternalCommunicationObject.g:2240:2: rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalCommunicationObject.g:2247:1: rule__AttributeDefinition__Group__3__Impl : ( ( rule__AttributeDefinition__Group_3__0 )? ) ;
    public final void rule__AttributeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2251:1: ( ( ( rule__AttributeDefinition__Group_3__0 )? ) )
            // InternalCommunicationObject.g:2252:1: ( ( rule__AttributeDefinition__Group_3__0 )? )
            {
            // InternalCommunicationObject.g:2252:1: ( ( rule__AttributeDefinition__Group_3__0 )? )
            // InternalCommunicationObject.g:2253:2: ( rule__AttributeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup_3()); 
            // InternalCommunicationObject.g:2254:2: ( rule__AttributeDefinition__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCommunicationObject.g:2254:3: rule__AttributeDefinition__Group_3__0
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
    // InternalCommunicationObject.g:2262:1: rule__AttributeDefinition__Group__4 : rule__AttributeDefinition__Group__4__Impl ;
    public final void rule__AttributeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2266:1: ( rule__AttributeDefinition__Group__4__Impl )
            // InternalCommunicationObject.g:2267:2: rule__AttributeDefinition__Group__4__Impl
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
    // InternalCommunicationObject.g:2273:1: rule__AttributeDefinition__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__AttributeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2277:1: ( ( ( ';' )? ) )
            // InternalCommunicationObject.g:2278:1: ( ( ';' )? )
            {
            // InternalCommunicationObject.g:2278:1: ( ( ';' )? )
            // InternalCommunicationObject.g:2279:2: ( ';' )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_4()); 
            // InternalCommunicationObject.g:2280:2: ( ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCommunicationObject.g:2280:3: ';'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalCommunicationObject.g:2289:1: rule__AttributeDefinition__Group_3__0 : rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1 ;
    public final void rule__AttributeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2293:1: ( rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1 )
            // InternalCommunicationObject.g:2294:2: rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCommunicationObject.g:2301:1: rule__AttributeDefinition__Group_3__0__Impl : ( '=' ) ;
    public final void rule__AttributeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2305:1: ( ( '=' ) )
            // InternalCommunicationObject.g:2306:1: ( '=' )
            {
            // InternalCommunicationObject.g:2306:1: ( '=' )
            // InternalCommunicationObject.g:2307:2: '='
            {
             before(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCommunicationObject.g:2316:1: rule__AttributeDefinition__Group_3__1 : rule__AttributeDefinition__Group_3__1__Impl ;
    public final void rule__AttributeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2320:1: ( rule__AttributeDefinition__Group_3__1__Impl )
            // InternalCommunicationObject.g:2321:2: rule__AttributeDefinition__Group_3__1__Impl
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
    // InternalCommunicationObject.g:2327:1: rule__AttributeDefinition__Group_3__1__Impl : ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) ) ;
    public final void rule__AttributeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2331:1: ( ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) ) )
            // InternalCommunicationObject.g:2332:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) )
            {
            // InternalCommunicationObject.g:2332:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) )
            // InternalCommunicationObject.g:2333:2: ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_3_1()); 
            // InternalCommunicationObject.g:2334:2: ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 )
            // InternalCommunicationObject.g:2334:3: rule__AttributeDefinition__DefaultvalueAssignment_3_1
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
    // InternalCommunicationObject.g:2343:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2347:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCommunicationObject.g:2348:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalCommunicationObject.g:2355:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2359:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:2360:1: ( RULE_ID )
            {
            // InternalCommunicationObject.g:2360:1: ( RULE_ID )
            // InternalCommunicationObject.g:2361:2: RULE_ID
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
    // InternalCommunicationObject.g:2370:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2374:1: ( rule__FQN__Group__1__Impl )
            // InternalCommunicationObject.g:2375:2: rule__FQN__Group__1__Impl
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
    // InternalCommunicationObject.g:2381:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2385:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCommunicationObject.g:2386:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCommunicationObject.g:2386:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCommunicationObject.g:2387:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCommunicationObject.g:2388:2: ( rule__FQN__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCommunicationObject.g:2388:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalCommunicationObject.g:2397:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2401:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCommunicationObject.g:2402:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalCommunicationObject.g:2409:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2413:1: ( ( '.' ) )
            // InternalCommunicationObject.g:2414:1: ( '.' )
            {
            // InternalCommunicationObject.g:2414:1: ( '.' )
            // InternalCommunicationObject.g:2415:2: '.'
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
    // InternalCommunicationObject.g:2424:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2428:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCommunicationObject.g:2429:2: rule__FQN__Group_1__1__Impl
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
    // InternalCommunicationObject.g:2435:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2439:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:2440:1: ( RULE_ID )
            {
            // InternalCommunicationObject.g:2440:1: ( RULE_ID )
            // InternalCommunicationObject.g:2441:2: RULE_ID
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
    // InternalCommunicationObject.g:2451:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2455:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalCommunicationObject.g:2456:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCommunicationObject.g:2463:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2467:1: ( ( ( '-' )? ) )
            // InternalCommunicationObject.g:2468:1: ( ( '-' )? )
            {
            // InternalCommunicationObject.g:2468:1: ( ( '-' )? )
            // InternalCommunicationObject.g:2469:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalCommunicationObject.g:2470:2: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCommunicationObject.g:2470:3: '-'
                    {
                    match(input,43,FOLLOW_2); 

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
    // InternalCommunicationObject.g:2478:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2482:1: ( rule__EInt__Group__1__Impl )
            // InternalCommunicationObject.g:2483:2: rule__EInt__Group__1__Impl
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
    // InternalCommunicationObject.g:2489:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2493:1: ( ( RULE_INT ) )
            // InternalCommunicationObject.g:2494:1: ( RULE_INT )
            {
            // InternalCommunicationObject.g:2494:1: ( RULE_INT )
            // InternalCommunicationObject.g:2495:2: RULE_INT
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
    // InternalCommunicationObject.g:2505:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2509:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalCommunicationObject.g:2510:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalCommunicationObject.g:2517:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2521:1: ( ( ( '-' )? ) )
            // InternalCommunicationObject.g:2522:1: ( ( '-' )? )
            {
            // InternalCommunicationObject.g:2522:1: ( ( '-' )? )
            // InternalCommunicationObject.g:2523:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalCommunicationObject.g:2524:2: ( '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCommunicationObject.g:2524:3: '-'
                    {
                    match(input,43,FOLLOW_2); 

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
    // InternalCommunicationObject.g:2532:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2536:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalCommunicationObject.g:2537:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalCommunicationObject.g:2544:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2548:1: ( ( ( RULE_INT )? ) )
            // InternalCommunicationObject.g:2549:1: ( ( RULE_INT )? )
            {
            // InternalCommunicationObject.g:2549:1: ( ( RULE_INT )? )
            // InternalCommunicationObject.g:2550:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalCommunicationObject.g:2551:2: ( RULE_INT )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCommunicationObject.g:2551:3: RULE_INT
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
    // InternalCommunicationObject.g:2559:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2563:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalCommunicationObject.g:2564:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalCommunicationObject.g:2571:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2575:1: ( ( '.' ) )
            // InternalCommunicationObject.g:2576:1: ( '.' )
            {
            // InternalCommunicationObject.g:2576:1: ( '.' )
            // InternalCommunicationObject.g:2577:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCommunicationObject.g:2586:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2590:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalCommunicationObject.g:2591:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalCommunicationObject.g:2598:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2602:1: ( ( RULE_INT ) )
            // InternalCommunicationObject.g:2603:1: ( RULE_INT )
            {
            // InternalCommunicationObject.g:2603:1: ( RULE_INT )
            // InternalCommunicationObject.g:2604:2: RULE_INT
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
    // InternalCommunicationObject.g:2613:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2617:1: ( rule__EDouble__Group__4__Impl )
            // InternalCommunicationObject.g:2618:2: rule__EDouble__Group__4__Impl
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
    // InternalCommunicationObject.g:2624:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2628:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalCommunicationObject.g:2629:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalCommunicationObject.g:2629:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalCommunicationObject.g:2630:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalCommunicationObject.g:2631:2: ( rule__EDouble__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=13 && LA29_0<=14)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCommunicationObject.g:2631:3: rule__EDouble__Group_4__0
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
    // InternalCommunicationObject.g:2640:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2644:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalCommunicationObject.g:2645:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCommunicationObject.g:2652:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2656:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalCommunicationObject.g:2657:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalCommunicationObject.g:2657:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalCommunicationObject.g:2658:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalCommunicationObject.g:2659:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalCommunicationObject.g:2659:3: rule__EDouble__Alternatives_4_0
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
    // InternalCommunicationObject.g:2667:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2671:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalCommunicationObject.g:2672:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalCommunicationObject.g:2679:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2683:1: ( ( ( '-' )? ) )
            // InternalCommunicationObject.g:2684:1: ( ( '-' )? )
            {
            // InternalCommunicationObject.g:2684:1: ( ( '-' )? )
            // InternalCommunicationObject.g:2685:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalCommunicationObject.g:2686:2: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCommunicationObject.g:2686:3: '-'
                    {
                    match(input,43,FOLLOW_2); 

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
    // InternalCommunicationObject.g:2694:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2698:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalCommunicationObject.g:2699:2: rule__EDouble__Group_4__2__Impl
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
    // InternalCommunicationObject.g:2705:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2709:1: ( ( RULE_INT ) )
            // InternalCommunicationObject.g:2710:1: ( RULE_INT )
            {
            // InternalCommunicationObject.g:2710:1: ( RULE_INT )
            // InternalCommunicationObject.g:2711:2: RULE_INT
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
    // InternalCommunicationObject.g:2721:1: rule__EnumerationElement__Group__0 : rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 ;
    public final void rule__EnumerationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2725:1: ( rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 )
            // InternalCommunicationObject.g:2726:2: rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCommunicationObject.g:2733:1: rule__EnumerationElement__Group__0__Impl : ( ( rule__EnumerationElement__NameAssignment_0 ) ) ;
    public final void rule__EnumerationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2737:1: ( ( ( rule__EnumerationElement__NameAssignment_0 ) ) )
            // InternalCommunicationObject.g:2738:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            {
            // InternalCommunicationObject.g:2738:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            // InternalCommunicationObject.g:2739:2: ( rule__EnumerationElement__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); 
            // InternalCommunicationObject.g:2740:2: ( rule__EnumerationElement__NameAssignment_0 )
            // InternalCommunicationObject.g:2740:3: rule__EnumerationElement__NameAssignment_0
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
    // InternalCommunicationObject.g:2748:1: rule__EnumerationElement__Group__1 : rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 ;
    public final void rule__EnumerationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2752:1: ( rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 )
            // InternalCommunicationObject.g:2753:2: rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalCommunicationObject.g:2760:1: rule__EnumerationElement__Group__1__Impl : ( ( rule__EnumerationElement__Group_1__0 )? ) ;
    public final void rule__EnumerationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2764:1: ( ( ( rule__EnumerationElement__Group_1__0 )? ) )
            // InternalCommunicationObject.g:2765:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            {
            // InternalCommunicationObject.g:2765:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            // InternalCommunicationObject.g:2766:2: ( rule__EnumerationElement__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup_1()); 
            // InternalCommunicationObject.g:2767:2: ( rule__EnumerationElement__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCommunicationObject.g:2767:3: rule__EnumerationElement__Group_1__0
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
    // InternalCommunicationObject.g:2775:1: rule__EnumerationElement__Group__2 : rule__EnumerationElement__Group__2__Impl ;
    public final void rule__EnumerationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2779:1: ( rule__EnumerationElement__Group__2__Impl )
            // InternalCommunicationObject.g:2780:2: rule__EnumerationElement__Group__2__Impl
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
    // InternalCommunicationObject.g:2786:1: rule__EnumerationElement__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__EnumerationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2790:1: ( ( ( ';' )? ) )
            // InternalCommunicationObject.g:2791:1: ( ( ';' )? )
            {
            // InternalCommunicationObject.g:2791:1: ( ( ';' )? )
            // InternalCommunicationObject.g:2792:2: ( ';' )?
            {
             before(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); 
            // InternalCommunicationObject.g:2793:2: ( ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCommunicationObject.g:2793:3: ';'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalCommunicationObject.g:2802:1: rule__EnumerationElement__Group_1__0 : rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 ;
    public final void rule__EnumerationElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2806:1: ( rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 )
            // InternalCommunicationObject.g:2807:2: rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCommunicationObject.g:2814:1: rule__EnumerationElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2818:1: ( ( '=' ) )
            // InternalCommunicationObject.g:2819:1: ( '=' )
            {
            // InternalCommunicationObject.g:2819:1: ( '=' )
            // InternalCommunicationObject.g:2820:2: '='
            {
             before(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCommunicationObject.g:2829:1: rule__EnumerationElement__Group_1__1 : rule__EnumerationElement__Group_1__1__Impl ;
    public final void rule__EnumerationElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2833:1: ( rule__EnumerationElement__Group_1__1__Impl )
            // InternalCommunicationObject.g:2834:2: rule__EnumerationElement__Group_1__1__Impl
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
    // InternalCommunicationObject.g:2840:1: rule__EnumerationElement__Group_1__1__Impl : ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2844:1: ( ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) )
            // InternalCommunicationObject.g:2845:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            {
            // InternalCommunicationObject.g:2845:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            // InternalCommunicationObject.g:2846:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); 
            // InternalCommunicationObject.g:2847:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            // InternalCommunicationObject.g:2847:3: rule__EnumerationElement__ValueAssignment_1_1
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
    // InternalCommunicationObject.g:2856:1: rule__InlineEnumerationType__Group__0 : rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 ;
    public final void rule__InlineEnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2860:1: ( rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 )
            // InternalCommunicationObject.g:2861:2: rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalCommunicationObject.g:2868:1: rule__InlineEnumerationType__Group__0__Impl : ( 'InlineEnumeration' ) ;
    public final void rule__InlineEnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2872:1: ( ( 'InlineEnumeration' ) )
            // InternalCommunicationObject.g:2873:1: ( 'InlineEnumeration' )
            {
            // InternalCommunicationObject.g:2873:1: ( 'InlineEnumeration' )
            // InternalCommunicationObject.g:2874:2: 'InlineEnumeration'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCommunicationObject.g:2883:1: rule__InlineEnumerationType__Group__1 : rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 ;
    public final void rule__InlineEnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2887:1: ( rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 )
            // InternalCommunicationObject.g:2888:2: rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalCommunicationObject.g:2895:1: rule__InlineEnumerationType__Group__1__Impl : ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) ;
    public final void rule__InlineEnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2899:1: ( ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) )
            // InternalCommunicationObject.g:2900:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            {
            // InternalCommunicationObject.g:2900:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            // InternalCommunicationObject.g:2901:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); 
            // InternalCommunicationObject.g:2902:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCommunicationObject.g:2902:3: rule__InlineEnumerationType__ArrayAssignment_1
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
    // InternalCommunicationObject.g:2910:1: rule__InlineEnumerationType__Group__2 : rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 ;
    public final void rule__InlineEnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2914:1: ( rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 )
            // InternalCommunicationObject.g:2915:2: rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalCommunicationObject.g:2922:1: rule__InlineEnumerationType__Group__2__Impl : ( '{' ) ;
    public final void rule__InlineEnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2926:1: ( ( '{' ) )
            // InternalCommunicationObject.g:2927:1: ( '{' )
            {
            // InternalCommunicationObject.g:2927:1: ( '{' )
            // InternalCommunicationObject.g:2928:2: '{'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCommunicationObject.g:2937:1: rule__InlineEnumerationType__Group__3 : rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 ;
    public final void rule__InlineEnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2941:1: ( rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 )
            // InternalCommunicationObject.g:2942:2: rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalCommunicationObject.g:2949:1: rule__InlineEnumerationType__Group__3__Impl : ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) ;
    public final void rule__InlineEnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2953:1: ( ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) )
            // InternalCommunicationObject.g:2954:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            {
            // InternalCommunicationObject.g:2954:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            // InternalCommunicationObject.g:2955:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            {
            // InternalCommunicationObject.g:2955:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) )
            // InternalCommunicationObject.g:2956:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalCommunicationObject.g:2957:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            // InternalCommunicationObject.g:2957:4: rule__InlineEnumerationType__EnumsAssignment_3
            {
            pushFollow(FOLLOW_16);
            rule__InlineEnumerationType__EnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 

            }

            // InternalCommunicationObject.g:2960:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            // InternalCommunicationObject.g:2961:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalCommunicationObject.g:2962:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCommunicationObject.g:2962:4: rule__InlineEnumerationType__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__InlineEnumerationType__EnumsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalCommunicationObject.g:2971:1: rule__InlineEnumerationType__Group__4 : rule__InlineEnumerationType__Group__4__Impl ;
    public final void rule__InlineEnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2975:1: ( rule__InlineEnumerationType__Group__4__Impl )
            // InternalCommunicationObject.g:2976:2: rule__InlineEnumerationType__Group__4__Impl
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
    // InternalCommunicationObject.g:2982:1: rule__InlineEnumerationType__Group__4__Impl : ( '}' ) ;
    public final void rule__InlineEnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2986:1: ( ( '}' ) )
            // InternalCommunicationObject.g:2987:1: ( '}' )
            {
            // InternalCommunicationObject.g:2987:1: ( '}' )
            // InternalCommunicationObject.g:2988:2: '}'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCommunicationObject.g:2998:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3002:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalCommunicationObject.g:3003:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
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
    // InternalCommunicationObject.g:3010:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3014:1: ( ( () ) )
            // InternalCommunicationObject.g:3015:1: ( () )
            {
            // InternalCommunicationObject.g:3015:1: ( () )
            // InternalCommunicationObject.g:3016:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // InternalCommunicationObject.g:3017:2: ()
            // InternalCommunicationObject.g:3017:3: 
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
    // InternalCommunicationObject.g:3025:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3029:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalCommunicationObject.g:3030:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
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
    // InternalCommunicationObject.g:3037:1: rule__ArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3041:1: ( ( '[' ) )
            // InternalCommunicationObject.g:3042:1: ( '[' )
            {
            // InternalCommunicationObject.g:3042:1: ( '[' )
            // InternalCommunicationObject.g:3043:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCommunicationObject.g:3052:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3056:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalCommunicationObject.g:3057:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
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
    // InternalCommunicationObject.g:3064:1: rule__ArrayType__Group__2__Impl : ( ( rule__ArrayType__LengthAssignment_2 )? ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3068:1: ( ( ( rule__ArrayType__LengthAssignment_2 )? ) )
            // InternalCommunicationObject.g:3069:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            {
            // InternalCommunicationObject.g:3069:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            // InternalCommunicationObject.g:3070:2: ( rule__ArrayType__LengthAssignment_2 )?
            {
             before(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); 
            // InternalCommunicationObject.g:3071:2: ( rule__ArrayType__LengthAssignment_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_INT||LA35_0==15) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCommunicationObject.g:3071:3: rule__ArrayType__LengthAssignment_2
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
    // InternalCommunicationObject.g:3079:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3083:1: ( rule__ArrayType__Group__3__Impl )
            // InternalCommunicationObject.g:3084:2: rule__ArrayType__Group__3__Impl
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
    // InternalCommunicationObject.g:3090:1: rule__ArrayType__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3094:1: ( ( ']' ) )
            // InternalCommunicationObject.g:3095:1: ( ']' )
            {
            // InternalCommunicationObject.g:3095:1: ( ']' )
            // InternalCommunicationObject.g:3096:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCommunicationObject.g:3106:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3110:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalCommunicationObject.g:3111:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
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
    // InternalCommunicationObject.g:3118:1: rule__PrimitiveType__Group__0__Impl : ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3122:1: ( ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) )
            // InternalCommunicationObject.g:3123:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            {
            // InternalCommunicationObject.g:3123:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            // InternalCommunicationObject.g:3124:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); 
            // InternalCommunicationObject.g:3125:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            // InternalCommunicationObject.g:3125:3: rule__PrimitiveType__TypeNameAssignment_0
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
    // InternalCommunicationObject.g:3133:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3137:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalCommunicationObject.g:3138:2: rule__PrimitiveType__Group__1__Impl
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
    // InternalCommunicationObject.g:3144:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3148:1: ( ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) )
            // InternalCommunicationObject.g:3149:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            {
            // InternalCommunicationObject.g:3149:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            // InternalCommunicationObject.g:3150:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); 
            // InternalCommunicationObject.g:3151:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCommunicationObject.g:3151:3: rule__PrimitiveType__ArrayAssignment_1
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
    // InternalCommunicationObject.g:3160:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3164:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalCommunicationObject.g:3165:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
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
    // InternalCommunicationObject.g:3172:1: rule__ArrayValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3176:1: ( ( '[' ) )
            // InternalCommunicationObject.g:3177:1: ( '[' )
            {
            // InternalCommunicationObject.g:3177:1: ( '[' )
            // InternalCommunicationObject.g:3178:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCommunicationObject.g:3187:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3191:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalCommunicationObject.g:3192:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
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
    // InternalCommunicationObject.g:3199:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_1 ) ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3203:1: ( ( ( rule__ArrayValue__ValuesAssignment_1 ) ) )
            // InternalCommunicationObject.g:3204:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            {
            // InternalCommunicationObject.g:3204:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            // InternalCommunicationObject.g:3205:2: ( rule__ArrayValue__ValuesAssignment_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); 
            // InternalCommunicationObject.g:3206:2: ( rule__ArrayValue__ValuesAssignment_1 )
            // InternalCommunicationObject.g:3206:3: rule__ArrayValue__ValuesAssignment_1
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
    // InternalCommunicationObject.g:3214:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3218:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalCommunicationObject.g:3219:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
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
    // InternalCommunicationObject.g:3226:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )* ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3230:1: ( ( ( rule__ArrayValue__Group_2__0 )* ) )
            // InternalCommunicationObject.g:3231:1: ( ( rule__ArrayValue__Group_2__0 )* )
            {
            // InternalCommunicationObject.g:3231:1: ( ( rule__ArrayValue__Group_2__0 )* )
            // InternalCommunicationObject.g:3232:2: ( rule__ArrayValue__Group_2__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalCommunicationObject.g:3233:2: ( rule__ArrayValue__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==47) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalCommunicationObject.g:3233:3: rule__ArrayValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ArrayValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalCommunicationObject.g:3241:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3245:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalCommunicationObject.g:3246:2: rule__ArrayValue__Group__3__Impl
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
    // InternalCommunicationObject.g:3252:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3256:1: ( ( ']' ) )
            // InternalCommunicationObject.g:3257:1: ( ']' )
            {
            // InternalCommunicationObject.g:3257:1: ( ']' )
            // InternalCommunicationObject.g:3258:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCommunicationObject.g:3268:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3272:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalCommunicationObject.g:3273:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
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
    // InternalCommunicationObject.g:3280:1: rule__ArrayValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3284:1: ( ( ',' ) )
            // InternalCommunicationObject.g:3285:1: ( ',' )
            {
            // InternalCommunicationObject.g:3285:1: ( ',' )
            // InternalCommunicationObject.g:3286:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCommunicationObject.g:3295:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3299:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalCommunicationObject.g:3300:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalCommunicationObject.g:3306:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3310:1: ( ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) )
            // InternalCommunicationObject.g:3311:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            {
            // InternalCommunicationObject.g:3311:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            // InternalCommunicationObject.g:3312:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); 
            // InternalCommunicationObject.g:3313:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            // InternalCommunicationObject.g:3313:3: rule__ArrayValue__ValuesAssignment_2_1
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


    // $ANTLR start "superSingleValue__Group_0__0"
    // InternalCommunicationObject.g:3322:1: superSingleValue__Group_0__0 : superSingleValue__Group_0__0__Impl superSingleValue__Group_0__1 ;
    public final void superSingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3326:1: ( superSingleValue__Group_0__0__Impl superSingleValue__Group_0__1 )
            // InternalCommunicationObject.g:3327:2: superSingleValue__Group_0__0__Impl superSingleValue__Group_0__1
            {
            pushFollow(FOLLOW_25);
            superSingleValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            superSingleValue__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_0__0"


    // $ANTLR start "superSingleValue__Group_0__0__Impl"
    // InternalCommunicationObject.g:3334:1: superSingleValue__Group_0__0__Impl : ( () ) ;
    public final void superSingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3338:1: ( ( () ) )
            // InternalCommunicationObject.g:3339:1: ( () )
            {
            // InternalCommunicationObject.g:3339:1: ( () )
            // InternalCommunicationObject.g:3340:2: ()
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getIntValueAction_0_0()); 
            // InternalCommunicationObject.g:3341:2: ()
            // InternalCommunicationObject.g:3341:3: 
            {
            }

             after(grammarAccess.getBasicAttributesSingleValueAccess().getIntValueAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_0__0__Impl"


    // $ANTLR start "superSingleValue__Group_0__1"
    // InternalCommunicationObject.g:3349:1: superSingleValue__Group_0__1 : superSingleValue__Group_0__1__Impl ;
    public final void superSingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3353:1: ( superSingleValue__Group_0__1__Impl )
            // InternalCommunicationObject.g:3354:2: superSingleValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            superSingleValue__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_0__1"


    // $ANTLR start "superSingleValue__Group_0__1__Impl"
    // InternalCommunicationObject.g:3360:1: superSingleValue__Group_0__1__Impl : ( ( superSingleValue__ValueAssignment_0_1 ) ) ;
    public final void superSingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3364:1: ( ( ( superSingleValue__ValueAssignment_0_1 ) ) )
            // InternalCommunicationObject.g:3365:1: ( ( superSingleValue__ValueAssignment_0_1 ) )
            {
            // InternalCommunicationObject.g:3365:1: ( ( superSingleValue__ValueAssignment_0_1 ) )
            // InternalCommunicationObject.g:3366:2: ( superSingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_0_1()); 
            // InternalCommunicationObject.g:3367:2: ( superSingleValue__ValueAssignment_0_1 )
            // InternalCommunicationObject.g:3367:3: superSingleValue__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            superSingleValue__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_0__1__Impl"


    // $ANTLR start "superSingleValue__Group_1__0"
    // InternalCommunicationObject.g:3376:1: superSingleValue__Group_1__0 : superSingleValue__Group_1__0__Impl superSingleValue__Group_1__1 ;
    public final void superSingleValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3380:1: ( superSingleValue__Group_1__0__Impl superSingleValue__Group_1__1 )
            // InternalCommunicationObject.g:3381:2: superSingleValue__Group_1__0__Impl superSingleValue__Group_1__1
            {
            pushFollow(FOLLOW_26);
            superSingleValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            superSingleValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_1__0"


    // $ANTLR start "superSingleValue__Group_1__0__Impl"
    // InternalCommunicationObject.g:3388:1: superSingleValue__Group_1__0__Impl : ( () ) ;
    public final void superSingleValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3392:1: ( ( () ) )
            // InternalCommunicationObject.g:3393:1: ( () )
            {
            // InternalCommunicationObject.g:3393:1: ( () )
            // InternalCommunicationObject.g:3394:2: ()
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getFloatingPointValueAction_1_0()); 
            // InternalCommunicationObject.g:3395:2: ()
            // InternalCommunicationObject.g:3395:3: 
            {
            }

             after(grammarAccess.getBasicAttributesSingleValueAccess().getFloatingPointValueAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_1__0__Impl"


    // $ANTLR start "superSingleValue__Group_1__1"
    // InternalCommunicationObject.g:3403:1: superSingleValue__Group_1__1 : superSingleValue__Group_1__1__Impl ;
    public final void superSingleValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3407:1: ( superSingleValue__Group_1__1__Impl )
            // InternalCommunicationObject.g:3408:2: superSingleValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            superSingleValue__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_1__1"


    // $ANTLR start "superSingleValue__Group_1__1__Impl"
    // InternalCommunicationObject.g:3414:1: superSingleValue__Group_1__1__Impl : ( ( superSingleValue__ValueAssignment_1_1 ) ) ;
    public final void superSingleValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3418:1: ( ( ( superSingleValue__ValueAssignment_1_1 ) ) )
            // InternalCommunicationObject.g:3419:1: ( ( superSingleValue__ValueAssignment_1_1 ) )
            {
            // InternalCommunicationObject.g:3419:1: ( ( superSingleValue__ValueAssignment_1_1 ) )
            // InternalCommunicationObject.g:3420:2: ( superSingleValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_1_1()); 
            // InternalCommunicationObject.g:3421:2: ( superSingleValue__ValueAssignment_1_1 )
            // InternalCommunicationObject.g:3421:3: superSingleValue__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            superSingleValue__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_1__1__Impl"


    // $ANTLR start "superSingleValue__Group_2__0"
    // InternalCommunicationObject.g:3430:1: superSingleValue__Group_2__0 : superSingleValue__Group_2__0__Impl superSingleValue__Group_2__1 ;
    public final void superSingleValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3434:1: ( superSingleValue__Group_2__0__Impl superSingleValue__Group_2__1 )
            // InternalCommunicationObject.g:3435:2: superSingleValue__Group_2__0__Impl superSingleValue__Group_2__1
            {
            pushFollow(FOLLOW_12);
            superSingleValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            superSingleValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_2__0"


    // $ANTLR start "superSingleValue__Group_2__0__Impl"
    // InternalCommunicationObject.g:3442:1: superSingleValue__Group_2__0__Impl : ( () ) ;
    public final void superSingleValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3446:1: ( ( () ) )
            // InternalCommunicationObject.g:3447:1: ( () )
            {
            // InternalCommunicationObject.g:3447:1: ( () )
            // InternalCommunicationObject.g:3448:2: ()
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getStringValueAction_2_0()); 
            // InternalCommunicationObject.g:3449:2: ()
            // InternalCommunicationObject.g:3449:3: 
            {
            }

             after(grammarAccess.getBasicAttributesSingleValueAccess().getStringValueAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_2__0__Impl"


    // $ANTLR start "superSingleValue__Group_2__1"
    // InternalCommunicationObject.g:3457:1: superSingleValue__Group_2__1 : superSingleValue__Group_2__1__Impl ;
    public final void superSingleValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3461:1: ( superSingleValue__Group_2__1__Impl )
            // InternalCommunicationObject.g:3462:2: superSingleValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            superSingleValue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_2__1"


    // $ANTLR start "superSingleValue__Group_2__1__Impl"
    // InternalCommunicationObject.g:3468:1: superSingleValue__Group_2__1__Impl : ( ( superSingleValue__ValueAssignment_2_1 ) ) ;
    public final void superSingleValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3472:1: ( ( ( superSingleValue__ValueAssignment_2_1 ) ) )
            // InternalCommunicationObject.g:3473:1: ( ( superSingleValue__ValueAssignment_2_1 ) )
            {
            // InternalCommunicationObject.g:3473:1: ( ( superSingleValue__ValueAssignment_2_1 ) )
            // InternalCommunicationObject.g:3474:2: ( superSingleValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_2_1()); 
            // InternalCommunicationObject.g:3475:2: ( superSingleValue__ValueAssignment_2_1 )
            // InternalCommunicationObject.g:3475:3: superSingleValue__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            superSingleValue__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_2__1__Impl"


    // $ANTLR start "superSingleValue__Group_3__0"
    // InternalCommunicationObject.g:3484:1: superSingleValue__Group_3__0 : superSingleValue__Group_3__0__Impl superSingleValue__Group_3__1 ;
    public final void superSingleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3488:1: ( superSingleValue__Group_3__0__Impl superSingleValue__Group_3__1 )
            // InternalCommunicationObject.g:3489:2: superSingleValue__Group_3__0__Impl superSingleValue__Group_3__1
            {
            pushFollow(FOLLOW_34);
            superSingleValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            superSingleValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_3__0"


    // $ANTLR start "superSingleValue__Group_3__0__Impl"
    // InternalCommunicationObject.g:3496:1: superSingleValue__Group_3__0__Impl : ( () ) ;
    public final void superSingleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3500:1: ( ( () ) )
            // InternalCommunicationObject.g:3501:1: ( () )
            {
            // InternalCommunicationObject.g:3501:1: ( () )
            // InternalCommunicationObject.g:3502:2: ()
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getBoolValueAction_3_0()); 
            // InternalCommunicationObject.g:3503:2: ()
            // InternalCommunicationObject.g:3503:3: 
            {
            }

             after(grammarAccess.getBasicAttributesSingleValueAccess().getBoolValueAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_3__0__Impl"


    // $ANTLR start "superSingleValue__Group_3__1"
    // InternalCommunicationObject.g:3511:1: superSingleValue__Group_3__1 : superSingleValue__Group_3__1__Impl ;
    public final void superSingleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3515:1: ( superSingleValue__Group_3__1__Impl )
            // InternalCommunicationObject.g:3516:2: superSingleValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            superSingleValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_3__1"


    // $ANTLR start "superSingleValue__Group_3__1__Impl"
    // InternalCommunicationObject.g:3522:1: superSingleValue__Group_3__1__Impl : ( ( superSingleValue__ValueAssignment_3_1 ) ) ;
    public final void superSingleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3526:1: ( ( ( superSingleValue__ValueAssignment_3_1 ) ) )
            // InternalCommunicationObject.g:3527:1: ( ( superSingleValue__ValueAssignment_3_1 ) )
            {
            // InternalCommunicationObject.g:3527:1: ( ( superSingleValue__ValueAssignment_3_1 ) )
            // InternalCommunicationObject.g:3528:2: ( superSingleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_3_1()); 
            // InternalCommunicationObject.g:3529:2: ( superSingleValue__ValueAssignment_3_1 )
            // InternalCommunicationObject.g:3529:3: superSingleValue__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            superSingleValue__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_3__1__Impl"


    // $ANTLR start "superSingleValue__Group_4__0"
    // InternalCommunicationObject.g:3538:1: superSingleValue__Group_4__0 : superSingleValue__Group_4__0__Impl superSingleValue__Group_4__1 ;
    public final void superSingleValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3542:1: ( superSingleValue__Group_4__0__Impl superSingleValue__Group_4__1 )
            // InternalCommunicationObject.g:3543:2: superSingleValue__Group_4__0__Impl superSingleValue__Group_4__1
            {
            pushFollow(FOLLOW_31);
            superSingleValue__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            superSingleValue__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_4__0"


    // $ANTLR start "superSingleValue__Group_4__0__Impl"
    // InternalCommunicationObject.g:3550:1: superSingleValue__Group_4__0__Impl : ( () ) ;
    public final void superSingleValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3554:1: ( ( () ) )
            // InternalCommunicationObject.g:3555:1: ( () )
            {
            // InternalCommunicationObject.g:3555:1: ( () )
            // InternalCommunicationObject.g:3556:2: ()
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getEnumerationValueAction_4_0()); 
            // InternalCommunicationObject.g:3557:2: ()
            // InternalCommunicationObject.g:3557:3: 
            {
            }

             after(grammarAccess.getBasicAttributesSingleValueAccess().getEnumerationValueAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_4__0__Impl"


    // $ANTLR start "superSingleValue__Group_4__1"
    // InternalCommunicationObject.g:3565:1: superSingleValue__Group_4__1 : superSingleValue__Group_4__1__Impl ;
    public final void superSingleValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3569:1: ( superSingleValue__Group_4__1__Impl )
            // InternalCommunicationObject.g:3570:2: superSingleValue__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            superSingleValue__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_4__1"


    // $ANTLR start "superSingleValue__Group_4__1__Impl"
    // InternalCommunicationObject.g:3576:1: superSingleValue__Group_4__1__Impl : ( ( superSingleValue__ValueAssignment_4_1 ) ) ;
    public final void superSingleValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3580:1: ( ( ( superSingleValue__ValueAssignment_4_1 ) ) )
            // InternalCommunicationObject.g:3581:1: ( ( superSingleValue__ValueAssignment_4_1 ) )
            {
            // InternalCommunicationObject.g:3581:1: ( ( superSingleValue__ValueAssignment_4_1 ) )
            // InternalCommunicationObject.g:3582:2: ( superSingleValue__ValueAssignment_4_1 )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_4_1()); 
            // InternalCommunicationObject.g:3583:2: ( superSingleValue__ValueAssignment_4_1 )
            // InternalCommunicationObject.g:3583:3: superSingleValue__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            superSingleValue__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__Group_4__1__Impl"


    // $ANTLR start "rule__CommObjectModel__ImportsAssignment_0"
    // InternalCommunicationObject.g:3592:1: rule__CommObjectModel__ImportsAssignment_0 : ( ruleCommRepositoryImport ) ;
    public final void rule__CommObjectModel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3596:1: ( ( ruleCommRepositoryImport ) )
            // InternalCommunicationObject.g:3597:2: ( ruleCommRepositoryImport )
            {
            // InternalCommunicationObject.g:3597:2: ( ruleCommRepositoryImport )
            // InternalCommunicationObject.g:3598:3: ruleCommRepositoryImport
            {
             before(grammarAccess.getCommObjectModelAccess().getImportsCommRepositoryImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCommRepositoryImport();

            state._fsp--;

             after(grammarAccess.getCommObjectModelAccess().getImportsCommRepositoryImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectModel__ImportsAssignment_0"


    // $ANTLR start "rule__CommObjectModel__RepositoryAssignment_1"
    // InternalCommunicationObject.g:3607:1: rule__CommObjectModel__RepositoryAssignment_1 : ( ruleCommObjectsRepository ) ;
    public final void rule__CommObjectModel__RepositoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3611:1: ( ( ruleCommObjectsRepository ) )
            // InternalCommunicationObject.g:3612:2: ( ruleCommObjectsRepository )
            {
            // InternalCommunicationObject.g:3612:2: ( ruleCommObjectsRepository )
            // InternalCommunicationObject.g:3613:3: ruleCommObjectsRepository
            {
             before(grammarAccess.getCommObjectModelAccess().getRepositoryCommObjectsRepositoryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommObjectsRepository();

            state._fsp--;

             after(grammarAccess.getCommObjectModelAccess().getRepositoryCommObjectsRepositoryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectModel__RepositoryAssignment_1"


    // $ANTLR start "rule__CommRepositoryImport__ImportedNamespaceAssignment_1"
    // InternalCommunicationObject.g:3622:1: rule__CommRepositoryImport__ImportedNamespaceAssignment_1 : ( ruleFQNW ) ;
    public final void rule__CommRepositoryImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3626:1: ( ( ruleFQNW ) )
            // InternalCommunicationObject.g:3627:2: ( ruleFQNW )
            {
            // InternalCommunicationObject.g:3627:2: ( ruleFQNW )
            // InternalCommunicationObject.g:3628:3: ruleFQNW
            {
             before(grammarAccess.getCommRepositoryImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQNW();

            state._fsp--;

             after(grammarAccess.getCommRepositoryImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepositoryImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__CommObjectsRepository__NameAssignment_1"
    // InternalCommunicationObject.g:3637:1: rule__CommObjectsRepository__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CommObjectsRepository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3641:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:3642:2: ( RULE_ID )
            {
            // InternalCommunicationObject.g:3642:2: ( RULE_ID )
            // InternalCommunicationObject.g:3643:3: RULE_ID
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__NameAssignment_1"


    // $ANTLR start "rule__CommObjectsRepository__VersionAssignment_2_1"
    // InternalCommunicationObject.g:3652:1: rule__CommObjectsRepository__VersionAssignment_2_1 : ( ruleVersion ) ;
    public final void rule__CommObjectsRepository__VersionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3656:1: ( ( ruleVersion ) )
            // InternalCommunicationObject.g:3657:2: ( ruleVersion )
            {
            // InternalCommunicationObject.g:3657:2: ( ruleVersion )
            // InternalCommunicationObject.g:3658:3: ruleVersion
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getVersionVersionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getCommObjectsRepositoryAccess().getVersionVersionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__VersionAssignment_2_1"


    // $ANTLR start "rule__CommObjectsRepository__DependencyAssignment_4_1"
    // InternalCommunicationObject.g:3667:1: rule__CommObjectsRepository__DependencyAssignment_4_1 : ( ruleEString ) ;
    public final void rule__CommObjectsRepository__DependencyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3671:1: ( ( ruleEString ) )
            // InternalCommunicationObject.g:3672:2: ( ruleEString )
            {
            // InternalCommunicationObject.g:3672:2: ( ruleEString )
            // InternalCommunicationObject.g:3673:3: ruleEString
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getDependencyEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommObjectsRepositoryAccess().getDependencyEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__DependencyAssignment_4_1"


    // $ANTLR start "rule__CommObjectsRepository__ElementsAssignment_5"
    // InternalCommunicationObject.g:3682:1: rule__CommObjectsRepository__ElementsAssignment_5 : ( ruleAbstractCommElement ) ;
    public final void rule__CommObjectsRepository__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3686:1: ( ( ruleAbstractCommElement ) )
            // InternalCommunicationObject.g:3687:2: ( ruleAbstractCommElement )
            {
            // InternalCommunicationObject.g:3687:2: ( ruleAbstractCommElement )
            // InternalCommunicationObject.g:3688:3: ruleAbstractCommElement
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getElementsAbstractCommElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractCommElement();

            state._fsp--;

             after(grammarAccess.getCommObjectsRepositoryAccess().getElementsAbstractCommElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__ElementsAssignment_5"


    // $ANTLR start "rule__Version__MajorAssignment_0"
    // InternalCommunicationObject.g:3697:1: rule__Version__MajorAssignment_0 : ( RULE_INT ) ;
    public final void rule__Version__MajorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3701:1: ( ( RULE_INT ) )
            // InternalCommunicationObject.g:3702:2: ( RULE_INT )
            {
            // InternalCommunicationObject.g:3702:2: ( RULE_INT )
            // InternalCommunicationObject.g:3703:3: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getMajorINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getMajorINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__MajorAssignment_0"


    // $ANTLR start "rule__Version__MinorAssignment_2"
    // InternalCommunicationObject.g:3712:1: rule__Version__MinorAssignment_2 : ( RULE_INT ) ;
    public final void rule__Version__MinorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3716:1: ( ( RULE_INT ) )
            // InternalCommunicationObject.g:3717:2: ( RULE_INT )
            {
            // InternalCommunicationObject.g:3717:2: ( RULE_INT )
            // InternalCommunicationObject.g:3718:3: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getMinorINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getMinorINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__MinorAssignment_2"


    // $ANTLR start "rule__Version__PatchAssignment_3_1"
    // InternalCommunicationObject.g:3727:1: rule__Version__PatchAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Version__PatchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3731:1: ( ( RULE_INT ) )
            // InternalCommunicationObject.g:3732:2: ( RULE_INT )
            {
            // InternalCommunicationObject.g:3732:2: ( RULE_INT )
            // InternalCommunicationObject.g:3733:3: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getPatchINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getPatchINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__PatchAssignment_3_1"


    // $ANTLR start "rule__CommunicationObject__NameAssignment_1"
    // InternalCommunicationObject.g:3742:1: rule__CommunicationObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CommunicationObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3746:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:3747:2: ( RULE_ID )
            {
            // InternalCommunicationObject.g:3747:2: ( RULE_ID )
            // InternalCommunicationObject.g:3748:3: RULE_ID
            {
             before(grammarAccess.getCommunicationObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommunicationObjectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__NameAssignment_1"


    // $ANTLR start "rule__CommunicationObject__AttributesAssignment_3"
    // InternalCommunicationObject.g:3757:1: rule__CommunicationObject__AttributesAssignment_3 : ( ruleAttributeDefinition ) ;
    public final void rule__CommunicationObject__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3761:1: ( ( ruleAttributeDefinition ) )
            // InternalCommunicationObject.g:3762:2: ( ruleAttributeDefinition )
            {
            // InternalCommunicationObject.g:3762:2: ( ruleAttributeDefinition )
            // InternalCommunicationObject.g:3763:3: ruleAttributeDefinition
            {
             before(grammarAccess.getCommunicationObjectAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getCommunicationObjectAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__AttributesAssignment_3"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // InternalCommunicationObject.g:3772:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3776:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:3777:2: ( RULE_ID )
            {
            // InternalCommunicationObject.g:3777:2: ( RULE_ID )
            // InternalCommunicationObject.g:3778:3: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__EnumsAssignment_3"
    // InternalCommunicationObject.g:3787:1: rule__Enumeration__EnumsAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__Enumeration__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3791:1: ( ( ruleEnumerationElement ) )
            // InternalCommunicationObject.g:3792:2: ( ruleEnumerationElement )
            {
            // InternalCommunicationObject.g:3792:2: ( ruleEnumerationElement )
            // InternalCommunicationObject.g:3793:3: ruleEnumerationElement
            {
             before(grammarAccess.getEnumerationAccess().getEnumsEnumerationElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationElement();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getEnumsEnumerationElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__EnumsAssignment_3"


    // $ANTLR start "rule__CommElementReference__TypeNameAssignment_0"
    // InternalCommunicationObject.g:3802:1: rule__CommElementReference__TypeNameAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__CommElementReference__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3806:1: ( ( ( ruleFQN ) ) )
            // InternalCommunicationObject.g:3807:2: ( ( ruleFQN ) )
            {
            // InternalCommunicationObject.g:3807:2: ( ( ruleFQN ) )
            // InternalCommunicationObject.g:3808:3: ( ruleFQN )
            {
             before(grammarAccess.getCommElementReferenceAccess().getTypeNameAbstractCommElementCrossReference_0_0()); 
            // InternalCommunicationObject.g:3809:3: ( ruleFQN )
            // InternalCommunicationObject.g:3810:4: ruleFQN
            {
             before(grammarAccess.getCommElementReferenceAccess().getTypeNameAbstractCommElementFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCommElementReferenceAccess().getTypeNameAbstractCommElementFQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCommElementReferenceAccess().getTypeNameAbstractCommElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommElementReference__TypeNameAssignment_0"


    // $ANTLR start "rule__CommElementReference__ArrayAssignment_1"
    // InternalCommunicationObject.g:3821:1: rule__CommElementReference__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__CommElementReference__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3825:1: ( ( ruleArrayType ) )
            // InternalCommunicationObject.g:3826:2: ( ruleArrayType )
            {
            // InternalCommunicationObject.g:3826:2: ( ruleArrayType )
            // InternalCommunicationObject.g:3827:3: ruleArrayType
            {
             before(grammarAccess.getCommElementReferenceAccess().getArrayArrayTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getCommElementReferenceAccess().getArrayArrayTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommElementReference__ArrayAssignment_1"


    // $ANTLR start "rule__SingleValue__ValueAssignment_0_1"
    // InternalCommunicationObject.g:3836:1: rule__SingleValue__ValueAssignment_0_1 : ( ( ruleFQN ) ) ;
    public final void rule__SingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3840:1: ( ( ( ruleFQN ) ) )
            // InternalCommunicationObject.g:3841:2: ( ( ruleFQN ) )
            {
            // InternalCommunicationObject.g:3841:2: ( ( ruleFQN ) )
            // InternalCommunicationObject.g:3842:3: ( ruleFQN )
            {
             before(grammarAccess.getSingleValueAccess().getValueAbstractCommElementCrossReference_0_1_0()); 
            // InternalCommunicationObject.g:3843:3: ( ruleFQN )
            // InternalCommunicationObject.g:3844:4: ruleFQN
            {
             before(grammarAccess.getSingleValueAccess().getValueAbstractCommElementFQNParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSingleValueAccess().getValueAbstractCommElementFQNParserRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getSingleValueAccess().getValueAbstractCommElementCrossReference_0_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AttributeDefinition__NameAssignment_0"
    // InternalCommunicationObject.g:3855:1: rule__AttributeDefinition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttributeDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3859:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:3860:2: ( RULE_ID )
            {
            // InternalCommunicationObject.g:3860:2: ( RULE_ID )
            // InternalCommunicationObject.g:3861:3: RULE_ID
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
    // InternalCommunicationObject.g:3870:1: rule__AttributeDefinition__TypeAssignment_2 : ( ruleAbstractAttributeType ) ;
    public final void rule__AttributeDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3874:1: ( ( ruleAbstractAttributeType ) )
            // InternalCommunicationObject.g:3875:2: ( ruleAbstractAttributeType )
            {
            // InternalCommunicationObject.g:3875:2: ( ruleAbstractAttributeType )
            // InternalCommunicationObject.g:3876:3: ruleAbstractAttributeType
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
    // InternalCommunicationObject.g:3885:1: rule__AttributeDefinition__DefaultvalueAssignment_3_1 : ( ruleAbstractValue ) ;
    public final void rule__AttributeDefinition__DefaultvalueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3889:1: ( ( ruleAbstractValue ) )
            // InternalCommunicationObject.g:3890:2: ( ruleAbstractValue )
            {
            // InternalCommunicationObject.g:3890:2: ( ruleAbstractValue )
            // InternalCommunicationObject.g:3891:3: ruleAbstractValue
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
    // InternalCommunicationObject.g:3900:1: rule__EnumerationElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3904:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:3905:2: ( RULE_ID )
            {
            // InternalCommunicationObject.g:3905:2: ( RULE_ID )
            // InternalCommunicationObject.g:3906:3: RULE_ID
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
    // InternalCommunicationObject.g:3915:1: rule__EnumerationElement__ValueAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__EnumerationElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3919:1: ( ( ruleEInt ) )
            // InternalCommunicationObject.g:3920:2: ( ruleEInt )
            {
            // InternalCommunicationObject.g:3920:2: ( ruleEInt )
            // InternalCommunicationObject.g:3921:3: ruleEInt
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
    // InternalCommunicationObject.g:3930:1: rule__InlineEnumerationType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__InlineEnumerationType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3934:1: ( ( ruleArrayType ) )
            // InternalCommunicationObject.g:3935:2: ( ruleArrayType )
            {
            // InternalCommunicationObject.g:3935:2: ( ruleArrayType )
            // InternalCommunicationObject.g:3936:3: ruleArrayType
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
    // InternalCommunicationObject.g:3945:1: rule__InlineEnumerationType__EnumsAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__InlineEnumerationType__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3949:1: ( ( ruleEnumerationElement ) )
            // InternalCommunicationObject.g:3950:2: ( ruleEnumerationElement )
            {
            // InternalCommunicationObject.g:3950:2: ( ruleEnumerationElement )
            // InternalCommunicationObject.g:3951:3: ruleEnumerationElement
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
    // InternalCommunicationObject.g:3960:1: rule__ArrayType__LengthAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ArrayType__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3964:1: ( ( ruleCardinality ) )
            // InternalCommunicationObject.g:3965:2: ( ruleCardinality )
            {
            // InternalCommunicationObject.g:3965:2: ( ruleCardinality )
            // InternalCommunicationObject.g:3966:3: ruleCardinality
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
    // InternalCommunicationObject.g:3975:1: rule__PrimitiveType__TypeNameAssignment_0 : ( rulePRIMITIVE_TYPE_NAME ) ;
    public final void rule__PrimitiveType__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3979:1: ( ( rulePRIMITIVE_TYPE_NAME ) )
            // InternalCommunicationObject.g:3980:2: ( rulePRIMITIVE_TYPE_NAME )
            {
            // InternalCommunicationObject.g:3980:2: ( rulePRIMITIVE_TYPE_NAME )
            // InternalCommunicationObject.g:3981:3: rulePRIMITIVE_TYPE_NAME
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
    // InternalCommunicationObject.g:3990:1: rule__PrimitiveType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__PrimitiveType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3994:1: ( ( ruleArrayType ) )
            // InternalCommunicationObject.g:3995:2: ( ruleArrayType )
            {
            // InternalCommunicationObject.g:3995:2: ( ruleArrayType )
            // InternalCommunicationObject.g:3996:3: ruleArrayType
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
    // InternalCommunicationObject.g:4005:1: rule__ArrayValue__ValuesAssignment_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4009:1: ( ( ruleSingleValue ) )
            // InternalCommunicationObject.g:4010:2: ( ruleSingleValue )
            {
            // InternalCommunicationObject.g:4010:2: ( ruleSingleValue )
            // InternalCommunicationObject.g:4011:3: ruleSingleValue
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
    // InternalCommunicationObject.g:4020:1: rule__ArrayValue__ValuesAssignment_2_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4024:1: ( ( ruleSingleValue ) )
            // InternalCommunicationObject.g:4025:2: ( ruleSingleValue )
            {
            // InternalCommunicationObject.g:4025:2: ( ruleSingleValue )
            // InternalCommunicationObject.g:4026:3: ruleSingleValue
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


    // $ANTLR start "superSingleValue__ValueAssignment_0_1"
    // InternalCommunicationObject.g:4035:1: superSingleValue__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void superSingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4039:1: ( ( ruleEInt ) )
            // InternalCommunicationObject.g:4040:2: ( ruleEInt )
            {
            // InternalCommunicationObject.g:4040:2: ( ruleEInt )
            // InternalCommunicationObject.g:4041:3: ruleEInt
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEIntParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBasicAttributesSingleValueAccess().getValueEIntParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__ValueAssignment_0_1"


    // $ANTLR start "superSingleValue__ValueAssignment_1_1"
    // InternalCommunicationObject.g:4050:1: superSingleValue__ValueAssignment_1_1 : ( ruleEDouble ) ;
    public final void superSingleValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4054:1: ( ( ruleEDouble ) )
            // InternalCommunicationObject.g:4055:2: ( ruleEDouble )
            {
            // InternalCommunicationObject.g:4055:2: ( ruleEDouble )
            // InternalCommunicationObject.g:4056:3: ruleEDouble
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getBasicAttributesSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__ValueAssignment_1_1"


    // $ANTLR start "superSingleValue__ValueAssignment_2_1"
    // InternalCommunicationObject.g:4065:1: superSingleValue__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void superSingleValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4069:1: ( ( ruleEString ) )
            // InternalCommunicationObject.g:4070:2: ( ruleEString )
            {
            // InternalCommunicationObject.g:4070:2: ( ruleEString )
            // InternalCommunicationObject.g:4071:3: ruleEString
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBasicAttributesSingleValueAccess().getValueEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__ValueAssignment_2_1"


    // $ANTLR start "superSingleValue__ValueAssignment_3_1"
    // InternalCommunicationObject.g:4080:1: superSingleValue__ValueAssignment_3_1 : ( ruleEBoolean ) ;
    public final void superSingleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4084:1: ( ( ruleEBoolean ) )
            // InternalCommunicationObject.g:4085:2: ( ruleEBoolean )
            {
            // InternalCommunicationObject.g:4085:2: ( ruleEBoolean )
            // InternalCommunicationObject.g:4086:3: ruleEBoolean
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBasicAttributesSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__ValueAssignment_3_1"


    // $ANTLR start "superSingleValue__ValueAssignment_4_1"
    // InternalCommunicationObject.g:4095:1: superSingleValue__ValueAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void superSingleValue__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4099:1: ( ( ( ruleFQN ) ) )
            // InternalCommunicationObject.g:4100:2: ( ( ruleFQN ) )
            {
            // InternalCommunicationObject.g:4100:2: ( ( ruleFQN ) )
            // InternalCommunicationObject.g:4101:3: ( ruleFQN )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 
            // InternalCommunicationObject.g:4102:3: ( ruleFQN )
            // InternalCommunicationObject.g:4103:4: ruleFQN
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEnumerationElementFQNParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getBasicAttributesSingleValueAccess().getValueEnumerationElementFQNParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getBasicAttributesSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "superSingleValue__ValueAssignment_4_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\uffff\1\2\3\uffff\1\2";
    static final String dfa_3s = "\1\4\1\6\1\uffff\1\6\1\uffff\1\6";
    static final String dfa_4s = "\1\53\1\57\1\uffff\1\6\1\uffff\1\57";
    static final String dfa_5s = "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\2\2\1\1\4\uffff\2\2\27\uffff\1\2\6\uffff\1\2",
            "\1\2\27\uffff\1\2\2\uffff\1\2\2\uffff\1\3\2\uffff\1\4\6\uffff\2\2",
            "",
            "\1\5",
            "",
            "\1\2\27\uffff\1\2\2\uffff\1\2\2\uffff\1\3\2\uffff\1\4\6\uffff\2\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "801:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( superSingleValue ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000006A00000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000010000FFF0040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000281000001870L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000081000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000008020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000081000001870L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001800L});

}