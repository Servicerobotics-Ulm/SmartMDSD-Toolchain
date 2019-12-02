package org.xtext.behavior.taskDefinition.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskDefinitionLexer extends Lexer {
    public static final int RULE_ML_DOCUMENTATION=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=6;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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

    public InternalTaskDefinitionLexer() {;} 
    public InternalTaskDefinitionLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTaskDefinitionLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTaskDefinition.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDefinition.g:11:7: ( 'true' )
            // InternalTaskDefinition.g:11:9: 'true'
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
            // InternalTaskDefinition.g:12:7: ( 'false' )
            // InternalTaskDefinition.g:12:9: 'false'
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
            // InternalTaskDefinition.g:13:7: ( 'E' )
            // InternalTaskDefinition.g:13:9: 'E'
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
            // InternalTaskDefinition.g:14:7: ( 'e' )
            // InternalTaskDefinition.g:14:9: 'e'
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
            // InternalTaskDefinition.g:15:7: ( '*' )
            // InternalTaskDefinition.g:15:9: '*'
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
            // InternalTaskDefinition.g:16:7: ( 'SUCCESS' )
            // InternalTaskDefinition.g:16:9: 'SUCCESS'
            {
            match("SUCCESS"); 


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
            // InternalTaskDefinition.g:17:7: ( 'ERROR' )
            // InternalTaskDefinition.g:17:9: 'ERROR'
            {
            match("ERROR"); 


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
            // InternalTaskDefinition.g:18:7: ( 'Int8' )
            // InternalTaskDefinition.g:18:9: 'Int8'
            {
            match("Int8"); 


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
            // InternalTaskDefinition.g:19:7: ( 'Int16' )
            // InternalTaskDefinition.g:19:9: 'Int16'
            {
            match("Int16"); 


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
            // InternalTaskDefinition.g:20:7: ( 'Int32' )
            // InternalTaskDefinition.g:20:9: 'Int32'
            {
            match("Int32"); 


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
            // InternalTaskDefinition.g:21:7: ( 'Int64' )
            // InternalTaskDefinition.g:21:9: 'Int64'
            {
            match("Int64"); 


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
            // InternalTaskDefinition.g:22:7: ( 'UInt8' )
            // InternalTaskDefinition.g:22:9: 'UInt8'
            {
            match("UInt8"); 


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
            // InternalTaskDefinition.g:23:7: ( 'UInt16' )
            // InternalTaskDefinition.g:23:9: 'UInt16'
            {
            match("UInt16"); 


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
            // InternalTaskDefinition.g:24:7: ( 'UInt32' )
            // InternalTaskDefinition.g:24:9: 'UInt32'
            {
            match("UInt32"); 


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
            // InternalTaskDefinition.g:25:7: ( 'UInt64' )
            // InternalTaskDefinition.g:25:9: 'UInt64'
            {
            match("UInt64"); 


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
            // InternalTaskDefinition.g:26:7: ( 'Float' )
            // InternalTaskDefinition.g:26:9: 'Float'
            {
            match("Float"); 


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
            // InternalTaskDefinition.g:27:7: ( 'Double' )
            // InternalTaskDefinition.g:27:9: 'Double'
            {
            match("Double"); 


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
            // InternalTaskDefinition.g:28:7: ( 'String' )
            // InternalTaskDefinition.g:28:9: 'String'
            {
            match("String"); 


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
            // InternalTaskDefinition.g:29:7: ( 'Boolean' )
            // InternalTaskDefinition.g:29:9: 'Boolean'
            {
            match("Boolean"); 


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
            // InternalTaskDefinition.g:30:7: ( 'TaskDefinitionRepository' )
            // InternalTaskDefinition.g:30:9: 'TaskDefinitionRepository'
            {
            match("TaskDefinitionRepository"); 


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
            // InternalTaskDefinition.g:31:7: ( '{' )
            // InternalTaskDefinition.g:31:9: '{'
            {
            match('{'); 

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
            // InternalTaskDefinition.g:32:7: ( '}' )
            // InternalTaskDefinition.g:32:9: '}'
            {
            match('}'); 

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
            // InternalTaskDefinition.g:33:7: ( 'TaskDefinition' )
            // InternalTaskDefinition.g:33:9: 'TaskDefinition'
            {
            match("TaskDefinition"); 


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
            // InternalTaskDefinition.g:34:7: ( 'results' )
            // InternalTaskDefinition.g:34:9: 'results'
            {
            match("results"); 


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
            // InternalTaskDefinition.g:35:7: ( 'in' )
            // InternalTaskDefinition.g:35:9: 'in'
            {
            match("in"); 


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
            // InternalTaskDefinition.g:36:7: ( 'out' )
            // InternalTaskDefinition.g:36:9: 'out'
            {
            match("out"); 


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
            // InternalTaskDefinition.g:37:7: ( 'value' )
            // InternalTaskDefinition.g:37:9: 'value'
            {
            match("value"); 


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
            // InternalTaskDefinition.g:38:7: ( '=' )
            // InternalTaskDefinition.g:38:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDefinition.g:39:7: ( ';' )
            // InternalTaskDefinition.g:39:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDefinition.g:40:7: ( ':' )
            // InternalTaskDefinition.g:40:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDefinition.g:41:7: ( '.' )
            // InternalTaskDefinition.g:41:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDefinition.g:42:7: ( '-' )
            // InternalTaskDefinition.g:42:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDefinition.g:43:7: ( 'InlineEnumeration' )
            // InternalTaskDefinition.g:43:9: 'InlineEnumeration'
            {
            match("InlineEnumeration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDefinition.g:44:7: ( '[' )
            // InternalTaskDefinition.g:44:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDefinition.g:45:7: ( ']' )
            // InternalTaskDefinition.g:45:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDefinition.g:46:7: ( ',' )
            // InternalTaskDefinition.g:46:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaskDefinition.g:3511:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // InternalTaskDefinition.g:3511:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTaskDefinition.g:3511:31: ( options {greedy=false; } : . )*
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
            	    // InternalTaskDefinition.g:3511:59: .
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
            // InternalTaskDefinition.g:3513:32: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // InternalTaskDefinition.g:3513:34: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // InternalTaskDefinition.g:3513:40: ( options {greedy=false; } : . )*
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
            	    // InternalTaskDefinition.g:3513:68: .
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
            // InternalTaskDefinition.g:3515:17: ( '//' ~ ( '/' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTaskDefinition.g:3515:19: '//' ~ ( '/' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTaskDefinition.g:3515:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTaskDefinition.g:3515:31: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTaskDefinition.g:3515:47: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTaskDefinition.g:3515:48: ( '\\r' )? '\\n'
                    {
                    // InternalTaskDefinition.g:3515:48: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalTaskDefinition.g:3515:48: '\\r'
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
            // InternalTaskDefinition.g:3517:32: ( '///' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTaskDefinition.g:3517:34: '///' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("///"); 

            // InternalTaskDefinition.g:3517:40: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTaskDefinition.g:3517:40: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTaskDefinition.g:3517:56: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaskDefinition.g:3517:57: ( '\\r' )? '\\n'
                    {
                    // InternalTaskDefinition.g:3517:57: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalTaskDefinition.g:3517:57: '\\r'
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
            // InternalTaskDefinition.g:3519:19: ( ( RULE_ML_DOCUMENTATION | RULE_SL_DOCUMENTATION ) )
            // InternalTaskDefinition.g:3519:21: ( RULE_ML_DOCUMENTATION | RULE_SL_DOCUMENTATION )
            {
            // InternalTaskDefinition.g:3519:21: ( RULE_ML_DOCUMENTATION | RULE_SL_DOCUMENTATION )
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
                    // InternalTaskDefinition.g:3519:22: RULE_ML_DOCUMENTATION
                    {
                    mRULE_ML_DOCUMENTATION(); 

                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:3519:44: RULE_SL_DOCUMENTATION
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
            // InternalTaskDefinition.g:3521:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTaskDefinition.g:3521:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTaskDefinition.g:3521:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTaskDefinition.g:3521:11: '^'
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

            // InternalTaskDefinition.g:3521:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTaskDefinition.g:
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
            // InternalTaskDefinition.g:3523:10: ( ( '0' .. '9' )+ )
            // InternalTaskDefinition.g:3523:12: ( '0' .. '9' )+
            {
            // InternalTaskDefinition.g:3523:12: ( '0' .. '9' )+
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
            	    // InternalTaskDefinition.g:3523:13: '0' .. '9'
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
            // InternalTaskDefinition.g:3525:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTaskDefinition.g:3525:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTaskDefinition.g:3525:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalTaskDefinition.g:3525:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTaskDefinition.g:3525:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalTaskDefinition.g:3525:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTaskDefinition.g:3525:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalTaskDefinition.g:3525:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTaskDefinition.g:3525:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalTaskDefinition.g:3525:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTaskDefinition.g:3525:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalTaskDefinition.g:3527:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTaskDefinition.g:3527:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTaskDefinition.g:3527:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalTaskDefinition.g:
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
            // InternalTaskDefinition.g:3529:16: ( . )
            // InternalTaskDefinition.g:3529:18: .
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
        // InternalTaskDefinition.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_DOCU_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt17=44;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalTaskDefinition.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalTaskDefinition.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalTaskDefinition.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalTaskDefinition.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalTaskDefinition.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalTaskDefinition.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalTaskDefinition.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalTaskDefinition.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalTaskDefinition.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalTaskDefinition.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalTaskDefinition.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalTaskDefinition.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalTaskDefinition.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalTaskDefinition.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalTaskDefinition.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalTaskDefinition.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalTaskDefinition.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalTaskDefinition.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalTaskDefinition.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalTaskDefinition.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalTaskDefinition.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalTaskDefinition.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalTaskDefinition.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalTaskDefinition.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalTaskDefinition.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalTaskDefinition.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalTaskDefinition.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalTaskDefinition.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalTaskDefinition.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalTaskDefinition.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalTaskDefinition.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalTaskDefinition.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalTaskDefinition.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalTaskDefinition.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalTaskDefinition.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalTaskDefinition.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalTaskDefinition.g:1:226: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalTaskDefinition.g:1:242: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalTaskDefinition.g:1:258: RULE_DOCU_COMMENT
                {
                mRULE_DOCU_COMMENT(); 

                }
                break;
            case 40 :
                // InternalTaskDefinition.g:1:276: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // InternalTaskDefinition.g:1:284: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // InternalTaskDefinition.g:1:293: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // InternalTaskDefinition.g:1:305: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // InternalTaskDefinition.g:1:313: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\2\44\1\47\1\50\1\uffff\7\44\2\uffff\4\44\10\uffff\2\42\2\uffff\2\42\2\uffff\1\44\1\uffff\2\44\3\uffff\10\44\2\uffff\1\44\1\122\2\44\15\uffff\15\44\1\uffff\1\150\1\44\3\uffff\1\152\4\44\1\157\12\44\1\uffff\1\44\1\uffff\1\176\1\177\2\44\1\uffff\1\u0082\1\u0083\1\u0084\1\44\1\u0086\3\44\1\u008a\4\44\1\u008f\2\uffff\1\44\1\u0091\3\uffff\1\44\1\uffff\1\u0093\1\u0094\1\u0095\1\uffff\1\u0096\3\44\1\uffff\1\u009a\1\uffff\1\44\4\uffff\1\u009c\1\44\1\u009e\1\uffff\1\44\1\uffff\1\44\1\uffff\13\44\1\u00ad\2\44\1\uffff\2\44\1\u00b2\1\44\1\uffff\6\44\1\u00ba\1\uffff";
    static final String DFA17_eofS =
        "\u00bb\uffff";
    static final String DFA17_minS =
        "\1\0\1\162\1\141\2\60\1\uffff\1\125\1\156\1\111\1\154\2\157\1\141\2\uffff\1\145\1\156\1\165\1\141\10\uffff\1\52\1\101\2\uffff\2\0\2\uffff\1\165\1\uffff\1\154\1\122\3\uffff\1\103\1\162\1\154\1\156\1\157\1\165\1\157\1\163\2\uffff\1\163\1\60\1\164\1\154\10\uffff\2\0\3\uffff\1\145\1\163\1\117\1\103\1\151\1\61\1\151\1\164\1\141\1\142\1\154\1\153\1\165\1\uffff\1\60\1\165\3\uffff\1\60\1\145\1\122\1\105\1\156\1\60\1\66\1\62\1\64\1\156\1\61\1\164\1\154\1\145\1\104\1\154\1\uffff\1\145\1\uffff\2\60\1\123\1\147\1\uffff\3\60\1\145\1\60\1\66\1\62\1\64\1\60\1\145\1\141\1\145\1\164\1\60\2\uffff\1\123\1\60\3\uffff\1\105\1\uffff\3\60\1\uffff\1\60\1\156\1\146\1\163\1\uffff\1\60\1\uffff\1\156\4\uffff\1\60\1\151\1\60\1\uffff\1\165\1\uffff\1\156\1\uffff\1\155\1\151\1\145\1\164\1\162\1\151\1\141\1\157\1\164\1\156\1\151\1\60\1\157\1\145\1\uffff\1\156\1\160\1\60\1\157\1\uffff\1\163\1\151\1\164\1\157\1\162\1\171\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\162\1\141\2\172\1\uffff\1\164\1\156\1\111\1\154\2\157\1\141\2\uffff\1\145\1\156\1\165\1\141\10\uffff\1\57\1\172\2\uffff\2\uffff\2\uffff\1\165\1\uffff\1\154\1\122\3\uffff\1\103\1\162\1\164\1\156\1\157\1\165\1\157\1\163\2\uffff\1\163\1\172\1\164\1\154\10\uffff\2\uffff\3\uffff\1\145\1\163\1\117\1\103\1\151\1\70\1\151\1\164\1\141\1\142\1\154\1\153\1\165\1\uffff\1\172\1\165\3\uffff\1\172\1\145\1\122\1\105\1\156\1\172\1\66\1\62\1\64\1\156\1\70\1\164\1\154\1\145\1\104\1\154\1\uffff\1\145\1\uffff\2\172\1\123\1\147\1\uffff\3\172\1\145\1\172\1\66\1\62\1\64\1\172\1\145\1\141\1\145\1\164\1\172\2\uffff\1\123\1\172\3\uffff\1\105\1\uffff\3\172\1\uffff\1\172\1\156\1\146\1\163\1\uffff\1\172\1\uffff\1\156\4\uffff\1\172\1\151\1\172\1\uffff\1\165\1\uffff\1\156\1\uffff\1\155\1\151\1\145\1\164\1\162\1\151\1\141\1\157\1\164\1\156\1\151\1\172\1\157\1\145\1\uffff\1\156\1\160\1\172\1\157\1\uffff\1\163\1\151\1\164\1\157\1\162\1\171\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\5\7\uffff\1\25\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40\1\42\1\43\1\44\2\uffff\1\50\1\51\2\uffff\1\53\1\54\1\uffff\1\50\2\uffff\1\3\1\4\1\5\10\uffff\1\25\1\26\4\uffff\1\34\1\35\1\36\1\37\1\40\1\42\1\43\1\44\2\uffff\1\51\1\52\1\53\15\uffff\1\31\2\uffff\1\45\1\47\1\46\20\uffff\1\32\1\uffff\1\1\4\uffff\1\10\16\uffff\1\2\1\7\2\uffff\1\11\1\12\1\13\1\uffff\1\14\3\uffff\1\20\4\uffff\1\33\1\uffff\1\22\1\uffff\1\15\1\16\1\17\1\21\3\uffff\1\6\1\uffff\1\23\1\uffff\1\30\16\uffff\1\27\4\uffff\1\41\7\uffff\1\24";
    static final String DFA17_specialS =
        "\1\1\36\uffff\1\4\1\3\37\uffff\1\0\1\2\171\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\37\4\42\1\40\2\42\1\5\1\42\1\32\1\27\1\26\1\33\12\36\1\25\1\24\1\42\1\23\3\42\1\35\1\13\1\35\1\12\1\3\1\11\2\35\1\7\11\35\1\6\1\14\1\10\5\35\1\30\1\42\1\31\1\34\1\35\1\42\4\35\1\4\1\2\2\35\1\20\5\35\1\21\2\35\1\17\1\35\1\1\1\35\1\22\4\35\1\15\1\42\1\16\uff82\42",
            "\1\43",
            "\1\45",
            "\12\44\7\uffff\21\44\1\46\10\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\52\36\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100\4\uffff\1\101",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\0\103",
            "\0\103",
            "",
            "",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\113\7\uffff\1\112",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "\1\121",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\125\1\126\uffd5\125",
            "\57\127\1\126\uffd0\127",
            "",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\136\1\uffff\1\137\2\uffff\1\140\1\uffff\1\135",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\151",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\165\1\uffff\1\166\2\uffff\1\167\1\uffff\1\164",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0080",
            "\1\u0081",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0085",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\u0090",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\1\u0092",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u009b",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009d",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u009f",
            "",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\44\7\uffff\21\44\1\u00ac\10\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_DOCU_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_64 = input.LA(1);

                        s = -1;
                        if ( ((LA17_64>='\u0000' && LA17_64<=')')||(LA17_64>='+' && LA17_64<='\uFFFF')) ) {s = 85;}

                        else if ( (LA17_64=='*') ) {s = 86;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='t') ) {s = 1;}

                        else if ( (LA17_0=='f') ) {s = 2;}

                        else if ( (LA17_0=='E') ) {s = 3;}

                        else if ( (LA17_0=='e') ) {s = 4;}

                        else if ( (LA17_0=='*') ) {s = 5;}

                        else if ( (LA17_0=='S') ) {s = 6;}

                        else if ( (LA17_0=='I') ) {s = 7;}

                        else if ( (LA17_0=='U') ) {s = 8;}

                        else if ( (LA17_0=='F') ) {s = 9;}

                        else if ( (LA17_0=='D') ) {s = 10;}

                        else if ( (LA17_0=='B') ) {s = 11;}

                        else if ( (LA17_0=='T') ) {s = 12;}

                        else if ( (LA17_0=='{') ) {s = 13;}

                        else if ( (LA17_0=='}') ) {s = 14;}

                        else if ( (LA17_0=='r') ) {s = 15;}

                        else if ( (LA17_0=='i') ) {s = 16;}

                        else if ( (LA17_0=='o') ) {s = 17;}

                        else if ( (LA17_0=='v') ) {s = 18;}

                        else if ( (LA17_0=='=') ) {s = 19;}

                        else if ( (LA17_0==';') ) {s = 20;}

                        else if ( (LA17_0==':') ) {s = 21;}

                        else if ( (LA17_0=='.') ) {s = 22;}

                        else if ( (LA17_0=='-') ) {s = 23;}

                        else if ( (LA17_0=='[') ) {s = 24;}

                        else if ( (LA17_0==']') ) {s = 25;}

                        else if ( (LA17_0==',') ) {s = 26;}

                        else if ( (LA17_0=='/') ) {s = 27;}

                        else if ( (LA17_0=='^') ) {s = 28;}

                        else if ( (LA17_0=='A'||LA17_0=='C'||(LA17_0>='G' && LA17_0<='H')||(LA17_0>='J' && LA17_0<='R')||(LA17_0>='V' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='d')||(LA17_0>='g' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='n')||(LA17_0>='p' && LA17_0<='q')||LA17_0=='s'||LA17_0=='u'||(LA17_0>='w' && LA17_0<='z')) ) {s = 29;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 30;}

                        else if ( (LA17_0=='\"') ) {s = 31;}

                        else if ( (LA17_0=='\'') ) {s = 32;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 33;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<=')')||LA17_0=='+'||LA17_0=='<'||(LA17_0>='>' && LA17_0<='@')||LA17_0=='\\'||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_65 = input.LA(1);

                        s = -1;
                        if ( ((LA17_65>='\u0000' && LA17_65<='.')||(LA17_65>='0' && LA17_65<='\uFFFF')) ) {s = 87;}

                        else if ( (LA17_65=='/') ) {s = 86;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_32 = input.LA(1);

                        s = -1;
                        if ( ((LA17_32>='\u0000' && LA17_32<='\uFFFF')) ) {s = 67;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_31 = input.LA(1);

                        s = -1;
                        if ( ((LA17_31>='\u0000' && LA17_31<='\uFFFF')) ) {s = 67;}

                        else s = 34;

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