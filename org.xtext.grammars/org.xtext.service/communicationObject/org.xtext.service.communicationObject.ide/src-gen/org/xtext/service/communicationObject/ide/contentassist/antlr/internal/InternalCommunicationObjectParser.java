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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOCU_COMMENT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'*'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'", "'.*'", "'#import'", "';'", "'CommObjectsRepository'", "'{'", "'}'", "'version'", "'Dependency'", "'.'", "'CommObject'", "'Enumeration'", "'('", "')'", "':'", "'='", "'-'", "'InlineEnumeration'", "'['", "']'", "','"
    };
    public static final int T__50=50;
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
    public static final int T__48=48;
    public static final int T__49=49;
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
    // InternalCommunicationObject.g:68:1: entryRuleCommObjectModel : ruleCommObjectModel EOF ;
    public final void entryRuleCommObjectModel() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:69:1: ( ruleCommObjectModel EOF )
            // InternalCommunicationObject.g:70:1: ruleCommObjectModel EOF
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
    // InternalCommunicationObject.g:77:1: ruleCommObjectModel : ( ( rule__CommObjectModel__Group__0 ) ) ;
    public final void ruleCommObjectModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:81:2: ( ( ( rule__CommObjectModel__Group__0 ) ) )
            // InternalCommunicationObject.g:82:2: ( ( rule__CommObjectModel__Group__0 ) )
            {
            // InternalCommunicationObject.g:82:2: ( ( rule__CommObjectModel__Group__0 ) )
            // InternalCommunicationObject.g:83:3: ( rule__CommObjectModel__Group__0 )
            {
             before(grammarAccess.getCommObjectModelAccess().getGroup()); 
            // InternalCommunicationObject.g:84:3: ( rule__CommObjectModel__Group__0 )
            // InternalCommunicationObject.g:84:4: rule__CommObjectModel__Group__0
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
    // InternalCommunicationObject.g:93:1: entryRuleFQNW : ruleFQNW EOF ;
    public final void entryRuleFQNW() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:94:1: ( ruleFQNW EOF )
            // InternalCommunicationObject.g:95:1: ruleFQNW EOF
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
    // InternalCommunicationObject.g:102:1: ruleFQNW : ( ( rule__FQNW__Group__0 ) ) ;
    public final void ruleFQNW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:106:2: ( ( ( rule__FQNW__Group__0 ) ) )
            // InternalCommunicationObject.g:107:2: ( ( rule__FQNW__Group__0 ) )
            {
            // InternalCommunicationObject.g:107:2: ( ( rule__FQNW__Group__0 ) )
            // InternalCommunicationObject.g:108:3: ( rule__FQNW__Group__0 )
            {
             before(grammarAccess.getFQNWAccess().getGroup()); 
            // InternalCommunicationObject.g:109:3: ( rule__FQNW__Group__0 )
            // InternalCommunicationObject.g:109:4: rule__FQNW__Group__0
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
    // InternalCommunicationObject.g:118:1: entryRuleCommRepositoryImport : ruleCommRepositoryImport EOF ;
    public final void entryRuleCommRepositoryImport() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:119:1: ( ruleCommRepositoryImport EOF )
            // InternalCommunicationObject.g:120:1: ruleCommRepositoryImport EOF
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
    // InternalCommunicationObject.g:127:1: ruleCommRepositoryImport : ( ( rule__CommRepositoryImport__Group__0 ) ) ;
    public final void ruleCommRepositoryImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:131:2: ( ( ( rule__CommRepositoryImport__Group__0 ) ) )
            // InternalCommunicationObject.g:132:2: ( ( rule__CommRepositoryImport__Group__0 ) )
            {
            // InternalCommunicationObject.g:132:2: ( ( rule__CommRepositoryImport__Group__0 ) )
            // InternalCommunicationObject.g:133:3: ( rule__CommRepositoryImport__Group__0 )
            {
             before(grammarAccess.getCommRepositoryImportAccess().getGroup()); 
            // InternalCommunicationObject.g:134:3: ( rule__CommRepositoryImport__Group__0 )
            // InternalCommunicationObject.g:134:4: rule__CommRepositoryImport__Group__0
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
    // InternalCommunicationObject.g:143:1: entryRuleCommObjectsRepository : ruleCommObjectsRepository EOF ;
    public final void entryRuleCommObjectsRepository() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:144:1: ( ruleCommObjectsRepository EOF )
            // InternalCommunicationObject.g:145:1: ruleCommObjectsRepository EOF
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
    // InternalCommunicationObject.g:152:1: ruleCommObjectsRepository : ( ( rule__CommObjectsRepository__Group__0 ) ) ;
    public final void ruleCommObjectsRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:156:2: ( ( ( rule__CommObjectsRepository__Group__0 ) ) )
            // InternalCommunicationObject.g:157:2: ( ( rule__CommObjectsRepository__Group__0 ) )
            {
            // InternalCommunicationObject.g:157:2: ( ( rule__CommObjectsRepository__Group__0 ) )
            // InternalCommunicationObject.g:158:3: ( rule__CommObjectsRepository__Group__0 )
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getGroup()); 
            // InternalCommunicationObject.g:159:3: ( rule__CommObjectsRepository__Group__0 )
            // InternalCommunicationObject.g:159:4: rule__CommObjectsRepository__Group__0
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
    // InternalCommunicationObject.g:168:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:169:1: ( ruleVersion EOF )
            // InternalCommunicationObject.g:170:1: ruleVersion EOF
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
    // InternalCommunicationObject.g:177:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:181:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalCommunicationObject.g:182:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalCommunicationObject.g:182:2: ( ( rule__Version__Group__0 ) )
            // InternalCommunicationObject.g:183:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalCommunicationObject.g:184:3: ( rule__Version__Group__0 )
            // InternalCommunicationObject.g:184:4: rule__Version__Group__0
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
    // InternalCommunicationObject.g:193:1: entryRuleAbstractCommElement : ruleAbstractCommElement EOF ;
    public final void entryRuleAbstractCommElement() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:194:1: ( ruleAbstractCommElement EOF )
            // InternalCommunicationObject.g:195:1: ruleAbstractCommElement EOF
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
    // InternalCommunicationObject.g:202:1: ruleAbstractCommElement : ( ( rule__AbstractCommElement__Alternatives ) ) ;
    public final void ruleAbstractCommElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:206:2: ( ( ( rule__AbstractCommElement__Alternatives ) ) )
            // InternalCommunicationObject.g:207:2: ( ( rule__AbstractCommElement__Alternatives ) )
            {
            // InternalCommunicationObject.g:207:2: ( ( rule__AbstractCommElement__Alternatives ) )
            // InternalCommunicationObject.g:208:3: ( rule__AbstractCommElement__Alternatives )
            {
             before(grammarAccess.getAbstractCommElementAccess().getAlternatives()); 
            // InternalCommunicationObject.g:209:3: ( rule__AbstractCommElement__Alternatives )
            // InternalCommunicationObject.g:209:4: rule__AbstractCommElement__Alternatives
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
    // InternalCommunicationObject.g:218:1: entryRuleCommunicationObject : ruleCommunicationObject EOF ;
    public final void entryRuleCommunicationObject() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:219:1: ( ruleCommunicationObject EOF )
            // InternalCommunicationObject.g:220:1: ruleCommunicationObject EOF
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
    // InternalCommunicationObject.g:227:1: ruleCommunicationObject : ( ( rule__CommunicationObject__Group__0 ) ) ;
    public final void ruleCommunicationObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:231:2: ( ( ( rule__CommunicationObject__Group__0 ) ) )
            // InternalCommunicationObject.g:232:2: ( ( rule__CommunicationObject__Group__0 ) )
            {
            // InternalCommunicationObject.g:232:2: ( ( rule__CommunicationObject__Group__0 ) )
            // InternalCommunicationObject.g:233:3: ( rule__CommunicationObject__Group__0 )
            {
             before(grammarAccess.getCommunicationObjectAccess().getGroup()); 
            // InternalCommunicationObject.g:234:3: ( rule__CommunicationObject__Group__0 )
            // InternalCommunicationObject.g:234:4: rule__CommunicationObject__Group__0
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
    // InternalCommunicationObject.g:243:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:244:1: ( ruleEnumeration EOF )
            // InternalCommunicationObject.g:245:1: ruleEnumeration EOF
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
    // InternalCommunicationObject.g:252:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:256:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalCommunicationObject.g:257:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalCommunicationObject.g:257:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalCommunicationObject.g:258:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalCommunicationObject.g:259:3: ( rule__Enumeration__Group__0 )
            // InternalCommunicationObject.g:259:4: rule__Enumeration__Group__0
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
    // InternalCommunicationObject.g:268:1: entryRuleAbstractAttributeType : ruleAbstractAttributeType EOF ;
    public final void entryRuleAbstractAttributeType() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:269:1: ( ruleAbstractAttributeType EOF )
            // InternalCommunicationObject.g:270:1: ruleAbstractAttributeType EOF
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
    // InternalCommunicationObject.g:277:1: ruleAbstractAttributeType : ( ( rule__AbstractAttributeType__Alternatives ) ) ;
    public final void ruleAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:281:2: ( ( ( rule__AbstractAttributeType__Alternatives ) ) )
            // InternalCommunicationObject.g:282:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            {
            // InternalCommunicationObject.g:282:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            // InternalCommunicationObject.g:283:3: ( rule__AbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalCommunicationObject.g:284:3: ( rule__AbstractAttributeType__Alternatives )
            // InternalCommunicationObject.g:284:4: rule__AbstractAttributeType__Alternatives
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
    // InternalCommunicationObject.g:293:1: entryRuleCommElementReference : ruleCommElementReference EOF ;
    public final void entryRuleCommElementReference() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:294:1: ( ruleCommElementReference EOF )
            // InternalCommunicationObject.g:295:1: ruleCommElementReference EOF
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
    // InternalCommunicationObject.g:302:1: ruleCommElementReference : ( ( rule__CommElementReference__Group__0 ) ) ;
    public final void ruleCommElementReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:306:2: ( ( ( rule__CommElementReference__Group__0 ) ) )
            // InternalCommunicationObject.g:307:2: ( ( rule__CommElementReference__Group__0 ) )
            {
            // InternalCommunicationObject.g:307:2: ( ( rule__CommElementReference__Group__0 ) )
            // InternalCommunicationObject.g:308:3: ( rule__CommElementReference__Group__0 )
            {
             before(grammarAccess.getCommElementReferenceAccess().getGroup()); 
            // InternalCommunicationObject.g:309:3: ( rule__CommElementReference__Group__0 )
            // InternalCommunicationObject.g:309:4: rule__CommElementReference__Group__0
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
    // InternalCommunicationObject.g:318:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:319:1: ( ruleSingleValue EOF )
            // InternalCommunicationObject.g:320:1: ruleSingleValue EOF
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
    // InternalCommunicationObject.g:327:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:331:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalCommunicationObject.g:332:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalCommunicationObject.g:332:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalCommunicationObject.g:333:3: ( rule__SingleValue__Alternatives )
            {
             before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            // InternalCommunicationObject.g:334:3: ( rule__SingleValue__Alternatives )
            // InternalCommunicationObject.g:334:4: rule__SingleValue__Alternatives
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
    // InternalCommunicationObject.g:343:1: entryRuleAttributeDefinition : ruleAttributeDefinition EOF ;
    public final void entryRuleAttributeDefinition() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:344:1: ( ruleAttributeDefinition EOF )
            // InternalCommunicationObject.g:345:1: ruleAttributeDefinition EOF
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
    // InternalCommunicationObject.g:352:1: ruleAttributeDefinition : ( ( rule__AttributeDefinition__Group__0 ) ) ;
    public final void ruleAttributeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:356:2: ( ( ( rule__AttributeDefinition__Group__0 ) ) )
            // InternalCommunicationObject.g:357:2: ( ( rule__AttributeDefinition__Group__0 ) )
            {
            // InternalCommunicationObject.g:357:2: ( ( rule__AttributeDefinition__Group__0 ) )
            // InternalCommunicationObject.g:358:3: ( rule__AttributeDefinition__Group__0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup()); 
            // InternalCommunicationObject.g:359:3: ( rule__AttributeDefinition__Group__0 )
            // InternalCommunicationObject.g:359:4: rule__AttributeDefinition__Group__0
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
    // InternalCommunicationObject.g:368:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:369:1: ( ruleFQN EOF )
            // InternalCommunicationObject.g:370:1: ruleFQN EOF
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
    // InternalCommunicationObject.g:377:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:381:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalCommunicationObject.g:382:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalCommunicationObject.g:382:2: ( ( rule__FQN__Group__0 ) )
            // InternalCommunicationObject.g:383:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalCommunicationObject.g:384:3: ( rule__FQN__Group__0 )
            // InternalCommunicationObject.g:384:4: rule__FQN__Group__0
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
    // InternalCommunicationObject.g:393:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:394:1: ( ruleEBoolean EOF )
            // InternalCommunicationObject.g:395:1: ruleEBoolean EOF
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
    // InternalCommunicationObject.g:402:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:406:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalCommunicationObject.g:407:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalCommunicationObject.g:407:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalCommunicationObject.g:408:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalCommunicationObject.g:409:3: ( rule__EBoolean__Alternatives )
            // InternalCommunicationObject.g:409:4: rule__EBoolean__Alternatives
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
    // InternalCommunicationObject.g:418:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:419:1: ( ruleEString EOF )
            // InternalCommunicationObject.g:420:1: ruleEString EOF
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
    // InternalCommunicationObject.g:427:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:431:2: ( ( RULE_STRING ) )
            // InternalCommunicationObject.g:432:2: ( RULE_STRING )
            {
            // InternalCommunicationObject.g:432:2: ( RULE_STRING )
            // InternalCommunicationObject.g:433:3: RULE_STRING
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
    // InternalCommunicationObject.g:443:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:444:1: ( ruleEInt EOF )
            // InternalCommunicationObject.g:445:1: ruleEInt EOF
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
    // InternalCommunicationObject.g:452:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:456:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalCommunicationObject.g:457:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalCommunicationObject.g:457:2: ( ( rule__EInt__Group__0 ) )
            // InternalCommunicationObject.g:458:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalCommunicationObject.g:459:3: ( rule__EInt__Group__0 )
            // InternalCommunicationObject.g:459:4: rule__EInt__Group__0
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
    // InternalCommunicationObject.g:468:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:469:1: ( ruleEDouble EOF )
            // InternalCommunicationObject.g:470:1: ruleEDouble EOF
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
    // InternalCommunicationObject.g:477:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:481:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalCommunicationObject.g:482:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalCommunicationObject.g:482:2: ( ( rule__EDouble__Group__0 ) )
            // InternalCommunicationObject.g:483:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalCommunicationObject.g:484:3: ( rule__EDouble__Group__0 )
            // InternalCommunicationObject.g:484:4: rule__EDouble__Group__0
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
    // InternalCommunicationObject.g:493:1: entryRuleEnumerationElement : ruleEnumerationElement EOF ;
    public final void entryRuleEnumerationElement() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:494:1: ( ruleEnumerationElement EOF )
            // InternalCommunicationObject.g:495:1: ruleEnumerationElement EOF
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
    // InternalCommunicationObject.g:502:1: ruleEnumerationElement : ( ( rule__EnumerationElement__Group__0 ) ) ;
    public final void ruleEnumerationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:506:2: ( ( ( rule__EnumerationElement__Group__0 ) ) )
            // InternalCommunicationObject.g:507:2: ( ( rule__EnumerationElement__Group__0 ) )
            {
            // InternalCommunicationObject.g:507:2: ( ( rule__EnumerationElement__Group__0 ) )
            // InternalCommunicationObject.g:508:3: ( rule__EnumerationElement__Group__0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup()); 
            // InternalCommunicationObject.g:509:3: ( rule__EnumerationElement__Group__0 )
            // InternalCommunicationObject.g:509:4: rule__EnumerationElement__Group__0
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
    // InternalCommunicationObject.g:518:1: entrySuperAbstractAttributeType : superAbstractAttributeType EOF ;
    public final void entrySuperAbstractAttributeType() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:519:1: ( superAbstractAttributeType EOF )
            // InternalCommunicationObject.g:520:1: superAbstractAttributeType EOF
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
    // InternalCommunicationObject.g:527:1: superAbstractAttributeType : ( ( superAbstractAttributeType__Alternatives ) ) ;
    public final void superAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:531:2: ( ( ( superAbstractAttributeType__Alternatives ) ) )
            // InternalCommunicationObject.g:532:2: ( ( superAbstractAttributeType__Alternatives ) )
            {
            // InternalCommunicationObject.g:532:2: ( ( superAbstractAttributeType__Alternatives ) )
            // InternalCommunicationObject.g:533:3: ( superAbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getBasicAttributesAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalCommunicationObject.g:534:3: ( superAbstractAttributeType__Alternatives )
            // InternalCommunicationObject.g:534:4: superAbstractAttributeType__Alternatives
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
    // InternalCommunicationObject.g:543:1: entryRuleInlineEnumerationType : ruleInlineEnumerationType EOF ;
    public final void entryRuleInlineEnumerationType() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:544:1: ( ruleInlineEnumerationType EOF )
            // InternalCommunicationObject.g:545:1: ruleInlineEnumerationType EOF
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
    // InternalCommunicationObject.g:552:1: ruleInlineEnumerationType : ( ( rule__InlineEnumerationType__Group__0 ) ) ;
    public final void ruleInlineEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:556:2: ( ( ( rule__InlineEnumerationType__Group__0 ) ) )
            // InternalCommunicationObject.g:557:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            {
            // InternalCommunicationObject.g:557:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            // InternalCommunicationObject.g:558:3: ( rule__InlineEnumerationType__Group__0 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); 
            // InternalCommunicationObject.g:559:3: ( rule__InlineEnumerationType__Group__0 )
            // InternalCommunicationObject.g:559:4: rule__InlineEnumerationType__Group__0
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
    // InternalCommunicationObject.g:568:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:569:1: ( ruleArrayType EOF )
            // InternalCommunicationObject.g:570:1: ruleArrayType EOF
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
    // InternalCommunicationObject.g:577:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:581:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalCommunicationObject.g:582:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalCommunicationObject.g:582:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalCommunicationObject.g:583:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalCommunicationObject.g:584:3: ( rule__ArrayType__Group__0 )
            // InternalCommunicationObject.g:584:4: rule__ArrayType__Group__0
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
    // InternalCommunicationObject.g:593:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:594:1: ( ruleCardinality EOF )
            // InternalCommunicationObject.g:595:1: ruleCardinality EOF
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
    // InternalCommunicationObject.g:602:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:606:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalCommunicationObject.g:607:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalCommunicationObject.g:607:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalCommunicationObject.g:608:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalCommunicationObject.g:609:3: ( rule__Cardinality__Alternatives )
            // InternalCommunicationObject.g:609:4: rule__Cardinality__Alternatives
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
    // InternalCommunicationObject.g:618:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:619:1: ( rulePrimitiveType EOF )
            // InternalCommunicationObject.g:620:1: rulePrimitiveType EOF
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
    // InternalCommunicationObject.g:627:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:631:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalCommunicationObject.g:632:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalCommunicationObject.g:632:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalCommunicationObject.g:633:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalCommunicationObject.g:634:3: ( rule__PrimitiveType__Group__0 )
            // InternalCommunicationObject.g:634:4: rule__PrimitiveType__Group__0
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
    // InternalCommunicationObject.g:643:1: entryRuleAbstractValue : ruleAbstractValue EOF ;
    public final void entryRuleAbstractValue() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:644:1: ( ruleAbstractValue EOF )
            // InternalCommunicationObject.g:645:1: ruleAbstractValue EOF
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
    // InternalCommunicationObject.g:652:1: ruleAbstractValue : ( ( rule__AbstractValue__Alternatives ) ) ;
    public final void ruleAbstractValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:656:2: ( ( ( rule__AbstractValue__Alternatives ) ) )
            // InternalCommunicationObject.g:657:2: ( ( rule__AbstractValue__Alternatives ) )
            {
            // InternalCommunicationObject.g:657:2: ( ( rule__AbstractValue__Alternatives ) )
            // InternalCommunicationObject.g:658:3: ( rule__AbstractValue__Alternatives )
            {
             before(grammarAccess.getAbstractValueAccess().getAlternatives()); 
            // InternalCommunicationObject.g:659:3: ( rule__AbstractValue__Alternatives )
            // InternalCommunicationObject.g:659:4: rule__AbstractValue__Alternatives
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
    // InternalCommunicationObject.g:668:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:669:1: ( ruleArrayValue EOF )
            // InternalCommunicationObject.g:670:1: ruleArrayValue EOF
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
    // InternalCommunicationObject.g:677:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:681:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalCommunicationObject.g:682:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalCommunicationObject.g:682:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalCommunicationObject.g:683:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalCommunicationObject.g:684:3: ( rule__ArrayValue__Group__0 )
            // InternalCommunicationObject.g:684:4: rule__ArrayValue__Group__0
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
    // InternalCommunicationObject.g:693:1: entrySuperSingleValue : superSingleValue EOF ;
    public final void entrySuperSingleValue() throws RecognitionException {
        try {
            // InternalCommunicationObject.g:694:1: ( superSingleValue EOF )
            // InternalCommunicationObject.g:695:1: superSingleValue EOF
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
    // InternalCommunicationObject.g:702:1: superSingleValue : ( ( superSingleValue__Alternatives ) ) ;
    public final void superSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:706:2: ( ( ( superSingleValue__Alternatives ) ) )
            // InternalCommunicationObject.g:707:2: ( ( superSingleValue__Alternatives ) )
            {
            // InternalCommunicationObject.g:707:2: ( ( superSingleValue__Alternatives ) )
            // InternalCommunicationObject.g:708:3: ( superSingleValue__Alternatives )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getAlternatives()); 
            // InternalCommunicationObject.g:709:3: ( superSingleValue__Alternatives )
            // InternalCommunicationObject.g:709:4: superSingleValue__Alternatives
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
    // InternalCommunicationObject.g:718:1: rulePRIMITIVE_TYPE_NAME : ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) ;
    public final void rulePRIMITIVE_TYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:722:1: ( ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) )
            // InternalCommunicationObject.g:723:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            {
            // InternalCommunicationObject.g:723:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            // InternalCommunicationObject.g:724:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            {
             before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); 
            // InternalCommunicationObject.g:725:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            // InternalCommunicationObject.g:725:4: rule__PRIMITIVE_TYPE_NAME__Alternatives
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
    // InternalCommunicationObject.g:733:1: rule__AbstractCommElement__Alternatives : ( ( ruleEnumeration ) | ( ruleCommunicationObject ) );
    public final void rule__AbstractCommElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:737:1: ( ( ruleEnumeration ) | ( ruleCommunicationObject ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==41) ) {
                    alt1=1;
                }
                else if ( (LA1_1==40) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCommunicationObject.g:738:2: ( ruleEnumeration )
                    {
                    // InternalCommunicationObject.g:738:2: ( ruleEnumeration )
                    // InternalCommunicationObject.g:739:3: ruleEnumeration
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
                    // InternalCommunicationObject.g:744:2: ( ruleCommunicationObject )
                    {
                    // InternalCommunicationObject.g:744:2: ( ruleCommunicationObject )
                    // InternalCommunicationObject.g:745:3: ruleCommunicationObject
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
    // InternalCommunicationObject.g:754:1: rule__AbstractAttributeType__Alternatives : ( ( ruleCommElementReference ) | ( superAbstractAttributeType ) );
    public final void rule__AbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:758:1: ( ( ruleCommElementReference ) | ( superAbstractAttributeType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=19 && LA2_0<=30)||LA2_0==47) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCommunicationObject.g:759:2: ( ruleCommElementReference )
                    {
                    // InternalCommunicationObject.g:759:2: ( ruleCommElementReference )
                    // InternalCommunicationObject.g:760:3: ruleCommElementReference
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
                    // InternalCommunicationObject.g:765:2: ( superAbstractAttributeType )
                    {
                    // InternalCommunicationObject.g:765:2: ( superAbstractAttributeType )
                    // InternalCommunicationObject.g:766:3: superAbstractAttributeType
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
    // InternalCommunicationObject.g:775:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( superSingleValue ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:779:1: ( ( ( rule__SingleValue__Group_0__0 ) ) | ( superSingleValue ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalCommunicationObject.g:780:2: ( ( rule__SingleValue__Group_0__0 ) )
                    {
                    // InternalCommunicationObject.g:780:2: ( ( rule__SingleValue__Group_0__0 ) )
                    // InternalCommunicationObject.g:781:3: ( rule__SingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_0()); 
                    // InternalCommunicationObject.g:782:3: ( rule__SingleValue__Group_0__0 )
                    // InternalCommunicationObject.g:782:4: rule__SingleValue__Group_0__0
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
                    // InternalCommunicationObject.g:786:2: ( superSingleValue )
                    {
                    // InternalCommunicationObject.g:786:2: ( superSingleValue )
                    // InternalCommunicationObject.g:787:3: superSingleValue
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
    // InternalCommunicationObject.g:796:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:800:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
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
                    // InternalCommunicationObject.g:801:2: ( 'true' )
                    {
                    // InternalCommunicationObject.g:801:2: ( 'true' )
                    // InternalCommunicationObject.g:802:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:807:2: ( 'false' )
                    {
                    // InternalCommunicationObject.g:807:2: ( 'false' )
                    // InternalCommunicationObject.g:808:3: 'false'
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
    // InternalCommunicationObject.g:817:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:821:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCommunicationObject.g:822:2: ( 'E' )
                    {
                    // InternalCommunicationObject.g:822:2: ( 'E' )
                    // InternalCommunicationObject.g:823:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:828:2: ( 'e' )
                    {
                    // InternalCommunicationObject.g:828:2: ( 'e' )
                    // InternalCommunicationObject.g:829:3: 'e'
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


    // $ANTLR start "superAbstractAttributeType__Alternatives"
    // InternalCommunicationObject.g:838:1: superAbstractAttributeType__Alternatives : ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) );
    public final void superAbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:842:1: ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=19 && LA6_0<=30)) ) {
                alt6=1;
            }
            else if ( (LA6_0==47) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCommunicationObject.g:843:2: ( rulePrimitiveType )
                    {
                    // InternalCommunicationObject.g:843:2: ( rulePrimitiveType )
                    // InternalCommunicationObject.g:844:3: rulePrimitiveType
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
                    // InternalCommunicationObject.g:849:2: ( ruleInlineEnumerationType )
                    {
                    // InternalCommunicationObject.g:849:2: ( ruleInlineEnumerationType )
                    // InternalCommunicationObject.g:850:3: ruleInlineEnumerationType
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
    // InternalCommunicationObject.g:859:1: rule__Cardinality__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:863:1: ( ( RULE_INT ) | ( '*' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCommunicationObject.g:864:2: ( RULE_INT )
                    {
                    // InternalCommunicationObject.g:864:2: ( RULE_INT )
                    // InternalCommunicationObject.g:865:3: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:870:2: ( '*' )
                    {
                    // InternalCommunicationObject.g:870:2: ( '*' )
                    // InternalCommunicationObject.g:871:3: '*'
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
    // InternalCommunicationObject.g:880:1: rule__AbstractValue__Alternatives : ( ( ruleSingleValue ) | ( ruleArrayValue ) );
    public final void rule__AbstractValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:884:1: ( ( ruleSingleValue ) | ( ruleArrayValue ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||(LA8_0>=14 && LA8_0<=15)||LA8_0==39||LA8_0==46) ) {
                alt8=1;
            }
            else if ( (LA8_0==48) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCommunicationObject.g:885:2: ( ruleSingleValue )
                    {
                    // InternalCommunicationObject.g:885:2: ( ruleSingleValue )
                    // InternalCommunicationObject.g:886:3: ruleSingleValue
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
                    // InternalCommunicationObject.g:891:2: ( ruleArrayValue )
                    {
                    // InternalCommunicationObject.g:891:2: ( ruleArrayValue )
                    // InternalCommunicationObject.g:892:3: ruleArrayValue
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
    // InternalCommunicationObject.g:901:1: superSingleValue__Alternatives : ( ( ( superSingleValue__Group_0__0 ) ) | ( ( superSingleValue__Group_1__0 ) ) | ( ( superSingleValue__Group_2__0 ) ) | ( ( superSingleValue__Group_3__0 ) ) | ( ( superSingleValue__Group_4__0 ) ) );
    public final void superSingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:905:1: ( ( ( superSingleValue__Group_0__0 ) ) | ( ( superSingleValue__Group_1__0 ) ) | ( ( superSingleValue__Group_2__0 ) ) | ( ( superSingleValue__Group_3__0 ) ) | ( ( superSingleValue__Group_4__0 ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_INT) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==39) ) {
                        alt9=2;
                    }
                    else if ( (LA9_2==EOF||(LA9_2>=RULE_ID && LA9_2<=RULE_DOCU_COMMENT)||LA9_2==33||LA9_2==36||(LA9_2>=49 && LA9_2<=50)) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA9_1==39) ) {
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

                if ( (LA9_2==39) ) {
                    alt9=2;
                }
                else if ( (LA9_2==EOF||(LA9_2>=RULE_ID && LA9_2<=RULE_DOCU_COMMENT)||LA9_2==33||LA9_2==36||(LA9_2>=49 && LA9_2<=50)) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case 14:
            case 15:
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
                    // InternalCommunicationObject.g:906:2: ( ( superSingleValue__Group_0__0 ) )
                    {
                    // InternalCommunicationObject.g:906:2: ( ( superSingleValue__Group_0__0 ) )
                    // InternalCommunicationObject.g:907:3: ( superSingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_0()); 
                    // InternalCommunicationObject.g:908:3: ( superSingleValue__Group_0__0 )
                    // InternalCommunicationObject.g:908:4: superSingleValue__Group_0__0
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
                    // InternalCommunicationObject.g:912:2: ( ( superSingleValue__Group_1__0 ) )
                    {
                    // InternalCommunicationObject.g:912:2: ( ( superSingleValue__Group_1__0 ) )
                    // InternalCommunicationObject.g:913:3: ( superSingleValue__Group_1__0 )
                    {
                     before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_1()); 
                    // InternalCommunicationObject.g:914:3: ( superSingleValue__Group_1__0 )
                    // InternalCommunicationObject.g:914:4: superSingleValue__Group_1__0
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
                    // InternalCommunicationObject.g:918:2: ( ( superSingleValue__Group_2__0 ) )
                    {
                    // InternalCommunicationObject.g:918:2: ( ( superSingleValue__Group_2__0 ) )
                    // InternalCommunicationObject.g:919:3: ( superSingleValue__Group_2__0 )
                    {
                     before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_2()); 
                    // InternalCommunicationObject.g:920:3: ( superSingleValue__Group_2__0 )
                    // InternalCommunicationObject.g:920:4: superSingleValue__Group_2__0
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
                    // InternalCommunicationObject.g:924:2: ( ( superSingleValue__Group_3__0 ) )
                    {
                    // InternalCommunicationObject.g:924:2: ( ( superSingleValue__Group_3__0 ) )
                    // InternalCommunicationObject.g:925:3: ( superSingleValue__Group_3__0 )
                    {
                     before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_3()); 
                    // InternalCommunicationObject.g:926:3: ( superSingleValue__Group_3__0 )
                    // InternalCommunicationObject.g:926:4: superSingleValue__Group_3__0
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
                    // InternalCommunicationObject.g:930:2: ( ( superSingleValue__Group_4__0 ) )
                    {
                    // InternalCommunicationObject.g:930:2: ( ( superSingleValue__Group_4__0 ) )
                    // InternalCommunicationObject.g:931:3: ( superSingleValue__Group_4__0 )
                    {
                     before(grammarAccess.getBasicAttributesSingleValueAccess().getGroup_4()); 
                    // InternalCommunicationObject.g:932:3: ( superSingleValue__Group_4__0 )
                    // InternalCommunicationObject.g:932:4: superSingleValue__Group_4__0
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
    // InternalCommunicationObject.g:940:1: rule__PRIMITIVE_TYPE_NAME__Alternatives : ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PRIMITIVE_TYPE_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:944:1: ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) )
            int alt10=12;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            case 23:
                {
                alt10=5;
                }
                break;
            case 24:
                {
                alt10=6;
                }
                break;
            case 25:
                {
                alt10=7;
                }
                break;
            case 26:
                {
                alt10=8;
                }
                break;
            case 27:
                {
                alt10=9;
                }
                break;
            case 28:
                {
                alt10=10;
                }
                break;
            case 29:
                {
                alt10=11;
                }
                break;
            case 30:
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
                    // InternalCommunicationObject.g:945:2: ( ( 'Int8' ) )
                    {
                    // InternalCommunicationObject.g:945:2: ( ( 'Int8' ) )
                    // InternalCommunicationObject.g:946:3: ( 'Int8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 
                    // InternalCommunicationObject.g:947:3: ( 'Int8' )
                    // InternalCommunicationObject.g:947:4: 'Int8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCommunicationObject.g:951:2: ( ( 'Int16' ) )
                    {
                    // InternalCommunicationObject.g:951:2: ( ( 'Int16' ) )
                    // InternalCommunicationObject.g:952:3: ( 'Int16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 
                    // InternalCommunicationObject.g:953:3: ( 'Int16' )
                    // InternalCommunicationObject.g:953:4: 'Int16'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCommunicationObject.g:957:2: ( ( 'Int32' ) )
                    {
                    // InternalCommunicationObject.g:957:2: ( ( 'Int32' ) )
                    // InternalCommunicationObject.g:958:3: ( 'Int32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 
                    // InternalCommunicationObject.g:959:3: ( 'Int32' )
                    // InternalCommunicationObject.g:959:4: 'Int32'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCommunicationObject.g:963:2: ( ( 'Int64' ) )
                    {
                    // InternalCommunicationObject.g:963:2: ( ( 'Int64' ) )
                    // InternalCommunicationObject.g:964:3: ( 'Int64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 
                    // InternalCommunicationObject.g:965:3: ( 'Int64' )
                    // InternalCommunicationObject.g:965:4: 'Int64'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCommunicationObject.g:969:2: ( ( 'UInt8' ) )
                    {
                    // InternalCommunicationObject.g:969:2: ( ( 'UInt8' ) )
                    // InternalCommunicationObject.g:970:3: ( 'UInt8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 
                    // InternalCommunicationObject.g:971:3: ( 'UInt8' )
                    // InternalCommunicationObject.g:971:4: 'UInt8'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCommunicationObject.g:975:2: ( ( 'UInt16' ) )
                    {
                    // InternalCommunicationObject.g:975:2: ( ( 'UInt16' ) )
                    // InternalCommunicationObject.g:976:3: ( 'UInt16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 
                    // InternalCommunicationObject.g:977:3: ( 'UInt16' )
                    // InternalCommunicationObject.g:977:4: 'UInt16'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCommunicationObject.g:981:2: ( ( 'UInt32' ) )
                    {
                    // InternalCommunicationObject.g:981:2: ( ( 'UInt32' ) )
                    // InternalCommunicationObject.g:982:3: ( 'UInt32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 
                    // InternalCommunicationObject.g:983:3: ( 'UInt32' )
                    // InternalCommunicationObject.g:983:4: 'UInt32'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCommunicationObject.g:987:2: ( ( 'UInt64' ) )
                    {
                    // InternalCommunicationObject.g:987:2: ( ( 'UInt64' ) )
                    // InternalCommunicationObject.g:988:3: ( 'UInt64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 
                    // InternalCommunicationObject.g:989:3: ( 'UInt64' )
                    // InternalCommunicationObject.g:989:4: 'UInt64'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCommunicationObject.g:993:2: ( ( 'Float' ) )
                    {
                    // InternalCommunicationObject.g:993:2: ( ( 'Float' ) )
                    // InternalCommunicationObject.g:994:3: ( 'Float' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 
                    // InternalCommunicationObject.g:995:3: ( 'Float' )
                    // InternalCommunicationObject.g:995:4: 'Float'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCommunicationObject.g:999:2: ( ( 'Double' ) )
                    {
                    // InternalCommunicationObject.g:999:2: ( ( 'Double' ) )
                    // InternalCommunicationObject.g:1000:3: ( 'Double' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 
                    // InternalCommunicationObject.g:1001:3: ( 'Double' )
                    // InternalCommunicationObject.g:1001:4: 'Double'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCommunicationObject.g:1005:2: ( ( 'String' ) )
                    {
                    // InternalCommunicationObject.g:1005:2: ( ( 'String' ) )
                    // InternalCommunicationObject.g:1006:3: ( 'String' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 
                    // InternalCommunicationObject.g:1007:3: ( 'String' )
                    // InternalCommunicationObject.g:1007:4: 'String'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalCommunicationObject.g:1011:2: ( ( 'Boolean' ) )
                    {
                    // InternalCommunicationObject.g:1011:2: ( ( 'Boolean' ) )
                    // InternalCommunicationObject.g:1012:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); 
                    // InternalCommunicationObject.g:1013:3: ( 'Boolean' )
                    // InternalCommunicationObject.g:1013:4: 'Boolean'
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


    // $ANTLR start "rule__CommObjectModel__Group__0"
    // InternalCommunicationObject.g:1021:1: rule__CommObjectModel__Group__0 : rule__CommObjectModel__Group__0__Impl rule__CommObjectModel__Group__1 ;
    public final void rule__CommObjectModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1025:1: ( rule__CommObjectModel__Group__0__Impl rule__CommObjectModel__Group__1 )
            // InternalCommunicationObject.g:1026:2: rule__CommObjectModel__Group__0__Impl rule__CommObjectModel__Group__1
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
    // InternalCommunicationObject.g:1033:1: rule__CommObjectModel__Group__0__Impl : ( ( rule__CommObjectModel__ImportsAssignment_0 )* ) ;
    public final void rule__CommObjectModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1037:1: ( ( ( rule__CommObjectModel__ImportsAssignment_0 )* ) )
            // InternalCommunicationObject.g:1038:1: ( ( rule__CommObjectModel__ImportsAssignment_0 )* )
            {
            // InternalCommunicationObject.g:1038:1: ( ( rule__CommObjectModel__ImportsAssignment_0 )* )
            // InternalCommunicationObject.g:1039:2: ( rule__CommObjectModel__ImportsAssignment_0 )*
            {
             before(grammarAccess.getCommObjectModelAccess().getImportsAssignment_0()); 
            // InternalCommunicationObject.g:1040:2: ( rule__CommObjectModel__ImportsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCommunicationObject.g:1040:3: rule__CommObjectModel__ImportsAssignment_0
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
    // InternalCommunicationObject.g:1048:1: rule__CommObjectModel__Group__1 : rule__CommObjectModel__Group__1__Impl ;
    public final void rule__CommObjectModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1052:1: ( rule__CommObjectModel__Group__1__Impl )
            // InternalCommunicationObject.g:1053:2: rule__CommObjectModel__Group__1__Impl
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
    // InternalCommunicationObject.g:1059:1: rule__CommObjectModel__Group__1__Impl : ( ( rule__CommObjectModel__RepositoryAssignment_1 )? ) ;
    public final void rule__CommObjectModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1063:1: ( ( ( rule__CommObjectModel__RepositoryAssignment_1 )? ) )
            // InternalCommunicationObject.g:1064:1: ( ( rule__CommObjectModel__RepositoryAssignment_1 )? )
            {
            // InternalCommunicationObject.g:1064:1: ( ( rule__CommObjectModel__RepositoryAssignment_1 )? )
            // InternalCommunicationObject.g:1065:2: ( rule__CommObjectModel__RepositoryAssignment_1 )?
            {
             before(grammarAccess.getCommObjectModelAccess().getRepositoryAssignment_1()); 
            // InternalCommunicationObject.g:1066:2: ( rule__CommObjectModel__RepositoryAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOCU_COMMENT||LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCommunicationObject.g:1066:3: rule__CommObjectModel__RepositoryAssignment_1
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
    // InternalCommunicationObject.g:1075:1: rule__FQNW__Group__0 : rule__FQNW__Group__0__Impl rule__FQNW__Group__1 ;
    public final void rule__FQNW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1079:1: ( rule__FQNW__Group__0__Impl rule__FQNW__Group__1 )
            // InternalCommunicationObject.g:1080:2: rule__FQNW__Group__0__Impl rule__FQNW__Group__1
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
    // InternalCommunicationObject.g:1087:1: rule__FQNW__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1091:1: ( ( ruleFQN ) )
            // InternalCommunicationObject.g:1092:1: ( ruleFQN )
            {
            // InternalCommunicationObject.g:1092:1: ( ruleFQN )
            // InternalCommunicationObject.g:1093:2: ruleFQN
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
    // InternalCommunicationObject.g:1102:1: rule__FQNW__Group__1 : rule__FQNW__Group__1__Impl ;
    public final void rule__FQNW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1106:1: ( rule__FQNW__Group__1__Impl )
            // InternalCommunicationObject.g:1107:2: rule__FQNW__Group__1__Impl
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
    // InternalCommunicationObject.g:1113:1: rule__FQNW__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FQNW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1117:1: ( ( ( '.*' )? ) )
            // InternalCommunicationObject.g:1118:1: ( ( '.*' )? )
            {
            // InternalCommunicationObject.g:1118:1: ( ( '.*' )? )
            // InternalCommunicationObject.g:1119:2: ( '.*' )?
            {
             before(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); 
            // InternalCommunicationObject.g:1120:2: ( '.*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCommunicationObject.g:1120:3: '.*'
                    {
                    match(input,31,FOLLOW_2); 

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
    // InternalCommunicationObject.g:1129:1: rule__CommRepositoryImport__Group__0 : rule__CommRepositoryImport__Group__0__Impl rule__CommRepositoryImport__Group__1 ;
    public final void rule__CommRepositoryImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1133:1: ( rule__CommRepositoryImport__Group__0__Impl rule__CommRepositoryImport__Group__1 )
            // InternalCommunicationObject.g:1134:2: rule__CommRepositoryImport__Group__0__Impl rule__CommRepositoryImport__Group__1
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
    // InternalCommunicationObject.g:1141:1: rule__CommRepositoryImport__Group__0__Impl : ( '#import' ) ;
    public final void rule__CommRepositoryImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1145:1: ( ( '#import' ) )
            // InternalCommunicationObject.g:1146:1: ( '#import' )
            {
            // InternalCommunicationObject.g:1146:1: ( '#import' )
            // InternalCommunicationObject.g:1147:2: '#import'
            {
             before(grammarAccess.getCommRepositoryImportAccess().getImportKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCommunicationObject.g:1156:1: rule__CommRepositoryImport__Group__1 : rule__CommRepositoryImport__Group__1__Impl rule__CommRepositoryImport__Group__2 ;
    public final void rule__CommRepositoryImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1160:1: ( rule__CommRepositoryImport__Group__1__Impl rule__CommRepositoryImport__Group__2 )
            // InternalCommunicationObject.g:1161:2: rule__CommRepositoryImport__Group__1__Impl rule__CommRepositoryImport__Group__2
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
    // InternalCommunicationObject.g:1168:1: rule__CommRepositoryImport__Group__1__Impl : ( ( rule__CommRepositoryImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__CommRepositoryImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1172:1: ( ( ( rule__CommRepositoryImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalCommunicationObject.g:1173:1: ( ( rule__CommRepositoryImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalCommunicationObject.g:1173:1: ( ( rule__CommRepositoryImport__ImportedNamespaceAssignment_1 ) )
            // InternalCommunicationObject.g:1174:2: ( rule__CommRepositoryImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getCommRepositoryImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalCommunicationObject.g:1175:2: ( rule__CommRepositoryImport__ImportedNamespaceAssignment_1 )
            // InternalCommunicationObject.g:1175:3: rule__CommRepositoryImport__ImportedNamespaceAssignment_1
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
    // InternalCommunicationObject.g:1183:1: rule__CommRepositoryImport__Group__2 : rule__CommRepositoryImport__Group__2__Impl ;
    public final void rule__CommRepositoryImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1187:1: ( rule__CommRepositoryImport__Group__2__Impl )
            // InternalCommunicationObject.g:1188:2: rule__CommRepositoryImport__Group__2__Impl
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
    // InternalCommunicationObject.g:1194:1: rule__CommRepositoryImport__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__CommRepositoryImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1198:1: ( ( ( ';' )? ) )
            // InternalCommunicationObject.g:1199:1: ( ( ';' )? )
            {
            // InternalCommunicationObject.g:1199:1: ( ( ';' )? )
            // InternalCommunicationObject.g:1200:2: ( ';' )?
            {
             before(grammarAccess.getCommRepositoryImportAccess().getSemicolonKeyword_2()); 
            // InternalCommunicationObject.g:1201:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCommunicationObject.g:1201:3: ';'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalCommunicationObject.g:1210:1: rule__CommObjectsRepository__Group__0 : rule__CommObjectsRepository__Group__0__Impl rule__CommObjectsRepository__Group__1 ;
    public final void rule__CommObjectsRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1214:1: ( rule__CommObjectsRepository__Group__0__Impl rule__CommObjectsRepository__Group__1 )
            // InternalCommunicationObject.g:1215:2: rule__CommObjectsRepository__Group__0__Impl rule__CommObjectsRepository__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalCommunicationObject.g:1222:1: rule__CommObjectsRepository__Group__0__Impl : ( ( rule__CommObjectsRepository__DocumentationAssignment_0 )? ) ;
    public final void rule__CommObjectsRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1226:1: ( ( ( rule__CommObjectsRepository__DocumentationAssignment_0 )? ) )
            // InternalCommunicationObject.g:1227:1: ( ( rule__CommObjectsRepository__DocumentationAssignment_0 )? )
            {
            // InternalCommunicationObject.g:1227:1: ( ( rule__CommObjectsRepository__DocumentationAssignment_0 )? )
            // InternalCommunicationObject.g:1228:2: ( rule__CommObjectsRepository__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getDocumentationAssignment_0()); 
            // InternalCommunicationObject.g:1229:2: ( rule__CommObjectsRepository__DocumentationAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DOCU_COMMENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCommunicationObject.g:1229:3: rule__CommObjectsRepository__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommObjectsRepository__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1237:1: rule__CommObjectsRepository__Group__1 : rule__CommObjectsRepository__Group__1__Impl rule__CommObjectsRepository__Group__2 ;
    public final void rule__CommObjectsRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1241:1: ( rule__CommObjectsRepository__Group__1__Impl rule__CommObjectsRepository__Group__2 )
            // InternalCommunicationObject.g:1242:2: rule__CommObjectsRepository__Group__1__Impl rule__CommObjectsRepository__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalCommunicationObject.g:1249:1: rule__CommObjectsRepository__Group__1__Impl : ( 'CommObjectsRepository' ) ;
    public final void rule__CommObjectsRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1253:1: ( ( 'CommObjectsRepository' ) )
            // InternalCommunicationObject.g:1254:1: ( 'CommObjectsRepository' )
            {
            // InternalCommunicationObject.g:1254:1: ( 'CommObjectsRepository' )
            // InternalCommunicationObject.g:1255:2: 'CommObjectsRepository'
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getCommObjectsRepositoryKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getCommObjectsRepositoryKeyword_1()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1264:1: rule__CommObjectsRepository__Group__2 : rule__CommObjectsRepository__Group__2__Impl rule__CommObjectsRepository__Group__3 ;
    public final void rule__CommObjectsRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1268:1: ( rule__CommObjectsRepository__Group__2__Impl rule__CommObjectsRepository__Group__3 )
            // InternalCommunicationObject.g:1269:2: rule__CommObjectsRepository__Group__2__Impl rule__CommObjectsRepository__Group__3
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
    // InternalCommunicationObject.g:1276:1: rule__CommObjectsRepository__Group__2__Impl : ( ( rule__CommObjectsRepository__NameAssignment_2 ) ) ;
    public final void rule__CommObjectsRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1280:1: ( ( ( rule__CommObjectsRepository__NameAssignment_2 ) ) )
            // InternalCommunicationObject.g:1281:1: ( ( rule__CommObjectsRepository__NameAssignment_2 ) )
            {
            // InternalCommunicationObject.g:1281:1: ( ( rule__CommObjectsRepository__NameAssignment_2 ) )
            // InternalCommunicationObject.g:1282:2: ( rule__CommObjectsRepository__NameAssignment_2 )
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getNameAssignment_2()); 
            // InternalCommunicationObject.g:1283:2: ( rule__CommObjectsRepository__NameAssignment_2 )
            // InternalCommunicationObject.g:1283:3: rule__CommObjectsRepository__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1291:1: rule__CommObjectsRepository__Group__3 : rule__CommObjectsRepository__Group__3__Impl rule__CommObjectsRepository__Group__4 ;
    public final void rule__CommObjectsRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1295:1: ( rule__CommObjectsRepository__Group__3__Impl rule__CommObjectsRepository__Group__4 )
            // InternalCommunicationObject.g:1296:2: rule__CommObjectsRepository__Group__3__Impl rule__CommObjectsRepository__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalCommunicationObject.g:1303:1: rule__CommObjectsRepository__Group__3__Impl : ( ( rule__CommObjectsRepository__Group_3__0 )? ) ;
    public final void rule__CommObjectsRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1307:1: ( ( ( rule__CommObjectsRepository__Group_3__0 )? ) )
            // InternalCommunicationObject.g:1308:1: ( ( rule__CommObjectsRepository__Group_3__0 )? )
            {
            // InternalCommunicationObject.g:1308:1: ( ( rule__CommObjectsRepository__Group_3__0 )? )
            // InternalCommunicationObject.g:1309:2: ( rule__CommObjectsRepository__Group_3__0 )?
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getGroup_3()); 
            // InternalCommunicationObject.g:1310:2: ( rule__CommObjectsRepository__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCommunicationObject.g:1310:3: rule__CommObjectsRepository__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommObjectsRepository__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1318:1: rule__CommObjectsRepository__Group__4 : rule__CommObjectsRepository__Group__4__Impl rule__CommObjectsRepository__Group__5 ;
    public final void rule__CommObjectsRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1322:1: ( rule__CommObjectsRepository__Group__4__Impl rule__CommObjectsRepository__Group__5 )
            // InternalCommunicationObject.g:1323:2: rule__CommObjectsRepository__Group__4__Impl rule__CommObjectsRepository__Group__5
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
    // InternalCommunicationObject.g:1330:1: rule__CommObjectsRepository__Group__4__Impl : ( '{' ) ;
    public final void rule__CommObjectsRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1334:1: ( ( '{' ) )
            // InternalCommunicationObject.g:1335:1: ( '{' )
            {
            // InternalCommunicationObject.g:1335:1: ( '{' )
            // InternalCommunicationObject.g:1336:2: '{'
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1345:1: rule__CommObjectsRepository__Group__5 : rule__CommObjectsRepository__Group__5__Impl rule__CommObjectsRepository__Group__6 ;
    public final void rule__CommObjectsRepository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1349:1: ( rule__CommObjectsRepository__Group__5__Impl rule__CommObjectsRepository__Group__6 )
            // InternalCommunicationObject.g:1350:2: rule__CommObjectsRepository__Group__5__Impl rule__CommObjectsRepository__Group__6
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
    // InternalCommunicationObject.g:1357:1: rule__CommObjectsRepository__Group__5__Impl : ( ( rule__CommObjectsRepository__Group_5__0 )? ) ;
    public final void rule__CommObjectsRepository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1361:1: ( ( ( rule__CommObjectsRepository__Group_5__0 )? ) )
            // InternalCommunicationObject.g:1362:1: ( ( rule__CommObjectsRepository__Group_5__0 )? )
            {
            // InternalCommunicationObject.g:1362:1: ( ( rule__CommObjectsRepository__Group_5__0 )? )
            // InternalCommunicationObject.g:1363:2: ( rule__CommObjectsRepository__Group_5__0 )?
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getGroup_5()); 
            // InternalCommunicationObject.g:1364:2: ( rule__CommObjectsRepository__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCommunicationObject.g:1364:3: rule__CommObjectsRepository__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommObjectsRepository__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1372:1: rule__CommObjectsRepository__Group__6 : rule__CommObjectsRepository__Group__6__Impl rule__CommObjectsRepository__Group__7 ;
    public final void rule__CommObjectsRepository__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1376:1: ( rule__CommObjectsRepository__Group__6__Impl rule__CommObjectsRepository__Group__7 )
            // InternalCommunicationObject.g:1377:2: rule__CommObjectsRepository__Group__6__Impl rule__CommObjectsRepository__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__CommObjectsRepository__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group__7();

            state._fsp--;


            }

        }
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
    // InternalCommunicationObject.g:1384:1: rule__CommObjectsRepository__Group__6__Impl : ( ( rule__CommObjectsRepository__ElementsAssignment_6 )* ) ;
    public final void rule__CommObjectsRepository__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1388:1: ( ( ( rule__CommObjectsRepository__ElementsAssignment_6 )* ) )
            // InternalCommunicationObject.g:1389:1: ( ( rule__CommObjectsRepository__ElementsAssignment_6 )* )
            {
            // InternalCommunicationObject.g:1389:1: ( ( rule__CommObjectsRepository__ElementsAssignment_6 )* )
            // InternalCommunicationObject.g:1390:2: ( rule__CommObjectsRepository__ElementsAssignment_6 )*
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getElementsAssignment_6()); 
            // InternalCommunicationObject.g:1391:2: ( rule__CommObjectsRepository__ElementsAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_DOCU_COMMENT||(LA18_0>=40 && LA18_0<=41)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCommunicationObject.g:1391:3: rule__CommObjectsRepository__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CommObjectsRepository__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getCommObjectsRepositoryAccess().getElementsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__CommObjectsRepository__Group__7"
    // InternalCommunicationObject.g:1399:1: rule__CommObjectsRepository__Group__7 : rule__CommObjectsRepository__Group__7__Impl ;
    public final void rule__CommObjectsRepository__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1403:1: ( rule__CommObjectsRepository__Group__7__Impl )
            // InternalCommunicationObject.g:1404:2: rule__CommObjectsRepository__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__7"


    // $ANTLR start "rule__CommObjectsRepository__Group__7__Impl"
    // InternalCommunicationObject.g:1410:1: rule__CommObjectsRepository__Group__7__Impl : ( '}' ) ;
    public final void rule__CommObjectsRepository__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1414:1: ( ( '}' ) )
            // InternalCommunicationObject.g:1415:1: ( '}' )
            {
            // InternalCommunicationObject.g:1415:1: ( '}' )
            // InternalCommunicationObject.g:1416:2: '}'
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group__7__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group_3__0"
    // InternalCommunicationObject.g:1426:1: rule__CommObjectsRepository__Group_3__0 : rule__CommObjectsRepository__Group_3__0__Impl rule__CommObjectsRepository__Group_3__1 ;
    public final void rule__CommObjectsRepository__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1430:1: ( rule__CommObjectsRepository__Group_3__0__Impl rule__CommObjectsRepository__Group_3__1 )
            // InternalCommunicationObject.g:1431:2: rule__CommObjectsRepository__Group_3__0__Impl rule__CommObjectsRepository__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__CommObjectsRepository__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_3__0"


    // $ANTLR start "rule__CommObjectsRepository__Group_3__0__Impl"
    // InternalCommunicationObject.g:1438:1: rule__CommObjectsRepository__Group_3__0__Impl : ( 'version' ) ;
    public final void rule__CommObjectsRepository__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1442:1: ( ( 'version' ) )
            // InternalCommunicationObject.g:1443:1: ( 'version' )
            {
            // InternalCommunicationObject.g:1443:1: ( 'version' )
            // InternalCommunicationObject.g:1444:2: 'version'
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getVersionKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getVersionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_3__0__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group_3__1"
    // InternalCommunicationObject.g:1453:1: rule__CommObjectsRepository__Group_3__1 : rule__CommObjectsRepository__Group_3__1__Impl ;
    public final void rule__CommObjectsRepository__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1457:1: ( rule__CommObjectsRepository__Group_3__1__Impl )
            // InternalCommunicationObject.g:1458:2: rule__CommObjectsRepository__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_3__1"


    // $ANTLR start "rule__CommObjectsRepository__Group_3__1__Impl"
    // InternalCommunicationObject.g:1464:1: rule__CommObjectsRepository__Group_3__1__Impl : ( ( rule__CommObjectsRepository__VersionAssignment_3_1 ) ) ;
    public final void rule__CommObjectsRepository__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1468:1: ( ( ( rule__CommObjectsRepository__VersionAssignment_3_1 ) ) )
            // InternalCommunicationObject.g:1469:1: ( ( rule__CommObjectsRepository__VersionAssignment_3_1 ) )
            {
            // InternalCommunicationObject.g:1469:1: ( ( rule__CommObjectsRepository__VersionAssignment_3_1 ) )
            // InternalCommunicationObject.g:1470:2: ( rule__CommObjectsRepository__VersionAssignment_3_1 )
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getVersionAssignment_3_1()); 
            // InternalCommunicationObject.g:1471:2: ( rule__CommObjectsRepository__VersionAssignment_3_1 )
            // InternalCommunicationObject.g:1471:3: rule__CommObjectsRepository__VersionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__VersionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getVersionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_3__1__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group_5__0"
    // InternalCommunicationObject.g:1480:1: rule__CommObjectsRepository__Group_5__0 : rule__CommObjectsRepository__Group_5__0__Impl rule__CommObjectsRepository__Group_5__1 ;
    public final void rule__CommObjectsRepository__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1484:1: ( rule__CommObjectsRepository__Group_5__0__Impl rule__CommObjectsRepository__Group_5__1 )
            // InternalCommunicationObject.g:1485:2: rule__CommObjectsRepository__Group_5__0__Impl rule__CommObjectsRepository__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__CommObjectsRepository__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_5__0"


    // $ANTLR start "rule__CommObjectsRepository__Group_5__0__Impl"
    // InternalCommunicationObject.g:1492:1: rule__CommObjectsRepository__Group_5__0__Impl : ( 'Dependency' ) ;
    public final void rule__CommObjectsRepository__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1496:1: ( ( 'Dependency' ) )
            // InternalCommunicationObject.g:1497:1: ( 'Dependency' )
            {
            // InternalCommunicationObject.g:1497:1: ( 'Dependency' )
            // InternalCommunicationObject.g:1498:2: 'Dependency'
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getDependencyKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getDependencyKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_5__0__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group_5__1"
    // InternalCommunicationObject.g:1507:1: rule__CommObjectsRepository__Group_5__1 : rule__CommObjectsRepository__Group_5__1__Impl rule__CommObjectsRepository__Group_5__2 ;
    public final void rule__CommObjectsRepository__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1511:1: ( rule__CommObjectsRepository__Group_5__1__Impl rule__CommObjectsRepository__Group_5__2 )
            // InternalCommunicationObject.g:1512:2: rule__CommObjectsRepository__Group_5__1__Impl rule__CommObjectsRepository__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__CommObjectsRepository__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_5__1"


    // $ANTLR start "rule__CommObjectsRepository__Group_5__1__Impl"
    // InternalCommunicationObject.g:1519:1: rule__CommObjectsRepository__Group_5__1__Impl : ( ( rule__CommObjectsRepository__DependencyAssignment_5_1 ) ) ;
    public final void rule__CommObjectsRepository__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1523:1: ( ( ( rule__CommObjectsRepository__DependencyAssignment_5_1 ) ) )
            // InternalCommunicationObject.g:1524:1: ( ( rule__CommObjectsRepository__DependencyAssignment_5_1 ) )
            {
            // InternalCommunicationObject.g:1524:1: ( ( rule__CommObjectsRepository__DependencyAssignment_5_1 ) )
            // InternalCommunicationObject.g:1525:2: ( rule__CommObjectsRepository__DependencyAssignment_5_1 )
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getDependencyAssignment_5_1()); 
            // InternalCommunicationObject.g:1526:2: ( rule__CommObjectsRepository__DependencyAssignment_5_1 )
            // InternalCommunicationObject.g:1526:3: rule__CommObjectsRepository__DependencyAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__DependencyAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getDependencyAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_5__1__Impl"


    // $ANTLR start "rule__CommObjectsRepository__Group_5__2"
    // InternalCommunicationObject.g:1534:1: rule__CommObjectsRepository__Group_5__2 : rule__CommObjectsRepository__Group_5__2__Impl ;
    public final void rule__CommObjectsRepository__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1538:1: ( rule__CommObjectsRepository__Group_5__2__Impl )
            // InternalCommunicationObject.g:1539:2: rule__CommObjectsRepository__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommObjectsRepository__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_5__2"


    // $ANTLR start "rule__CommObjectsRepository__Group_5__2__Impl"
    // InternalCommunicationObject.g:1545:1: rule__CommObjectsRepository__Group_5__2__Impl : ( ( ';' )? ) ;
    public final void rule__CommObjectsRepository__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1549:1: ( ( ( ';' )? ) )
            // InternalCommunicationObject.g:1550:1: ( ( ';' )? )
            {
            // InternalCommunicationObject.g:1550:1: ( ( ';' )? )
            // InternalCommunicationObject.g:1551:2: ( ';' )?
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getSemicolonKeyword_5_2()); 
            // InternalCommunicationObject.g:1552:2: ( ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCommunicationObject.g:1552:3: ';'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCommObjectsRepositoryAccess().getSemicolonKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__Group_5__2__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // InternalCommunicationObject.g:1561:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1565:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalCommunicationObject.g:1566:2: rule__Version__Group__0__Impl rule__Version__Group__1
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
    // InternalCommunicationObject.g:1573:1: rule__Version__Group__0__Impl : ( ( rule__Version__MajorAssignment_0 ) ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1577:1: ( ( ( rule__Version__MajorAssignment_0 ) ) )
            // InternalCommunicationObject.g:1578:1: ( ( rule__Version__MajorAssignment_0 ) )
            {
            // InternalCommunicationObject.g:1578:1: ( ( rule__Version__MajorAssignment_0 ) )
            // InternalCommunicationObject.g:1579:2: ( rule__Version__MajorAssignment_0 )
            {
             before(grammarAccess.getVersionAccess().getMajorAssignment_0()); 
            // InternalCommunicationObject.g:1580:2: ( rule__Version__MajorAssignment_0 )
            // InternalCommunicationObject.g:1580:3: rule__Version__MajorAssignment_0
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
    // InternalCommunicationObject.g:1588:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1592:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalCommunicationObject.g:1593:2: rule__Version__Group__1__Impl rule__Version__Group__2
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
    // InternalCommunicationObject.g:1600:1: rule__Version__Group__1__Impl : ( '.' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1604:1: ( ( '.' ) )
            // InternalCommunicationObject.g:1605:1: ( '.' )
            {
            // InternalCommunicationObject.g:1605:1: ( '.' )
            // InternalCommunicationObject.g:1606:2: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCommunicationObject.g:1615:1: rule__Version__Group__2 : rule__Version__Group__2__Impl rule__Version__Group__3 ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1619:1: ( rule__Version__Group__2__Impl rule__Version__Group__3 )
            // InternalCommunicationObject.g:1620:2: rule__Version__Group__2__Impl rule__Version__Group__3
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
    // InternalCommunicationObject.g:1627:1: rule__Version__Group__2__Impl : ( ( rule__Version__MinorAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1631:1: ( ( ( rule__Version__MinorAssignment_2 ) ) )
            // InternalCommunicationObject.g:1632:1: ( ( rule__Version__MinorAssignment_2 ) )
            {
            // InternalCommunicationObject.g:1632:1: ( ( rule__Version__MinorAssignment_2 ) )
            // InternalCommunicationObject.g:1633:2: ( rule__Version__MinorAssignment_2 )
            {
             before(grammarAccess.getVersionAccess().getMinorAssignment_2()); 
            // InternalCommunicationObject.g:1634:2: ( rule__Version__MinorAssignment_2 )
            // InternalCommunicationObject.g:1634:3: rule__Version__MinorAssignment_2
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
    // InternalCommunicationObject.g:1642:1: rule__Version__Group__3 : rule__Version__Group__3__Impl ;
    public final void rule__Version__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1646:1: ( rule__Version__Group__3__Impl )
            // InternalCommunicationObject.g:1647:2: rule__Version__Group__3__Impl
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
    // InternalCommunicationObject.g:1653:1: rule__Version__Group__3__Impl : ( ( rule__Version__Group_3__0 )? ) ;
    public final void rule__Version__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1657:1: ( ( ( rule__Version__Group_3__0 )? ) )
            // InternalCommunicationObject.g:1658:1: ( ( rule__Version__Group_3__0 )? )
            {
            // InternalCommunicationObject.g:1658:1: ( ( rule__Version__Group_3__0 )? )
            // InternalCommunicationObject.g:1659:2: ( rule__Version__Group_3__0 )?
            {
             before(grammarAccess.getVersionAccess().getGroup_3()); 
            // InternalCommunicationObject.g:1660:2: ( rule__Version__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCommunicationObject.g:1660:3: rule__Version__Group_3__0
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
    // InternalCommunicationObject.g:1669:1: rule__Version__Group_3__0 : rule__Version__Group_3__0__Impl rule__Version__Group_3__1 ;
    public final void rule__Version__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1673:1: ( rule__Version__Group_3__0__Impl rule__Version__Group_3__1 )
            // InternalCommunicationObject.g:1674:2: rule__Version__Group_3__0__Impl rule__Version__Group_3__1
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
    // InternalCommunicationObject.g:1681:1: rule__Version__Group_3__0__Impl : ( '.' ) ;
    public final void rule__Version__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1685:1: ( ( '.' ) )
            // InternalCommunicationObject.g:1686:1: ( '.' )
            {
            // InternalCommunicationObject.g:1686:1: ( '.' )
            // InternalCommunicationObject.g:1687:2: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCommunicationObject.g:1696:1: rule__Version__Group_3__1 : rule__Version__Group_3__1__Impl ;
    public final void rule__Version__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1700:1: ( rule__Version__Group_3__1__Impl )
            // InternalCommunicationObject.g:1701:2: rule__Version__Group_3__1__Impl
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
    // InternalCommunicationObject.g:1707:1: rule__Version__Group_3__1__Impl : ( ( rule__Version__PatchAssignment_3_1 ) ) ;
    public final void rule__Version__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1711:1: ( ( ( rule__Version__PatchAssignment_3_1 ) ) )
            // InternalCommunicationObject.g:1712:1: ( ( rule__Version__PatchAssignment_3_1 ) )
            {
            // InternalCommunicationObject.g:1712:1: ( ( rule__Version__PatchAssignment_3_1 ) )
            // InternalCommunicationObject.g:1713:2: ( rule__Version__PatchAssignment_3_1 )
            {
             before(grammarAccess.getVersionAccess().getPatchAssignment_3_1()); 
            // InternalCommunicationObject.g:1714:2: ( rule__Version__PatchAssignment_3_1 )
            // InternalCommunicationObject.g:1714:3: rule__Version__PatchAssignment_3_1
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
    // InternalCommunicationObject.g:1723:1: rule__CommunicationObject__Group__0 : rule__CommunicationObject__Group__0__Impl rule__CommunicationObject__Group__1 ;
    public final void rule__CommunicationObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1727:1: ( rule__CommunicationObject__Group__0__Impl rule__CommunicationObject__Group__1 )
            // InternalCommunicationObject.g:1728:2: rule__CommunicationObject__Group__0__Impl rule__CommunicationObject__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCommunicationObject.g:1735:1: rule__CommunicationObject__Group__0__Impl : ( ( rule__CommunicationObject__DocumentationAssignment_0 )? ) ;
    public final void rule__CommunicationObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1739:1: ( ( ( rule__CommunicationObject__DocumentationAssignment_0 )? ) )
            // InternalCommunicationObject.g:1740:1: ( ( rule__CommunicationObject__DocumentationAssignment_0 )? )
            {
            // InternalCommunicationObject.g:1740:1: ( ( rule__CommunicationObject__DocumentationAssignment_0 )? )
            // InternalCommunicationObject.g:1741:2: ( rule__CommunicationObject__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getCommunicationObjectAccess().getDocumentationAssignment_0()); 
            // InternalCommunicationObject.g:1742:2: ( rule__CommunicationObject__DocumentationAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DOCU_COMMENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCommunicationObject.g:1742:3: rule__CommunicationObject__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommunicationObject__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommunicationObjectAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1750:1: rule__CommunicationObject__Group__1 : rule__CommunicationObject__Group__1__Impl rule__CommunicationObject__Group__2 ;
    public final void rule__CommunicationObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1754:1: ( rule__CommunicationObject__Group__1__Impl rule__CommunicationObject__Group__2 )
            // InternalCommunicationObject.g:1755:2: rule__CommunicationObject__Group__1__Impl rule__CommunicationObject__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalCommunicationObject.g:1762:1: rule__CommunicationObject__Group__1__Impl : ( 'CommObject' ) ;
    public final void rule__CommunicationObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1766:1: ( ( 'CommObject' ) )
            // InternalCommunicationObject.g:1767:1: ( 'CommObject' )
            {
            // InternalCommunicationObject.g:1767:1: ( 'CommObject' )
            // InternalCommunicationObject.g:1768:2: 'CommObject'
            {
             before(grammarAccess.getCommunicationObjectAccess().getCommObjectKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCommunicationObjectAccess().getCommObjectKeyword_1()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1777:1: rule__CommunicationObject__Group__2 : rule__CommunicationObject__Group__2__Impl rule__CommunicationObject__Group__3 ;
    public final void rule__CommunicationObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1781:1: ( rule__CommunicationObject__Group__2__Impl rule__CommunicationObject__Group__3 )
            // InternalCommunicationObject.g:1782:2: rule__CommunicationObject__Group__2__Impl rule__CommunicationObject__Group__3
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
    // InternalCommunicationObject.g:1789:1: rule__CommunicationObject__Group__2__Impl : ( ( rule__CommunicationObject__NameAssignment_2 ) ) ;
    public final void rule__CommunicationObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1793:1: ( ( ( rule__CommunicationObject__NameAssignment_2 ) ) )
            // InternalCommunicationObject.g:1794:1: ( ( rule__CommunicationObject__NameAssignment_2 ) )
            {
            // InternalCommunicationObject.g:1794:1: ( ( rule__CommunicationObject__NameAssignment_2 ) )
            // InternalCommunicationObject.g:1795:2: ( rule__CommunicationObject__NameAssignment_2 )
            {
             before(grammarAccess.getCommunicationObjectAccess().getNameAssignment_2()); 
            // InternalCommunicationObject.g:1796:2: ( rule__CommunicationObject__NameAssignment_2 )
            // InternalCommunicationObject.g:1796:3: rule__CommunicationObject__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationObject__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationObjectAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1804:1: rule__CommunicationObject__Group__3 : rule__CommunicationObject__Group__3__Impl rule__CommunicationObject__Group__4 ;
    public final void rule__CommunicationObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1808:1: ( rule__CommunicationObject__Group__3__Impl rule__CommunicationObject__Group__4 )
            // InternalCommunicationObject.g:1809:2: rule__CommunicationObject__Group__3__Impl rule__CommunicationObject__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalCommunicationObject.g:1816:1: rule__CommunicationObject__Group__3__Impl : ( '{' ) ;
    public final void rule__CommunicationObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1820:1: ( ( '{' ) )
            // InternalCommunicationObject.g:1821:1: ( '{' )
            {
            // InternalCommunicationObject.g:1821:1: ( '{' )
            // InternalCommunicationObject.g:1822:2: '{'
            {
             before(grammarAccess.getCommunicationObjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCommunicationObjectAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1831:1: rule__CommunicationObject__Group__4 : rule__CommunicationObject__Group__4__Impl rule__CommunicationObject__Group__5 ;
    public final void rule__CommunicationObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1835:1: ( rule__CommunicationObject__Group__4__Impl rule__CommunicationObject__Group__5 )
            // InternalCommunicationObject.g:1836:2: rule__CommunicationObject__Group__4__Impl rule__CommunicationObject__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__CommunicationObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationObject__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCommunicationObject.g:1843:1: rule__CommunicationObject__Group__4__Impl : ( ( rule__CommunicationObject__AttributesAssignment_4 )* ) ;
    public final void rule__CommunicationObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1847:1: ( ( ( rule__CommunicationObject__AttributesAssignment_4 )* ) )
            // InternalCommunicationObject.g:1848:1: ( ( rule__CommunicationObject__AttributesAssignment_4 )* )
            {
            // InternalCommunicationObject.g:1848:1: ( ( rule__CommunicationObject__AttributesAssignment_4 )* )
            // InternalCommunicationObject.g:1849:2: ( rule__CommunicationObject__AttributesAssignment_4 )*
            {
             before(grammarAccess.getCommunicationObjectAccess().getAttributesAssignment_4()); 
            // InternalCommunicationObject.g:1850:2: ( rule__CommunicationObject__AttributesAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_DOCU_COMMENT)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCommunicationObject.g:1850:3: rule__CommunicationObject__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__CommunicationObject__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getCommunicationObjectAccess().getAttributesAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__CommunicationObject__Group__5"
    // InternalCommunicationObject.g:1858:1: rule__CommunicationObject__Group__5 : rule__CommunicationObject__Group__5__Impl ;
    public final void rule__CommunicationObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1862:1: ( rule__CommunicationObject__Group__5__Impl )
            // InternalCommunicationObject.g:1863:2: rule__CommunicationObject__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationObject__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__Group__5"


    // $ANTLR start "rule__CommunicationObject__Group__5__Impl"
    // InternalCommunicationObject.g:1869:1: rule__CommunicationObject__Group__5__Impl : ( '}' ) ;
    public final void rule__CommunicationObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1873:1: ( ( '}' ) )
            // InternalCommunicationObject.g:1874:1: ( '}' )
            {
            // InternalCommunicationObject.g:1874:1: ( '}' )
            // InternalCommunicationObject.g:1875:2: '}'
            {
             before(grammarAccess.getCommunicationObjectAccess().getRightCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCommunicationObjectAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalCommunicationObject.g:1885:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1889:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalCommunicationObject.g:1890:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCommunicationObject.g:1897:1: rule__Enumeration__Group__0__Impl : ( ( rule__Enumeration__DocumentationAssignment_0 )? ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1901:1: ( ( ( rule__Enumeration__DocumentationAssignment_0 )? ) )
            // InternalCommunicationObject.g:1902:1: ( ( rule__Enumeration__DocumentationAssignment_0 )? )
            {
            // InternalCommunicationObject.g:1902:1: ( ( rule__Enumeration__DocumentationAssignment_0 )? )
            // InternalCommunicationObject.g:1903:2: ( rule__Enumeration__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getEnumerationAccess().getDocumentationAssignment_0()); 
            // InternalCommunicationObject.g:1904:2: ( rule__Enumeration__DocumentationAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DOCU_COMMENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCommunicationObject.g:1904:3: rule__Enumeration__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Enumeration__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1912:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1916:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalCommunicationObject.g:1917:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalCommunicationObject.g:1924:1: rule__Enumeration__Group__1__Impl : ( 'Enumeration' ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1928:1: ( ( 'Enumeration' ) )
            // InternalCommunicationObject.g:1929:1: ( 'Enumeration' )
            {
            // InternalCommunicationObject.g:1929:1: ( 'Enumeration' )
            // InternalCommunicationObject.g:1930:2: 'Enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1939:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1943:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalCommunicationObject.g:1944:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
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
    // InternalCommunicationObject.g:1951:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__NameAssignment_2 ) ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1955:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) )
            // InternalCommunicationObject.g:1956:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            {
            // InternalCommunicationObject.g:1956:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // InternalCommunicationObject.g:1957:2: ( rule__Enumeration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            // InternalCommunicationObject.g:1958:2: ( rule__Enumeration__NameAssignment_2 )
            // InternalCommunicationObject.g:1958:3: rule__Enumeration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1966:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1970:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalCommunicationObject.g:1971:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalCommunicationObject.g:1978:1: rule__Enumeration__Group__3__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1982:1: ( ( '{' ) )
            // InternalCommunicationObject.g:1983:1: ( '{' )
            {
            // InternalCommunicationObject.g:1983:1: ( '{' )
            // InternalCommunicationObject.g:1984:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:1993:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:1997:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalCommunicationObject.g:1998:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCommunicationObject.g:2005:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__EnumsAssignment_4 )* ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2009:1: ( ( ( rule__Enumeration__EnumsAssignment_4 )* ) )
            // InternalCommunicationObject.g:2010:1: ( ( rule__Enumeration__EnumsAssignment_4 )* )
            {
            // InternalCommunicationObject.g:2010:1: ( ( rule__Enumeration__EnumsAssignment_4 )* )
            // InternalCommunicationObject.g:2011:2: ( rule__Enumeration__EnumsAssignment_4 )*
            {
             before(grammarAccess.getEnumerationAccess().getEnumsAssignment_4()); 
            // InternalCommunicationObject.g:2012:2: ( rule__Enumeration__EnumsAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCommunicationObject.g:2012:3: rule__Enumeration__EnumsAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Enumeration__EnumsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getEnumsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Enumeration__Group__5"
    // InternalCommunicationObject.g:2020:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2024:1: ( rule__Enumeration__Group__5__Impl )
            // InternalCommunicationObject.g:2025:2: rule__Enumeration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // InternalCommunicationObject.g:2031:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2035:1: ( ( '}' ) )
            // InternalCommunicationObject.g:2036:1: ( '}' )
            {
            // InternalCommunicationObject.g:2036:1: ( '}' )
            // InternalCommunicationObject.g:2037:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__CommElementReference__Group__0"
    // InternalCommunicationObject.g:2047:1: rule__CommElementReference__Group__0 : rule__CommElementReference__Group__0__Impl rule__CommElementReference__Group__1 ;
    public final void rule__CommElementReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2051:1: ( rule__CommElementReference__Group__0__Impl rule__CommElementReference__Group__1 )
            // InternalCommunicationObject.g:2052:2: rule__CommElementReference__Group__0__Impl rule__CommElementReference__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCommunicationObject.g:2059:1: rule__CommElementReference__Group__0__Impl : ( ( rule__CommElementReference__TypeNameAssignment_0 ) ) ;
    public final void rule__CommElementReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2063:1: ( ( ( rule__CommElementReference__TypeNameAssignment_0 ) ) )
            // InternalCommunicationObject.g:2064:1: ( ( rule__CommElementReference__TypeNameAssignment_0 ) )
            {
            // InternalCommunicationObject.g:2064:1: ( ( rule__CommElementReference__TypeNameAssignment_0 ) )
            // InternalCommunicationObject.g:2065:2: ( rule__CommElementReference__TypeNameAssignment_0 )
            {
             before(grammarAccess.getCommElementReferenceAccess().getTypeNameAssignment_0()); 
            // InternalCommunicationObject.g:2066:2: ( rule__CommElementReference__TypeNameAssignment_0 )
            // InternalCommunicationObject.g:2066:3: rule__CommElementReference__TypeNameAssignment_0
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
    // InternalCommunicationObject.g:2074:1: rule__CommElementReference__Group__1 : rule__CommElementReference__Group__1__Impl ;
    public final void rule__CommElementReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2078:1: ( rule__CommElementReference__Group__1__Impl )
            // InternalCommunicationObject.g:2079:2: rule__CommElementReference__Group__1__Impl
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
    // InternalCommunicationObject.g:2085:1: rule__CommElementReference__Group__1__Impl : ( ( rule__CommElementReference__ArrayAssignment_1 )? ) ;
    public final void rule__CommElementReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2089:1: ( ( ( rule__CommElementReference__ArrayAssignment_1 )? ) )
            // InternalCommunicationObject.g:2090:1: ( ( rule__CommElementReference__ArrayAssignment_1 )? )
            {
            // InternalCommunicationObject.g:2090:1: ( ( rule__CommElementReference__ArrayAssignment_1 )? )
            // InternalCommunicationObject.g:2091:2: ( rule__CommElementReference__ArrayAssignment_1 )?
            {
             before(grammarAccess.getCommElementReferenceAccess().getArrayAssignment_1()); 
            // InternalCommunicationObject.g:2092:2: ( rule__CommElementReference__ArrayAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==48) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCommunicationObject.g:2092:3: rule__CommElementReference__ArrayAssignment_1
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
    // InternalCommunicationObject.g:2101:1: rule__SingleValue__Group_0__0 : rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 ;
    public final void rule__SingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2105:1: ( rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 )
            // InternalCommunicationObject.g:2106:2: rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1
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
    // InternalCommunicationObject.g:2113:1: rule__SingleValue__Group_0__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2117:1: ( ( () ) )
            // InternalCommunicationObject.g:2118:1: ( () )
            {
            // InternalCommunicationObject.g:2118:1: ( () )
            // InternalCommunicationObject.g:2119:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getCommElementValueAction_0_0()); 
            // InternalCommunicationObject.g:2120:2: ()
            // InternalCommunicationObject.g:2120:3: 
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
    // InternalCommunicationObject.g:2128:1: rule__SingleValue__Group_0__1 : rule__SingleValue__Group_0__1__Impl rule__SingleValue__Group_0__2 ;
    public final void rule__SingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2132:1: ( rule__SingleValue__Group_0__1__Impl rule__SingleValue__Group_0__2 )
            // InternalCommunicationObject.g:2133:2: rule__SingleValue__Group_0__1__Impl rule__SingleValue__Group_0__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalCommunicationObject.g:2140:1: rule__SingleValue__Group_0__1__Impl : ( ( rule__SingleValue__ValueAssignment_0_1 ) ) ;
    public final void rule__SingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2144:1: ( ( ( rule__SingleValue__ValueAssignment_0_1 ) ) )
            // InternalCommunicationObject.g:2145:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            {
            // InternalCommunicationObject.g:2145:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            // InternalCommunicationObject.g:2146:2: ( rule__SingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); 
            // InternalCommunicationObject.g:2147:2: ( rule__SingleValue__ValueAssignment_0_1 )
            // InternalCommunicationObject.g:2147:3: rule__SingleValue__ValueAssignment_0_1
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
    // InternalCommunicationObject.g:2155:1: rule__SingleValue__Group_0__2 : rule__SingleValue__Group_0__2__Impl rule__SingleValue__Group_0__3 ;
    public final void rule__SingleValue__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2159:1: ( rule__SingleValue__Group_0__2__Impl rule__SingleValue__Group_0__3 )
            // InternalCommunicationObject.g:2160:2: rule__SingleValue__Group_0__2__Impl rule__SingleValue__Group_0__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalCommunicationObject.g:2167:1: rule__SingleValue__Group_0__2__Impl : ( '(' ) ;
    public final void rule__SingleValue__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2171:1: ( ( '(' ) )
            // InternalCommunicationObject.g:2172:1: ( '(' )
            {
            // InternalCommunicationObject.g:2172:1: ( '(' )
            // InternalCommunicationObject.g:2173:2: '('
            {
             before(grammarAccess.getSingleValueAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCommunicationObject.g:2182:1: rule__SingleValue__Group_0__3 : rule__SingleValue__Group_0__3__Impl ;
    public final void rule__SingleValue__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2186:1: ( rule__SingleValue__Group_0__3__Impl )
            // InternalCommunicationObject.g:2187:2: rule__SingleValue__Group_0__3__Impl
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
    // InternalCommunicationObject.g:2193:1: rule__SingleValue__Group_0__3__Impl : ( ')' ) ;
    public final void rule__SingleValue__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2197:1: ( ( ')' ) )
            // InternalCommunicationObject.g:2198:1: ( ')' )
            {
            // InternalCommunicationObject.g:2198:1: ( ')' )
            // InternalCommunicationObject.g:2199:2: ')'
            {
             before(grammarAccess.getSingleValueAccess().getRightParenthesisKeyword_0_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCommunicationObject.g:2209:1: rule__AttributeDefinition__Group__0 : rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 ;
    public final void rule__AttributeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2213:1: ( rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 )
            // InternalCommunicationObject.g:2214:2: rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCommunicationObject.g:2221:1: rule__AttributeDefinition__Group__0__Impl : ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? ) ;
    public final void rule__AttributeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2225:1: ( ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? ) )
            // InternalCommunicationObject.g:2226:1: ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? )
            {
            // InternalCommunicationObject.g:2226:1: ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? )
            // InternalCommunicationObject.g:2227:2: ( rule__AttributeDefinition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDocumentationAssignment_0()); 
            // InternalCommunicationObject.g:2228:2: ( rule__AttributeDefinition__DocumentationAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DOCU_COMMENT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCommunicationObject.g:2228:3: rule__AttributeDefinition__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeDefinition__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeDefinitionAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:2236:1: rule__AttributeDefinition__Group__1 : rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 ;
    public final void rule__AttributeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2240:1: ( rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 )
            // InternalCommunicationObject.g:2241:2: rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalCommunicationObject.g:2248:1: rule__AttributeDefinition__Group__1__Impl : ( ( rule__AttributeDefinition__NameAssignment_1 ) ) ;
    public final void rule__AttributeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2252:1: ( ( ( rule__AttributeDefinition__NameAssignment_1 ) ) )
            // InternalCommunicationObject.g:2253:1: ( ( rule__AttributeDefinition__NameAssignment_1 ) )
            {
            // InternalCommunicationObject.g:2253:1: ( ( rule__AttributeDefinition__NameAssignment_1 ) )
            // InternalCommunicationObject.g:2254:2: ( rule__AttributeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_1()); 
            // InternalCommunicationObject.g:2255:2: ( rule__AttributeDefinition__NameAssignment_1 )
            // InternalCommunicationObject.g:2255:3: rule__AttributeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:2263:1: rule__AttributeDefinition__Group__2 : rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 ;
    public final void rule__AttributeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2267:1: ( rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 )
            // InternalCommunicationObject.g:2268:2: rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalCommunicationObject.g:2275:1: rule__AttributeDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__AttributeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2279:1: ( ( ':' ) )
            // InternalCommunicationObject.g:2280:1: ( ':' )
            {
            // InternalCommunicationObject.g:2280:1: ( ':' )
            // InternalCommunicationObject.g:2281:2: ':'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:2290:1: rule__AttributeDefinition__Group__3 : rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 ;
    public final void rule__AttributeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2294:1: ( rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 )
            // InternalCommunicationObject.g:2295:2: rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalCommunicationObject.g:2302:1: rule__AttributeDefinition__Group__3__Impl : ( ( rule__AttributeDefinition__TypeAssignment_3 ) ) ;
    public final void rule__AttributeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2306:1: ( ( ( rule__AttributeDefinition__TypeAssignment_3 ) ) )
            // InternalCommunicationObject.g:2307:1: ( ( rule__AttributeDefinition__TypeAssignment_3 ) )
            {
            // InternalCommunicationObject.g:2307:1: ( ( rule__AttributeDefinition__TypeAssignment_3 ) )
            // InternalCommunicationObject.g:2308:2: ( rule__AttributeDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_3()); 
            // InternalCommunicationObject.g:2309:2: ( rule__AttributeDefinition__TypeAssignment_3 )
            // InternalCommunicationObject.g:2309:3: rule__AttributeDefinition__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalCommunicationObject.g:2317:1: rule__AttributeDefinition__Group__4 : rule__AttributeDefinition__Group__4__Impl rule__AttributeDefinition__Group__5 ;
    public final void rule__AttributeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2321:1: ( rule__AttributeDefinition__Group__4__Impl rule__AttributeDefinition__Group__5 )
            // InternalCommunicationObject.g:2322:2: rule__AttributeDefinition__Group__4__Impl rule__AttributeDefinition__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__AttributeDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__5();

            state._fsp--;


            }

        }
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
    // InternalCommunicationObject.g:2329:1: rule__AttributeDefinition__Group__4__Impl : ( ( rule__AttributeDefinition__Group_4__0 )? ) ;
    public final void rule__AttributeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2333:1: ( ( ( rule__AttributeDefinition__Group_4__0 )? ) )
            // InternalCommunicationObject.g:2334:1: ( ( rule__AttributeDefinition__Group_4__0 )? )
            {
            // InternalCommunicationObject.g:2334:1: ( ( rule__AttributeDefinition__Group_4__0 )? )
            // InternalCommunicationObject.g:2335:2: ( rule__AttributeDefinition__Group_4__0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup_4()); 
            // InternalCommunicationObject.g:2336:2: ( rule__AttributeDefinition__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCommunicationObject.g:2336:3: rule__AttributeDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeDefinitionAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__AttributeDefinition__Group__5"
    // InternalCommunicationObject.g:2344:1: rule__AttributeDefinition__Group__5 : rule__AttributeDefinition__Group__5__Impl ;
    public final void rule__AttributeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2348:1: ( rule__AttributeDefinition__Group__5__Impl )
            // InternalCommunicationObject.g:2349:2: rule__AttributeDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__5"


    // $ANTLR start "rule__AttributeDefinition__Group__5__Impl"
    // InternalCommunicationObject.g:2355:1: rule__AttributeDefinition__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__AttributeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2359:1: ( ( ( ';' )? ) )
            // InternalCommunicationObject.g:2360:1: ( ( ';' )? )
            {
            // InternalCommunicationObject.g:2360:1: ( ( ';' )? )
            // InternalCommunicationObject.g:2361:2: ( ';' )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5()); 
            // InternalCommunicationObject.g:2362:2: ( ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCommunicationObject.g:2362:3: ';'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__5__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group_4__0"
    // InternalCommunicationObject.g:2371:1: rule__AttributeDefinition__Group_4__0 : rule__AttributeDefinition__Group_4__0__Impl rule__AttributeDefinition__Group_4__1 ;
    public final void rule__AttributeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2375:1: ( rule__AttributeDefinition__Group_4__0__Impl rule__AttributeDefinition__Group_4__1 )
            // InternalCommunicationObject.g:2376:2: rule__AttributeDefinition__Group_4__0__Impl rule__AttributeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__AttributeDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_4__0"


    // $ANTLR start "rule__AttributeDefinition__Group_4__0__Impl"
    // InternalCommunicationObject.g:2383:1: rule__AttributeDefinition__Group_4__0__Impl : ( '=' ) ;
    public final void rule__AttributeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2387:1: ( ( '=' ) )
            // InternalCommunicationObject.g:2388:1: ( '=' )
            {
            // InternalCommunicationObject.g:2388:1: ( '=' )
            // InternalCommunicationObject.g:2389:2: '='
            {
             before(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group_4__1"
    // InternalCommunicationObject.g:2398:1: rule__AttributeDefinition__Group_4__1 : rule__AttributeDefinition__Group_4__1__Impl ;
    public final void rule__AttributeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2402:1: ( rule__AttributeDefinition__Group_4__1__Impl )
            // InternalCommunicationObject.g:2403:2: rule__AttributeDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_4__1"


    // $ANTLR start "rule__AttributeDefinition__Group_4__1__Impl"
    // InternalCommunicationObject.g:2409:1: rule__AttributeDefinition__Group_4__1__Impl : ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) ) ;
    public final void rule__AttributeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2413:1: ( ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) ) )
            // InternalCommunicationObject.g:2414:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) )
            {
            // InternalCommunicationObject.g:2414:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) )
            // InternalCommunicationObject.g:2415:2: ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_4_1()); 
            // InternalCommunicationObject.g:2416:2: ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 )
            // InternalCommunicationObject.g:2416:3: rule__AttributeDefinition__DefaultvalueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__DefaultvalueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalCommunicationObject.g:2425:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2429:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalCommunicationObject.g:2430:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalCommunicationObject.g:2437:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2441:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:2442:1: ( RULE_ID )
            {
            // InternalCommunicationObject.g:2442:1: ( RULE_ID )
            // InternalCommunicationObject.g:2443:2: RULE_ID
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
    // InternalCommunicationObject.g:2452:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2456:1: ( rule__FQN__Group__1__Impl )
            // InternalCommunicationObject.g:2457:2: rule__FQN__Group__1__Impl
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
    // InternalCommunicationObject.g:2463:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2467:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalCommunicationObject.g:2468:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalCommunicationObject.g:2468:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalCommunicationObject.g:2469:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalCommunicationObject.g:2470:2: ( rule__FQN__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==39) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCommunicationObject.g:2470:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalCommunicationObject.g:2479:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2483:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalCommunicationObject.g:2484:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalCommunicationObject.g:2491:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2495:1: ( ( '.' ) )
            // InternalCommunicationObject.g:2496:1: ( '.' )
            {
            // InternalCommunicationObject.g:2496:1: ( '.' )
            // InternalCommunicationObject.g:2497:2: '.'
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
    // InternalCommunicationObject.g:2506:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2510:1: ( rule__FQN__Group_1__1__Impl )
            // InternalCommunicationObject.g:2511:2: rule__FQN__Group_1__1__Impl
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
    // InternalCommunicationObject.g:2517:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2521:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:2522:1: ( RULE_ID )
            {
            // InternalCommunicationObject.g:2522:1: ( RULE_ID )
            // InternalCommunicationObject.g:2523:2: RULE_ID
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
    // InternalCommunicationObject.g:2533:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2537:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalCommunicationObject.g:2538:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCommunicationObject.g:2545:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2549:1: ( ( ( '-' )? ) )
            // InternalCommunicationObject.g:2550:1: ( ( '-' )? )
            {
            // InternalCommunicationObject.g:2550:1: ( ( '-' )? )
            // InternalCommunicationObject.g:2551:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalCommunicationObject.g:2552:2: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCommunicationObject.g:2552:3: '-'
                    {
                    match(input,46,FOLLOW_2); 

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
    // InternalCommunicationObject.g:2560:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2564:1: ( rule__EInt__Group__1__Impl )
            // InternalCommunicationObject.g:2565:2: rule__EInt__Group__1__Impl
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
    // InternalCommunicationObject.g:2571:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2575:1: ( ( RULE_INT ) )
            // InternalCommunicationObject.g:2576:1: ( RULE_INT )
            {
            // InternalCommunicationObject.g:2576:1: ( RULE_INT )
            // InternalCommunicationObject.g:2577:2: RULE_INT
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
    // InternalCommunicationObject.g:2587:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2591:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalCommunicationObject.g:2592:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalCommunicationObject.g:2599:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2603:1: ( ( ( '-' )? ) )
            // InternalCommunicationObject.g:2604:1: ( ( '-' )? )
            {
            // InternalCommunicationObject.g:2604:1: ( ( '-' )? )
            // InternalCommunicationObject.g:2605:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalCommunicationObject.g:2606:2: ( '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCommunicationObject.g:2606:3: '-'
                    {
                    match(input,46,FOLLOW_2); 

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
    // InternalCommunicationObject.g:2614:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2618:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalCommunicationObject.g:2619:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalCommunicationObject.g:2626:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2630:1: ( ( ( RULE_INT )? ) )
            // InternalCommunicationObject.g:2631:1: ( ( RULE_INT )? )
            {
            // InternalCommunicationObject.g:2631:1: ( ( RULE_INT )? )
            // InternalCommunicationObject.g:2632:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalCommunicationObject.g:2633:2: ( RULE_INT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCommunicationObject.g:2633:3: RULE_INT
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
    // InternalCommunicationObject.g:2641:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2645:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalCommunicationObject.g:2646:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
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
    // InternalCommunicationObject.g:2653:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2657:1: ( ( '.' ) )
            // InternalCommunicationObject.g:2658:1: ( '.' )
            {
            // InternalCommunicationObject.g:2658:1: ( '.' )
            // InternalCommunicationObject.g:2659:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCommunicationObject.g:2668:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2672:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalCommunicationObject.g:2673:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalCommunicationObject.g:2680:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2684:1: ( ( RULE_INT ) )
            // InternalCommunicationObject.g:2685:1: ( RULE_INT )
            {
            // InternalCommunicationObject.g:2685:1: ( RULE_INT )
            // InternalCommunicationObject.g:2686:2: RULE_INT
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
    // InternalCommunicationObject.g:2695:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2699:1: ( rule__EDouble__Group__4__Impl )
            // InternalCommunicationObject.g:2700:2: rule__EDouble__Group__4__Impl
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
    // InternalCommunicationObject.g:2706:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2710:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalCommunicationObject.g:2711:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalCommunicationObject.g:2711:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalCommunicationObject.g:2712:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalCommunicationObject.g:2713:2: ( rule__EDouble__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=16 && LA33_0<=17)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCommunicationObject.g:2713:3: rule__EDouble__Group_4__0
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
    // InternalCommunicationObject.g:2722:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2726:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalCommunicationObject.g:2727:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCommunicationObject.g:2734:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2738:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalCommunicationObject.g:2739:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalCommunicationObject.g:2739:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalCommunicationObject.g:2740:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalCommunicationObject.g:2741:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalCommunicationObject.g:2741:3: rule__EDouble__Alternatives_4_0
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
    // InternalCommunicationObject.g:2749:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2753:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalCommunicationObject.g:2754:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalCommunicationObject.g:2761:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2765:1: ( ( ( '-' )? ) )
            // InternalCommunicationObject.g:2766:1: ( ( '-' )? )
            {
            // InternalCommunicationObject.g:2766:1: ( ( '-' )? )
            // InternalCommunicationObject.g:2767:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalCommunicationObject.g:2768:2: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCommunicationObject.g:2768:3: '-'
                    {
                    match(input,46,FOLLOW_2); 

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
    // InternalCommunicationObject.g:2776:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2780:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalCommunicationObject.g:2781:2: rule__EDouble__Group_4__2__Impl
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
    // InternalCommunicationObject.g:2787:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2791:1: ( ( RULE_INT ) )
            // InternalCommunicationObject.g:2792:1: ( RULE_INT )
            {
            // InternalCommunicationObject.g:2792:1: ( RULE_INT )
            // InternalCommunicationObject.g:2793:2: RULE_INT
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
    // InternalCommunicationObject.g:2803:1: rule__EnumerationElement__Group__0 : rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 ;
    public final void rule__EnumerationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2807:1: ( rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 )
            // InternalCommunicationObject.g:2808:2: rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalCommunicationObject.g:2815:1: rule__EnumerationElement__Group__0__Impl : ( ( rule__EnumerationElement__NameAssignment_0 ) ) ;
    public final void rule__EnumerationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2819:1: ( ( ( rule__EnumerationElement__NameAssignment_0 ) ) )
            // InternalCommunicationObject.g:2820:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            {
            // InternalCommunicationObject.g:2820:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            // InternalCommunicationObject.g:2821:2: ( rule__EnumerationElement__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); 
            // InternalCommunicationObject.g:2822:2: ( rule__EnumerationElement__NameAssignment_0 )
            // InternalCommunicationObject.g:2822:3: rule__EnumerationElement__NameAssignment_0
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
    // InternalCommunicationObject.g:2830:1: rule__EnumerationElement__Group__1 : rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 ;
    public final void rule__EnumerationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2834:1: ( rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 )
            // InternalCommunicationObject.g:2835:2: rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalCommunicationObject.g:2842:1: rule__EnumerationElement__Group__1__Impl : ( ( rule__EnumerationElement__Group_1__0 )? ) ;
    public final void rule__EnumerationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2846:1: ( ( ( rule__EnumerationElement__Group_1__0 )? ) )
            // InternalCommunicationObject.g:2847:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            {
            // InternalCommunicationObject.g:2847:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            // InternalCommunicationObject.g:2848:2: ( rule__EnumerationElement__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup_1()); 
            // InternalCommunicationObject.g:2849:2: ( rule__EnumerationElement__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCommunicationObject.g:2849:3: rule__EnumerationElement__Group_1__0
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
    // InternalCommunicationObject.g:2857:1: rule__EnumerationElement__Group__2 : rule__EnumerationElement__Group__2__Impl ;
    public final void rule__EnumerationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2861:1: ( rule__EnumerationElement__Group__2__Impl )
            // InternalCommunicationObject.g:2862:2: rule__EnumerationElement__Group__2__Impl
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
    // InternalCommunicationObject.g:2868:1: rule__EnumerationElement__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__EnumerationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2872:1: ( ( ( ';' )? ) )
            // InternalCommunicationObject.g:2873:1: ( ( ';' )? )
            {
            // InternalCommunicationObject.g:2873:1: ( ( ';' )? )
            // InternalCommunicationObject.g:2874:2: ( ';' )?
            {
             before(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); 
            // InternalCommunicationObject.g:2875:2: ( ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCommunicationObject.g:2875:3: ';'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalCommunicationObject.g:2884:1: rule__EnumerationElement__Group_1__0 : rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 ;
    public final void rule__EnumerationElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2888:1: ( rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 )
            // InternalCommunicationObject.g:2889:2: rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCommunicationObject.g:2896:1: rule__EnumerationElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2900:1: ( ( '=' ) )
            // InternalCommunicationObject.g:2901:1: ( '=' )
            {
            // InternalCommunicationObject.g:2901:1: ( '=' )
            // InternalCommunicationObject.g:2902:2: '='
            {
             before(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCommunicationObject.g:2911:1: rule__EnumerationElement__Group_1__1 : rule__EnumerationElement__Group_1__1__Impl ;
    public final void rule__EnumerationElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2915:1: ( rule__EnumerationElement__Group_1__1__Impl )
            // InternalCommunicationObject.g:2916:2: rule__EnumerationElement__Group_1__1__Impl
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
    // InternalCommunicationObject.g:2922:1: rule__EnumerationElement__Group_1__1__Impl : ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2926:1: ( ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) )
            // InternalCommunicationObject.g:2927:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            {
            // InternalCommunicationObject.g:2927:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            // InternalCommunicationObject.g:2928:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); 
            // InternalCommunicationObject.g:2929:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            // InternalCommunicationObject.g:2929:3: rule__EnumerationElement__ValueAssignment_1_1
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
    // InternalCommunicationObject.g:2938:1: rule__InlineEnumerationType__Group__0 : rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 ;
    public final void rule__InlineEnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2942:1: ( rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 )
            // InternalCommunicationObject.g:2943:2: rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalCommunicationObject.g:2950:1: rule__InlineEnumerationType__Group__0__Impl : ( 'InlineEnumeration' ) ;
    public final void rule__InlineEnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2954:1: ( ( 'InlineEnumeration' ) )
            // InternalCommunicationObject.g:2955:1: ( 'InlineEnumeration' )
            {
            // InternalCommunicationObject.g:2955:1: ( 'InlineEnumeration' )
            // InternalCommunicationObject.g:2956:2: 'InlineEnumeration'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCommunicationObject.g:2965:1: rule__InlineEnumerationType__Group__1 : rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 ;
    public final void rule__InlineEnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2969:1: ( rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 )
            // InternalCommunicationObject.g:2970:2: rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalCommunicationObject.g:2977:1: rule__InlineEnumerationType__Group__1__Impl : ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) ;
    public final void rule__InlineEnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2981:1: ( ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) )
            // InternalCommunicationObject.g:2982:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            {
            // InternalCommunicationObject.g:2982:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            // InternalCommunicationObject.g:2983:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); 
            // InternalCommunicationObject.g:2984:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCommunicationObject.g:2984:3: rule__InlineEnumerationType__ArrayAssignment_1
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
    // InternalCommunicationObject.g:2992:1: rule__InlineEnumerationType__Group__2 : rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 ;
    public final void rule__InlineEnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:2996:1: ( rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 )
            // InternalCommunicationObject.g:2997:2: rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3
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
    // InternalCommunicationObject.g:3004:1: rule__InlineEnumerationType__Group__2__Impl : ( '{' ) ;
    public final void rule__InlineEnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3008:1: ( ( '{' ) )
            // InternalCommunicationObject.g:3009:1: ( '{' )
            {
            // InternalCommunicationObject.g:3009:1: ( '{' )
            // InternalCommunicationObject.g:3010:2: '{'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCommunicationObject.g:3019:1: rule__InlineEnumerationType__Group__3 : rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 ;
    public final void rule__InlineEnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3023:1: ( rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 )
            // InternalCommunicationObject.g:3024:2: rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalCommunicationObject.g:3031:1: rule__InlineEnumerationType__Group__3__Impl : ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) ;
    public final void rule__InlineEnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3035:1: ( ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) )
            // InternalCommunicationObject.g:3036:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            {
            // InternalCommunicationObject.g:3036:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            // InternalCommunicationObject.g:3037:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            {
            // InternalCommunicationObject.g:3037:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) )
            // InternalCommunicationObject.g:3038:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalCommunicationObject.g:3039:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            // InternalCommunicationObject.g:3039:4: rule__InlineEnumerationType__EnumsAssignment_3
            {
            pushFollow(FOLLOW_20);
            rule__InlineEnumerationType__EnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 

            }

            // InternalCommunicationObject.g:3042:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            // InternalCommunicationObject.g:3043:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalCommunicationObject.g:3044:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCommunicationObject.g:3044:4: rule__InlineEnumerationType__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__InlineEnumerationType__EnumsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalCommunicationObject.g:3053:1: rule__InlineEnumerationType__Group__4 : rule__InlineEnumerationType__Group__4__Impl ;
    public final void rule__InlineEnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3057:1: ( rule__InlineEnumerationType__Group__4__Impl )
            // InternalCommunicationObject.g:3058:2: rule__InlineEnumerationType__Group__4__Impl
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
    // InternalCommunicationObject.g:3064:1: rule__InlineEnumerationType__Group__4__Impl : ( '}' ) ;
    public final void rule__InlineEnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3068:1: ( ( '}' ) )
            // InternalCommunicationObject.g:3069:1: ( '}' )
            {
            // InternalCommunicationObject.g:3069:1: ( '}' )
            // InternalCommunicationObject.g:3070:2: '}'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCommunicationObject.g:3080:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3084:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalCommunicationObject.g:3085:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCommunicationObject.g:3092:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3096:1: ( ( () ) )
            // InternalCommunicationObject.g:3097:1: ( () )
            {
            // InternalCommunicationObject.g:3097:1: ( () )
            // InternalCommunicationObject.g:3098:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // InternalCommunicationObject.g:3099:2: ()
            // InternalCommunicationObject.g:3099:3: 
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
    // InternalCommunicationObject.g:3107:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3111:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalCommunicationObject.g:3112:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalCommunicationObject.g:3119:1: rule__ArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3123:1: ( ( '[' ) )
            // InternalCommunicationObject.g:3124:1: ( '[' )
            {
            // InternalCommunicationObject.g:3124:1: ( '[' )
            // InternalCommunicationObject.g:3125:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCommunicationObject.g:3134:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3138:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalCommunicationObject.g:3139:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalCommunicationObject.g:3146:1: rule__ArrayType__Group__2__Impl : ( ( rule__ArrayType__LengthAssignment_2 )? ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3150:1: ( ( ( rule__ArrayType__LengthAssignment_2 )? ) )
            // InternalCommunicationObject.g:3151:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            {
            // InternalCommunicationObject.g:3151:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            // InternalCommunicationObject.g:3152:2: ( rule__ArrayType__LengthAssignment_2 )?
            {
             before(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); 
            // InternalCommunicationObject.g:3153:2: ( rule__ArrayType__LengthAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT||LA39_0==18) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCommunicationObject.g:3153:3: rule__ArrayType__LengthAssignment_2
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
    // InternalCommunicationObject.g:3161:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3165:1: ( rule__ArrayType__Group__3__Impl )
            // InternalCommunicationObject.g:3166:2: rule__ArrayType__Group__3__Impl
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
    // InternalCommunicationObject.g:3172:1: rule__ArrayType__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3176:1: ( ( ']' ) )
            // InternalCommunicationObject.g:3177:1: ( ']' )
            {
            // InternalCommunicationObject.g:3177:1: ( ']' )
            // InternalCommunicationObject.g:3178:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCommunicationObject.g:3188:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3192:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalCommunicationObject.g:3193:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCommunicationObject.g:3200:1: rule__PrimitiveType__Group__0__Impl : ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3204:1: ( ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) )
            // InternalCommunicationObject.g:3205:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            {
            // InternalCommunicationObject.g:3205:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            // InternalCommunicationObject.g:3206:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); 
            // InternalCommunicationObject.g:3207:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            // InternalCommunicationObject.g:3207:3: rule__PrimitiveType__TypeNameAssignment_0
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
    // InternalCommunicationObject.g:3215:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3219:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalCommunicationObject.g:3220:2: rule__PrimitiveType__Group__1__Impl
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
    // InternalCommunicationObject.g:3226:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3230:1: ( ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) )
            // InternalCommunicationObject.g:3231:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            {
            // InternalCommunicationObject.g:3231:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            // InternalCommunicationObject.g:3232:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); 
            // InternalCommunicationObject.g:3233:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCommunicationObject.g:3233:3: rule__PrimitiveType__ArrayAssignment_1
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
    // InternalCommunicationObject.g:3242:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3246:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalCommunicationObject.g:3247:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalCommunicationObject.g:3254:1: rule__ArrayValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3258:1: ( ( '[' ) )
            // InternalCommunicationObject.g:3259:1: ( '[' )
            {
            // InternalCommunicationObject.g:3259:1: ( '[' )
            // InternalCommunicationObject.g:3260:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCommunicationObject.g:3269:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3273:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalCommunicationObject.g:3274:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalCommunicationObject.g:3281:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_1 ) ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3285:1: ( ( ( rule__ArrayValue__ValuesAssignment_1 ) ) )
            // InternalCommunicationObject.g:3286:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            {
            // InternalCommunicationObject.g:3286:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            // InternalCommunicationObject.g:3287:2: ( rule__ArrayValue__ValuesAssignment_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); 
            // InternalCommunicationObject.g:3288:2: ( rule__ArrayValue__ValuesAssignment_1 )
            // InternalCommunicationObject.g:3288:3: rule__ArrayValue__ValuesAssignment_1
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
    // InternalCommunicationObject.g:3296:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3300:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalCommunicationObject.g:3301:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalCommunicationObject.g:3308:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )* ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3312:1: ( ( ( rule__ArrayValue__Group_2__0 )* ) )
            // InternalCommunicationObject.g:3313:1: ( ( rule__ArrayValue__Group_2__0 )* )
            {
            // InternalCommunicationObject.g:3313:1: ( ( rule__ArrayValue__Group_2__0 )* )
            // InternalCommunicationObject.g:3314:2: ( rule__ArrayValue__Group_2__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalCommunicationObject.g:3315:2: ( rule__ArrayValue__Group_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==50) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCommunicationObject.g:3315:3: rule__ArrayValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__ArrayValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalCommunicationObject.g:3323:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3327:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalCommunicationObject.g:3328:2: rule__ArrayValue__Group__3__Impl
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
    // InternalCommunicationObject.g:3334:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3338:1: ( ( ']' ) )
            // InternalCommunicationObject.g:3339:1: ( ']' )
            {
            // InternalCommunicationObject.g:3339:1: ( ']' )
            // InternalCommunicationObject.g:3340:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCommunicationObject.g:3350:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3354:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalCommunicationObject.g:3355:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalCommunicationObject.g:3362:1: rule__ArrayValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3366:1: ( ( ',' ) )
            // InternalCommunicationObject.g:3367:1: ( ',' )
            {
            // InternalCommunicationObject.g:3367:1: ( ',' )
            // InternalCommunicationObject.g:3368:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCommunicationObject.g:3377:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3381:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalCommunicationObject.g:3382:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalCommunicationObject.g:3388:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3392:1: ( ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) )
            // InternalCommunicationObject.g:3393:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            {
            // InternalCommunicationObject.g:3393:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            // InternalCommunicationObject.g:3394:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); 
            // InternalCommunicationObject.g:3395:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            // InternalCommunicationObject.g:3395:3: rule__ArrayValue__ValuesAssignment_2_1
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
    // InternalCommunicationObject.g:3404:1: superSingleValue__Group_0__0 : superSingleValue__Group_0__0__Impl superSingleValue__Group_0__1 ;
    public final void superSingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3408:1: ( superSingleValue__Group_0__0__Impl superSingleValue__Group_0__1 )
            // InternalCommunicationObject.g:3409:2: superSingleValue__Group_0__0__Impl superSingleValue__Group_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCommunicationObject.g:3416:1: superSingleValue__Group_0__0__Impl : ( () ) ;
    public final void superSingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3420:1: ( ( () ) )
            // InternalCommunicationObject.g:3421:1: ( () )
            {
            // InternalCommunicationObject.g:3421:1: ( () )
            // InternalCommunicationObject.g:3422:2: ()
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getIntValueAction_0_0()); 
            // InternalCommunicationObject.g:3423:2: ()
            // InternalCommunicationObject.g:3423:3: 
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
    // InternalCommunicationObject.g:3431:1: superSingleValue__Group_0__1 : superSingleValue__Group_0__1__Impl ;
    public final void superSingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3435:1: ( superSingleValue__Group_0__1__Impl )
            // InternalCommunicationObject.g:3436:2: superSingleValue__Group_0__1__Impl
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
    // InternalCommunicationObject.g:3442:1: superSingleValue__Group_0__1__Impl : ( ( superSingleValue__ValueAssignment_0_1 ) ) ;
    public final void superSingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3446:1: ( ( ( superSingleValue__ValueAssignment_0_1 ) ) )
            // InternalCommunicationObject.g:3447:1: ( ( superSingleValue__ValueAssignment_0_1 ) )
            {
            // InternalCommunicationObject.g:3447:1: ( ( superSingleValue__ValueAssignment_0_1 ) )
            // InternalCommunicationObject.g:3448:2: ( superSingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_0_1()); 
            // InternalCommunicationObject.g:3449:2: ( superSingleValue__ValueAssignment_0_1 )
            // InternalCommunicationObject.g:3449:3: superSingleValue__ValueAssignment_0_1
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
    // InternalCommunicationObject.g:3458:1: superSingleValue__Group_1__0 : superSingleValue__Group_1__0__Impl superSingleValue__Group_1__1 ;
    public final void superSingleValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3462:1: ( superSingleValue__Group_1__0__Impl superSingleValue__Group_1__1 )
            // InternalCommunicationObject.g:3463:2: superSingleValue__Group_1__0__Impl superSingleValue__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalCommunicationObject.g:3470:1: superSingleValue__Group_1__0__Impl : ( () ) ;
    public final void superSingleValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3474:1: ( ( () ) )
            // InternalCommunicationObject.g:3475:1: ( () )
            {
            // InternalCommunicationObject.g:3475:1: ( () )
            // InternalCommunicationObject.g:3476:2: ()
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getFloatingPointValueAction_1_0()); 
            // InternalCommunicationObject.g:3477:2: ()
            // InternalCommunicationObject.g:3477:3: 
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
    // InternalCommunicationObject.g:3485:1: superSingleValue__Group_1__1 : superSingleValue__Group_1__1__Impl ;
    public final void superSingleValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3489:1: ( superSingleValue__Group_1__1__Impl )
            // InternalCommunicationObject.g:3490:2: superSingleValue__Group_1__1__Impl
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
    // InternalCommunicationObject.g:3496:1: superSingleValue__Group_1__1__Impl : ( ( superSingleValue__ValueAssignment_1_1 ) ) ;
    public final void superSingleValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3500:1: ( ( ( superSingleValue__ValueAssignment_1_1 ) ) )
            // InternalCommunicationObject.g:3501:1: ( ( superSingleValue__ValueAssignment_1_1 ) )
            {
            // InternalCommunicationObject.g:3501:1: ( ( superSingleValue__ValueAssignment_1_1 ) )
            // InternalCommunicationObject.g:3502:2: ( superSingleValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_1_1()); 
            // InternalCommunicationObject.g:3503:2: ( superSingleValue__ValueAssignment_1_1 )
            // InternalCommunicationObject.g:3503:3: superSingleValue__ValueAssignment_1_1
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
    // InternalCommunicationObject.g:3512:1: superSingleValue__Group_2__0 : superSingleValue__Group_2__0__Impl superSingleValue__Group_2__1 ;
    public final void superSingleValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3516:1: ( superSingleValue__Group_2__0__Impl superSingleValue__Group_2__1 )
            // InternalCommunicationObject.g:3517:2: superSingleValue__Group_2__0__Impl superSingleValue__Group_2__1
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
    // InternalCommunicationObject.g:3524:1: superSingleValue__Group_2__0__Impl : ( () ) ;
    public final void superSingleValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3528:1: ( ( () ) )
            // InternalCommunicationObject.g:3529:1: ( () )
            {
            // InternalCommunicationObject.g:3529:1: ( () )
            // InternalCommunicationObject.g:3530:2: ()
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getStringValueAction_2_0()); 
            // InternalCommunicationObject.g:3531:2: ()
            // InternalCommunicationObject.g:3531:3: 
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
    // InternalCommunicationObject.g:3539:1: superSingleValue__Group_2__1 : superSingleValue__Group_2__1__Impl ;
    public final void superSingleValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3543:1: ( superSingleValue__Group_2__1__Impl )
            // InternalCommunicationObject.g:3544:2: superSingleValue__Group_2__1__Impl
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
    // InternalCommunicationObject.g:3550:1: superSingleValue__Group_2__1__Impl : ( ( superSingleValue__ValueAssignment_2_1 ) ) ;
    public final void superSingleValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3554:1: ( ( ( superSingleValue__ValueAssignment_2_1 ) ) )
            // InternalCommunicationObject.g:3555:1: ( ( superSingleValue__ValueAssignment_2_1 ) )
            {
            // InternalCommunicationObject.g:3555:1: ( ( superSingleValue__ValueAssignment_2_1 ) )
            // InternalCommunicationObject.g:3556:2: ( superSingleValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_2_1()); 
            // InternalCommunicationObject.g:3557:2: ( superSingleValue__ValueAssignment_2_1 )
            // InternalCommunicationObject.g:3557:3: superSingleValue__ValueAssignment_2_1
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
    // InternalCommunicationObject.g:3566:1: superSingleValue__Group_3__0 : superSingleValue__Group_3__0__Impl superSingleValue__Group_3__1 ;
    public final void superSingleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3570:1: ( superSingleValue__Group_3__0__Impl superSingleValue__Group_3__1 )
            // InternalCommunicationObject.g:3571:2: superSingleValue__Group_3__0__Impl superSingleValue__Group_3__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalCommunicationObject.g:3578:1: superSingleValue__Group_3__0__Impl : ( () ) ;
    public final void superSingleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3582:1: ( ( () ) )
            // InternalCommunicationObject.g:3583:1: ( () )
            {
            // InternalCommunicationObject.g:3583:1: ( () )
            // InternalCommunicationObject.g:3584:2: ()
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getBoolValueAction_3_0()); 
            // InternalCommunicationObject.g:3585:2: ()
            // InternalCommunicationObject.g:3585:3: 
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
    // InternalCommunicationObject.g:3593:1: superSingleValue__Group_3__1 : superSingleValue__Group_3__1__Impl ;
    public final void superSingleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3597:1: ( superSingleValue__Group_3__1__Impl )
            // InternalCommunicationObject.g:3598:2: superSingleValue__Group_3__1__Impl
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
    // InternalCommunicationObject.g:3604:1: superSingleValue__Group_3__1__Impl : ( ( superSingleValue__ValueAssignment_3_1 ) ) ;
    public final void superSingleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3608:1: ( ( ( superSingleValue__ValueAssignment_3_1 ) ) )
            // InternalCommunicationObject.g:3609:1: ( ( superSingleValue__ValueAssignment_3_1 ) )
            {
            // InternalCommunicationObject.g:3609:1: ( ( superSingleValue__ValueAssignment_3_1 ) )
            // InternalCommunicationObject.g:3610:2: ( superSingleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_3_1()); 
            // InternalCommunicationObject.g:3611:2: ( superSingleValue__ValueAssignment_3_1 )
            // InternalCommunicationObject.g:3611:3: superSingleValue__ValueAssignment_3_1
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
    // InternalCommunicationObject.g:3620:1: superSingleValue__Group_4__0 : superSingleValue__Group_4__0__Impl superSingleValue__Group_4__1 ;
    public final void superSingleValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3624:1: ( superSingleValue__Group_4__0__Impl superSingleValue__Group_4__1 )
            // InternalCommunicationObject.g:3625:2: superSingleValue__Group_4__0__Impl superSingleValue__Group_4__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalCommunicationObject.g:3632:1: superSingleValue__Group_4__0__Impl : ( () ) ;
    public final void superSingleValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3636:1: ( ( () ) )
            // InternalCommunicationObject.g:3637:1: ( () )
            {
            // InternalCommunicationObject.g:3637:1: ( () )
            // InternalCommunicationObject.g:3638:2: ()
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getEnumerationValueAction_4_0()); 
            // InternalCommunicationObject.g:3639:2: ()
            // InternalCommunicationObject.g:3639:3: 
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
    // InternalCommunicationObject.g:3647:1: superSingleValue__Group_4__1 : superSingleValue__Group_4__1__Impl ;
    public final void superSingleValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3651:1: ( superSingleValue__Group_4__1__Impl )
            // InternalCommunicationObject.g:3652:2: superSingleValue__Group_4__1__Impl
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
    // InternalCommunicationObject.g:3658:1: superSingleValue__Group_4__1__Impl : ( ( superSingleValue__ValueAssignment_4_1 ) ) ;
    public final void superSingleValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3662:1: ( ( ( superSingleValue__ValueAssignment_4_1 ) ) )
            // InternalCommunicationObject.g:3663:1: ( ( superSingleValue__ValueAssignment_4_1 ) )
            {
            // InternalCommunicationObject.g:3663:1: ( ( superSingleValue__ValueAssignment_4_1 ) )
            // InternalCommunicationObject.g:3664:2: ( superSingleValue__ValueAssignment_4_1 )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueAssignment_4_1()); 
            // InternalCommunicationObject.g:3665:2: ( superSingleValue__ValueAssignment_4_1 )
            // InternalCommunicationObject.g:3665:3: superSingleValue__ValueAssignment_4_1
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
    // InternalCommunicationObject.g:3674:1: rule__CommObjectModel__ImportsAssignment_0 : ( ruleCommRepositoryImport ) ;
    public final void rule__CommObjectModel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3678:1: ( ( ruleCommRepositoryImport ) )
            // InternalCommunicationObject.g:3679:2: ( ruleCommRepositoryImport )
            {
            // InternalCommunicationObject.g:3679:2: ( ruleCommRepositoryImport )
            // InternalCommunicationObject.g:3680:3: ruleCommRepositoryImport
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
    // InternalCommunicationObject.g:3689:1: rule__CommObjectModel__RepositoryAssignment_1 : ( ruleCommObjectsRepository ) ;
    public final void rule__CommObjectModel__RepositoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3693:1: ( ( ruleCommObjectsRepository ) )
            // InternalCommunicationObject.g:3694:2: ( ruleCommObjectsRepository )
            {
            // InternalCommunicationObject.g:3694:2: ( ruleCommObjectsRepository )
            // InternalCommunicationObject.g:3695:3: ruleCommObjectsRepository
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
    // InternalCommunicationObject.g:3704:1: rule__CommRepositoryImport__ImportedNamespaceAssignment_1 : ( ruleFQNW ) ;
    public final void rule__CommRepositoryImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3708:1: ( ( ruleFQNW ) )
            // InternalCommunicationObject.g:3709:2: ( ruleFQNW )
            {
            // InternalCommunicationObject.g:3709:2: ( ruleFQNW )
            // InternalCommunicationObject.g:3710:3: ruleFQNW
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


    // $ANTLR start "rule__CommObjectsRepository__DocumentationAssignment_0"
    // InternalCommunicationObject.g:3719:1: rule__CommObjectsRepository__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__CommObjectsRepository__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3723:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalCommunicationObject.g:3724:2: ( RULE_DOCU_COMMENT )
            {
            // InternalCommunicationObject.g:3724:2: ( RULE_DOCU_COMMENT )
            // InternalCommunicationObject.g:3725:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__DocumentationAssignment_0"


    // $ANTLR start "rule__CommObjectsRepository__NameAssignment_2"
    // InternalCommunicationObject.g:3734:1: rule__CommObjectsRepository__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CommObjectsRepository__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3738:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:3739:2: ( RULE_ID )
            {
            // InternalCommunicationObject.g:3739:2: ( RULE_ID )
            // InternalCommunicationObject.g:3740:3: RULE_ID
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommObjectsRepositoryAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__NameAssignment_2"


    // $ANTLR start "rule__CommObjectsRepository__VersionAssignment_3_1"
    // InternalCommunicationObject.g:3749:1: rule__CommObjectsRepository__VersionAssignment_3_1 : ( ruleVersion ) ;
    public final void rule__CommObjectsRepository__VersionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3753:1: ( ( ruleVersion ) )
            // InternalCommunicationObject.g:3754:2: ( ruleVersion )
            {
            // InternalCommunicationObject.g:3754:2: ( ruleVersion )
            // InternalCommunicationObject.g:3755:3: ruleVersion
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getVersionVersionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getCommObjectsRepositoryAccess().getVersionVersionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__VersionAssignment_3_1"


    // $ANTLR start "rule__CommObjectsRepository__DependencyAssignment_5_1"
    // InternalCommunicationObject.g:3764:1: rule__CommObjectsRepository__DependencyAssignment_5_1 : ( ruleEString ) ;
    public final void rule__CommObjectsRepository__DependencyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3768:1: ( ( ruleEString ) )
            // InternalCommunicationObject.g:3769:2: ( ruleEString )
            {
            // InternalCommunicationObject.g:3769:2: ( ruleEString )
            // InternalCommunicationObject.g:3770:3: ruleEString
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getDependencyEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommObjectsRepositoryAccess().getDependencyEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__DependencyAssignment_5_1"


    // $ANTLR start "rule__CommObjectsRepository__ElementsAssignment_6"
    // InternalCommunicationObject.g:3779:1: rule__CommObjectsRepository__ElementsAssignment_6 : ( ruleAbstractCommElement ) ;
    public final void rule__CommObjectsRepository__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3783:1: ( ( ruleAbstractCommElement ) )
            // InternalCommunicationObject.g:3784:2: ( ruleAbstractCommElement )
            {
            // InternalCommunicationObject.g:3784:2: ( ruleAbstractCommElement )
            // InternalCommunicationObject.g:3785:3: ruleAbstractCommElement
            {
             before(grammarAccess.getCommObjectsRepositoryAccess().getElementsAbstractCommElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractCommElement();

            state._fsp--;

             after(grammarAccess.getCommObjectsRepositoryAccess().getElementsAbstractCommElementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommObjectsRepository__ElementsAssignment_6"


    // $ANTLR start "rule__Version__MajorAssignment_0"
    // InternalCommunicationObject.g:3794:1: rule__Version__MajorAssignment_0 : ( RULE_INT ) ;
    public final void rule__Version__MajorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3798:1: ( ( RULE_INT ) )
            // InternalCommunicationObject.g:3799:2: ( RULE_INT )
            {
            // InternalCommunicationObject.g:3799:2: ( RULE_INT )
            // InternalCommunicationObject.g:3800:3: RULE_INT
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
    // InternalCommunicationObject.g:3809:1: rule__Version__MinorAssignment_2 : ( RULE_INT ) ;
    public final void rule__Version__MinorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3813:1: ( ( RULE_INT ) )
            // InternalCommunicationObject.g:3814:2: ( RULE_INT )
            {
            // InternalCommunicationObject.g:3814:2: ( RULE_INT )
            // InternalCommunicationObject.g:3815:3: RULE_INT
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
    // InternalCommunicationObject.g:3824:1: rule__Version__PatchAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Version__PatchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3828:1: ( ( RULE_INT ) )
            // InternalCommunicationObject.g:3829:2: ( RULE_INT )
            {
            // InternalCommunicationObject.g:3829:2: ( RULE_INT )
            // InternalCommunicationObject.g:3830:3: RULE_INT
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


    // $ANTLR start "rule__CommunicationObject__DocumentationAssignment_0"
    // InternalCommunicationObject.g:3839:1: rule__CommunicationObject__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__CommunicationObject__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3843:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalCommunicationObject.g:3844:2: ( RULE_DOCU_COMMENT )
            {
            // InternalCommunicationObject.g:3844:2: ( RULE_DOCU_COMMENT )
            // InternalCommunicationObject.g:3845:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getCommunicationObjectAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getCommunicationObjectAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__DocumentationAssignment_0"


    // $ANTLR start "rule__CommunicationObject__NameAssignment_2"
    // InternalCommunicationObject.g:3854:1: rule__CommunicationObject__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CommunicationObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3858:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:3859:2: ( RULE_ID )
            {
            // InternalCommunicationObject.g:3859:2: ( RULE_ID )
            // InternalCommunicationObject.g:3860:3: RULE_ID
            {
             before(grammarAccess.getCommunicationObjectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommunicationObjectAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__NameAssignment_2"


    // $ANTLR start "rule__CommunicationObject__AttributesAssignment_4"
    // InternalCommunicationObject.g:3869:1: rule__CommunicationObject__AttributesAssignment_4 : ( ruleAttributeDefinition ) ;
    public final void rule__CommunicationObject__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3873:1: ( ( ruleAttributeDefinition ) )
            // InternalCommunicationObject.g:3874:2: ( ruleAttributeDefinition )
            {
            // InternalCommunicationObject.g:3874:2: ( ruleAttributeDefinition )
            // InternalCommunicationObject.g:3875:3: ruleAttributeDefinition
            {
             before(grammarAccess.getCommunicationObjectAccess().getAttributesAttributeDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getCommunicationObjectAccess().getAttributesAttributeDefinitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationObject__AttributesAssignment_4"


    // $ANTLR start "rule__Enumeration__DocumentationAssignment_0"
    // InternalCommunicationObject.g:3884:1: rule__Enumeration__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__Enumeration__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3888:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalCommunicationObject.g:3889:2: ( RULE_DOCU_COMMENT )
            {
            // InternalCommunicationObject.g:3889:2: ( RULE_DOCU_COMMENT )
            // InternalCommunicationObject.g:3890:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getEnumerationAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__DocumentationAssignment_0"


    // $ANTLR start "rule__Enumeration__NameAssignment_2"
    // InternalCommunicationObject.g:3899:1: rule__Enumeration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3903:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:3904:2: ( RULE_ID )
            {
            // InternalCommunicationObject.g:3904:2: ( RULE_ID )
            // InternalCommunicationObject.g:3905:3: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_2"


    // $ANTLR start "rule__Enumeration__EnumsAssignment_4"
    // InternalCommunicationObject.g:3914:1: rule__Enumeration__EnumsAssignment_4 : ( ruleEnumerationElement ) ;
    public final void rule__Enumeration__EnumsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3918:1: ( ( ruleEnumerationElement ) )
            // InternalCommunicationObject.g:3919:2: ( ruleEnumerationElement )
            {
            // InternalCommunicationObject.g:3919:2: ( ruleEnumerationElement )
            // InternalCommunicationObject.g:3920:3: ruleEnumerationElement
            {
             before(grammarAccess.getEnumerationAccess().getEnumsEnumerationElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationElement();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getEnumsEnumerationElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__EnumsAssignment_4"


    // $ANTLR start "rule__CommElementReference__TypeNameAssignment_0"
    // InternalCommunicationObject.g:3929:1: rule__CommElementReference__TypeNameAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__CommElementReference__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3933:1: ( ( ( ruleFQN ) ) )
            // InternalCommunicationObject.g:3934:2: ( ( ruleFQN ) )
            {
            // InternalCommunicationObject.g:3934:2: ( ( ruleFQN ) )
            // InternalCommunicationObject.g:3935:3: ( ruleFQN )
            {
             before(grammarAccess.getCommElementReferenceAccess().getTypeNameAbstractCommElementCrossReference_0_0()); 
            // InternalCommunicationObject.g:3936:3: ( ruleFQN )
            // InternalCommunicationObject.g:3937:4: ruleFQN
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
    // InternalCommunicationObject.g:3948:1: rule__CommElementReference__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__CommElementReference__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3952:1: ( ( ruleArrayType ) )
            // InternalCommunicationObject.g:3953:2: ( ruleArrayType )
            {
            // InternalCommunicationObject.g:3953:2: ( ruleArrayType )
            // InternalCommunicationObject.g:3954:3: ruleArrayType
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
    // InternalCommunicationObject.g:3963:1: rule__SingleValue__ValueAssignment_0_1 : ( ( ruleFQN ) ) ;
    public final void rule__SingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3967:1: ( ( ( ruleFQN ) ) )
            // InternalCommunicationObject.g:3968:2: ( ( ruleFQN ) )
            {
            // InternalCommunicationObject.g:3968:2: ( ( ruleFQN ) )
            // InternalCommunicationObject.g:3969:3: ( ruleFQN )
            {
             before(grammarAccess.getSingleValueAccess().getValueAbstractCommElementCrossReference_0_1_0()); 
            // InternalCommunicationObject.g:3970:3: ( ruleFQN )
            // InternalCommunicationObject.g:3971:4: ruleFQN
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


    // $ANTLR start "rule__AttributeDefinition__DocumentationAssignment_0"
    // InternalCommunicationObject.g:3982:1: rule__AttributeDefinition__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__AttributeDefinition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:3986:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalCommunicationObject.g:3987:2: ( RULE_DOCU_COMMENT )
            {
            // InternalCommunicationObject.g:3987:2: ( RULE_DOCU_COMMENT )
            // InternalCommunicationObject.g:3988:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__DocumentationAssignment_0"


    // $ANTLR start "rule__AttributeDefinition__NameAssignment_1"
    // InternalCommunicationObject.g:3997:1: rule__AttributeDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4001:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:4002:2: ( RULE_ID )
            {
            // InternalCommunicationObject.g:4002:2: ( RULE_ID )
            // InternalCommunicationObject.g:4003:3: RULE_ID
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__NameAssignment_1"


    // $ANTLR start "rule__AttributeDefinition__TypeAssignment_3"
    // InternalCommunicationObject.g:4012:1: rule__AttributeDefinition__TypeAssignment_3 : ( ruleAbstractAttributeType ) ;
    public final void rule__AttributeDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4016:1: ( ( ruleAbstractAttributeType ) )
            // InternalCommunicationObject.g:4017:2: ( ruleAbstractAttributeType )
            {
            // InternalCommunicationObject.g:4017:2: ( ruleAbstractAttributeType )
            // InternalCommunicationObject.g:4018:3: ruleAbstractAttributeType
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__TypeAssignment_3"


    // $ANTLR start "rule__AttributeDefinition__DefaultvalueAssignment_4_1"
    // InternalCommunicationObject.g:4027:1: rule__AttributeDefinition__DefaultvalueAssignment_4_1 : ( ruleAbstractValue ) ;
    public final void rule__AttributeDefinition__DefaultvalueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4031:1: ( ( ruleAbstractValue ) )
            // InternalCommunicationObject.g:4032:2: ( ruleAbstractValue )
            {
            // InternalCommunicationObject.g:4032:2: ( ruleAbstractValue )
            // InternalCommunicationObject.g:4033:3: ruleAbstractValue
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractValue();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__DefaultvalueAssignment_4_1"


    // $ANTLR start "rule__EnumerationElement__NameAssignment_0"
    // InternalCommunicationObject.g:4042:1: rule__EnumerationElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4046:1: ( ( RULE_ID ) )
            // InternalCommunicationObject.g:4047:2: ( RULE_ID )
            {
            // InternalCommunicationObject.g:4047:2: ( RULE_ID )
            // InternalCommunicationObject.g:4048:3: RULE_ID
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
    // InternalCommunicationObject.g:4057:1: rule__EnumerationElement__ValueAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__EnumerationElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4061:1: ( ( ruleEInt ) )
            // InternalCommunicationObject.g:4062:2: ( ruleEInt )
            {
            // InternalCommunicationObject.g:4062:2: ( ruleEInt )
            // InternalCommunicationObject.g:4063:3: ruleEInt
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
    // InternalCommunicationObject.g:4072:1: rule__InlineEnumerationType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__InlineEnumerationType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4076:1: ( ( ruleArrayType ) )
            // InternalCommunicationObject.g:4077:2: ( ruleArrayType )
            {
            // InternalCommunicationObject.g:4077:2: ( ruleArrayType )
            // InternalCommunicationObject.g:4078:3: ruleArrayType
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
    // InternalCommunicationObject.g:4087:1: rule__InlineEnumerationType__EnumsAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__InlineEnumerationType__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4091:1: ( ( ruleEnumerationElement ) )
            // InternalCommunicationObject.g:4092:2: ( ruleEnumerationElement )
            {
            // InternalCommunicationObject.g:4092:2: ( ruleEnumerationElement )
            // InternalCommunicationObject.g:4093:3: ruleEnumerationElement
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
    // InternalCommunicationObject.g:4102:1: rule__ArrayType__LengthAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ArrayType__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4106:1: ( ( ruleCardinality ) )
            // InternalCommunicationObject.g:4107:2: ( ruleCardinality )
            {
            // InternalCommunicationObject.g:4107:2: ( ruleCardinality )
            // InternalCommunicationObject.g:4108:3: ruleCardinality
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
    // InternalCommunicationObject.g:4117:1: rule__PrimitiveType__TypeNameAssignment_0 : ( rulePRIMITIVE_TYPE_NAME ) ;
    public final void rule__PrimitiveType__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4121:1: ( ( rulePRIMITIVE_TYPE_NAME ) )
            // InternalCommunicationObject.g:4122:2: ( rulePRIMITIVE_TYPE_NAME )
            {
            // InternalCommunicationObject.g:4122:2: ( rulePRIMITIVE_TYPE_NAME )
            // InternalCommunicationObject.g:4123:3: rulePRIMITIVE_TYPE_NAME
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
    // InternalCommunicationObject.g:4132:1: rule__PrimitiveType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__PrimitiveType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4136:1: ( ( ruleArrayType ) )
            // InternalCommunicationObject.g:4137:2: ( ruleArrayType )
            {
            // InternalCommunicationObject.g:4137:2: ( ruleArrayType )
            // InternalCommunicationObject.g:4138:3: ruleArrayType
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
    // InternalCommunicationObject.g:4147:1: rule__ArrayValue__ValuesAssignment_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4151:1: ( ( ruleSingleValue ) )
            // InternalCommunicationObject.g:4152:2: ( ruleSingleValue )
            {
            // InternalCommunicationObject.g:4152:2: ( ruleSingleValue )
            // InternalCommunicationObject.g:4153:3: ruleSingleValue
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
    // InternalCommunicationObject.g:4162:1: rule__ArrayValue__ValuesAssignment_2_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4166:1: ( ( ruleSingleValue ) )
            // InternalCommunicationObject.g:4167:2: ( ruleSingleValue )
            {
            // InternalCommunicationObject.g:4167:2: ( ruleSingleValue )
            // InternalCommunicationObject.g:4168:3: ruleSingleValue
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
    // InternalCommunicationObject.g:4177:1: superSingleValue__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void superSingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4181:1: ( ( ruleEInt ) )
            // InternalCommunicationObject.g:4182:2: ( ruleEInt )
            {
            // InternalCommunicationObject.g:4182:2: ( ruleEInt )
            // InternalCommunicationObject.g:4183:3: ruleEInt
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
    // InternalCommunicationObject.g:4192:1: superSingleValue__ValueAssignment_1_1 : ( ruleEDouble ) ;
    public final void superSingleValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4196:1: ( ( ruleEDouble ) )
            // InternalCommunicationObject.g:4197:2: ( ruleEDouble )
            {
            // InternalCommunicationObject.g:4197:2: ( ruleEDouble )
            // InternalCommunicationObject.g:4198:3: ruleEDouble
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
    // InternalCommunicationObject.g:4207:1: superSingleValue__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void superSingleValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4211:1: ( ( ruleEString ) )
            // InternalCommunicationObject.g:4212:2: ( ruleEString )
            {
            // InternalCommunicationObject.g:4212:2: ( ruleEString )
            // InternalCommunicationObject.g:4213:3: ruleEString
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
    // InternalCommunicationObject.g:4222:1: superSingleValue__ValueAssignment_3_1 : ( ruleEBoolean ) ;
    public final void superSingleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4226:1: ( ( ruleEBoolean ) )
            // InternalCommunicationObject.g:4227:2: ( ruleEBoolean )
            {
            // InternalCommunicationObject.g:4227:2: ( ruleEBoolean )
            // InternalCommunicationObject.g:4228:3: ruleEBoolean
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
    // InternalCommunicationObject.g:4237:1: superSingleValue__ValueAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void superSingleValue__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCommunicationObject.g:4241:1: ( ( ( ruleFQN ) ) )
            // InternalCommunicationObject.g:4242:2: ( ( ruleFQN ) )
            {
            // InternalCommunicationObject.g:4242:2: ( ( ruleFQN ) )
            // InternalCommunicationObject.g:4243:3: ( ruleFQN )
            {
             before(grammarAccess.getBasicAttributesSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 
            // InternalCommunicationObject.g:4244:3: ( ruleFQN )
            // InternalCommunicationObject.g:4245:4: ruleFQN
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
    static final String dfa_4s = "\1\56\1\62\1\uffff\1\6\1\uffff\1\62";
    static final String dfa_5s = "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\2\2\1\1\7\uffff\2\2\27\uffff\1\2\6\uffff\1\2",
            "\2\2\31\uffff\1\2\2\uffff\1\2\2\uffff\1\3\2\uffff\1\4\6\uffff\2\2",
            "",
            "\1\5",
            "",
            "\2\2\31\uffff\1\2\2\uffff\1\2\2\uffff\1\3\2\uffff\1\4\6\uffff\2\2"
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
            return "775:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( superSingleValue ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000035000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000030000000082L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000030000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000010000000C0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000080007FF80040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000140800000C070L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000408000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000040020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000040800000C070L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000000000C000L});

}