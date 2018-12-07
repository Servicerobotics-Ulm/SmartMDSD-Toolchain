package org.xtext.component.componentDatasheet.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.component.componentDatasheet.services.ComponentDatasheetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentDatasheetParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TEXT_BLOCK", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentDatasheet'", "'{'", "'shortDescrition'", "':'", "'baseURI'", "'longDescription'", "'supplierDescription'", "'homepage'", "'trl'", "'purposeDescription'", "'hardwareRequirementDescription'", "'license'", "'}'", "'spdx'", "'('", "')'", "'proprietary'", "'name'", "'fullText'", "'URL'", "'Level1'", "'Level2'", "'Level3'", "'Level4'", "'Level5'", "'Level6'", "'Level7'", "'Level8'", "'Level9'", "'Undefined'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_TEXT_BLOCK=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalComponentDatasheetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentDatasheetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentDatasheetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentDatasheet.g"; }



     	private ComponentDatasheetGrammarAccess grammarAccess;

        public InternalComponentDatasheetParser(TokenStream input, ComponentDatasheetGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentDatasheet";
       	}

       	@Override
       	protected ComponentDatasheetGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentDatasheet"
    // InternalComponentDatasheet.g:106:1: entryRuleComponentDatasheet returns [EObject current=null] : iv_ruleComponentDatasheet= ruleComponentDatasheet EOF ;
    public final EObject entryRuleComponentDatasheet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDatasheet = null;


        try {
            // InternalComponentDatasheet.g:106:59: (iv_ruleComponentDatasheet= ruleComponentDatasheet EOF )
            // InternalComponentDatasheet.g:107:2: iv_ruleComponentDatasheet= ruleComponentDatasheet EOF
            {
             newCompositeNode(grammarAccess.getComponentDatasheetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentDatasheet=ruleComponentDatasheet();

            state._fsp--;

             current =iv_ruleComponentDatasheet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentDatasheet"


    // $ANTLR start "ruleComponentDatasheet"
    // InternalComponentDatasheet.g:113:1: ruleComponentDatasheet returns [EObject current=null] : (otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' ) ;
    public final EObject ruleComponentDatasheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_longDescription_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_shortDescrition_6_0 = null;

        AntlrDatatypeRuleToken lv_baseURI_9_0 = null;

        AntlrDatatypeRuleToken lv_supplierDescription_15_0 = null;

        AntlrDatatypeRuleToken lv_homepage_18_0 = null;

        Enumerator lv_trl_21_0 = null;

        AntlrDatatypeRuleToken lv_purposeDescription_24_0 = null;

        AntlrDatatypeRuleToken lv_hardwareRequirementDescription_27_0 = null;

        EObject lv_license_30_0 = null;



        	enterRule();

        try {
            // InternalComponentDatasheet.g:119:2: ( (otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' ) )
            // InternalComponentDatasheet.g:120:2: (otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' )
            {
            // InternalComponentDatasheet.g:120:2: (otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' )
            // InternalComponentDatasheet.g:121:3: otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) ) otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDatasheetAccess().getComponentDatasheetKeyword_0());
            		
            // InternalComponentDatasheet.g:125:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentDatasheet.g:126:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentDatasheet.g:126:4: (otherlv_1= RULE_ID )
            // InternalComponentDatasheet.g:127:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDatasheetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getComponentDatasheetAccess().getComponentComponentDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentDatasheetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentDatasheet.g:142:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) )
            // InternalComponentDatasheet.g:143:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalComponentDatasheet.g:143:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) )
            // InternalComponentDatasheet.g:144:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            				
            // InternalComponentDatasheet.g:147:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?)
            // InternalComponentDatasheet.g:148:6: ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?
            {
            // InternalComponentDatasheet.g:148:6: ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=10;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalComponentDatasheet.g:149:4: ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:149:4: ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:150:5: {...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalComponentDatasheet.g:150:115: ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:151:6: ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalComponentDatasheet.g:154:9: ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:154:10: {...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:154:19: (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:154:20: otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentDatasheetAccess().getShortDescritionKeyword_3_0_0());
            	    								
            	    // InternalComponentDatasheet.g:158:9: (otherlv_5= ':' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==15) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:159:10: otherlv_5= ':'
            	            {
            	            otherlv_5=(Token)match(input,15,FOLLOW_6); 

            	            										newLeafNode(otherlv_5, grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:164:9: ( (lv_shortDescrition_6_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:165:10: (lv_shortDescrition_6_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:165:10: (lv_shortDescrition_6_0= ruleEString )
            	    // InternalComponentDatasheet.g:166:11: lv_shortDescrition_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDatasheetAccess().getShortDescritionEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_shortDescrition_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDatasheetRule());
            	    											}
            	    											set(
            	    												current,
            	    												"shortDescrition",
            	    												lv_shortDescrition_6_0,
            	    												"org.xtext.component.componentDatasheet.ComponentDatasheet.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComponentDatasheet.g:189:4: ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:189:4: ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:190:5: {...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalComponentDatasheet.g:190:115: ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:191:6: ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalComponentDatasheet.g:194:9: ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:194:10: {...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:194:19: (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:194:20: otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_6); 

            	    									newLeafNode(otherlv_7, grammarAccess.getComponentDatasheetAccess().getBaseURIKeyword_3_1_0());
            	    								
            	    // InternalComponentDatasheet.g:198:9: (otherlv_8= ':' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==15) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:199:10: otherlv_8= ':'
            	            {
            	            otherlv_8=(Token)match(input,15,FOLLOW_6); 

            	            										newLeafNode(otherlv_8, grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_1_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:204:9: ( (lv_baseURI_9_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:205:10: (lv_baseURI_9_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:205:10: (lv_baseURI_9_0= ruleEString )
            	    // InternalComponentDatasheet.g:206:11: lv_baseURI_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDatasheetAccess().getBaseURIEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_baseURI_9_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDatasheetRule());
            	    											}
            	    											set(
            	    												current,
            	    												"baseURI",
            	    												lv_baseURI_9_0,
            	    												"org.xtext.component.componentDatasheet.ComponentDatasheet.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComponentDatasheet.g:229:4: ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:229:4: ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:230:5: {...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalComponentDatasheet.g:230:115: ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) )
            	    // InternalComponentDatasheet.g:231:6: ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalComponentDatasheet.g:234:9: ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) )
            	    // InternalComponentDatasheet.g:234:10: {...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:234:19: (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) )
            	    // InternalComponentDatasheet.g:234:20: otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getComponentDatasheetAccess().getLongDescriptionKeyword_3_2_0());
            	    								
            	    // InternalComponentDatasheet.g:238:9: (otherlv_11= ':' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==15) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:239:10: otherlv_11= ':'
            	            {
            	            otherlv_11=(Token)match(input,15,FOLLOW_9); 

            	            										newLeafNode(otherlv_11, grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_2_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:244:9: ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) )
            	    // InternalComponentDatasheet.g:245:10: (lv_longDescription_12_0= RULE_TEXT_BLOCK )
            	    {
            	    // InternalComponentDatasheet.g:245:10: (lv_longDescription_12_0= RULE_TEXT_BLOCK )
            	    // InternalComponentDatasheet.g:246:11: lv_longDescription_12_0= RULE_TEXT_BLOCK
            	    {
            	    lv_longDescription_12_0=(Token)match(input,RULE_TEXT_BLOCK,FOLLOW_7); 

            	    											newLeafNode(lv_longDescription_12_0, grammarAccess.getComponentDatasheetAccess().getLongDescriptionTEXT_BLOCKTerminalRuleCall_3_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getComponentDatasheetRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"longDescription",
            	    												lv_longDescription_12_0,
            	    												"org.xtext.component.componentDatasheet.ComponentDatasheet.TEXT_BLOCK");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComponentDatasheet.g:268:4: ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:268:4: ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:269:5: {...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalComponentDatasheet.g:269:115: ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:270:6: ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalComponentDatasheet.g:273:9: ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:273:10: {...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:273:19: (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:273:20: otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,18,FOLLOW_6); 

            	    									newLeafNode(otherlv_13, grammarAccess.getComponentDatasheetAccess().getSupplierDescriptionKeyword_3_3_0());
            	    								
            	    // InternalComponentDatasheet.g:277:9: (otherlv_14= ':' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==15) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:278:10: otherlv_14= ':'
            	            {
            	            otherlv_14=(Token)match(input,15,FOLLOW_6); 

            	            										newLeafNode(otherlv_14, grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_3_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:283:9: ( (lv_supplierDescription_15_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:284:10: (lv_supplierDescription_15_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:284:10: (lv_supplierDescription_15_0= ruleEString )
            	    // InternalComponentDatasheet.g:285:11: lv_supplierDescription_15_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDatasheetAccess().getSupplierDescriptionEStringParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_supplierDescription_15_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDatasheetRule());
            	    											}
            	    											set(
            	    												current,
            	    												"supplierDescription",
            	    												lv_supplierDescription_15_0,
            	    												"org.xtext.component.componentDatasheet.ComponentDatasheet.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalComponentDatasheet.g:308:4: ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:308:4: ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:309:5: {...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalComponentDatasheet.g:309:115: ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:310:6: ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalComponentDatasheet.g:313:9: ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:313:10: {...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:313:19: (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:313:20: otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) )
            	    {
            	    otherlv_16=(Token)match(input,19,FOLLOW_6); 

            	    									newLeafNode(otherlv_16, grammarAccess.getComponentDatasheetAccess().getHomepageKeyword_3_4_0());
            	    								
            	    // InternalComponentDatasheet.g:317:9: (otherlv_17= ':' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==15) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:318:10: otherlv_17= ':'
            	            {
            	            otherlv_17=(Token)match(input,15,FOLLOW_6); 

            	            										newLeafNode(otherlv_17, grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_4_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:323:9: ( (lv_homepage_18_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:324:10: (lv_homepage_18_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:324:10: (lv_homepage_18_0= ruleEString )
            	    // InternalComponentDatasheet.g:325:11: lv_homepage_18_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDatasheetAccess().getHomepageEStringParserRuleCall_3_4_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_homepage_18_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDatasheetRule());
            	    											}
            	    											set(
            	    												current,
            	    												"homepage",
            	    												lv_homepage_18_0,
            	    												"org.xtext.component.componentDatasheet.ComponentDatasheet.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalComponentDatasheet.g:348:4: ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:348:4: ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:349:5: {...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalComponentDatasheet.g:349:115: ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) )
            	    // InternalComponentDatasheet.g:350:6: ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalComponentDatasheet.g:353:9: ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) )
            	    // InternalComponentDatasheet.g:353:10: {...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:353:19: (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) )
            	    // InternalComponentDatasheet.g:353:20: otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) )
            	    {
            	    otherlv_19=(Token)match(input,20,FOLLOW_10); 

            	    									newLeafNode(otherlv_19, grammarAccess.getComponentDatasheetAccess().getTrlKeyword_3_5_0());
            	    								
            	    // InternalComponentDatasheet.g:357:9: (otherlv_20= ':' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==15) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:358:10: otherlv_20= ':'
            	            {
            	            otherlv_20=(Token)match(input,15,FOLLOW_10); 

            	            										newLeafNode(otherlv_20, grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_5_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:363:9: ( (lv_trl_21_0= ruleTRL ) )
            	    // InternalComponentDatasheet.g:364:10: (lv_trl_21_0= ruleTRL )
            	    {
            	    // InternalComponentDatasheet.g:364:10: (lv_trl_21_0= ruleTRL )
            	    // InternalComponentDatasheet.g:365:11: lv_trl_21_0= ruleTRL
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDatasheetAccess().getTrlTRLEnumRuleCall_3_5_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_trl_21_0=ruleTRL();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDatasheetRule());
            	    											}
            	    											set(
            	    												current,
            	    												"trl",
            	    												lv_trl_21_0,
            	    												"org.xtext.component.componentDatasheet.ComponentDatasheet.TRL");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalComponentDatasheet.g:388:4: ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:388:4: ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:389:5: {...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalComponentDatasheet.g:389:115: ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:390:6: ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalComponentDatasheet.g:393:9: ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:393:10: {...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:393:19: (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:393:20: otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) )
            	    {
            	    otherlv_22=(Token)match(input,21,FOLLOW_6); 

            	    									newLeafNode(otherlv_22, grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionKeyword_3_6_0());
            	    								
            	    // InternalComponentDatasheet.g:397:9: (otherlv_23= ':' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==15) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:398:10: otherlv_23= ':'
            	            {
            	            otherlv_23=(Token)match(input,15,FOLLOW_6); 

            	            										newLeafNode(otherlv_23, grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_6_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:403:9: ( (lv_purposeDescription_24_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:404:10: (lv_purposeDescription_24_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:404:10: (lv_purposeDescription_24_0= ruleEString )
            	    // InternalComponentDatasheet.g:405:11: lv_purposeDescription_24_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionEStringParserRuleCall_3_6_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_purposeDescription_24_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDatasheetRule());
            	    											}
            	    											set(
            	    												current,
            	    												"purposeDescription",
            	    												lv_purposeDescription_24_0,
            	    												"org.xtext.component.componentDatasheet.ComponentDatasheet.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalComponentDatasheet.g:428:4: ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:428:4: ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:429:5: {...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalComponentDatasheet.g:429:115: ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:430:6: ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalComponentDatasheet.g:433:9: ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:433:10: {...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:433:19: (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:433:20: otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) )
            	    {
            	    otherlv_25=(Token)match(input,22,FOLLOW_6); 

            	    									newLeafNode(otherlv_25, grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionKeyword_3_7_0());
            	    								
            	    // InternalComponentDatasheet.g:437:9: (otherlv_26= ':' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==15) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:438:10: otherlv_26= ':'
            	            {
            	            otherlv_26=(Token)match(input,15,FOLLOW_6); 

            	            										newLeafNode(otherlv_26, grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_7_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:443:9: ( (lv_hardwareRequirementDescription_27_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:444:10: (lv_hardwareRequirementDescription_27_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:444:10: (lv_hardwareRequirementDescription_27_0= ruleEString )
            	    // InternalComponentDatasheet.g:445:11: lv_hardwareRequirementDescription_27_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionEStringParserRuleCall_3_7_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_hardwareRequirementDescription_27_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDatasheetRule());
            	    											}
            	    											set(
            	    												current,
            	    												"hardwareRequirementDescription",
            	    												lv_hardwareRequirementDescription_27_0,
            	    												"org.xtext.component.componentDatasheet.ComponentDatasheet.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalComponentDatasheet.g:468:4: ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:468:4: ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:469:5: {...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalComponentDatasheet.g:469:115: ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) )
            	    // InternalComponentDatasheet.g:470:6: ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalComponentDatasheet.g:473:9: ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) )
            	    // InternalComponentDatasheet.g:473:10: {...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:473:19: (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) )
            	    // InternalComponentDatasheet.g:473:20: otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) )
            	    {
            	    otherlv_28=(Token)match(input,23,FOLLOW_11); 

            	    									newLeafNode(otherlv_28, grammarAccess.getComponentDatasheetAccess().getLicenseKeyword_3_8_0());
            	    								
            	    // InternalComponentDatasheet.g:477:9: (otherlv_29= ':' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==15) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:478:10: otherlv_29= ':'
            	            {
            	            otherlv_29=(Token)match(input,15,FOLLOW_11); 

            	            										newLeafNode(otherlv_29, grammarAccess.getComponentDatasheetAccess().getColonKeyword_3_8_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:483:9: ( (lv_license_30_0= ruleAbstractLicense ) )
            	    // InternalComponentDatasheet.g:484:10: (lv_license_30_0= ruleAbstractLicense )
            	    {
            	    // InternalComponentDatasheet.g:484:10: (lv_license_30_0= ruleAbstractLicense )
            	    // InternalComponentDatasheet.g:485:11: lv_license_30_0= ruleAbstractLicense
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDatasheetAccess().getLicenseAbstractLicenseParserRuleCall_3_8_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_license_30_0=ruleAbstractLicense();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDatasheetRule());
            	    											}
            	    											set(
            	    												current,
            	    												"license",
            	    												lv_license_30_0,
            	    												"org.xtext.component.componentDatasheet.ComponentDatasheet.AbstractLicense");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleComponentDatasheet", "getUnorderedGroupHelper().canLeave(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3());
            				

            }

            otherlv_31=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getComponentDatasheetAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentDatasheet"


    // $ANTLR start "entryRuleAbstractLicense"
    // InternalComponentDatasheet.g:524:1: entryRuleAbstractLicense returns [EObject current=null] : iv_ruleAbstractLicense= ruleAbstractLicense EOF ;
    public final EObject entryRuleAbstractLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractLicense = null;


        try {
            // InternalComponentDatasheet.g:524:56: (iv_ruleAbstractLicense= ruleAbstractLicense EOF )
            // InternalComponentDatasheet.g:525:2: iv_ruleAbstractLicense= ruleAbstractLicense EOF
            {
             newCompositeNode(grammarAccess.getAbstractLicenseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractLicense=ruleAbstractLicense();

            state._fsp--;

             current =iv_ruleAbstractLicense; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractLicense"


    // $ANTLR start "ruleAbstractLicense"
    // InternalComponentDatasheet.g:531:1: ruleAbstractLicense returns [EObject current=null] : (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense ) ;
    public final EObject ruleAbstractLicense() throws RecognitionException {
        EObject current = null;

        EObject this_SpdxLicense_0 = null;

        EObject this_ProprietaryLicense_1 = null;



        	enterRule();

        try {
            // InternalComponentDatasheet.g:537:2: ( (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense ) )
            // InternalComponentDatasheet.g:538:2: (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense )
            {
            // InternalComponentDatasheet.g:538:2: (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentDatasheet.g:539:3: this_SpdxLicense_0= ruleSpdxLicense
                    {

                    			newCompositeNode(grammarAccess.getAbstractLicenseAccess().getSpdxLicenseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpdxLicense_0=ruleSpdxLicense();

                    state._fsp--;


                    			current = this_SpdxLicense_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentDatasheet.g:548:3: this_ProprietaryLicense_1= ruleProprietaryLicense
                    {

                    			newCompositeNode(grammarAccess.getAbstractLicenseAccess().getProprietaryLicenseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProprietaryLicense_1=ruleProprietaryLicense();

                    state._fsp--;


                    			current = this_ProprietaryLicense_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractLicense"


    // $ANTLR start "entryRuleEString"
    // InternalComponentDatasheet.g:560:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentDatasheet.g:560:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentDatasheet.g:561:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalComponentDatasheet.g:567:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalComponentDatasheet.g:573:2: (this_STRING_0= RULE_STRING )
            // InternalComponentDatasheet.g:574:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSpdxLicense"
    // InternalComponentDatasheet.g:584:1: entryRuleSpdxLicense returns [EObject current=null] : iv_ruleSpdxLicense= ruleSpdxLicense EOF ;
    public final EObject entryRuleSpdxLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpdxLicense = null;


        try {
            // InternalComponentDatasheet.g:584:52: (iv_ruleSpdxLicense= ruleSpdxLicense EOF )
            // InternalComponentDatasheet.g:585:2: iv_ruleSpdxLicense= ruleSpdxLicense EOF
            {
             newCompositeNode(grammarAccess.getSpdxLicenseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpdxLicense=ruleSpdxLicense();

            state._fsp--;

             current =iv_ruleSpdxLicense; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpdxLicense"


    // $ANTLR start "ruleSpdxLicense"
    // InternalComponentDatasheet.g:591:1: ruleSpdxLicense returns [EObject current=null] : (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' ) ;
    public final EObject ruleSpdxLicense() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_licenseID_2_0 = null;



        	enterRule();

        try {
            // InternalComponentDatasheet.g:597:2: ( (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' ) )
            // InternalComponentDatasheet.g:598:2: (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' )
            {
            // InternalComponentDatasheet.g:598:2: (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' )
            // InternalComponentDatasheet.g:599:3: otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSpdxLicenseAccess().getSpdxKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSpdxLicenseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponentDatasheet.g:607:3: ( (lv_licenseID_2_0= ruleEString ) )
            // InternalComponentDatasheet.g:608:4: (lv_licenseID_2_0= ruleEString )
            {
            // InternalComponentDatasheet.g:608:4: (lv_licenseID_2_0= ruleEString )
            // InternalComponentDatasheet.g:609:5: lv_licenseID_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSpdxLicenseAccess().getLicenseIDEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_licenseID_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpdxLicenseRule());
            					}
            					set(
            						current,
            						"licenseID",
            						lv_licenseID_2_0,
            						"org.xtext.component.componentDatasheet.ComponentDatasheet.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSpdxLicenseAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpdxLicense"


    // $ANTLR start "entryRuleProprietaryLicense"
    // InternalComponentDatasheet.g:634:1: entryRuleProprietaryLicense returns [EObject current=null] : iv_ruleProprietaryLicense= ruleProprietaryLicense EOF ;
    public final EObject entryRuleProprietaryLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProprietaryLicense = null;


        try {
            // InternalComponentDatasheet.g:634:59: (iv_ruleProprietaryLicense= ruleProprietaryLicense EOF )
            // InternalComponentDatasheet.g:635:2: iv_ruleProprietaryLicense= ruleProprietaryLicense EOF
            {
             newCompositeNode(grammarAccess.getProprietaryLicenseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProprietaryLicense=ruleProprietaryLicense();

            state._fsp--;

             current =iv_ruleProprietaryLicense; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProprietaryLicense"


    // $ANTLR start "ruleProprietaryLicense"
    // InternalComponentDatasheet.g:641:1: ruleProprietaryLicense returns [EObject current=null] : ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) ;
    public final EObject ruleProprietaryLicense() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_fullText_9_0 = null;

        AntlrDatatypeRuleToken lv_url_12_0 = null;



        	enterRule();

        try {
            // InternalComponentDatasheet.g:647:2: ( ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) )
            // InternalComponentDatasheet.g:648:2: ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            {
            // InternalComponentDatasheet.g:648:2: ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            // InternalComponentDatasheet.g:649:3: () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}'
            {
            // InternalComponentDatasheet.g:649:3: ()
            // InternalComponentDatasheet.g:650:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProprietaryLicenseAccess().getProprietaryLicenseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProprietaryLicenseAccess().getProprietaryKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getProprietaryLicenseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentDatasheet.g:664:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalComponentDatasheet.g:665:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalComponentDatasheet.g:665:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            // InternalComponentDatasheet.g:666:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
            				
            // InternalComponentDatasheet.g:669:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            // InternalComponentDatasheet.g:670:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // InternalComponentDatasheet.g:670:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=4;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                    alt15=3;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalComponentDatasheet.g:671:4: ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:671:4: ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:672:5: {...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalComponentDatasheet.g:672:115: ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:673:6: ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalComponentDatasheet.g:676:9: ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:676:10: {...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "true");
            	    }
            	    // InternalComponentDatasheet.g:676:19: (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:676:20: otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getProprietaryLicenseAccess().getNameKeyword_3_0_0());
            	    								
            	    // InternalComponentDatasheet.g:680:9: (otherlv_5= ':' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==15) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:681:10: otherlv_5= ':'
            	            {
            	            otherlv_5=(Token)match(input,15,FOLLOW_6); 

            	            										newLeafNode(otherlv_5, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:686:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:687:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:687:10: (lv_name_6_0= ruleEString )
            	    // InternalComponentDatasheet.g:688:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getProprietaryLicenseAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_15);
            	    lv_name_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getProprietaryLicenseRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_6_0,
            	    												"org.xtext.component.componentDatasheet.ComponentDatasheet.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComponentDatasheet.g:711:4: ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:711:4: ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:712:5: {...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalComponentDatasheet.g:712:115: ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:713:6: ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalComponentDatasheet.g:716:9: ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:716:10: {...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "true");
            	    }
            	    // InternalComponentDatasheet.g:716:19: (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:716:20: otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,30,FOLLOW_6); 

            	    									newLeafNode(otherlv_7, grammarAccess.getProprietaryLicenseAccess().getFullTextKeyword_3_1_0());
            	    								
            	    // InternalComponentDatasheet.g:720:9: (otherlv_8= ':' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==15) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:721:10: otherlv_8= ':'
            	            {
            	            otherlv_8=(Token)match(input,15,FOLLOW_6); 

            	            										newLeafNode(otherlv_8, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:726:9: ( (lv_fullText_9_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:727:10: (lv_fullText_9_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:727:10: (lv_fullText_9_0= ruleEString )
            	    // InternalComponentDatasheet.g:728:11: lv_fullText_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getProprietaryLicenseAccess().getFullTextEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_15);
            	    lv_fullText_9_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getProprietaryLicenseRule());
            	    											}
            	    											set(
            	    												current,
            	    												"fullText",
            	    												lv_fullText_9_0,
            	    												"org.xtext.component.componentDatasheet.ComponentDatasheet.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComponentDatasheet.g:751:4: ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:751:4: ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:752:5: {...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalComponentDatasheet.g:752:115: ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:753:6: ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalComponentDatasheet.g:756:9: ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:756:10: {...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "true");
            	    }
            	    // InternalComponentDatasheet.g:756:19: (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:756:20: otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,31,FOLLOW_6); 

            	    									newLeafNode(otherlv_10, grammarAccess.getProprietaryLicenseAccess().getURLKeyword_3_2_0());
            	    								
            	    // InternalComponentDatasheet.g:760:9: (otherlv_11= ':' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==15) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:761:10: otherlv_11= ':'
            	            {
            	            otherlv_11=(Token)match(input,15,FOLLOW_6); 

            	            										newLeafNode(otherlv_11, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:766:9: ( (lv_url_12_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:767:10: (lv_url_12_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:767:10: (lv_url_12_0= ruleEString )
            	    // InternalComponentDatasheet.g:768:11: lv_url_12_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getProprietaryLicenseAccess().getUrlEStringParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_15);
            	    lv_url_12_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getProprietaryLicenseRule());
            	    											}
            	    											set(
            	    												current,
            	    												"url",
            	    												lv_url_12_0,
            	    												"org.xtext.component.componentDatasheet.ComponentDatasheet.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canLeave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
            				

            }

            otherlv_13=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getProprietaryLicenseAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProprietaryLicense"


    // $ANTLR start "ruleTRL"
    // InternalComponentDatasheet.g:807:1: ruleTRL returns [Enumerator current=null] : ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) ) ;
    public final Enumerator ruleTRL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalComponentDatasheet.g:813:2: ( ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) ) )
            // InternalComponentDatasheet.g:814:2: ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) )
            {
            // InternalComponentDatasheet.g:814:2: ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) )
            int alt16=10;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            case 35:
                {
                alt16=4;
                }
                break;
            case 36:
                {
                alt16=5;
                }
                break;
            case 37:
                {
                alt16=6;
                }
                break;
            case 38:
                {
                alt16=7;
                }
                break;
            case 39:
                {
                alt16=8;
                }
                break;
            case 40:
                {
                alt16=9;
                }
                break;
            case 41:
                {
                alt16=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalComponentDatasheet.g:815:3: (enumLiteral_0= 'Level1' )
                    {
                    // InternalComponentDatasheet.g:815:3: (enumLiteral_0= 'Level1' )
                    // InternalComponentDatasheet.g:816:4: enumLiteral_0= 'Level1'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDatasheet.g:823:3: (enumLiteral_1= 'Level2' )
                    {
                    // InternalComponentDatasheet.g:823:3: (enumLiteral_1= 'Level2' )
                    // InternalComponentDatasheet.g:824:4: enumLiteral_1= 'Level2'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDatasheet.g:831:3: (enumLiteral_2= 'Level3' )
                    {
                    // InternalComponentDatasheet.g:831:3: (enumLiteral_2= 'Level3' )
                    // InternalComponentDatasheet.g:832:4: enumLiteral_2= 'Level3'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDatasheet.g:839:3: (enumLiteral_3= 'Level4' )
                    {
                    // InternalComponentDatasheet.g:839:3: (enumLiteral_3= 'Level4' )
                    // InternalComponentDatasheet.g:840:4: enumLiteral_3= 'Level4'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalComponentDatasheet.g:847:3: (enumLiteral_4= 'Level5' )
                    {
                    // InternalComponentDatasheet.g:847:3: (enumLiteral_4= 'Level5' )
                    // InternalComponentDatasheet.g:848:4: enumLiteral_4= 'Level5'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalComponentDatasheet.g:855:3: (enumLiteral_5= 'Level6' )
                    {
                    // InternalComponentDatasheet.g:855:3: (enumLiteral_5= 'Level6' )
                    // InternalComponentDatasheet.g:856:4: enumLiteral_5= 'Level6'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalComponentDatasheet.g:863:3: (enumLiteral_6= 'Level7' )
                    {
                    // InternalComponentDatasheet.g:863:3: (enumLiteral_6= 'Level7' )
                    // InternalComponentDatasheet.g:864:4: enumLiteral_6= 'Level7'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalComponentDatasheet.g:871:3: (enumLiteral_7= 'Level8' )
                    {
                    // InternalComponentDatasheet.g:871:3: (enumLiteral_7= 'Level8' )
                    // InternalComponentDatasheet.g:872:4: enumLiteral_7= 'Level8'
                    {
                    enumLiteral_7=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalComponentDatasheet.g:879:3: (enumLiteral_8= 'Level9' )
                    {
                    // InternalComponentDatasheet.g:879:3: (enumLiteral_8= 'Level9' )
                    // InternalComponentDatasheet.g:880:4: enumLiteral_8= 'Level9'
                    {
                    enumLiteral_8=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalComponentDatasheet.g:887:3: (enumLiteral_9= 'Undefined' )
                    {
                    // InternalComponentDatasheet.g:887:3: (enumLiteral_9= 'Undefined' )
                    // InternalComponentDatasheet.g:888:4: enumLiteral_9= 'Undefined'
                    {
                    enumLiteral_9=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getUNDEFINEDEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getTRLAccess().getUNDEFINEDEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTRL"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\16\12\uffff";
    static final String dfa_3s = "\1\30\12\uffff";
    static final String dfa_4s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_5s = "\1\0\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 148:6: ( ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baseURI' (otherlv_8= ':' )? ( (lv_baseURI_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'longDescription' (otherlv_11= ':' )? ( (lv_longDescription_12_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'supplierDescription' (otherlv_14= ':' )? ( (lv_supplierDescription_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'homepage' (otherlv_17= ':' )? ( (lv_homepage_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'trl' (otherlv_20= ':' )? ( (lv_trl_21_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'purposeDescription' (otherlv_23= ':' )? ( (lv_purposeDescription_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'hardwareRequirementDescription' (otherlv_26= ':' )? ( (lv_hardwareRequirementDescription_27_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'license' (otherlv_29= ':' )? ( (lv_license_30_0= ruleAbstractLicense ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                         
                        int index10_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_0==24) ) {s = 1;}

                        else if ( LA10_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA10_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA10_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA10_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA10_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA10_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA10_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA10_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA10_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                         
                        input.seek(index10_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000FF4000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001FF4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000003FF00008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000012008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000E1000000L});

}
