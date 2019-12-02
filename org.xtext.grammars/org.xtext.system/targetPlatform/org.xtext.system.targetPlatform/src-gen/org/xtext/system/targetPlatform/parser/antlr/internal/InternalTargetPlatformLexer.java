package org.xtext.system.targetPlatform.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTargetPlatformLexer extends Lexer {
    public static final int RULE_ML_DOCUMENTATION=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=10;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=11;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalTargetPlatformLexer() {;} 
    public InternalTargetPlatformLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTargetPlatformLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTargetPlatform.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:11:7: ( 'TargetPlatformModel' )
            // InternalTargetPlatform.g:11:9: 'TargetPlatformModel'
            {
            match("TargetPlatformModel"); 


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
            // InternalTargetPlatform.g:12:7: ( '{' )
            // InternalTargetPlatform.g:12:9: '{'
            {
            match('{'); 

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
            // InternalTargetPlatform.g:13:7: ( '}' )
            // InternalTargetPlatform.g:13:9: '}'
            {
            match('}'); 

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
            // InternalTargetPlatform.g:14:7: ( 'NetworkConnection' )
            // InternalTargetPlatform.g:14:9: 'NetworkConnection'
            {
            match("NetworkConnection"); 


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
            // InternalTargetPlatform.g:15:7: ( '<->' )
            // InternalTargetPlatform.g:15:9: '<->'
            {
            match("<->"); 


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
            // InternalTargetPlatform.g:16:7: ( 'kind' )
            // InternalTargetPlatform.g:16:9: 'kind'
            {
            match("kind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:17:7: ( 'TargetPlatformDefinition' )
            // InternalTargetPlatform.g:17:9: 'TargetPlatformDefinition'
            {
            match("TargetPlatformDefinition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:18:7: ( 'Windows' )
            // InternalTargetPlatform.g:18:9: 'Windows'
            {
            match("Windows"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:19:7: ( ';' )
            // InternalTargetPlatform.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:20:7: ( 'Linux' )
            // InternalTargetPlatform.g:20:9: 'Linux'
            {
            match("Linux"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:21:7: ( 'MacOS' )
            // InternalTargetPlatform.g:21:9: 'MacOS'
            {
            match("MacOS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:22:7: ( 'NetworkInterface' )
            // InternalTargetPlatform.g:22:9: 'NetworkInterface'
            {
            match("NetworkInterface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:23:7: ( 'HostAddress' )
            // InternalTargetPlatform.g:23:9: 'HostAddress'
            {
            match("HostAddress"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:24:7: ( ':' )
            // InternalTargetPlatform.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:25:7: ( 'Kind' )
            // InternalTargetPlatform.g:25:9: 'Kind'
            {
            match("Kind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:26:7: ( 'CPU' )
            // InternalTargetPlatform.g:26:9: 'CPU'
            {
            match("CPU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:27:7: ( 'CoresTally' )
            // InternalTargetPlatform.g:27:9: 'CoresTally'
            {
            match("CoresTally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:28:7: ( 'LoginAccount' )
            // InternalTargetPlatform.g:28:9: 'LoginAccount'
            {
            match("LoginAccount"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:29:7: ( 'FullName' )
            // InternalTargetPlatform.g:29:9: 'FullName'
            {
            match("FullName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:30:7: ( 'Email' )
            // InternalTargetPlatform.g:30:9: 'Email'
            {
            match("Email"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:31:7: ( 'TargetMiddleware' )
            // InternalTargetPlatform.g:31:9: 'TargetMiddleware'
            {
            match("TargetMiddleware"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:32:7: ( '.' )
            // InternalTargetPlatform.g:32:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:33:7: ( '-' )
            // InternalTargetPlatform.g:33:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:34:7: ( 'ACE_SmartSoft' )
            // InternalTargetPlatform.g:34:9: 'ACE_SmartSoft'
            {
            match("ACE_SmartSoft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:35:7: ( 'description' )
            // InternalTargetPlatform.g:35:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:36:7: ( 'OpcUa_SeRoNet' )
            // InternalTargetPlatform.g:36:9: 'OpcUa_SeRoNet'
            {
            match("OpcUa_SeRoNet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:37:7: ( 'CORBA_SmartSoft' )
            // InternalTargetPlatform.g:37:9: 'CORBA_SmartSoft'
            {
            match("CORBA_SmartSoft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:38:7: ( 'DDS_SmartSoft' )
            // InternalTargetPlatform.g:38:9: 'DDS_SmartSoft'
            {
            match("DDS_SmartSoft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTargetPlatform.g:1458:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalTargetPlatform.g:1458:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTargetPlatform.g:1458:31: ( options {greedy=false; } : . )*
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
            	    // InternalTargetPlatform.g:1458:59: .
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
            // InternalTargetPlatform.g:1460:32: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalTargetPlatform.g:1460:34: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalTargetPlatform.g:1460:40: ( options {greedy=false; } : . )*
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
            	    // InternalTargetPlatform.g:1460:68: .
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
            // InternalTargetPlatform.g:1462:17: ( '//' ~ ( '/' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTargetPlatform.g:1462:19: '//' ~ ( '/' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTargetPlatform.g:1462:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTargetPlatform.g:1462:31: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTargetPlatform.g:1462:47: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTargetPlatform.g:1462:48: ( '\\r' )? '\\n'
                    {
                    // InternalTargetPlatform.g:1462:48: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalTargetPlatform.g:1462:48: '\\r'
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
            // InternalTargetPlatform.g:1464:32: ( '///' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTargetPlatform.g:1464:34: '///' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("///"); 

            // InternalTargetPlatform.g:1464:40: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTargetPlatform.g:1464:40: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTargetPlatform.g:1464:56: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTargetPlatform.g:1464:57: ( '\\r' )? '\\n'
                    {
                    // InternalTargetPlatform.g:1464:57: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalTargetPlatform.g:1464:57: '\\r'
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
            // InternalTargetPlatform.g:1466:19: ( ( RULE_ML_DOCUMENTATION | RULE_SL_DOCUMENTATION ) )
            // InternalTargetPlatform.g:1466:21: ( RULE_ML_DOCUMENTATION | RULE_SL_DOCUMENTATION )
            {
            // InternalTargetPlatform.g:1466:21: ( RULE_ML_DOCUMENTATION | RULE_SL_DOCUMENTATION )
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
                    // InternalTargetPlatform.g:1466:22: RULE_ML_DOCUMENTATION
                    {
                    mRULE_ML_DOCUMENTATION(); 

                    }
                    break;
                case 2 :
                    // InternalTargetPlatform.g:1466:44: RULE_SL_DOCUMENTATION
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
            // InternalTargetPlatform.g:1468:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTargetPlatform.g:1468:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTargetPlatform.g:1468:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTargetPlatform.g:1468:11: '^'
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

            // InternalTargetPlatform.g:1468:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTargetPlatform.g:
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
            // InternalTargetPlatform.g:1470:10: ( ( '0' .. '9' )+ )
            // InternalTargetPlatform.g:1470:12: ( '0' .. '9' )+
            {
            // InternalTargetPlatform.g:1470:12: ( '0' .. '9' )+
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
            	    // InternalTargetPlatform.g:1470:13: '0' .. '9'
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
            // InternalTargetPlatform.g:1472:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTargetPlatform.g:1472:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTargetPlatform.g:1472:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalTargetPlatform.g:1472:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTargetPlatform.g:1472:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalTargetPlatform.g:1472:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTargetPlatform.g:1472:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalTargetPlatform.g:1472:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTargetPlatform.g:1472:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalTargetPlatform.g:1472:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTargetPlatform.g:1472:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalTargetPlatform.g:1474:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTargetPlatform.g:1474:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTargetPlatform.g:1474:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalTargetPlatform.g:
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
            // InternalTargetPlatform.g:1476:16: ( . )
            // InternalTargetPlatform.g:1476:18: .
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
        // InternalTargetPlatform.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_DOCU_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt17=36;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalTargetPlatform.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalTargetPlatform.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalTargetPlatform.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalTargetPlatform.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalTargetPlatform.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalTargetPlatform.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalTargetPlatform.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalTargetPlatform.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalTargetPlatform.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalTargetPlatform.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalTargetPlatform.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalTargetPlatform.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalTargetPlatform.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalTargetPlatform.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalTargetPlatform.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalTargetPlatform.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalTargetPlatform.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalTargetPlatform.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalTargetPlatform.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalTargetPlatform.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalTargetPlatform.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalTargetPlatform.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalTargetPlatform.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalTargetPlatform.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalTargetPlatform.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalTargetPlatform.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalTargetPlatform.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalTargetPlatform.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalTargetPlatform.g:1:178: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // InternalTargetPlatform.g:1:194: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // InternalTargetPlatform.g:1:210: RULE_DOCU_COMMENT
                {
                mRULE_DOCU_COMMENT(); 

                }
                break;
            case 32 :
                // InternalTargetPlatform.g:1:228: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalTargetPlatform.g:1:236: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // InternalTargetPlatform.g:1:245: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalTargetPlatform.g:1:257: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalTargetPlatform.g:1:265: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\40\2\uffff\1\40\1\36\2\40\1\uffff\3\40\1\uffff\4\40\2\uffff\4\40\2\36\2\uffff\2\36\2\uffff\1\40\3\uffff\1\40\1\uffff\2\40\1\uffff\4\40\1\uffff\6\40\2\uffff\4\40\5\uffff\11\40\1\134\10\40\3\uffff\2\40\1\147\5\40\1\155\1\uffff\12\40\1\uffff\1\40\1\171\1\40\1\173\1\40\1\uffff\3\40\1\u0080\7\40\1\uffff\1\40\1\uffff\4\40\1\uffff\7\40\1\u0096\15\40\1\uffff\4\40\1\u00a8\14\40\1\uffff\12\40\1\u00bf\12\40\1\u00ca\1\uffff\2\40\1\u00cd\6\40\1\u00d4\1\uffff\2\40\1\uffff\6\40\1\uffff\1\40\1\u00de\1\u00df\1\u00e0\5\40\3\uffff\5\40\1\u00ec\2\40\1\u00ef\1\40\1\u00f1\1\uffff\2\40\1\uffff\1\u00f4\1\uffff\2\40\1\uffff\1\u00f7\1\40\1\uffff\4\40\1\u00fd\1\uffff";
    static final String DFA17_eofS =
        "\u00fe\uffff";
    static final String DFA17_minS =
        "\1\0\1\141\2\uffff\1\145\1\55\2\151\1\uffff\1\151\1\141\1\157\1\uffff\1\151\1\117\1\165\1\155\2\uffff\1\103\1\145\1\160\1\104\1\52\1\101\2\uffff\2\0\2\uffff\1\162\3\uffff\1\164\1\uffff\2\156\1\uffff\1\156\1\147\1\143\1\163\1\uffff\1\156\1\125\1\162\1\122\1\154\1\141\2\uffff\1\105\1\163\1\143\1\123\2\0\3\uffff\1\147\1\167\2\144\1\165\1\151\1\117\1\164\1\144\1\60\1\145\1\102\1\154\1\151\1\137\1\143\1\125\1\137\3\uffff\1\145\1\157\1\60\1\157\1\170\1\156\1\123\1\101\1\60\1\uffff\1\163\1\101\1\116\1\154\1\123\1\162\1\141\1\123\1\164\1\162\1\uffff\1\167\1\60\1\101\1\60\1\144\1\uffff\1\124\1\137\1\141\1\60\1\155\1\151\1\137\1\155\1\115\1\153\1\163\1\uffff\1\143\1\uffff\1\144\1\141\1\123\1\155\1\uffff\1\141\1\160\1\123\1\141\1\154\1\151\1\103\1\60\1\143\1\162\1\154\1\155\1\145\1\162\1\164\1\145\1\162\1\141\1\144\1\157\1\156\1\uffff\1\157\1\145\1\154\1\141\1\60\1\164\1\151\1\122\2\164\1\144\1\156\1\164\1\165\1\163\1\171\1\162\1\uffff\1\123\2\157\1\123\1\146\1\154\1\156\1\145\1\156\1\163\1\60\1\164\1\157\1\156\1\116\2\157\2\145\1\162\1\164\1\60\1\uffff\1\123\1\146\1\60\1\145\1\146\1\162\1\167\1\143\1\146\1\60\1\uffff\1\157\1\164\1\uffff\2\164\1\155\1\141\1\164\1\141\1\uffff\1\146\3\60\1\104\1\162\1\151\1\143\1\164\3\uffff\1\157\2\145\1\157\1\145\1\60\1\144\1\146\1\60\1\156\1\60\1\uffff\1\145\1\151\1\uffff\1\60\1\uffff\1\154\1\156\1\uffff\1\60\1\151\1\uffff\1\164\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\141\2\uffff\1\145\1\55\2\151\1\uffff\1\157\1\141\1\157\1\uffff\1\151\1\157\1\165\1\155\2\uffff\1\103\1\145\1\160\1\104\1\57\1\172\2\uffff\2\uffff\2\uffff\1\162\3\uffff\1\164\1\uffff\2\156\1\uffff\1\156\1\147\1\143\1\163\1\uffff\1\156\1\125\1\162\1\122\1\154\1\141\2\uffff\1\105\1\163\1\143\1\123\2\uffff\3\uffff\1\147\1\167\2\144\1\165\1\151\1\117\1\164\1\144\1\172\1\145\1\102\1\154\1\151\1\137\1\143\1\125\1\137\3\uffff\1\145\1\157\1\172\1\157\1\170\1\156\1\123\1\101\1\172\1\uffff\1\163\1\101\1\116\1\154\1\123\1\162\1\141\1\123\1\164\1\162\1\uffff\1\167\1\172\1\101\1\172\1\144\1\uffff\1\124\1\137\1\141\1\172\1\155\1\151\1\137\1\155\1\120\1\153\1\163\1\uffff\1\143\1\uffff\1\144\1\141\1\123\1\155\1\uffff\1\141\1\160\1\123\1\141\1\154\1\151\1\111\1\172\1\143\1\162\1\154\1\155\1\145\1\162\1\164\1\145\1\162\1\141\1\144\1\157\1\156\1\uffff\1\157\1\145\1\154\1\141\1\172\1\164\1\151\1\122\2\164\1\144\1\156\1\164\1\165\1\163\1\171\1\162\1\uffff\1\123\2\157\1\123\1\146\1\154\1\156\1\145\1\156\1\163\1\172\1\164\1\157\1\156\1\116\2\157\2\145\1\162\1\164\1\172\1\uffff\1\123\1\146\1\172\1\145\1\146\1\162\1\167\1\143\1\146\1\172\1\uffff\1\157\1\164\1\uffff\2\164\1\155\1\141\1\164\1\141\1\uffff\1\146\3\172\1\115\1\162\1\151\1\143\1\164\3\uffff\1\157\2\145\1\157\1\145\1\172\1\144\1\146\1\172\1\156\1\172\1\uffff\1\145\1\151\1\uffff\1\172\1\uffff\1\154\1\156\1\uffff\1\172\1\151\1\uffff\1\164\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\4\uffff\1\11\3\uffff\1\16\4\uffff\1\26\1\27\6\uffff\1\40\1\41\2\uffff\1\43\1\44\1\uffff\1\40\1\2\1\3\1\uffff\1\5\2\uffff\1\11\4\uffff\1\16\6\uffff\1\26\1\27\6\uffff\1\41\1\42\1\43\22\uffff\1\35\1\37\1\36\11\uffff\1\20\12\uffff\1\6\5\uffff\1\17\13\uffff\1\12\1\uffff\1\13\4\uffff\1\24\25\uffff\1\10\21\uffff\1\23\26\uffff\1\21\12\uffff\1\15\2\uffff\1\31\6\uffff\1\22\11\uffff\1\30\1\32\1\34\13\uffff\1\33\2\uffff\1\25\1\uffff\1\14\2\uffff\1\4\2\uffff\1\1\5\uffff\1\7";
    static final String DFA17_specialS =
        "\1\0\32\uffff\1\1\1\3\34\uffff\1\2\1\4\u00c3\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\33\4\36\1\34\5\36\1\22\1\21\1\27\12\32\1\14\1\10\1\5\4\36\1\23\1\31\1\16\1\26\1\20\1\17\1\31\1\13\2\31\1\15\1\11\1\12\1\4\1\25\4\31\1\1\2\31\1\7\3\31\3\36\1\30\1\31\1\36\3\31\1\24\6\31\1\6\17\31\1\2\1\36\1\3\uff82\36",
            "\1\37",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "\1\50\5\uffff\1\51",
            "\1\52",
            "\1\53",
            "",
            "\1\55",
            "\1\60\1\56\36\uffff\1\57",
            "\1\61",
            "\1\62",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71\4\uffff\1\72",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\0\74",
            "\0\74",
            "",
            "",
            "\1\76",
            "",
            "",
            "",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\52\120\1\121\uffd5\120",
            "\57\122\1\121\uffd0\122",
            "",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "",
            "\1\145",
            "\1\146",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\172",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0086\2\uffff\1\u0085",
            "\1\u0087",
            "\1\u0088",
            "",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094\5\uffff\1\u0095",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00e2\10\uffff\1\u00e1",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00ed",
            "\1\u00ee",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00f0",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_DOCU_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='T') ) {s = 1;}

                        else if ( (LA17_0=='{') ) {s = 2;}

                        else if ( (LA17_0=='}') ) {s = 3;}

                        else if ( (LA17_0=='N') ) {s = 4;}

                        else if ( (LA17_0=='<') ) {s = 5;}

                        else if ( (LA17_0=='k') ) {s = 6;}

                        else if ( (LA17_0=='W') ) {s = 7;}

                        else if ( (LA17_0==';') ) {s = 8;}

                        else if ( (LA17_0=='L') ) {s = 9;}

                        else if ( (LA17_0=='M') ) {s = 10;}

                        else if ( (LA17_0=='H') ) {s = 11;}

                        else if ( (LA17_0==':') ) {s = 12;}

                        else if ( (LA17_0=='K') ) {s = 13;}

                        else if ( (LA17_0=='C') ) {s = 14;}

                        else if ( (LA17_0=='F') ) {s = 15;}

                        else if ( (LA17_0=='E') ) {s = 16;}

                        else if ( (LA17_0=='.') ) {s = 17;}

                        else if ( (LA17_0=='-') ) {s = 18;}

                        else if ( (LA17_0=='A') ) {s = 19;}

                        else if ( (LA17_0=='d') ) {s = 20;}

                        else if ( (LA17_0=='O') ) {s = 21;}

                        else if ( (LA17_0=='D') ) {s = 22;}

                        else if ( (LA17_0=='/') ) {s = 23;}

                        else if ( (LA17_0=='^') ) {s = 24;}

                        else if ( (LA17_0=='B'||LA17_0=='G'||(LA17_0>='I' && LA17_0<='J')||(LA17_0>='P' && LA17_0<='S')||(LA17_0>='U' && LA17_0<='V')||(LA17_0>='X' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='c')||(LA17_0>='e' && LA17_0<='j')||(LA17_0>='l' && LA17_0<='z')) ) {s = 25;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 26;}

                        else if ( (LA17_0=='\"') ) {s = 27;}

                        else if ( (LA17_0=='\'') ) {s = 28;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 29;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<=',')||(LA17_0>='=' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_27 = input.LA(1);

                        s = -1;
                        if ( ((LA17_27>='\u0000' && LA17_27<='\uFFFF')) ) {s = 60;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_57 = input.LA(1);

                        s = -1;
                        if ( ((LA17_57>='\u0000' && LA17_57<=')')||(LA17_57>='+' && LA17_57<='\uFFFF')) ) {s = 80;}

                        else if ( (LA17_57=='*') ) {s = 81;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_28 = input.LA(1);

                        s = -1;
                        if ( ((LA17_28>='\u0000' && LA17_28<='\uFFFF')) ) {s = 60;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_58 = input.LA(1);

                        s = -1;
                        if ( ((LA17_58>='\u0000' && LA17_58<='.')||(LA17_58>='0' && LA17_58<='\uFFFF')) ) {s = 82;}

                        else if ( (LA17_58=='/') ) {s = 81;}

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