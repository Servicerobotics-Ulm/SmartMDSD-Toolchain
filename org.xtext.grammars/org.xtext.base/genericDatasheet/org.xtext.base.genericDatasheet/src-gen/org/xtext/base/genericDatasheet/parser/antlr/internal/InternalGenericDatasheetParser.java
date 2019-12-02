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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DatasheetProperty'", "'{'", "'value'", "'unit'", "'shortDescription'", "'semanticID'", "'}'", "'BaseURI'", "'ShortDescription'"
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
        	return "GenericDatasheetModel";
       	}

       	@Override
       	protected GenericDatasheetGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "ruleGenericDatasheetModel"
    // InternalGenericDatasheet.g:81:1: ruleGenericDatasheetModel[EObject in_current] returns [EObject current=in_current] : ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )* ;
    public final EObject ruleGenericDatasheetModel(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalGenericDatasheet.g:87:2: ( ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )* )
            // InternalGenericDatasheet.g:88:2: ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )*
            {
            // InternalGenericDatasheet.g:88:2: ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGenericDatasheet.g:89:3: (lv_elements_0_0= ruleAbstractDatasheetElement )
            	    {
            	    // InternalGenericDatasheet.g:89:3: (lv_elements_0_0= ruleAbstractDatasheetElement )
            	    // InternalGenericDatasheet.g:90:4: lv_elements_0_0= ruleAbstractDatasheetElement
            	    {

            	    				newCompositeNode(grammarAccess.getGenericDatasheetModelAccess().getElementsAbstractDatasheetElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_1);
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
    // InternalGenericDatasheet.g:110:1: entryRuleAbstractDatasheetElement returns [EObject current=null] : iv_ruleAbstractDatasheetElement= ruleAbstractDatasheetElement EOF ;
    public final EObject entryRuleAbstractDatasheetElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDatasheetElement = null;


        try {
            // InternalGenericDatasheet.g:110:65: (iv_ruleAbstractDatasheetElement= ruleAbstractDatasheetElement EOF )
            // InternalGenericDatasheet.g:111:2: iv_ruleAbstractDatasheetElement= ruleAbstractDatasheetElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractDatasheetElementRule()); 
            pushFollow(FOLLOW_2);
            iv_ruleAbstractDatasheetElement=ruleAbstractDatasheetElement();

            state._fsp--;

             current =iv_ruleAbstractDatasheetElement; 
            match(input,EOF,FOLLOW_3); 

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
    // InternalGenericDatasheet.g:117:1: ruleAbstractDatasheetElement returns [EObject current=null] : (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement ) ;
    public final EObject ruleAbstractDatasheetElement() throws RecognitionException {
        EObject current = null;

        EObject this_DatasheetProperty_0 = null;

        EObject this_MandatoryDatasheetElement_1 = null;



        	enterRule();

        try {
            // InternalGenericDatasheet.g:123:2: ( (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement ) )
            // InternalGenericDatasheet.g:124:2: (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement )
            {
            // InternalGenericDatasheet.g:124:2: (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=18 && LA2_0<=19)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGenericDatasheet.g:125:3: this_DatasheetProperty_0= ruleDatasheetProperty
                    {

                    			newCompositeNode(grammarAccess.getAbstractDatasheetElementAccess().getDatasheetPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_3);
                    this_DatasheetProperty_0=ruleDatasheetProperty();

                    state._fsp--;


                    			current = this_DatasheetProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGenericDatasheet.g:134:3: this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement
                    {

                    			newCompositeNode(grammarAccess.getAbstractDatasheetElementAccess().getMandatoryDatasheetElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_3);
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
    // InternalGenericDatasheet.g:146:1: entryRuleDatasheetProperty returns [EObject current=null] : iv_ruleDatasheetProperty= ruleDatasheetProperty EOF ;
    public final EObject entryRuleDatasheetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasheetProperty = null;


        try {
            // InternalGenericDatasheet.g:146:58: (iv_ruleDatasheetProperty= ruleDatasheetProperty EOF )
            // InternalGenericDatasheet.g:147:2: iv_ruleDatasheetProperty= ruleDatasheetProperty EOF
            {
             newCompositeNode(grammarAccess.getDatasheetPropertyRule()); 
            pushFollow(FOLLOW_2);
            iv_ruleDatasheetProperty=ruleDatasheetProperty();

            state._fsp--;

             current =iv_ruleDatasheetProperty; 
            match(input,EOF,FOLLOW_3); 

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
    // InternalGenericDatasheet.g:153:1: ruleDatasheetProperty returns [EObject current=null] : (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
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
            // InternalGenericDatasheet.g:159:2: ( (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalGenericDatasheet.g:160:2: (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalGenericDatasheet.g:160:2: (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalGenericDatasheet.g:161:3: otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasheetPropertyAccess().getDatasheetPropertyKeyword_0());
            		
            // InternalGenericDatasheet.g:165:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGenericDatasheet.g:166:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGenericDatasheet.g:166:4: (lv_name_1_0= RULE_ID )
            // InternalGenericDatasheet.g:167:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasheetPropertyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGenericDatasheet.g:187:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalGenericDatasheet.g:188:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalGenericDatasheet.g:188:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalGenericDatasheet.g:189:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
            				
            // InternalGenericDatasheet.g:192:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalGenericDatasheet.g:193:6: ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalGenericDatasheet.g:193:6: ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=4;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                    alt4=2;
                }
                else if ( LA4_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                    alt4=3;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGenericDatasheet.g:194:4: ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:194:4: ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) )
            	    // InternalGenericDatasheet.g:195:5: {...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalGenericDatasheet.g:195:114: ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) )
            	    // InternalGenericDatasheet.g:196:6: ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalGenericDatasheet.g:199:9: ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) )
            	    // InternalGenericDatasheet.g:199:10: {...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "true");
            	    }
            	    // InternalGenericDatasheet.g:199:19: (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? )
            	    // InternalGenericDatasheet.g:199:20: otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )?
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_7); 

            	    									newLeafNode(otherlv_4, grammarAccess.getDatasheetPropertyAccess().getValueKeyword_3_0_0());
            	    								
            	    // InternalGenericDatasheet.g:203:9: ( (lv_value_5_0= RULE_STRING ) )
            	    // InternalGenericDatasheet.g:204:10: (lv_value_5_0= RULE_STRING )
            	    {
            	    // InternalGenericDatasheet.g:204:10: (lv_value_5_0= RULE_STRING )
            	    // InternalGenericDatasheet.g:205:11: lv_value_5_0= RULE_STRING
            	    {
            	    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            	    // InternalGenericDatasheet.g:221:9: (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==14) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalGenericDatasheet.g:222:10: otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) )
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            	            										newLeafNode(otherlv_6, grammarAccess.getDatasheetPropertyAccess().getUnitKeyword_3_0_2_0());
            	            									
            	            // InternalGenericDatasheet.g:226:10: ( (lv_unit_7_0= RULE_STRING ) )
            	            // InternalGenericDatasheet.g:227:11: (lv_unit_7_0= RULE_STRING )
            	            {
            	            // InternalGenericDatasheet.g:227:11: (lv_unit_7_0= RULE_STRING )
            	            // InternalGenericDatasheet.g:228:12: lv_unit_7_0= RULE_STRING
            	            {
            	            lv_unit_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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
            	    // InternalGenericDatasheet.g:251:4: ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:251:4: ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalGenericDatasheet.g:252:5: {...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalGenericDatasheet.g:252:114: ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) )
            	    // InternalGenericDatasheet.g:253:6: ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalGenericDatasheet.g:256:9: ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) )
            	    // InternalGenericDatasheet.g:256:10: {...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "true");
            	    }
            	    // InternalGenericDatasheet.g:256:19: (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) )
            	    // InternalGenericDatasheet.g:256:20: otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

            	    									newLeafNode(otherlv_8, grammarAccess.getDatasheetPropertyAccess().getShortDescriptionKeyword_3_1_0());
            	    								
            	    // InternalGenericDatasheet.g:260:9: ( (lv_shortDescription_9_0= RULE_STRING ) )
            	    // InternalGenericDatasheet.g:261:10: (lv_shortDescription_9_0= RULE_STRING )
            	    {
            	    // InternalGenericDatasheet.g:261:10: (lv_shortDescription_9_0= RULE_STRING )
            	    // InternalGenericDatasheet.g:262:11: lv_shortDescription_9_0= RULE_STRING
            	    {
            	    lv_shortDescription_9_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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
            	    // InternalGenericDatasheet.g:284:4: ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalGenericDatasheet.g:284:4: ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) )
            	    // InternalGenericDatasheet.g:285:5: {...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalGenericDatasheet.g:285:114: ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) )
            	    // InternalGenericDatasheet.g:286:6: ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalGenericDatasheet.g:289:9: ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) )
            	    // InternalGenericDatasheet.g:289:10: {...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "true");
            	    }
            	    // InternalGenericDatasheet.g:289:19: (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) )
            	    // InternalGenericDatasheet.g:289:20: otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_7); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDatasheetPropertyAccess().getSemanticIDKeyword_3_2_0());
            	    								
            	    // InternalGenericDatasheet.g:293:9: ( (lv_semanticID_11_0= RULE_STRING ) )
            	    // InternalGenericDatasheet.g:294:10: (lv_semanticID_11_0= RULE_STRING )
            	    {
            	    // InternalGenericDatasheet.g:294:10: (lv_semanticID_11_0= RULE_STRING )
            	    // InternalGenericDatasheet.g:295:11: lv_semanticID_11_0= RULE_STRING
            	    {
            	    lv_semanticID_11_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_12=(Token)match(input,17,FOLLOW_3); 

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
    // InternalGenericDatasheet.g:333:1: entryRuleMandatoryDatasheetElement returns [EObject current=null] : iv_ruleMandatoryDatasheetElement= ruleMandatoryDatasheetElement EOF ;
    public final EObject entryRuleMandatoryDatasheetElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryDatasheetElement = null;


        try {
            // InternalGenericDatasheet.g:333:66: (iv_ruleMandatoryDatasheetElement= ruleMandatoryDatasheetElement EOF )
            // InternalGenericDatasheet.g:334:2: iv_ruleMandatoryDatasheetElement= ruleMandatoryDatasheetElement EOF
            {
             newCompositeNode(grammarAccess.getMandatoryDatasheetElementRule()); 
            pushFollow(FOLLOW_2);
            iv_ruleMandatoryDatasheetElement=ruleMandatoryDatasheetElement();

            state._fsp--;

             current =iv_ruleMandatoryDatasheetElement; 
            match(input,EOF,FOLLOW_3); 

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
    // InternalGenericDatasheet.g:340:1: ruleMandatoryDatasheetElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMandatoryDatasheetElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalGenericDatasheet.g:346:2: ( ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalGenericDatasheet.g:347:2: ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalGenericDatasheet.g:347:2: ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalGenericDatasheet.g:348:3: ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalGenericDatasheet.g:348:3: ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) )
            // InternalGenericDatasheet.g:349:4: (lv_name_0_0= ruleMandatoryDatasheetElementNames )
            {
            // InternalGenericDatasheet.g:349:4: (lv_name_0_0= ruleMandatoryDatasheetElementNames )
            // InternalGenericDatasheet.g:350:5: lv_name_0_0= ruleMandatoryDatasheetElementNames
            {

            					newCompositeNode(grammarAccess.getMandatoryDatasheetElementAccess().getNameMandatoryDatasheetElementNamesEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalGenericDatasheet.g:367:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalGenericDatasheet.g:368:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalGenericDatasheet.g:368:4: (lv_value_1_0= RULE_STRING )
            // InternalGenericDatasheet.g:369:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

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
    // InternalGenericDatasheet.g:389:1: ruleMandatoryDatasheetElementNames returns [Enumerator current=null] : ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) ) ;
    public final Enumerator ruleMandatoryDatasheetElementNames() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGenericDatasheet.g:395:2: ( ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) ) )
            // InternalGenericDatasheet.g:396:2: ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) )
            {
            // InternalGenericDatasheet.g:396:2: ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGenericDatasheet.g:397:3: (enumLiteral_0= 'BaseURI' )
                    {
                    // InternalGenericDatasheet.g:397:3: (enumLiteral_0= 'BaseURI' )
                    // InternalGenericDatasheet.g:398:4: enumLiteral_0= 'BaseURI'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_3); 

                    				current = grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenericDatasheet.g:405:3: (enumLiteral_1= 'ShortDescription' )
                    {
                    // InternalGenericDatasheet.g:405:3: (enumLiteral_1= 'ShortDescription' )
                    // InternalGenericDatasheet.g:406:4: enumLiteral_1= 'ShortDescription'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_3); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x00000000000C0802L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000003A000L});

}
