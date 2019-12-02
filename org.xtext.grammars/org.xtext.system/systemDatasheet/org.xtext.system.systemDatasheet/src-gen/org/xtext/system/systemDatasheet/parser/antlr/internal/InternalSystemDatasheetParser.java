package org.xtext.system.systemDatasheet.parser.antlr.internal;

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
import org.xtext.system.systemDatasheet.services.SystemDatasheetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSystemDatasheetParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SystemDatasheet'", "'{'", "'}'", "'DatasheetProperty'", "'value'", "'unit'", "'shortDescription'", "'semanticID'", "'BaseURI'", "'ShortDescription'"
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


        public InternalSystemDatasheetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSystemDatasheetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSystemDatasheetParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSystemDatasheet.g"; }



     	private SystemDatasheetGrammarAccess grammarAccess;

        public InternalSystemDatasheetParser(TokenStream input, SystemDatasheetGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SystemDatasheet";
       	}

       	@Override
       	protected SystemDatasheetGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystemDatasheet"
    // InternalSystemDatasheet.g:80:1: entryRuleSystemDatasheet returns [EObject current=null] : iv_ruleSystemDatasheet= ruleSystemDatasheet EOF ;
    public final EObject entryRuleSystemDatasheet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDatasheet = null;


        try {
            // InternalSystemDatasheet.g:80:56: (iv_ruleSystemDatasheet= ruleSystemDatasheet EOF )
            // InternalSystemDatasheet.g:81:2: iv_ruleSystemDatasheet= ruleSystemDatasheet EOF
            {
             newCompositeNode(grammarAccess.getSystemDatasheetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemDatasheet=ruleSystemDatasheet();

            state._fsp--;

             current =iv_ruleSystemDatasheet; 
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
    // $ANTLR end "entryRuleSystemDatasheet"


    // $ANTLR start "ruleSystemDatasheet"
    // InternalSystemDatasheet.g:87:1: ruleSystemDatasheet returns [EObject current=null] : ( () otherlv_1= 'SystemDatasheet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' this_GenericDatasheetModel_4= ruleGenericDatasheetModel[$current] otherlv_5= '}' ) ;
    public final EObject ruleSystemDatasheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_GenericDatasheetModel_4 = null;



        	enterRule();

        try {
            // InternalSystemDatasheet.g:93:2: ( ( () otherlv_1= 'SystemDatasheet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' this_GenericDatasheetModel_4= ruleGenericDatasheetModel[$current] otherlv_5= '}' ) )
            // InternalSystemDatasheet.g:94:2: ( () otherlv_1= 'SystemDatasheet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' this_GenericDatasheetModel_4= ruleGenericDatasheetModel[$current] otherlv_5= '}' )
            {
            // InternalSystemDatasheet.g:94:2: ( () otherlv_1= 'SystemDatasheet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' this_GenericDatasheetModel_4= ruleGenericDatasheetModel[$current] otherlv_5= '}' )
            // InternalSystemDatasheet.g:95:3: () otherlv_1= 'SystemDatasheet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' this_GenericDatasheetModel_4= ruleGenericDatasheetModel[$current] otherlv_5= '}'
            {
            // InternalSystemDatasheet.g:95:3: ()
            // InternalSystemDatasheet.g:96:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemDatasheetAccess().getSystemDatasheetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemDatasheetAccess().getSystemDatasheetKeyword_1());
            		
            // InternalSystemDatasheet.g:106:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSystemDatasheet.g:107:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSystemDatasheet.g:107:4: (lv_name_2_0= RULE_ID )
            // InternalSystemDatasheet.g:108:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSystemDatasheetAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemDatasheetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemDatasheetAccess().getLeftCurlyBracketKeyword_3());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getSystemDatasheetRule());
            			}
            			newCompositeNode(grammarAccess.getSystemDatasheetAccess().getGenericDatasheetModelParserRuleCall_4());
            		
            pushFollow(FOLLOW_6);
            this_GenericDatasheetModel_4=ruleGenericDatasheetModel(current);

            state._fsp--;


            			current = this_GenericDatasheetModel_4;
            			afterParserOrEnumRuleCall();
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemDatasheetAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSystemDatasheet"


    // $ANTLR start "ruleGenericDatasheetModel"
    // InternalSystemDatasheet.g:148:1: ruleGenericDatasheetModel[EObject in_current] returns [EObject current=in_current] : ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )* ;
    public final EObject ruleGenericDatasheetModel(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalSystemDatasheet.g:154:2: ( ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )* )
            // InternalSystemDatasheet.g:155:2: ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )*
            {
            // InternalSystemDatasheet.g:155:2: ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSystemDatasheet.g:156:3: (lv_elements_0_0= ruleAbstractDatasheetElement )
            	    {
            	    // InternalSystemDatasheet.g:156:3: (lv_elements_0_0= ruleAbstractDatasheetElement )
            	    // InternalSystemDatasheet.g:157:4: lv_elements_0_0= ruleAbstractDatasheetElement
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
    // InternalSystemDatasheet.g:177:1: entryRuleAbstractDatasheetElement returns [EObject current=null] : iv_ruleAbstractDatasheetElement= ruleAbstractDatasheetElement EOF ;
    public final EObject entryRuleAbstractDatasheetElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDatasheetElement = null;


        try {
            // InternalSystemDatasheet.g:177:65: (iv_ruleAbstractDatasheetElement= ruleAbstractDatasheetElement EOF )
            // InternalSystemDatasheet.g:178:2: iv_ruleAbstractDatasheetElement= ruleAbstractDatasheetElement EOF
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
    // InternalSystemDatasheet.g:184:1: ruleAbstractDatasheetElement returns [EObject current=null] : (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement ) ;
    public final EObject ruleAbstractDatasheetElement() throws RecognitionException {
        EObject current = null;

        EObject this_DatasheetProperty_0 = null;

        EObject this_MandatoryDatasheetElement_1 = null;



        	enterRule();

        try {
            // InternalSystemDatasheet.g:190:2: ( (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement ) )
            // InternalSystemDatasheet.g:191:2: (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement )
            {
            // InternalSystemDatasheet.g:191:2: (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement )
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
                    // InternalSystemDatasheet.g:192:3: this_DatasheetProperty_0= ruleDatasheetProperty
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
                    // InternalSystemDatasheet.g:201:3: this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement
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
    // InternalSystemDatasheet.g:213:1: entryRuleDatasheetProperty returns [EObject current=null] : iv_ruleDatasheetProperty= ruleDatasheetProperty EOF ;
    public final EObject entryRuleDatasheetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasheetProperty = null;


        try {
            // InternalSystemDatasheet.g:213:58: (iv_ruleDatasheetProperty= ruleDatasheetProperty EOF )
            // InternalSystemDatasheet.g:214:2: iv_ruleDatasheetProperty= ruleDatasheetProperty EOF
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
    // InternalSystemDatasheet.g:220:1: ruleDatasheetProperty returns [EObject current=null] : (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
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
            // InternalSystemDatasheet.g:226:2: ( (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalSystemDatasheet.g:227:2: (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalSystemDatasheet.g:227:2: (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalSystemDatasheet.g:228:3: otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasheetPropertyAccess().getDatasheetPropertyKeyword_0());
            		
            // InternalSystemDatasheet.g:232:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSystemDatasheet.g:233:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSystemDatasheet.g:233:4: (lv_name_1_0= RULE_ID )
            // InternalSystemDatasheet.g:234:5: lv_name_1_0= RULE_ID
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
            		
            // InternalSystemDatasheet.g:254:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalSystemDatasheet.g:255:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalSystemDatasheet.g:255:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalSystemDatasheet.g:256:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
            				
            // InternalSystemDatasheet.g:259:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalSystemDatasheet.g:260:6: ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalSystemDatasheet.g:260:6: ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+
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
            	    // InternalSystemDatasheet.g:261:4: ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // InternalSystemDatasheet.g:261:4: ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) )
            	    // InternalSystemDatasheet.g:262:5: {...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalSystemDatasheet.g:262:114: ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) )
            	    // InternalSystemDatasheet.g:263:6: ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalSystemDatasheet.g:266:9: ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) )
            	    // InternalSystemDatasheet.g:266:10: {...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "true");
            	    }
            	    // InternalSystemDatasheet.g:266:19: (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? )
            	    // InternalSystemDatasheet.g:266:20: otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )?
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getDatasheetPropertyAccess().getValueKeyword_3_0_0());
            	    								
            	    // InternalSystemDatasheet.g:270:9: ( (lv_value_5_0= RULE_STRING ) )
            	    // InternalSystemDatasheet.g:271:10: (lv_value_5_0= RULE_STRING )
            	    {
            	    // InternalSystemDatasheet.g:271:10: (lv_value_5_0= RULE_STRING )
            	    // InternalSystemDatasheet.g:272:11: lv_value_5_0= RULE_STRING
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

            	    // InternalSystemDatasheet.g:288:9: (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==16) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalSystemDatasheet.g:289:10: otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) )
            	            {
            	            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            	            										newLeafNode(otherlv_6, grammarAccess.getDatasheetPropertyAccess().getUnitKeyword_3_0_2_0());
            	            									
            	            // InternalSystemDatasheet.g:293:10: ( (lv_unit_7_0= RULE_STRING ) )
            	            // InternalSystemDatasheet.g:294:11: (lv_unit_7_0= RULE_STRING )
            	            {
            	            // InternalSystemDatasheet.g:294:11: (lv_unit_7_0= RULE_STRING )
            	            // InternalSystemDatasheet.g:295:12: lv_unit_7_0= RULE_STRING
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
            	    // InternalSystemDatasheet.g:318:4: ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalSystemDatasheet.g:318:4: ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalSystemDatasheet.g:319:5: {...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalSystemDatasheet.g:319:114: ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) )
            	    // InternalSystemDatasheet.g:320:6: ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalSystemDatasheet.g:323:9: ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) )
            	    // InternalSystemDatasheet.g:323:10: {...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "true");
            	    }
            	    // InternalSystemDatasheet.g:323:19: (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) )
            	    // InternalSystemDatasheet.g:323:20: otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,17,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getDatasheetPropertyAccess().getShortDescriptionKeyword_3_1_0());
            	    								
            	    // InternalSystemDatasheet.g:327:9: ( (lv_shortDescription_9_0= RULE_STRING ) )
            	    // InternalSystemDatasheet.g:328:10: (lv_shortDescription_9_0= RULE_STRING )
            	    {
            	    // InternalSystemDatasheet.g:328:10: (lv_shortDescription_9_0= RULE_STRING )
            	    // InternalSystemDatasheet.g:329:11: lv_shortDescription_9_0= RULE_STRING
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
            	    // InternalSystemDatasheet.g:351:4: ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalSystemDatasheet.g:351:4: ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) )
            	    // InternalSystemDatasheet.g:352:5: {...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalSystemDatasheet.g:352:114: ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) )
            	    // InternalSystemDatasheet.g:353:6: ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalSystemDatasheet.g:356:9: ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) )
            	    // InternalSystemDatasheet.g:356:10: {...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "true");
            	    }
            	    // InternalSystemDatasheet.g:356:19: (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) )
            	    // InternalSystemDatasheet.g:356:20: otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,18,FOLLOW_9); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDatasheetPropertyAccess().getSemanticIDKeyword_3_2_0());
            	    								
            	    // InternalSystemDatasheet.g:360:9: ( (lv_semanticID_11_0= RULE_STRING ) )
            	    // InternalSystemDatasheet.g:361:10: (lv_semanticID_11_0= RULE_STRING )
            	    {
            	    // InternalSystemDatasheet.g:361:10: (lv_semanticID_11_0= RULE_STRING )
            	    // InternalSystemDatasheet.g:362:11: lv_semanticID_11_0= RULE_STRING
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
    // InternalSystemDatasheet.g:400:1: entryRuleMandatoryDatasheetElement returns [EObject current=null] : iv_ruleMandatoryDatasheetElement= ruleMandatoryDatasheetElement EOF ;
    public final EObject entryRuleMandatoryDatasheetElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryDatasheetElement = null;


        try {
            // InternalSystemDatasheet.g:400:66: (iv_ruleMandatoryDatasheetElement= ruleMandatoryDatasheetElement EOF )
            // InternalSystemDatasheet.g:401:2: iv_ruleMandatoryDatasheetElement= ruleMandatoryDatasheetElement EOF
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
    // InternalSystemDatasheet.g:407:1: ruleMandatoryDatasheetElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMandatoryDatasheetElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSystemDatasheet.g:413:2: ( ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalSystemDatasheet.g:414:2: ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalSystemDatasheet.g:414:2: ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalSystemDatasheet.g:415:3: ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalSystemDatasheet.g:415:3: ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) )
            // InternalSystemDatasheet.g:416:4: (lv_name_0_0= ruleMandatoryDatasheetElementNames )
            {
            // InternalSystemDatasheet.g:416:4: (lv_name_0_0= ruleMandatoryDatasheetElementNames )
            // InternalSystemDatasheet.g:417:5: lv_name_0_0= ruleMandatoryDatasheetElementNames
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

            // InternalSystemDatasheet.g:434:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalSystemDatasheet.g:435:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalSystemDatasheet.g:435:4: (lv_value_1_0= RULE_STRING )
            // InternalSystemDatasheet.g:436:5: lv_value_1_0= RULE_STRING
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
    // InternalSystemDatasheet.g:456:1: ruleMandatoryDatasheetElementNames returns [Enumerator current=null] : ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) ) ;
    public final Enumerator ruleMandatoryDatasheetElementNames() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSystemDatasheet.g:462:2: ( ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) ) )
            // InternalSystemDatasheet.g:463:2: ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) )
            {
            // InternalSystemDatasheet.g:463:2: ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) )
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
                    // InternalSystemDatasheet.g:464:3: (enumLiteral_0= 'BaseURI' )
                    {
                    // InternalSystemDatasheet.g:464:3: (enumLiteral_0= 'BaseURI' )
                    // InternalSystemDatasheet.g:465:4: enumLiteral_0= 'BaseURI'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemDatasheet.g:472:3: (enumLiteral_1= 'ShortDescription' )
                    {
                    // InternalSystemDatasheet.g:472:3: (enumLiteral_1= 'ShortDescription' )
                    // InternalSystemDatasheet.g:473:4: enumLiteral_1= 'ShortDescription'
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
