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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentDatasheet'", "'{'", "'}'", "'ComponentPortDatasheet'", "'DatasheetProperty'", "'value'", "'unit'", "'shortDescription'", "'semanticID'", "'BaseURI'", "'ShortDescription'"
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
    // InternalComponentDatasheet.g:80:1: entryRuleComponentDatasheet returns [EObject current=null] : iv_ruleComponentDatasheet= ruleComponentDatasheet EOF ;
    public final EObject entryRuleComponentDatasheet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentDatasheet = null;


        try {
            // InternalComponentDatasheet.g:80:59: (iv_ruleComponentDatasheet= ruleComponentDatasheet EOF )
            // InternalComponentDatasheet.g:81:2: iv_ruleComponentDatasheet= ruleComponentDatasheet EOF
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
    // InternalComponentDatasheet.g:87:1: ruleComponentDatasheet returns [EObject current=null] : (otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheetModel_3= ruleGenericDatasheetModel[$current] otherlv_4= '}' ) ;
    public final EObject ruleComponentDatasheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_GenericDatasheetModel_3 = null;



        	enterRule();

        try {
            // InternalComponentDatasheet.g:93:2: ( (otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheetModel_3= ruleGenericDatasheetModel[$current] otherlv_4= '}' ) )
            // InternalComponentDatasheet.g:94:2: (otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheetModel_3= ruleGenericDatasheetModel[$current] otherlv_4= '}' )
            {
            // InternalComponentDatasheet.g:94:2: (otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheetModel_3= ruleGenericDatasheetModel[$current] otherlv_4= '}' )
            // InternalComponentDatasheet.g:95:3: otherlv_0= 'ComponentDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' this_GenericDatasheetModel_3= ruleGenericDatasheetModel[$current] otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentDatasheetAccess().getComponentDatasheetKeyword_0());
            		
            // InternalComponentDatasheet.g:99:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentDatasheet.g:100:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentDatasheet.g:100:4: (otherlv_1= RULE_ID )
            // InternalComponentDatasheet.g:101:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentDatasheetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getComponentDatasheetAccess().getComponentComponentDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentDatasheetAccess().getLeftCurlyBracketKeyword_2());
            		

            			if (current==null) {
            				current = createModelElement(grammarAccess.getComponentDatasheetRule());
            			}
            			newCompositeNode(grammarAccess.getComponentDatasheetAccess().getGenericDatasheetModelParserRuleCall_3());
            		
            pushFollow(FOLLOW_6);
            this_GenericDatasheetModel_3=ruleGenericDatasheetModel(current);

            state._fsp--;


            			current = this_GenericDatasheetModel_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentDatasheetAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleAbstractDatasheetElement"
    // InternalComponentDatasheet.g:135:1: entryRuleAbstractDatasheetElement returns [EObject current=null] : iv_ruleAbstractDatasheetElement= ruleAbstractDatasheetElement EOF ;
    public final EObject entryRuleAbstractDatasheetElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDatasheetElement = null;


        try {
            // InternalComponentDatasheet.g:135:65: (iv_ruleAbstractDatasheetElement= ruleAbstractDatasheetElement EOF )
            // InternalComponentDatasheet.g:136:2: iv_ruleAbstractDatasheetElement= ruleAbstractDatasheetElement EOF
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
    // InternalComponentDatasheet.g:142:1: ruleAbstractDatasheetElement returns [EObject current=null] : (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement | this_ComponentPortDatasheet_2= ruleComponentPortDatasheet ) ;
    public final EObject ruleAbstractDatasheetElement() throws RecognitionException {
        EObject current = null;

        EObject this_DatasheetProperty_0 = null;

        EObject this_MandatoryDatasheetElement_1 = null;

        EObject this_ComponentPortDatasheet_2 = null;



        	enterRule();

        try {
            // InternalComponentDatasheet.g:148:2: ( (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement | this_ComponentPortDatasheet_2= ruleComponentPortDatasheet ) )
            // InternalComponentDatasheet.g:149:2: (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement | this_ComponentPortDatasheet_2= ruleComponentPortDatasheet )
            {
            // InternalComponentDatasheet.g:149:2: (this_DatasheetProperty_0= ruleDatasheetProperty | this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement | this_ComponentPortDatasheet_2= ruleComponentPortDatasheet )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 20:
            case 21:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalComponentDatasheet.g:150:3: this_DatasheetProperty_0= ruleDatasheetProperty
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
                    // InternalComponentDatasheet.g:159:3: this_MandatoryDatasheetElement_1= ruleMandatoryDatasheetElement
                    {

                    			newCompositeNode(grammarAccess.getAbstractDatasheetElementAccess().getMandatoryDatasheetElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MandatoryDatasheetElement_1=ruleMandatoryDatasheetElement();

                    state._fsp--;


                    			current = this_MandatoryDatasheetElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentDatasheet.g:168:3: this_ComponentPortDatasheet_2= ruleComponentPortDatasheet
                    {

                    			newCompositeNode(grammarAccess.getAbstractDatasheetElementAccess().getComponentPortDatasheetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentPortDatasheet_2=ruleComponentPortDatasheet();

                    state._fsp--;


                    			current = this_ComponentPortDatasheet_2;
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


    // $ANTLR start "entryRuleComponentPortDatasheet"
    // InternalComponentDatasheet.g:180:1: entryRuleComponentPortDatasheet returns [EObject current=null] : iv_ruleComponentPortDatasheet= ruleComponentPortDatasheet EOF ;
    public final EObject entryRuleComponentPortDatasheet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentPortDatasheet = null;


        try {
            // InternalComponentDatasheet.g:180:63: (iv_ruleComponentPortDatasheet= ruleComponentPortDatasheet EOF )
            // InternalComponentDatasheet.g:181:2: iv_ruleComponentPortDatasheet= ruleComponentPortDatasheet EOF
            {
             newCompositeNode(grammarAccess.getComponentPortDatasheetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentPortDatasheet=ruleComponentPortDatasheet();

            state._fsp--;

             current =iv_ruleComponentPortDatasheet; 
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
    // $ANTLR end "entryRuleComponentPortDatasheet"


    // $ANTLR start "ruleComponentPortDatasheet"
    // InternalComponentDatasheet.g:187:1: ruleComponentPortDatasheet returns [EObject current=null] : (otherlv_0= 'ComponentPortDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleDatasheetProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleComponentPortDatasheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalComponentDatasheet.g:193:2: ( (otherlv_0= 'ComponentPortDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleDatasheetProperty ) )* otherlv_4= '}' ) )
            // InternalComponentDatasheet.g:194:2: (otherlv_0= 'ComponentPortDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleDatasheetProperty ) )* otherlv_4= '}' )
            {
            // InternalComponentDatasheet.g:194:2: (otherlv_0= 'ComponentPortDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleDatasheetProperty ) )* otherlv_4= '}' )
            // InternalComponentDatasheet.g:195:3: otherlv_0= 'ComponentPortDatasheet' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleDatasheetProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentPortDatasheetAccess().getComponentPortDatasheetKeyword_0());
            		
            // InternalComponentDatasheet.g:199:3: ( (otherlv_1= RULE_ID ) )
            // InternalComponentDatasheet.g:200:4: (otherlv_1= RULE_ID )
            {
            // InternalComponentDatasheet.g:200:4: (otherlv_1= RULE_ID )
            // InternalComponentDatasheet.g:201:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentPortDatasheetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getComponentPortDatasheetAccess().getPortComponentPortCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentPortDatasheetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentDatasheet.g:216:3: ( (lv_properties_3_0= ruleDatasheetProperty ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComponentDatasheet.g:217:4: (lv_properties_3_0= ruleDatasheetProperty )
            	    {
            	    // InternalComponentDatasheet.g:217:4: (lv_properties_3_0= ruleDatasheetProperty )
            	    // InternalComponentDatasheet.g:218:5: lv_properties_3_0= ruleDatasheetProperty
            	    {

            	    					newCompositeNode(grammarAccess.getComponentPortDatasheetAccess().getPropertiesDatasheetPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_properties_3_0=ruleDatasheetProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentPortDatasheetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_3_0,
            	    						"org.xtext.base.genericDatasheet.GenericDatasheet.DatasheetProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentPortDatasheetAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleComponentPortDatasheet"


    // $ANTLR start "ruleGenericDatasheetModel"
    // InternalComponentDatasheet.g:244:1: ruleGenericDatasheetModel[EObject in_current] returns [EObject current=in_current] : ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )* ;
    public final EObject ruleGenericDatasheetModel(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalComponentDatasheet.g:250:2: ( ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )* )
            // InternalComponentDatasheet.g:251:2: ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )*
            {
            // InternalComponentDatasheet.g:251:2: ( (lv_elements_0_0= ruleAbstractDatasheetElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=14 && LA3_0<=15)||(LA3_0>=20 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComponentDatasheet.g:252:3: (lv_elements_0_0= ruleAbstractDatasheetElement )
            	    {
            	    // InternalComponentDatasheet.g:252:3: (lv_elements_0_0= ruleAbstractDatasheetElement )
            	    // InternalComponentDatasheet.g:253:4: lv_elements_0_0= ruleAbstractDatasheetElement
            	    {

            	    				newCompositeNode(grammarAccess.getGenericDatasheetModelAccess().getElementsAbstractDatasheetElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_8);
            	    lv_elements_0_0=ruleAbstractDatasheetElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getGenericDatasheetModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.component.componentDatasheet.ComponentDatasheet.AbstractDatasheetElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleDatasheetProperty"
    // InternalComponentDatasheet.g:273:1: entryRuleDatasheetProperty returns [EObject current=null] : iv_ruleDatasheetProperty= ruleDatasheetProperty EOF ;
    public final EObject entryRuleDatasheetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasheetProperty = null;


        try {
            // InternalComponentDatasheet.g:273:58: (iv_ruleDatasheetProperty= ruleDatasheetProperty EOF )
            // InternalComponentDatasheet.g:274:2: iv_ruleDatasheetProperty= ruleDatasheetProperty EOF
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
    // InternalComponentDatasheet.g:280:1: ruleDatasheetProperty returns [EObject current=null] : (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
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
            // InternalComponentDatasheet.g:286:2: ( (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalComponentDatasheet.g:287:2: (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalComponentDatasheet.g:287:2: (otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalComponentDatasheet.g:288:3: otherlv_0= 'DatasheetProperty' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatasheetPropertyAccess().getDatasheetPropertyKeyword_0());
            		
            // InternalComponentDatasheet.g:292:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalComponentDatasheet.g:293:4: (lv_name_1_0= RULE_ID )
            {
            // InternalComponentDatasheet.g:293:4: (lv_name_1_0= RULE_ID )
            // InternalComponentDatasheet.g:294:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDatasheetPropertyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentDatasheet.g:314:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalComponentDatasheet.g:315:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalComponentDatasheet.g:315:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalComponentDatasheet.g:316:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3());
            				
            // InternalComponentDatasheet.g:319:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalComponentDatasheet.g:320:6: ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalComponentDatasheet.g:320:6: ( ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
                int LA5_0 = input.LA(1);

                if ( LA5_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
                    alt5=3;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalComponentDatasheet.g:321:4: ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:321:4: ({...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) ) )
            	    // InternalComponentDatasheet.g:322:5: {...}? => ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalComponentDatasheet.g:322:114: ( ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) ) )
            	    // InternalComponentDatasheet.g:323:6: ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalComponentDatasheet.g:326:9: ({...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? ) )
            	    // InternalComponentDatasheet.g:326:10: {...}? => (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "true");
            	    }
            	    // InternalComponentDatasheet.g:326:19: (otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )? )
            	    // InternalComponentDatasheet.g:326:20: otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )?
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_10); 

            	    									newLeafNode(otherlv_4, grammarAccess.getDatasheetPropertyAccess().getValueKeyword_3_0_0());
            	    								
            	    // InternalComponentDatasheet.g:330:9: ( (lv_value_5_0= RULE_STRING ) )
            	    // InternalComponentDatasheet.g:331:10: (lv_value_5_0= RULE_STRING )
            	    {
            	    // InternalComponentDatasheet.g:331:10: (lv_value_5_0= RULE_STRING )
            	    // InternalComponentDatasheet.g:332:11: lv_value_5_0= RULE_STRING
            	    {
            	    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            	    // InternalComponentDatasheet.g:348:9: (otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) ) )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==17) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalComponentDatasheet.g:349:10: otherlv_6= 'unit' ( (lv_unit_7_0= RULE_STRING ) )
            	            {
            	            otherlv_6=(Token)match(input,17,FOLLOW_10); 

            	            										newLeafNode(otherlv_6, grammarAccess.getDatasheetPropertyAccess().getUnitKeyword_3_0_2_0());
            	            									
            	            // InternalComponentDatasheet.g:353:10: ( (lv_unit_7_0= RULE_STRING ) )
            	            // InternalComponentDatasheet.g:354:11: (lv_unit_7_0= RULE_STRING )
            	            {
            	            // InternalComponentDatasheet.g:354:11: (lv_unit_7_0= RULE_STRING )
            	            // InternalComponentDatasheet.g:355:12: lv_unit_7_0= RULE_STRING
            	            {
            	            lv_unit_7_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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
            	    // InternalComponentDatasheet.g:378:4: ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:378:4: ({...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:379:5: {...}? => ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalComponentDatasheet.g:379:114: ( ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) ) )
            	    // InternalComponentDatasheet.g:380:6: ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalComponentDatasheet.g:383:9: ({...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) ) )
            	    // InternalComponentDatasheet.g:383:10: {...}? => (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "true");
            	    }
            	    // InternalComponentDatasheet.g:383:19: (otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) ) )
            	    // InternalComponentDatasheet.g:383:20: otherlv_8= 'shortDescription' ( (lv_shortDescription_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FOLLOW_10); 

            	    									newLeafNode(otherlv_8, grammarAccess.getDatasheetPropertyAccess().getShortDescriptionKeyword_3_1_0());
            	    								
            	    // InternalComponentDatasheet.g:387:9: ( (lv_shortDescription_9_0= RULE_STRING ) )
            	    // InternalComponentDatasheet.g:388:10: (lv_shortDescription_9_0= RULE_STRING )
            	    {
            	    // InternalComponentDatasheet.g:388:10: (lv_shortDescription_9_0= RULE_STRING )
            	    // InternalComponentDatasheet.g:389:11: lv_shortDescription_9_0= RULE_STRING
            	    {
            	    lv_shortDescription_9_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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
            	    // InternalComponentDatasheet.g:411:4: ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalComponentDatasheet.g:411:4: ({...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) ) )
            	    // InternalComponentDatasheet.g:412:5: {...}? => ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalComponentDatasheet.g:412:114: ( ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) ) )
            	    // InternalComponentDatasheet.g:413:6: ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDatasheetPropertyAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalComponentDatasheet.g:416:9: ({...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) ) )
            	    // InternalComponentDatasheet.g:416:10: {...}? => (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDatasheetProperty", "true");
            	    }
            	    // InternalComponentDatasheet.g:416:19: (otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) ) )
            	    // InternalComponentDatasheet.g:416:20: otherlv_10= 'semanticID' ( (lv_semanticID_11_0= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_10); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDatasheetPropertyAccess().getSemanticIDKeyword_3_2_0());
            	    								
            	    // InternalComponentDatasheet.g:420:9: ( (lv_semanticID_11_0= RULE_STRING ) )
            	    // InternalComponentDatasheet.g:421:10: (lv_semanticID_11_0= RULE_STRING )
            	    {
            	    // InternalComponentDatasheet.g:421:10: (lv_semanticID_11_0= RULE_STRING )
            	    // InternalComponentDatasheet.g:422:11: lv_semanticID_11_0= RULE_STRING
            	    {
            	    lv_semanticID_11_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // InternalComponentDatasheet.g:460:1: entryRuleMandatoryDatasheetElement returns [EObject current=null] : iv_ruleMandatoryDatasheetElement= ruleMandatoryDatasheetElement EOF ;
    public final EObject entryRuleMandatoryDatasheetElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryDatasheetElement = null;


        try {
            // InternalComponentDatasheet.g:460:66: (iv_ruleMandatoryDatasheetElement= ruleMandatoryDatasheetElement EOF )
            // InternalComponentDatasheet.g:461:2: iv_ruleMandatoryDatasheetElement= ruleMandatoryDatasheetElement EOF
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
    // InternalComponentDatasheet.g:467:1: ruleMandatoryDatasheetElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMandatoryDatasheetElement() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalComponentDatasheet.g:473:2: ( ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalComponentDatasheet.g:474:2: ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalComponentDatasheet.g:474:2: ( ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalComponentDatasheet.g:475:3: ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalComponentDatasheet.g:475:3: ( (lv_name_0_0= ruleMandatoryDatasheetElementNames ) )
            // InternalComponentDatasheet.g:476:4: (lv_name_0_0= ruleMandatoryDatasheetElementNames )
            {
            // InternalComponentDatasheet.g:476:4: (lv_name_0_0= ruleMandatoryDatasheetElementNames )
            // InternalComponentDatasheet.g:477:5: lv_name_0_0= ruleMandatoryDatasheetElementNames
            {

            					newCompositeNode(grammarAccess.getMandatoryDatasheetElementAccess().getNameMandatoryDatasheetElementNamesEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalComponentDatasheet.g:494:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalComponentDatasheet.g:495:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalComponentDatasheet.g:495:4: (lv_value_1_0= RULE_STRING )
            // InternalComponentDatasheet.g:496:5: lv_value_1_0= RULE_STRING
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
    // InternalComponentDatasheet.g:516:1: ruleMandatoryDatasheetElementNames returns [Enumerator current=null] : ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) ) ;
    public final Enumerator ruleMandatoryDatasheetElementNames() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalComponentDatasheet.g:522:2: ( ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) ) )
            // InternalComponentDatasheet.g:523:2: ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) )
            {
            // InternalComponentDatasheet.g:523:2: ( (enumLiteral_0= 'BaseURI' ) | (enumLiteral_1= 'ShortDescription' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentDatasheet.g:524:3: (enumLiteral_0= 'BaseURI' )
                    {
                    // InternalComponentDatasheet.g:524:3: (enumLiteral_0= 'BaseURI' )
                    // InternalComponentDatasheet.g:525:4: enumLiteral_0= 'BaseURI'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMandatoryDatasheetElementNamesAccess().getBaseURIEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDatasheet.g:532:3: (enumLiteral_1= 'ShortDescription' )
                    {
                    // InternalComponentDatasheet.g:532:3: (enumLiteral_1= 'ShortDescription' )
                    // InternalComponentDatasheet.g:533:4: enumLiteral_1= 'ShortDescription'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000030E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000030C002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000F2000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000D2000L});

}
