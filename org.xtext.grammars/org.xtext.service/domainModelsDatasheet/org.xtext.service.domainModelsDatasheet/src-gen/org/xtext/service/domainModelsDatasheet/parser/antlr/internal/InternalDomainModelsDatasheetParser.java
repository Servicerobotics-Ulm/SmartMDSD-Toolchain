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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DomainModelsDatasheet'", "'{'", "'}'", "'DatasheetProperty'", "'value'", "'unit'", "'shortDescription'", "'semanticID'", "'BaseURI'", "'ShortDescription'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
    // InternalDomainModelsDatasheet.g:80:1: entryRuleDomainModelsDatasheet returns [EObject current=null] : iv_ruleDomainModelsDatasheet= ruleDomainModelsDatasheet EOF ;
    public final EObject entryRuleDomainModelsDatasheet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModelsDatasheet = null;


        try {
            // InternalDomainModelsDatasheet.g:80:62: (iv_ruleDomainModelsDatasheet= ruleDomainModelsDatasheet EOF )
            // InternalDomainModelsDatasheet.g:81:2: iv_ruleDomainModelsDatasheet= ruleDomainModelsDatasheet EOF
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
    // InternalDomainModelsDatasheet.g:87:1: ruleDomainModelsDatasheet returns [EObject current=null] : (otherlv_0= 'DomainModelsDatasheet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheetModel_3= ruleGenericDatasheetModel[$current] otherlv_4= '}' ) ;
    public final EObject ruleDomainModelsDatasheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_GenericDatasheetModel_3 = null;



        	enterRule();

        try {
            // InternalDomainModelsDatasheet.g:93:2: ( (otherlv_0= 'DomainModelsDatasheet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheetModel_3= ruleGenericDatasheetModel[$current] otherlv_4= '}' ) )
            // InternalDomainModelsDatasheet.g:94:2: (otherlv_0= 'DomainModelsDatasheet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheetModel_3= ruleGenericDatasheetModel[$current] otherlv_4= '}' )
            {
            // InternalDomainModelsDatasheet.g:94:2: (otherlv_0= 'DomainModelsDatasheet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheetModel_3= ruleGenericDatasheetModel[$current] otherlv_4= '}' )
            // InternalDomainModelsDatasheet.g:95:3: otherlv_0= 'DomainModelsDatasheet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheetModel_3= ruleGenericDatasheetModel[$current] otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainModelsDatasheetAccess().getDomainModelsDatasheetKeyword_0());
            		
            // InternalDomainModelsDatasheet.g:99:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainModelsDatasheet.g:100:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainModelsDatasheet.g:100:4: (lv_name_1_0= RULE_ID )
            // InternalDomainModelsDatasheet.g:101:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainModelsDatasheetAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getDomainModelsDatasheetRule());
            			}
            			newCompositeNode(grammarAccess.getDomainModelsDatasheetAccess().getGenericDatasheetModelParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_GenericDatasheetModel_3=ruleGenericDatasheetModel(current);

            state._fsp--;


            			current = this_GenericDatasheetModel_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "ruleGenericDatasheetModel"
    // InternalDomainModelsDatasheet.g:141:1: ruleGenericDatasheetModel[EObject in_current] returns [EObject current=in_current] : ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )* ;
    public final EObject ruleGenericDatasheetModel(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalDomainModelsDatasheet.g:147:2: ( ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )* )
            // InternalDomainModelsDatasheet.g:148:2: ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )*
            {
            // InternalDomainModelsDatasheet.g:148:2: ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainModelsDatasheet.g:149:3: (lv_elements_0_0= ruleAbstractDatasheetElement )
            	    {
            	    // InternalDomainModelsDatasheet.g:149:3: (lv_elements_0_0= ruleAbstractDatasheetElement )
            	    // InternalDomainModelsDatasheet.g:150:4: lv_elements_0_0= ruleAbstractDatasheetElement
            	    {

            	    				newCompositeNode(grammarAccess.getGenericDatasheetModelAccess().getElementsAbstractDatasheetElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_7);
            	    lv_elements_0_0=ruleAbstractDatasheetElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getGenericDatasheetModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.base.genericDatasheet.GenericDatasheet.AbstractDatasheetElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleGenericDatasheetModel"


    // $ANTLR start "entryRuleAbstractDatasheetElement"
    // InternalDomainModelsDatasheet.g:170:1: entryRuleAbstractDatasheetElement returns [EObject current=null] : iv_ruleAbstractDatasheetElement= ruleAbstractDatasheetElement EOF ;
    public final EObject entryRuleAbstractDatasheetElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDatasheetElement = null;


        try {
            // InternalDomainModelsDatasheet.g:170:65: (iv_ruleAbstractDatasheetElement= ruleAbstractDatasheetElement EOF )
            // InternalDomainModelsDatasheet.g:171:2: iv_ruleAbstractDatasheetElement= ruleAbstractDatasheetElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractDatasheetElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractDatasheetElement=ruleAbstractDatasheetElement();

            state._fsp--;

             current =iv_ruleAbstractDatasheetElement; 
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
    // $ANTLR end "entryRuleAbstractDatasheetElement"


    // $ANTLR start "ruleAbstractDatasheetElement"
    // InternalDomainModelsDatasheet.g:177:1: ruleAbstractDatasheetElement returns [EObject current=null] : (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement ) ;
    public final EObject ruleAbstractDatasheetElement() throws RecognitionException {
        EObject current = null;

        EObject this_DatasheetProperty_0 = null;

        EObject this_MandatoryDatasheetElement_1 = null;



        	enterRule();

        try {
            // InternalDomainModelsDatasheet.g:183:2: ( (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement ) )
            // InternalDomainModelsDatasheet.g:184:2: (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement )
            {
            // InternalDomainModelsDatasheet.g:184:2: (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=19 && LA2_0<=20)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:185:3: this_DatasheetProperty_0= ruleDatasheetProperty
                    {

                    			newCompositeNode(grammarAccess.getAbstractDatasheetElementAccess().getDatasheetPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatasheetProperty_0=ruleDatasheetProperty();

                    state._fsp--;


                    			current = this_DatasheetProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainModelsDatasheet.g:194:3: this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement
                    {

                    			newCompositeNode(grammarAccess.getAbstractDatasheetElementAccess().getMandatoryDatasheetElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MandatoryDatasheetElement_1=ruleMandatoryDatasheetElement();

                    state._fsp--;


                    			current = this_MandatoryDatasheetElement_1;
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
    // $ANTLR end "ruleAbstractDatasheetElement"


    // $ANTLR start "entryRuleDatasheetProperty"
    // InternalDomainModelsDatasheet.g:206:1: entryRuleDatasheetProperty returns [EObject current=null] : iv_ruleDatasheetProperty= ruleDatasheetProperty EOF ;
    public final EObject entryRuleDatasheetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasheetProperty = null;


        try {
            // InternalDomainModelsDatasheet.g:206:58: (iv_ruleDatasheetProperty= ruleDatasheetProperty EOF )
            // InternalDomainModelsDatasheet.g:207:2: iv_ruleDatasheetProperty= ruleDatasheetProperty EOF
            {
             newCompositeNode(grammarAccess.getDatasheetPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasheetProperty=ruleDatasheetProperty();

            state._fsp--;

             current =iv_ruleDatasheetProperty; 
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
    // $ANTLR end "entryRuleDatasheetProperty"


    // $ANTLR start "ruleDatasheetProperty"
    // InternalDomainModelsDatasheet.g:213:1: ruleDatasheetProperty returns [EObject current=null] : (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
    public final EObject ruleDatasheetProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token lv_unit_7_0=null;
        Token otherlv_8=null;
        Token lv_shortDescription_9_0=null;
        Token otherlv_10=null;
        Token lv_semanticID_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalDomainModelsDatasheet.g:219:2: ( (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalDomainModelsDatasheet.g:220:2: (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalDomainModelsDatasheet.g:220:2: (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalDomainModelsDatasheet.g:221:3: otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasheetPropertyAccess().getDatasheetPropertyKeyword_0());
            		
            // InternalDomainModelsDatasheet.g:225:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainModelsDatasheet.g:226:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainModelsDatasheet.g:226:4: (lv_name_1_0= RULE_ID )
            // InternalDomainModelsDatasheet.g:227:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDatasheetPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasheetPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasheetPropertyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomainModelsDatasheet.g:247:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalDomainModelsDatasheet.g:248:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalDomainModelsDatasheet.g:248:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalDomainModelsDatasheet.g:249:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
            				
            // InternalDomainModelsDatasheet.g:252:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalDomainModelsDatasheet.g:253:6: ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalDomainModelsDatasheet.g:253:6: ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=4;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                    alt4=2;
                }
                else if ( LA4_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                    alt4=3;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainModelsDatasheet.g:254:4: ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:254:4: ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) )
            	    // InternalDomainModelsDatasheet.g:255:5: {...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalDomainModelsDatasheet.g:255:114: ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) )
            	    // InternalDomainModelsDatasheet.g:256:6: ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalDomainModelsDatasheet.g:259:9: ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) )
            	    // InternalDomainModelsDatasheet.g:259:10: {...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:259:19: (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? )
            	    // InternalDomainModelsDatasheet.g:259:20: otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )?
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getDatasheetPropertyAccess().getValueKeyword_3_0_0());
            	    								
            	    // InternalDomainModelsDatasheet.g:263:9: ( (lv_value_5_0= RULE_STRING ) )
            	    // InternalDomainModelsDatasheet.g:264:10: (lv_value_5_0= RULE_STRING )
            	    {
            	    // InternalDomainModelsDatasheet.g:264:10: (lv_value_5_0= RULE_STRING )
            	    // InternalDomainModelsDatasheet.g:265:11: lv_value_5_0= RULE_STRING
            	    {
            	    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    											newLeafNode(lv_value_5_0, grammarAccess.getDatasheetPropertyAccess().getValueSTRINGTerminalRuleCall_3_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDatasheetPropertyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"value",
            	    												lv_value_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalDomainModelsDatasheet.g:281:9: (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==16) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalDomainModelsDatasheet.g:282:10: otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) )
            	            {
            	            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            	            										newLeafNode(otherlv_6, grammarAccess.getDatasheetPropertyAccess().getUnitKeyword_3_0_2_0());
            	            									
            	            // InternalDomainModelsDatasheet.g:286:10: ( (lv_unit_7_0= RULE_STRING ) )
            	            // InternalDomainModelsDatasheet.g:287:11: (lv_unit_7_0= RULE_STRING )
            	            {
            	            // InternalDomainModelsDatasheet.g:287:11: (lv_unit_7_0= RULE_STRING )
            	            // InternalDomainModelsDatasheet.g:288:12: lv_unit_7_0= RULE_STRING
            	            {
            	            lv_unit_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	            												newLeafNode(lv_unit_7_0, grammarAccess.getDatasheetPropertyAccess().getUnitSTRINGTerminalRuleCall_3_0_2_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getDatasheetPropertyRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"unit",
            	            													lv_unit_7_0,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomainModelsDatasheet.g:311:4: ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:311:4: ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:312:5: {...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalDomainModelsDatasheet.g:312:114: ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:313:6: ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalDomainModelsDatasheet.g:316:9: ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) )
            	    // InternalDomainModelsDatasheet.g:316:10: {...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:316:19: (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) )
            	    // InternalDomainModelsDatasheet.g:316:20: otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,17,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getDatasheetPropertyAccess().getShortDescriptionKeyword_3_1_0());
            	    								
            	    // InternalDomainModelsDatasheet.g:320:9: ( (lv_shortDescription_9_0= RULE_STRING ) )
            	    // InternalDomainModelsDatasheet.g:321:10: (lv_shortDescription_9_0= RULE_STRING )
            	    {
            	    // InternalDomainModelsDatasheet.g:321:10: (lv_shortDescription_9_0= RULE_STRING )
            	    // InternalDomainModelsDatasheet.g:322:11: lv_shortDescription_9_0= RULE_STRING
            	    {
            	    lv_shortDescription_9_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    											newLeafNode(lv_shortDescription_9_0, grammarAccess.getDatasheetPropertyAccess().getShortDescriptionSTRINGTerminalRuleCall_3_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDatasheetPropertyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"shortDescription",
            	    												lv_shortDescription_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDomainModelsDatasheet.g:344:4: ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalDomainModelsDatasheet.g:344:4: ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:345:5: {...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalDomainModelsDatasheet.g:345:114: ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) )
            	    // InternalDomainModelsDatasheet.g:346:6: ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalDomainModelsDatasheet.g:349:9: ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) )
            	    // InternalDomainModelsDatasheet.g:349:10: {...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "true");
            	    }
            	    // InternalDomainModelsDatasheet.g:349:19: (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) )
            	    // InternalDomainModelsDatasheet.g:349:20: otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,18,FOLLOW_9); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDatasheetPropertyAccess().getSemanticIDKeyword_3_2_0());
            	    								
            	    // InternalDomainModelsDatasheet.g:353:9: ( (lv_semanticID_11_0= RULE_STRING ) )
            	    // InternalDomainModelsDatasheet.g:354:10: (lv_semanticID_11_0= RULE_STRING )
            	    {
            	    // InternalDomainModelsDatasheet.g:354:10: (lv_semanticID_11_0= RULE_STRING )
            	    // InternalDomainModelsDatasheet.g:355:11: lv_semanticID_11_0= RULE_STRING
            	    {
            	    lv_semanticID_11_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    											newLeafNode(lv_semanticID_11_0, grammarAccess.getDatasheetPropertyAccess().getSemanticIDSTRINGTerminalRuleCall_3_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDatasheetPropertyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"semanticID",
            	    												lv_semanticID_11_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canLeave(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
            				

            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDatasheetPropertyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDatasheetProperty"


    // $ANTLR start "entryRuleMandatoryDatasheetElement"
    // InternalDomainModelsDatasheet.g:393:1: entryRuleMandatoryDatasheetElement returns [EObject current=null] : iv_ruleMandatoryDatasheetElement= ruleMandatoryDatasheetElement EOF ;
    public final EObject entryRuleMandatoryDatasheetElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryDatasheetElement = null;


        try {
            // InternalDomainModelsDatasheet.g:393:66: (iv_ruleMandatoryDatasheetElement= ruleMandatoryDatasheetElement EOF )
            // InternalDomainModelsDatasheet.g:394:2: iv_ruleMandatoryDatasheetElement= ruleMandatoryDatasheetElement EOF
            {
             newCompositeNode(grammarAccess.getMandatoryDatasheetElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMandatoryDatasheetElement=ruleMandatoryDatasheetElement();

            state._fsp--;

             current =iv_ruleMandatoryDatasheetElement; 
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
    // $ANTLR end "entryRuleMandatoryDatasheetElement"


    // $ANTLR start "ruleMandatoryDatasheetElement"
    // InternalDomainModelsDatasheet.g:400:1: ruleMandatoryDatasheetElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMandatoryDatasheetElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalDomainModelsDatasheet.g:406:2: ( ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalDomainModelsDatasheet.g:407:2: ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalDomainModelsDatasheet.g:407:2: ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalDomainModelsDatasheet.g:408:3: ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalDomainModelsDatasheet.g:408:3: ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) )
            // InternalDomainModelsDatasheet.g:409:4: (lv_name_0_0= ruleMandatoryDatasheetElementNames )
            {
            // InternalDomainModelsDatasheet.g:409:4: (lv_name_0_0= ruleMandatoryDatasheetElementNames )
            // InternalDomainModelsDatasheet.g:410:5: lv_name_0_0= ruleMandatoryDatasheetElementNames
            {

            					newCompositeNode(grammarAccess.getMandatoryDatasheetElementAccess().getNameMandatoryDatasheetElementNamesEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleMandatoryDatasheetElementNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMandatoryDatasheetElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.base.genericDatasheet.GenericDatasheet.MandatoryDatasheetElementNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainModelsDatasheet.g:427:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalDomainModelsDatasheet.g:428:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalDomainModelsDatasheet.g:428:4: (lv_value_1_0= RULE_STRING )
            // InternalDomainModelsDatasheet.g:429:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getMandatoryDatasheetElementAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMandatoryDatasheetElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleMandatoryDatasheetElement"


    // $ANTLR start "ruleMandatoryDatasheetElementNames"
    // InternalDomainModelsDatasheet.g:449:1: ruleMandatoryDatasheetElementNames returns [Enumerator current=null] : ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) ) ;
    public final Enumerator ruleMandatoryDatasheetElementNames() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDomainModelsDatasheet.g:455:2: ( ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) ) )
            // InternalDomainModelsDatasheet.g:456:2: ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) )
            {
            // InternalDomainModelsDatasheet.g:456:2: ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:457:3: (enumLiteral_0= 'BaseURI' )
                    {
                    // InternalDomainModelsDatasheet.g:457:3: (enumLiteral_0= 'BaseURI' )
                    // InternalDomainModelsDatasheet.g:458:4: enumLiteral_0= 'BaseURI'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainModelsDatasheet.g:465:3: (enumLiteral_1= 'ShortDescription' )
                    {
                    // InternalDomainModelsDatasheet.g:465:3: (enumLiteral_1= 'ShortDescription' )
                    // InternalDomainModelsDatasheet.g:466:4: enumLiteral_1= 'ShortDescription'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getMandatoryDatasheetElementNamesAccess().getShortDescriptionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMandatoryDatasheetElementNamesAccess().getShortDescriptionEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMandatoryDatasheetElementNames"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000186000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000184002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000006A000L});

}
