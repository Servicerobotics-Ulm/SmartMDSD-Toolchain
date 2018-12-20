package org.xtext.service.domainModelsDatasheet.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainModelsDatasheetLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_TEXT_BLOCK=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalDomainModelsDatasheetLexer() {;} 
    public InternalDomainModelsDatasheetLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDomainModelsDatasheetLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDomainModelsDatasheet.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainModelsDatasheet.g:11:7: ( 'DomainModelsDatasheet' )
            // InternalDomainModelsDatasheet.g:11:9: 'DomainModelsDatasheet'
            {
            match("DomainModelsDatasheet"); 


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
            // InternalDomainModelsDatasheet.g:12:7: ( '{' )
            // InternalDomainModelsDatasheet.g:12:9: '{'
            {
            match('{'); 

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
            // InternalDomainModelsDatasheet.g:13:7: ( '}' )
            // InternalDomainModelsDatasheet.g:13:9: '}'
            {
            match('}'); 

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
            // InternalDomainModelsDatasheet.g:14:7: ( 'baseURI' )
            // InternalDomainModelsDatasheet.g:14:9: 'baseURI'
            {
            match("baseURI"); 


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
            // InternalDomainModelsDatasheet.g:15:7: ( ':' )
            // InternalDomainModelsDatasheet.g:15:9: ':'
            {
            match(':'); 

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
            // InternalDomainModelsDatasheet.g:16:7: ( 'shortDescrition' )
            // InternalDomainModelsDatasheet.g:16:9: 'shortDescrition'
            {
            match("shortDescrition"); 


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
            // InternalDomainModelsDatasheet.g:17:7: ( 'longDescription' )
            // InternalDomainModelsDatasheet.g:17:9: 'longDescription'
            {
            match("longDescription"); 


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
            // InternalDomainModelsDatasheet.g:18:7: ( 'supplierDescription' )
            // InternalDomainModelsDatasheet.g:18:9: 'supplierDescription'
            {
            match("supplierDescription"); 


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
            // InternalDomainModelsDatasheet.g:19:7: ( 'homepage' )
            // InternalDomainModelsDatasheet.g:19:9: 'homepage'
            {
            match("homepage"); 


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
            // InternalDomainModelsDatasheet.g:20:7: ( 'trl' )
            // InternalDomainModelsDatasheet.g:20:9: 'trl'
            {
            match("trl"); 


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
            // InternalDomainModelsDatasheet.g:21:7: ( 'license' )
            // InternalDomainModelsDatasheet.g:21:9: 'license'
            {
            match("license"); 


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
            // InternalDomainModelsDatasheet.g:22:7: ( 'spdx' )
            // InternalDomainModelsDatasheet.g:22:9: 'spdx'
            {
            match("spdx"); 


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
            // InternalDomainModelsDatasheet.g:23:7: ( '(' )
            // InternalDomainModelsDatasheet.g:23:9: '('
            {
            match('('); 

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
            // InternalDomainModelsDatasheet.g:24:7: ( ')' )
            // InternalDomainModelsDatasheet.g:24:9: ')'
            {
            match(')'); 

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
            // InternalDomainModelsDatasheet.g:25:7: ( 'proprietary' )
            // InternalDomainModelsDatasheet.g:25:9: 'proprietary'
            {
            match("proprietary"); 


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
            // InternalDomainModelsDatasheet.g:26:7: ( 'name' )
            // InternalDomainModelsDatasheet.g:26:9: 'name'
            {
            match("name"); 


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
            // InternalDomainModelsDatasheet.g:27:7: ( 'fullText' )
            // InternalDomainModelsDatasheet.g:27:9: 'fullText'
            {
            match("fullText"); 


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
            // InternalDomainModelsDatasheet.g:28:7: ( 'URL' )
            // InternalDomainModelsDatasheet.g:28:9: 'URL'
            {
            match("URL"); 


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
            // InternalDomainModelsDatasheet.g:29:7: ( 'Level1' )
            // InternalDomainModelsDatasheet.g:29:9: 'Level1'
            {
            match("Level1"); 


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
            // InternalDomainModelsDatasheet.g:30:7: ( 'Level2' )
            // InternalDomainModelsDatasheet.g:30:9: 'Level2'
            {
            match("Level2"); 


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
            // InternalDomainModelsDatasheet.g:31:7: ( 'Level3' )
            // InternalDomainModelsDatasheet.g:31:9: 'Level3'
            {
            match("Level3"); 


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
            // InternalDomainModelsDatasheet.g:32:7: ( 'Level4' )
            // InternalDomainModelsDatasheet.g:32:9: 'Level4'
            {
            match("Level4"); 


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
            // InternalDomainModelsDatasheet.g:33:7: ( 'Level5' )
            // InternalDomainModelsDatasheet.g:33:9: 'Level5'
            {
            match("Level5"); 


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
            // InternalDomainModelsDatasheet.g:34:7: ( 'Level6' )
            // InternalDomainModelsDatasheet.g:34:9: 'Level6'
            {
            match("Level6"); 


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
            // InternalDomainModelsDatasheet.g:35:7: ( 'Level7' )
            // InternalDomainModelsDatasheet.g:35:9: 'Level7'
            {
            match("Level7"); 


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
            // InternalDomainModelsDatasheet.g:36:7: ( 'Level8' )
            // InternalDomainModelsDatasheet.g:36:9: 'Level8'
            {
            match("Level8"); 


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
            // InternalDomainModelsDatasheet.g:37:7: ( 'Level9' )
            // InternalDomainModelsDatasheet.g:37:9: 'Level9'
            {
            match("Level9"); 


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
            // InternalDomainModelsDatasheet.g:38:7: ( 'Undefined' )
            // InternalDomainModelsDatasheet.g:38:9: 'Undefined'
            {
            match("Undefined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_TEXT_BLOCK"
    public final void mRULE_TEXT_BLOCK() throws RecognitionException {
        try {
            int _type = RULE_TEXT_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainModelsDatasheet.g:844:17: ( '$%' ( options {greedy=false; } : . )* '%$' )
            // InternalDomainModelsDatasheet.g:844:19: '$%' ( options {greedy=false; } : . )* '%$'
            {
            match("$%"); 

            // InternalDomainModelsDatasheet.g:844:24: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='%') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='$') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='#')||(LA1_1>='%' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='$')||(LA1_0>='&' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainModelsDatasheet.g:844:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("%$"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT_BLOCK"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainModelsDatasheet.g:846:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDomainModelsDatasheet.g:846:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDomainModelsDatasheet.g:846:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:846:11: '^'
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

            // InternalDomainModelsDatasheet.g:846:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomainModelsDatasheet.g:
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
            	    break loop3;
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
            // InternalDomainModelsDatasheet.g:848:10: ( ( '0' .. '9' )+ )
            // InternalDomainModelsDatasheet.g:848:12: ( '0' .. '9' )+
            {
            // InternalDomainModelsDatasheet.g:848:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainModelsDatasheet.g:848:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalDomainModelsDatasheet.g:850:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDomainModelsDatasheet.g:850:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDomainModelsDatasheet.g:850:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:850:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDomainModelsDatasheet.g:850:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDomainModelsDatasheet.g:850:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDomainModelsDatasheet.g:850:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDomainModelsDatasheet.g:850:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDomainModelsDatasheet.g:850:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDomainModelsDatasheet.g:850:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDomainModelsDatasheet.g:850:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalDomainModelsDatasheet.g:852:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDomainModelsDatasheet.g:852:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDomainModelsDatasheet.g:852:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomainModelsDatasheet.g:852:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalDomainModelsDatasheet.g:854:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDomainModelsDatasheet.g:854:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDomainModelsDatasheet.g:854:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDomainModelsDatasheet.g:854:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalDomainModelsDatasheet.g:854:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomainModelsDatasheet.g:854:41: ( '\\r' )? '\\n'
                    {
                    // InternalDomainModelsDatasheet.g:854:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalDomainModelsDatasheet.g:854:41: '\\r'
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
            // InternalDomainModelsDatasheet.g:856:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDomainModelsDatasheet.g:856:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDomainModelsDatasheet.g:856:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDomainModelsDatasheet.g:
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomainModelsDatasheet.g:858:16: ( . )
            // InternalDomainModelsDatasheet.g:858:18: .
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
        // InternalDomainModelsDatasheet.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_TEXT_BLOCK | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=36;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalDomainModelsDatasheet.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalDomainModelsDatasheet.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalDomainModelsDatasheet.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalDomainModelsDatasheet.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalDomainModelsDatasheet.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalDomainModelsDatasheet.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalDomainModelsDatasheet.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalDomainModelsDatasheet.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalDomainModelsDatasheet.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalDomainModelsDatasheet.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalDomainModelsDatasheet.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalDomainModelsDatasheet.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalDomainModelsDatasheet.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalDomainModelsDatasheet.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalDomainModelsDatasheet.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalDomainModelsDatasheet.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalDomainModelsDatasheet.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalDomainModelsDatasheet.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalDomainModelsDatasheet.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalDomainModelsDatasheet.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalDomainModelsDatasheet.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalDomainModelsDatasheet.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalDomainModelsDatasheet.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalDomainModelsDatasheet.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalDomainModelsDatasheet.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalDomainModelsDatasheet.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalDomainModelsDatasheet.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalDomainModelsDatasheet.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalDomainModelsDatasheet.g:1:178: RULE_TEXT_BLOCK
                {
                mRULE_TEXT_BLOCK(); 

                }
                break;
            case 30 :
                // InternalDomainModelsDatasheet.g:1:194: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalDomainModelsDatasheet.g:1:202: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // InternalDomainModelsDatasheet.g:1:211: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalDomainModelsDatasheet.g:1:223: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalDomainModelsDatasheet.g:1:239: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalDomainModelsDatasheet.g:1:255: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalDomainModelsDatasheet.g:1:263: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\33\2\uffff\1\33\1\uffff\4\33\2\uffff\5\33\2\31\2\uffff\3\31\2\uffff\1\33\3\uffff\1\33\1\uffff\7\33\2\uffff\6\33\6\uffff\10\33\1\114\3\33\1\120\6\33\1\127\3\33\1\uffff\1\33\1\134\1\33\1\uffff\6\33\1\uffff\4\33\1\uffff\15\33\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\33\1\u0087\3\33\1\u008b\4\33\11\uffff\1\33\1\uffff\3\33\1\uffff\1\u0094\1\33\1\u0096\5\33\1\uffff\1\33\1\uffff\1\u009d\5\33\1\uffff\4\33\1\u00a7\4\33\1\uffff\11\33\1\u00b5\1\33\1\u00b7\1\33\1\uffff\1\33\1\uffff\5\33\1\u00bf\1\33\1\uffff\1\u00c1\1\uffff";
    static final String DFA13_eofS =
        "\u00c2\uffff";
    static final String DFA13_minS =
        "\1\0\1\157\2\uffff\1\141\1\uffff\1\150\1\151\1\157\1\162\2\uffff\1\162\1\141\1\165\1\122\1\145\1\45\1\101\2\uffff\2\0\1\52\2\uffff\1\155\3\uffff\1\163\1\uffff\1\157\1\160\1\144\1\156\1\143\1\155\1\154\2\uffff\1\157\1\155\1\154\1\114\1\144\1\166\6\uffff\1\141\1\145\1\162\1\160\1\170\1\147\2\145\1\60\1\160\1\145\1\154\1\60\2\145\1\151\1\125\1\164\1\154\1\60\1\104\1\156\1\160\1\uffff\1\162\1\60\1\124\1\uffff\1\146\1\154\1\156\1\122\1\104\1\151\1\uffff\1\145\1\163\1\141\1\151\1\uffff\1\145\1\151\1\61\1\115\1\111\2\145\1\163\1\145\1\147\1\145\1\170\1\156\11\60\1\157\1\60\1\163\1\162\1\143\1\60\1\145\2\164\1\145\11\uffff\1\144\1\uffff\1\143\1\104\1\162\1\uffff\1\60\1\141\1\60\1\144\1\145\1\162\1\145\1\151\1\uffff\1\162\1\uffff\1\60\1\154\1\151\1\163\1\160\1\171\1\uffff\1\163\1\164\1\143\1\164\1\60\1\104\1\151\1\162\1\151\1\uffff\1\141\1\157\1\151\1\157\1\164\1\156\1\160\1\156\1\141\1\60\1\164\1\60\1\163\1\uffff\1\151\1\uffff\1\150\1\157\1\145\1\156\1\145\1\60\1\164\1\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\157\2\uffff\1\141\1\uffff\1\165\2\157\1\162\2\uffff\1\162\1\141\1\165\1\156\1\145\1\45\1\172\2\uffff\2\uffff\1\57\2\uffff\1\155\3\uffff\1\163\1\uffff\1\157\1\160\1\144\1\156\1\143\1\155\1\154\2\uffff\1\157\1\155\1\154\1\114\1\144\1\166\6\uffff\1\141\1\145\1\162\1\160\1\170\1\147\2\145\1\172\1\160\1\145\1\154\1\172\2\145\1\151\1\125\1\164\1\154\1\172\1\104\1\156\1\160\1\uffff\1\162\1\172\1\124\1\uffff\1\146\1\154\1\156\1\122\1\104\1\151\1\uffff\1\145\1\163\1\141\1\151\1\uffff\1\145\1\151\1\71\1\115\1\111\2\145\1\163\1\145\1\147\1\145\1\170\1\156\11\172\1\157\1\172\1\163\1\162\1\143\1\172\1\145\2\164\1\145\11\uffff\1\144\1\uffff\1\143\1\104\1\162\1\uffff\1\172\1\141\1\172\1\144\1\145\1\162\1\145\1\151\1\uffff\1\162\1\uffff\1\172\1\154\1\151\1\163\1\160\1\171\1\uffff\1\163\1\164\1\143\1\164\1\172\1\104\1\151\1\162\1\151\1\uffff\1\141\1\157\1\151\1\157\1\164\1\156\1\160\1\156\1\141\1\172\1\164\1\172\1\163\1\uffff\1\151\1\uffff\1\150\1\157\1\145\1\156\1\145\1\172\1\164\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\4\uffff\1\15\1\16\7\uffff\1\36\1\37\3\uffff\1\43\1\44\1\uffff\1\36\1\2\1\3\1\uffff\1\5\7\uffff\1\15\1\16\6\uffff\1\35\1\37\1\40\1\41\1\42\1\43\27\uffff\1\12\3\uffff\1\22\6\uffff\1\14\4\uffff\1\20\40\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\4\3\uffff\1\13\10\uffff\1\11\1\uffff\1\21\6\uffff\1\34\11\uffff\1\17\15\uffff\1\6\1\uffff\1\7\7\uffff\1\10\1\uffff\1\1";
    static final String DFA13_specialS =
        "\1\1\24\uffff\1\2\1\0\u00ab\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\1\31\1\21\2\31\1\26\1\12\1\13\5\31\1\27\12\24\1\5\6\31\3\23\1\1\7\23\1\20\10\23\1\17\5\23\3\31\1\22\1\23\1\31\1\23\1\4\3\23\1\16\1\23\1\10\3\23\1\7\1\23\1\15\1\23\1\14\2\23\1\6\1\11\6\23\1\2\1\31\1\3\uff82\31",
            "\1\32",
            "",
            "",
            "\1\36",
            "",
            "\1\40\7\uffff\1\42\4\uffff\1\41",
            "\1\44\5\uffff\1\43",
            "\1\45",
            "\1\46",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54\33\uffff\1\55",
            "\1\56",
            "\1\57",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\0\61",
            "\0\61",
            "\1\62\4\uffff\1\63",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "\1\66",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\115",
            "\1\116",
            "\1\117",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\1\133",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\152\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0086",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0095",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00b6",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00c0",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_TEXT_BLOCK | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_22 = input.LA(1);

                        s = -1;
                        if ( ((LA13_22>='\u0000' && LA13_22<='\uFFFF')) ) {s = 49;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='D') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='}') ) {s = 3;}

                        else if ( (LA13_0=='b') ) {s = 4;}

                        else if ( (LA13_0==':') ) {s = 5;}

                        else if ( (LA13_0=='s') ) {s = 6;}

                        else if ( (LA13_0=='l') ) {s = 7;}

                        else if ( (LA13_0=='h') ) {s = 8;}

                        else if ( (LA13_0=='t') ) {s = 9;}

                        else if ( (LA13_0=='(') ) {s = 10;}

                        else if ( (LA13_0==')') ) {s = 11;}

                        else if ( (LA13_0=='p') ) {s = 12;}

                        else if ( (LA13_0=='n') ) {s = 13;}

                        else if ( (LA13_0=='f') ) {s = 14;}

                        else if ( (LA13_0=='U') ) {s = 15;}

                        else if ( (LA13_0=='L') ) {s = 16;}

                        else if ( (LA13_0=='$') ) {s = 17;}

                        else if ( (LA13_0=='^') ) {s = 18;}

                        else if ( ((LA13_0>='A' && LA13_0<='C')||(LA13_0>='E' && LA13_0<='K')||(LA13_0>='M' && LA13_0<='T')||(LA13_0>='V' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||(LA13_0>='c' && LA13_0<='e')||LA13_0=='g'||(LA13_0>='i' && LA13_0<='k')||LA13_0=='m'||LA13_0=='o'||(LA13_0>='q' && LA13_0<='r')||(LA13_0>='u' && LA13_0<='z')) ) {s = 19;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 20;}

                        else if ( (LA13_0=='\"') ) {s = 21;}

                        else if ( (LA13_0=='\'') ) {s = 22;}

                        else if ( (LA13_0=='/') ) {s = 23;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 24;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||LA13_0=='#'||(LA13_0>='%' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='.')||(LA13_0>=';' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_21 = input.LA(1);

                        s = -1;
                        if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFF')) ) {s = 49;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}