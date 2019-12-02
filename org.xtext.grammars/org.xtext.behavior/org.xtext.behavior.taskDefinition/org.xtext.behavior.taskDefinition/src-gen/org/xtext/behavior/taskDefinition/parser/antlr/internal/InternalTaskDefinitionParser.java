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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOCU_COMMENT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'TaskDefinitionRepository'", "'{'", "'}'", "'TaskDefinition'", "'in'", "'out'", "'results'", "'value'", "'='", "';'", "':'", "'.'", "'true'", "'false'", "'-'", "'E'", "'e'", "'InlineEnumeration'", "'['", "']'", "'*'", "','", "'SUCCESS'", "'ERROR'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'"
    };
    public static final int RULE_ML_DOCUMENTATION=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=11;
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
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalTaskDefinition.g:80:1: entryRuleTaskDefinitionModel returns [EObject current=null] : iv_ruleTaskDefinitionModel= ruleTaskDefinitionModel EOF ;
    public final EObject entryRuleTaskDefinitionModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinitionModel = null;


        try {
            // InternalTaskDefinition.g:80:60: (iv_ruleTaskDefinitionModel= ruleTaskDefinitionModel EOF )
            // InternalTaskDefinition.g:81:2: iv_ruleTaskDefinitionModel= ruleTaskDefinitionModel EOF
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
    // InternalTaskDefinition.g:87:1: ruleTaskDefinitionModel returns [EObject current=null] : ( () ( (lv_repository_1_0= ruleTaskDefinitionRepository ) )? ) ;
    public final EObject ruleTaskDefinitionModel() throws RecognitionException {
        EObject current = null;

        EObject lv_repository_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:93:2: ( ( () ( (lv_repository_1_0= ruleTaskDefinitionRepository ) )? ) )
            // InternalTaskDefinition.g:94:2: ( () ( (lv_repository_1_0= ruleTaskDefinitionRepository ) )? )
            {
            // InternalTaskDefinition.g:94:2: ( () ( (lv_repository_1_0= ruleTaskDefinitionRepository ) )? )
            // InternalTaskDefinition.g:95:3: () ( (lv_repository_1_0= ruleTaskDefinitionRepository ) )?
            {
            // InternalTaskDefinition.g:95:3: ()
            // InternalTaskDefinition.g:96:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskDefinitionModelAccess().getTaskDefinitionModelAction_0(),
            					current);
            			

            }

            // InternalTaskDefinition.g:102:3: ( (lv_repository_1_0= ruleTaskDefinitionRepository ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTaskDefinition.g:103:4: (lv_repository_1_0= ruleTaskDefinitionRepository )
                    {
                    // InternalTaskDefinition.g:103:4: (lv_repository_1_0= ruleTaskDefinitionRepository )
                    // InternalTaskDefinition.g:104:5: lv_repository_1_0= ruleTaskDefinitionRepository
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
    // InternalTaskDefinition.g:125:1: entryRuleTaskDefinitionRepository returns [EObject current=null] : iv_ruleTaskDefinitionRepository= ruleTaskDefinitionRepository EOF ;
    public final EObject entryRuleTaskDefinitionRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinitionRepository = null;


        try {
            // InternalTaskDefinition.g:125:65: (iv_ruleTaskDefinitionRepository= ruleTaskDefinitionRepository EOF )
            // InternalTaskDefinition.g:126:2: iv_ruleTaskDefinitionRepository= ruleTaskDefinitionRepository EOF
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
    // InternalTaskDefinition.g:132:1: ruleTaskDefinitionRepository returns [EObject current=null] : (otherlv_0= 'TaskDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTaskDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleTaskDefinitionRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tasks_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:138:2: ( (otherlv_0= 'TaskDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTaskDefinition ) )* otherlv_4= '}' ) )
            // InternalTaskDefinition.g:139:2: (otherlv_0= 'TaskDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTaskDefinition ) )* otherlv_4= '}' )
            {
            // InternalTaskDefinition.g:139:2: (otherlv_0= 'TaskDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTaskDefinition ) )* otherlv_4= '}' )
            // InternalTaskDefinition.g:140:3: otherlv_0= 'TaskDefinitionRepository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTaskDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDefinitionRepositoryAccess().getTaskDefinitionRepositoryKeyword_0());
            		
            // InternalTaskDefinition.g:144:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDefinition.g:145:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDefinition.g:145:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDefinition.g:146:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTaskDefinition.g:166:3: ( (lv_tasks_3_0= ruleTaskDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTaskDefinition.g:167:4: (lv_tasks_3_0= ruleTaskDefinition )
            	    {
            	    // InternalTaskDefinition.g:167:4: (lv_tasks_3_0= ruleTaskDefinition )
            	    // InternalTaskDefinition.g:168:5: lv_tasks_3_0= ruleTaskDefinition
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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalTaskDefinition.g:193:1: entryRuleTaskDefinition returns [EObject current=null] : iv_ruleTaskDefinition= ruleTaskDefinition EOF ;
    public final EObject entryRuleTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinition = null;


        try {
            // InternalTaskDefinition.g:193:55: (iv_ruleTaskDefinition= ruleTaskDefinition EOF )
            // InternalTaskDefinition.g:194:2: iv_ruleTaskDefinition= ruleTaskDefinition EOF
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
    // InternalTaskDefinition.g:200:1: ruleTaskDefinition returns [EObject current=null] : (otherlv_0= 'TaskDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleTaskResult ) )+ otherlv_14= '}' otherlv_15= '}' ) ;
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
            // InternalTaskDefinition.g:206:2: ( (otherlv_0= 'TaskDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleTaskResult ) )+ otherlv_14= '}' otherlv_15= '}' ) )
            // InternalTaskDefinition.g:207:2: (otherlv_0= 'TaskDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleTaskResult ) )+ otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalTaskDefinition.g:207:2: (otherlv_0= 'TaskDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleTaskResult ) )+ otherlv_14= '}' otherlv_15= '}' )
            // InternalTaskDefinition.g:208:3: otherlv_0= 'TaskDefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )? (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )? otherlv_11= 'results' otherlv_12= '{' ( (lv_results_13_0= ruleTaskResult ) )+ otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDefinitionAccess().getTaskDefinitionKeyword_0());
            		
            // InternalTaskDefinition.g:212:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDefinition.g:213:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDefinition.g:213:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDefinition.g:214:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTaskDefinition.g:234:3: (otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTaskDefinition.g:235:4: otherlv_3= 'in' otherlv_4= '{' ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskDefinitionAccess().getInKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTaskDefinition.g:243:4: ( (lv_inAttribute_5_0= ruleAttributeDefinition ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_DOCU_COMMENT)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTaskDefinition.g:244:5: (lv_inAttribute_5_0= ruleAttributeDefinition )
                    	    {
                    	    // InternalTaskDefinition.g:244:5: (lv_inAttribute_5_0= ruleAttributeDefinition )
                    	    // InternalTaskDefinition.g:245:6: lv_inAttribute_5_0= ruleAttributeDefinition
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

                    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalTaskDefinition.g:267:3: (otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTaskDefinition.g:268:4: otherlv_7= 'out' otherlv_8= '{' ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskDefinitionAccess().getOutKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTaskDefinition.g:276:4: ( (lv_outAttribute_9_0= ruleAttributeDefinition ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_DOCU_COMMENT)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTaskDefinition.g:277:5: (lv_outAttribute_9_0= ruleAttributeDefinition )
                    	    {
                    	    // InternalTaskDefinition.g:277:5: (lv_outAttribute_9_0= ruleAttributeDefinition )
                    	    // InternalTaskDefinition.g:278:6: lv_outAttribute_9_0= ruleAttributeDefinition
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

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskDefinitionAccess().getResultsKeyword_5());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalTaskDefinition.g:308:3: ( (lv_results_13_0= ruleTaskResult ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=36 && LA7_0<=37)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTaskDefinition.g:309:4: (lv_results_13_0= ruleTaskResult )
            	    {
            	    // InternalTaskDefinition.g:309:4: (lv_results_13_0= ruleTaskResult )
            	    // InternalTaskDefinition.g:310:5: lv_results_13_0= ruleTaskResult
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

            otherlv_14=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_15=(Token)match(input,16,FOLLOW_2); 

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
    // InternalTaskDefinition.g:339:1: entryRuleTaskResult returns [EObject current=null] : iv_ruleTaskResult= ruleTaskResult EOF ;
    public final EObject entryRuleTaskResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskResult = null;


        try {
            // InternalTaskDefinition.g:339:51: (iv_ruleTaskResult= ruleTaskResult EOF )
            // InternalTaskDefinition.g:340:2: iv_ruleTaskResult= ruleTaskResult EOF
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
    // InternalTaskDefinition.g:346:1: ruleTaskResult returns [EObject current=null] : ( ( (lv_result_0_0= ruleTASK_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleTaskResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_result_0_0 = null;

        AntlrDatatypeRuleToken lv_resultValue_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:352:2: ( ( ( (lv_result_0_0= ruleTASK_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? ) )
            // InternalTaskDefinition.g:353:2: ( ( (lv_result_0_0= ruleTASK_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? )
            {
            // InternalTaskDefinition.g:353:2: ( ( (lv_result_0_0= ruleTASK_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )? )
            // InternalTaskDefinition.g:354:3: ( (lv_result_0_0= ruleTASK_RESULT_TYPES ) ) otherlv_1= 'value' otherlv_2= '=' ( (lv_resultValue_3_0= ruleEString ) ) (otherlv_4= ';' )?
            {
            // InternalTaskDefinition.g:354:3: ( (lv_result_0_0= ruleTASK_RESULT_TYPES ) )
            // InternalTaskDefinition.g:355:4: (lv_result_0_0= ruleTASK_RESULT_TYPES )
            {
            // InternalTaskDefinition.g:355:4: (lv_result_0_0= ruleTASK_RESULT_TYPES )
            // InternalTaskDefinition.g:356:5: lv_result_0_0= ruleTASK_RESULT_TYPES
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

            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskResultAccess().getValueKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskResultAccess().getEqualsSignKeyword_2());
            		
            // InternalTaskDefinition.g:381:3: ( (lv_resultValue_3_0= ruleEString ) )
            // InternalTaskDefinition.g:382:4: (lv_resultValue_3_0= ruleEString )
            {
            // InternalTaskDefinition.g:382:4: (lv_resultValue_3_0= ruleEString )
            // InternalTaskDefinition.g:383:5: lv_resultValue_3_0= ruleEString
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

            // InternalTaskDefinition.g:400:3: (otherlv_4= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaskDefinition.g:401:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_2); 

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
    // InternalTaskDefinition.g:410:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // InternalTaskDefinition.g:410:60: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // InternalTaskDefinition.g:411:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
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
    // InternalTaskDefinition.g:417:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_defaultvalue_5_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:423:2: ( ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? ) )
            // InternalTaskDefinition.g:424:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? )
            {
            // InternalTaskDefinition.g:424:2: ( ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )? )
            // InternalTaskDefinition.g:425:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleAbstractAttributeType ) ) (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )? (otherlv_6= ';' )?
            {
            // InternalTaskDefinition.g:425:3: ( (lv_documentation_0_0= RULE_DOCU_COMMENT ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DOCU_COMMENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDefinition.g:426:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    {
                    // InternalTaskDefinition.g:426:4: (lv_documentation_0_0= RULE_DOCU_COMMENT )
                    // InternalTaskDefinition.g:427:5: lv_documentation_0_0= RULE_DOCU_COMMENT
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCU_COMMENT,FOLLOW_3); 

                    					newLeafNode(lv_documentation_0_0, grammarAccess.getAttributeDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeDefinitionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"documentation",
                    						lv_documentation_0_0,
                    						"org.xtext.base.docuterminals.DocuTerminals.DOCU_COMMENT");
                    				

                    }


                    }
                    break;

            }

            // InternalTaskDefinition.g:443:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTaskDefinition.g:444:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTaskDefinition.g:444:4: (lv_name_1_0= RULE_ID )
            // InternalTaskDefinition.g:445:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2());
            		
            // InternalTaskDefinition.g:465:3: ( (lv_type_3_0= ruleAbstractAttributeType ) )
            // InternalTaskDefinition.g:466:4: (lv_type_3_0= ruleAbstractAttributeType )
            {
            // InternalTaskDefinition.g:466:4: (lv_type_3_0= ruleAbstractAttributeType )
            // InternalTaskDefinition.g:467:5: lv_type_3_0= ruleAbstractAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_3_0=ruleAbstractAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.base.basicAttributes.BasicAttributes.AbstractAttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaskDefinition.g:484:3: (otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTaskDefinition.g:485:4: otherlv_4= '=' ( (lv_defaultvalue_5_0= ruleAbstractValue ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalTaskDefinition.g:489:4: ( (lv_defaultvalue_5_0= ruleAbstractValue ) )
                    // InternalTaskDefinition.g:490:5: (lv_defaultvalue_5_0= ruleAbstractValue )
                    {
                    // InternalTaskDefinition.g:490:5: (lv_defaultvalue_5_0= ruleAbstractValue )
                    // InternalTaskDefinition.g:491:6: lv_defaultvalue_5_0= ruleAbstractValue
                    {

                    						newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_defaultvalue_5_0=ruleAbstractValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"defaultvalue",
                    							lv_defaultvalue_5_0,
                    							"org.xtext.base.basicAttributes.BasicAttributes.AbstractValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTaskDefinition.g:509:3: (otherlv_6= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTaskDefinition.g:510:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5());
                    			

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
    // InternalTaskDefinition.g:519:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalTaskDefinition.g:519:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalTaskDefinition.g:520:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalTaskDefinition.g:526:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:532:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalTaskDefinition.g:533:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalTaskDefinition.g:533:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalTaskDefinition.g:534:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalTaskDefinition.g:541:3: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTaskDefinition.g:542:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalTaskDefinition.g:559:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalTaskDefinition.g:559:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalTaskDefinition.g:560:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalTaskDefinition.g:566:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:572:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalTaskDefinition.g:573:2: (kw= 'true' | kw= 'false' )
            {
            // InternalTaskDefinition.g:573:2: (kw= 'true' | kw= 'false' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTaskDefinition.g:574:3: kw= 'true'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:580:3: kw= 'false'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

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
    // InternalTaskDefinition.g:589:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTaskDefinition.g:589:47: (iv_ruleEString= ruleEString EOF )
            // InternalTaskDefinition.g:590:2: iv_ruleEString= ruleEString EOF
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
    // InternalTaskDefinition.g:596:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:602:2: (this_STRING_0= RULE_STRING )
            // InternalTaskDefinition.g:603:2: this_STRING_0= RULE_STRING
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
    // InternalTaskDefinition.g:613:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTaskDefinition.g:613:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTaskDefinition.g:614:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalTaskDefinition.g:620:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:626:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTaskDefinition.g:627:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTaskDefinition.g:627:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTaskDefinition.g:628:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTaskDefinition.g:628:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTaskDefinition.g:629:4: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_22); 

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
    // InternalTaskDefinition.g:646:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalTaskDefinition.g:646:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalTaskDefinition.g:647:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalTaskDefinition.g:653:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:659:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalTaskDefinition.g:660:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalTaskDefinition.g:660:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalTaskDefinition.g:661:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalTaskDefinition.g:661:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTaskDefinition.g:662:4: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalTaskDefinition.g:668:3: (this_INT_1= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTaskDefinition.g:669:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,25,FOLLOW_22); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_25); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalTaskDefinition.g:689:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=29 && LA19_0<=30)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTaskDefinition.g:690:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalTaskDefinition.g:690:4: (kw= 'E' | kw= 'e' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==29) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==30) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalTaskDefinition.g:691:5: kw= 'E'
                            {
                            kw=(Token)match(input,29,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTaskDefinition.g:697:5: kw= 'e'
                            {
                            kw=(Token)match(input,30,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalTaskDefinition.g:703:4: (kw= '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==28) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalTaskDefinition.g:704:5: kw= '-'
                            {
                            kw=(Token)match(input,28,FOLLOW_22); 

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
    // InternalTaskDefinition.g:722:1: entryRuleEnumerationElement returns [EObject current=null] : iv_ruleEnumerationElement= ruleEnumerationElement EOF ;
    public final EObject entryRuleEnumerationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElement = null;


        try {
            // InternalTaskDefinition.g:722:59: (iv_ruleEnumerationElement= ruleEnumerationElement EOF )
            // InternalTaskDefinition.g:723:2: iv_ruleEnumerationElement= ruleEnumerationElement EOF
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
    // InternalTaskDefinition.g:729:1: ruleEnumerationElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) ;
    public final EObject ruleEnumerationElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:735:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? ) )
            // InternalTaskDefinition.g:736:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            {
            // InternalTaskDefinition.g:736:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )? )
            // InternalTaskDefinition.g:737:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )? (otherlv_3= ';' )?
            {
            // InternalTaskDefinition.g:737:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTaskDefinition.g:738:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTaskDefinition.g:738:4: (lv_name_0_0= RULE_ID )
            // InternalTaskDefinition.g:739:5: lv_name_0_0= RULE_ID
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

            // InternalTaskDefinition.g:755:3: (otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTaskDefinition.g:756:4: otherlv_1= '=' ( (lv_value_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalTaskDefinition.g:760:4: ( (lv_value_2_0= ruleEInt ) )
                    // InternalTaskDefinition.g:761:5: (lv_value_2_0= ruleEInt )
                    {
                    // InternalTaskDefinition.g:761:5: (lv_value_2_0= ruleEInt )
                    // InternalTaskDefinition.g:762:6: lv_value_2_0= ruleEInt
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

            // InternalTaskDefinition.g:780:3: (otherlv_3= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTaskDefinition.g:781:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

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
    // InternalTaskDefinition.g:790:1: entryRuleAbstractAttributeType returns [EObject current=null] : iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF ;
    public final EObject entryRuleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractAttributeType = null;


        try {
            // InternalTaskDefinition.g:790:62: (iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF )
            // InternalTaskDefinition.g:791:2: iv_ruleAbstractAttributeType= ruleAbstractAttributeType EOF
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
    // InternalTaskDefinition.g:797:1: ruleAbstractAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) ;
    public final EObject ruleAbstractAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_InlineEnumerationType_1 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:803:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType ) )
            // InternalTaskDefinition.g:804:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            {
            // InternalTaskDefinition.g:804:2: (this_PrimitiveType_0= rulePrimitiveType | this_InlineEnumerationType_1= ruleInlineEnumerationType )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=38 && LA22_0<=49)) ) {
                alt22=1;
            }
            else if ( (LA22_0==31) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalTaskDefinition.g:805:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalTaskDefinition.g:814:3: this_InlineEnumerationType_1= ruleInlineEnumerationType
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
    // InternalTaskDefinition.g:826:1: entryRuleInlineEnumerationType returns [EObject current=null] : iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF ;
    public final EObject entryRuleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineEnumerationType = null;


        try {
            // InternalTaskDefinition.g:826:62: (iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF )
            // InternalTaskDefinition.g:827:2: iv_ruleInlineEnumerationType= ruleInlineEnumerationType EOF
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
    // InternalTaskDefinition.g:833:1: ruleInlineEnumerationType returns [EObject current=null] : (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) ;
    public final EObject ruleInlineEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_array_1_0 = null;

        EObject lv_enums_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:839:2: ( (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' ) )
            // InternalTaskDefinition.g:840:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            {
            // InternalTaskDefinition.g:840:2: (otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}' )
            // InternalTaskDefinition.g:841:3: otherlv_0= 'InlineEnumeration' ( (lv_array_1_0= ruleArrayType ) )? otherlv_2= '{' ( (lv_enums_3_0= ruleEnumerationElement ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0());
            		
            // InternalTaskDefinition.g:845:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTaskDefinition.g:846:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalTaskDefinition.g:846:4: (lv_array_1_0= ruleArrayType )
                    // InternalTaskDefinition.g:847:5: lv_array_1_0= ruleArrayType
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

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTaskDefinition.g:868:3: ( (lv_enums_3_0= ruleEnumerationElement ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTaskDefinition.g:869:4: (lv_enums_3_0= ruleEnumerationElement )
            	    {
            	    // InternalTaskDefinition.g:869:4: (lv_enums_3_0= ruleEnumerationElement )
            	    // InternalTaskDefinition.g:870:5: lv_enums_3_0= ruleEnumerationElement
            	    {

            	    					newCompositeNode(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalTaskDefinition.g:895:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalTaskDefinition.g:895:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalTaskDefinition.g:896:2: iv_ruleArrayType= ruleArrayType EOF
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
    // InternalTaskDefinition.g:902:1: ruleArrayType returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:908:2: ( ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' ) )
            // InternalTaskDefinition.g:909:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            {
            // InternalTaskDefinition.g:909:2: ( () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']' )
            // InternalTaskDefinition.g:910:3: () otherlv_1= '[' ( (lv_length_2_0= ruleCardinality ) )? otherlv_3= ']'
            {
            // InternalTaskDefinition.g:910:3: ()
            // InternalTaskDefinition.g:911:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalTaskDefinition.g:921:3: ( (lv_length_2_0= ruleCardinality ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT||LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTaskDefinition.g:922:4: (lv_length_2_0= ruleCardinality )
                    {
                    // InternalTaskDefinition.g:922:4: (lv_length_2_0= ruleCardinality )
                    // InternalTaskDefinition.g:923:5: lv_length_2_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_30);
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

            otherlv_3=(Token)match(input,33,FOLLOW_2); 

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
    // InternalTaskDefinition.g:948:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // InternalTaskDefinition.g:948:51: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalTaskDefinition.g:949:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalTaskDefinition.g:955:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:961:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalTaskDefinition.g:962:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalTaskDefinition.g:962:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==34) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalTaskDefinition.g:963:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:971:3: kw= '*'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

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
    // InternalTaskDefinition.g:980:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalTaskDefinition.g:980:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalTaskDefinition.g:981:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalTaskDefinition.g:987:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeName_0_0 = null;

        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:993:2: ( ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? ) )
            // InternalTaskDefinition.g:994:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            {
            // InternalTaskDefinition.g:994:2: ( ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )? )
            // InternalTaskDefinition.g:995:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) ) ( (lv_array_1_0= ruleArrayType ) )?
            {
            // InternalTaskDefinition.g:995:3: ( (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME ) )
            // InternalTaskDefinition.g:996:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            {
            // InternalTaskDefinition.g:996:4: (lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME )
            // InternalTaskDefinition.g:997:5: lv_typeName_0_0= rulePRIMITIVE_TYPE_NAME
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalTaskDefinition.g:1014:3: ( (lv_array_1_0= ruleArrayType ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTaskDefinition.g:1015:4: (lv_array_1_0= ruleArrayType )
                    {
                    // InternalTaskDefinition.g:1015:4: (lv_array_1_0= ruleArrayType )
                    // InternalTaskDefinition.g:1016:5: lv_array_1_0= ruleArrayType
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
    // InternalTaskDefinition.g:1037:1: entryRuleAbstractValue returns [EObject current=null] : iv_ruleAbstractValue= ruleAbstractValue EOF ;
    public final EObject entryRuleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValue = null;


        try {
            // InternalTaskDefinition.g:1037:54: (iv_ruleAbstractValue= ruleAbstractValue EOF )
            // InternalTaskDefinition.g:1038:2: iv_ruleAbstractValue= ruleAbstractValue EOF
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
    // InternalTaskDefinition.g:1044:1: ruleAbstractValue returns [EObject current=null] : (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) ;
    public final EObject ruleAbstractValue() throws RecognitionException {
        EObject current = null;

        EObject this_SingleValue_0 = null;

        EObject this_ArrayValue_1 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:1050:2: ( (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue ) )
            // InternalTaskDefinition.g:1051:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            {
            // InternalTaskDefinition.g:1051:2: (this_SingleValue_0= ruleSingleValue | this_ArrayValue_1= ruleArrayValue )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||(LA28_0>=RULE_STRING && LA28_0<=RULE_INT)||(LA28_0>=25 && LA28_0<=28)) ) {
                alt28=1;
            }
            else if ( (LA28_0==32) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalTaskDefinition.g:1052:3: this_SingleValue_0= ruleSingleValue
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
                    // InternalTaskDefinition.g:1061:3: this_ArrayValue_1= ruleArrayValue
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
    // InternalTaskDefinition.g:1073:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalTaskDefinition.g:1073:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalTaskDefinition.g:1074:2: iv_ruleArrayValue= ruleArrayValue EOF
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
    // InternalTaskDefinition.g:1080:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:1086:2: ( (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' ) )
            // InternalTaskDefinition.g:1087:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            {
            // InternalTaskDefinition.g:1087:2: (otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']' )
            // InternalTaskDefinition.g:1088:3: otherlv_0= '[' ( (lv_values_1_0= ruleSingleValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalTaskDefinition.g:1092:3: ( (lv_values_1_0= ruleSingleValue ) )
            // InternalTaskDefinition.g:1093:4: (lv_values_1_0= ruleSingleValue )
            {
            // InternalTaskDefinition.g:1093:4: (lv_values_1_0= ruleSingleValue )
            // InternalTaskDefinition.g:1094:5: lv_values_1_0= ruleSingleValue
            {

            					newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalTaskDefinition.g:1111:3: (otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==35) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalTaskDefinition.g:1112:4: otherlv_2= ',' ( (lv_values_3_0= ruleSingleValue ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_32); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalTaskDefinition.g:1116:4: ( (lv_values_3_0= ruleSingleValue ) )
            	    // InternalTaskDefinition.g:1117:5: (lv_values_3_0= ruleSingleValue )
            	    {
            	    // InternalTaskDefinition.g:1117:5: (lv_values_3_0= ruleSingleValue )
            	    // InternalTaskDefinition.g:1118:6: lv_values_3_0= ruleSingleValue
            	    {

            	    						newCompositeNode(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

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
    // InternalTaskDefinition.g:1144:1: entryRuleSingleValue returns [EObject current=null] : iv_ruleSingleValue= ruleSingleValue EOF ;
    public final EObject entryRuleSingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleValue = null;


        try {
            // InternalTaskDefinition.g:1144:52: (iv_ruleSingleValue= ruleSingleValue EOF )
            // InternalTaskDefinition.g:1145:2: iv_ruleSingleValue= ruleSingleValue EOF
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
    // InternalTaskDefinition.g:1151:1: ruleSingleValue returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) ;
    public final EObject ruleSingleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalTaskDefinition.g:1157:2: ( ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) ) )
            // InternalTaskDefinition.g:1158:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            {
            // InternalTaskDefinition.g:1158:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) | ( () ( (lv_value_3_0= ruleEDouble ) ) ) | ( () ( (lv_value_5_0= ruleEString ) ) ) | ( () ( (lv_value_7_0= ruleEBoolean ) ) ) | ( () ( ( ruleFQN ) ) ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_INT) ) {
                    int LA30_2 = input.LA(3);

                    if ( (LA30_2==EOF||(LA30_2>=RULE_ID && LA30_2<=RULE_DOCU_COMMENT)||LA30_2==16||LA30_2==23||LA30_2==33||LA30_2==35) ) {
                        alt30=1;
                    }
                    else if ( (LA30_2==25) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA30_1==25) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==EOF||(LA30_2>=RULE_ID && LA30_2<=RULE_DOCU_COMMENT)||LA30_2==16||LA30_2==23||LA30_2==33||LA30_2==35) ) {
                    alt30=1;
                }
                else if ( (LA30_2==25) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt30=2;
                }
                break;
            case RULE_STRING:
                {
                alt30=3;
                }
                break;
            case 26:
            case 27:
                {
                alt30=4;
                }
                break;
            case RULE_ID:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalTaskDefinition.g:1159:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    {
                    // InternalTaskDefinition.g:1159:3: ( () ( (lv_value_1_0= ruleEInt ) ) )
                    // InternalTaskDefinition.g:1160:4: () ( (lv_value_1_0= ruleEInt ) )
                    {
                    // InternalTaskDefinition.g:1160:4: ()
                    // InternalTaskDefinition.g:1161:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalTaskDefinition.g:1167:4: ( (lv_value_1_0= ruleEInt ) )
                    // InternalTaskDefinition.g:1168:5: (lv_value_1_0= ruleEInt )
                    {
                    // InternalTaskDefinition.g:1168:5: (lv_value_1_0= ruleEInt )
                    // InternalTaskDefinition.g:1169:6: lv_value_1_0= ruleEInt
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
                    // InternalTaskDefinition.g:1188:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    {
                    // InternalTaskDefinition.g:1188:3: ( () ( (lv_value_3_0= ruleEDouble ) ) )
                    // InternalTaskDefinition.g:1189:4: () ( (lv_value_3_0= ruleEDouble ) )
                    {
                    // InternalTaskDefinition.g:1189:4: ()
                    // InternalTaskDefinition.g:1190:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalTaskDefinition.g:1196:4: ( (lv_value_3_0= ruleEDouble ) )
                    // InternalTaskDefinition.g:1197:5: (lv_value_3_0= ruleEDouble )
                    {
                    // InternalTaskDefinition.g:1197:5: (lv_value_3_0= ruleEDouble )
                    // InternalTaskDefinition.g:1198:6: lv_value_3_0= ruleEDouble
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
                    // InternalTaskDefinition.g:1217:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    {
                    // InternalTaskDefinition.g:1217:3: ( () ( (lv_value_5_0= ruleEString ) ) )
                    // InternalTaskDefinition.g:1218:4: () ( (lv_value_5_0= ruleEString ) )
                    {
                    // InternalTaskDefinition.g:1218:4: ()
                    // InternalTaskDefinition.g:1219:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getStringValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalTaskDefinition.g:1225:4: ( (lv_value_5_0= ruleEString ) )
                    // InternalTaskDefinition.g:1226:5: (lv_value_5_0= ruleEString )
                    {
                    // InternalTaskDefinition.g:1226:5: (lv_value_5_0= ruleEString )
                    // InternalTaskDefinition.g:1227:6: lv_value_5_0= ruleEString
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
                    // InternalTaskDefinition.g:1246:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    {
                    // InternalTaskDefinition.g:1246:3: ( () ( (lv_value_7_0= ruleEBoolean ) ) )
                    // InternalTaskDefinition.g:1247:4: () ( (lv_value_7_0= ruleEBoolean ) )
                    {
                    // InternalTaskDefinition.g:1247:4: ()
                    // InternalTaskDefinition.g:1248:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getBoolValueAction_3_0(),
                    						current);
                    				

                    }

                    // InternalTaskDefinition.g:1254:4: ( (lv_value_7_0= ruleEBoolean ) )
                    // InternalTaskDefinition.g:1255:5: (lv_value_7_0= ruleEBoolean )
                    {
                    // InternalTaskDefinition.g:1255:5: (lv_value_7_0= ruleEBoolean )
                    // InternalTaskDefinition.g:1256:6: lv_value_7_0= ruleEBoolean
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
                    // InternalTaskDefinition.g:1275:3: ( () ( ( ruleFQN ) ) )
                    {
                    // InternalTaskDefinition.g:1275:3: ( () ( ( ruleFQN ) ) )
                    // InternalTaskDefinition.g:1276:4: () ( ( ruleFQN ) )
                    {
                    // InternalTaskDefinition.g:1276:4: ()
                    // InternalTaskDefinition.g:1277:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0(),
                    						current);
                    				

                    }

                    // InternalTaskDefinition.g:1283:4: ( ( ruleFQN ) )
                    // InternalTaskDefinition.g:1284:5: ( ruleFQN )
                    {
                    // InternalTaskDefinition.g:1284:5: ( ruleFQN )
                    // InternalTaskDefinition.g:1285:6: ruleFQN
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
    // InternalTaskDefinition.g:1304:1: ruleTASK_RESULT_TYPES returns [Enumerator current=null] : ( (enumLiteral_0= 'SUCCESS' ) | (enumLiteral_1= 'ERROR' ) ) ;
    public final Enumerator ruleTASK_RESULT_TYPES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalTaskDefinition.g:1310:2: ( ( (enumLiteral_0= 'SUCCESS' ) | (enumLiteral_1= 'ERROR' ) ) )
            // InternalTaskDefinition.g:1311:2: ( (enumLiteral_0= 'SUCCESS' ) | (enumLiteral_1= 'ERROR' ) )
            {
            // InternalTaskDefinition.g:1311:2: ( (enumLiteral_0= 'SUCCESS' ) | (enumLiteral_1= 'ERROR' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            else if ( (LA31_0==37) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalTaskDefinition.g:1312:3: (enumLiteral_0= 'SUCCESS' )
                    {
                    // InternalTaskDefinition.g:1312:3: (enumLiteral_0= 'SUCCESS' )
                    // InternalTaskDefinition.g:1313:4: enumLiteral_0= 'SUCCESS'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTASK_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTASK_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:1320:3: (enumLiteral_1= 'ERROR' )
                    {
                    // InternalTaskDefinition.g:1320:3: (enumLiteral_1= 'ERROR' )
                    // InternalTaskDefinition.g:1321:4: enumLiteral_1= 'ERROR'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

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
    // InternalTaskDefinition.g:1331:1: rulePRIMITIVE_TYPE_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) ;
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
            // InternalTaskDefinition.g:1337:2: ( ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) ) )
            // InternalTaskDefinition.g:1338:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            {
            // InternalTaskDefinition.g:1338:2: ( (enumLiteral_0= 'Int8' ) | (enumLiteral_1= 'Int16' ) | (enumLiteral_2= 'Int32' ) | (enumLiteral_3= 'Int64' ) | (enumLiteral_4= 'UInt8' ) | (enumLiteral_5= 'UInt16' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'UInt64' ) | (enumLiteral_8= 'Float' ) | (enumLiteral_9= 'Double' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Boolean' ) )
            int alt32=12;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt32=1;
                }
                break;
            case 39:
                {
                alt32=2;
                }
                break;
            case 40:
                {
                alt32=3;
                }
                break;
            case 41:
                {
                alt32=4;
                }
                break;
            case 42:
                {
                alt32=5;
                }
                break;
            case 43:
                {
                alt32=6;
                }
                break;
            case 44:
                {
                alt32=7;
                }
                break;
            case 45:
                {
                alt32=8;
                }
                break;
            case 46:
                {
                alt32=9;
                }
                break;
            case 47:
                {
                alt32=10;
                }
                break;
            case 48:
                {
                alt32=11;
                }
                break;
            case 49:
                {
                alt32=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalTaskDefinition.g:1339:3: (enumLiteral_0= 'Int8' )
                    {
                    // InternalTaskDefinition.g:1339:3: (enumLiteral_0= 'Int8' )
                    // InternalTaskDefinition.g:1340:4: enumLiteral_0= 'Int8'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:1347:3: (enumLiteral_1= 'Int16' )
                    {
                    // InternalTaskDefinition.g:1347:3: (enumLiteral_1= 'Int16' )
                    // InternalTaskDefinition.g:1348:4: enumLiteral_1= 'Int16'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDefinition.g:1355:3: (enumLiteral_2= 'Int32' )
                    {
                    // InternalTaskDefinition.g:1355:3: (enumLiteral_2= 'Int32' )
                    // InternalTaskDefinition.g:1356:4: enumLiteral_2= 'Int32'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDefinition.g:1363:3: (enumLiteral_3= 'Int64' )
                    {
                    // InternalTaskDefinition.g:1363:3: (enumLiteral_3= 'Int64' )
                    // InternalTaskDefinition.g:1364:4: enumLiteral_3= 'Int64'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDefinition.g:1371:3: (enumLiteral_4= 'UInt8' )
                    {
                    // InternalTaskDefinition.g:1371:3: (enumLiteral_4= 'UInt8' )
                    // InternalTaskDefinition.g:1372:4: enumLiteral_4= 'UInt8'
                    {
                    enumLiteral_4=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTaskDefinition.g:1379:3: (enumLiteral_5= 'UInt16' )
                    {
                    // InternalTaskDefinition.g:1379:3: (enumLiteral_5= 'UInt16' )
                    // InternalTaskDefinition.g:1380:4: enumLiteral_5= 'UInt16'
                    {
                    enumLiteral_5=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalTaskDefinition.g:1387:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalTaskDefinition.g:1387:3: (enumLiteral_6= 'UInt32' )
                    // InternalTaskDefinition.g:1388:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalTaskDefinition.g:1395:3: (enumLiteral_7= 'UInt64' )
                    {
                    // InternalTaskDefinition.g:1395:3: (enumLiteral_7= 'UInt64' )
                    // InternalTaskDefinition.g:1396:4: enumLiteral_7= 'UInt64'
                    {
                    enumLiteral_7=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalTaskDefinition.g:1403:3: (enumLiteral_8= 'Float' )
                    {
                    // InternalTaskDefinition.g:1403:3: (enumLiteral_8= 'Float' )
                    // InternalTaskDefinition.g:1404:4: enumLiteral_8= 'Float'
                    {
                    enumLiteral_8=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalTaskDefinition.g:1411:3: (enumLiteral_9= 'Double' )
                    {
                    // InternalTaskDefinition.g:1411:3: (enumLiteral_9= 'Double' )
                    // InternalTaskDefinition.g:1412:4: enumLiteral_9= 'Double'
                    {
                    enumLiteral_9=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalTaskDefinition.g:1419:3: (enumLiteral_10= 'String' )
                    {
                    // InternalTaskDefinition.g:1419:3: (enumLiteral_10= 'String' )
                    // InternalTaskDefinition.g:1420:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalTaskDefinition.g:1427:3: (enumLiteral_11= 'Boolean' )
                    {
                    // InternalTaskDefinition.g:1427:3: (enumLiteral_11= 'Boolean' )
                    // InternalTaskDefinition.g:1428:4: enumLiteral_11= 'Boolean'
                    {
                    enumLiteral_11=(Token)match(input,49,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000003000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0003FFC080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000011E0000D0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000600000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000001E0000D0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000A00000000L});

}