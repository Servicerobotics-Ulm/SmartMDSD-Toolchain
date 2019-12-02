package org.xtext.system.datasheetPropertyChecks.parser.antlr.internal;

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
import org.xtext.system.datasheetPropertyChecks.services.SystemDatasheetPropertyChecksGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSystemDatasheetPropertyChecksParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SystemDatasheetPropertyChecksModel'", "'{'", "'}'", "';'", "'\\u2200'", "'\\u03A3'", "'\\u2203'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'compatible_to'"
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSystemDatasheetPropertyChecksParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSystemDatasheetPropertyChecksParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSystemDatasheetPropertyChecksParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSystemDatasheetPropertyChecks.g"; }



     	private SystemDatasheetPropertyChecksGrammarAccess grammarAccess;

        public InternalSystemDatasheetPropertyChecksParser(TokenStream input, SystemDatasheetPropertyChecksGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SystemDatasheetPropertyChecksModel";
       	}

       	@Override
       	protected SystemDatasheetPropertyChecksGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystemDatasheetPropertyChecksModel"
    // InternalSystemDatasheetPropertyChecks.g:80:1: entryRuleSystemDatasheetPropertyChecksModel returns [EObject current=null] : iv_ruleSystemDatasheetPropertyChecksModel= ruleSystemDatasheetPropertyChecksModel EOF ;
    public final EObject entryRuleSystemDatasheetPropertyChecksModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDatasheetPropertyChecksModel = null;


        try {
            // InternalSystemDatasheetPropertyChecks.g:80:75: (iv_ruleSystemDatasheetPropertyChecksModel= ruleSystemDatasheetPropertyChecksModel EOF )
            // InternalSystemDatasheetPropertyChecks.g:81:2: iv_ruleSystemDatasheetPropertyChecksModel= ruleSystemDatasheetPropertyChecksModel EOF
            {
             newCompositeNode(grammarAccess.getSystemDatasheetPropertyChecksModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemDatasheetPropertyChecksModel=ruleSystemDatasheetPropertyChecksModel();

            state._fsp--;

             current =iv_ruleSystemDatasheetPropertyChecksModel; 
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
    // $ANTLR end "entryRuleSystemDatasheetPropertyChecksModel"


    // $ANTLR start "ruleSystemDatasheetPropertyChecksModel"
    // InternalSystemDatasheetPropertyChecks.g:87:1: ruleSystemDatasheetPropertyChecksModel returns [EObject current=null] : (otherlv_0= 'SystemDatasheetPropertyChecksModel' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_checks_3_0= ruleDatasheetPropertyCheck ) )* otherlv_4= '}' ) ;
    public final EObject ruleSystemDatasheetPropertyChecksModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_checks_3_0 = null;



        	enterRule();

        try {
            // InternalSystemDatasheetPropertyChecks.g:93:2: ( (otherlv_0= 'SystemDatasheetPropertyChecksModel' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_checks_3_0= ruleDatasheetPropertyCheck ) )* otherlv_4= '}' ) )
            // InternalSystemDatasheetPropertyChecks.g:94:2: (otherlv_0= 'SystemDatasheetPropertyChecksModel' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_checks_3_0= ruleDatasheetPropertyCheck ) )* otherlv_4= '}' )
            {
            // InternalSystemDatasheetPropertyChecks.g:94:2: (otherlv_0= 'SystemDatasheetPropertyChecksModel' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_checks_3_0= ruleDatasheetPropertyCheck ) )* otherlv_4= '}' )
            // InternalSystemDatasheetPropertyChecks.g:95:3: otherlv_0= 'SystemDatasheetPropertyChecksModel' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_checks_3_0= ruleDatasheetPropertyCheck ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemDatasheetPropertyChecksModelKeyword_0());
            		
            // InternalSystemDatasheetPropertyChecks.g:99:3: ( (otherlv_1= RULE_ID ) )
            // InternalSystemDatasheetPropertyChecks.g:100:4: (otherlv_1= RULE_ID )
            {
            // InternalSystemDatasheetPropertyChecks.g:100:4: (otherlv_1= RULE_ID )
            // InternalSystemDatasheetPropertyChecks.g:101:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemDatasheetPropertyChecksModelRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getSystemSystemComponentArchitectureCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSystemDatasheetPropertyChecks.g:116:3: ( (lv_checks_3_0= ruleDatasheetPropertyCheck ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSystemDatasheetPropertyChecks.g:117:4: (lv_checks_3_0= ruleDatasheetPropertyCheck )
            	    {
            	    // InternalSystemDatasheetPropertyChecks.g:117:4: (lv_checks_3_0= ruleDatasheetPropertyCheck )
            	    // InternalSystemDatasheetPropertyChecks.g:118:5: lv_checks_3_0= ruleDatasheetPropertyCheck
            	    {

            	    					newCompositeNode(grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getChecksDatasheetPropertyCheckParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_checks_3_0=ruleDatasheetPropertyCheck();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemDatasheetPropertyChecksModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"checks",
            	    						lv_checks_3_0,
            	    						"org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecks.DatasheetPropertyCheck");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemDatasheetPropertyChecksModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSystemDatasheetPropertyChecksModel"


    // $ANTLR start "entryRuleDatasheetPropertyCheck"
    // InternalSystemDatasheetPropertyChecks.g:143:1: entryRuleDatasheetPropertyCheck returns [EObject current=null] : iv_ruleDatasheetPropertyCheck= ruleDatasheetPropertyCheck EOF ;
    public final EObject entryRuleDatasheetPropertyCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatasheetPropertyCheck = null;


        try {
            // InternalSystemDatasheetPropertyChecks.g:143:63: (iv_ruleDatasheetPropertyCheck= ruleDatasheetPropertyCheck EOF )
            // InternalSystemDatasheetPropertyChecks.g:144:2: iv_ruleDatasheetPropertyCheck= ruleDatasheetPropertyCheck EOF
            {
             newCompositeNode(grammarAccess.getDatasheetPropertyCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatasheetPropertyCheck=ruleDatasheetPropertyCheck();

            state._fsp--;

             current =iv_ruleDatasheetPropertyCheck; 
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
    // $ANTLR end "entryRuleDatasheetPropertyCheck"


    // $ANTLR start "ruleDatasheetPropertyCheck"
    // InternalSystemDatasheetPropertyChecks.g:150:1: ruleDatasheetPropertyCheck returns [EObject current=null] : ( () ( (lv_function_1_0= ruleEvaluationFunction ) ) ( (lv_propertyName_2_0= RULE_ID ) ) ( (lv_operator_3_0= ruleEvaluationOperator ) ) ( (lv_propertyValue_4_0= RULE_STRING ) ) ( (lv_propertyUnit_5_0= RULE_STRING ) )? (otherlv_6= ';' )? ) ;
    public final EObject ruleDatasheetPropertyCheck() throws RecognitionException {
        EObject current = null;

        Token lv_propertyName_2_0=null;
        Token lv_propertyValue_4_0=null;
        Token lv_propertyUnit_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_function_1_0 = null;

        Enumerator lv_operator_3_0 = null;



        	enterRule();

        try {
            // InternalSystemDatasheetPropertyChecks.g:156:2: ( ( () ( (lv_function_1_0= ruleEvaluationFunction ) ) ( (lv_propertyName_2_0= RULE_ID ) ) ( (lv_operator_3_0= ruleEvaluationOperator ) ) ( (lv_propertyValue_4_0= RULE_STRING ) ) ( (lv_propertyUnit_5_0= RULE_STRING ) )? (otherlv_6= ';' )? ) )
            // InternalSystemDatasheetPropertyChecks.g:157:2: ( () ( (lv_function_1_0= ruleEvaluationFunction ) ) ( (lv_propertyName_2_0= RULE_ID ) ) ( (lv_operator_3_0= ruleEvaluationOperator ) ) ( (lv_propertyValue_4_0= RULE_STRING ) ) ( (lv_propertyUnit_5_0= RULE_STRING ) )? (otherlv_6= ';' )? )
            {
            // InternalSystemDatasheetPropertyChecks.g:157:2: ( () ( (lv_function_1_0= ruleEvaluationFunction ) ) ( (lv_propertyName_2_0= RULE_ID ) ) ( (lv_operator_3_0= ruleEvaluationOperator ) ) ( (lv_propertyValue_4_0= RULE_STRING ) ) ( (lv_propertyUnit_5_0= RULE_STRING ) )? (otherlv_6= ';' )? )
            // InternalSystemDatasheetPropertyChecks.g:158:3: () ( (lv_function_1_0= ruleEvaluationFunction ) ) ( (lv_propertyName_2_0= RULE_ID ) ) ( (lv_operator_3_0= ruleEvaluationOperator ) ) ( (lv_propertyValue_4_0= RULE_STRING ) ) ( (lv_propertyUnit_5_0= RULE_STRING ) )? (otherlv_6= ';' )?
            {
            // InternalSystemDatasheetPropertyChecks.g:158:3: ()
            // InternalSystemDatasheetPropertyChecks.g:159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatasheetPropertyCheckAccess().getDatasheetPropertyCheckAction_0(),
            					current);
            			

            }

            // InternalSystemDatasheetPropertyChecks.g:165:3: ( (lv_function_1_0= ruleEvaluationFunction ) )
            // InternalSystemDatasheetPropertyChecks.g:166:4: (lv_function_1_0= ruleEvaluationFunction )
            {
            // InternalSystemDatasheetPropertyChecks.g:166:4: (lv_function_1_0= ruleEvaluationFunction )
            // InternalSystemDatasheetPropertyChecks.g:167:5: lv_function_1_0= ruleEvaluationFunction
            {

            					newCompositeNode(grammarAccess.getDatasheetPropertyCheckAccess().getFunctionEvaluationFunctionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_function_1_0=ruleEvaluationFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasheetPropertyCheckRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_1_0,
            						"org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecks.EvaluationFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystemDatasheetPropertyChecks.g:184:3: ( (lv_propertyName_2_0= RULE_ID ) )
            // InternalSystemDatasheetPropertyChecks.g:185:4: (lv_propertyName_2_0= RULE_ID )
            {
            // InternalSystemDatasheetPropertyChecks.g:185:4: (lv_propertyName_2_0= RULE_ID )
            // InternalSystemDatasheetPropertyChecks.g:186:5: lv_propertyName_2_0= RULE_ID
            {
            lv_propertyName_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_propertyName_2_0, grammarAccess.getDatasheetPropertyCheckAccess().getPropertyNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasheetPropertyCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"propertyName",
            						lv_propertyName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSystemDatasheetPropertyChecks.g:202:3: ( (lv_operator_3_0= ruleEvaluationOperator ) )
            // InternalSystemDatasheetPropertyChecks.g:203:4: (lv_operator_3_0= ruleEvaluationOperator )
            {
            // InternalSystemDatasheetPropertyChecks.g:203:4: (lv_operator_3_0= ruleEvaluationOperator )
            // InternalSystemDatasheetPropertyChecks.g:204:5: lv_operator_3_0= ruleEvaluationOperator
            {

            					newCompositeNode(grammarAccess.getDatasheetPropertyCheckAccess().getOperatorEvaluationOperatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_operator_3_0=ruleEvaluationOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatasheetPropertyCheckRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecks.EvaluationOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSystemDatasheetPropertyChecks.g:221:3: ( (lv_propertyValue_4_0= RULE_STRING ) )
            // InternalSystemDatasheetPropertyChecks.g:222:4: (lv_propertyValue_4_0= RULE_STRING )
            {
            // InternalSystemDatasheetPropertyChecks.g:222:4: (lv_propertyValue_4_0= RULE_STRING )
            // InternalSystemDatasheetPropertyChecks.g:223:5: lv_propertyValue_4_0= RULE_STRING
            {
            lv_propertyValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_propertyValue_4_0, grammarAccess.getDatasheetPropertyCheckAccess().getPropertyValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatasheetPropertyCheckRule());
            					}
            					setWithLastConsumed(
            						current,
            						"propertyValue",
            						lv_propertyValue_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSystemDatasheetPropertyChecks.g:239:3: ( (lv_propertyUnit_5_0= RULE_STRING ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSystemDatasheetPropertyChecks.g:240:4: (lv_propertyUnit_5_0= RULE_STRING )
                    {
                    // InternalSystemDatasheetPropertyChecks.g:240:4: (lv_propertyUnit_5_0= RULE_STRING )
                    // InternalSystemDatasheetPropertyChecks.g:241:5: lv_propertyUnit_5_0= RULE_STRING
                    {
                    lv_propertyUnit_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_propertyUnit_5_0, grammarAccess.getDatasheetPropertyCheckAccess().getPropertyUnitSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDatasheetPropertyCheckRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"propertyUnit",
                    						lv_propertyUnit_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalSystemDatasheetPropertyChecks.g:257:3: (otherlv_6= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSystemDatasheetPropertyChecks.g:258:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getDatasheetPropertyCheckAccess().getSemicolonKeyword_6());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleDatasheetPropertyCheck"


    // $ANTLR start "ruleEvaluationFunction"
    // InternalSystemDatasheetPropertyChecks.g:267:1: ruleEvaluationFunction returns [Enumerator current=null] : ( (enumLiteral_0= '\\u2200' ) | (enumLiteral_1= '\\u03A3' ) | (enumLiteral_2= '\\u2203' ) ) ;
    public final Enumerator ruleEvaluationFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalSystemDatasheetPropertyChecks.g:273:2: ( ( (enumLiteral_0= '\\u2200' ) | (enumLiteral_1= '\\u03A3' ) | (enumLiteral_2= '\\u2203' ) ) )
            // InternalSystemDatasheetPropertyChecks.g:274:2: ( (enumLiteral_0= '\\u2200' ) | (enumLiteral_1= '\\u03A3' ) | (enumLiteral_2= '\\u2203' ) )
            {
            // InternalSystemDatasheetPropertyChecks.g:274:2: ( (enumLiteral_0= '\\u2200' ) | (enumLiteral_1= '\\u03A3' ) | (enumLiteral_2= '\\u2203' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSystemDatasheetPropertyChecks.g:275:3: (enumLiteral_0= '\\u2200' )
                    {
                    // InternalSystemDatasheetPropertyChecks.g:275:3: (enumLiteral_0= '\\u2200' )
                    // InternalSystemDatasheetPropertyChecks.g:276:4: enumLiteral_0= '\\u2200'
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationFunctionAccess().getFOR_ALLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvaluationFunctionAccess().getFOR_ALLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemDatasheetPropertyChecks.g:283:3: (enumLiteral_1= '\\u03A3' )
                    {
                    // InternalSystemDatasheetPropertyChecks.g:283:3: (enumLiteral_1= '\\u03A3' )
                    // InternalSystemDatasheetPropertyChecks.g:284:4: enumLiteral_1= '\\u03A3'
                    {
                    enumLiteral_1=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationFunctionAccess().getSUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvaluationFunctionAccess().getSUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSystemDatasheetPropertyChecks.g:291:3: (enumLiteral_2= '\\u2203' )
                    {
                    // InternalSystemDatasheetPropertyChecks.g:291:3: (enumLiteral_2= '\\u2203' )
                    // InternalSystemDatasheetPropertyChecks.g:292:4: enumLiteral_2= '\\u2203'
                    {
                    enumLiteral_2=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationFunctionAccess().getEXISTSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvaluationFunctionAccess().getEXISTSEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleEvaluationFunction"


    // $ANTLR start "ruleEvaluationOperator"
    // InternalSystemDatasheetPropertyChecks.g:302:1: ruleEvaluationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= 'compatible_to' ) ) ;
    public final Enumerator ruleEvaluationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSystemDatasheetPropertyChecks.g:308:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= 'compatible_to' ) ) )
            // InternalSystemDatasheetPropertyChecks.g:309:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= 'compatible_to' ) )
            {
            // InternalSystemDatasheetPropertyChecks.g:309:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '>' ) | (enumLiteral_6= 'compatible_to' ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            case 22:
                {
                alt5=5;
                }
                break;
            case 23:
                {
                alt5=6;
                }
                break;
            case 24:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSystemDatasheetPropertyChecks.g:310:3: (enumLiteral_0= '==' )
                    {
                    // InternalSystemDatasheetPropertyChecks.g:310:3: (enumLiteral_0= '==' )
                    // InternalSystemDatasheetPropertyChecks.g:311:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvaluationOperatorAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemDatasheetPropertyChecks.g:318:3: (enumLiteral_1= '!=' )
                    {
                    // InternalSystemDatasheetPropertyChecks.g:318:3: (enumLiteral_1= '!=' )
                    // InternalSystemDatasheetPropertyChecks.g:319:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvaluationOperatorAccess().getNEQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSystemDatasheetPropertyChecks.g:326:3: (enumLiteral_2= '<' )
                    {
                    // InternalSystemDatasheetPropertyChecks.g:326:3: (enumLiteral_2= '<' )
                    // InternalSystemDatasheetPropertyChecks.g:327:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getLTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvaluationOperatorAccess().getLTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSystemDatasheetPropertyChecks.g:334:3: (enumLiteral_3= '<=' )
                    {
                    // InternalSystemDatasheetPropertyChecks.g:334:3: (enumLiteral_3= '<=' )
                    // InternalSystemDatasheetPropertyChecks.g:335:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getLETEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEvaluationOperatorAccess().getLETEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSystemDatasheetPropertyChecks.g:342:3: (enumLiteral_4= '>=' )
                    {
                    // InternalSystemDatasheetPropertyChecks.g:342:3: (enumLiteral_4= '>=' )
                    // InternalSystemDatasheetPropertyChecks.g:343:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getGETEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEvaluationOperatorAccess().getGETEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSystemDatasheetPropertyChecks.g:350:3: (enumLiteral_5= '>' )
                    {
                    // InternalSystemDatasheetPropertyChecks.g:350:3: (enumLiteral_5= '>' )
                    // InternalSystemDatasheetPropertyChecks.g:351:4: enumLiteral_5= '>'
                    {
                    enumLiteral_5=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getGTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEvaluationOperatorAccess().getGTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSystemDatasheetPropertyChecks.g:358:3: (enumLiteral_6= 'compatible_to' )
                    {
                    // InternalSystemDatasheetPropertyChecks.g:358:3: (enumLiteral_6= 'compatible_to' )
                    // InternalSystemDatasheetPropertyChecks.g:359:4: enumLiteral_6= 'compatible_to'
                    {
                    enumLiteral_6=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationOperatorAccess().getCOMPATIBLE_TOEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEvaluationOperatorAccess().getCOMPATIBLE_TOEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleEvaluationOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});

}