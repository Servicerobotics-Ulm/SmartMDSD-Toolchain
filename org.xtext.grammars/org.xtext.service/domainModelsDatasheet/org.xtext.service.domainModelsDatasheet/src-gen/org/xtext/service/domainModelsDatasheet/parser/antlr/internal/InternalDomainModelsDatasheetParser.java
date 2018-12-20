package org.xtext.service.domainModelsDatasheet.parser.antlr.internal;

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
import org.xtext.service.domainModelsDatasheet.services.DomainModelsDatasheetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainModelsDatasheetParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TEXT_BLOCK", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DomainModelsDatasheet'", "'{'", "'}'", "'baseURI'", "':'", "'shortDescrition'", "'longDescription'", "'supplierDescription'", "'homepage'", "'trl'", "'license'", "'spdx'", "'('", "')'", "'proprietary'", "'name'", "'fullText'", "'URL'", "'Level1'", "'Level2'", "'Level3'", "'Level4'", "'Level5'", "'Level6'", "'Level7'", "'Level8'", "'Level9'", "'Undefined'"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDomainModelsDatasheetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainModelsDatasheetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainModelsDatasheetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainModelsDatasheet.g"; }



     	private DomainModelsDatasheetGrammarAccess grammarAccess;

        public InternalDomainModelsDatasheetParser(TokenStream input, DomainModelsDatasheetGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainModelsDatasheet";
       	}

       	@Override
       	protected DomainModelsDatasheetGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainModelsDatasheet"
    // InternalDomainModelsDatasheet.g:106:1: entryRuleDomainModelsDatasheet returns [EObject current=null] : iv_ruleDomainModelsDatasheet= ruleDomainModelsDatasheet EOF ;
    public final EObject entryRuleDomainModelsDatasheet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModelsDatasheet = null;


        try {
            // InternalDomainModelsDatasheet.g:106:62: (iv_ruleDomainModelsDatasheet= ruleDomainModelsDatasheet EOF )
            // InternalDomainModelsDatasheet.g:107:2: iv_ruleDomainModelsDatasheet= ruleDomainModelsDatasheet EOF
            {
             newCompositeNode(grammarAccess.getDomainModelsDatasheetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainModelsDatasheet=ruleDomainModelsDatasheet();

            state._fsp--;

             current =iv_ruleDomainModelsDatasheet; 
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
    // $ANTLR end "entryRuleDomainModelsDatasheet"


    // $ANTLR start "ruleDomainModelsDatasheet"
    // InternalDomainModelsDatasheet.g:113:1: ruleDomainModelsDatasheet returns [EObject current=null] : (otherlv_0= 'DomainModelsDatasheet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheet_3= ruleGenericDatasheet[$current] otherlv_4= '}' ) ;
    public final EObject ruleDomainModelsDatasheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_GenericDatasheet_3 = null;



        	enterRule();

        try {
            // InternalDomainModelsDatasheet.g:119:2: ( (otherlv_0= 'DomainModelsDatasheet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheet_3= ruleGenericDatasheet[$current] otherlv_4= '}' ) )
            // InternalDomainModelsDatasheet.g:120:2: (otherlv_0= 'DomainModelsDatasheet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheet_3= ruleGenericDatasheet[$current] otherlv_4= '}' )
            {
            // InternalDomainModelsDatasheet.g:120:2: (otherlv_0= 'DomainModelsDatasheet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheet_3= ruleGenericDatasheet[$current] otherlv_4= '}' )
            // InternalDomainModelsDatasheet.g:121:3: otherlv_0= 'DomainModelsDatasheet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheet_3= ruleGenericDatasheet[$current] otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainModelsDatasheetAccess().getDomainModelsDatasheetKeyword_0());
            		
            // InternalDomainModelsDatasheet.g:125:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainModelsDatasheet.g:126:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainModelsDatasheet.g:126:4: (lv_name_1_0= RULE_ID )
            // InternalDomainModelsDatasheet.g:127:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainModelsDatasheetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainModelsDatasheetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainModelsDatasheetAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getDomainModelsDatasheetRule());
            			}
            			newCompositeNode(grammarAccess.getDomainModelsDatasheetAccess().getGenericDatasheetParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_GenericDatasheet_3=ruleGenericDatasheet(current);

            state._fsp--;


            			current = this_GenericDatasheet_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDomainModelsDatasheetAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDomainModelsDatasheet"


    // $ANTLR start "ruleGenericDatasheet"
    // InternalDomainModelsDatasheet.g:167:1: ruleGenericDatasheet[EObject in_current] returns [EObject current=in_current] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) ) ;
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

        AntlrDatatypeRuleToken lv_shortDescrition_6_0 = null;

        AntlrDatatypeRuleToken lv_supplierDescription_12_0 = null;

        AntlrDatatypeRuleToken lv_homepage_15_0 = null;

        Enumerator lv_trl_18_0 = null;

        EObject lv_license_21_0 = null;



        	enterRule();

        try {
            // InternalDomainModelsDatasheet.g:173:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDomainModelsDatasheet.g:174:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDomainModelsDatasheet.g:174:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDomainModelsDatasheet.g:175:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDomainModelsDatasheet.g:175:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) )
            // InternalDomainModelsDatasheet.g:176:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            			
            // InternalDomainModelsDatasheet.g:179:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?)
            // InternalDomainModelsDatasheet.g:180:5: ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?
            {
            // InternalDomainModelsDatasheet.g:180:5: ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=8;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                    alt8=2;
                }
                else if ( LA8_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                    alt8=3;
                }
                else if ( LA8_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                    alt8=4;
                }
                else if ( LA8_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                    alt8=5;
                }
                else if ( LA8_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                    alt8=6;
                }
                else if ( LA8_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                    alt8=7;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomainModelsDatasheet.g:181:3: ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:181:3: ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:182:4: {...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalDomainModelsDatasheet.g:182:110: ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:183:5: ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalDomainModelsDatasheet.g:186:8: ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) )
            	    // InternalDomainModelsDatasheet.g:186:9: {...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:186:18: (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) )
            	    // InternalDomainModelsDatasheet.g:186:19: otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGenericDatasheetAccess().getBaseURIKeyword_0_0());
            	    							
            	    // InternalDomainModelsDatasheet.g:190:8: (otherlv_2= ':' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==16) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalDomainModelsDatasheet.g:191:9: otherlv_2= ':'
            	            {
            	            otherlv_2=(Token)match(input,16,FOLLOW_7); 

            	            									newLeafNode(otherlv_2, grammarAccess.getGenericDatasheetAccess().getColonKeyword_0_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalDomainModelsDatasheet.g:196:8: ( (lv_baseURI_3_0= ruleEString ) )
            	    // InternalDomainModelsDatasheet.g:197:9: (lv_baseURI_3_0= ruleEString )
            	    {
            	    // InternalDomainModelsDatasheet.g:197:9: (lv_baseURI_3_0= ruleEString )
            	    // InternalDomainModelsDatasheet.g:198:10: lv_baseURI_3_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getBaseURIEStringParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
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
            	    // InternalDomainModelsDatasheet.g:221:3: ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:221:3: ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:222:4: {...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalDomainModelsDatasheet.g:222:110: ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:223:5: ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalDomainModelsDatasheet.g:226:8: ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) )
            	    // InternalDomainModelsDatasheet.g:226:9: {...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:226:18: (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) )
            	    // InternalDomainModelsDatasheet.g:226:19: otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_7); 

            	    								newLeafNode(otherlv_4, grammarAccess.getGenericDatasheetAccess().getShortDescritionKeyword_1_0());
            	    							
            	    // InternalDomainModelsDatasheet.g:230:8: (otherlv_5= ':' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==16) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalDomainModelsDatasheet.g:231:9: otherlv_5= ':'
            	            {
            	            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            	            									newLeafNode(otherlv_5, grammarAccess.getGenericDatasheetAccess().getColonKeyword_1_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalDomainModelsDatasheet.g:236:8: ( (lv_shortDescrition_6_0= ruleEString ) )
            	    // InternalDomainModelsDatasheet.g:237:9: (lv_shortDescrition_6_0= ruleEString )
            	    {
            	    // InternalDomainModelsDatasheet.g:237:9: (lv_shortDescrition_6_0= ruleEString )
            	    // InternalDomainModelsDatasheet.g:238:10: lv_shortDescrition_6_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getShortDescritionEStringParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_shortDescrition_6_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGenericDatasheetRule());
            	    										}
            	    										set(
            	    											current,
            	    											"shortDescrition",
            	    											lv_shortDescrition_6_0,
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
            	    // InternalDomainModelsDatasheet.g:261:3: ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:261:3: ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:262:4: {...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalDomainModelsDatasheet.g:262:110: ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:263:5: ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalDomainModelsDatasheet.g:266:8: ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) )
            	    // InternalDomainModelsDatasheet.g:266:9: {...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:266:18: (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) )
            	    // InternalDomainModelsDatasheet.g:266:19: otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_9); 

            	    								newLeafNode(otherlv_7, grammarAccess.getGenericDatasheetAccess().getLongDescriptionKeyword_2_0());
            	    							
            	    // InternalDomainModelsDatasheet.g:270:8: (otherlv_8= ':' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==16) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalDomainModelsDatasheet.g:271:9: otherlv_8= ':'
            	            {
            	            otherlv_8=(Token)match(input,16,FOLLOW_10); 

            	            									newLeafNode(otherlv_8, grammarAccess.getGenericDatasheetAccess().getColonKeyword_2_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalDomainModelsDatasheet.g:276:8: ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) )
            	    // InternalDomainModelsDatasheet.g:277:9: (lv_longDescription_9_0= RULE_TEXT_BLOCK )
            	    {
            	    // InternalDomainModelsDatasheet.g:277:9: (lv_longDescription_9_0= RULE_TEXT_BLOCK )
            	    // InternalDomainModelsDatasheet.g:278:10: lv_longDescription_9_0= RULE_TEXT_BLOCK
            	    {
            	    lv_longDescription_9_0=(Token)match(input,RULE_TEXT_BLOCK,FOLLOW_8); 

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
            	    // InternalDomainModelsDatasheet.g:300:3: ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:300:3: ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:301:4: {...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalDomainModelsDatasheet.g:301:110: ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:302:5: ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalDomainModelsDatasheet.g:305:8: ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) )
            	    // InternalDomainModelsDatasheet.g:305:9: {...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:305:18: (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) )
            	    // InternalDomainModelsDatasheet.g:305:19: otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_7); 

            	    								newLeafNode(otherlv_10, grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionKeyword_3_0());
            	    							
            	    // InternalDomainModelsDatasheet.g:309:8: (otherlv_11= ':' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==16) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalDomainModelsDatasheet.g:310:9: otherlv_11= ':'
            	            {
            	            otherlv_11=(Token)match(input,16,FOLLOW_7); 

            	            									newLeafNode(otherlv_11, grammarAccess.getGenericDatasheetAccess().getColonKeyword_3_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalDomainModelsDatasheet.g:315:8: ( (lv_supplierDescription_12_0= ruleEString ) )
            	    // InternalDomainModelsDatasheet.g:316:9: (lv_supplierDescription_12_0= ruleEString )
            	    {
            	    // InternalDomainModelsDatasheet.g:316:9: (lv_supplierDescription_12_0= ruleEString )
            	    // InternalDomainModelsDatasheet.g:317:10: lv_supplierDescription_12_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionEStringParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
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
            	    // InternalDomainModelsDatasheet.g:340:3: ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:340:3: ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:341:4: {...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalDomainModelsDatasheet.g:341:110: ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:342:5: ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalDomainModelsDatasheet.g:345:8: ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) )
            	    // InternalDomainModelsDatasheet.g:345:9: {...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:345:18: (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) )
            	    // InternalDomainModelsDatasheet.g:345:19: otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,20,FOLLOW_7); 

            	    								newLeafNode(otherlv_13, grammarAccess.getGenericDatasheetAccess().getHomepageKeyword_4_0());
            	    							
            	    // InternalDomainModelsDatasheet.g:349:8: (otherlv_14= ':' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==16) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalDomainModelsDatasheet.g:350:9: otherlv_14= ':'
            	            {
            	            otherlv_14=(Token)match(input,16,FOLLOW_7); 

            	            									newLeafNode(otherlv_14, grammarAccess.getGenericDatasheetAccess().getColonKeyword_4_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalDomainModelsDatasheet.g:355:8: ( (lv_homepage_15_0= ruleEString ) )
            	    // InternalDomainModelsDatasheet.g:356:9: (lv_homepage_15_0= ruleEString )
            	    {
            	    // InternalDomainModelsDatasheet.g:356:9: (lv_homepage_15_0= ruleEString )
            	    // InternalDomainModelsDatasheet.g:357:10: lv_homepage_15_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getHomepageEStringParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
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
            	    // InternalDomainModelsDatasheet.g:380:3: ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:380:3: ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:381:4: {...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalDomainModelsDatasheet.g:381:110: ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:382:5: ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalDomainModelsDatasheet.g:385:8: ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) )
            	    // InternalDomainModelsDatasheet.g:385:9: {...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:385:18: (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) )
            	    // InternalDomainModelsDatasheet.g:385:19: otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) )
            	    {
            	    otherlv_16=(Token)match(input,21,FOLLOW_11); 

            	    								newLeafNode(otherlv_16, grammarAccess.getGenericDatasheetAccess().getTrlKeyword_5_0());
            	    							
            	    // InternalDomainModelsDatasheet.g:389:8: (otherlv_17= ':' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==16) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalDomainModelsDatasheet.g:390:9: otherlv_17= ':'
            	            {
            	            otherlv_17=(Token)match(input,16,FOLLOW_11); 

            	            									newLeafNode(otherlv_17, grammarAccess.getGenericDatasheetAccess().getColonKeyword_5_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalDomainModelsDatasheet.g:395:8: ( (lv_trl_18_0= ruleTRL ) )
            	    // InternalDomainModelsDatasheet.g:396:9: (lv_trl_18_0= ruleTRL )
            	    {
            	    // InternalDomainModelsDatasheet.g:396:9: (lv_trl_18_0= ruleTRL )
            	    // InternalDomainModelsDatasheet.g:397:10: lv_trl_18_0= ruleTRL
            	    {

            	    										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getTrlTRLEnumRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
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
            	    // InternalDomainModelsDatasheet.g:420:3: ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:420:3: ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:421:4: {...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalDomainModelsDatasheet.g:421:110: ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:422:5: ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalDomainModelsDatasheet.g:425:8: ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) )
            	    // InternalDomainModelsDatasheet.g:425:9: {...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:425:18: (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) )
            	    // InternalDomainModelsDatasheet.g:425:19: otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) )
            	    {
            	    otherlv_19=(Token)match(input,22,FOLLOW_12); 

            	    								newLeafNode(otherlv_19, grammarAccess.getGenericDatasheetAccess().getLicenseKeyword_6_0());
            	    							
            	    // InternalDomainModelsDatasheet.g:429:8: (otherlv_20= ':' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==16) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalDomainModelsDatasheet.g:430:9: otherlv_20= ':'
            	            {
            	            otherlv_20=(Token)match(input,16,FOLLOW_12); 

            	            									newLeafNode(otherlv_20, grammarAccess.getGenericDatasheetAccess().getColonKeyword_6_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalDomainModelsDatasheet.g:435:8: ( (lv_license_21_0= ruleAbstractLicense ) )
            	    // InternalDomainModelsDatasheet.g:436:9: (lv_license_21_0= ruleAbstractLicense )
            	    {
            	    // InternalDomainModelsDatasheet.g:436:9: (lv_license_21_0= ruleAbstractLicense )
            	    // InternalDomainModelsDatasheet.g:437:10: lv_license_21_0= ruleAbstractLicense
            	    {

            	    										newCompositeNode(grammarAccess.getGenericDatasheetAccess().getLicenseAbstractLicenseParserRuleCall_6_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
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
    // InternalDomainModelsDatasheet.g:471:1: entryRuleAbstractLicense returns [EObject current=null] : iv_ruleAbstractLicense= ruleAbstractLicense EOF ;
    public final EObject entryRuleAbstractLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractLicense = null;


        try {
            // InternalDomainModelsDatasheet.g:471:56: (iv_ruleAbstractLicense= ruleAbstractLicense EOF )
            // InternalDomainModelsDatasheet.g:472:2: iv_ruleAbstractLicense= ruleAbstractLicense EOF
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
    // InternalDomainModelsDatasheet.g:478:1: ruleAbstractLicense returns [EObject current=null] : (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense ) ;
    public final EObject ruleAbstractLicense() throws RecognitionException {
        EObject current = null;

        EObject this_SpdxLicense_0 = null;

        EObject this_ProprietaryLicense_1 = null;



        	enterRule();

        try {
            // InternalDomainModelsDatasheet.g:484:2: ( (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense ) )
            // InternalDomainModelsDatasheet.g:485:2: (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense )
            {
            // InternalDomainModelsDatasheet.g:485:2: (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:486:3: this_SpdxLicense_0= ruleSpdxLicense
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
                    // InternalDomainModelsDatasheet.g:495:3: this_ProprietaryLicense_1= ruleProprietaryLicense
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
    // InternalDomainModelsDatasheet.g:507:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDomainModelsDatasheet.g:507:47: (iv_ruleEString= ruleEString EOF )
            // InternalDomainModelsDatasheet.g:508:2: iv_ruleEString= ruleEString EOF
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
    // InternalDomainModelsDatasheet.g:514:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalDomainModelsDatasheet.g:520:2: (this_STRING_0= RULE_STRING )
            // InternalDomainModelsDatasheet.g:521:2: this_STRING_0= RULE_STRING
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
    // InternalDomainModelsDatasheet.g:531:1: entryRuleSpdxLicense returns [EObject current=null] : iv_ruleSpdxLicense= ruleSpdxLicense EOF ;
    public final EObject entryRuleSpdxLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpdxLicense = null;


        try {
            // InternalDomainModelsDatasheet.g:531:52: (iv_ruleSpdxLicense= ruleSpdxLicense EOF )
            // InternalDomainModelsDatasheet.g:532:2: iv_ruleSpdxLicense= ruleSpdxLicense EOF
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
    // InternalDomainModelsDatasheet.g:538:1: ruleSpdxLicense returns [EObject current=null] : (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' ) ;
    public final EObject ruleSpdxLicense() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_licenseID_2_0 = null;



        	enterRule();

        try {
            // InternalDomainModelsDatasheet.g:544:2: ( (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' ) )
            // InternalDomainModelsDatasheet.g:545:2: (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' )
            {
            // InternalDomainModelsDatasheet.g:545:2: (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' )
            // InternalDomainModelsDatasheet.g:546:3: otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSpdxLicenseAccess().getSpdxKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSpdxLicenseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDomainModelsDatasheet.g:554:3: ( (lv_licenseID_2_0= ruleEString ) )
            // InternalDomainModelsDatasheet.g:555:4: (lv_licenseID_2_0= ruleEString )
            {
            // InternalDomainModelsDatasheet.g:555:4: (lv_licenseID_2_0= ruleEString )
            // InternalDomainModelsDatasheet.g:556:5: lv_licenseID_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSpdxLicenseAccess().getLicenseIDEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

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
    // InternalDomainModelsDatasheet.g:581:1: entryRuleProprietaryLicense returns [EObject current=null] : iv_ruleProprietaryLicense= ruleProprietaryLicense EOF ;
    public final EObject entryRuleProprietaryLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProprietaryLicense = null;


        try {
            // InternalDomainModelsDatasheet.g:581:59: (iv_ruleProprietaryLicense= ruleProprietaryLicense EOF )
            // InternalDomainModelsDatasheet.g:582:2: iv_ruleProprietaryLicense= ruleProprietaryLicense EOF
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
    // InternalDomainModelsDatasheet.g:588:1: ruleProprietaryLicense returns [EObject current=null] : ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) ;
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
            // InternalDomainModelsDatasheet.g:594:2: ( ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) )
            // InternalDomainModelsDatasheet.g:595:2: ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            {
            // InternalDomainModelsDatasheet.g:595:2: ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            // InternalDomainModelsDatasheet.g:596:3: () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}'
            {
            // InternalDomainModelsDatasheet.g:596:3: ()
            // InternalDomainModelsDatasheet.g:597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProprietaryLicenseAccess().getProprietaryLicenseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProprietaryLicenseAccess().getProprietaryKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getProprietaryLicenseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomainModelsDatasheet.g:611:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDomainModelsDatasheet.g:612:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDomainModelsDatasheet.g:612:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            // InternalDomainModelsDatasheet.g:613:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
            				
            // InternalDomainModelsDatasheet.g:616:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            // InternalDomainModelsDatasheet.g:617:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // InternalDomainModelsDatasheet.g:617:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( LA13_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDomainModelsDatasheet.g:618:4: ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:618:4: ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:619:5: {...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDomainModelsDatasheet.g:619:115: ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:620:6: ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDomainModelsDatasheet.g:623:9: ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalDomainModelsDatasheet.g:623:10: {...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:623:19: (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalDomainModelsDatasheet.g:623:20: otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_7); 

            	    									newLeafNode(otherlv_4, grammarAccess.getProprietaryLicenseAccess().getNameKeyword_3_0_0());
            	    								
            	    // InternalDomainModelsDatasheet.g:627:9: (otherlv_5= ':' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==16) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalDomainModelsDatasheet.g:628:10: otherlv_5= ':'
            	            {
            	            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            	            										newLeafNode(otherlv_5, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalDomainModelsDatasheet.g:633:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalDomainModelsDatasheet.g:634:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalDomainModelsDatasheet.g:634:10: (lv_name_6_0= ruleEString )
            	    // InternalDomainModelsDatasheet.g:635:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getProprietaryLicenseAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
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
            	    // InternalDomainModelsDatasheet.g:658:4: ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:658:4: ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:659:5: {...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDomainModelsDatasheet.g:659:115: ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:660:6: ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDomainModelsDatasheet.g:663:9: ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) )
            	    // InternalDomainModelsDatasheet.g:663:10: {...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:663:19: (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) )
            	    // InternalDomainModelsDatasheet.g:663:20: otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,28,FOLLOW_7); 

            	    									newLeafNode(otherlv_7, grammarAccess.getProprietaryLicenseAccess().getFullTextKeyword_3_1_0());
            	    								
            	    // InternalDomainModelsDatasheet.g:667:9: (otherlv_8= ':' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==16) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalDomainModelsDatasheet.g:668:10: otherlv_8= ':'
            	            {
            	            otherlv_8=(Token)match(input,16,FOLLOW_7); 

            	            										newLeafNode(otherlv_8, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalDomainModelsDatasheet.g:673:9: ( (lv_fullText_9_0= ruleEString ) )
            	    // InternalDomainModelsDatasheet.g:674:10: (lv_fullText_9_0= ruleEString )
            	    {
            	    // InternalDomainModelsDatasheet.g:674:10: (lv_fullText_9_0= ruleEString )
            	    // InternalDomainModelsDatasheet.g:675:11: lv_fullText_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getProprietaryLicenseAccess().getFullTextEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
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
            	    // InternalDomainModelsDatasheet.g:698:4: ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:698:4: ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:699:5: {...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDomainModelsDatasheet.g:699:115: ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:700:6: ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDomainModelsDatasheet.g:703:9: ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) )
            	    // InternalDomainModelsDatasheet.g:703:10: {...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:703:19: (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) )
            	    // InternalDomainModelsDatasheet.g:703:20: otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,29,FOLLOW_7); 

            	    									newLeafNode(otherlv_10, grammarAccess.getProprietaryLicenseAccess().getURLKeyword_3_2_0());
            	    								
            	    // InternalDomainModelsDatasheet.g:707:9: (otherlv_11= ':' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==16) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalDomainModelsDatasheet.g:708:10: otherlv_11= ':'
            	            {
            	            otherlv_11=(Token)match(input,16,FOLLOW_7); 

            	            										newLeafNode(otherlv_11, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalDomainModelsDatasheet.g:713:9: ( (lv_url_12_0= ruleEString ) )
            	    // InternalDomainModelsDatasheet.g:714:10: (lv_url_12_0= ruleEString )
            	    {
            	    // InternalDomainModelsDatasheet.g:714:10: (lv_url_12_0= ruleEString )
            	    // InternalDomainModelsDatasheet.g:715:11: lv_url_12_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getProprietaryLicenseAccess().getUrlEStringParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
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

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

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
    // InternalDomainModelsDatasheet.g:754:1: ruleTRL returns [Enumerator current=null] : ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) ) ;
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
            // InternalDomainModelsDatasheet.g:760:2: ( ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) ) )
            // InternalDomainModelsDatasheet.g:761:2: ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) )
            {
            // InternalDomainModelsDatasheet.g:761:2: ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) )
            int alt14=10;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 33:
                {
                alt14=4;
                }
                break;
            case 34:
                {
                alt14=5;
                }
                break;
            case 35:
                {
                alt14=6;
                }
                break;
            case 36:
                {
                alt14=7;
                }
                break;
            case 37:
                {
                alt14=8;
                }
                break;
            case 38:
                {
                alt14=9;
                }
                break;
            case 39:
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
                    // InternalDomainModelsDatasheet.g:762:3: (enumLiteral_0= 'Level1' )
                    {
                    // InternalDomainModelsDatasheet.g:762:3: (enumLiteral_0= 'Level1' )
                    // InternalDomainModelsDatasheet.g:763:4: enumLiteral_0= 'Level1'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModelsDatasheet.g:770:3: (enumLiteral_1= 'Level2' )
                    {
                    // InternalDomainModelsDatasheet.g:770:3: (enumLiteral_1= 'Level2' )
                    // InternalDomainModelsDatasheet.g:771:4: enumLiteral_1= 'Level2'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainModelsDatasheet.g:778:3: (enumLiteral_2= 'Level3' )
                    {
                    // InternalDomainModelsDatasheet.g:778:3: (enumLiteral_2= 'Level3' )
                    // InternalDomainModelsDatasheet.g:779:4: enumLiteral_2= 'Level3'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainModelsDatasheet.g:786:3: (enumLiteral_3= 'Level4' )
                    {
                    // InternalDomainModelsDatasheet.g:786:3: (enumLiteral_3= 'Level4' )
                    // InternalDomainModelsDatasheet.g:787:4: enumLiteral_3= 'Level4'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDomainModelsDatasheet.g:794:3: (enumLiteral_4= 'Level5' )
                    {
                    // InternalDomainModelsDatasheet.g:794:3: (enumLiteral_4= 'Level5' )
                    // InternalDomainModelsDatasheet.g:795:4: enumLiteral_4= 'Level5'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDomainModelsDatasheet.g:802:3: (enumLiteral_5= 'Level6' )
                    {
                    // InternalDomainModelsDatasheet.g:802:3: (enumLiteral_5= 'Level6' )
                    // InternalDomainModelsDatasheet.g:803:4: enumLiteral_5= 'Level6'
                    {
                    enumLiteral_5=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDomainModelsDatasheet.g:810:3: (enumLiteral_6= 'Level7' )
                    {
                    // InternalDomainModelsDatasheet.g:810:3: (enumLiteral_6= 'Level7' )
                    // InternalDomainModelsDatasheet.g:811:4: enumLiteral_6= 'Level7'
                    {
                    enumLiteral_6=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDomainModelsDatasheet.g:818:3: (enumLiteral_7= 'Level8' )
                    {
                    // InternalDomainModelsDatasheet.g:818:3: (enumLiteral_7= 'Level8' )
                    // InternalDomainModelsDatasheet.g:819:4: enumLiteral_7= 'Level8'
                    {
                    enumLiteral_7=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDomainModelsDatasheet.g:826:3: (enumLiteral_8= 'Level9' )
                    {
                    // InternalDomainModelsDatasheet.g:826:3: (enumLiteral_8= 'Level9' )
                    // InternalDomainModelsDatasheet.g:827:4: enumLiteral_8= 'Level9'
                    {
                    enumLiteral_8=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDomainModelsDatasheet.g:834:3: (enumLiteral_9= 'Undefined' )
                    {
                    // InternalDomainModelsDatasheet.g:834:3: (enumLiteral_9= 'Undefined' )
                    // InternalDomainModelsDatasheet.g:835:4: enumLiteral_9= 'Undefined'
                    {
                    enumLiteral_9=(Token)match(input,39,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007E8000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000007E8002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000FFC0010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004810000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000038004000L});

}
