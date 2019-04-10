package org.xtext.behavior.taskDefinition.parser.antlr.internal;

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
import org.xtext.behavior.taskDefinition.services.TaskDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskDefinitionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TaskDefinitionRepository'", "'{'", "'}'", "'TaskDefinition'", "'in'", "'out'", "'results'", "'value'", "'='", "';'", "':'", "'.'", "'true'", "'false'", "'-'", "'E'", "'e'", "'InlineEnumeration'", "'['", "']'", "'*'", "','", "'SUCCESS'", "'ERROR'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTaskDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTaskDefinition.g"; }



     	private TaskDefinitionGrammarAccess grammarAccess;

        public InternalTaskDefinitionParser(TokenStream input, TaskDefinitionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TaskDefinitionModel";
       	}

       	@Override
       	protected TaskDefinitionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTaskDefinitionModel"
    // InternalTaskDefinition.g:106:1: entryRuleTaskDefinitionModel returns [EObject current=null] : iv_ruleTaskDefinitionModel= ruleTaskDefinitionModel EOF ;
    public final EObject entryRuleTaskDefinitionModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinitionModel = null;


        try {
            // InternalTaskDefinition.g:106:60: (iv_ruleTaskDefinitionModel= ruleTaskDefinitionModel EOF )
            // InternalTaskDefinition.g:107:2: iv_ruleTaskDefinitionModel= ruleTaskDefinitionModel EOF
            {
             newCompositeNode(grammarAccess.getTaskDefinitionModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskDefinitionModel=ruleTaskDefinitionModel();

            state._fsp--;

             current =iv_ruleTaskDefinitionModel; 
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
    // $ANTLR end "entryRuleTaskDefinitionModel"


    // $ANTLR start "ruleTaskDefinitionModel"
    // InternalTaskDefinition.g:113:1: ruleTaskDefinitionModel returns [EObject current=null] : ( () ( (lv_repository_1_0= ruleTaskDefinitionRepository ) )? ) ;
    public final EObject ruleTaskDefinitionModel() throws RecognitionException {
        EObject current = null;

        EObject lv_repository_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:119:2: ( ( () ( (lv_repository_1_0= ruleTaskDefinitionRepository ) )? ) )
            // InternalTaskDefinition.g:120:2: ( () ( (lv_repository_1_0= ruleTaskDefinitionRepository ) )? )
            {
            // InternalTaskDefinition.g:120:2: ( () ( (lv_repository_1_0= ruleTaskDefinitionRepository ) )? )
            // InternalTaskDefinition.g:121:3: () ( (lv_repository_1_0= ruleTaskDefinitionRepository ) )?
            {
            // InternalTaskDefinition.g:121:3: ()
            // InternalTaskDefinition.g:122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskDefinitionModelAccess().getTaskDefinitionModelAction_0(),
            					current);
            			

            }

            // InternalTaskDefinition.g:128:3: ( (lv_repository_1_0= ruleTaskDefinitionRepository ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTaskDefinition.g:129:4: (lv_repository_1_0= ruleTaskDefinitionRepository )
                    {
                    // InternalTaskDefinition.g:129:4: (lv_repository_1_0= ruleTaskDefinitionRepository )
                    // InternalTaskDefinition.g:130:5: lv_repository_1_0= ruleTaskDefinitionRepository
                    {

                    					newCompositeNode(grammarAccess.getTaskDefinitionModelAccess().getRepositoryTaskDefinitionRepositoryParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repository_1_0=ruleTaskDefinitionRepository();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskDefinitionModelRule());
                    					}
                    					set(
                    						current,
                    						"repository",
                    						lv_repository_1_0,
                    						"org.xtext.behavior.taskDefinition.TaskDefinition.TaskDefinitionRepository");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleTaskDefinitionModel"


    // $ANTLR start "entryRuleTaskDefinitionRepository"
    // InternalTaskDefinition.g:151:1: entryRuleTaskDefinitionRepository returns [EObject current=null] : iv_ruleTaskDefinitionRepository= ruleTaskDefinitionRepository EOF ;
    public final EObject entryRuleTaskDefinitionRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinitionRepository = null;


        try {
            // InternalTaskDefinition.g:151:65: (iv_ruleTaskDefinitionRepository= ruleTaskDefinitionRepository EOF )
            // InternalTaskDefinition.g:152:2: iv_ruleTaskDefinitionRepository= ruleTaskDefinitionRepository EOF
            {
             newCompositeNode(grammarAccess.getTaskDefinitionRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskDefinitionRepository=ruleTaskDefinitionRepository();

            state._fsp--;

             current =iv_ruleTaskDefinitionRepository; 
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
    // $ANTLR end "entryRuleTaskDefinitionRepository"


    // $ANTLR start "ruleTaskDefinitionRepository"
    // InternalTaskDefinition.g:158:1: ruleTaskDefinitionRepository returns [EObject current=null] : (otherlv_0= 'TaskDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTaskDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleTaskDefinitionRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tasks_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:164:2: ( (otherlv_0= 'TaskDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTaskDefinition ) )* otherlv_4= '}' ) )
            // InternalTaskDefinition.g:165:2: (otherlv_0= 'TaskDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTaskDefinition ) )* otherlv_4= '}' )
            {
            // InternalTaskDefinition.g:165:2: (otherlv_0= 'TaskDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTaskDefinition ) )* otherlv_4= '}' )
            // InternalTaskDefinition.g:166:3: otherlv_0= 'TaskDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTaskDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDefinitionRepositoryAccess().getTaskDefinitionRepositoryKeyword_0());
            		
            // InternalTaskDefinition.g:170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDefinition.g:171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDefinition.g:171:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDefinition.g:172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskDefinitionRepositoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskDefinitionRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTaskDefinition.g:192:3: ( (lv_tasks_3_0= ruleTaskDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTaskDefinition.g:193:4: (lv_tasks_3_0= ruleTaskDefinition )
            	    {
            	    // InternalTaskDefinition.g:193:4: (lv_tasks_3_0= ruleTaskDefinition )
            	    // InternalTaskDefinition.g:194:5: lv_tasks_3_0= ruleTaskDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTaskDefinitionRepositoryAccess().getTasksTaskDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_tasks_3_0=ruleTaskDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskDefinitionRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_3_0,
            	    						"org.xtext.behavior.taskDefinition.TaskDefinition.TaskDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskDefinitionRepositoryAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTaskDefinitionRepository"


    // $ANTLR start "entryRuleTaskDefinition"
    // InternalTaskDefinition.g:219:1: entryRuleTaskDefinition returns [EObject current=null] : iv_ruleTaskDefinition= ruleTaskDefinition EOF ;
    public final EObject entryRuleTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinition = null;


        try {
            // InternalTaskDefinition.g:219:55: (iv_ruleTaskDefinition= ruleTaskDefinition EOF )
            // InternalTaskDefinition.g:220:2: iv_ruleTaskDefinition= ruleTaskDefinition EOF
            {
             newCompositeNode(grammarAccess.getTaskDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskDefinition=ruleTaskDefinition();

            state._fsp--;

             current =iv_ruleTaskDefinition; 
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
    // $ANTLR end "entryRuleTaskDefinition"


    // $ANTLR start "ruleTaskDefinition"
    // InternalTaskDefinition.g:226:1: ruleTaskDefinition returns [EObject current=null] : (otherlv_0= 'TaskDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleTaskResult ) )+ otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleTaskDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_inAttribute_5_0 = null;

        EObject lv_outAttribute_9_0 = null;

        EObject lv_results_13_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:232:2: ( (otherlv_0= 'TaskDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleTaskResult ) )+ otherlv_14= '}' otherlv_15= '}' ) )
            // InternalTaskDefinition.g:233:2: (otherlv_0= 'TaskDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleTaskResult ) )+ otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalTaskDefinition.g:233:2: (otherlv_0= 'TaskDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleTaskResult ) )+ otherlv_14= '}' otherlv_15= '}' )
            // InternalTaskDefinition.g:234:3: otherlv_0= 'TaskDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleTaskResult ) )+ otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDefinitionAccess().getTaskDefinitionKeyword_0());
            		
            // InternalTaskDefinition.g:238:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDefinition.g:239:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDefinition.g:239:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDefinition.g:240:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTaskDefinition.g:260:3: (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTaskDefinition.g:261:4: otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskDefinitionAccess().getInKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTaskDefinition.g:269:4: ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTaskDefinition.g:270:5: (lv_inAttribute_5_0= ruleAttributeDefinition )
                    	    {
                    	    // InternalTaskDefinition.g:270:5: (lv_inAttribute_5_0= ruleAttributeDefinition )
                    	    // InternalTaskDefinition.g:271:6: lv_inAttribute_5_0= ruleAttributeDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getTaskDefinitionAccess().getInAttributeAttributeDefinitionParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_inAttribute_5_0=ruleAttributeDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inAttribute",
                    	    							lv_inAttribute_5_0,
                    	    							"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalTaskDefinition.g:293:3: (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTaskDefinition.g:294:4: otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskDefinitionAccess().getOutKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTaskDefinition.g:302:4: ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTaskDefinition.g:303:5: (lv_outAttribute_9_0= ruleAttributeDefinition )
                    	    {
                    	    // InternalTaskDefinition.g:303:5: (lv_outAttribute_9_0= ruleAttributeDefinition )
                    	    // InternalTaskDefinition.g:304:6: lv_outAttribute_9_0= ruleAttributeDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getTaskDefinitionAccess().getOutAttributeAttributeDefinitionParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_outAttribute_9_0=ruleAttributeDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outAttribute",
                    	    							lv_outAttribute_9_0,
                    	    							"org.xtext.base.basicAttributes.BasicAttributes.AttributeDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskDefinitionAccess().getResultsKeyword_5());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalTaskDefinition.g:334:3: ( (lv_results_13_0= ruleTaskResult ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=33 && LA7_0<=34)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTaskDefinition.g:335:4: (lv_results_13_0= ruleTaskResult )
            	    {
            	    // InternalTaskDefinition.g:335:4: (lv_results_13_0= ruleTaskResult )
            	    // InternalTaskDefinition.g:336:5: lv_results_13_0= ruleTaskResult
            	    {

            	    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getResultsTaskResultParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_results_13_0=ruleTaskResult();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"results",
            	    						lv_results_13_0,
            	    						"org.xtext.behavior.taskDefinition.TaskDefinition.TaskResult");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_14=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_15=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleTaskDefinition"


    // $ANTLR start "entryRuleTaskResult"
    // InternalTaskDefinition.g:365:1: entryRuleTaskResult returns [EObject current=null] : iv_ruleTaskResult= ruleTaskResult EOF ;
    public final EObject entryRuleTaskResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskResult = null;


        try {
            // InternalTaskDefinition.g:365:51: (iv_ruleTaskResult= ruleTaskResult EOF )
            // InternalTaskDefinition.g:366:2: iv_ruleTaskResult= ruleTaskResult EOF
            {
             newCompositeNode(grammarAccess.getTaskResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskResult=ruleTaskResult();

            state._fsp--;

             current =iv_ruleTaskResult; 
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
    // $ANTLR end "entryRuleTaskResult"


    // $ANTLR start "ruleTaskResult"
    // InternalTaskDefinition.g:372:1: ruleTaskResult returns [EObject current=null] : ( ( (lv_result_0_0= ruleTASK_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleTaskResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_result_0_0 = null;

        AntlrDatatypeRuleToken lv_resultValue_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:378:2: ( ( ( (lv_result_0_0= ruleTASK_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? ) )
            // InternalTaskDefinition.g:379:2: ( ( (lv_result_0_0= ruleTASK_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? )
            {
            // InternalTaskDefinition.g:379:2: ( ( (lv_result_0_0= ruleTASK_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? )
            // InternalTaskDefinition.g:380:3: ( (lv_result_0_0= ruleTASK_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )?
            {
            // InternalTaskDefinition.g:380:3: ( (lv_result_0_0= ruleTASK_RESULT_TYPES ) )
            // InternalTaskDefinition.g:381:4: (lv_result_0_0= ruleTASK_RESULT_TYPES )
            {
            // InternalTaskDefinition.g:381:4: (lv_result_0_0= ruleTASK_RESULT_TYPES )
            // InternalTaskDefinition.g:382:5: lv_result_0_0= ruleTASK_RESULT_TYPES
            {

            					newCompositeNode(grammarAccess.getTaskResultAccess().getResultTASK_RESULT_TYPESEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_result_0_0=ruleTASK_RESULT_TYPES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskResultRule());
            					}
            					set(
            						current,
            						"result",
            						lv_result_0_0,
            						"org.xtext.behavior.taskDefinition.TaskDefinition.TASK_RESULT_TYPES");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskResultAccess().getValueKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskResultAccess().getEqualsSignKeyword_2());
            		
            // InternalTaskDefinition.g:407:3: ( (lv_resultValue_3_0= ruleEString ) )
            // InternalTaskDefinition.g:408:4: (lv_resultValue_3_0= ruleEString )
            {
            // InternalTaskDefinition.g:408:4: (lv_resultValue_3_0= ruleEString )
            // InternalTaskDefinition.g:409:5: lv_resultValue_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskResultAccess().getResultValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_resultValue_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskResultRule());
            					}
            					set(
            						current,
            						"resultValue",
            						lv_resultValue_3_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaskDefinition.g:426:3: (otherlv_4= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaskDefinition.g:427:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskResultAccess().getSemicolonKeyword_4());
                    			

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
    // $ANTLR end "ruleTaskResult"


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalTaskDefinition.g:436:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalTaskDefinition.g:436:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalTaskDefinition.g:437:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
             newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;

             current =iv_ruleAttributeDefinition; 
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
    // $ANTLR end "entryRuleAttributeDefinition"


    // $ANTLR start "ruleAttributeDefinition"
    // InternalTaskDefinition.g:443:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_2_0 = null;

        EObject lv_defaultvalue_4_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:449:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? ) )
            // InternalTaskDefinition.g:450:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? )
            {
            // InternalTaskDefinition.g:450:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )? )
            // InternalTaskDefinition.g:451:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractAttributeType ) ) (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )? (otherlv_5= ';' )?
            {
            // InternalTaskDefinition.g:451:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTaskDefinition.g:452:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTaskDefinition.g:452:4: (lv_name_0_0= RULE_ID )
            // InternalTaskDefinition.g:453:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1());
            		
            // InternalTaskDefinition.g:473:3: ( (lv_type_2_0= ruleAbstractAttributeType ) )
            // InternalTaskDefinition.g:474:4: (lv_type_2_0= ruleAbstractAttributeType )
            {
            // InternalTaskDefinition.g:474:4: (lv_type_2_0= ruleAbstractAttributeType )
            // InternalTaskDefinition.g:475:5: lv_type_2_0= ruleAbstractAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_2_0=ruleAbstractAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.AbstractAttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaskDefinition.g:492:3: (otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDefinition.g:493:4: otherlv_3= '=' ( (lv_defaultvalue_4_0= ruleAbstractValue ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalTaskDefinition.g:497:4: ( (lv_defaultvalue_4_0= ruleAbstractValue ) )
                    // InternalTaskDefinition.g:498:5: (lv_defaultvalue_4_0= ruleAbstractValue )
                    {
                    // InternalTaskDefinition.g:498:5: (lv_defaultvalue_4_0= ruleAbstractValue )
                    // InternalTaskDefinition.g:499:6: lv_defaultvalue_4_0= ruleAbstractValue
                    {

                    						newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_defaultvalue_4_0=ruleAbstractValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"defaultvalue",
                    							lv_defaultvalue_4_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.AbstractValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTaskDefinition.g:517:3: (otherlv_5= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTaskDefinition.g:518:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_4());
                    			

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
    // $ANTLR end "ruleAttributeDefinition"


    // $ANTLR start "entryRuleFQN"
    // InternalTaskDefinition.g:527:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalTaskDefinition.g:527:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalTaskDefinition.g:528:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalTaskDefinition.g:534:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:540:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalTaskDefinition.g:541:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalTaskDefinition.g:541:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalTaskDefinition.g:542:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalTaskDefinition.g:549:3: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTaskDefinition.g:550:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalTaskDefinition.g:567:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalTaskDefinition.g:567:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalTaskDefinition.g:568:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalTaskDefinition.g:574:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:580:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalTaskDefinition.g:581:2: (kw= 'true' | kw= 'false' )
            {
            // InternalTaskDefinition.g:581:2: (kw= 'true' | kw= 'false' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTaskDefinition.g:582:3: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:588:3: kw= 'false'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // InternalTaskDefinition.g:597:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTaskDefinition.g:597:47: (iv_ruleEString= ruleEString EOF )
            // InternalTaskDefinition.g:598:2: iv_ruleEString= ruleEString EOF
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
    // InternalTaskDefinition.g:604:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:610:2: (this_STRING_0= RULE_STRING )
            // InternalTaskDefinition.g:611:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "entryRuleEInt"
    // InternalTaskDefinition.g:621:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTaskDefinition.g:621:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTaskDefinition.g:622:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTaskDefinition.g:628:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:634:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTaskDefinition.g:635:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTaskDefinition.g:635:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTaskDefinition.g:636:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTaskDefinition.g:636:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTaskDefinition.g:637:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalTaskDefinition.g:654:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalTaskDefinition.g:654:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalTaskDefinition.g:655:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalTaskDefinition.g:661:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:667:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalTaskDefinition.g:668:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalTaskDefinition.g:668:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalTaskDefinition.g:669:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalTaskDefinition.g:669:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTaskDefinition.g:670:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalTaskDefinition.g:676:3: (this_INT_1= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTaskDefinition.g:677:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,22,FOLLOW_22); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_25); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalTaskDefinition.g:697:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=26 && LA18_0<=27)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTaskDefinition.g:698:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalTaskDefinition.g:698:4: (kw= 'E' | kw= 'e' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==26) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==27) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalTaskDefinition.g:699:5: kw= 'E'
                            {
                            kw=(Token)match(input,26,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTaskDefinition.g:705:5: kw= 'e'
                            {
                            kw=(Token)match(input,27,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalTaskDefinition.g:711:4: (kw= '-' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==25) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalTaskDefinition.g:712:5: kw= '-'
                            {
                            kw=(Token)match(input,25,FOLLOW_22); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEnumerationElement"
    // InternalTaskDefinition.g:730:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalTaskDefinition.g:730:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalTaskDefinition.g:731:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
            {
             newCompositeNode(grammarAccess.getEnumerationElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationElement=ruleEnumerationElement();

            state._fsp--;

             current =iv_ruleEnumerationElement; 
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
    // $ANTLR end "entryRuleEnumerationElement"


    // $ANTLR start "ruleEnumerationElement"
    // InternalTaskDefinition.g:737:1: ruleEnumerationElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:743:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) )
            // InternalTaskDefinition.g:744:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            {
            // InternalTaskDefinition.g:744:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            // InternalTaskDefinition.g:745:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )?
            {
            // InternalTaskDefinition.g:745:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTaskDefinition.g:746:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTaskDefinition.g:746:4: (lv_name_0_0= RULE_ID )
            // InternalTaskDefinition.g:747:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEnumerationElementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTaskDefinition.g:763:3: (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTaskDefinition.g:764:4: otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalTaskDefinition.g:768:4: ( (lv_value_2_0= ruleEInt ) )
                    // InternalTaskDefinition.g:769:5: (lv_value_2_0= ruleEInt )
                    {
                    // InternalTaskDefinition.g:769:5: (lv_value_2_0= ruleEInt )
                    // InternalTaskDefinition.g:770:6: lv_value_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEnumerationElementAccess().getValueEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_value_2_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationElementRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTaskDefinition.g:788:3: (otherlv_3= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTaskDefinition.g:789:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2());
                    			

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
    // $ANTLR end "ruleEnumerationElement"


    // $ANTLR start "entryRuleAbstractAttributeType"
    // InternalTaskDefinition.g:798:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalTaskDefinition.g:798:62: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalTaskDefinition.g:799:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAbstractAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractAttributeType=ruleAbstractAttributeType();

            state._fsp--;

             current =iv_ruleAbstractAttributeType; 
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
    // $ANTLR end "entryRuleAbstractAttributeType"


    // $ANTLR start "ruleAbstractAttributeType"
    // InternalTaskDefinition.g:805:1: ruleAbstractAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_InlineEnumerationType_1 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:811:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) )
            // InternalTaskDefinition.g:812:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            {
            // InternalTaskDefinition.g:812:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=35 && LA21_0<=46)) ) {
                alt21=1;
            }
            else if ( (LA21_0==28) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTaskDefinition.g:813:3: this_PrimitiveType_0= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;


                    			current = this_PrimitiveType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:822:3: this_InlineEnumerationType_1= ruleInlineEnumerationType
                    {

                    			newCompositeNode(grammarAccess.getAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InlineEnumerationType_1=ruleInlineEnumerationType();

                    state._fsp--;


                    			current = this_InlineEnumerationType_1;
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
    // $ANTLR end "ruleAbstractAttributeType"


    // $ANTLR start "entryRuleInlineEnumerationType"
    // InternalTaskDefinition.g:834:1: entryRuleInlineEnumerationType returns [EObject current=null] : iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF ;
    public final EObject entryRuleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineEnumerationType = null;


        try {
            // InternalTaskDefinition.g:834:62: (iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF )
            // InternalTaskDefinition.g:835:2: iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF
            {
             newCompositeNode(grammarAccess.getInlineEnumerationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInlineEnumerationType=ruleInlineEnumerationType();

            state._fsp--;

             current =iv_ruleInlineEnumerationType; 
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
    // $ANTLR end "entryRuleInlineEnumerationType"


    // $ANTLR start "ruleInlineEnumerationType"
    // InternalTaskDefinition.g:841:1: ruleInlineEnumerationType returns [EObject current=null] : (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_array_1_0 = null;

        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:847:2: ( (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) )
            // InternalTaskDefinition.g:848:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            {
            // InternalTaskDefinition.g:848:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            // InternalTaskDefinition.g:849:3: otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
            		
            // InternalTaskDefinition.g:853:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTaskDefinition.g:854:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalTaskDefinition.g:854:4: (lv_array_1_0= ruleArrayType )
                    // InternalTaskDefinition.g:855:5: lv_array_1_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_array_1_0=ruleArrayType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInlineEnumerationTypeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_1_0,
                    						"org.xtext.base.basicAttributes.BasicAttributes.ArrayType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTaskDefinition.g:876:3: ( (lv_enums_3_0= ruleEnumerationElement ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTaskDefinition.g:877:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalTaskDefinition.g:877:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalTaskDefinition.g:878:5: lv_enums_3_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_enums_3_0=ruleEnumerationElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInlineEnumerationTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"enums",
            	    						lv_enums_3_0,
            	    						"org.xtext.base.basicAttributes.BasicAttributes.EnumerationElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInlineEnumerationType"


    // $ANTLR start "entryRuleArrayType"
    // InternalTaskDefinition.g:903:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalTaskDefinition.g:903:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalTaskDefinition.g:904:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalTaskDefinition.g:910:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:916:2: ( ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) )
            // InternalTaskDefinition.g:917:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            {
            // InternalTaskDefinition.g:917:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            // InternalTaskDefinition.g:918:3: () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']'
            {
            // InternalTaskDefinition.g:918:3: ()
            // InternalTaskDefinition.g:919:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTaskDefinition.g:929:3: ( (lv_length_2_0= ruleCardinality ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT||LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTaskDefinition.g:930:4: (lv_length_2_0= ruleCardinality )
                    {
                    // InternalTaskDefinition.g:930:4: (lv_length_2_0= ruleCardinality )
                    // InternalTaskDefinition.g:931:5: lv_length_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_length_2_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    					}
                    					set(
                    						current,
                    						"length",
                    						lv_length_2_0,
                    						"org.xtext.base.basicAttributes.BasicAttributes.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleCardinality"
    // InternalTaskDefinition.g:956:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalTaskDefinition.g:956:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalTaskDefinition.g:957:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality.getText(); 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalTaskDefinition.g:963:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:969:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalTaskDefinition.g:970:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalTaskDefinition.g:970:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==31) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalTaskDefinition.g:971:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:979:3: kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCardinalityAccess().getAsteriskKeyword_1());
                    		

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalTaskDefinition.g:988:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalTaskDefinition.g:988:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalTaskDefinition.g:989:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalTaskDefinition.g:995:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeName_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:1001:2: ( ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalTaskDefinition.g:1002:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalTaskDefinition.g:1002:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalTaskDefinition.g:1003:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalTaskDefinition.g:1003:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) )
            // InternalTaskDefinition.g:1004:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            {
            // InternalTaskDefinition.g:1004:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            // InternalTaskDefinition.g:1005:5: lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_typeName_0_0=rulePRIMITIVE_TYPE_NAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_0_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.PRIMITIVE_TYPE_NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaskDefinition.g:1022:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTaskDefinition.g:1023:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalTaskDefinition.g:1023:4: (lv_array_1_0= ruleArrayType )
                    // InternalTaskDefinition.g:1024:5: lv_array_1_0= ruleArrayType
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getArrayArrayTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_1_0=ruleArrayType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_1_0,
                    						"org.xtext.base.basicAttributes.BasicAttributes.ArrayType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleAbstractValue"
    // InternalTaskDefinition.g:1045:1: entryRuleAbstractValue returns [EObject current=null] : iv_ruleAbstractValue= ruleAbstractValue EOF ;
    public final EObject entryRuleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValue = null;


        try {
            // InternalTaskDefinition.g:1045:54: (iv_ruleAbstractValue= ruleAbstractValue EOF )
            // InternalTaskDefinition.g:1046:2: iv_ruleAbstractValue= ruleAbstractValue EOF
            {
             newCompositeNode(grammarAccess.getAbstractValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractValue=ruleAbstractValue();

            state._fsp--;

             current =iv_ruleAbstractValue; 
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
    // $ANTLR end "entryRuleAbstractValue"


    // $ANTLR start "ruleAbstractValue"
    // InternalTaskDefinition.g:1052:1: ruleAbstractValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) ;
    public final EObject ruleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ArrayValue_1 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:1058:2: ( (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) )
            // InternalTaskDefinition.g:1059:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            {
            // InternalTaskDefinition.g:1059:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_INT)||(LA27_0>=22 && LA27_0<=25)) ) {
                alt27=1;
            }
            else if ( (LA27_0==29) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalTaskDefinition.g:1060:3: this_SingleValue_0= ruleSingleValue
                    {

                    			newCompositeNode(grammarAccess.getAbstractValueAccess().getSingleValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleValue_0=ruleSingleValue();

                    state._fsp--;


                    			current = this_SingleValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:1069:3: this_ArrayValue_1= ruleArrayValue
                    {

                    			newCompositeNode(grammarAccess.getAbstractValueAccess().getArrayValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayValue_1=ruleArrayValue();

                    state._fsp--;


                    			current = this_ArrayValue_1;
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
    // $ANTLR end "ruleAbstractValue"


    // $ANTLR start "entryRuleArrayValue"
    // InternalTaskDefinition.g:1081:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalTaskDefinition.g:1081:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalTaskDefinition.g:1082:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
             newCompositeNode(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;

             current =iv_ruleArrayValue; 
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
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalTaskDefinition.g:1088:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:1094:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) )
            // InternalTaskDefinition.g:1095:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            {
            // InternalTaskDefinition.g:1095:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            // InternalTaskDefinition.g:1096:3: otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalTaskDefinition.g:1100:3: ( (lv_values_1_0= ruleSingleValue ) )
            // InternalTaskDefinition.g:1101:4: (lv_values_1_0= ruleSingleValue )
            {
            // InternalTaskDefinition.g:1101:4: (lv_values_1_0= ruleSingleValue )
            // InternalTaskDefinition.g:1102:5: lv_values_1_0= ruleSingleValue
            {

            					newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_values_1_0=ruleSingleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayValueRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.SingleValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaskDefinition.g:1119:3: (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==32) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTaskDefinition.g:1120:4: otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_31); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalTaskDefinition.g:1124:4: ( (lv_values_3_0= ruleSingleValue ) )
            	    // InternalTaskDefinition.g:1125:5: (lv_values_3_0= ruleSingleValue )
            	    {
            	    // InternalTaskDefinition.g:1125:5: (lv_values_3_0= ruleSingleValue )
            	    // InternalTaskDefinition.g:1126:6: lv_values_3_0= ruleSingleValue
            	    {

            	    						newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_values_3_0=ruleSingleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArrayValueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.xtext.base.basicAttributes.BasicAttributes.SingleValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleSingleValue"
    // InternalTaskDefinition.g:1152:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalTaskDefinition.g:1152:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalTaskDefinition.g:1153:2: iv_ruleSingleValue= ruleSingleValue EOF
            {
             newCompositeNode(grammarAccess.getSingleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleValue=ruleSingleValue();

            state._fsp--;

             current =iv_ruleSingleValue; 
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
    // $ANTLR end "entryRuleSingleValue"


    // $ANTLR start "ruleSingleValue"
    // InternalTaskDefinition.g:1159:1: ruleSingleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:1165:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) )
            // InternalTaskDefinition.g:1166:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            {
            // InternalTaskDefinition.g:1166:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==RULE_INT) ) {
                    int LA29_2 = input.LA(3);

                    if ( (LA29_2==EOF||LA29_2==RULE_ID||LA29_2==13||LA29_2==20||LA29_2==30||LA29_2==32) ) {
                        alt29=1;
                    }
                    else if ( (LA29_2==22) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA29_1==22) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==EOF||LA29_2==RULE_ID||LA29_2==13||LA29_2==20||LA29_2==30||LA29_2==32) ) {
                    alt29=1;
                }
                else if ( (LA29_2==22) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt29=2;
                }
                break;
            case RULE_STRING:
                {
                alt29=3;
                }
                break;
            case 23:
            case 24:
                {
                alt29=4;
                }
                break;
            case RULE_ID:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalTaskDefinition.g:1167:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalTaskDefinition.g:1167:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalTaskDefinition.g:1168:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalTaskDefinition.g:1168:4: ()
                    // InternalTaskDefinition.g:1169:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalTaskDefinition.g:1175:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalTaskDefinition.g:1176:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalTaskDefinition.g:1176:5: (lv_value_1_0= ruleEInt )
                    // InternalTaskDefinition.g:1177:6: lv_value_1_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEIntParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:1196:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    {
                    // InternalTaskDefinition.g:1196:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    // InternalTaskDefinition.g:1197:4: () ( (lv_value_3_0= ruleEDouble ) )
                    {
                    // InternalTaskDefinition.g:1197:4: ()
                    // InternalTaskDefinition.g:1198:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalTaskDefinition.g:1204:4: ( (lv_value_3_0= ruleEDouble ) )
                    // InternalTaskDefinition.g:1205:5: (lv_value_3_0= ruleEDouble )
                    {
                    // InternalTaskDefinition.g:1205:5: (lv_value_3_0= ruleEDouble )
                    // InternalTaskDefinition.g:1206:6: lv_value_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDefinition.g:1225:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    {
                    // InternalTaskDefinition.g:1225:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    // InternalTaskDefinition.g:1226:4: () ( (lv_value_5_0= ruleEString ) )
                    {
                    // InternalTaskDefinition.g:1226:4: ()
                    // InternalTaskDefinition.g:1227:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getStringValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalTaskDefinition.g:1233:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalTaskDefinition.g:1234:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalTaskDefinition.g:1234:5: (lv_value_5_0= ruleEString )
                    // InternalTaskDefinition.g:1235:6: lv_value_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDefinition.g:1254:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    {
                    // InternalTaskDefinition.g:1254:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    // InternalTaskDefinition.g:1255:4: () ( (lv_value_7_0= ruleEBoolean ) )
                    {
                    // InternalTaskDefinition.g:1255:4: ()
                    // InternalTaskDefinition.g:1256:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getBoolValueAction_3_0(),
                    						current);
                    				

                    }

                    // InternalTaskDefinition.g:1262:4: ( (lv_value_7_0= ruleEBoolean ) )
                    // InternalTaskDefinition.g:1263:5: (lv_value_7_0= ruleEBoolean )
                    {
                    // InternalTaskDefinition.g:1263:5: (lv_value_7_0= ruleEBoolean )
                    // InternalTaskDefinition.g:1264:6: lv_value_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleValueRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDefinition.g:1283:3: ( () ( ( ruleFQN ) ) )
                    {
                    // InternalTaskDefinition.g:1283:3: ( () ( ( ruleFQN ) ) )
                    // InternalTaskDefinition.g:1284:4: () ( ( ruleFQN ) )
                    {
                    // InternalTaskDefinition.g:1284:4: ()
                    // InternalTaskDefinition.g:1285:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0(),
                    						current);
                    				

                    }

                    // InternalTaskDefinition.g:1291:4: ( ( ruleFQN ) )
                    // InternalTaskDefinition.g:1292:5: ( ruleFQN )
                    {
                    // InternalTaskDefinition.g:1292:5: ( ruleFQN )
                    // InternalTaskDefinition.g:1293:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSingleValueRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleSingleValue"


    // $ANTLR start "ruleTASK_RESULT_TYPES"
    // InternalTaskDefinition.g:1312:1: ruleTASK_RESULT_TYPES returns [Enumerator current=null] : ( (enumLiteral_0= 'SUCCESS' ) | (enumLiteral_1= 'ERROR' ) ) ;
    public final Enumerator ruleTASK_RESULT_TYPES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:1318:2: ( ( (enumLiteral_0= 'SUCCESS' ) | (enumLiteral_1= 'ERROR' ) ) )
            // InternalTaskDefinition.g:1319:2: ( (enumLiteral_0= 'SUCCESS' ) | (enumLiteral_1= 'ERROR' ) )
            {
            // InternalTaskDefinition.g:1319:2: ( (enumLiteral_0= 'SUCCESS' ) | (enumLiteral_1= 'ERROR' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            else if ( (LA30_0==34) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalTaskDefinition.g:1320:3: (enumLiteral_0= 'SUCCESS' )
                    {
                    // InternalTaskDefinition.g:1320:3: (enumLiteral_0= 'SUCCESS' )
                    // InternalTaskDefinition.g:1321:4: enumLiteral_0= 'SUCCESS'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTASK_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTASK_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:1328:3: (enumLiteral_1= 'ERROR' )
                    {
                    // InternalTaskDefinition.g:1328:3: (enumLiteral_1= 'ERROR' )
                    // InternalTaskDefinition.g:1329:4: enumLiteral_1= 'ERROR'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTASK_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTASK_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleTASK_RESULT_TYPES"


    // $ANTLR start "rulePRIMITIVE_TYPE_NAME"
    // InternalTaskDefinition.g:1339:1: rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) ;
    public final Enumerator rulePRIMITIVE_TYPE_NAME() throws RecognitionException {
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
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:1345:2: ( ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) )
            // InternalTaskDefinition.g:1346:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            {
            // InternalTaskDefinition.g:1346:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            int alt31=12;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt31=1;
                }
                break;
            case 36:
                {
                alt31=2;
                }
                break;
            case 37:
                {
                alt31=3;
                }
                break;
            case 38:
                {
                alt31=4;
                }
                break;
            case 39:
                {
                alt31=5;
                }
                break;
            case 40:
                {
                alt31=6;
                }
                break;
            case 41:
                {
                alt31=7;
                }
                break;
            case 42:
                {
                alt31=8;
                }
                break;
            case 43:
                {
                alt31=9;
                }
                break;
            case 44:
                {
                alt31=10;
                }
                break;
            case 45:
                {
                alt31=11;
                }
                break;
            case 46:
                {
                alt31=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalTaskDefinition.g:1347:3: (enumLiteral_0= 'Int8' )
                    {
                    // InternalTaskDefinition.g:1347:3: (enumLiteral_0= 'Int8' )
                    // InternalTaskDefinition.g:1348:4: enumLiteral_0= 'Int8'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:1355:3: (enumLiteral_1= 'Int16' )
                    {
                    // InternalTaskDefinition.g:1355:3: (enumLiteral_1= 'Int16' )
                    // InternalTaskDefinition.g:1356:4: enumLiteral_1= 'Int16'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDefinition.g:1363:3: (enumLiteral_2= 'Int32' )
                    {
                    // InternalTaskDefinition.g:1363:3: (enumLiteral_2= 'Int32' )
                    // InternalTaskDefinition.g:1364:4: enumLiteral_2= 'Int32'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDefinition.g:1371:3: (enumLiteral_3= 'Int64' )
                    {
                    // InternalTaskDefinition.g:1371:3: (enumLiteral_3= 'Int64' )
                    // InternalTaskDefinition.g:1372:4: enumLiteral_3= 'Int64'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDefinition.g:1379:3: (enumLiteral_4= 'UInt8' )
                    {
                    // InternalTaskDefinition.g:1379:3: (enumLiteral_4= 'UInt8' )
                    // InternalTaskDefinition.g:1380:4: enumLiteral_4= 'UInt8'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTaskDefinition.g:1387:3: (enumLiteral_5= 'UInt16' )
                    {
                    // InternalTaskDefinition.g:1387:3: (enumLiteral_5= 'UInt16' )
                    // InternalTaskDefinition.g:1388:4: enumLiteral_5= 'UInt16'
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTaskDefinition.g:1395:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalTaskDefinition.g:1395:3: (enumLiteral_6= 'UInt32' )
                    // InternalTaskDefinition.g:1396:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalTaskDefinition.g:1403:3: (enumLiteral_7= 'UInt64' )
                    {
                    // InternalTaskDefinition.g:1403:3: (enumLiteral_7= 'UInt64' )
                    // InternalTaskDefinition.g:1404:4: enumLiteral_7= 'UInt64'
                    {
                    enumLiteral_7=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalTaskDefinition.g:1411:3: (enumLiteral_8= 'Float' )
                    {
                    // InternalTaskDefinition.g:1411:3: (enumLiteral_8= 'Float' )
                    // InternalTaskDefinition.g:1412:4: enumLiteral_8= 'Float'
                    {
                    enumLiteral_8=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalTaskDefinition.g:1419:3: (enumLiteral_9= 'Double' )
                    {
                    // InternalTaskDefinition.g:1419:3: (enumLiteral_9= 'Double' )
                    // InternalTaskDefinition.g:1420:4: enumLiteral_9= 'Double'
                    {
                    enumLiteral_9=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalTaskDefinition.g:1427:3: (enumLiteral_10= 'String' )
                    {
                    // InternalTaskDefinition.g:1427:3: (enumLiteral_10= 'String' )
                    // InternalTaskDefinition.g:1428:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalTaskDefinition.g:1435:3: (enumLiteral_11= 'Boolean' )
                    {
                    // InternalTaskDefinition.g:1435:3: (enumLiteral_11= 'Boolean' )
                    // InternalTaskDefinition.g:1436:4: enumLiteral_11= 'Boolean'
                    {
                    enumLiteral_11=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11());
                    			

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
    // $ANTLR end "rulePRIMITIVE_TYPE_NAME"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000600002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00007FF810000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000023C00070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000C0000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000003C00070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000140000000L});

}