package org.xtext.base.genericDatasheet.parser.antlr.internal;

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
import org.xtext.base.genericDatasheet.services.GenericDatasheetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenericDatasheetParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TEXT_BLOCK", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'baseURI'", "':'", "'shortDescription'", "'longDescription'", "'supplierDescription'", "'homepage'", "'trl'", "'license'", "'spdx'", "'('", "')'", "'proprietary'", "'{'", "'name'", "'fullText'", "'URL'", "'}'", "'Level1'", "'Level2'", "'Level3'", "'Level4'", "'Level5'", "'Level6'", "'Level7'", "'Level8'", "'Level9'", "'Undefined'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_TEXT_BLOCK=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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
    public static final int RULE_ID=6;
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGenericDatasheetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGenericDatasheetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGenericDatasheetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGenericDatasheet.g"; }



     	private GenericDatasheetGrammarAccess grammarAccess;

        public InternalGenericDatasheetParser(TokenStream input, GenericDatasheetGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GenericDatasheet";
       	}

       	@Override
       	protected GenericDatasheetGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "ruleGenericDatasheet"
    // InternalGenericDatasheet.g:107:1: ruleGenericDatasheet[EObject in_current] returns [EObject current=in_current] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGenericDatasheet(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_longDescription_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_baseURI_3_0 = null;

        AntlrDatatypeRuleToken lv_shortDescription_6_0 = null;

        AntlrDatatypeRuleToken lv_supplierDescription_12_0 = null;

        AntlrDatatypeRuleToken lv_homepage_15_0 = null;

        Enumerator lv_trl_18_0 = null;

        EObject lv_license_21_0 = null;



        	enterRule();

        try {
            // InternalGenericDatasheet.g:113:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalGenericDatasheet.g:114:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalGenericDatasheet.g:114:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) )
            // InternalGenericDatasheet.g:115:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalGenericDatasheet.g:115:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) )
            // InternalGenericDatasheet.g:116:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            			
            // InternalGenericDatasheet.g:119:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?)
            // InternalGenericDatasheet.g:120:5: ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?
            {
            // InternalGenericDatasheet.g:120:5: ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=8;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                    alt8=2;
                }
                else if ( LA8_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                    alt8=3;
                }
                else if ( LA8_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                    alt8=4;
                }
                else if ( LA8_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                    alt8=5;
                }
                else if ( LA8_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                    alt8=6;
                }
                else if ( LA8_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                    alt8=7;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGenericDatasheet.g:121:3: ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:121:3: ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) )
            	    // InternalGenericDatasheet.g:122:4: {...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalGenericDatasheet.g:122:110: ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) )
            	    // InternalGenericDatasheet.g:123:5: ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalGenericDatasheet.g:126:8: ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) )
            	    // InternalGenericDatasheet.g:126:9: {...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalGenericDatasheet.g:126:18: (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) )
            	    // InternalGenericDatasheet.g:126:19: otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_1); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGenericDatasheetAccess().getBaseURIKeyword_0_0());
            	    							
            	    // InternalGenericDatasheet.g:130:8: (otherlv_2= ':' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalGenericDatasheet.g:131:9: otherlv_2= ':'
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_1); 

            	            									newLeafNode(otherlv_2, grammarAccess.getGenericDatasheetAccess().getColonKeyword_0_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalGenericDatasheet.g:136:8: ( (lv_baseURI_3_0= ruleEString ) )
            	    // InternalGenericDatasheet.g:137:9: (lv_baseURI_3_0= ruleEString )
            	    {
            	    // InternalGenericDatasheet.g:137:9: (lv_baseURI_3_0= ruleEString )
            	    // InternalGenericDatasheet.g:138:10: lv_baseURI_3_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getBaseURIEStringParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_2);
            	    lv_baseURI_3_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
            	    										}
            	    										set(
            	    											current,
            	    											"baseURI",
            	    											lv_baseURI_3_0,
            	    											"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGenericDatasheet.g:161:3: ({...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:161:3: ({...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) ) )
            	    // InternalGenericDatasheet.g:162:4: {...}? => ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalGenericDatasheet.g:162:110: ( ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) ) )
            	    // InternalGenericDatasheet.g:163:5: ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalGenericDatasheet.g:166:8: ({...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) ) )
            	    // InternalGenericDatasheet.g:166:9: {...}? => (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalGenericDatasheet.g:166:18: (otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) ) )
            	    // InternalGenericDatasheet.g:166:19: otherlv_4= 'shortDescription' (otherlv_5= ':' )? ( (lv_shortDescription_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_1); 

            	    								newLeafNode(otherlv_4, grammarAccess.getGenericDatasheetAccess().getShortDescriptionKeyword_1_0());
            	    							
            	    // InternalGenericDatasheet.g:170:8: (otherlv_5= ':' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalGenericDatasheet.g:171:9: otherlv_5= ':'
            	            {
            	            otherlv_5=(Token)match(input,13,FOLLOW_1); 

            	            									newLeafNode(otherlv_5, grammarAccess.getGenericDatasheetAccess().getColonKeyword_1_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalGenericDatasheet.g:176:8: ( (lv_shortDescription_6_0= ruleEString ) )
            	    // InternalGenericDatasheet.g:177:9: (lv_shortDescription_6_0= ruleEString )
            	    {
            	    // InternalGenericDatasheet.g:177:9: (lv_shortDescription_6_0= ruleEString )
            	    // InternalGenericDatasheet.g:178:10: lv_shortDescription_6_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getShortDescriptionEStringParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_2);
            	    lv_shortDescription_6_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
            	    										}
            	    										set(
            	    											current,
            	    											"shortDescription",
            	    											lv_shortDescription_6_0,
            	    											"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGenericDatasheet.g:201:3: ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:201:3: ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) )
            	    // InternalGenericDatasheet.g:202:4: {...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalGenericDatasheet.g:202:110: ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) )
            	    // InternalGenericDatasheet.g:203:5: ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalGenericDatasheet.g:206:8: ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) )
            	    // InternalGenericDatasheet.g:206:9: {...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalGenericDatasheet.g:206:18: (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) )
            	    // InternalGenericDatasheet.g:206:19: otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

            	    								newLeafNode(otherlv_7, grammarAccess.getGenericDatasheetAccess().getLongDescriptionKeyword_2_0());
            	    							
            	    // InternalGenericDatasheet.g:210:8: (otherlv_8= ':' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==13) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalGenericDatasheet.g:211:9: otherlv_8= ':'
            	            {
            	            otherlv_8=(Token)match(input,13,FOLLOW_4); 

            	            									newLeafNode(otherlv_8, grammarAccess.getGenericDatasheetAccess().getColonKeyword_2_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalGenericDatasheet.g:216:8: ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) )
            	    // InternalGenericDatasheet.g:217:9: (lv_longDescription_9_0= RULE_TEXT_BLOCK )
            	    {
            	    // InternalGenericDatasheet.g:217:9: (lv_longDescription_9_0= RULE_TEXT_BLOCK )
            	    // InternalGenericDatasheet.g:218:10: lv_longDescription_9_0= RULE_TEXT_BLOCK
            	    {
            	    lv_longDescription_9_0=(Token)match(input,RULE_TEXT_BLOCK,FOLLOW_2); 

            	    										newLeafNode(lv_longDescription_9_0, grammarAccess.getGenericDatasheetAccess().getLongDescriptionTEXT_BLOCKTerminalRuleCall_2_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGenericDatasheetRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"longDescription",
            	    											lv_longDescription_9_0,
            	    											"org.xtext.base.genericDatasheet.GenericDatasheet.TEXT_BLOCK");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalGenericDatasheet.g:240:3: ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:240:3: ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) )
            	    // InternalGenericDatasheet.g:241:4: {...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalGenericDatasheet.g:241:110: ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) )
            	    // InternalGenericDatasheet.g:242:5: ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalGenericDatasheet.g:245:8: ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) )
            	    // InternalGenericDatasheet.g:245:9: {...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalGenericDatasheet.g:245:18: (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) )
            	    // InternalGenericDatasheet.g:245:19: otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_1); 

            	    								newLeafNode(otherlv_10, grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionKeyword_3_0());
            	    							
            	    // InternalGenericDatasheet.g:249:8: (otherlv_11= ':' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==13) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalGenericDatasheet.g:250:9: otherlv_11= ':'
            	            {
            	            otherlv_11=(Token)match(input,13,FOLLOW_1); 

            	            									newLeafNode(otherlv_11, grammarAccess.getGenericDatasheetAccess().getColonKeyword_3_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalGenericDatasheet.g:255:8: ( (lv_supplierDescription_12_0= ruleEString ) )
            	    // InternalGenericDatasheet.g:256:9: (lv_supplierDescription_12_0= ruleEString )
            	    {
            	    // InternalGenericDatasheet.g:256:9: (lv_supplierDescription_12_0= ruleEString )
            	    // InternalGenericDatasheet.g:257:10: lv_supplierDescription_12_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionEStringParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_2);
            	    lv_supplierDescription_12_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
            	    										}
            	    										set(
            	    											current,
            	    											"supplierDescription",
            	    											lv_supplierDescription_12_0,
            	    											"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalGenericDatasheet.g:280:3: ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:280:3: ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) )
            	    // InternalGenericDatasheet.g:281:4: {...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalGenericDatasheet.g:281:110: ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) )
            	    // InternalGenericDatasheet.g:282:5: ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalGenericDatasheet.g:285:8: ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) )
            	    // InternalGenericDatasheet.g:285:9: {...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalGenericDatasheet.g:285:18: (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) )
            	    // InternalGenericDatasheet.g:285:19: otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,17,FOLLOW_1); 

            	    								newLeafNode(otherlv_13, grammarAccess.getGenericDatasheetAccess().getHomepageKeyword_4_0());
            	    							
            	    // InternalGenericDatasheet.g:289:8: (otherlv_14= ':' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==13) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalGenericDatasheet.g:290:9: otherlv_14= ':'
            	            {
            	            otherlv_14=(Token)match(input,13,FOLLOW_1); 

            	            									newLeafNode(otherlv_14, grammarAccess.getGenericDatasheetAccess().getColonKeyword_4_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalGenericDatasheet.g:295:8: ( (lv_homepage_15_0= ruleEString ) )
            	    // InternalGenericDatasheet.g:296:9: (lv_homepage_15_0= ruleEString )
            	    {
            	    // InternalGenericDatasheet.g:296:9: (lv_homepage_15_0= ruleEString )
            	    // InternalGenericDatasheet.g:297:10: lv_homepage_15_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getHomepageEStringParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_2);
            	    lv_homepage_15_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
            	    										}
            	    										set(
            	    											current,
            	    											"homepage",
            	    											lv_homepage_15_0,
            	    											"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalGenericDatasheet.g:320:3: ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:320:3: ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) )
            	    // InternalGenericDatasheet.g:321:4: {...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalGenericDatasheet.g:321:110: ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) )
            	    // InternalGenericDatasheet.g:322:5: ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalGenericDatasheet.g:325:8: ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) )
            	    // InternalGenericDatasheet.g:325:9: {...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalGenericDatasheet.g:325:18: (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) )
            	    // InternalGenericDatasheet.g:325:19: otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) )
            	    {
            	    otherlv_16=(Token)match(input,18,FOLLOW_5); 

            	    								newLeafNode(otherlv_16, grammarAccess.getGenericDatasheetAccess().getTrlKeyword_5_0());
            	    							
            	    // InternalGenericDatasheet.g:329:8: (otherlv_17= ':' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==13) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalGenericDatasheet.g:330:9: otherlv_17= ':'
            	            {
            	            otherlv_17=(Token)match(input,13,FOLLOW_5); 

            	            									newLeafNode(otherlv_17, grammarAccess.getGenericDatasheetAccess().getColonKeyword_5_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalGenericDatasheet.g:335:8: ( (lv_trl_18_0= ruleTRL ) )
            	    // InternalGenericDatasheet.g:336:9: (lv_trl_18_0= ruleTRL )
            	    {
            	    // InternalGenericDatasheet.g:336:9: (lv_trl_18_0= ruleTRL )
            	    // InternalGenericDatasheet.g:337:10: lv_trl_18_0= ruleTRL
            	    {

            	    										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getTrlTRLEnumRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_2);
            	    lv_trl_18_0=ruleTRL();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
            	    										}
            	    										set(
            	    											current,
            	    											"trl",
            	    											lv_trl_18_0,
            	    											"org.xtext.base.genericDatasheet.GenericDatasheet.TRL");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalGenericDatasheet.g:360:3: ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:360:3: ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) )
            	    // InternalGenericDatasheet.g:361:4: {...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalGenericDatasheet.g:361:110: ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) )
            	    // InternalGenericDatasheet.g:362:5: ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalGenericDatasheet.g:365:8: ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) )
            	    // InternalGenericDatasheet.g:365:9: {...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalGenericDatasheet.g:365:18: (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) )
            	    // InternalGenericDatasheet.g:365:19: otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) )
            	    {
            	    otherlv_19=(Token)match(input,19,FOLLOW_6); 

            	    								newLeafNode(otherlv_19, grammarAccess.getGenericDatasheetAccess().getLicenseKeyword_6_0());
            	    							
            	    // InternalGenericDatasheet.g:369:8: (otherlv_20= ':' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==13) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalGenericDatasheet.g:370:9: otherlv_20= ':'
            	            {
            	            otherlv_20=(Token)match(input,13,FOLLOW_6); 

            	            									newLeafNode(otherlv_20, grammarAccess.getGenericDatasheetAccess().getColonKeyword_6_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalGenericDatasheet.g:375:8: ( (lv_license_21_0= ruleAbstractLicense ) )
            	    // InternalGenericDatasheet.g:376:9: (lv_license_21_0= ruleAbstractLicense )
            	    {
            	    // InternalGenericDatasheet.g:376:9: (lv_license_21_0= ruleAbstractLicense )
            	    // InternalGenericDatasheet.g:377:10: lv_license_21_0= ruleAbstractLicense
            	    {

            	    										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getLicenseAbstractLicenseParserRuleCall_6_2_0());
            	    									
            	    pushFollow(FOLLOW_2);
            	    lv_license_21_0=ruleAbstractLicense();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
            	    										}
            	    										set(
            	    											current,
            	    											"license",
            	    											lv_license_21_0,
            	    											"org.xtext.base.genericDatasheet.GenericDatasheet.AbstractLicense");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canLeave(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleGenericDatasheet"


    // $ANTLR start "entryRuleAbstractLicense"
    // InternalGenericDatasheet.g:411:1: entryRuleAbstractLicense returns [EObject current=null] : iv_ruleAbstractLicense= ruleAbstractLicense EOF ;
    public final EObject entryRuleAbstractLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractLicense = null;


        try {
            // InternalGenericDatasheet.g:411:56: (iv_ruleAbstractLicense= ruleAbstractLicense EOF )
            // InternalGenericDatasheet.g:412:2: iv_ruleAbstractLicense= ruleAbstractLicense EOF
            {
             newCompositeNode(grammarAccess.getAbstractLicenseRule()); 
            pushFollow(FOLLOW_7);
            iv_ruleAbstractLicense=ruleAbstractLicense();

            state._fsp--;

             current =iv_ruleAbstractLicense; 
            match(input,EOF,FOLLOW_8); 

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
    // InternalGenericDatasheet.g:418:1: ruleAbstractLicense returns [EObject current=null] : (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense ) ;
    public final EObject ruleAbstractLicense() throws RecognitionException {
        EObject current = null;

        EObject this_SpdxLicense_0 = null;

        EObject this_ProprietaryLicense_1 = null;



        	enterRule();

        try {
            // InternalGenericDatasheet.g:424:2: ( (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense ) )
            // InternalGenericDatasheet.g:425:2: (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense )
            {
            // InternalGenericDatasheet.g:425:2: (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGenericDatasheet.g:426:3: this_SpdxLicense_0= ruleSpdxLicense
                    {

                    			newCompositeNode(grammarAccess.getAbstractLicenseAccess().getSpdxLicenseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_8);
                    this_SpdxLicense_0=ruleSpdxLicense();

                    state._fsp--;


                    			current = this_SpdxLicense_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGenericDatasheet.g:435:3: this_ProprietaryLicense_1= ruleProprietaryLicense
                    {

                    			newCompositeNode(grammarAccess.getAbstractLicenseAccess().getProprietaryLicenseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_8);
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
    // InternalGenericDatasheet.g:447:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGenericDatasheet.g:447:47: (iv_ruleEString= ruleEString EOF )
            // InternalGenericDatasheet.g:448:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_7);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_8); 

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
    // InternalGenericDatasheet.g:454:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalGenericDatasheet.g:460:2: (this_STRING_0= RULE_STRING )
            // InternalGenericDatasheet.g:461:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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
    // InternalGenericDatasheet.g:471:1: entryRuleSpdxLicense returns [EObject current=null] : iv_ruleSpdxLicense= ruleSpdxLicense EOF ;
    public final EObject entryRuleSpdxLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpdxLicense = null;


        try {
            // InternalGenericDatasheet.g:471:52: (iv_ruleSpdxLicense= ruleSpdxLicense EOF )
            // InternalGenericDatasheet.g:472:2: iv_ruleSpdxLicense= ruleSpdxLicense EOF
            {
             newCompositeNode(grammarAccess.getSpdxLicenseRule()); 
            pushFollow(FOLLOW_7);
            iv_ruleSpdxLicense=ruleSpdxLicense();

            state._fsp--;

             current =iv_ruleSpdxLicense; 
            match(input,EOF,FOLLOW_8); 

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
    // InternalGenericDatasheet.g:478:1: ruleSpdxLicense returns [EObject current=null] : (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' ) ;
    public final EObject ruleSpdxLicense() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_licenseID_2_0 = null;



        	enterRule();

        try {
            // InternalGenericDatasheet.g:484:2: ( (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' ) )
            // InternalGenericDatasheet.g:485:2: (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' )
            {
            // InternalGenericDatasheet.g:485:2: (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' )
            // InternalGenericDatasheet.g:486:3: otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSpdxLicenseAccess().getSpdxKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_1); 

            			newLeafNode(otherlv_1, grammarAccess.getSpdxLicenseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGenericDatasheet.g:494:3: ( (lv_licenseID_2_0= ruleEString ) )
            // InternalGenericDatasheet.g:495:4: (lv_licenseID_2_0= ruleEString )
            {
            // InternalGenericDatasheet.g:495:4: (lv_licenseID_2_0= ruleEString )
            // InternalGenericDatasheet.g:496:5: lv_licenseID_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSpdxLicenseAccess().getLicenseIDEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_licenseID_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpdxLicenseRule());
            					}
            					set(
            						current,
            						"licenseID",
            						lv_licenseID_2_0,
            						"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_8); 

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
    // InternalGenericDatasheet.g:521:1: entryRuleProprietaryLicense returns [EObject current=null] : iv_ruleProprietaryLicense= ruleProprietaryLicense EOF ;
    public final EObject entryRuleProprietaryLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProprietaryLicense = null;


        try {
            // InternalGenericDatasheet.g:521:59: (iv_ruleProprietaryLicense= ruleProprietaryLicense EOF )
            // InternalGenericDatasheet.g:522:2: iv_ruleProprietaryLicense= ruleProprietaryLicense EOF
            {
             newCompositeNode(grammarAccess.getProprietaryLicenseRule()); 
            pushFollow(FOLLOW_7);
            iv_ruleProprietaryLicense=ruleProprietaryLicense();

            state._fsp--;

             current =iv_ruleProprietaryLicense; 
            match(input,EOF,FOLLOW_8); 

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
    // InternalGenericDatasheet.g:528:1: ruleProprietaryLicense returns [EObject current=null] : ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) ;
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
            // InternalGenericDatasheet.g:534:2: ( ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) )
            // InternalGenericDatasheet.g:535:2: ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            {
            // InternalGenericDatasheet.g:535:2: ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            // InternalGenericDatasheet.g:536:3: () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}'
            {
            // InternalGenericDatasheet.g:536:3: ()
            // InternalGenericDatasheet.g:537:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProprietaryLicenseAccess().getProprietaryLicenseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getProprietaryLicenseAccess().getProprietaryKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getProprietaryLicenseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGenericDatasheet.g:551:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalGenericDatasheet.g:552:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalGenericDatasheet.g:552:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            // InternalGenericDatasheet.g:553:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
            				
            // InternalGenericDatasheet.g:556:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            // InternalGenericDatasheet.g:557:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // InternalGenericDatasheet.g:557:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( LA13_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGenericDatasheet.g:558:4: ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:558:4: ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalGenericDatasheet.g:559:5: {...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalGenericDatasheet.g:559:115: ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalGenericDatasheet.g:560:6: ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalGenericDatasheet.g:563:9: ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalGenericDatasheet.g:563:10: {...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "true");
            	    }
            	    // InternalGenericDatasheet.g:563:19: (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalGenericDatasheet.g:563:20: otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_1); 

            	    									newLeafNode(otherlv_4, grammarAccess.getProprietaryLicenseAccess().getNameKeyword_3_0_0());
            	    								
            	    // InternalGenericDatasheet.g:567:9: (otherlv_5= ':' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==13) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalGenericDatasheet.g:568:10: otherlv_5= ':'
            	            {
            	            otherlv_5=(Token)match(input,13,FOLLOW_1); 

            	            										newLeafNode(otherlv_5, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalGenericDatasheet.g:573:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalGenericDatasheet.g:574:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalGenericDatasheet.g:574:10: (lv_name_6_0= ruleEString )
            	    // InternalGenericDatasheet.g:575:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getProprietaryLicenseAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_name_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getProprietaryLicenseRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_6_0,
            	    												"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
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
            	    // InternalGenericDatasheet.g:598:4: ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:598:4: ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) )
            	    // InternalGenericDatasheet.g:599:5: {...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalGenericDatasheet.g:599:115: ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) )
            	    // InternalGenericDatasheet.g:600:6: ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalGenericDatasheet.g:603:9: ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) )
            	    // InternalGenericDatasheet.g:603:10: {...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "true");
            	    }
            	    // InternalGenericDatasheet.g:603:19: (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) )
            	    // InternalGenericDatasheet.g:603:20: otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_1); 

            	    									newLeafNode(otherlv_7, grammarAccess.getProprietaryLicenseAccess().getFullTextKeyword_3_1_0());
            	    								
            	    // InternalGenericDatasheet.g:607:9: (otherlv_8= ':' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==13) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalGenericDatasheet.g:608:10: otherlv_8= ':'
            	            {
            	            otherlv_8=(Token)match(input,13,FOLLOW_1); 

            	            										newLeafNode(otherlv_8, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalGenericDatasheet.g:613:9: ( (lv_fullText_9_0= ruleEString ) )
            	    // InternalGenericDatasheet.g:614:10: (lv_fullText_9_0= ruleEString )
            	    {
            	    // InternalGenericDatasheet.g:614:10: (lv_fullText_9_0= ruleEString )
            	    // InternalGenericDatasheet.g:615:11: lv_fullText_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getProprietaryLicenseAccess().getFullTextEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_fullText_9_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getProprietaryLicenseRule());
            	    											}
            	    											set(
            	    												current,
            	    												"fullText",
            	    												lv_fullText_9_0,
            	    												"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
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
            	    // InternalGenericDatasheet.g:638:4: ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:638:4: ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) )
            	    // InternalGenericDatasheet.g:639:5: {...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalGenericDatasheet.g:639:115: ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) )
            	    // InternalGenericDatasheet.g:640:6: ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalGenericDatasheet.g:643:9: ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) )
            	    // InternalGenericDatasheet.g:643:10: {...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "true");
            	    }
            	    // InternalGenericDatasheet.g:643:19: (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) )
            	    // InternalGenericDatasheet.g:643:20: otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,27,FOLLOW_1); 

            	    									newLeafNode(otherlv_10, grammarAccess.getProprietaryLicenseAccess().getURLKeyword_3_2_0());
            	    								
            	    // InternalGenericDatasheet.g:647:9: (otherlv_11= ':' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==13) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalGenericDatasheet.g:648:10: otherlv_11= ':'
            	            {
            	            otherlv_11=(Token)match(input,13,FOLLOW_1); 

            	            										newLeafNode(otherlv_11, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalGenericDatasheet.g:653:9: ( (lv_url_12_0= ruleEString ) )
            	    // InternalGenericDatasheet.g:654:10: (lv_url_12_0= ruleEString )
            	    {
            	    // InternalGenericDatasheet.g:654:10: (lv_url_12_0= ruleEString )
            	    // InternalGenericDatasheet.g:655:11: lv_url_12_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getProprietaryLicenseAccess().getUrlEStringParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_url_12_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getProprietaryLicenseRule());
            	    											}
            	    											set(
            	    												current,
            	    												"url",
            	    												lv_url_12_0,
            	    												"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canLeave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
            				

            }

            otherlv_13=(Token)match(input,28,FOLLOW_8); 

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
    // InternalGenericDatasheet.g:694:1: ruleTRL returns [Enumerator current=null] : ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) ) ;
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
            // InternalGenericDatasheet.g:700:2: ( ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) ) )
            // InternalGenericDatasheet.g:701:2: ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) )
            {
            // InternalGenericDatasheet.g:701:2: ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) )
            int alt14=10;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            case 33:
                {
                alt14=5;
                }
                break;
            case 34:
                {
                alt14=6;
                }
                break;
            case 35:
                {
                alt14=7;
                }
                break;
            case 36:
                {
                alt14=8;
                }
                break;
            case 37:
                {
                alt14=9;
                }
                break;
            case 38:
                {
                alt14=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalGenericDatasheet.g:702:3: (enumLiteral_0= 'Level1' )
                    {
                    // InternalGenericDatasheet.g:702:3: (enumLiteral_0= 'Level1' )
                    // InternalGenericDatasheet.g:703:4: enumLiteral_0= 'Level1'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_8); 

                    				current = grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenericDatasheet.g:710:3: (enumLiteral_1= 'Level2' )
                    {
                    // InternalGenericDatasheet.g:710:3: (enumLiteral_1= 'Level2' )
                    // InternalGenericDatasheet.g:711:4: enumLiteral_1= 'Level2'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_8); 

                    				current = grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGenericDatasheet.g:718:3: (enumLiteral_2= 'Level3' )
                    {
                    // InternalGenericDatasheet.g:718:3: (enumLiteral_2= 'Level3' )
                    // InternalGenericDatasheet.g:719:4: enumLiteral_2= 'Level3'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_8); 

                    				current = grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGenericDatasheet.g:726:3: (enumLiteral_3= 'Level4' )
                    {
                    // InternalGenericDatasheet.g:726:3: (enumLiteral_3= 'Level4' )
                    // InternalGenericDatasheet.g:727:4: enumLiteral_3= 'Level4'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_8); 

                    				current = grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGenericDatasheet.g:734:3: (enumLiteral_4= 'Level5' )
                    {
                    // InternalGenericDatasheet.g:734:3: (enumLiteral_4= 'Level5' )
                    // InternalGenericDatasheet.g:735:4: enumLiteral_4= 'Level5'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_8); 

                    				current = grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGenericDatasheet.g:742:3: (enumLiteral_5= 'Level6' )
                    {
                    // InternalGenericDatasheet.g:742:3: (enumLiteral_5= 'Level6' )
                    // InternalGenericDatasheet.g:743:4: enumLiteral_5= 'Level6'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_8); 

                    				current = grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGenericDatasheet.g:750:3: (enumLiteral_6= 'Level7' )
                    {
                    // InternalGenericDatasheet.g:750:3: (enumLiteral_6= 'Level7' )
                    // InternalGenericDatasheet.g:751:4: enumLiteral_6= 'Level7'
                    {
                    enumLiteral_6=(Token)match(input,35,FOLLOW_8); 

                    				current = grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalGenericDatasheet.g:758:3: (enumLiteral_7= 'Level8' )
                    {
                    // InternalGenericDatasheet.g:758:3: (enumLiteral_7= 'Level8' )
                    // InternalGenericDatasheet.g:759:4: enumLiteral_7= 'Level8'
                    {
                    enumLiteral_7=(Token)match(input,36,FOLLOW_8); 

                    				current = grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalGenericDatasheet.g:766:3: (enumLiteral_8= 'Level9' )
                    {
                    // InternalGenericDatasheet.g:766:3: (enumLiteral_8= 'Level9' )
                    // InternalGenericDatasheet.g:767:4: enumLiteral_8= 'Level9'
                    {
                    enumLiteral_8=(Token)match(input,37,FOLLOW_8); 

                    				current = grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalGenericDatasheet.g:774:3: (enumLiteral_9= 'Undefined' )
                    {
                    // InternalGenericDatasheet.g:774:3: (enumLiteral_9= 'Undefined' )
                    // InternalGenericDatasheet.g:775:4: enumLiteral_9= 'Undefined'
                    {
                    enumLiteral_9=(Token)match(input,38,FOLLOW_8); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x00000000000FD002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000007FE0002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000902000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001E000000L});

}
