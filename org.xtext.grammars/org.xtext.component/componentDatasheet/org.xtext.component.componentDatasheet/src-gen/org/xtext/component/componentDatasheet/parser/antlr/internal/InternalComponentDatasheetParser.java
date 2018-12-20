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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TEXT_BLOCK", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentDatasheet'", "'{'", "'purposeDescription'", "':'", "'hardwareRequirementDescription'", "'}'", "'baseURI'", "'shortDescrition'", "'longDescription'", "'supplierDescription'", "'homepage'", "'trl'", "'license'", "'spdx'", "'('", "')'", "'proprietary'", "'name'", "'fullText'", "'URL'", "'Level1'", "'Level2'", "'Level3'", "'Level4'", "'Level5'", "'Level6'", "'Level7'", "'Level8'", "'Level9'", "'Undefined'"
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
    // InternalComponentDatasheet.g:113:1: ruleComponentDatasheet returns [EObject current=null] : (otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheet_3= ruleGenericDatasheet[$current] ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleComponentDatasheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_GenericDatasheet_3 = null;

        AntlrDatatypeRuleToken lv_purposeDescription_7_0 = null;

        AntlrDatatypeRuleToken lv_hardwareRequirementDescription_10_0 = null;



        	enterRule();

        try {
            // InternalComponentDatasheet.g:119:2: ( (otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheet_3= ruleGenericDatasheet[$current] ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalComponentDatasheet.g:120:2: (otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheet_3= ruleGenericDatasheet[$current] ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalComponentDatasheet.g:120:2: (otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheet_3= ruleGenericDatasheet[$current] ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalComponentDatasheet.g:121:3: otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheet_3= ruleGenericDatasheet[$current] ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) ) )* ) ) ) otherlv_11= '}'
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
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getComponentDatasheetRule());
            			}
            			newCompositeNode(grammarAccess.getComponentDatasheetAccess().getGenericDatasheetParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_GenericDatasheet_3=ruleGenericDatasheet(current);

            state._fsp--;


            			current = this_GenericDatasheet_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalComponentDatasheet.g:153:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalComponentDatasheet.g:154:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalComponentDatasheet.g:154:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalComponentDatasheet.g:155:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4());
            				
            // InternalComponentDatasheet.g:158:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) ) )* )
            // InternalComponentDatasheet.g:159:6: ( ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalComponentDatasheet.g:159:6: ( ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComponentDatasheet.g:160:4: ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:160:4: ({...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:161:5: {...}? => ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalComponentDatasheet.g:161:115: ( ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:162:6: ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalComponentDatasheet.g:165:9: ({...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:165:10: {...}? => (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:165:19: (otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:165:20: otherlv_5= 'purposeDescription' (otherlv_6= ':' )? ( (lv_purposeDescription_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionKeyword_4_0_0());
            	    								
            	    // InternalComponentDatasheet.g:169:9: (otherlv_6= ':' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==15) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:170:10: otherlv_6= ':'
            	            {
            	            otherlv_6=(Token)match(input,15,FOLLOW_7); 

            	            										newLeafNode(otherlv_6, grammarAccess.getComponentDatasheetAccess().getColonKeyword_4_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:175:9: ( (lv_purposeDescription_7_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:176:10: (lv_purposeDescription_7_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:176:10: (lv_purposeDescription_7_0= ruleEString )
            	    // InternalComponentDatasheet.g:177:11: lv_purposeDescription_7_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDatasheetAccess().getPurposeDescriptionEStringParserRuleCall_4_0_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_purposeDescription_7_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDatasheetRule());
            	    											}
            	    											set(
            	    												current,
            	    												"purposeDescription",
            	    												lv_purposeDescription_7_0,
            	    												"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComponentDatasheet.g:200:4: ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:200:4: ({...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:201:5: {...}? => ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalComponentDatasheet.g:201:115: ( ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:202:6: ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalComponentDatasheet.g:205:9: ({...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:205:10: {...}? => (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:205:19: (otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:205:20: otherlv_8= 'hardwareRequirementDescription' (otherlv_9= ':' )? ( (lv_hardwareRequirementDescription_10_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_7); 

            	    									newLeafNode(otherlv_8, grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionKeyword_4_1_0());
            	    								
            	    // InternalComponentDatasheet.g:209:9: (otherlv_9= ':' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==15) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:210:10: otherlv_9= ':'
            	            {
            	            otherlv_9=(Token)match(input,15,FOLLOW_7); 

            	            										newLeafNode(otherlv_9, grammarAccess.getComponentDatasheetAccess().getColonKeyword_4_1_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:215:9: ( (lv_hardwareRequirementDescription_10_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:216:10: (lv_hardwareRequirementDescription_10_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:216:10: (lv_hardwareRequirementDescription_10_0= ruleEString )
            	    // InternalComponentDatasheet.g:217:11: lv_hardwareRequirementDescription_10_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getComponentDatasheetAccess().getHardwareRequirementDescriptionEStringParserRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_hardwareRequirementDescription_10_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentDatasheetRule());
            	    											}
            	    											set(
            	    												current,
            	    												"hardwareRequirementDescription",
            	    												lv_hardwareRequirementDescription_10_0,
            	    												"org.xtext.base.genericDatasheet.GenericDatasheet.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentDatasheetAccess().getUnorderedGroup_4());
            				

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getComponentDatasheetAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "ruleGenericDatasheet"
    // InternalComponentDatasheet.g:256:1: ruleGenericDatasheet[EObject in_current] returns [EObject current=in_current] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalComponentDatasheet.g:262:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalComponentDatasheet.g:263:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalComponentDatasheet.g:263:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) ) )
            // InternalComponentDatasheet.g:264:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalComponentDatasheet.g:264:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?) )
            // InternalComponentDatasheet.g:265:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup());
            			
            // InternalComponentDatasheet.g:268:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?)
            // InternalComponentDatasheet.g:269:5: ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+ {...}?
            {
            // InternalComponentDatasheet.g:269:5: ( ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=8;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
                    alt11=4;
                }
                else if ( LA11_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
                    alt11=5;
                }
                else if ( LA11_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
                    alt11=6;
                }
                else if ( LA11_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
                    alt11=7;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentDatasheet.g:270:3: ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:270:3: ({...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:271:4: {...}? => ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalComponentDatasheet.g:271:110: ( ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:272:5: ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalComponentDatasheet.g:275:8: ({...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:275:9: {...}? => (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:275:18: (otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:275:19: otherlv_1= 'baseURI' (otherlv_2= ':' )? ( (lv_baseURI_3_0= ruleEString ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGenericDatasheetAccess().getBaseURIKeyword_0_0());
            	    							
            	    // InternalComponentDatasheet.g:279:8: (otherlv_2= ':' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==15) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:280:9: otherlv_2= ':'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            	            									newLeafNode(otherlv_2, grammarAccess.getGenericDatasheetAccess().getColonKeyword_0_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:285:8: ( (lv_baseURI_3_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:286:9: (lv_baseURI_3_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:286:9: (lv_baseURI_3_0= ruleEString )
            	    // InternalComponentDatasheet.g:287:10: lv_baseURI_3_0= ruleEString
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
            	    // InternalComponentDatasheet.g:310:3: ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:310:3: ({...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:311:4: {...}? => ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalComponentDatasheet.g:311:110: ( ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:312:5: ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalComponentDatasheet.g:315:8: ({...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:315:9: {...}? => (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:315:18: (otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:315:19: otherlv_4= 'shortDescrition' (otherlv_5= ':' )? ( (lv_shortDescrition_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_7); 

            	    								newLeafNode(otherlv_4, grammarAccess.getGenericDatasheetAccess().getShortDescritionKeyword_1_0());
            	    							
            	    // InternalComponentDatasheet.g:319:8: (otherlv_5= ':' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==15) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:320:9: otherlv_5= ':'
            	            {
            	            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            	            									newLeafNode(otherlv_5, grammarAccess.getGenericDatasheetAccess().getColonKeyword_1_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:325:8: ( (lv_shortDescrition_6_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:326:9: (lv_shortDescrition_6_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:326:9: (lv_shortDescrition_6_0= ruleEString )
            	    // InternalComponentDatasheet.g:327:10: lv_shortDescrition_6_0= ruleEString
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
            	    // InternalComponentDatasheet.g:350:3: ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:350:3: ({...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:351:4: {...}? => ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalComponentDatasheet.g:351:110: ( ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) ) )
            	    // InternalComponentDatasheet.g:352:5: ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalComponentDatasheet.g:355:8: ({...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) ) )
            	    // InternalComponentDatasheet.g:355:9: {...}? => (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:355:18: (otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) ) )
            	    // InternalComponentDatasheet.g:355:19: otherlv_7= 'longDescription' (otherlv_8= ':' )? ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_9); 

            	    								newLeafNode(otherlv_7, grammarAccess.getGenericDatasheetAccess().getLongDescriptionKeyword_2_0());
            	    							
            	    // InternalComponentDatasheet.g:359:8: (otherlv_8= ':' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==15) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:360:9: otherlv_8= ':'
            	            {
            	            otherlv_8=(Token)match(input,15,FOLLOW_10); 

            	            									newLeafNode(otherlv_8, grammarAccess.getGenericDatasheetAccess().getColonKeyword_2_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:365:8: ( (lv_longDescription_9_0= RULE_TEXT_BLOCK ) )
            	    // InternalComponentDatasheet.g:366:9: (lv_longDescription_9_0= RULE_TEXT_BLOCK )
            	    {
            	    // InternalComponentDatasheet.g:366:9: (lv_longDescription_9_0= RULE_TEXT_BLOCK )
            	    // InternalComponentDatasheet.g:367:10: lv_longDescription_9_0= RULE_TEXT_BLOCK
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
            	    // InternalComponentDatasheet.g:389:3: ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:389:3: ({...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:390:4: {...}? => ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalComponentDatasheet.g:390:110: ( ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:391:5: ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalComponentDatasheet.g:394:8: ({...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:394:9: {...}? => (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:394:18: (otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:394:19: otherlv_10= 'supplierDescription' (otherlv_11= ':' )? ( (lv_supplierDescription_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,21,FOLLOW_7); 

            	    								newLeafNode(otherlv_10, grammarAccess.getGenericDatasheetAccess().getSupplierDescriptionKeyword_3_0());
            	    							
            	    // InternalComponentDatasheet.g:398:8: (otherlv_11= ':' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==15) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:399:9: otherlv_11= ':'
            	            {
            	            otherlv_11=(Token)match(input,15,FOLLOW_7); 

            	            									newLeafNode(otherlv_11, grammarAccess.getGenericDatasheetAccess().getColonKeyword_3_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:404:8: ( (lv_supplierDescription_12_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:405:9: (lv_supplierDescription_12_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:405:9: (lv_supplierDescription_12_0= ruleEString )
            	    // InternalComponentDatasheet.g:406:10: lv_supplierDescription_12_0= ruleEString
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
            	    // InternalComponentDatasheet.g:429:3: ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:429:3: ({...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:430:4: {...}? => ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalComponentDatasheet.g:430:110: ( ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:431:5: ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalComponentDatasheet.g:434:8: ({...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:434:9: {...}? => (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:434:18: (otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:434:19: otherlv_13= 'homepage' (otherlv_14= ':' )? ( (lv_homepage_15_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,22,FOLLOW_7); 

            	    								newLeafNode(otherlv_13, grammarAccess.getGenericDatasheetAccess().getHomepageKeyword_4_0());
            	    							
            	    // InternalComponentDatasheet.g:438:8: (otherlv_14= ':' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==15) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:439:9: otherlv_14= ':'
            	            {
            	            otherlv_14=(Token)match(input,15,FOLLOW_7); 

            	            									newLeafNode(otherlv_14, grammarAccess.getGenericDatasheetAccess().getColonKeyword_4_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:444:8: ( (lv_homepage_15_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:445:9: (lv_homepage_15_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:445:9: (lv_homepage_15_0= ruleEString )
            	    // InternalComponentDatasheet.g:446:10: lv_homepage_15_0= ruleEString
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
            	    // InternalComponentDatasheet.g:469:3: ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:469:3: ({...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:470:4: {...}? => ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalComponentDatasheet.g:470:110: ( ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) ) )
            	    // InternalComponentDatasheet.g:471:5: ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalComponentDatasheet.g:474:8: ({...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) ) )
            	    // InternalComponentDatasheet.g:474:9: {...}? => (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:474:18: (otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) ) )
            	    // InternalComponentDatasheet.g:474:19: otherlv_16= 'trl' (otherlv_17= ':' )? ( (lv_trl_18_0= ruleTRL ) )
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_11); 

            	    								newLeafNode(otherlv_16, grammarAccess.getGenericDatasheetAccess().getTrlKeyword_5_0());
            	    							
            	    // InternalComponentDatasheet.g:478:8: (otherlv_17= ':' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==15) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:479:9: otherlv_17= ':'
            	            {
            	            otherlv_17=(Token)match(input,15,FOLLOW_11); 

            	            									newLeafNode(otherlv_17, grammarAccess.getGenericDatasheetAccess().getColonKeyword_5_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:484:8: ( (lv_trl_18_0= ruleTRL ) )
            	    // InternalComponentDatasheet.g:485:9: (lv_trl_18_0= ruleTRL )
            	    {
            	    // InternalComponentDatasheet.g:485:9: (lv_trl_18_0= ruleTRL )
            	    // InternalComponentDatasheet.g:486:10: lv_trl_18_0= ruleTRL
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
            	    // InternalComponentDatasheet.g:509:3: ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:509:3: ({...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:510:4: {...}? => ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "getUnorderedGroupHelper().canSelect(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalComponentDatasheet.g:510:110: ( ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) ) )
            	    // InternalComponentDatasheet.g:511:5: ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGenericDatasheetAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalComponentDatasheet.g:514:8: ({...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) ) )
            	    // InternalComponentDatasheet.g:514:9: {...}? => (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGenericDatasheet", "true");
            	    }
            	    // InternalComponentDatasheet.g:514:18: (otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) ) )
            	    // InternalComponentDatasheet.g:514:19: otherlv_19= 'license' (otherlv_20= ':' )? ( (lv_license_21_0= ruleAbstractLicense ) )
            	    {
            	    otherlv_19=(Token)match(input,24,FOLLOW_12); 

            	    								newLeafNode(otherlv_19, grammarAccess.getGenericDatasheetAccess().getLicenseKeyword_6_0());
            	    							
            	    // InternalComponentDatasheet.g:518:8: (otherlv_20= ':' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==15) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:519:9: otherlv_20= ':'
            	            {
            	            otherlv_20=(Token)match(input,15,FOLLOW_12); 

            	            									newLeafNode(otherlv_20, grammarAccess.getGenericDatasheetAccess().getColonKeyword_6_1());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:524:8: ( (lv_license_21_0= ruleAbstractLicense ) )
            	    // InternalComponentDatasheet.g:525:9: (lv_license_21_0= ruleAbstractLicense )
            	    {
            	    // InternalComponentDatasheet.g:525:9: (lv_license_21_0= ruleAbstractLicense )
            	    // InternalComponentDatasheet.g:526:10: lv_license_21_0= ruleAbstractLicense
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // InternalComponentDatasheet.g:560:1: entryRuleAbstractLicense returns [EObject current=null] : iv_ruleAbstractLicense= ruleAbstractLicense EOF ;
    public final EObject entryRuleAbstractLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractLicense = null;


        try {
            // InternalComponentDatasheet.g:560:56: (iv_ruleAbstractLicense= ruleAbstractLicense EOF )
            // InternalComponentDatasheet.g:561:2: iv_ruleAbstractLicense= ruleAbstractLicense EOF
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
    // InternalComponentDatasheet.g:567:1: ruleAbstractLicense returns [EObject current=null] : (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense ) ;
    public final EObject ruleAbstractLicense() throws RecognitionException {
        EObject current = null;

        EObject this_SpdxLicense_0 = null;

        EObject this_ProprietaryLicense_1 = null;



        	enterRule();

        try {
            // InternalComponentDatasheet.g:573:2: ( (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense ) )
            // InternalComponentDatasheet.g:574:2: (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense )
            {
            // InternalComponentDatasheet.g:574:2: (this_SpdxLicense_0= ruleSpdxLicense | this_ProprietaryLicense_1= ruleProprietaryLicense )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentDatasheet.g:575:3: this_SpdxLicense_0= ruleSpdxLicense
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
                    // InternalComponentDatasheet.g:584:3: this_ProprietaryLicense_1= ruleProprietaryLicense
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
    // InternalComponentDatasheet.g:596:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentDatasheet.g:596:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentDatasheet.g:597:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentDatasheet.g:603:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalComponentDatasheet.g:609:2: (this_STRING_0= RULE_STRING )
            // InternalComponentDatasheet.g:610:2: this_STRING_0= RULE_STRING
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
    // InternalComponentDatasheet.g:620:1: entryRuleSpdxLicense returns [EObject current=null] : iv_ruleSpdxLicense= ruleSpdxLicense EOF ;
    public final EObject entryRuleSpdxLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpdxLicense = null;


        try {
            // InternalComponentDatasheet.g:620:52: (iv_ruleSpdxLicense= ruleSpdxLicense EOF )
            // InternalComponentDatasheet.g:621:2: iv_ruleSpdxLicense= ruleSpdxLicense EOF
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
    // InternalComponentDatasheet.g:627:1: ruleSpdxLicense returns [EObject current=null] : (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' ) ;
    public final EObject ruleSpdxLicense() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_licenseID_2_0 = null;



        	enterRule();

        try {
            // InternalComponentDatasheet.g:633:2: ( (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' ) )
            // InternalComponentDatasheet.g:634:2: (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' )
            {
            // InternalComponentDatasheet.g:634:2: (otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')' )
            // InternalComponentDatasheet.g:635:3: otherlv_0= 'spdx' otherlv_1= '(' ( (lv_licenseID_2_0= ruleEString ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSpdxLicenseAccess().getSpdxKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSpdxLicenseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalComponentDatasheet.g:643:3: ( (lv_licenseID_2_0= ruleEString ) )
            // InternalComponentDatasheet.g:644:4: (lv_licenseID_2_0= ruleEString )
            {
            // InternalComponentDatasheet.g:644:4: (lv_licenseID_2_0= ruleEString )
            // InternalComponentDatasheet.g:645:5: lv_licenseID_2_0= ruleEString
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
    // InternalComponentDatasheet.g:670:1: entryRuleProprietaryLicense returns [EObject current=null] : iv_ruleProprietaryLicense= ruleProprietaryLicense EOF ;
    public final EObject entryRuleProprietaryLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProprietaryLicense = null;


        try {
            // InternalComponentDatasheet.g:670:59: (iv_ruleProprietaryLicense= ruleProprietaryLicense EOF )
            // InternalComponentDatasheet.g:671:2: iv_ruleProprietaryLicense= ruleProprietaryLicense EOF
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
    // InternalComponentDatasheet.g:677:1: ruleProprietaryLicense returns [EObject current=null] : ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) ;
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
            // InternalComponentDatasheet.g:683:2: ( ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) )
            // InternalComponentDatasheet.g:684:2: ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            {
            // InternalComponentDatasheet.g:684:2: ( () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            // InternalComponentDatasheet.g:685:3: () otherlv_1= 'proprietary' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}'
            {
            // InternalComponentDatasheet.g:685:3: ()
            // InternalComponentDatasheet.g:686:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProprietaryLicenseAccess().getProprietaryLicenseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProprietaryLicenseAccess().getProprietaryKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getProprietaryLicenseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentDatasheet.g:700:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalComponentDatasheet.g:701:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalComponentDatasheet.g:701:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            // InternalComponentDatasheet.g:702:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
            				
            // InternalComponentDatasheet.g:705:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            // InternalComponentDatasheet.g:706:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // InternalComponentDatasheet.g:706:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=4;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
                    alt16=3;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalComponentDatasheet.g:707:4: ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:707:4: ({...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:708:5: {...}? => ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalComponentDatasheet.g:708:115: ( ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:709:6: ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalComponentDatasheet.g:712:9: ({...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:712:10: {...}? => (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "true");
            	    }
            	    // InternalComponentDatasheet.g:712:19: (otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:712:20: otherlv_4= 'name' (otherlv_5= ':' )? ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_7); 

            	    									newLeafNode(otherlv_4, grammarAccess.getProprietaryLicenseAccess().getNameKeyword_3_0_0());
            	    								
            	    // InternalComponentDatasheet.g:716:9: (otherlv_5= ':' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==15) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:717:10: otherlv_5= ':'
            	            {
            	            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            	            										newLeafNode(otherlv_5, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_0_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:722:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:723:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:723:10: (lv_name_6_0= ruleEString )
            	    // InternalComponentDatasheet.g:724:11: lv_name_6_0= ruleEString
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
            	    // InternalComponentDatasheet.g:747:4: ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:747:4: ({...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:748:5: {...}? => ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalComponentDatasheet.g:748:115: ( ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:749:6: ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalComponentDatasheet.g:752:9: ({...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:752:10: {...}? => (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "true");
            	    }
            	    // InternalComponentDatasheet.g:752:19: (otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:752:20: otherlv_7= 'fullText' (otherlv_8= ':' )? ( (lv_fullText_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,30,FOLLOW_7); 

            	    									newLeafNode(otherlv_7, grammarAccess.getProprietaryLicenseAccess().getFullTextKeyword_3_1_0());
            	    								
            	    // InternalComponentDatasheet.g:756:9: (otherlv_8= ':' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==15) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:757:10: otherlv_8= ':'
            	            {
            	            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            	            										newLeafNode(otherlv_8, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_1_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:762:9: ( (lv_fullText_9_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:763:10: (lv_fullText_9_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:763:10: (lv_fullText_9_0= ruleEString )
            	    // InternalComponentDatasheet.g:764:11: lv_fullText_9_0= ruleEString
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
            	    // InternalComponentDatasheet.g:787:4: ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:787:4: ({...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:788:5: {...}? => ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalComponentDatasheet.g:788:115: ( ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) ) )
            	    // InternalComponentDatasheet.g:789:6: ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalComponentDatasheet.g:792:9: ({...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) ) )
            	    // InternalComponentDatasheet.g:792:10: {...}? => (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProprietaryLicense", "true");
            	    }
            	    // InternalComponentDatasheet.g:792:19: (otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) ) )
            	    // InternalComponentDatasheet.g:792:20: otherlv_10= 'URL' (otherlv_11= ':' )? ( (lv_url_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,31,FOLLOW_7); 

            	    									newLeafNode(otherlv_10, grammarAccess.getProprietaryLicenseAccess().getURLKeyword_3_2_0());
            	    								
            	    // InternalComponentDatasheet.g:796:9: (otherlv_11= ':' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==15) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:797:10: otherlv_11= ':'
            	            {
            	            otherlv_11=(Token)match(input,15,FOLLOW_7); 

            	            										newLeafNode(otherlv_11, grammarAccess.getProprietaryLicenseAccess().getColonKeyword_3_2_1());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalComponentDatasheet.g:802:9: ( (lv_url_12_0= ruleEString ) )
            	    // InternalComponentDatasheet.g:803:10: (lv_url_12_0= ruleEString )
            	    {
            	    // InternalComponentDatasheet.g:803:10: (lv_url_12_0= ruleEString )
            	    // InternalComponentDatasheet.g:804:11: lv_url_12_0= ruleEString
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleProprietaryLicense", "getUnorderedGroupHelper().canLeave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getProprietaryLicenseAccess().getUnorderedGroup_3());
            				

            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

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
    // InternalComponentDatasheet.g:843:1: ruleTRL returns [Enumerator current=null] : ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) ) ;
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
            // InternalComponentDatasheet.g:849:2: ( ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) ) )
            // InternalComponentDatasheet.g:850:2: ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) )
            {
            // InternalComponentDatasheet.g:850:2: ( (enumLiteral_0= 'Level1' ) | (enumLiteral_1= 'Level2' ) | (enumLiteral_2= 'Level3' ) | (enumLiteral_3= 'Level4' ) | (enumLiteral_4= 'Level5' ) | (enumLiteral_5= 'Level6' ) | (enumLiteral_6= 'Level7' ) | (enumLiteral_7= 'Level8' ) | (enumLiteral_8= 'Level9' ) | (enumLiteral_9= 'Undefined' ) )
            int alt17=10;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 33:
                {
                alt17=2;
                }
                break;
            case 34:
                {
                alt17=3;
                }
                break;
            case 35:
                {
                alt17=4;
                }
                break;
            case 36:
                {
                alt17=5;
                }
                break;
            case 37:
                {
                alt17=6;
                }
                break;
            case 38:
                {
                alt17=7;
                }
                break;
            case 39:
                {
                alt17=8;
                }
                break;
            case 40:
                {
                alt17=9;
                }
                break;
            case 41:
                {
                alt17=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalComponentDatasheet.g:851:3: (enumLiteral_0= 'Level1' )
                    {
                    // InternalComponentDatasheet.g:851:3: (enumLiteral_0= 'Level1' )
                    // InternalComponentDatasheet.g:852:4: enumLiteral_0= 'Level1'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTRLAccess().getLEVEL1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDatasheet.g:859:3: (enumLiteral_1= 'Level2' )
                    {
                    // InternalComponentDatasheet.g:859:3: (enumLiteral_1= 'Level2' )
                    // InternalComponentDatasheet.g:860:4: enumLiteral_1= 'Level2'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTRLAccess().getLEVEL2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDatasheet.g:867:3: (enumLiteral_2= 'Level3' )
                    {
                    // InternalComponentDatasheet.g:867:3: (enumLiteral_2= 'Level3' )
                    // InternalComponentDatasheet.g:868:4: enumLiteral_2= 'Level3'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTRLAccess().getLEVEL3EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDatasheet.g:875:3: (enumLiteral_3= 'Level4' )
                    {
                    // InternalComponentDatasheet.g:875:3: (enumLiteral_3= 'Level4' )
                    // InternalComponentDatasheet.g:876:4: enumLiteral_3= 'Level4'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTRLAccess().getLEVEL4EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalComponentDatasheet.g:883:3: (enumLiteral_4= 'Level5' )
                    {
                    // InternalComponentDatasheet.g:883:3: (enumLiteral_4= 'Level5' )
                    // InternalComponentDatasheet.g:884:4: enumLiteral_4= 'Level5'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTRLAccess().getLEVEL5EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalComponentDatasheet.g:891:3: (enumLiteral_5= 'Level6' )
                    {
                    // InternalComponentDatasheet.g:891:3: (enumLiteral_5= 'Level6' )
                    // InternalComponentDatasheet.g:892:4: enumLiteral_5= 'Level6'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTRLAccess().getLEVEL6EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalComponentDatasheet.g:899:3: (enumLiteral_6= 'Level7' )
                    {
                    // InternalComponentDatasheet.g:899:3: (enumLiteral_6= 'Level7' )
                    // InternalComponentDatasheet.g:900:4: enumLiteral_6= 'Level7'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTRLAccess().getLEVEL7EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalComponentDatasheet.g:907:3: (enumLiteral_7= 'Level8' )
                    {
                    // InternalComponentDatasheet.g:907:3: (enumLiteral_7= 'Level8' )
                    // InternalComponentDatasheet.g:908:4: enumLiteral_7= 'Level8'
                    {
                    enumLiteral_7=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTRLAccess().getLEVEL8EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalComponentDatasheet.g:915:3: (enumLiteral_8= 'Level9' )
                    {
                    // InternalComponentDatasheet.g:915:3: (enumLiteral_8= 'Level9' )
                    // InternalComponentDatasheet.g:916:4: enumLiteral_8= 'Level9'
                    {
                    enumLiteral_8=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTRLAccess().getLEVEL9EnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalComponentDatasheet.g:923:3: (enumLiteral_9= 'Undefined' )
                    {
                    // InternalComponentDatasheet.g:923:3: (enumLiteral_9= 'Undefined' )
                    // InternalComponentDatasheet.g:924:4: enumLiteral_9= 'Undefined'
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001FC0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000003FF00008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000012008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000E0020000L});

}
