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
    // InternalComponentMode.g:94:1: entryRuleComponentModeModel : ruleComponentModeModel EOF ;
    public final void entryRuleComponentModeModel() throws RecognitionException {
        try {
            // InternalComponentMode.g:95:1: ( ruleComponentModeModel EOF )
            // InternalComponentMode.g:96:1: ruleComponentModeModel EOF
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
    // InternalComponentMode.g:103:1: ruleComponentModeModel : ( ( rule__ComponentModeModel__Group__0 ) ) ;
    public final void ruleComponentModeModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:107:2: ( ( ( rule__ComponentModeModel__Group__0 ) ) )
            // InternalComponentMode.g:108:2: ( ( rule__ComponentModeModel__Group__0 ) )
            {
            // InternalComponentMode.g:108:2: ( ( rule__ComponentModeModel__Group__0 ) )
            // InternalComponentMode.g:109:3: ( rule__ComponentModeModel__Group__0 )
            {
             before(grammarAccess.getComponentModeModelAccess().getGroup()); 
            // InternalComponentMode.g:110:3: ( rule__ComponentModeModel__Group__0 )
            // InternalComponentMode.g:110:4: rule__ComponentModeModel__Group__0
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
    // InternalComponentMode.g:119:1: entryRuleComponentModeRepository : ruleComponentModeRepository EOF ;
    public final void entryRuleComponentModeRepository() throws RecognitionException {
        try {
            // InternalComponentMode.g:120:1: ( ruleComponentModeRepository EOF )
            // InternalComponentMode.g:121:1: ruleComponentModeRepository EOF
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
    // InternalComponentMode.g:128:1: ruleComponentModeRepository : ( ( rule__ComponentModeRepository__Group__0 ) ) ;
    public final void ruleComponentModeRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:132:2: ( ( ( rule__ComponentModeRepository__Group__0 ) ) )
            // InternalComponentMode.g:133:2: ( ( rule__ComponentModeRepository__Group__0 ) )
            {
            // InternalComponentMode.g:133:2: ( ( rule__ComponentModeRepository__Group__0 ) )
            // InternalComponentMode.g:134:3: ( rule__ComponentModeRepository__Group__0 )
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getGroup()); 
            // InternalComponentMode.g:135:3: ( rule__ComponentModeRepository__Group__0 )
            // InternalComponentMode.g:135:4: rule__ComponentModeRepository__Group__0
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
    // InternalComponentMode.g:144:1: entryRuleComponentModeCollection : ruleComponentModeCollection EOF ;
    public final void entryRuleComponentModeCollection() throws RecognitionException {
        try {
            // InternalComponentMode.g:145:1: ( ruleComponentModeCollection EOF )
            // InternalComponentMode.g:146:1: ruleComponentModeCollection EOF
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
    // InternalComponentMode.g:153:1: ruleComponentModeCollection : ( ( rule__ComponentModeCollection__Group__0 ) ) ;
    public final void ruleComponentModeCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:157:2: ( ( ( rule__ComponentModeCollection__Group__0 ) ) )
            // InternalComponentMode.g:158:2: ( ( rule__ComponentModeCollection__Group__0 ) )
            {
            // InternalComponentMode.g:158:2: ( ( rule__ComponentModeCollection__Group__0 ) )
            // InternalComponentMode.g:159:3: ( rule__ComponentModeCollection__Group__0 )
            {
             before(grammarAccess.getComponentModeCollectionAccess().getGroup()); 
            // InternalComponentMode.g:160:3: ( rule__ComponentModeCollection__Group__0 )
            // InternalComponentMode.g:160:4: rule__ComponentModeCollection__Group__0
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
    // InternalComponentMode.g:169:1: entryRuleComponentModeDefinition : ruleComponentModeDefinition EOF ;
    public final void entryRuleComponentModeDefinition() throws RecognitionException {
        try {
            // InternalComponentMode.g:170:1: ( ruleComponentModeDefinition EOF )
            // InternalComponentMode.g:171:1: ruleComponentModeDefinition EOF
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
    // InternalComponentMode.g:178:1: ruleComponentModeDefinition : ( ( rule__ComponentModeDefinition__Group__0 ) ) ;
    public final void ruleComponentModeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:182:2: ( ( ( rule__ComponentModeDefinition__Group__0 ) ) )
            // InternalComponentMode.g:183:2: ( ( rule__ComponentModeDefinition__Group__0 ) )
            {
            // InternalComponentMode.g:183:2: ( ( rule__ComponentModeDefinition__Group__0 ) )
            // InternalComponentMode.g:184:3: ( rule__ComponentModeDefinition__Group__0 )
            {
             before(grammarAccess.getComponentModeDefinitionAccess().getGroup()); 
            // InternalComponentMode.g:185:3: ( rule__ComponentModeDefinition__Group__0 )
            // InternalComponentMode.g:185:4: rule__ComponentModeDefinition__Group__0
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
    // InternalComponentMode.g:193:1: rule__ComponentModeModel__Group__0 : rule__ComponentModeModel__Group__0__Impl rule__ComponentModeModel__Group__1 ;
    public final void rule__ComponentModeModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:197:1: ( rule__ComponentModeModel__Group__0__Impl rule__ComponentModeModel__Group__1 )
            // InternalComponentMode.g:198:2: rule__ComponentModeModel__Group__0__Impl rule__ComponentModeModel__Group__1
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
    // InternalComponentMode.g:205:1: rule__ComponentModeModel__Group__0__Impl : ( () ) ;
    public final void rule__ComponentModeModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:209:1: ( ( () ) )
            // InternalComponentMode.g:210:1: ( () )
            {
            // InternalComponentMode.g:210:1: ( () )
            // InternalComponentMode.g:211:2: ()
            {
             before(grammarAccess.getComponentModeModelAccess().getComponentModeModelAction_0()); 
            // InternalComponentMode.g:212:2: ()
            // InternalComponentMode.g:212:3: 
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
    // InternalComponentMode.g:220:1: rule__ComponentModeModel__Group__1 : rule__ComponentModeModel__Group__1__Impl ;
    public final void rule__ComponentModeModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:224:1: ( rule__ComponentModeModel__Group__1__Impl )
            // InternalComponentMode.g:225:2: rule__ComponentModeModel__Group__1__Impl
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
    // InternalComponentMode.g:231:1: rule__ComponentModeModel__Group__1__Impl : ( ( rule__ComponentModeModel__RepositoryAssignment_1 )? ) ;
    public final void rule__ComponentModeModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:235:1: ( ( ( rule__ComponentModeModel__RepositoryAssignment_1 )? ) )
            // InternalComponentMode.g:236:1: ( ( rule__ComponentModeModel__RepositoryAssignment_1 )? )
            {
            // InternalComponentMode.g:236:1: ( ( rule__ComponentModeModel__RepositoryAssignment_1 )? )
            // InternalComponentMode.g:237:2: ( rule__ComponentModeModel__RepositoryAssignment_1 )?
            {
             before(grammarAccess.getComponentModeModelAccess().getRepositoryAssignment_1()); 
            // InternalComponentMode.g:238:2: ( rule__ComponentModeModel__RepositoryAssignment_1 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentMode.g:238:3: rule__ComponentModeModel__RepositoryAssignment_1
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
    // InternalComponentMode.g:247:1: rule__ComponentModeRepository__Group__0 : rule__ComponentModeRepository__Group__0__Impl rule__ComponentModeRepository__Group__1 ;
    public final void rule__ComponentModeRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:251:1: ( rule__ComponentModeRepository__Group__0__Impl rule__ComponentModeRepository__Group__1 )
            // InternalComponentMode.g:252:2: rule__ComponentModeRepository__Group__0__Impl rule__ComponentModeRepository__Group__1
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
    // InternalComponentMode.g:259:1: rule__ComponentModeRepository__Group__0__Impl : ( () ) ;
    public final void rule__ComponentModeRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:263:1: ( ( () ) )
            // InternalComponentMode.g:264:1: ( () )
            {
            // InternalComponentMode.g:264:1: ( () )
            // InternalComponentMode.g:265:2: ()
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getComponentModeRepositoryAction_0()); 
            // InternalComponentMode.g:266:2: ()
            // InternalComponentMode.g:266:3: 
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
    // InternalComponentMode.g:274:1: rule__ComponentModeRepository__Group__1 : rule__ComponentModeRepository__Group__1__Impl rule__ComponentModeRepository__Group__2 ;
    public final void rule__ComponentModeRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:278:1: ( rule__ComponentModeRepository__Group__1__Impl rule__ComponentModeRepository__Group__2 )
            // InternalComponentMode.g:279:2: rule__ComponentModeRepository__Group__1__Impl rule__ComponentModeRepository__Group__2
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
    // InternalComponentMode.g:286:1: rule__ComponentModeRepository__Group__1__Impl : ( 'ComponentModeRepository' ) ;
    public final void rule__ComponentModeRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:290:1: ( ( 'ComponentModeRepository' ) )
            // InternalComponentMode.g:291:1: ( 'ComponentModeRepository' )
            {
            // InternalComponentMode.g:291:1: ( 'ComponentModeRepository' )
            // InternalComponentMode.g:292:2: 'ComponentModeRepository'
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
    // InternalComponentMode.g:301:1: rule__ComponentModeRepository__Group__2 : rule__ComponentModeRepository__Group__2__Impl rule__ComponentModeRepository__Group__3 ;
    public final void rule__ComponentModeRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:305:1: ( rule__ComponentModeRepository__Group__2__Impl rule__ComponentModeRepository__Group__3 )
            // InternalComponentMode.g:306:2: rule__ComponentModeRepository__Group__2__Impl rule__ComponentModeRepository__Group__3
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
    // InternalComponentMode.g:313:1: rule__ComponentModeRepository__Group__2__Impl : ( ( rule__ComponentModeRepository__NameAssignment_2 ) ) ;
    public final void rule__ComponentModeRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:317:1: ( ( ( rule__ComponentModeRepository__NameAssignment_2 ) ) )
            // InternalComponentMode.g:318:1: ( ( rule__ComponentModeRepository__NameAssignment_2 ) )
            {
            // InternalComponentMode.g:318:1: ( ( rule__ComponentModeRepository__NameAssignment_2 ) )
            // InternalComponentMode.g:319:2: ( rule__ComponentModeRepository__NameAssignment_2 )
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getNameAssignment_2()); 
            // InternalComponentMode.g:320:2: ( rule__ComponentModeRepository__NameAssignment_2 )
            // InternalComponentMode.g:320:3: rule__ComponentModeRepository__NameAssignment_2
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
    // InternalComponentMode.g:328:1: rule__ComponentModeRepository__Group__3 : rule__ComponentModeRepository__Group__3__Impl rule__ComponentModeRepository__Group__4 ;
    public final void rule__ComponentModeRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:332:1: ( rule__ComponentModeRepository__Group__3__Impl rule__ComponentModeRepository__Group__4 )
            // InternalComponentMode.g:333:2: rule__ComponentModeRepository__Group__3__Impl rule__ComponentModeRepository__Group__4
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
    // InternalComponentMode.g:340:1: rule__ComponentModeRepository__Group__3__Impl : ( '{' ) ;
    public final void rule__ComponentModeRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:344:1: ( ( '{' ) )
            // InternalComponentMode.g:345:1: ( '{' )
            {
            // InternalComponentMode.g:345:1: ( '{' )
            // InternalComponentMode.g:346:2: '{'
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
    // InternalComponentMode.g:355:1: rule__ComponentModeRepository__Group__4 : rule__ComponentModeRepository__Group__4__Impl rule__ComponentModeRepository__Group__5 ;
    public final void rule__ComponentModeRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:359:1: ( rule__ComponentModeRepository__Group__4__Impl rule__ComponentModeRepository__Group__5 )
            // InternalComponentMode.g:360:2: rule__ComponentModeRepository__Group__4__Impl rule__ComponentModeRepository__Group__5
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
    // InternalComponentMode.g:367:1: rule__ComponentModeRepository__Group__4__Impl : ( ( rule__ComponentModeRepository__CollectionsAssignment_4 )* ) ;
    public final void rule__ComponentModeRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:371:1: ( ( ( rule__ComponentModeRepository__CollectionsAssignment_4 )* ) )
            // InternalComponentMode.g:372:1: ( ( rule__ComponentModeRepository__CollectionsAssignment_4 )* )
            {
            // InternalComponentMode.g:372:1: ( ( rule__ComponentModeRepository__CollectionsAssignment_4 )* )
            // InternalComponentMode.g:373:2: ( rule__ComponentModeRepository__CollectionsAssignment_4 )*
            {
             before(grammarAccess.getComponentModeRepositoryAccess().getCollectionsAssignment_4()); 
            // InternalComponentMode.g:374:2: ( rule__ComponentModeRepository__CollectionsAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalComponentMode.g:374:3: rule__ComponentModeRepository__CollectionsAssignment_4
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
    // InternalComponentMode.g:382:1: rule__ComponentModeRepository__Group__5 : rule__ComponentModeRepository__Group__5__Impl ;
    public final void rule__ComponentModeRepository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:386:1: ( rule__ComponentModeRepository__Group__5__Impl )
            // InternalComponentMode.g:387:2: rule__ComponentModeRepository__Group__5__Impl
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
    // InternalComponentMode.g:393:1: rule__ComponentModeRepository__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentModeRepository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:397:1: ( ( '}' ) )
            // InternalComponentMode.g:398:1: ( '}' )
            {
            // InternalComponentMode.g:398:1: ( '}' )
            // InternalComponentMode.g:399:2: '}'
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
    // InternalComponentMode.g:409:1: rule__ComponentModeCollection__Group__0 : rule__ComponentModeCollection__Group__0__Impl rule__ComponentModeCollection__Group__1 ;
    public final void rule__ComponentModeCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:413:1: ( rule__ComponentModeCollection__Group__0__Impl rule__ComponentModeCollection__Group__1 )
            // InternalComponentMode.g:414:2: rule__ComponentModeCollection__Group__0__Impl rule__ComponentModeCollection__Group__1
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
    // InternalComponentMode.g:421:1: rule__ComponentModeCollection__Group__0__Impl : ( () ) ;
    public final void rule__ComponentModeCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:425:1: ( ( () ) )
            // InternalComponentMode.g:426:1: ( () )
            {
            // InternalComponentMode.g:426:1: ( () )
            // InternalComponentMode.g:427:2: ()
            {
             before(grammarAccess.getComponentModeCollectionAccess().getComponentModeCollectionAction_0()); 
            // InternalComponentMode.g:428:2: ()
            // InternalComponentMode.g:428:3: 
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
    // InternalComponentMode.g:436:1: rule__ComponentModeCollection__Group__1 : rule__ComponentModeCollection__Group__1__Impl rule__ComponentModeCollection__Group__2 ;
    public final void rule__ComponentModeCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:440:1: ( rule__ComponentModeCollection__Group__1__Impl rule__ComponentModeCollection__Group__2 )
            // InternalComponentMode.g:441:2: rule__ComponentModeCollection__Group__1__Impl rule__ComponentModeCollection__Group__2
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
    // InternalComponentMode.g:448:1: rule__ComponentModeCollection__Group__1__Impl : ( 'ComponentModeCollection' ) ;
    public final void rule__ComponentModeCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:452:1: ( ( 'ComponentModeCollection' ) )
            // InternalComponentMode.g:453:1: ( 'ComponentModeCollection' )
            {
            // InternalComponentMode.g:453:1: ( 'ComponentModeCollection' )
            // InternalComponentMode.g:454:2: 'ComponentModeCollection'
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
    // InternalComponentMode.g:463:1: rule__ComponentModeCollection__Group__2 : rule__ComponentModeCollection__Group__2__Impl rule__ComponentModeCollection__Group__3 ;
    public final void rule__ComponentModeCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:467:1: ( rule__ComponentModeCollection__Group__2__Impl rule__ComponentModeCollection__Group__3 )
            // InternalComponentMode.g:468:2: rule__ComponentModeCollection__Group__2__Impl rule__ComponentModeCollection__Group__3
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
    // InternalComponentMode.g:475:1: rule__ComponentModeCollection__Group__2__Impl : ( ( rule__ComponentModeCollection__NameAssignment_2 ) ) ;
    public final void rule__ComponentModeCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:479:1: ( ( ( rule__ComponentModeCollection__NameAssignment_2 ) ) )
            // InternalComponentMode.g:480:1: ( ( rule__ComponentModeCollection__NameAssignment_2 ) )
            {
            // InternalComponentMode.g:480:1: ( ( rule__ComponentModeCollection__NameAssignment_2 ) )
            // InternalComponentMode.g:481:2: ( rule__ComponentModeCollection__NameAssignment_2 )
            {
             before(grammarAccess.getComponentModeCollectionAccess().getNameAssignment_2()); 
            // InternalComponentMode.g:482:2: ( rule__ComponentModeCollection__NameAssignment_2 )
            // InternalComponentMode.g:482:3: rule__ComponentModeCollection__NameAssignment_2
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
    // InternalComponentMode.g:490:1: rule__ComponentModeCollection__Group__3 : rule__ComponentModeCollection__Group__3__Impl rule__ComponentModeCollection__Group__4 ;
    public final void rule__ComponentModeCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:494:1: ( rule__ComponentModeCollection__Group__3__Impl rule__ComponentModeCollection__Group__4 )
            // InternalComponentMode.g:495:2: rule__ComponentModeCollection__Group__3__Impl rule__ComponentModeCollection__Group__4
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
    // InternalComponentMode.g:502:1: rule__ComponentModeCollection__Group__3__Impl : ( '{' ) ;
    public final void rule__ComponentModeCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:506:1: ( ( '{' ) )
            // InternalComponentMode.g:507:1: ( '{' )
            {
            // InternalComponentMode.g:507:1: ( '{' )
            // InternalComponentMode.g:508:2: '{'
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
    // InternalComponentMode.g:517:1: rule__ComponentModeCollection__Group__4 : rule__ComponentModeCollection__Group__4__Impl rule__ComponentModeCollection__Group__5 ;
    public final void rule__ComponentModeCollection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:521:1: ( rule__ComponentModeCollection__Group__4__Impl rule__ComponentModeCollection__Group__5 )
            // InternalComponentMode.g:522:2: rule__ComponentModeCollection__Group__4__Impl rule__ComponentModeCollection__Group__5
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
    // InternalComponentMode.g:529:1: rule__ComponentModeCollection__Group__4__Impl : ( ( rule__ComponentModeCollection__ModesAssignment_4 )* ) ;
    public final void rule__ComponentModeCollection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:533:1: ( ( ( rule__ComponentModeCollection__ModesAssignment_4 )* ) )
            // InternalComponentMode.g:534:1: ( ( rule__ComponentModeCollection__ModesAssignment_4 )* )
            {
            // InternalComponentMode.g:534:1: ( ( rule__ComponentModeCollection__ModesAssignment_4 )* )
            // InternalComponentMode.g:535:2: ( rule__ComponentModeCollection__ModesAssignment_4 )*
            {
             before(grammarAccess.getComponentModeCollectionAccess().getModesAssignment_4()); 
            // InternalComponentMode.g:536:2: ( rule__ComponentModeCollection__ModesAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalComponentMode.g:536:3: rule__ComponentModeCollection__ModesAssignment_4
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
    // InternalComponentMode.g:544:1: rule__ComponentModeCollection__Group__5 : rule__ComponentModeCollection__Group__5__Impl ;
    public final void rule__ComponentModeCollection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:548:1: ( rule__ComponentModeCollection__Group__5__Impl )
            // InternalComponentMode.g:549:2: rule__ComponentModeCollection__Group__5__Impl
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
    // InternalComponentMode.g:555:1: rule__ComponentModeCollection__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentModeCollection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:559:1: ( ( '}' ) )
            // InternalComponentMode.g:560:1: ( '}' )
            {
            // InternalComponentMode.g:560:1: ( '}' )
            // InternalComponentMode.g:561:2: '}'
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
    // InternalComponentMode.g:571:1: rule__ComponentModeDefinition__Group__0 : rule__ComponentModeDefinition__Group__0__Impl rule__ComponentModeDefinition__Group__1 ;
    public final void rule__ComponentModeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:575:1: ( rule__ComponentModeDefinition__Group__0__Impl rule__ComponentModeDefinition__Group__1 )
            // InternalComponentMode.g:576:2: rule__ComponentModeDefinition__Group__0__Impl rule__ComponentModeDefinition__Group__1
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
    // InternalComponentMode.g:583:1: rule__ComponentModeDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ComponentModeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:587:1: ( ( () ) )
            // InternalComponentMode.g:588:1: ( () )
            {
            // InternalComponentMode.g:588:1: ( () )
            // InternalComponentMode.g:589:2: ()
            {
             before(grammarAccess.getComponentModeDefinitionAccess().getComponentModeDefinitionAction_0()); 
            // InternalComponentMode.g:590:2: ()
            // InternalComponentMode.g:590:3: 
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
    // InternalComponentMode.g:598:1: rule__ComponentModeDefinition__Group__1 : rule__ComponentModeDefinition__Group__1__Impl rule__ComponentModeDefinition__Group__2 ;
    public final void rule__ComponentModeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:602:1: ( rule__ComponentModeDefinition__Group__1__Impl rule__ComponentModeDefinition__Group__2 )
            // InternalComponentMode.g:603:2: rule__ComponentModeDefinition__Group__1__Impl rule__ComponentModeDefinition__Group__2
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
    // InternalComponentMode.g:610:1: rule__ComponentModeDefinition__Group__1__Impl : ( 'ComponentModeDefinition' ) ;
    public final void rule__ComponentModeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:614:1: ( ( 'ComponentModeDefinition' ) )
            // InternalComponentMode.g:615:1: ( 'ComponentModeDefinition' )
            {
            // InternalComponentMode.g:615:1: ( 'ComponentModeDefinition' )
            // InternalComponentMode.g:616:2: 'ComponentModeDefinition'
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
    // InternalComponentMode.g:625:1: rule__ComponentModeDefinition__Group__2 : rule__ComponentModeDefinition__Group__2__Impl rule__ComponentModeDefinition__Group__3 ;
    public final void rule__ComponentModeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:629:1: ( rule__ComponentModeDefinition__Group__2__Impl rule__ComponentModeDefinition__Group__3 )
            // InternalComponentMode.g:630:2: rule__ComponentModeDefinition__Group__2__Impl rule__ComponentModeDefinition__Group__3
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
    // InternalComponentMode.g:637:1: rule__ComponentModeDefinition__Group__2__Impl : ( ( rule__ComponentModeDefinition__NameAssignment_2 ) ) ;
    public final void rule__ComponentModeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:641:1: ( ( ( rule__ComponentModeDefinition__NameAssignment_2 ) ) )
            // InternalComponentMode.g:642:1: ( ( rule__ComponentModeDefinition__NameAssignment_2 ) )
            {
            // InternalComponentMode.g:642:1: ( ( rule__ComponentModeDefinition__NameAssignment_2 ) )
            // InternalComponentMode.g:643:2: ( rule__ComponentModeDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getComponentModeDefinitionAccess().getNameAssignment_2()); 
            // InternalComponentMode.g:644:2: ( rule__ComponentModeDefinition__NameAssignment_2 )
            // InternalComponentMode.g:644:3: rule__ComponentModeDefinition__NameAssignment_2
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
    // InternalComponentMode.g:652:1: rule__ComponentModeDefinition__Group__3 : rule__ComponentModeDefinition__Group__3__Impl ;
    public final void rule__ComponentModeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:656:1: ( rule__ComponentModeDefinition__Group__3__Impl )
            // InternalComponentMode.g:657:2: rule__ComponentModeDefinition__Group__3__Impl
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
    // InternalComponentMode.g:663:1: rule__ComponentModeDefinition__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__ComponentModeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:667:1: ( ( ( ';' )? ) )
            // InternalComponentMode.g:668:1: ( ( ';' )? )
            {
            // InternalComponentMode.g:668:1: ( ( ';' )? )
            // InternalComponentMode.g:669:2: ( ';' )?
            {
             before(grammarAccess.getComponentModeDefinitionAccess().getSemicolonKeyword_3()); 
            // InternalComponentMode.g:670:2: ( ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentMode.g:670:3: ';'
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
    // InternalComponentMode.g:679:1: rule__ComponentModeModel__RepositoryAssignment_1 : ( ruleComponentModeRepository ) ;
    public final void rule__ComponentModeModel__RepositoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:683:1: ( ( ruleComponentModeRepository ) )
            // InternalComponentMode.g:684:2: ( ruleComponentModeRepository )
            {
            // InternalComponentMode.g:684:2: ( ruleComponentModeRepository )
            // InternalComponentMode.g:685:3: ruleComponentModeRepository
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
    // InternalComponentMode.g:694:1: rule__ComponentModeRepository__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComponentModeRepository__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:698:1: ( ( RULE_ID ) )
            // InternalComponentMode.g:699:2: ( RULE_ID )
            {
            // InternalComponentMode.g:699:2: ( RULE_ID )
            // InternalComponentMode.g:700:3: RULE_ID
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
    // InternalComponentMode.g:709:1: rule__ComponentModeRepository__CollectionsAssignment_4 : ( ruleComponentModeCollection ) ;
    public final void rule__ComponentModeRepository__CollectionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:713:1: ( ( ruleComponentModeCollection ) )
            // InternalComponentMode.g:714:2: ( ruleComponentModeCollection )
            {
            // InternalComponentMode.g:714:2: ( ruleComponentModeCollection )
            // InternalComponentMode.g:715:3: ruleComponentModeCollection
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
    // InternalComponentMode.g:724:1: rule__ComponentModeCollection__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComponentModeCollection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:728:1: ( ( RULE_ID ) )
            // InternalComponentMode.g:729:2: ( RULE_ID )
            {
            // InternalComponentMode.g:729:2: ( RULE_ID )
            // InternalComponentMode.g:730:3: RULE_ID
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
    // InternalComponentMode.g:739:1: rule__ComponentModeCollection__ModesAssignment_4 : ( ruleComponentModeDefinition ) ;
    public final void rule__ComponentModeCollection__ModesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:743:1: ( ( ruleComponentModeDefinition ) )
            // InternalComponentMode.g:744:2: ( ruleComponentModeDefinition )
            {
            // InternalComponentMode.g:744:2: ( ruleComponentModeDefinition )
            // InternalComponentMode.g:745:3: ruleComponentModeDefinition
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
    // InternalComponentMode.g:754:1: rule__ComponentModeDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComponentModeDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentMode.g:758:1: ( ( RULE_ID ) )
            // InternalComponentMode.g:759:2: ( RULE_ID )
            {
            // InternalComponentMode.g:759:2: ( RULE_ID )
            // InternalComponentMode.g:760:3: RULE_ID
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