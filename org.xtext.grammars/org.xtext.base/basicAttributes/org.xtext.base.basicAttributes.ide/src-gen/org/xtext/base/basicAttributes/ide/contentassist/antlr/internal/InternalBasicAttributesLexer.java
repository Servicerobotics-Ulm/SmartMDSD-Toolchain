package org.xtext.base.basicAttributes.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBasicAttributesLexer extends Lexer {
    public static final int RULE_ML_DOCUMENTATION=9;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=11;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalBasicAttributesLexer() {;} 
    public InternalBasicAttributesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBasicAttributesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBasicAttributes.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicAttributes.g:11:7: ( 'true' )
            // InternalBasicAttributes.g:11:9: 'true'
            {
            match("true"); 


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
            // InternalBasicAttributes.g:12:7: ( 'false' )
            // InternalBasicAttributes.g:12:9: 'false'
            {
            match("false"); 


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
            // InternalBasicAttributes.g:13:7: ( 'E' )
            // InternalBasicAttributes.g:13:9: 'E'
            {
            match('E'); 

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
            // InternalBasicAttributes.g:14:7: ( 'e' )
            // InternalBasicAttributes.g:14:9: 'e'
            {
            match('e'); 

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
            // InternalBasicAttributes.g:15:7: ( '*' )
            // InternalBasicAttributes.g:15:9: '*'
            {
            match('*'); 

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
            // InternalBasicAttributes.g:16:7: ( 'Int8' )
            // InternalBasicAttributes.g:16:9: 'Int8'
            {
            match("Int8"); 


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
            // InternalBasicAttributes.g:17:7: ( 'Int16' )
            // InternalBasicAttributes.g:17:9: 'Int16'
            {
            match("Int16"); 


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
            // InternalBasicAttributes.g:18:7: ( 'Int32' )
            // InternalBasicAttributes.g:18:9: 'Int32'
            {
            match("Int32"); 


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
            // InternalBasicAttributes.g:19:7: ( 'Int64' )
            // InternalBasicAttributes.g:19:9: 'Int64'
            {
            match("Int64"); 


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
            // InternalBasicAttributes.g:20:7: ( 'UInt8' )
            // InternalBasicAttributes.g:20:9: 'UInt8'
            {
            match("UInt8"); 


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
            // InternalBasicAttributes.g:21:7: ( 'UInt16' )
            // InternalBasicAttributes.g:21:9: 'UInt16'
            {
            match("UInt16"); 


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
            // InternalBasicAttributes.g:22:7: ( 'UInt32' )
            // InternalBasicAttributes.g:22:9: 'UInt32'
            {
            match("UInt32"); 


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
            // InternalBasicAttributes.g:23:7: ( 'UInt64' )
            // InternalBasicAttributes.g:23:9: 'UInt64'
            {
            match("UInt64"); 


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
            // InternalBasicAttributes.g:24:7: ( 'Float' )
            // InternalBasicAttributes.g:24:9: 'Float'
            {
            match("Float"); 


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
            // InternalBasicAttributes.g:25:7: ( 'Double' )
            // InternalBasicAttributes.g:25:9: 'Double'
            {
            match("Double"); 


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
            // InternalBasicAttributes.g:26:7: ( 'String' )
            // InternalBasicAttributes.g:26:9: 'String'
            {
            match("String"); 


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
            // InternalBasicAttributes.g:27:7: ( 'Boolean' )
            // InternalBasicAttributes.g:27:9: 'Boolean'
            {
            match("Boolean"); 


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
            // InternalBasicAttributes.g:28:7: ( ':' )
            // InternalBasicAttributes.g:28:9: ':'
            {
            match(':'); 

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
            // InternalBasicAttributes.g:29:7: ( ';' )
            // InternalBasicAttributes.g:29:9: ';'
            {
            match(';'); 

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
            // InternalBasicAttributes.g:30:7: ( '=' )
            // InternalBasicAttributes.g:30:9: '='
            {
            match('='); 

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
            // InternalBasicAttributes.g:31:7: ( '.' )
            // InternalBasicAttributes.g:31:9: '.'
            {
            match('.'); 

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
            // InternalBasicAttributes.g:32:7: ( '-' )
            // InternalBasicAttributes.g:32:9: '-'
            {
            match('-'); 

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
            // InternalBasicAttributes.g:33:7: ( 'InlineEnumeration' )
            // InternalBasicAttributes.g:33:9: 'InlineEnumeration'
            {
            match("InlineEnumeration"); 


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
            // InternalBasicAttributes.g:34:7: ( '{' )
            // InternalBasicAttributes.g:34:9: '{'
            {
            match('{'); 

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
            // InternalBasicAttributes.g:35:7: ( '}' )
            // InternalBasicAttributes.g:35:9: '}'
            {
            match('}'); 

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
            // InternalBasicAttributes.g:36:7: ( '[' )
            // InternalBasicAttributes.g:36:9: '['
            {
            match('['); 

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
            // InternalBasicAttributes.g:37:7: ( ']' )
            // InternalBasicAttributes.g:37:9: ']'
            {
            match(']'); 

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
            // InternalBasicAttributes.g:38:7: ( ',' )
            // InternalBasicAttributes.g:38:9: ','
            {
            match(','); 

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
            // InternalBasicAttributes.g:2422:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalBasicAttributes.g:2422:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBasicAttributes.g:2422:31: ( options {greedy=false; } : . )*
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
            	    // InternalBasicAttributes.g:2422:59: .
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
            // InternalBasicAttributes.g:2424:32: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalBasicAttributes.g:2424:34: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalBasicAttributes.g:2424:40: ( options {greedy=false; } : . )*
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
            	    // InternalBasicAttributes.g:2424:68: .
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
            // InternalBasicAttributes.g:2426:17: ( '//' ~ ( '/' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBasicAttributes.g:2426:19: '//' ~ ( '/' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBasicAttributes.g:2426:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBasicAttributes.g:2426:31: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalBasicAttributes.g:2426:47: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBasicAttributes.g:2426:48: ( '\\r' )? '\\n'
                    {
                    // InternalBasicAttributes.g:2426:48: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalBasicAttributes.g:2426:48: '\\r'
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
            // InternalBasicAttributes.g:2428:32: ( '///' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBasicAttributes.g:2428:34: '///' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("///"); 

            // InternalBasicAttributes.g:2428:40: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBasicAttributes.g:2428:40: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalBasicAttributes.g:2428:56: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBasicAttributes.g:2428:57: ( '\\r' )? '\\n'
                    {
                    // InternalBasicAttributes.g:2428:57: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalBasicAttributes.g:2428:57: '\\r'
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
            // InternalBasicAttributes.g:2430:19: ( ( RULE_ML_DOCUMENTATION | RULE_SL_DOCUMENTATION ) )
            // InternalBasicAttributes.g:2430:21: ( RULE_ML_DOCUMENTATION | RULE_SL_DOCUMENTATION )
            {
            // InternalBasicAttributes.g:2430:21: ( RULE_ML_DOCUMENTATION | RULE_SL_DOCUMENTATION )
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
                    // InternalBasicAttributes.g:2430:22: RULE_ML_DOCUMENTATION
                    {
                    mRULE_ML_DOCUMENTATION(); 

                    }
                    break;
                case 2 :
                    // InternalBasicAttributes.g:2430:44: RULE_SL_DOCUMENTATION
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
            // InternalBasicAttributes.g:2432:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBasicAttributes.g:2432:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBasicAttributes.g:2432:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBasicAttributes.g:2432:11: '^'
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

            // InternalBasicAttributes.g:2432:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBasicAttributes.g:
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
            // InternalBasicAttributes.g:2434:10: ( ( '0' .. '9' )+ )
            // InternalBasicAttributes.g:2434:12: ( '0' .. '9' )+
            {
            // InternalBasicAttributes.g:2434:12: ( '0' .. '9' )+
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
            	    // InternalBasicAttributes.g:2434:13: '0' .. '9'
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
            // InternalBasicAttributes.g:2436:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBasicAttributes.g:2436:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBasicAttributes.g:2436:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalBasicAttributes.g:2436:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBasicAttributes.g:2436:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalBasicAttributes.g:2436:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBasicAttributes.g:2436:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalBasicAttributes.g:2436:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBasicAttributes.g:2436:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalBasicAttributes.g:2436:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBasicAttributes.g:2436:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalBasicAttributes.g:2438:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBasicAttributes.g:2438:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBasicAttributes.g:2438:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalBasicAttributes.g:
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
            // InternalBasicAttributes.g:2440:16: ( . )
            // InternalBasicAttributes.g:2440:18: .
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
        // InternalBasicAttributes.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_DOCU_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt17=36;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalBasicAttributes.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalBasicAttributes.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalBasicAttributes.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalBasicAttributes.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalBasicAttributes.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalBasicAttributes.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalBasicAttributes.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalBasicAttributes.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalBasicAttributes.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalBasicAttributes.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalBasicAttributes.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalBasicAttributes.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalBasicAttributes.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalBasicAttributes.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalBasicAttributes.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalBasicAttributes.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalBasicAttributes.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalBasicAttributes.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalBasicAttributes.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalBasicAttributes.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalBasicAttributes.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalBasicAttributes.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalBasicAttributes.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalBasicAttributes.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalBasicAttributes.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalBasicAttributes.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalBasicAttributes.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalBasicAttributes.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalBasicAttributes.g:1:178: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // InternalBasicAttributes.g:1:194: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // InternalBasicAttributes.g:1:210: RULE_DOCU_COMMENT
                {
                mRULE_DOCU_COMMENT(); 

                }
                break;
            case 32 :
                // InternalBasicAttributes.g:1:228: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalBasicAttributes.g:1:236: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // InternalBasicAttributes.g:1:245: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalBasicAttributes.g:1:257: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalBasicAttributes.g:1:265: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\2\37\1\41\1\42\1\uffff\6\37\12\uffff\2\35\2\uffff\2\35\2\uffff\1\37\1\uffff\1\37\3\uffff\6\37\17\uffff\11\37\3\uffff\1\121\1\37\1\123\11\37\1\uffff\1\140\1\uffff\1\141\1\142\1\143\1\37\1\145\3\37\1\151\3\37\4\uffff\1\37\1\uffff\1\156\1\157\1\160\1\uffff\1\161\1\162\2\37\5\uffff\1\165\1\37\1\uffff\10\37\1\177\1\uffff";
    static final String DFA17_eofS =
        "\u0080\uffff";
    static final String DFA17_minS =
        "\1\0\1\162\1\141\2\60\1\uffff\1\156\1\111\1\154\1\157\1\164\1\157\12\uffff\1\52\1\101\2\uffff\2\0\2\uffff\1\165\1\uffff\1\154\3\uffff\1\154\1\156\1\157\1\165\1\162\1\157\12\uffff\2\0\3\uffff\1\145\1\163\1\61\1\151\1\164\1\141\1\142\1\151\1\154\3\uffff\1\60\1\145\1\60\1\66\1\62\1\64\1\156\1\61\1\164\1\154\1\156\1\145\1\uffff\1\60\1\uffff\3\60\1\145\1\60\1\66\1\62\1\64\1\60\1\145\1\147\1\141\4\uffff\1\105\1\uffff\3\60\1\uffff\2\60\2\156\5\uffff\1\60\1\165\1\uffff\1\155\1\145\1\162\1\141\1\164\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\162\1\141\2\172\1\uffff\1\156\1\111\1\154\1\157\1\164\1\157\12\uffff\1\57\1\172\2\uffff\2\uffff\2\uffff\1\165\1\uffff\1\154\3\uffff\1\164\1\156\1\157\1\165\1\162\1\157\12\uffff\2\uffff\3\uffff\1\145\1\163\1\70\1\151\1\164\1\141\1\142\1\151\1\154\3\uffff\1\172\1\145\1\172\1\66\1\62\1\64\1\156\1\70\1\164\1\154\1\156\1\145\1\uffff\1\172\1\uffff\3\172\1\145\1\172\1\66\1\62\1\64\1\172\1\145\1\147\1\141\4\uffff\1\105\1\uffff\3\172\1\uffff\2\172\2\156\5\uffff\1\172\1\165\1\uffff\1\155\1\145\1\162\1\141\1\164\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\5\6\uffff\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\33\1\34\2\uffff\1\40\1\41\2\uffff\1\43\1\44\1\uffff\1\40\1\uffff\1\3\1\4\1\5\6\uffff\1\22\1\23\1\24\1\25\1\26\1\30\1\31\1\32\1\33\1\34\2\uffff\1\41\1\42\1\43\11\uffff\1\35\1\37\1\36\14\uffff\1\1\1\uffff\1\6\14\uffff\1\2\1\7\1\10\1\11\1\uffff\1\12\3\uffff\1\16\4\uffff\1\13\1\14\1\15\1\17\1\20\2\uffff\1\21\11\uffff\1\27";
    static final String DFA17_specialS =
        "\1\0\31\uffff\1\4\1\3\30\uffff\1\1\1\2\112\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\32\4\35\1\33\2\35\1\5\1\35\1\25\1\20\1\17\1\26\12\31\1\14\1\15\1\35\1\16\3\35\1\30\1\13\1\30\1\11\1\3\1\10\2\30\1\6\11\30\1\12\1\30\1\7\5\30\1\23\1\35\1\24\1\27\1\30\1\35\4\30\1\4\1\2\15\30\1\1\6\30\1\21\1\35\1\22\uff82\35",
            "\1\36",
            "\1\40",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64\4\uffff\1\65",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\67",
            "\0\67",
            "",
            "",
            "\1\71",
            "",
            "\1\72",
            "",
            "",
            "",
            "\1\74\7\uffff\1\73",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\102\1\103\uffd5\102",
            "\57\104\1\103\uffd0\104",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\110\1\uffff\1\111\2\uffff\1\112\1\uffff\1\107",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\122",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\131\1\uffff\1\132\2\uffff\1\133\1\uffff\1\130",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\144",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "",
            "",
            "",
            "\1\155",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\163",
            "\1\164",
            "",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
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
                        if ( (LA17_0=='t') ) {s = 1;}

                        else if ( (LA17_0=='f') ) {s = 2;}

                        else if ( (LA17_0=='E') ) {s = 3;}

                        else if ( (LA17_0=='e') ) {s = 4;}

                        else if ( (LA17_0=='*') ) {s = 5;}

                        else if ( (LA17_0=='I') ) {s = 6;}

                        else if ( (LA17_0=='U') ) {s = 7;}

                        else if ( (LA17_0=='F') ) {s = 8;}

                        else if ( (LA17_0=='D') ) {s = 9;}

                        else if ( (LA17_0=='S') ) {s = 10;}

                        else if ( (LA17_0=='B') ) {s = 11;}

                        else if ( (LA17_0==':') ) {s = 12;}

                        else if ( (LA17_0==';') ) {s = 13;}

                        else if ( (LA17_0=='=') ) {s = 14;}

                        else if ( (LA17_0=='.') ) {s = 15;}

                        else if ( (LA17_0=='-') ) {s = 16;}

                        else if ( (LA17_0=='{') ) {s = 17;}

                        else if ( (LA17_0=='}') ) {s = 18;}

                        else if ( (LA17_0=='[') ) {s = 19;}

                        else if ( (LA17_0==']') ) {s = 20;}

                        else if ( (LA17_0==',') ) {s = 21;}

                        else if ( (LA17_0=='/') ) {s = 22;}

                        else if ( (LA17_0=='^') ) {s = 23;}

                        else if ( (LA17_0=='A'||LA17_0=='C'||(LA17_0>='G' && LA17_0<='H')||(LA17_0>='J' && LA17_0<='R')||LA17_0=='T'||(LA17_0>='V' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='d')||(LA17_0>='g' && LA17_0<='s')||(LA17_0>='u' && LA17_0<='z')) ) {s = 24;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 25;}

                        else if ( (LA17_0=='\"') ) {s = 26;}

                        else if ( (LA17_0=='\'') ) {s = 27;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 28;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<=')')||LA17_0=='+'||LA17_0=='<'||(LA17_0>='>' && LA17_0<='@')||LA17_0=='\\'||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_52 = input.LA(1);

                        s = -1;
                        if ( ((LA17_52>='\u0000' && LA17_52<=')')||(LA17_52>='+' && LA17_52<='\uFFFF')) ) {s = 66;}

                        else if ( (LA17_52=='*') ) {s = 67;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_53 = input.LA(1);

                        s = -1;
                        if ( ((LA17_53>='\u0000' && LA17_53<='.')||(LA17_53>='0' && LA17_53<='\uFFFF')) ) {s = 68;}

                        else if ( (LA17_53=='/') ) {s = 67;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_27 = input.LA(1);

                        s = -1;
                        if ( ((LA17_27>='\u0000' && LA17_27<='\uFFFF')) ) {s = 55;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_26 = input.LA(1);

                        s = -1;
                        if ( ((LA17_26>='\u0000' && LA17_26<='\uFFFF')) ) {s = 55;}

                        else s = 29;

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