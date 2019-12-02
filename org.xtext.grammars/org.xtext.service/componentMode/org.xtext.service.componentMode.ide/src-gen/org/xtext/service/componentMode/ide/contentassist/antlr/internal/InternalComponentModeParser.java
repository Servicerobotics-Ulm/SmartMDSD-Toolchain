package org.xtext.service.componentMode.ide.contentassist.antlr.internal;

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
import org.xtext.service.componentMode.services.ComponentModeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentModeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentModeRepository'", "'{'", "'}'", "'ComponentModeCollection'", "'ComponentModeDefinition'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalComponentModeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentModeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentModeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentMode.g"; }


    	private ComponentModeGrammarAccess grammarAccess;

    	public void setGrammarAccess(ComponentModeGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleComponentModeModel"
    // InternalComponentMode.g:68:1: entryRuleComponentModeModel : ruleComponentModeModel EOF ;
    public final void entryRuleComponentModeModel() throws RecognitionException {
        try {
            // InternalComponentMode.g:69:1: ( ruleComponentModeModel EOF )
            // InternalComponentMode.g:70:1: ruleComponentModeModel EOF
            {
             before(grammarAccess.getComponentModeModelRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentModeModel();

            state._fsp--;

             after(grammarAccess.getComponentModeModelRule()); 
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
    // $ANTLR end "entryRuleComponentModeModel"


    // $ANTLR start "ruleComponentModeModel"
    // InternalComponentMode.g:77:1: ruleComponentModeModel : ( ( rule__ComponentModeModel__Group__0 ) ) ;
    public final void ruleComponentModeModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:81:2: ( ( ( rule__ComponentModeModel__Group__0 ) ) )
            // InternalComponentMode.g:82:2: ( ( rule__ComponentModeModel__Group__0 ) )
            {
            // InternalComponentMode.g:82:2: ( ( rule__ComponentModeModel__Group__0 ) )
            // InternalComponentMode.g:83:3: ( rule__ComponentModeModel__Group__0 )
            {
             before(grammarAccess.getComponentModeModelAccess().getGroup()); 
            // InternalComponentMode.g:84:3: ( rule__ComponentModeModel__Group__0 )
            // InternalComponentMode.g:84:4: rule__ComponentModeModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentModeModelAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentModeModel"


    // $ANTLR start "entryRuleComponentModeRepository"
    // InternalComponentMode.g:93:1: entryRuleComponentModeRepository : ruleComponentModeRepository EOF ;
    public final void entryRuleComponentModeRepository() throws RecognitionException {
        try {
            // InternalComponentMode.g:94:1: ( ruleComponentModeRepository EOF )
            // InternalComponentMode.g:95:1: ruleComponentModeRepository EOF
            {
             before(grammarAccess.getComponentModeRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentModeRepository();

            state._fsp--;

             after(grammarAccess.getComponentModeRepositoryRule()); 
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
    // $ANTLR end "entryRuleComponentModeRepository"


    // $ANTLR start "ruleComponentModeRepository"
    // InternalComponentMode.g:102:1: ruleComponentModeRepository : ( ( rule__ComponentModeRepository__Group__0 ) ) ;
    public final void ruleComponentModeRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:106:2: ( ( ( rule__ComponentModeRepository__Group__0 ) ) )
            // InternalComponentMode.g:107:2: ( ( rule__ComponentModeRepository__Group__0 ) )
            {
            // InternalComponentMode.g:107:2: ( ( rule__ComponentModeRepository__Group__0 ) )
            // InternalComponentMode.g:108:3: ( rule__ComponentModeRepository__Group__0 )
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getGroup()); 
            // InternalComponentMode.g:109:3: ( rule__ComponentModeRepository__Group__0 )
            // InternalComponentMode.g:109:4: rule__ComponentModeRepository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentModeRepositoryAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentModeRepository"


    // $ANTLR start "entryRuleComponentModeCollection"
    // InternalComponentMode.g:118:1: entryRuleComponentModeCollection : ruleComponentModeCollection EOF ;
    public final void entryRuleComponentModeCollection() throws RecognitionException {
        try {
            // InternalComponentMode.g:119:1: ( ruleComponentModeCollection EOF )
            // InternalComponentMode.g:120:1: ruleComponentModeCollection EOF
            {
             before(grammarAccess.getComponentModeCollectionRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentModeCollection();

            state._fsp--;

             after(grammarAccess.getComponentModeCollectionRule()); 
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
    // $ANTLR end "entryRuleComponentModeCollection"


    // $ANTLR start "ruleComponentModeCollection"
    // InternalComponentMode.g:127:1: ruleComponentModeCollection : ( ( rule__ComponentModeCollection__Group__0 ) ) ;
    public final void ruleComponentModeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:131:2: ( ( ( rule__ComponentModeCollection__Group__0 ) ) )
            // InternalComponentMode.g:132:2: ( ( rule__ComponentModeCollection__Group__0 ) )
            {
            // InternalComponentMode.g:132:2: ( ( rule__ComponentModeCollection__Group__0 ) )
            // InternalComponentMode.g:133:3: ( rule__ComponentModeCollection__Group__0 )
            {
             before(grammarAccess.getComponentModeCollectionAccess().getGroup()); 
            // InternalComponentMode.g:134:3: ( rule__ComponentModeCollection__Group__0 )
            // InternalComponentMode.g:134:4: rule__ComponentModeCollection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeCollection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentModeCollectionAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentModeCollection"


    // $ANTLR start "entryRuleComponentModeDefinition"
    // InternalComponentMode.g:143:1: entryRuleComponentModeDefinition : ruleComponentModeDefinition EOF ;
    public final void entryRuleComponentModeDefinition() throws RecognitionException {
        try {
            // InternalComponentMode.g:144:1: ( ruleComponentModeDefinition EOF )
            // InternalComponentMode.g:145:1: ruleComponentModeDefinition EOF
            {
             before(grammarAccess.getComponentModeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentModeDefinition();

            state._fsp--;

             after(grammarAccess.getComponentModeDefinitionRule()); 
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
    // $ANTLR end "entryRuleComponentModeDefinition"


    // $ANTLR start "ruleComponentModeDefinition"
    // InternalComponentMode.g:152:1: ruleComponentModeDefinition : ( ( rule__ComponentModeDefinition__Group__0 ) ) ;
    public final void ruleComponentModeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:156:2: ( ( ( rule__ComponentModeDefinition__Group__0 ) ) )
            // InternalComponentMode.g:157:2: ( ( rule__ComponentModeDefinition__Group__0 ) )
            {
            // InternalComponentMode.g:157:2: ( ( rule__ComponentModeDefinition__Group__0 ) )
            // InternalComponentMode.g:158:3: ( rule__ComponentModeDefinition__Group__0 )
            {
             before(grammarAccess.getComponentModeDefinitionAccess().getGroup()); 
            // InternalComponentMode.g:159:3: ( rule__ComponentModeDefinition__Group__0 )
            // InternalComponentMode.g:159:4: rule__ComponentModeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentModeDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentModeDefinition"


    // $ANTLR start "rule__ComponentModeModel__Group__0"
    // InternalComponentMode.g:167:1: rule__ComponentModeModel__Group__0 : rule__ComponentModeModel__Group__0__Impl rule__ComponentModeModel__Group__1 ;
    public final void rule__ComponentModeModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:171:1: ( rule__ComponentModeModel__Group__0__Impl rule__ComponentModeModel__Group__1 )
            // InternalComponentMode.g:172:2: rule__ComponentModeModel__Group__0__Impl rule__ComponentModeModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentModeModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeModel__Group__1();

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
    // $ANTLR end "rule__ComponentModeModel__Group__0"


    // $ANTLR start "rule__ComponentModeModel__Group__0__Impl"
    // InternalComponentMode.g:179:1: rule__ComponentModeModel__Group__0__Impl : ( () ) ;
    public final void rule__ComponentModeModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:183:1: ( ( () ) )
            // InternalComponentMode.g:184:1: ( () )
            {
            // InternalComponentMode.g:184:1: ( () )
            // InternalComponentMode.g:185:2: ()
            {
             before(grammarAccess.getComponentModeModelAccess().getComponentModeModelAction_0()); 
            // InternalComponentMode.g:186:2: ()
            // InternalComponentMode.g:186:3: 
            {
            }

             after(grammarAccess.getComponentModeModelAccess().getComponentModeModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeModel__Group__0__Impl"


    // $ANTLR start "rule__ComponentModeModel__Group__1"
    // InternalComponentMode.g:194:1: rule__ComponentModeModel__Group__1 : rule__ComponentModeModel__Group__1__Impl ;
    public final void rule__ComponentModeModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:198:1: ( rule__ComponentModeModel__Group__1__Impl )
            // InternalComponentMode.g:199:2: rule__ComponentModeModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeModel__Group__1__Impl();

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
    // $ANTLR end "rule__ComponentModeModel__Group__1"


    // $ANTLR start "rule__ComponentModeModel__Group__1__Impl"
    // InternalComponentMode.g:205:1: rule__ComponentModeModel__Group__1__Impl : ( ( rule__ComponentModeModel__RepositoryAssignment_1 )? ) ;
    public final void rule__ComponentModeModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:209:1: ( ( ( rule__ComponentModeModel__RepositoryAssignment_1 )? ) )
            // InternalComponentMode.g:210:1: ( ( rule__ComponentModeModel__RepositoryAssignment_1 )? )
            {
            // InternalComponentMode.g:210:1: ( ( rule__ComponentModeModel__RepositoryAssignment_1 )? )
            // InternalComponentMode.g:211:2: ( rule__ComponentModeModel__RepositoryAssignment_1 )?
            {
             before(grammarAccess.getComponentModeModelAccess().getRepositoryAssignment_1()); 
            // InternalComponentMode.g:212:2: ( rule__ComponentModeModel__RepositoryAssignment_1 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentMode.g:212:3: rule__ComponentModeModel__RepositoryAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentModeModel__RepositoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentModeModelAccess().getRepositoryAssignment_1()); 

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
    // $ANTLR end "rule__ComponentModeModel__Group__1__Impl"


    // $ANTLR start "rule__ComponentModeRepository__Group__0"
    // InternalComponentMode.g:221:1: rule__ComponentModeRepository__Group__0 : rule__ComponentModeRepository__Group__0__Impl rule__ComponentModeRepository__Group__1 ;
    public final void rule__ComponentModeRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:225:1: ( rule__ComponentModeRepository__Group__0__Impl rule__ComponentModeRepository__Group__1 )
            // InternalComponentMode.g:226:2: rule__ComponentModeRepository__Group__0__Impl rule__ComponentModeRepository__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentModeRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeRepository__Group__1();

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
    // $ANTLR end "rule__ComponentModeRepository__Group__0"


    // $ANTLR start "rule__ComponentModeRepository__Group__0__Impl"
    // InternalComponentMode.g:233:1: rule__ComponentModeRepository__Group__0__Impl : ( () ) ;
    public final void rule__ComponentModeRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:237:1: ( ( () ) )
            // InternalComponentMode.g:238:1: ( () )
            {
            // InternalComponentMode.g:238:1: ( () )
            // InternalComponentMode.g:239:2: ()
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryAction_0()); 
            // InternalComponentMode.g:240:2: ()
            // InternalComponentMode.g:240:3: 
            {
            }

             after(grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeRepository__Group__0__Impl"


    // $ANTLR start "rule__ComponentModeRepository__Group__1"
    // InternalComponentMode.g:248:1: rule__ComponentModeRepository__Group__1 : rule__ComponentModeRepository__Group__1__Impl rule__ComponentModeRepository__Group__2 ;
    public final void rule__ComponentModeRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:252:1: ( rule__ComponentModeRepository__Group__1__Impl rule__ComponentModeRepository__Group__2 )
            // InternalComponentMode.g:253:2: rule__ComponentModeRepository__Group__1__Impl rule__ComponentModeRepository__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentModeRepository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeRepository__Group__2();

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
    // $ANTLR end "rule__ComponentModeRepository__Group__1"


    // $ANTLR start "rule__ComponentModeRepository__Group__1__Impl"
    // InternalComponentMode.g:260:1: rule__ComponentModeRepository__Group__1__Impl : ( 'ComponentModeRepository' ) ;
    public final void rule__ComponentModeRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:264:1: ( ( 'ComponentModeRepository' ) )
            // InternalComponentMode.g:265:1: ( 'ComponentModeRepository' )
            {
            // InternalComponentMode.g:265:1: ( 'ComponentModeRepository' )
            // InternalComponentMode.g:266:2: 'ComponentModeRepository'
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryKeyword_1()); 

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
    // $ANTLR end "rule__ComponentModeRepository__Group__1__Impl"


    // $ANTLR start "rule__ComponentModeRepository__Group__2"
    // InternalComponentMode.g:275:1: rule__ComponentModeRepository__Group__2 : rule__ComponentModeRepository__Group__2__Impl rule__ComponentModeRepository__Group__3 ;
    public final void rule__ComponentModeRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:279:1: ( rule__ComponentModeRepository__Group__2__Impl rule__ComponentModeRepository__Group__3 )
            // InternalComponentMode.g:280:2: rule__ComponentModeRepository__Group__2__Impl rule__ComponentModeRepository__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComponentModeRepository__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeRepository__Group__3();

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
    // $ANTLR end "rule__ComponentModeRepository__Group__2"


    // $ANTLR start "rule__ComponentModeRepository__Group__2__Impl"
    // InternalComponentMode.g:287:1: rule__ComponentModeRepository__Group__2__Impl : ( ( rule__ComponentModeRepository__NameAssignment_2 ) ) ;
    public final void rule__ComponentModeRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:291:1: ( ( ( rule__ComponentModeRepository__NameAssignment_2 ) ) )
            // InternalComponentMode.g:292:1: ( ( rule__ComponentModeRepository__NameAssignment_2 ) )
            {
            // InternalComponentMode.g:292:1: ( ( rule__ComponentModeRepository__NameAssignment_2 ) )
            // InternalComponentMode.g:293:2: ( rule__ComponentModeRepository__NameAssignment_2 )
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getNameAssignment_2()); 
            // InternalComponentMode.g:294:2: ( rule__ComponentModeRepository__NameAssignment_2 )
            // InternalComponentMode.g:294:3: rule__ComponentModeRepository__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeRepository__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentModeRepositoryAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ComponentModeRepository__Group__2__Impl"


    // $ANTLR start "rule__ComponentModeRepository__Group__3"
    // InternalComponentMode.g:302:1: rule__ComponentModeRepository__Group__3 : rule__ComponentModeRepository__Group__3__Impl rule__ComponentModeRepository__Group__4 ;
    public final void rule__ComponentModeRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:306:1: ( rule__ComponentModeRepository__Group__3__Impl rule__ComponentModeRepository__Group__4 )
            // InternalComponentMode.g:307:2: rule__ComponentModeRepository__Group__3__Impl rule__ComponentModeRepository__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ComponentModeRepository__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeRepository__Group__4();

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
    // $ANTLR end "rule__ComponentModeRepository__Group__3"


    // $ANTLR start "rule__ComponentModeRepository__Group__3__Impl"
    // InternalComponentMode.g:314:1: rule__ComponentModeRepository__Group__3__Impl : ( '{' ) ;
    public final void rule__ComponentModeRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:318:1: ( ( '{' ) )
            // InternalComponentMode.g:319:1: ( '{' )
            {
            // InternalComponentMode.g:319:1: ( '{' )
            // InternalComponentMode.g:320:2: '{'
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentModeRepositoryAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ComponentModeRepository__Group__3__Impl"


    // $ANTLR start "rule__ComponentModeRepository__Group__4"
    // InternalComponentMode.g:329:1: rule__ComponentModeRepository__Group__4 : rule__ComponentModeRepository__Group__4__Impl rule__ComponentModeRepository__Group__5 ;
    public final void rule__ComponentModeRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:333:1: ( rule__ComponentModeRepository__Group__4__Impl rule__ComponentModeRepository__Group__5 )
            // InternalComponentMode.g:334:2: rule__ComponentModeRepository__Group__4__Impl rule__ComponentModeRepository__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ComponentModeRepository__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeRepository__Group__5();

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
    // $ANTLR end "rule__ComponentModeRepository__Group__4"


    // $ANTLR start "rule__ComponentModeRepository__Group__4__Impl"
    // InternalComponentMode.g:341:1: rule__ComponentModeRepository__Group__4__Impl : ( ( rule__ComponentModeRepository__CollectionsAssignment_4 )* ) ;
    public final void rule__ComponentModeRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:345:1: ( ( ( rule__ComponentModeRepository__CollectionsAssignment_4 )* ) )
            // InternalComponentMode.g:346:1: ( ( rule__ComponentModeRepository__CollectionsAssignment_4 )* )
            {
            // InternalComponentMode.g:346:1: ( ( rule__ComponentModeRepository__CollectionsAssignment_4 )* )
            // InternalComponentMode.g:347:2: ( rule__ComponentModeRepository__CollectionsAssignment_4 )*
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getCollectionsAssignment_4()); 
            // InternalComponentMode.g:348:2: ( rule__ComponentModeRepository__CollectionsAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComponentMode.g:348:3: rule__ComponentModeRepository__CollectionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ComponentModeRepository__CollectionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getComponentModeRepositoryAccess().getCollectionsAssignment_4()); 

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
    // $ANTLR end "rule__ComponentModeRepository__Group__4__Impl"


    // $ANTLR start "rule__ComponentModeRepository__Group__5"
    // InternalComponentMode.g:356:1: rule__ComponentModeRepository__Group__5 : rule__ComponentModeRepository__Group__5__Impl ;
    public final void rule__ComponentModeRepository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:360:1: ( rule__ComponentModeRepository__Group__5__Impl )
            // InternalComponentMode.g:361:2: rule__ComponentModeRepository__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeRepository__Group__5__Impl();

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
    // $ANTLR end "rule__ComponentModeRepository__Group__5"


    // $ANTLR start "rule__ComponentModeRepository__Group__5__Impl"
    // InternalComponentMode.g:367:1: rule__ComponentModeRepository__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentModeRepository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:371:1: ( ( '}' ) )
            // InternalComponentMode.g:372:1: ( '}' )
            {
            // InternalComponentMode.g:372:1: ( '}' )
            // InternalComponentMode.g:373:2: '}'
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentModeRepositoryAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ComponentModeRepository__Group__5__Impl"


    // $ANTLR start "rule__ComponentModeCollection__Group__0"
    // InternalComponentMode.g:383:1: rule__ComponentModeCollection__Group__0 : rule__ComponentModeCollection__Group__0__Impl rule__ComponentModeCollection__Group__1 ;
    public final void rule__ComponentModeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:387:1: ( rule__ComponentModeCollection__Group__0__Impl rule__ComponentModeCollection__Group__1 )
            // InternalComponentMode.g:388:2: rule__ComponentModeCollection__Group__0__Impl rule__ComponentModeCollection__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ComponentModeCollection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeCollection__Group__1();

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
    // $ANTLR end "rule__ComponentModeCollection__Group__0"


    // $ANTLR start "rule__ComponentModeCollection__Group__0__Impl"
    // InternalComponentMode.g:395:1: rule__ComponentModeCollection__Group__0__Impl : ( () ) ;
    public final void rule__ComponentModeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:399:1: ( ( () ) )
            // InternalComponentMode.g:400:1: ( () )
            {
            // InternalComponentMode.g:400:1: ( () )
            // InternalComponentMode.g:401:2: ()
            {
             before(grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionAction_0()); 
            // InternalComponentMode.g:402:2: ()
            // InternalComponentMode.g:402:3: 
            {
            }

             after(grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeCollection__Group__0__Impl"


    // $ANTLR start "rule__ComponentModeCollection__Group__1"
    // InternalComponentMode.g:410:1: rule__ComponentModeCollection__Group__1 : rule__ComponentModeCollection__Group__1__Impl rule__ComponentModeCollection__Group__2 ;
    public final void rule__ComponentModeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:414:1: ( rule__ComponentModeCollection__Group__1__Impl rule__ComponentModeCollection__Group__2 )
            // InternalComponentMode.g:415:2: rule__ComponentModeCollection__Group__1__Impl rule__ComponentModeCollection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentModeCollection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeCollection__Group__2();

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
    // $ANTLR end "rule__ComponentModeCollection__Group__1"


    // $ANTLR start "rule__ComponentModeCollection__Group__1__Impl"
    // InternalComponentMode.g:422:1: rule__ComponentModeCollection__Group__1__Impl : ( 'ComponentModeCollection' ) ;
    public final void rule__ComponentModeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:426:1: ( ( 'ComponentModeCollection' ) )
            // InternalComponentMode.g:427:1: ( 'ComponentModeCollection' )
            {
            // InternalComponentMode.g:427:1: ( 'ComponentModeCollection' )
            // InternalComponentMode.g:428:2: 'ComponentModeCollection'
            {
             before(grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionKeyword_1()); 

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
    // $ANTLR end "rule__ComponentModeCollection__Group__1__Impl"


    // $ANTLR start "rule__ComponentModeCollection__Group__2"
    // InternalComponentMode.g:437:1: rule__ComponentModeCollection__Group__2 : rule__ComponentModeCollection__Group__2__Impl rule__ComponentModeCollection__Group__3 ;
    public final void rule__ComponentModeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:441:1: ( rule__ComponentModeCollection__Group__2__Impl rule__ComponentModeCollection__Group__3 )
            // InternalComponentMode.g:442:2: rule__ComponentModeCollection__Group__2__Impl rule__ComponentModeCollection__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComponentModeCollection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeCollection__Group__3();

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
    // $ANTLR end "rule__ComponentModeCollection__Group__2"


    // $ANTLR start "rule__ComponentModeCollection__Group__2__Impl"
    // InternalComponentMode.g:449:1: rule__ComponentModeCollection__Group__2__Impl : ( ( rule__ComponentModeCollection__NameAssignment_2 ) ) ;
    public final void rule__ComponentModeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:453:1: ( ( ( rule__ComponentModeCollection__NameAssignment_2 ) ) )
            // InternalComponentMode.g:454:1: ( ( rule__ComponentModeCollection__NameAssignment_2 ) )
            {
            // InternalComponentMode.g:454:1: ( ( rule__ComponentModeCollection__NameAssignment_2 ) )
            // InternalComponentMode.g:455:2: ( rule__ComponentModeCollection__NameAssignment_2 )
            {
             before(grammarAccess.getComponentModeCollectionAccess().getNameAssignment_2()); 
            // InternalComponentMode.g:456:2: ( rule__ComponentModeCollection__NameAssignment_2 )
            // InternalComponentMode.g:456:3: rule__ComponentModeCollection__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeCollection__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentModeCollectionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ComponentModeCollection__Group__2__Impl"


    // $ANTLR start "rule__ComponentModeCollection__Group__3"
    // InternalComponentMode.g:464:1: rule__ComponentModeCollection__Group__3 : rule__ComponentModeCollection__Group__3__Impl rule__ComponentModeCollection__Group__4 ;
    public final void rule__ComponentModeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:468:1: ( rule__ComponentModeCollection__Group__3__Impl rule__ComponentModeCollection__Group__4 )
            // InternalComponentMode.g:469:2: rule__ComponentModeCollection__Group__3__Impl rule__ComponentModeCollection__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ComponentModeCollection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeCollection__Group__4();

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
    // $ANTLR end "rule__ComponentModeCollection__Group__3"


    // $ANTLR start "rule__ComponentModeCollection__Group__3__Impl"
    // InternalComponentMode.g:476:1: rule__ComponentModeCollection__Group__3__Impl : ( '{' ) ;
    public final void rule__ComponentModeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:480:1: ( ( '{' ) )
            // InternalComponentMode.g:481:1: ( '{' )
            {
            // InternalComponentMode.g:481:1: ( '{' )
            // InternalComponentMode.g:482:2: '{'
            {
             before(grammarAccess.getComponentModeCollectionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentModeCollectionAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ComponentModeCollection__Group__3__Impl"


    // $ANTLR start "rule__ComponentModeCollection__Group__4"
    // InternalComponentMode.g:491:1: rule__ComponentModeCollection__Group__4 : rule__ComponentModeCollection__Group__4__Impl rule__ComponentModeCollection__Group__5 ;
    public final void rule__ComponentModeCollection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:495:1: ( rule__ComponentModeCollection__Group__4__Impl rule__ComponentModeCollection__Group__5 )
            // InternalComponentMode.g:496:2: rule__ComponentModeCollection__Group__4__Impl rule__ComponentModeCollection__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ComponentModeCollection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeCollection__Group__5();

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
    // $ANTLR end "rule__ComponentModeCollection__Group__4"


    // $ANTLR start "rule__ComponentModeCollection__Group__4__Impl"
    // InternalComponentMode.g:503:1: rule__ComponentModeCollection__Group__4__Impl : ( ( rule__ComponentModeCollection__ModesAssignment_4 )* ) ;
    public final void rule__ComponentModeCollection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:507:1: ( ( ( rule__ComponentModeCollection__ModesAssignment_4 )* ) )
            // InternalComponentMode.g:508:1: ( ( rule__ComponentModeCollection__ModesAssignment_4 )* )
            {
            // InternalComponentMode.g:508:1: ( ( rule__ComponentModeCollection__ModesAssignment_4 )* )
            // InternalComponentMode.g:509:2: ( rule__ComponentModeCollection__ModesAssignment_4 )*
            {
             before(grammarAccess.getComponentModeCollectionAccess().getModesAssignment_4()); 
            // InternalComponentMode.g:510:2: ( rule__ComponentModeCollection__ModesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComponentMode.g:510:3: rule__ComponentModeCollection__ModesAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentModeCollection__ModesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getComponentModeCollectionAccess().getModesAssignment_4()); 

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
    // $ANTLR end "rule__ComponentModeCollection__Group__4__Impl"


    // $ANTLR start "rule__ComponentModeCollection__Group__5"
    // InternalComponentMode.g:518:1: rule__ComponentModeCollection__Group__5 : rule__ComponentModeCollection__Group__5__Impl ;
    public final void rule__ComponentModeCollection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:522:1: ( rule__ComponentModeCollection__Group__5__Impl )
            // InternalComponentMode.g:523:2: rule__ComponentModeCollection__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeCollection__Group__5__Impl();

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
    // $ANTLR end "rule__ComponentModeCollection__Group__5"


    // $ANTLR start "rule__ComponentModeCollection__Group__5__Impl"
    // InternalComponentMode.g:529:1: rule__ComponentModeCollection__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentModeCollection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:533:1: ( ( '}' ) )
            // InternalComponentMode.g:534:1: ( '}' )
            {
            // InternalComponentMode.g:534:1: ( '}' )
            // InternalComponentMode.g:535:2: '}'
            {
             before(grammarAccess.getComponentModeCollectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentModeCollectionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ComponentModeCollection__Group__5__Impl"


    // $ANTLR start "rule__ComponentModeDefinition__Group__0"
    // InternalComponentMode.g:545:1: rule__ComponentModeDefinition__Group__0 : rule__ComponentModeDefinition__Group__0__Impl rule__ComponentModeDefinition__Group__1 ;
    public final void rule__ComponentModeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:549:1: ( rule__ComponentModeDefinition__Group__0__Impl rule__ComponentModeDefinition__Group__1 )
            // InternalComponentMode.g:550:2: rule__ComponentModeDefinition__Group__0__Impl rule__ComponentModeDefinition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ComponentModeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeDefinition__Group__1();

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
    // $ANTLR end "rule__ComponentModeDefinition__Group__0"


    // $ANTLR start "rule__ComponentModeDefinition__Group__0__Impl"
    // InternalComponentMode.g:557:1: rule__ComponentModeDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ComponentModeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:561:1: ( ( () ) )
            // InternalComponentMode.g:562:1: ( () )
            {
            // InternalComponentMode.g:562:1: ( () )
            // InternalComponentMode.g:563:2: ()
            {
             before(grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionAction_0()); 
            // InternalComponentMode.g:564:2: ()
            // InternalComponentMode.g:564:3: 
            {
            }

             after(grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentModeDefinition__Group__0__Impl"


    // $ANTLR start "rule__ComponentModeDefinition__Group__1"
    // InternalComponentMode.g:572:1: rule__ComponentModeDefinition__Group__1 : rule__ComponentModeDefinition__Group__1__Impl rule__ComponentModeDefinition__Group__2 ;
    public final void rule__ComponentModeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:576:1: ( rule__ComponentModeDefinition__Group__1__Impl rule__ComponentModeDefinition__Group__2 )
            // InternalComponentMode.g:577:2: rule__ComponentModeDefinition__Group__1__Impl rule__ComponentModeDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentModeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeDefinition__Group__2();

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
    // $ANTLR end "rule__ComponentModeDefinition__Group__1"


    // $ANTLR start "rule__ComponentModeDefinition__Group__1__Impl"
    // InternalComponentMode.g:584:1: rule__ComponentModeDefinition__Group__1__Impl : ( 'ComponentModeDefinition' ) ;
    public final void rule__ComponentModeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:588:1: ( ( 'ComponentModeDefinition' ) )
            // InternalComponentMode.g:589:1: ( 'ComponentModeDefinition' )
            {
            // InternalComponentMode.g:589:1: ( 'ComponentModeDefinition' )
            // InternalComponentMode.g:590:2: 'ComponentModeDefinition'
            {
             before(grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionKeyword_1()); 

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
    // $ANTLR end "rule__ComponentModeDefinition__Group__1__Impl"


    // $ANTLR start "rule__ComponentModeDefinition__Group__2"
    // InternalComponentMode.g:599:1: rule__ComponentModeDefinition__Group__2 : rule__ComponentModeDefinition__Group__2__Impl rule__ComponentModeDefinition__Group__3 ;
    public final void rule__ComponentModeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:603:1: ( rule__ComponentModeDefinition__Group__2__Impl rule__ComponentModeDefinition__Group__3 )
            // InternalComponentMode.g:604:2: rule__ComponentModeDefinition__Group__2__Impl rule__ComponentModeDefinition__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ComponentModeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentModeDefinition__Group__3();

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
    // $ANTLR end "rule__ComponentModeDefinition__Group__2"


    // $ANTLR start "rule__ComponentModeDefinition__Group__2__Impl"
    // InternalComponentMode.g:611:1: rule__ComponentModeDefinition__Group__2__Impl : ( ( rule__ComponentModeDefinition__NameAssignment_2 ) ) ;
    public final void rule__ComponentModeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:615:1: ( ( ( rule__ComponentModeDefinition__NameAssignment_2 ) ) )
            // InternalComponentMode.g:616:1: ( ( rule__ComponentModeDefinition__NameAssignment_2 ) )
            {
            // InternalComponentMode.g:616:1: ( ( rule__ComponentModeDefinition__NameAssignment_2 ) )
            // InternalComponentMode.g:617:2: ( rule__ComponentModeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getComponentModeDefinitionAccess().getNameAssignment_2()); 
            // InternalComponentMode.g:618:2: ( rule__ComponentModeDefinition__NameAssignment_2 )
            // InternalComponentMode.g:618:3: rule__ComponentModeDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentModeDefinitionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ComponentModeDefinition__Group__2__Impl"


    // $ANTLR start "rule__ComponentModeDefinition__Group__3"
    // InternalComponentMode.g:626:1: rule__ComponentModeDefinition__Group__3 : rule__ComponentModeDefinition__Group__3__Impl ;
    public final void rule__ComponentModeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:630:1: ( rule__ComponentModeDefinition__Group__3__Impl )
            // InternalComponentMode.g:631:2: rule__ComponentModeDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentModeDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__ComponentModeDefinition__Group__3"


    // $ANTLR start "rule__ComponentModeDefinition__Group__3__Impl"
    // InternalComponentMode.g:637:1: rule__ComponentModeDefinition__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__ComponentModeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:641:1: ( ( ( ';' )? ) )
            // InternalComponentMode.g:642:1: ( ( ';' )? )
            {
            // InternalComponentMode.g:642:1: ( ( ';' )? )
            // InternalComponentMode.g:643:2: ( ';' )?
            {
             before(grammarAccess.getComponentModeDefinitionAccess().getSemicolonKeyword_3()); 
            // InternalComponentMode.g:644:2: ( ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentMode.g:644:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentModeDefinitionAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__ComponentModeDefinition__Group__3__Impl"


    // $ANTLR start "rule__ComponentModeModel__RepositoryAssignment_1"
    // InternalComponentMode.g:653:1: rule__ComponentModeModel__RepositoryAssignment_1 : ( ruleComponentModeRepository ) ;
    public final void rule__ComponentModeModel__RepositoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:657:1: ( ( ruleComponentModeRepository ) )
            // InternalComponentMode.g:658:2: ( ruleComponentModeRepository )
            {
            // InternalComponentMode.g:658:2: ( ruleComponentModeRepository )
            // InternalComponentMode.g:659:3: ruleComponentModeRepository
            {
             before(grammarAccess.getComponentModeModelAccess().getRepositoryComponentModeRepositoryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentModeRepository();

            state._fsp--;

             after(grammarAccess.getComponentModeModelAccess().getRepositoryComponentModeRepositoryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComponentModeModel__RepositoryAssignment_1"


    // $ANTLR start "rule__ComponentModeRepository__NameAssignment_2"
    // InternalComponentMode.g:668:1: rule__ComponentModeRepository__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComponentModeRepository__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:672:1: ( ( RULE_ID ) )
            // InternalComponentMode.g:673:2: ( RULE_ID )
            {
            // InternalComponentMode.g:673:2: ( RULE_ID )
            // InternalComponentMode.g:674:3: RULE_ID
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentModeRepositoryAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComponentModeRepository__NameAssignment_2"


    // $ANTLR start "rule__ComponentModeRepository__CollectionsAssignment_4"
    // InternalComponentMode.g:683:1: rule__ComponentModeRepository__CollectionsAssignment_4 : ( ruleComponentModeCollection ) ;
    public final void rule__ComponentModeRepository__CollectionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:687:1: ( ( ruleComponentModeCollection ) )
            // InternalComponentMode.g:688:2: ( ruleComponentModeCollection )
            {
            // InternalComponentMode.g:688:2: ( ruleComponentModeCollection )
            // InternalComponentMode.g:689:3: ruleComponentModeCollection
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getCollectionsComponentModeCollectionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentModeCollection();

            state._fsp--;

             after(grammarAccess.getComponentModeRepositoryAccess().getCollectionsComponentModeCollectionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ComponentModeRepository__CollectionsAssignment_4"


    // $ANTLR start "rule__ComponentModeCollection__NameAssignment_2"
    // InternalComponentMode.g:698:1: rule__ComponentModeCollection__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComponentModeCollection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:702:1: ( ( RULE_ID ) )
            // InternalComponentMode.g:703:2: ( RULE_ID )
            {
            // InternalComponentMode.g:703:2: ( RULE_ID )
            // InternalComponentMode.g:704:3: RULE_ID
            {
             before(grammarAccess.getComponentModeCollectionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentModeCollectionAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComponentModeCollection__NameAssignment_2"


    // $ANTLR start "rule__ComponentModeCollection__ModesAssignment_4"
    // InternalComponentMode.g:713:1: rule__ComponentModeCollection__ModesAssignment_4 : ( ruleComponentModeDefinition ) ;
    public final void rule__ComponentModeCollection__ModesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:717:1: ( ( ruleComponentModeDefinition ) )
            // InternalComponentMode.g:718:2: ( ruleComponentModeDefinition )
            {
            // InternalComponentMode.g:718:2: ( ruleComponentModeDefinition )
            // InternalComponentMode.g:719:3: ruleComponentModeDefinition
            {
             before(grammarAccess.getComponentModeCollectionAccess().getModesComponentModeDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentModeDefinition();

            state._fsp--;

             after(grammarAccess.getComponentModeCollectionAccess().getModesComponentModeDefinitionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ComponentModeCollection__ModesAssignment_4"


    // $ANTLR start "rule__ComponentModeDefinition__NameAssignment_2"
    // InternalComponentMode.g:728:1: rule__ComponentModeDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComponentModeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:732:1: ( ( RULE_ID ) )
            // InternalComponentMode.g:733:2: ( RULE_ID )
            {
            // InternalComponentMode.g:733:2: ( RULE_ID )
            // InternalComponentMode.g:734:3: RULE_ID
            {
             before(grammarAccess.getComponentModeDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentModeDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ComponentModeDefinition__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});

}