package org.xtext.service.roboticMiddleware.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRoboticMiddlewareLexer extends Lexer {
    public static final int RULE_ML_DOCUMENTATION=7;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_SL_DOCUMENTATION=9;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=11;
    public static final int RULE_DOCU_COMMENT=10;
    public static final int RULE_ML_COMMENT=6;

    // delegates
    // delegators

    public InternalRoboticMiddlewareLexer() {;} 
    public InternalRoboticMiddlewareLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRoboticMiddlewareLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRoboticMiddleware.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:11:7: ( '.' )
            // InternalRoboticMiddleware.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:12:7: ( 'ACE_SmartSoft' )
            // InternalRoboticMiddleware.g:12:9: 'ACE_SmartSoft'
            {
            match("ACE_SmartSoft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:13:7: ( 'description' )
            // InternalRoboticMiddleware.g:13:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:14:7: ( 'OpcUa_SeRoNet' )
            // InternalRoboticMiddleware.g:14:9: 'OpcUa_SeRoNet'
            {
            match("OpcUa_SeRoNet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:15:7: ( 'CORBA_SmartSoft' )
            // InternalRoboticMiddleware.g:15:9: 'CORBA_SmartSoft'
            {
            match("CORBA_SmartSoft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:16:7: ( 'DDS_SmartSoft' )
            // InternalRoboticMiddleware.g:16:9: 'DDS_SmartSoft'
            {
            match("DDS_SmartSoft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:983:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalRoboticMiddleware.g:983:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRoboticMiddleware.g:983:31: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRoboticMiddleware.g:983:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ML_DOCUMENTATION"
    public final void mRULE_ML_DOCUMENTATION() throws RecognitionException {
        try {
            // InternalRoboticMiddleware.g:985:32: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalRoboticMiddleware.g:985:34: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalRoboticMiddleware.g:985:40: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRoboticMiddleware.g:985:68: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_DOCUMENTATION"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:987:17: ( '//' ~ ( '/' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRoboticMiddleware.g:987:19: '//' ~ ( '/' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRoboticMiddleware.g:987:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRoboticMiddleware.g:987:31: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalRoboticMiddleware.g:987:47: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoboticMiddleware.g:987:48: ( '\\r' )? '\\n'
                    {
                    // InternalRoboticMiddleware.g:987:48: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalRoboticMiddleware.g:987:48: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_SL_DOCUMENTATION"
    public final void mRULE_SL_DOCUMENTATION() throws RecognitionException {
        try {
            // InternalRoboticMiddleware.g:989:32: ( '///' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRoboticMiddleware.g:989:34: '///' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("///"); 

            // InternalRoboticMiddleware.g:989:40: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRoboticMiddleware.g:989:40: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalRoboticMiddleware.g:989:56: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoboticMiddleware.g:989:57: ( '\\r' )? '\\n'
                    {
                    // InternalRoboticMiddleware.g:989:57: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalRoboticMiddleware.g:989:57: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_DOCUMENTATION"

    // $ANTLR start "RULE_DOCU_COMMENT"
    public final void mRULE_DOCU_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_DOCU_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:991:19: ( ( RULE_ML_DOCUMENTATION | RULE_SL_DOCUMENTATION ) )
            // InternalRoboticMiddleware.g:991:21: ( RULE_ML_DOCUMENTATION | RULE_SL_DOCUMENTATION )
            {
            // InternalRoboticMiddleware.g:991:21: ( RULE_ML_DOCUMENTATION | RULE_SL_DOCUMENTATION )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='/') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='*') ) {
                    alt9=1;
                }
                else if ( (LA9_1=='/') ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoboticMiddleware.g:991:22: RULE_ML_DOCUMENTATION
                    {
                    mRULE_ML_DOCUMENTATION(); 

                    }
                    break;
                case 2 :
                    // InternalRoboticMiddleware.g:991:44: RULE_SL_DOCUMENTATION
                    {
                    mRULE_SL_DOCUMENTATION(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOCU_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:993:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRoboticMiddleware.g:993:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRoboticMiddleware.g:993:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoboticMiddleware.g:993:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRoboticMiddleware.g:993:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRoboticMiddleware.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:995:10: ( ( '0' .. '9' )+ )
            // InternalRoboticMiddleware.g:995:12: ( '0' .. '9' )+
            {
            // InternalRoboticMiddleware.g:995:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRoboticMiddleware.g:995:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:997:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRoboticMiddleware.g:997:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRoboticMiddleware.g:997:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRoboticMiddleware.g:997:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRoboticMiddleware.g:997:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRoboticMiddleware.g:997:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRoboticMiddleware.g:997:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRoboticMiddleware.g:997:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRoboticMiddleware.g:997:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRoboticMiddleware.g:997:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRoboticMiddleware.g:997:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:999:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRoboticMiddleware.g:999:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRoboticMiddleware.g:999:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRoboticMiddleware.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRoboticMiddleware.g:1001:16: ( . )
            // InternalRoboticMiddleware.g:1001:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRoboticMiddleware.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_DOCU_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt17=14;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalRoboticMiddleware.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalRoboticMiddleware.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalRoboticMiddleware.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalRoboticMiddleware.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalRoboticMiddleware.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalRoboticMiddleware.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalRoboticMiddleware.g:1:46: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 8 :
                // InternalRoboticMiddleware.g:1:62: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 9 :
                // InternalRoboticMiddleware.g:1:78: RULE_DOCU_COMMENT
                {
                mRULE_DOCU_COMMENT(); 

                }
                break;
            case 10 :
                // InternalRoboticMiddleware.g:1:96: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // InternalRoboticMiddleware.g:1:104: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // InternalRoboticMiddleware.g:1:113: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // InternalRoboticMiddleware.g:1:125: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 14 :
                // InternalRoboticMiddleware.g:1:133: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\2\uffff\5\21\2\16\2\uffff\2\16\3\uffff\1\21\1\uffff\4\21\5\uffff\5\21\3\uffff\44\21\1\114\4\21\1\uffff\3\21\1\124\1\125\1\21\1\127\2\uffff\1\21\1\uffff\1\131\1\uffff";
    static final String DFA17_eofS =
        "\132\uffff";
    static final String DFA17_minS =
        "\1\0\1\uffff\1\103\1\145\1\160\1\117\1\104\1\52\1\101\2\uffff\2\0\3\uffff\1\105\1\uffff\1\163\1\143\1\122\1\123\2\0\3\uffff\1\137\1\143\1\125\1\102\1\137\3\uffff\1\123\1\162\1\141\1\101\1\123\1\155\1\151\2\137\1\155\1\141\1\160\2\123\1\141\1\162\1\164\1\145\1\155\1\162\1\164\1\151\1\122\1\141\1\164\1\123\2\157\1\162\1\123\1\157\1\156\1\116\1\164\1\157\1\146\1\60\1\145\1\123\1\146\1\164\1\uffff\1\164\1\157\1\164\2\60\1\146\1\60\2\uffff\1\164\1\uffff\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\uffff\1\103\1\145\1\160\1\117\1\104\1\57\1\172\2\uffff\2\uffff\3\uffff\1\105\1\uffff\1\163\1\143\1\122\1\123\2\uffff\3\uffff\1\137\1\143\1\125\1\102\1\137\3\uffff\1\123\1\162\1\141\1\101\1\123\1\155\1\151\2\137\1\155\1\141\1\160\2\123\1\141\1\162\1\164\1\145\1\155\1\162\1\164\1\151\1\122\1\141\1\164\1\123\2\157\1\162\1\123\1\157\1\156\1\116\1\164\1\157\1\146\1\172\1\145\1\123\1\146\1\164\1\uffff\1\164\1\157\1\164\2\172\1\146\1\172\2\uffff\1\164\1\uffff\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\7\uffff\1\12\1\13\2\uffff\1\15\1\16\1\1\1\uffff\1\12\6\uffff\1\13\1\14\1\15\5\uffff\1\7\1\11\1\10\51\uffff\1\3\7\uffff\1\2\1\4\1\uffff\1\6\1\uffff\1\5";
    static final String DFA17_specialS =
        "\1\2\12\uffff\1\1\1\4\11\uffff\1\0\1\3\102\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\16\2\15\2\16\1\15\22\16\1\15\1\16\1\13\4\16\1\14\6\16\1\1\1\7\12\12\7\16\1\2\1\11\1\5\1\6\12\11\1\4\13\11\3\16\1\10\1\11\1\16\3\11\1\3\26\11\uff85\16",
            "",
            "\1\20",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26\4\uffff\1\27",
            "\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "\0\31",
            "\0\31",
            "",
            "",
            "",
            "\1\33",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\52\40\1\41\uffd5\40",
            "\57\42\1\41\uffd0\42",
            "",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\126",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "\1\130",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_DOCU_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_22 = input.LA(1);

                        s = -1;
                        if ( ((LA17_22>='\u0000' && LA17_22<=')')||(LA17_22>='+' && LA17_22<='\uFFFF')) ) {s = 32;}

                        else if ( (LA17_22=='*') ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_11 = input.LA(1);

                        s = -1;
                        if ( ((LA17_11>='\u0000' && LA17_11<='\uFFFF')) ) {s = 25;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='.') ) {s = 1;}

                        else if ( (LA17_0=='A') ) {s = 2;}

                        else if ( (LA17_0=='d') ) {s = 3;}

                        else if ( (LA17_0=='O') ) {s = 4;}

                        else if ( (LA17_0=='C') ) {s = 5;}

                        else if ( (LA17_0=='D') ) {s = 6;}

                        else if ( (LA17_0=='/') ) {s = 7;}

                        else if ( (LA17_0=='^') ) {s = 8;}

                        else if ( (LA17_0=='B'||(LA17_0>='E' && LA17_0<='N')||(LA17_0>='P' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='c')||(LA17_0>='e' && LA17_0<='z')) ) {s = 9;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 10;}

                        else if ( (LA17_0=='\"') ) {s = 11;}

                        else if ( (LA17_0=='\'') ) {s = 12;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 13;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='-')||(LA17_0>=':' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||(LA17_0>='{' && LA17_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_23 = input.LA(1);

                        s = -1;
                        if ( ((LA17_23>='\u0000' && LA17_23<='.')||(LA17_23>='0' && LA17_23<='\uFFFF')) ) {s = 34;}

                        else if ( (LA17_23=='/') ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_12 = input.LA(1);

                        s = -1;
                        if ( ((LA17_12>='\u0000' && LA17_12<='\uFFFF')) ) {s = 25;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}