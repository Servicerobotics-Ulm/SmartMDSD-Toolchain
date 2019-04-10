package org.xtext.behavior.taskRealization.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.behavior.taskRealization.services.TaskRealizationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskRealizationParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(TaskRealizationGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTaskRealizationModel"
    // InternalTaskRealization.g:94:1: entryRuleTaskRealizationModel : ruleTaskRealizationModel EOF ;
    public final void entryRuleTaskRealizationModel() throws RecognitionException {
        try {
            // InternalTaskRealization.g:95:1: ( ruleTaskRealizationModel EOF )
            // InternalTaskRealization.g:96:1: ruleTaskRealizationModel EOF
            {
             before(grammarAccess.getTaskRealizationModelRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskRealizationModel();

            state._fsp--;

             after(grammarAccess.getTaskRealizationModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskRealizationModel"


    // $ANTLR start "ruleTaskRealizationModel"
    // InternalTaskRealization.g:103:1: ruleTaskRealizationModel : ( ( rule__TaskRealizationModel__Group__0 ) ) ;
    public final void ruleTaskRealizationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:107:2: ( ( ( rule__TaskRealizationModel__Group__0 ) ) )
            // InternalTaskRealization.g:108:2: ( ( rule__TaskRealizationModel__Group__0 ) )
            {
            // InternalTaskRealization.g:108:2: ( ( rule__TaskRealizationModel__Group__0 ) )
            // InternalTaskRealization.g:109:3: ( rule__TaskRealizationModel__Group__0 )
            {
             before(grammarAccess.getTaskRealizationModelAccess().getGroup()); 
            // InternalTaskRealization.g:110:3: ( rule__TaskRealizationModel__Group__0 )
            // InternalTaskRealization.g:110:4: rule__TaskRealizationModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskRealizationModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskRealizationModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskRealizationModel"


    // $ANTLR start "entryRuleFQN"
    // InternalTaskRealization.g:119:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalTaskRealization.g:120:1: ( ruleFQN EOF )
            // InternalTaskRealization.g:121:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalTaskRealization.g:128:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:132:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalTaskRealization.g:133:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalTaskRealization.g:133:2: ( ( rule__FQN__Group__0 ) )
            // InternalTaskRealization.g:134:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalTaskRealization.g:135:3: ( rule__FQN__Group__0 )
            // InternalTaskRealization.g:135:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleTaskRealization"
    // InternalTaskRealization.g:144:1: entryRuleTaskRealization : ruleTaskRealization EOF ;
    public final void entryRuleTaskRealization() throws RecognitionException {
        try {
            // InternalTaskRealization.g:145:1: ( ruleTaskRealization EOF )
            // InternalTaskRealization.g:146:1: ruleTaskRealization EOF
            {
             before(grammarAccess.getTaskRealizationRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskRealization();

            state._fsp--;

             after(grammarAccess.getTaskRealizationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskRealization"


    // $ANTLR start "ruleTaskRealization"
    // InternalTaskRealization.g:153:1: ruleTaskRealization : ( ( rule__TaskRealization__Group__0 ) ) ;
    public final void ruleTaskRealization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:157:2: ( ( ( rule__TaskRealization__Group__0 ) ) )
            // InternalTaskRealization.g:158:2: ( ( rule__TaskRealization__Group__0 ) )
            {
            // InternalTaskRealization.g:158:2: ( ( rule__TaskRealization__Group__0 ) )
            // InternalTaskRealization.g:159:3: ( rule__TaskRealization__Group__0 )
            {
             before(grammarAccess.getTaskRealizationAccess().getGroup()); 
            // InternalTaskRealization.g:160:3: ( rule__TaskRealization__Group__0 )
            // InternalTaskRealization.g:160:4: rule__TaskRealization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskRealization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskRealizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskRealization"


    // $ANTLR start "entryRuleAbstractCoordinationModuleInstance"
    // InternalTaskRealization.g:169:1: entryRuleAbstractCoordinationModuleInstance : ruleAbstractCoordinationModuleInstance EOF ;
    public final void entryRuleAbstractCoordinationModuleInstance() throws RecognitionException {
        try {
            // InternalTaskRealization.g:170:1: ( ruleAbstractCoordinationModuleInstance EOF )
            // InternalTaskRealization.g:171:1: ruleAbstractCoordinationModuleInstance EOF
            {
             before(grammarAccess.getAbstractCoordinationModuleInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractCoordinationModuleInstance();

            state._fsp--;

             after(grammarAccess.getAbstractCoordinationModuleInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractCoordinationModuleInstance"


    // $ANTLR start "ruleAbstractCoordinationModuleInstance"
    // InternalTaskRealization.g:178:1: ruleAbstractCoordinationModuleInstance : ( ( rule__AbstractCoordinationModuleInstance__Group__0 ) ) ;
    public final void ruleAbstractCoordinationModuleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:182:2: ( ( ( rule__AbstractCoordinationModuleInstance__Group__0 ) ) )
            // InternalTaskRealization.g:183:2: ( ( rule__AbstractCoordinationModuleInstance__Group__0 ) )
            {
            // InternalTaskRealization.g:183:2: ( ( rule__AbstractCoordinationModuleInstance__Group__0 ) )
            // InternalTaskRealization.g:184:3: ( rule__AbstractCoordinationModuleInstance__Group__0 )
            {
             before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getGroup()); 
            // InternalTaskRealization.g:185:3: ( rule__AbstractCoordinationModuleInstance__Group__0 )
            // InternalTaskRealization.g:185:4: rule__AbstractCoordinationModuleInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCoordinationModuleInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractCoordinationModuleInstance"


    // $ANTLR start "rule__TaskRealizationModel__Group__0"
    // InternalTaskRealization.g:193:1: rule__TaskRealizationModel__Group__0 : rule__TaskRealizationModel__Group__0__Impl rule__TaskRealizationModel__Group__1 ;
    public final void rule__TaskRealizationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:197:1: ( rule__TaskRealizationModel__Group__0__Impl rule__TaskRealizationModel__Group__1 )
            // InternalTaskRealization.g:198:2: rule__TaskRealizationModel__Group__0__Impl rule__TaskRealizationModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TaskRealizationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskRealizationModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__0"


    // $ANTLR start "rule__TaskRealizationModel__Group__0__Impl"
    // InternalTaskRealization.g:205:1: rule__TaskRealizationModel__Group__0__Impl : ( () ) ;
    public final void rule__TaskRealizationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:209:1: ( ( () ) )
            // InternalTaskRealization.g:210:1: ( () )
            {
            // InternalTaskRealization.g:210:1: ( () )
            // InternalTaskRealization.g:211:2: ()
            {
             before(grammarAccess.getTaskRealizationModelAccess().getTaskRealizationModelAction_0()); 
            // InternalTaskRealization.g:212:2: ()
            // InternalTaskRealization.g:212:3: 
            {
            }

             after(grammarAccess.getTaskRealizationModelAccess().getTaskRealizationModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__0__Impl"


    // $ANTLR start "rule__TaskRealizationModel__Group__1"
    // InternalTaskRealization.g:220:1: rule__TaskRealizationModel__Group__1 : rule__TaskRealizationModel__Group__1__Impl rule__TaskRealizationModel__Group__2 ;
    public final void rule__TaskRealizationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:224:1: ( rule__TaskRealizationModel__Group__1__Impl rule__TaskRealizationModel__Group__2 )
            // InternalTaskRealization.g:225:2: rule__TaskRealizationModel__Group__1__Impl rule__TaskRealizationModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TaskRealizationModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskRealizationModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__1"


    // $ANTLR start "rule__TaskRealizationModel__Group__1__Impl"
    // InternalTaskRealization.g:232:1: rule__TaskRealizationModel__Group__1__Impl : ( 'TaskRealizationModel' ) ;
    public final void rule__TaskRealizationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:236:1: ( ( 'TaskRealizationModel' ) )
            // InternalTaskRealization.g:237:1: ( 'TaskRealizationModel' )
            {
            // InternalTaskRealization.g:237:1: ( 'TaskRealizationModel' )
            // InternalTaskRealization.g:238:2: 'TaskRealizationModel'
            {
             before(grammarAccess.getTaskRealizationModelAccess().getTaskRealizationModelKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTaskRealizationModelAccess().getTaskRealizationModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__1__Impl"


    // $ANTLR start "rule__TaskRealizationModel__Group__2"
    // InternalTaskRealization.g:247:1: rule__TaskRealizationModel__Group__2 : rule__TaskRealizationModel__Group__2__Impl rule__TaskRealizationModel__Group__3 ;
    public final void rule__TaskRealizationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:251:1: ( rule__TaskRealizationModel__Group__2__Impl rule__TaskRealizationModel__Group__3 )
            // InternalTaskRealization.g:252:2: rule__TaskRealizationModel__Group__2__Impl rule__TaskRealizationModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TaskRealizationModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskRealizationModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__2"


    // $ANTLR start "rule__TaskRealizationModel__Group__2__Impl"
    // InternalTaskRealization.g:259:1: rule__TaskRealizationModel__Group__2__Impl : ( ( rule__TaskRealizationModel__NameAssignment_2 ) ) ;
    public final void rule__TaskRealizationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:263:1: ( ( ( rule__TaskRealizationModel__NameAssignment_2 ) ) )
            // InternalTaskRealization.g:264:1: ( ( rule__TaskRealizationModel__NameAssignment_2 ) )
            {
            // InternalTaskRealization.g:264:1: ( ( rule__TaskRealizationModel__NameAssignment_2 ) )
            // InternalTaskRealization.g:265:2: ( rule__TaskRealizationModel__NameAssignment_2 )
            {
             before(grammarAccess.getTaskRealizationModelAccess().getNameAssignment_2()); 
            // InternalTaskRealization.g:266:2: ( rule__TaskRealizationModel__NameAssignment_2 )
            // InternalTaskRealization.g:266:3: rule__TaskRealizationModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TaskRealizationModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskRealizationModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__2__Impl"


    // $ANTLR start "rule__TaskRealizationModel__Group__3"
    // InternalTaskRealization.g:274:1: rule__TaskRealizationModel__Group__3 : rule__TaskRealizationModel__Group__3__Impl rule__TaskRealizationModel__Group__4 ;
    public final void rule__TaskRealizationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:278:1: ( rule__TaskRealizationModel__Group__3__Impl rule__TaskRealizationModel__Group__4 )
            // InternalTaskRealization.g:279:2: rule__TaskRealizationModel__Group__3__Impl rule__TaskRealizationModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__TaskRealizationModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskRealizationModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__3"


    // $ANTLR start "rule__TaskRealizationModel__Group__3__Impl"
    // InternalTaskRealization.g:286:1: rule__TaskRealizationModel__Group__3__Impl : ( '{' ) ;
    public final void rule__TaskRealizationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:290:1: ( ( '{' ) )
            // InternalTaskRealization.g:291:1: ( '{' )
            {
            // InternalTaskRealization.g:291:1: ( '{' )
            // InternalTaskRealization.g:292:2: '{'
            {
             before(grammarAccess.getTaskRealizationModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTaskRealizationModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__3__Impl"


    // $ANTLR start "rule__TaskRealizationModel__Group__4"
    // InternalTaskRealization.g:301:1: rule__TaskRealizationModel__Group__4 : rule__TaskRealizationModel__Group__4__Impl rule__TaskRealizationModel__Group__5 ;
    public final void rule__TaskRealizationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:305:1: ( rule__TaskRealizationModel__Group__4__Impl rule__TaskRealizationModel__Group__5 )
            // InternalTaskRealization.g:306:2: rule__TaskRealizationModel__Group__4__Impl rule__TaskRealizationModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__TaskRealizationModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskRealizationModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__4"


    // $ANTLR start "rule__TaskRealizationModel__Group__4__Impl"
    // InternalTaskRealization.g:313:1: rule__TaskRealizationModel__Group__4__Impl : ( ( rule__TaskRealizationModel__AbstCoordInstAssignment_4 )* ) ;
    public final void rule__TaskRealizationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:317:1: ( ( ( rule__TaskRealizationModel__AbstCoordInstAssignment_4 )* ) )
            // InternalTaskRealization.g:318:1: ( ( rule__TaskRealizationModel__AbstCoordInstAssignment_4 )* )
            {
            // InternalTaskRealization.g:318:1: ( ( rule__TaskRealizationModel__AbstCoordInstAssignment_4 )* )
            // InternalTaskRealization.g:319:2: ( rule__TaskRealizationModel__AbstCoordInstAssignment_4 )*
            {
             before(grammarAccess.getTaskRealizationModelAccess().getAbstCoordInstAssignment_4()); 
            // InternalTaskRealization.g:320:2: ( rule__TaskRealizationModel__AbstCoordInstAssignment_4 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTaskRealization.g:320:3: rule__TaskRealizationModel__AbstCoordInstAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TaskRealizationModel__AbstCoordInstAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTaskRealizationModelAccess().getAbstCoordInstAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__4__Impl"


    // $ANTLR start "rule__TaskRealizationModel__Group__5"
    // InternalTaskRealization.g:328:1: rule__TaskRealizationModel__Group__5 : rule__TaskRealizationModel__Group__5__Impl rule__TaskRealizationModel__Group__6 ;
    public final void rule__TaskRealizationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:332:1: ( rule__TaskRealizationModel__Group__5__Impl rule__TaskRealizationModel__Group__6 )
            // InternalTaskRealization.g:333:2: rule__TaskRealizationModel__Group__5__Impl rule__TaskRealizationModel__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__TaskRealizationModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskRealizationModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__5"


    // $ANTLR start "rule__TaskRealizationModel__Group__5__Impl"
    // InternalTaskRealization.g:340:1: rule__TaskRealizationModel__Group__5__Impl : ( ( rule__TaskRealizationModel__TasksAssignment_5 )* ) ;
    public final void rule__TaskRealizationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:344:1: ( ( ( rule__TaskRealizationModel__TasksAssignment_5 )* ) )
            // InternalTaskRealization.g:345:1: ( ( rule__TaskRealizationModel__TasksAssignment_5 )* )
            {
            // InternalTaskRealization.g:345:1: ( ( rule__TaskRealizationModel__TasksAssignment_5 )* )
            // InternalTaskRealization.g:346:2: ( rule__TaskRealizationModel__TasksAssignment_5 )*
            {
             before(grammarAccess.getTaskRealizationModelAccess().getTasksAssignment_5()); 
            // InternalTaskRealization.g:347:2: ( rule__TaskRealizationModel__TasksAssignment_5 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTaskRealization.g:347:3: rule__TaskRealizationModel__TasksAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__TaskRealizationModel__TasksAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTaskRealizationModelAccess().getTasksAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__5__Impl"


    // $ANTLR start "rule__TaskRealizationModel__Group__6"
    // InternalTaskRealization.g:355:1: rule__TaskRealizationModel__Group__6 : rule__TaskRealizationModel__Group__6__Impl ;
    public final void rule__TaskRealizationModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:359:1: ( rule__TaskRealizationModel__Group__6__Impl )
            // InternalTaskRealization.g:360:2: rule__TaskRealizationModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskRealizationModel__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__6"


    // $ANTLR start "rule__TaskRealizationModel__Group__6__Impl"
    // InternalTaskRealization.g:366:1: rule__TaskRealizationModel__Group__6__Impl : ( '}' ) ;
    public final void rule__TaskRealizationModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:370:1: ( ( '}' ) )
            // InternalTaskRealization.g:371:1: ( '}' )
            {
            // InternalTaskRealization.g:371:1: ( '}' )
            // InternalTaskRealization.g:372:2: '}'
            {
             before(grammarAccess.getTaskRealizationModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTaskRealizationModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__Group__6__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalTaskRealization.g:382:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:386:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalTaskRealization.g:387:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalTaskRealization.g:394:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:398:1: ( ( RULE_ID ) )
            // InternalTaskRealization.g:399:1: ( RULE_ID )
            {
            // InternalTaskRealization.g:399:1: ( RULE_ID )
            // InternalTaskRealization.g:400:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalTaskRealization.g:409:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:413:1: ( rule__FQN__Group__1__Impl )
            // InternalTaskRealization.g:414:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalTaskRealization.g:420:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:424:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalTaskRealization.g:425:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalTaskRealization.g:425:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalTaskRealization.g:426:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalTaskRealization.g:427:2: ( rule__FQN__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTaskRealization.g:427:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalTaskRealization.g:436:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:440:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalTaskRealization.g:441:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalTaskRealization.g:448:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:452:1: ( ( '.' ) )
            // InternalTaskRealization.g:453:1: ( '.' )
            {
            // InternalTaskRealization.g:453:1: ( '.' )
            // InternalTaskRealization.g:454:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalTaskRealization.g:463:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:467:1: ( rule__FQN__Group_1__1__Impl )
            // InternalTaskRealization.g:468:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalTaskRealization.g:474:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:478:1: ( ( RULE_ID ) )
            // InternalTaskRealization.g:479:1: ( RULE_ID )
            {
            // InternalTaskRealization.g:479:1: ( RULE_ID )
            // InternalTaskRealization.g:480:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__TaskRealization__Group__0"
    // InternalTaskRealization.g:490:1: rule__TaskRealization__Group__0 : rule__TaskRealization__Group__0__Impl rule__TaskRealization__Group__1 ;
    public final void rule__TaskRealization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:494:1: ( rule__TaskRealization__Group__0__Impl rule__TaskRealization__Group__1 )
            // InternalTaskRealization.g:495:2: rule__TaskRealization__Group__0__Impl rule__TaskRealization__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TaskRealization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskRealization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealization__Group__0"


    // $ANTLR start "rule__TaskRealization__Group__0__Impl"
    // InternalTaskRealization.g:502:1: rule__TaskRealization__Group__0__Impl : ( 'TaskRealization' ) ;
    public final void rule__TaskRealization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:506:1: ( ( 'TaskRealization' ) )
            // InternalTaskRealization.g:507:1: ( 'TaskRealization' )
            {
            // InternalTaskRealization.g:507:1: ( 'TaskRealization' )
            // InternalTaskRealization.g:508:2: 'TaskRealization'
            {
             before(grammarAccess.getTaskRealizationAccess().getTaskRealizationKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTaskRealizationAccess().getTaskRealizationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealization__Group__0__Impl"


    // $ANTLR start "rule__TaskRealization__Group__1"
    // InternalTaskRealization.g:517:1: rule__TaskRealization__Group__1 : rule__TaskRealization__Group__1__Impl rule__TaskRealization__Group__2 ;
    public final void rule__TaskRealization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:521:1: ( rule__TaskRealization__Group__1__Impl rule__TaskRealization__Group__2 )
            // InternalTaskRealization.g:522:2: rule__TaskRealization__Group__1__Impl rule__TaskRealization__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TaskRealization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskRealization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealization__Group__1"


    // $ANTLR start "rule__TaskRealization__Group__1__Impl"
    // InternalTaskRealization.g:529:1: rule__TaskRealization__Group__1__Impl : ( ( rule__TaskRealization__TaskDefAssignment_1 ) ) ;
    public final void rule__TaskRealization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:533:1: ( ( ( rule__TaskRealization__TaskDefAssignment_1 ) ) )
            // InternalTaskRealization.g:534:1: ( ( rule__TaskRealization__TaskDefAssignment_1 ) )
            {
            // InternalTaskRealization.g:534:1: ( ( rule__TaskRealization__TaskDefAssignment_1 ) )
            // InternalTaskRealization.g:535:2: ( rule__TaskRealization__TaskDefAssignment_1 )
            {
             before(grammarAccess.getTaskRealizationAccess().getTaskDefAssignment_1()); 
            // InternalTaskRealization.g:536:2: ( rule__TaskRealization__TaskDefAssignment_1 )
            // InternalTaskRealization.g:536:3: rule__TaskRealization__TaskDefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskRealization__TaskDefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskRealizationAccess().getTaskDefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealization__Group__1__Impl"


    // $ANTLR start "rule__TaskRealization__Group__2"
    // InternalTaskRealization.g:544:1: rule__TaskRealization__Group__2 : rule__TaskRealization__Group__2__Impl rule__TaskRealization__Group__3 ;
    public final void rule__TaskRealization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:548:1: ( rule__TaskRealization__Group__2__Impl rule__TaskRealization__Group__3 )
            // InternalTaskRealization.g:549:2: rule__TaskRealization__Group__2__Impl rule__TaskRealization__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__TaskRealization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskRealization__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealization__Group__2"


    // $ANTLR start "rule__TaskRealization__Group__2__Impl"
    // InternalTaskRealization.g:556:1: rule__TaskRealization__Group__2__Impl : ( '{' ) ;
    public final void rule__TaskRealization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:560:1: ( ( '{' ) )
            // InternalTaskRealization.g:561:1: ( '{' )
            {
            // InternalTaskRealization.g:561:1: ( '{' )
            // InternalTaskRealization.g:562:2: '{'
            {
             before(grammarAccess.getTaskRealizationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTaskRealizationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealization__Group__2__Impl"


    // $ANTLR start "rule__TaskRealization__Group__3"
    // InternalTaskRealization.g:571:1: rule__TaskRealization__Group__3 : rule__TaskRealization__Group__3__Impl ;
    public final void rule__TaskRealization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:575:1: ( rule__TaskRealization__Group__3__Impl )
            // InternalTaskRealization.g:576:2: rule__TaskRealization__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskRealization__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealization__Group__3"


    // $ANTLR start "rule__TaskRealization__Group__3__Impl"
    // InternalTaskRealization.g:582:1: rule__TaskRealization__Group__3__Impl : ( '}' ) ;
    public final void rule__TaskRealization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:586:1: ( ( '}' ) )
            // InternalTaskRealization.g:587:1: ( '}' )
            {
            // InternalTaskRealization.g:587:1: ( '}' )
            // InternalTaskRealization.g:588:2: '}'
            {
             before(grammarAccess.getTaskRealizationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTaskRealizationAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealization__Group__3__Impl"


    // $ANTLR start "rule__AbstractCoordinationModuleInstance__Group__0"
    // InternalTaskRealization.g:598:1: rule__AbstractCoordinationModuleInstance__Group__0 : rule__AbstractCoordinationModuleInstance__Group__0__Impl rule__AbstractCoordinationModuleInstance__Group__1 ;
    public final void rule__AbstractCoordinationModuleInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:602:1: ( rule__AbstractCoordinationModuleInstance__Group__0__Impl rule__AbstractCoordinationModuleInstance__Group__1 )
            // InternalTaskRealization.g:603:2: rule__AbstractCoordinationModuleInstance__Group__0__Impl rule__AbstractCoordinationModuleInstance__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AbstractCoordinationModuleInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractCoordinationModuleInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCoordinationModuleInstance__Group__0"


    // $ANTLR start "rule__AbstractCoordinationModuleInstance__Group__0__Impl"
    // InternalTaskRealization.g:610:1: rule__AbstractCoordinationModuleInstance__Group__0__Impl : ( 'AbstractCoordinationModuleInstance' ) ;
    public final void rule__AbstractCoordinationModuleInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:614:1: ( ( 'AbstractCoordinationModuleInstance' ) )
            // InternalTaskRealization.g:615:1: ( 'AbstractCoordinationModuleInstance' )
            {
            // InternalTaskRealization.g:615:1: ( 'AbstractCoordinationModuleInstance' )
            // InternalTaskRealization.g:616:2: 'AbstractCoordinationModuleInstance'
            {
             before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getAbstractCoordinationModuleInstanceKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getAbstractCoordinationModuleInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCoordinationModuleInstance__Group__0__Impl"


    // $ANTLR start "rule__AbstractCoordinationModuleInstance__Group__1"
    // InternalTaskRealization.g:625:1: rule__AbstractCoordinationModuleInstance__Group__1 : rule__AbstractCoordinationModuleInstance__Group__1__Impl rule__AbstractCoordinationModuleInstance__Group__2 ;
    public final void rule__AbstractCoordinationModuleInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:629:1: ( rule__AbstractCoordinationModuleInstance__Group__1__Impl rule__AbstractCoordinationModuleInstance__Group__2 )
            // InternalTaskRealization.g:630:2: rule__AbstractCoordinationModuleInstance__Group__1__Impl rule__AbstractCoordinationModuleInstance__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__AbstractCoordinationModuleInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractCoordinationModuleInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCoordinationModuleInstance__Group__1"


    // $ANTLR start "rule__AbstractCoordinationModuleInstance__Group__1__Impl"
    // InternalTaskRealization.g:637:1: rule__AbstractCoordinationModuleInstance__Group__1__Impl : ( ( rule__AbstractCoordinationModuleInstance__NameAssignment_1 ) ) ;
    public final void rule__AbstractCoordinationModuleInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:641:1: ( ( ( rule__AbstractCoordinationModuleInstance__NameAssignment_1 ) ) )
            // InternalTaskRealization.g:642:1: ( ( rule__AbstractCoordinationModuleInstance__NameAssignment_1 ) )
            {
            // InternalTaskRealization.g:642:1: ( ( rule__AbstractCoordinationModuleInstance__NameAssignment_1 ) )
            // InternalTaskRealization.g:643:2: ( rule__AbstractCoordinationModuleInstance__NameAssignment_1 )
            {
             before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getNameAssignment_1()); 
            // InternalTaskRealization.g:644:2: ( rule__AbstractCoordinationModuleInstance__NameAssignment_1 )
            // InternalTaskRealization.g:644:3: rule__AbstractCoordinationModuleInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCoordinationModuleInstance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCoordinationModuleInstance__Group__1__Impl"


    // $ANTLR start "rule__AbstractCoordinationModuleInstance__Group__2"
    // InternalTaskRealization.g:652:1: rule__AbstractCoordinationModuleInstance__Group__2 : rule__AbstractCoordinationModuleInstance__Group__2__Impl rule__AbstractCoordinationModuleInstance__Group__3 ;
    public final void rule__AbstractCoordinationModuleInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:656:1: ( rule__AbstractCoordinationModuleInstance__Group__2__Impl rule__AbstractCoordinationModuleInstance__Group__3 )
            // InternalTaskRealization.g:657:2: rule__AbstractCoordinationModuleInstance__Group__2__Impl rule__AbstractCoordinationModuleInstance__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AbstractCoordinationModuleInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractCoordinationModuleInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCoordinationModuleInstance__Group__2"


    // $ANTLR start "rule__AbstractCoordinationModuleInstance__Group__2__Impl"
    // InternalTaskRealization.g:664:1: rule__AbstractCoordinationModuleInstance__Group__2__Impl : ( 'coordModuleDef' ) ;
    public final void rule__AbstractCoordinationModuleInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:668:1: ( ( 'coordModuleDef' ) )
            // InternalTaskRealization.g:669:1: ( 'coordModuleDef' )
            {
            // InternalTaskRealization.g:669:1: ( 'coordModuleDef' )
            // InternalTaskRealization.g:670:2: 'coordModuleDef'
            {
             before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCoordinationModuleInstance__Group__2__Impl"


    // $ANTLR start "rule__AbstractCoordinationModuleInstance__Group__3"
    // InternalTaskRealization.g:679:1: rule__AbstractCoordinationModuleInstance__Group__3 : rule__AbstractCoordinationModuleInstance__Group__3__Impl ;
    public final void rule__AbstractCoordinationModuleInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:683:1: ( rule__AbstractCoordinationModuleInstance__Group__3__Impl )
            // InternalTaskRealization.g:684:2: rule__AbstractCoordinationModuleInstance__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCoordinationModuleInstance__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCoordinationModuleInstance__Group__3"


    // $ANTLR start "rule__AbstractCoordinationModuleInstance__Group__3__Impl"
    // InternalTaskRealization.g:690:1: rule__AbstractCoordinationModuleInstance__Group__3__Impl : ( ( rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3 ) ) ;
    public final void rule__AbstractCoordinationModuleInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:694:1: ( ( ( rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3 ) ) )
            // InternalTaskRealization.g:695:1: ( ( rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3 ) )
            {
            // InternalTaskRealization.g:695:1: ( ( rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3 ) )
            // InternalTaskRealization.g:696:2: ( rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3 )
            {
             before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefAssignment_3()); 
            // InternalTaskRealization.g:697:2: ( rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3 )
            // InternalTaskRealization.g:697:3: rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCoordinationModuleInstance__Group__3__Impl"


    // $ANTLR start "rule__TaskRealizationModel__NameAssignment_2"
    // InternalTaskRealization.g:706:1: rule__TaskRealizationModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TaskRealizationModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:710:1: ( ( RULE_ID ) )
            // InternalTaskRealization.g:711:2: ( RULE_ID )
            {
            // InternalTaskRealization.g:711:2: ( RULE_ID )
            // InternalTaskRealization.g:712:3: RULE_ID
            {
             before(grammarAccess.getTaskRealizationModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskRealizationModelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__NameAssignment_2"


    // $ANTLR start "rule__TaskRealizationModel__AbstCoordInstAssignment_4"
    // InternalTaskRealization.g:721:1: rule__TaskRealizationModel__AbstCoordInstAssignment_4 : ( ruleAbstractCoordinationModuleInstance ) ;
    public final void rule__TaskRealizationModel__AbstCoordInstAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:725:1: ( ( ruleAbstractCoordinationModuleInstance ) )
            // InternalTaskRealization.g:726:2: ( ruleAbstractCoordinationModuleInstance )
            {
            // InternalTaskRealization.g:726:2: ( ruleAbstractCoordinationModuleInstance )
            // InternalTaskRealization.g:727:3: ruleAbstractCoordinationModuleInstance
            {
             before(grammarAccess.getTaskRealizationModelAccess().getAbstCoordInstAbstractCoordinationModuleInstanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractCoordinationModuleInstance();

            state._fsp--;

             after(grammarAccess.getTaskRealizationModelAccess().getAbstCoordInstAbstractCoordinationModuleInstanceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__AbstCoordInstAssignment_4"


    // $ANTLR start "rule__TaskRealizationModel__TasksAssignment_5"
    // InternalTaskRealization.g:736:1: rule__TaskRealizationModel__TasksAssignment_5 : ( ruleTaskRealization ) ;
    public final void rule__TaskRealizationModel__TasksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:740:1: ( ( ruleTaskRealization ) )
            // InternalTaskRealization.g:741:2: ( ruleTaskRealization )
            {
            // InternalTaskRealization.g:741:2: ( ruleTaskRealization )
            // InternalTaskRealization.g:742:3: ruleTaskRealization
            {
             before(grammarAccess.getTaskRealizationModelAccess().getTasksTaskRealizationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskRealization();

            state._fsp--;

             after(grammarAccess.getTaskRealizationModelAccess().getTasksTaskRealizationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModel__TasksAssignment_5"


    // $ANTLR start "rule__TaskRealization__TaskDefAssignment_1"
    // InternalTaskRealization.g:751:1: rule__TaskRealization__TaskDefAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__TaskRealization__TaskDefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:755:1: ( ( ( ruleFQN ) ) )
            // InternalTaskRealization.g:756:2: ( ( ruleFQN ) )
            {
            // InternalTaskRealization.g:756:2: ( ( ruleFQN ) )
            // InternalTaskRealization.g:757:3: ( ruleFQN )
            {
             before(grammarAccess.getTaskRealizationAccess().getTaskDefTaskDefinitionCrossReference_1_0()); 
            // InternalTaskRealization.g:758:3: ( ruleFQN )
            // InternalTaskRealization.g:759:4: ruleFQN
            {
             before(grammarAccess.getTaskRealizationAccess().getTaskDefTaskDefinitionFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getTaskRealizationAccess().getTaskDefTaskDefinitionFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTaskRealizationAccess().getTaskDefTaskDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealization__TaskDefAssignment_1"


    // $ANTLR start "rule__AbstractCoordinationModuleInstance__NameAssignment_1"
    // InternalTaskRealization.g:770:1: rule__AbstractCoordinationModuleInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AbstractCoordinationModuleInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:774:1: ( ( RULE_ID ) )
            // InternalTaskRealization.g:775:2: ( RULE_ID )
            {
            // InternalTaskRealization.g:775:2: ( RULE_ID )
            // InternalTaskRealization.g:776:3: RULE_ID
            {
             before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCoordinationModuleInstance__NameAssignment_1"


    // $ANTLR start "rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3"
    // InternalTaskRealization.g:785:1: rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskRealization.g:789:1: ( ( ( ruleFQN ) ) )
            // InternalTaskRealization.g:790:2: ( ( ruleFQN ) )
            {
            // InternalTaskRealization.g:790:2: ( ( ruleFQN ) )
            // InternalTaskRealization.g:791:3: ( ruleFQN )
            {
             before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefCoordinationModuleDefinitionCrossReference_3_0()); 
            // InternalTaskRealization.g:792:3: ( ruleFQN )
            // InternalTaskRealization.g:793:4: ruleFQN
            {
             before(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefCoordinationModuleDefinitionFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAbstractCoordinationModuleInstanceAccess().getCoordModuleDefCoordinationModuleDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractCoordinationModuleInstance__CoordModuleDefAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});

}