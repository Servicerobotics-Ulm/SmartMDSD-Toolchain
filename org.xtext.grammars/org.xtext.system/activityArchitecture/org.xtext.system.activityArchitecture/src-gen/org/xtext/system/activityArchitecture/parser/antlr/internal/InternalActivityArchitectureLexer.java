package org.xtext.system.activityArchitecture.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityArchitectureLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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

    public InternalActivityArchitectureLexer() {;} 
    public InternalActivityArchitectureLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalActivityArchitectureLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalActivityArchitecture.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalActivityArchitecture.g:11:7: ( 'ActivityArchitectureModel' )
            // InternalActivityArchitecture.g:11:9: 'ActivityArchitectureModel'
            {
            match("ActivityArchitectureModel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalActivityArchitecture.g:12:7: ( '{' )
            // InternalActivityArchitecture.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalActivityArchitecture.g:13:7: ( '}' )
            // InternalActivityArchitecture.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalActivityArchitecture.g:14:7: ( '-' )
            // InternalActivityArchitecture.g:14:9: '-'
            {
            match('-'); 

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
            // InternalActivityArchitecture.g:15:7: ( '.' )
            // InternalActivityArchitecture.g:15:9: '.'
            {
            match('.'); 

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
            // InternalActivityArchitecture.g:16:7: ( 'E' )
            // InternalActivityArchitecture.g:16:9: 'E'
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
            // InternalActivityArchitecture.g:17:7: ( 'e' )
            // InternalActivityArchitecture.g:17:9: 'e'
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
            // InternalActivityArchitecture.g:18:7: ( 'DataFlow' )
            // InternalActivityArchitecture.g:18:9: 'DataFlow'
            {
            match("DataFlow"); 


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
            // InternalActivityArchitecture.g:19:7: ( 'source' )
            // InternalActivityArchitecture.g:19:9: 'source'
            {
            match("source"); 


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
            // InternalActivityArchitecture.g:20:7: ( 'destination' )
            // InternalActivityArchitecture.g:20:9: 'destination'
            {
            match("destination"); 


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
            // InternalActivityArchitecture.g:21:7: ( 'InputHandlerNode' )
            // InternalActivityArchitecture.g:21:9: 'InputHandlerNode'
            {
            match("InputHandlerNode"); 


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
            // InternalActivityArchitecture.g:22:7: ( 'input' )
            // InternalActivityArchitecture.g:22:9: 'input'
            {
            match("input"); 


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
            // InternalActivityArchitecture.g:23:7: ( 'prescale' )
            // InternalActivityArchitecture.g:23:9: 'prescale'
            {
            match("prescale"); 


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
            // InternalActivityArchitecture.g:24:7: ( 'TriggerInputNode' )
            // InternalActivityArchitecture.g:24:9: 'TriggerInputNode'
            {
            match("TriggerInputNode"); 


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
            // InternalActivityArchitecture.g:25:7: ( ';' )
            // InternalActivityArchitecture.g:25:9: ';'
            {
            match(';'); 

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
            // InternalActivityArchitecture.g:26:7: ( 'ActivityNode' )
            // InternalActivityArchitecture.g:26:9: 'ActivityNode'
            {
            match("ActivityNode"); 


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
            // InternalActivityArchitecture.g:27:7: ( 'inputs' )
            // InternalActivityArchitecture.g:27:9: 'inputs'
            {
            match("inputs"); 


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
            // InternalActivityArchitecture.g:28:7: ( 'cpuAffinity' )
            // InternalActivityArchitecture.g:28:9: 'cpuAffinity'
            {
            match("cpuAffinity"); 


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
            // InternalActivityArchitecture.g:29:7: ( 'activationSource' )
            // InternalActivityArchitecture.g:29:9: 'activationSource'
            {
            match("activationSource"); 


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
            // InternalActivityArchitecture.g:30:7: ( 'executionTime' )
            // InternalActivityArchitecture.g:30:9: 'executionTime'
            {
            match("executionTime"); 


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
            // InternalActivityArchitecture.g:31:7: ( 'scheduler' )
            // InternalActivityArchitecture.g:31:9: 'scheduler'
            {
            match("scheduler"); 


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
            // InternalActivityArchitecture.g:32:7: ( 'RegisterInputNode' )
            // InternalActivityArchitecture.g:32:9: 'RegisterInputNode'
            {
            match("RegisterInputNode"); 


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
            // InternalActivityArchitecture.g:33:7: ( 'Sporadic' )
            // InternalActivityArchitecture.g:33:9: 'Sporadic'
            {
            match("Sporadic"); 


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
            // InternalActivityArchitecture.g:34:7: ( 'minActFreq' )
            // InternalActivityArchitecture.g:34:9: 'minActFreq'
            {
            match("minActFreq"); 


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
            // InternalActivityArchitecture.g:35:7: ( 'Hz' )
            // InternalActivityArchitecture.g:35:9: 'Hz'
            {
            match("Hz"); 


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
            // InternalActivityArchitecture.g:36:7: ( 'maxActFreq' )
            // InternalActivityArchitecture.g:36:9: 'maxActFreq'
            {
            match("maxActFreq"); 


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
            // InternalActivityArchitecture.g:37:7: ( 'DataTriggered' )
            // InternalActivityArchitecture.g:37:9: 'DataTriggered'
            {
            match("DataTriggered"); 


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
            // InternalActivityArchitecture.g:38:7: ( 'PeriodicTimer' )
            // InternalActivityArchitecture.g:38:9: 'PeriodicTimer'
            {
            match("PeriodicTimer"); 


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
            // InternalActivityArchitecture.g:39:7: ( 'periodicActFreq' )
            // InternalActivityArchitecture.g:39:9: 'periodicActFreq'
            {
            match("periodicActFreq"); 


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
            // InternalActivityArchitecture.g:40:7: ( 'type' )
            // InternalActivityArchitecture.g:40:9: 'type'
            {
            match("type"); 


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
            // InternalActivityArchitecture.g:41:7: ( 'priority' )
            // InternalActivityArchitecture.g:41:9: 'priority'
            {
            match("priority"); 


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
            // InternalActivityArchitecture.g:42:7: ( 'CPUCore' )
            // InternalActivityArchitecture.g:42:9: 'CPUCore'
            {
            match("CPUCore"); 


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
            // InternalActivityArchitecture.g:43:7: ( 'coreNumber' )
            // InternalActivityArchitecture.g:43:9: 'coreNumber'
            {
            match("coreNumber"); 


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
            // InternalActivityArchitecture.g:44:7: ( 'minTime' )
            // InternalActivityArchitecture.g:44:9: 'minTime'
            {
            match("minTime"); 


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
            // InternalActivityArchitecture.g:45:7: ( 'maxTime' )
            // InternalActivityArchitecture.g:45:9: 'maxTime'
            {
            match("maxTime"); 


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
            // InternalActivityArchitecture.g:46:7: ( 'DEFAULT' )
            // InternalActivityArchitecture.g:46:9: 'DEFAULT'
            {
            match("DEFAULT"); 


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
            // InternalActivityArchitecture.g:47:7: ( 'FIFO' )
            // InternalActivityArchitecture.g:47:9: 'FIFO'
            {
            match("FIFO"); 


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
            // InternalActivityArchitecture.g:48:7: ( 'RR' )
            // InternalActivityArchitecture.g:48:9: 'RR'
            {
            match("RR"); 


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
            // InternalActivityArchitecture.g:49:7: ( 'sec' )
            // InternalActivityArchitecture.g:49:9: 'sec'
            {
            match("sec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalActivityArchitecture.g:50:7: ( 'ms' )
            // InternalActivityArchitecture.g:50:9: 'ms'
            {
            match("ms"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalActivityArchitecture.g:51:7: ( 'us' )
            // InternalActivityArchitecture.g:51:9: 'us'
            {
            match("us"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalActivityArchitecture.g:1807:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalActivityArchitecture.g:1807:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalActivityArchitecture.g:1807:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalActivityArchitecture.g:1807:11: '^'
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

            // InternalActivityArchitecture.g:1807:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalActivityArchitecture.g:
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
            	    break loop2;
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
            // InternalActivityArchitecture.g:1809:10: ( ( '0' .. '9' )+ )
            // InternalActivityArchitecture.g:1809:12: ( '0' .. '9' )+
            {
            // InternalActivityArchitecture.g:1809:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalActivityArchitecture.g:1809:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalActivityArchitecture.g:1811:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalActivityArchitecture.g:1811:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalActivityArchitecture.g:1811:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalActivityArchitecture.g:1811:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalActivityArchitecture.g:1811:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalActivityArchitecture.g:1811:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalActivityArchitecture.g:1811:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:1811:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalActivityArchitecture.g:1811:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalActivityArchitecture.g:1811:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalActivityArchitecture.g:1811:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalActivityArchitecture.g:1813:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalActivityArchitecture.g:1813:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalActivityArchitecture.g:1813:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalActivityArchitecture.g:1813:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalActivityArchitecture.g:1815:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalActivityArchitecture.g:1815:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalActivityArchitecture.g:1815:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalActivityArchitecture.g:1815:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalActivityArchitecture.g:1815:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalActivityArchitecture.g:1815:41: ( '\\r' )? '\\n'
                    {
                    // InternalActivityArchitecture.g:1815:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalActivityArchitecture.g:1815:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalActivityArchitecture.g:1817:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalActivityArchitecture.g:1817:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalActivityArchitecture.g:1817:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalActivityArchitecture.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // InternalActivityArchitecture.g:1819:16: ( . )
            // InternalActivityArchitecture.g:1819:18: .
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
        // InternalActivityArchitecture.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=48;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalActivityArchitecture.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalActivityArchitecture.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalActivityArchitecture.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalActivityArchitecture.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalActivityArchitecture.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalActivityArchitecture.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalActivityArchitecture.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalActivityArchitecture.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalActivityArchitecture.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalActivityArchitecture.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalActivityArchitecture.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalActivityArchitecture.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalActivityArchitecture.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalActivityArchitecture.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalActivityArchitecture.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalActivityArchitecture.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalActivityArchitecture.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalActivityArchitecture.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalActivityArchitecture.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalActivityArchitecture.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalActivityArchitecture.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalActivityArchitecture.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalActivityArchitecture.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalActivityArchitecture.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalActivityArchitecture.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalActivityArchitecture.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalActivityArchitecture.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalActivityArchitecture.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalActivityArchitecture.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalActivityArchitecture.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalActivityArchitecture.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalActivityArchitecture.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalActivityArchitecture.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalActivityArchitecture.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalActivityArchitecture.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalActivityArchitecture.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalActivityArchitecture.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalActivityArchitecture.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalActivityArchitecture.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalActivityArchitecture.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalActivityArchitecture.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalActivityArchitecture.g:1:256: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 43 :
                // InternalActivityArchitecture.g:1:264: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // InternalActivityArchitecture.g:1:273: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 45 :
                // InternalActivityArchitecture.g:1:285: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // InternalActivityArchitecture.g:1:301: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // InternalActivityArchitecture.g:1:317: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 48 :
                // InternalActivityArchitecture.g:1:325: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\44\4\uffff\1\51\1\53\7\44\1\uffff\13\44\1\42\2\uffff\3\42\2\uffff\1\44\6\uffff\1\44\1\uffff\13\44\1\uffff\4\44\1\136\3\44\1\142\1\143\4\44\1\150\5\uffff\6\44\1\157\13\44\1\uffff\3\44\2\uffff\4\44\1\uffff\6\44\1\uffff\21\44\1\u009c\1\44\1\u009e\11\44\1\u00a9\16\44\1\uffff\1\44\1\uffff\5\44\1\u00be\3\44\1\u00c2\1\uffff\23\44\1\u00d6\1\uffff\3\44\1\uffff\12\44\1\u00e4\1\44\1\u00e6\1\44\1\u00e8\2\44\1\u00ec\1\44\1\uffff\3\44\1\u00f1\1\u00f2\6\44\1\u00f9\1\44\1\uffff\1\44\1\uffff\1\44\1\uffff\3\44\1\uffff\1\44\1\u0101\2\44\2\uffff\6\44\1\uffff\7\44\1\uffff\5\44\1\u0116\2\44\1\u0119\1\u011a\5\44\1\u0120\3\44\1\u0124\1\uffff\2\44\2\uffff\2\44\1\u0129\2\44\1\uffff\3\44\1\uffff\4\44\1\uffff\1\u0133\1\u0134\5\44\1\u013a\1\44\2\uffff\5\44\1\uffff\2\44\1\u0143\4\44\1\u0148\1\uffff\1\u0149\1\u014a\2\44\3\uffff\1\u014d\1\44\1\uffff\6\44\1\u0155\1\uffff";
    static final String DFA12_eofS =
        "\u0156\uffff";
    static final String DFA12_minS =
        "\1\0\1\143\4\uffff\2\60\1\105\1\143\1\145\2\156\1\145\1\162\1\uffff\1\157\1\143\1\122\1\160\1\141\1\172\1\145\1\171\1\120\1\111\1\163\1\101\2\uffff\2\0\1\52\2\uffff\1\164\6\uffff\1\145\1\uffff\1\164\1\106\1\165\1\150\1\143\1\163\2\160\1\145\1\162\1\151\1\uffff\1\165\1\162\1\164\1\147\1\60\1\157\1\156\1\170\2\60\1\162\1\160\1\125\1\106\1\60\5\uffff\1\151\1\143\1\141\1\101\1\162\1\145\1\60\1\164\2\165\1\163\1\157\1\151\1\147\1\101\1\145\2\151\1\uffff\1\162\2\101\2\uffff\1\151\1\145\1\103\1\117\1\uffff\1\166\1\165\1\106\1\125\1\143\1\144\1\uffff\1\151\2\164\1\143\1\162\1\157\1\147\1\146\1\116\1\166\1\163\1\141\1\143\1\151\1\143\1\151\1\157\1\60\1\157\1\60\1\151\1\164\1\154\1\162\1\114\1\145\1\165\1\156\1\110\1\60\1\141\1\151\1\144\1\145\1\146\1\165\1\141\1\164\1\144\1\164\1\155\1\164\1\155\1\144\1\uffff\1\162\1\uffff\1\164\1\151\1\157\1\151\1\124\1\60\1\154\2\141\1\60\1\uffff\1\154\1\164\1\151\1\162\1\151\1\155\1\164\1\145\1\151\1\106\1\145\1\106\1\145\1\151\1\145\1\171\1\157\1\167\1\147\1\60\1\uffff\1\145\1\164\1\156\1\uffff\1\145\1\171\1\143\1\111\1\156\1\142\1\151\1\162\1\143\1\162\1\60\1\162\1\60\1\143\1\60\1\101\1\156\1\60\1\147\1\uffff\1\162\1\151\1\144\2\60\1\101\1\156\1\151\1\145\1\157\1\111\1\60\1\145\1\uffff\1\145\1\uffff\1\124\1\uffff\1\162\1\157\1\124\1\uffff\1\145\1\60\1\157\1\154\2\uffff\1\143\1\160\1\164\1\162\2\156\1\uffff\2\161\1\151\1\143\1\144\1\151\1\162\1\uffff\1\156\1\145\1\164\1\165\1\171\1\60\1\123\1\160\2\60\1\155\1\150\1\145\1\155\1\145\1\60\1\162\1\106\1\164\1\60\1\uffff\1\157\1\165\2\uffff\1\145\1\151\1\60\1\145\1\144\1\uffff\1\116\1\162\1\116\1\uffff\1\165\1\164\1\162\1\164\1\uffff\2\60\1\157\1\145\1\157\1\162\1\116\1\60\1\145\2\uffff\1\144\1\161\1\144\1\143\1\157\1\uffff\1\143\1\145\1\60\2\145\1\144\1\164\1\60\1\uffff\2\60\1\145\1\165\3\uffff\1\60\1\162\1\uffff\1\145\1\115\1\157\1\144\1\145\1\154\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\143\4\uffff\2\172\1\141\1\157\1\145\2\156\2\162\1\uffff\1\160\1\143\1\145\1\160\1\163\1\172\1\145\1\171\1\120\1\111\1\163\1\172\2\uffff\2\uffff\1\57\2\uffff\1\164\6\uffff\1\145\1\uffff\1\164\1\106\1\165\1\150\1\143\1\163\2\160\1\151\1\162\1\151\1\uffff\1\165\1\162\1\164\1\147\1\172\1\157\1\156\1\170\2\172\1\162\1\160\1\125\1\106\1\172\5\uffff\1\151\1\143\1\141\1\101\1\162\1\145\1\172\1\164\2\165\1\163\1\157\1\151\1\147\1\101\1\145\2\151\1\uffff\1\162\2\124\2\uffff\1\151\1\145\1\103\1\117\1\uffff\1\166\1\165\1\124\1\125\1\143\1\144\1\uffff\1\151\2\164\1\143\1\162\1\157\1\147\1\146\1\116\1\166\1\163\1\141\1\143\1\151\1\143\1\151\1\157\1\172\1\157\1\172\1\151\1\164\1\154\1\162\1\114\1\145\1\165\1\156\1\110\1\172\1\141\1\151\1\144\1\145\1\146\1\165\1\141\1\164\1\144\1\164\1\155\1\164\1\155\1\144\1\uffff\1\162\1\uffff\1\164\1\151\1\157\1\151\1\124\1\172\1\154\2\141\1\172\1\uffff\1\154\1\164\1\151\1\162\1\151\1\155\1\164\1\145\1\151\1\106\1\145\1\106\1\145\1\151\1\145\1\171\1\157\1\167\1\147\1\172\1\uffff\1\145\1\164\1\156\1\uffff\1\145\1\171\1\143\1\111\1\156\1\142\1\151\1\162\1\143\1\162\1\172\1\162\1\172\1\143\1\172\1\116\1\156\1\172\1\147\1\uffff\1\162\1\151\1\144\2\172\1\101\1\156\1\151\1\145\1\157\1\111\1\172\1\145\1\uffff\1\145\1\uffff\1\124\1\uffff\1\162\1\157\1\124\1\uffff\1\145\1\172\1\157\1\154\2\uffff\1\143\1\160\1\164\1\162\2\156\1\uffff\2\161\1\151\1\143\1\144\1\151\1\162\1\uffff\1\156\1\145\1\164\1\165\1\171\1\172\1\123\1\160\2\172\1\155\1\150\1\145\1\155\1\145\1\172\1\162\1\106\1\164\1\172\1\uffff\1\157\1\165\2\uffff\1\145\1\151\1\172\1\145\1\144\1\uffff\1\116\1\162\1\116\1\uffff\1\165\1\164\1\162\1\164\1\uffff\2\172\1\157\1\145\1\157\1\162\1\116\1\172\1\145\2\uffff\1\144\1\161\1\144\1\143\1\157\1\uffff\1\143\1\145\1\172\2\145\1\144\1\164\1\172\1\uffff\2\172\1\145\1\165\3\uffff\1\172\1\162\1\uffff\1\145\1\115\1\157\1\144\1\145\1\154\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\11\uffff\1\17\14\uffff\1\52\1\53\3\uffff\1\57\1\60\1\uffff\1\52\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\13\uffff\1\17\17\uffff\1\53\1\54\1\55\1\56\1\57\22\uffff\1\46\3\uffff\1\50\1\31\4\uffff\1\51\6\uffff\1\47\54\uffff\1\36\1\uffff\1\45\12\uffff\1\14\24\uffff\1\11\3\uffff\1\21\23\uffff\1\44\15\uffff\1\42\1\uffff\1\43\1\uffff\1\40\3\uffff\1\10\4\uffff\1\15\1\37\6\uffff\1\27\7\uffff\1\25\24\uffff\1\41\2\uffff\1\30\1\32\5\uffff\1\12\3\uffff\1\22\4\uffff\1\20\11\uffff\1\24\1\33\5\uffff\1\34\10\uffff\1\35\4\uffff\1\13\1\16\1\23\2\uffff\1\26\7\uffff\1\1";
    static final String DFA12_specialS =
        "\1\1\35\uffff\1\2\1\0\u0136\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\36\4\42\1\37\5\42\1\4\1\5\1\40\12\35\1\42\1\17\5\42\1\1\1\34\1\30\1\10\1\6\1\31\1\34\1\25\1\13\6\34\1\26\1\34\1\22\1\23\1\16\6\34\3\42\1\33\1\34\1\42\1\21\1\34\1\20\1\12\1\7\3\34\1\14\3\34\1\24\2\34\1\15\2\34\1\11\1\27\1\32\5\34\1\2\1\42\1\3\uff82\42",
            "\1\43",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\27\44\1\52\2\44",
            "\1\55\33\uffff\1\54",
            "\1\57\1\uffff\1\60\11\uffff\1\56",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\65\14\uffff\1\64",
            "\1\66",
            "",
            "\1\71\1\70",
            "\1\72",
            "\1\74\22\uffff\1\73",
            "\1\75",
            "\1\77\7\uffff\1\76\11\uffff\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\0\110",
            "\0\110",
            "\1\111\4\uffff\1\112",
            "",
            "",
            "\1\114",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126\3\uffff\1\127",
            "\1\130",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\173",
            "\1\174\22\uffff\1\175",
            "\1\176\22\uffff\1\177",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086\15\uffff\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009d",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\u00a8\7\44",
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
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00e5",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00e7",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00e9\14\uffff\1\u00ea",
            "\1\u00eb",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0102",
            "\1\u0103",
            "",
            "",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0117",
            "\1\u0118",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0125",
            "\1\u0126",
            "",
            "",
            "\1\u0127",
            "\1\u0128",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u012a",
            "\1\u012b",
            "",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u013b",
            "",
            "",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "",
            "\1\u0141",
            "\1\u0142",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u014b",
            "\1\u014c",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 72;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='A') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='}') ) {s = 3;}

                        else if ( (LA12_0=='-') ) {s = 4;}

                        else if ( (LA12_0=='.') ) {s = 5;}

                        else if ( (LA12_0=='E') ) {s = 6;}

                        else if ( (LA12_0=='e') ) {s = 7;}

                        else if ( (LA12_0=='D') ) {s = 8;}

                        else if ( (LA12_0=='s') ) {s = 9;}

                        else if ( (LA12_0=='d') ) {s = 10;}

                        else if ( (LA12_0=='I') ) {s = 11;}

                        else if ( (LA12_0=='i') ) {s = 12;}

                        else if ( (LA12_0=='p') ) {s = 13;}

                        else if ( (LA12_0=='T') ) {s = 14;}

                        else if ( (LA12_0==';') ) {s = 15;}

                        else if ( (LA12_0=='c') ) {s = 16;}

                        else if ( (LA12_0=='a') ) {s = 17;}

                        else if ( (LA12_0=='R') ) {s = 18;}

                        else if ( (LA12_0=='S') ) {s = 19;}

                        else if ( (LA12_0=='m') ) {s = 20;}

                        else if ( (LA12_0=='H') ) {s = 21;}

                        else if ( (LA12_0=='P') ) {s = 22;}

                        else if ( (LA12_0=='t') ) {s = 23;}

                        else if ( (LA12_0=='C') ) {s = 24;}

                        else if ( (LA12_0=='F') ) {s = 25;}

                        else if ( (LA12_0=='u') ) {s = 26;}

                        else if ( (LA12_0=='^') ) {s = 27;}

                        else if ( (LA12_0=='B'||LA12_0=='G'||(LA12_0>='J' && LA12_0<='O')||LA12_0=='Q'||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='v' && LA12_0<='z')) ) {s = 28;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 29;}

                        else if ( (LA12_0=='\"') ) {s = 30;}

                        else if ( (LA12_0=='\'') ) {s = 31;}

                        else if ( (LA12_0=='/') ) {s = 32;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 33;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=',')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 72;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}