package fr.n7.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL3Lexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators

    public InternalPDL3Lexer() {;} 
    public InternalPDL3Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPDL3Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPDL3.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPDL3.g:11:7: ( 'process' )
            // InternalPDL3.g:11:9: 'process'
            {
            match("process"); 


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
            // InternalPDL3.g:12:7: ( ':' )
            // InternalPDL3.g:12:9: ':'
            {
            match(':'); 

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
            // InternalPDL3.g:13:7: ( 'workdefinitions' )
            // InternalPDL3.g:13:9: 'workdefinitions'
            {
            match("workdefinitions"); 


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
            // InternalPDL3.g:14:7: ( ';' )
            // InternalPDL3.g:14:9: ';'
            {
            match(';'); 

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
            // InternalPDL3.g:15:7: ( 'worksequences' )
            // InternalPDL3.g:15:9: 'worksequences'
            {
            match("worksequences"); 


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
            // InternalPDL3.g:16:7: ( 's2s' )
            // InternalPDL3.g:16:9: 's2s'
            {
            match("s2s"); 


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
            // InternalPDL3.g:17:7: ( 'f2s' )
            // InternalPDL3.g:17:9: 'f2s'
            {
            match("f2s"); 


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
            // InternalPDL3.g:18:7: ( 's2f' )
            // InternalPDL3.g:18:9: 's2f'
            {
            match("s2f"); 


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
            // InternalPDL3.g:19:7: ( 'f2f' )
            // InternalPDL3.g:19:9: 'f2f'
            {
            match("f2f"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPDL3.g:328:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPDL3.g:328:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPDL3.g:328:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPDL3.g:328:11: '^'
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

            // InternalPDL3.g:328:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPDL3.g:
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
            // InternalPDL3.g:330:10: ( ( '0' .. '9' )+ )
            // InternalPDL3.g:330:12: ( '0' .. '9' )+
            {
            // InternalPDL3.g:330:12: ( '0' .. '9' )+
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
            	    // InternalPDL3.g:330:13: '0' .. '9'
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
            // InternalPDL3.g:332:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPDL3.g:332:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPDL3.g:332:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalPDL3.g:332:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPDL3.g:332:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalPDL3.g:332:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPDL3.g:332:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalPDL3.g:332:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPDL3.g:332:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalPDL3.g:332:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPDL3.g:332:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalPDL3.g:334:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPDL3.g:334:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPDL3.g:334:24: ( options {greedy=false; } : . )*
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
            	    // InternalPDL3.g:334:52: .
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
            // InternalPDL3.g:336:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPDL3.g:336:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPDL3.g:336:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPDL3.g:336:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalPDL3.g:336:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPDL3.g:336:41: ( '\\r' )? '\\n'
                    {
                    // InternalPDL3.g:336:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPDL3.g:336:41: '\\r'
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
            // InternalPDL3.g:338:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPDL3.g:338:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPDL3.g:338:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalPDL3.g:
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
            // InternalPDL3.g:340:16: ( . )
            // InternalPDL3.g:340:18: .
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
        // InternalPDL3.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=16;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalPDL3.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalPDL3.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalPDL3.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalPDL3.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalPDL3.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalPDL3.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalPDL3.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalPDL3.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalPDL3.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalPDL3.g:1:64: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // InternalPDL3.g:1:72: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // InternalPDL3.g:1:81: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // InternalPDL3.g:1:93: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // InternalPDL3.g:1:109: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // InternalPDL3.g:1:125: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // InternalPDL3.g:1:133: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\20\1\uffff\1\20\1\uffff\2\20\1\16\2\uffff\3\16\2\uffff\1\20\2\uffff\1\20\1\uffff\2\20\5\uffff\2\20\1\43\1\44\1\45\1\46\2\20\4\uffff\6\20\1\60\2\20\1\uffff\13\20\1\76\1\20\1\uffff\1\100\1\uffff";
    static final String DFA12_eofS =
        "\101\uffff";
    static final String DFA12_minS =
        "\1\0\1\162\1\uffff\1\157\1\uffff\2\62\1\101\2\uffff\2\0\1\52\2\uffff\1\157\2\uffff\1\162\1\uffff\2\146\5\uffff\1\143\1\153\4\60\1\145\1\144\4\uffff\1\163\2\145\1\163\1\146\1\161\1\60\1\151\1\165\1\uffff\1\156\1\145\1\151\1\156\1\164\1\143\1\151\1\145\1\157\1\163\1\156\1\60\1\163\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\1\uffff\1\157\1\uffff\2\62\1\172\2\uffff\2\uffff\1\57\2\uffff\1\157\2\uffff\1\162\1\uffff\2\163\5\uffff\1\143\1\153\4\172\1\145\1\163\4\uffff\1\163\2\145\1\163\1\146\1\161\1\172\1\151\1\165\1\uffff\1\156\1\145\1\151\1\156\1\164\1\143\1\151\1\145\1\157\1\163\1\156\1\172\1\163\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\3\uffff\1\12\1\13\3\uffff\1\17\1\20\1\uffff\1\12\1\2\1\uffff\1\4\2\uffff\1\13\1\14\1\15\1\16\1\17\10\uffff\1\6\1\10\1\7\1\11\11\uffff\1\1\15\uffff\1\5\1\uffff\1\3";
    static final String DFA12_specialS =
        "\1\0\11\uffff\1\1\1\2\65\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\16\2\15\2\16\1\15\22\16\1\15\1\16\1\12\4\16\1\13\7\16\1\14\12\11\1\2\1\4\5\16\32\10\3\16\1\7\1\10\1\16\5\10\1\6\11\10\1\1\2\10\1\5\3\10\1\3\3\10\uff85\16",
            "\1\17",
            "",
            "\1\22",
            "",
            "\1\24",
            "\1\25",
            "\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "",
            "\0\27",
            "\0\27",
            "\1\30\4\uffff\1\31",
            "",
            "",
            "\1\33",
            "",
            "",
            "\1\34",
            "",
            "\1\36\14\uffff\1\35",
            "\1\40\14\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\42",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\47",
            "\1\50\16\uffff\1\51",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\61",
            "\1\62",
            "",
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
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\77",
            "",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='p') ) {s = 1;}

                        else if ( (LA12_0==':') ) {s = 2;}

                        else if ( (LA12_0=='w') ) {s = 3;}

                        else if ( (LA12_0==';') ) {s = 4;}

                        else if ( (LA12_0=='s') ) {s = 5;}

                        else if ( (LA12_0=='f') ) {s = 6;}

                        else if ( (LA12_0=='^') ) {s = 7;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 8;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 9;}

                        else if ( (LA12_0=='\"') ) {s = 10;}

                        else if ( (LA12_0=='\'') ) {s = 11;}

                        else if ( (LA12_0=='/') ) {s = 12;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 13;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_10 = input.LA(1);

                        s = -1;
                        if ( ((LA12_10>='\u0000' && LA12_10<='\uFFFF')) ) {s = 23;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 23;}

                        else s = 14;

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