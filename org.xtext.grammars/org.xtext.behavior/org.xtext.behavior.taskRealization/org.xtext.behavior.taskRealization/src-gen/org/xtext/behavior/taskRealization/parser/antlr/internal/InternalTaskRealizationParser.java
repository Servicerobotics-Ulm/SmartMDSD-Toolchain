package org.xtext.behavior.taskRealization.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.behavior.taskRealization.services.TaskRealizationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskRealizationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TaskRealizationModel'", "'{'", "'}'", "'.'", "'TaskRealization'", "'AbstractCoordinationModuleInstance'", "'coordModuleDef'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTaskRealizationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskRealizationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskRealizationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTaskRealization.g"; }



     	private TaskRealizationGrammarAccess grammarAccess;

        public InternalTaskRealizationParser(TokenStream input, TaskRealizationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TaskRealizationModel";
       	}

       	@Override
       	protected TaskRealizationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTaskRealizationModel"
    // InternalTaskRealization.g:79:1: entryRuleTaskRealizationModel returns [EObject current=null] : iv_ruleTaskRealizationModel= ruleTaskRealizationModel EOF ;
    public final EObject entryRuleTaskRealizationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRealizationModel = null;


        try {
            // InternalTaskRealization.g:79:61: (iv_ruleTaskRealizationModel= ruleTaskRealizationModel EOF )
            // InternalTaskRealization.g:80:2: iv_ruleTaskRealizationModel= ruleTaskRealizationModel EOF
            {
             newCompositeNode(grammarAccess.getTaskRealizationModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskRealizationModel=ruleTaskRealizationModel();

            state._fsp--;

             current =iv_ruleTaskRealizationModel; 
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
    // $ANTLR end "entryRuleTaskRealizationModel"


    // $ANTLR start "ruleTaskRealizationModel"
    // InternalTaskRealization.g:86:1: ruleTaskRealizationModel returns [EObject current=null] : ( () otherlv_1= 'TaskRealizationModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_abstCoordInst_4_0= ruleAbstractCoordinationModuleInstance ) )* ( (lv_tasks_5_0= ruleTaskRealization ) )* otherlv_6= '}' ) ;
    public final EObject ruleTaskRealizationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_abstCoordInst_4_0 = null;

        EObject lv_tasks_5_0 = null;



        	enterRule();

        try {
            // InternalTaskRealization.g:92:2: ( ( () otherlv_1= 'TaskRealizationModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_abstCoordInst_4_0= ruleAbstractCoordinationModuleInstance ) )* ( (lv_tasks_5_0= ruleTaskRealization ) )* otherlv_6= '}' ) )
            // InternalTaskRealization.g:93:2: ( () otherlv_1= 'TaskRealizationModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_abstCoordInst_4_0= ruleAbstractCoordinationModuleInstance ) )* ( (lv_tasks_5_0= ruleTaskRealization ) )* otherlv_6= '}' )
            {
            // InternalTaskRealization.g:93:2: ( () otherlv_1= 'TaskRealizationModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_abstCoordInst_4_0= ruleAbstractCoordinationModuleInstance ) )* ( (lv_tasks_5_0= ruleTaskRealization ) )* otherlv_6= '}' )
            // InternalTaskRealization.g:94:3: () otherlv_1= 'TaskRealizationModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_abstCoordInst_4_0= ruleAbstractCoordinationModuleInstance ) )* ( (lv_tasks_5_0= ruleTaskRealization ) )* otherlv_6= '}'
            {
            // InternalTaskRealization.g:94:3: ()
            // InternalTaskRealization.g:95:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskRealizationModelAccess().getTaskRealizationModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskRealizationModelAccess().getTaskRealizationModelKeyword_1());
            		
            // InternalTaskRealization.g:105:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTaskRealization.g:106:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTaskRealization.g:106:4: (lv_name_2_0= RULE_ID )
            // InternalTaskRealization.g:107:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTaskRealizationModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRealizationModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskRealizationModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTaskRealization.g:127:3: ( (lv_abstCoordInst_4_0= ruleAbstractCoordinationModuleInstance ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTaskRealization.g:128:4: (lv_abstCoordInst_4_0= ruleAbstractCoordinationModuleInstance )
            	    {
            	    // InternalTaskRealization.g:128:4: (lv_abstCoordInst_4_0= ruleAbstractCoordinationModuleInstance )
            	    // InternalTaskRealization.g:129:5: lv_abstCoordInst_4_0= ruleAbstractCoordinationModuleInstance
            	    {

            	    					newCompositeNode(grammarAccess.getTaskRealizationModelAccess().getAbstCoordInstAbstractCoordinationModuleInstanceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_abstCoordInst_4_0=ruleAbstractCoordinationModuleInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskRealizationModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abstCoordInst",
            	    						lv_abstCoordInst_4_0,
            	    						"org.xtext.behavior.taskRealization.TaskRealization.AbstractCoordinationModuleInstance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTaskRealization.g:146:3: ( (lv_tasks_5_0= ruleTaskRealization ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTaskRealization.g:147:4: (lv_tasks_5_0= ruleTaskRealization )
            	    {
            	    // InternalTaskRealization.g:147:4: (lv_tasks_5_0= ruleTaskRealization )
            	    // InternalTaskRealization.g:148:5: lv_tasks_5_0= ruleTaskRealization
            	    {

            	    					newCompositeNode(grammarAccess.getTaskRealizationModelAccess().getTasksTaskRealizationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_tasks_5_0=ruleTaskRealization();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskRealizationModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_5_0,
            	    						"org.xtext.behavior.taskRealization.TaskRealization.TaskRealization");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskRealizationModelAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTaskRealizationModel"


    // $ANTLR start "entryRuleFQN"
    // InternalTaskRealization.g:173:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalTaskRealization.g:173:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalTaskRealization.g:174:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalTaskRealization.g:180:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalTaskRealization.g:186:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalTaskRealization.g:187:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalTaskRealization.g:187:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalTaskRealization.g:188:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalTaskRealization.g:195:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTaskRealization.g:196:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleTaskRealization"
    // InternalTaskRealization.g:213:1: entryRuleTaskRealization returns [EObject current=null] : iv_ruleTaskRealization= ruleTaskRealization EOF ;
    public final EObject entryRuleTaskRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRealization = null;


        try {
            // InternalTaskRealization.g:213:56: (iv_ruleTaskRealization= ruleTaskRealization EOF )
            // InternalTaskRealization.g:214:2: iv_ruleTaskRealization= ruleTaskRealization EOF
            {
             newCompositeNode(grammarAccess.getTaskRealizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskRealization=ruleTaskRealization();

            state._fsp--;

             current =iv_ruleTaskRealization; 
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
    // $ANTLR end "entryRuleTaskRealization"


    // $ANTLR start "ruleTaskRealization"
    // InternalTaskRealization.g:220:1: ruleTaskRealization returns [EObject current=null] : (otherlv_0= 'TaskRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleTaskRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTaskRealization.g:226:2: ( (otherlv_0= 'TaskRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalTaskRealization.g:227:2: (otherlv_0= 'TaskRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalTaskRealization.g:227:2: (otherlv_0= 'TaskRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalTaskRealization.g:228:3: otherlv_0= 'TaskRealization' ( ( ruleFQN ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskRealizationAccess().getTaskRealizationKeyword_0());
            		
            // InternalTaskRealization.g:232:3: ( ( ruleFQN ) )
            // InternalTaskRealization.g:233:4: ( ruleFQN )
            {
            // InternalTaskRealization.g:233:4: ( ruleFQN )
            // InternalTaskRealization.g:234:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRealizationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTaskRealizationAccess().getTaskDefTaskDefinitionCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskRealizationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskRealizationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTaskRealization"


    // $ANTLR start "entryRuleAbstractCoordinationModuleInstance"
    // InternalTaskRealization.g:260:1: entryRuleAbstractCoordinationModuleInstance returns [EObject current=null] : iv_ruleAbstractCoordinationModuleInstance= ruleAbstractCoordinationModuleInstance EOF ;
    public final EObject entryRuleAbstractCoordinationModuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractCoordinationModuleInstance = null;


        try {
            // InternalTaskRealization.g:260:75: (iv_ruleAbstractCoordinationModuleInstance= ruleAbstractCoordinationModuleInstance EOF )
            // InternalTaskRealization.g:261:2: iv_ruleAbstractCoordinationModuleInstance= ruleAbstractCoordinationModuleInstance EOF
            {
             newCompositeNode(grammarAccess.getAbstractCoordinationModuleInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractCoordinationModuleInstance=ruleAbstractCoordinationModuleInstance();

            state._fsp--;

             current =iv_ruleAbstractCoordinationModuleInstance; 
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
    // $ANTLR end "entryRuleAbstractCoordinationModuleInstance"


    // $ANTLR start "ruleAbstractCoordinationModuleInstance"
    // InternalTaskRealization.g:267:1: ruleAbstractCoordinationModuleInstance returns [EObject current=null] : (otherlv_0= 'AbstractCoordinationModuleInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'coordModuleDef' ( ( ruleFQN ) ) ) ;
    public final EObject ruleAbstractCoordinationModuleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTaskRealization.g:273:2: ( (otherlv_0= 'AbstractCoordinationModuleInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'coordModuleDef' ( ( ruleFQN ) ) ) )
            // InternalTaskRealization.g:274:2: (otherlv_0= 'AbstractCoordinationModuleInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'coordModuleDef' ( ( ruleFQN ) ) )
            {
            // InternalTaskRealization.g:274:2: (otherlv_0= 'AbstractCoordinationModuleInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'coordModuleDef' ( ( ruleFQN ) ) )
            // InternalTaskRealization.g:275:3: otherlv_0= 'AbstractCoordinationModuleInstance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'coordModuleDef' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAbstractCoordinationModuleInstanceAccess().getAbstractCoordinationModuleInstanceKeyword_0());
            		
            // InternalTaskRealization.g:279:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskRealization.g:280:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskRealization.g:280:4: (lv_name_1_0= RULE_ID )
            // InternalTaskRealization.g:281:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAbstractCoordinationModuleInstanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractCoordinationModuleInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefKeyword_2());
            		
            // InternalTaskRealization.g:301:3: ( ( ruleFQN ) )
            // InternalTaskRealization.g:302:4: ( ruleFQN )
            {
            // InternalTaskRealization.g:302:4: ( ruleFQN )
            // InternalTaskRealization.g:303:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbstractCoordinationModuleInstanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefCoordinationModuleDefinitionCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAbstractCoordinationModuleInstance"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});

}