package fr.n7.ide.contentassist.antlr.internal;

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
import fr.n7.services.PDL3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL3Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "':'", "'workdefinitions'", "';'", "'worksequences'"
    };
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


        public InternalPDL3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDL3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDL3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL3.g"; }


    	private PDL3GrammarAccess grammarAccess;

    	public void setGrammarAccess(PDL3GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProcess"
    // InternalPDL3.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL3.g:54:1: ( ruleProcess EOF )
            // InternalPDL3.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL3.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL3.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL3.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL3.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL3.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL3.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL3.g:78:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL3.g:79:1: ( ruleWorkSequence EOF )
            // InternalPDL3.g:80:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL3.g:87:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:91:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL3.g:92:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL3.g:92:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL3.g:93:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL3.g:94:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL3.g:94:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL3.g:103:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:107:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL3.g:108:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL3.g:108:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL3.g:109:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL3.g:110:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL3.g:110:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL3.g:118:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:122:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPDL3.g:123:2: ( ( 's2s' ) )
                    {
                    // InternalPDL3.g:123:2: ( ( 's2s' ) )
                    // InternalPDL3.g:124:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getS2sEnumLiteralDeclaration_0()); 
                    // InternalPDL3.g:125:3: ( 's2s' )
                    // InternalPDL3.g:125:4: 's2s'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getS2sEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL3.g:129:2: ( ( 'f2s' ) )
                    {
                    // InternalPDL3.g:129:2: ( ( 'f2s' ) )
                    // InternalPDL3.g:130:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getF2sEnumLiteralDeclaration_1()); 
                    // InternalPDL3.g:131:3: ( 'f2s' )
                    // InternalPDL3.g:131:4: 'f2s'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getF2sEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL3.g:135:2: ( ( 's2f' ) )
                    {
                    // InternalPDL3.g:135:2: ( ( 's2f' ) )
                    // InternalPDL3.g:136:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getS2fEnumLiteralDeclaration_2()); 
                    // InternalPDL3.g:137:3: ( 's2f' )
                    // InternalPDL3.g:137:4: 's2f'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getS2fEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL3.g:141:2: ( ( 'f2f' ) )
                    {
                    // InternalPDL3.g:141:2: ( ( 'f2f' ) )
                    // InternalPDL3.g:142:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getF2fEnumLiteralDeclaration_3()); 
                    // InternalPDL3.g:143:3: ( 'f2f' )
                    // InternalPDL3.g:143:4: 'f2f'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getF2fEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDL3.g:151:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:155:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL3.g:156:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

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
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDL3.g:163:1: rule__Process__Group__0__Impl : ( 'process' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:167:1: ( ( 'process' ) )
            // InternalPDL3.g:168:1: ( 'process' )
            {
            // InternalPDL3.g:168:1: ( 'process' )
            // InternalPDL3.g:169:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_0()); 

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
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDL3.g:178:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:182:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL3.g:183:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

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
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDL3.g:190:1: rule__Process__Group__1__Impl : ( ':' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:194:1: ( ( ':' ) )
            // InternalPDL3.g:195:1: ( ':' )
            {
            // InternalPDL3.g:195:1: ( ':' )
            // InternalPDL3.g:196:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDL3.g:205:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:209:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL3.g:210:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

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
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDL3.g:217:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:221:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // InternalPDL3.g:222:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // InternalPDL3.g:222:1: ( ( rule__Process__NameAssignment_2 ) )
            // InternalPDL3.g:223:2: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // InternalPDL3.g:224:2: ( rule__Process__NameAssignment_2 )
            // InternalPDL3.g:224:3: rule__Process__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDL3.g:232:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:236:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL3.g:237:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

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
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDL3.g:244:1: rule__Process__Group__3__Impl : ( 'workdefinitions' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:248:1: ( ( 'workdefinitions' ) )
            // InternalPDL3.g:249:1: ( 'workdefinitions' )
            {
            // InternalPDL3.g:249:1: ( 'workdefinitions' )
            // InternalPDL3.g:250:2: 'workdefinitions'
            {
             before(grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3()); 

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
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDL3.g:259:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:263:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalPDL3.g:264:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

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
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDL3.g:271:1: rule__Process__Group__4__Impl : ( ':' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:275:1: ( ( ':' ) )
            // InternalPDL3.g:276:1: ( ':' )
            {
            // InternalPDL3.g:276:1: ( ':' )
            // InternalPDL3.g:277:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalPDL3.g:286:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:290:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalPDL3.g:291:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__6();

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
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalPDL3.g:298:1: rule__Process__Group__5__Impl : ( ( rule__Process__WorkDefinitionsAssignment_5 ) ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:302:1: ( ( ( rule__Process__WorkDefinitionsAssignment_5 ) ) )
            // InternalPDL3.g:303:1: ( ( rule__Process__WorkDefinitionsAssignment_5 ) )
            {
            // InternalPDL3.g:303:1: ( ( rule__Process__WorkDefinitionsAssignment_5 ) )
            // InternalPDL3.g:304:2: ( rule__Process__WorkDefinitionsAssignment_5 )
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_5()); 
            // InternalPDL3.g:305:2: ( rule__Process__WorkDefinitionsAssignment_5 )
            // InternalPDL3.g:305:3: rule__Process__WorkDefinitionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkDefinitionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_5()); 

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
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // InternalPDL3.g:313:1: rule__Process__Group__6 : rule__Process__Group__6__Impl rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:317:1: ( rule__Process__Group__6__Impl rule__Process__Group__7 )
            // InternalPDL3.g:318:2: rule__Process__Group__6__Impl rule__Process__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__7();

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
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // InternalPDL3.g:325:1: rule__Process__Group__6__Impl : ( ( rule__Process__Group_6__0 )* ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:329:1: ( ( ( rule__Process__Group_6__0 )* ) )
            // InternalPDL3.g:330:1: ( ( rule__Process__Group_6__0 )* )
            {
            // InternalPDL3.g:330:1: ( ( rule__Process__Group_6__0 )* )
            // InternalPDL3.g:331:2: ( rule__Process__Group_6__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_6()); 
            // InternalPDL3.g:332:2: ( rule__Process__Group_6__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_ID) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalPDL3.g:332:3: rule__Process__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Process__Group__7"
    // InternalPDL3.g:340:1: rule__Process__Group__7 : rule__Process__Group__7__Impl rule__Process__Group__8 ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:344:1: ( rule__Process__Group__7__Impl rule__Process__Group__8 )
            // InternalPDL3.g:345:2: rule__Process__Group__7__Impl rule__Process__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Process__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__8();

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
    // $ANTLR end "rule__Process__Group__7"


    // $ANTLR start "rule__Process__Group__7__Impl"
    // InternalPDL3.g:352:1: rule__Process__Group__7__Impl : ( ';' ) ;
    public final void rule__Process__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:356:1: ( ( ';' ) )
            // InternalPDL3.g:357:1: ( ';' )
            {
            // InternalPDL3.g:357:1: ( ';' )
            // InternalPDL3.g:358:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__Process__Group__7__Impl"


    // $ANTLR start "rule__Process__Group__8"
    // InternalPDL3.g:367:1: rule__Process__Group__8 : rule__Process__Group__8__Impl rule__Process__Group__9 ;
    public final void rule__Process__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:371:1: ( rule__Process__Group__8__Impl rule__Process__Group__9 )
            // InternalPDL3.g:372:2: rule__Process__Group__8__Impl rule__Process__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__9();

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
    // $ANTLR end "rule__Process__Group__8"


    // $ANTLR start "rule__Process__Group__8__Impl"
    // InternalPDL3.g:379:1: rule__Process__Group__8__Impl : ( 'worksequences' ) ;
    public final void rule__Process__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:383:1: ( ( 'worksequences' ) )
            // InternalPDL3.g:384:1: ( 'worksequences' )
            {
            // InternalPDL3.g:384:1: ( 'worksequences' )
            // InternalPDL3.g:385:2: 'worksequences'
            {
             before(grammarAccess.getProcessAccess().getWorksequencesKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorksequencesKeyword_8()); 

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
    // $ANTLR end "rule__Process__Group__8__Impl"


    // $ANTLR start "rule__Process__Group__9"
    // InternalPDL3.g:394:1: rule__Process__Group__9 : rule__Process__Group__9__Impl rule__Process__Group__10 ;
    public final void rule__Process__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:398:1: ( rule__Process__Group__9__Impl rule__Process__Group__10 )
            // InternalPDL3.g:399:2: rule__Process__Group__9__Impl rule__Process__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__10();

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
    // $ANTLR end "rule__Process__Group__9"


    // $ANTLR start "rule__Process__Group__9__Impl"
    // InternalPDL3.g:406:1: rule__Process__Group__9__Impl : ( ':' ) ;
    public final void rule__Process__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:410:1: ( ( ':' ) )
            // InternalPDL3.g:411:1: ( ':' )
            {
            // InternalPDL3.g:411:1: ( ':' )
            // InternalPDL3.g:412:2: ':'
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_9()); 

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
    // $ANTLR end "rule__Process__Group__9__Impl"


    // $ANTLR start "rule__Process__Group__10"
    // InternalPDL3.g:421:1: rule__Process__Group__10 : rule__Process__Group__10__Impl rule__Process__Group__11 ;
    public final void rule__Process__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:425:1: ( rule__Process__Group__10__Impl rule__Process__Group__11 )
            // InternalPDL3.g:426:2: rule__Process__Group__10__Impl rule__Process__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__11();

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
    // $ANTLR end "rule__Process__Group__10"


    // $ANTLR start "rule__Process__Group__10__Impl"
    // InternalPDL3.g:433:1: rule__Process__Group__10__Impl : ( ( rule__Process__WorkSequencesAssignment_10 ) ) ;
    public final void rule__Process__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:437:1: ( ( ( rule__Process__WorkSequencesAssignment_10 ) ) )
            // InternalPDL3.g:438:1: ( ( rule__Process__WorkSequencesAssignment_10 ) )
            {
            // InternalPDL3.g:438:1: ( ( rule__Process__WorkSequencesAssignment_10 ) )
            // InternalPDL3.g:439:2: ( rule__Process__WorkSequencesAssignment_10 )
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesAssignment_10()); 
            // InternalPDL3.g:440:2: ( rule__Process__WorkSequencesAssignment_10 )
            // InternalPDL3.g:440:3: rule__Process__WorkSequencesAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkSequencesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkSequencesAssignment_10()); 

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
    // $ANTLR end "rule__Process__Group__10__Impl"


    // $ANTLR start "rule__Process__Group__11"
    // InternalPDL3.g:448:1: rule__Process__Group__11 : rule__Process__Group__11__Impl rule__Process__Group__12 ;
    public final void rule__Process__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:452:1: ( rule__Process__Group__11__Impl rule__Process__Group__12 )
            // InternalPDL3.g:453:2: rule__Process__Group__11__Impl rule__Process__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__12();

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
    // $ANTLR end "rule__Process__Group__11"


    // $ANTLR start "rule__Process__Group__11__Impl"
    // InternalPDL3.g:460:1: rule__Process__Group__11__Impl : ( ( rule__Process__Group_11__0 )* ) ;
    public final void rule__Process__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:464:1: ( ( ( rule__Process__Group_11__0 )* ) )
            // InternalPDL3.g:465:1: ( ( rule__Process__Group_11__0 )* )
            {
            // InternalPDL3.g:465:1: ( ( rule__Process__Group_11__0 )* )
            // InternalPDL3.g:466:2: ( rule__Process__Group_11__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_11()); 
            // InternalPDL3.g:467:2: ( rule__Process__Group_11__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==RULE_ID) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalPDL3.g:467:3: rule__Process__Group_11__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Process__Group__11__Impl"


    // $ANTLR start "rule__Process__Group__12"
    // InternalPDL3.g:475:1: rule__Process__Group__12 : rule__Process__Group__12__Impl ;
    public final void rule__Process__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:479:1: ( rule__Process__Group__12__Impl )
            // InternalPDL3.g:480:2: rule__Process__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__12__Impl();

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
    // $ANTLR end "rule__Process__Group__12"


    // $ANTLR start "rule__Process__Group__12__Impl"
    // InternalPDL3.g:486:1: rule__Process__Group__12__Impl : ( ( ';' )? ) ;
    public final void rule__Process__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:490:1: ( ( ( ';' )? ) )
            // InternalPDL3.g:491:1: ( ( ';' )? )
            {
            // InternalPDL3.g:491:1: ( ( ';' )? )
            // InternalPDL3.g:492:2: ( ';' )?
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_12()); 
            // InternalPDL3.g:493:2: ( ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPDL3.g:493:3: ';'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getSemicolonKeyword_12()); 

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
    // $ANTLR end "rule__Process__Group__12__Impl"


    // $ANTLR start "rule__Process__Group_6__0"
    // InternalPDL3.g:502:1: rule__Process__Group_6__0 : rule__Process__Group_6__0__Impl rule__Process__Group_6__1 ;
    public final void rule__Process__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:506:1: ( rule__Process__Group_6__0__Impl rule__Process__Group_6__1 )
            // InternalPDL3.g:507:2: rule__Process__Group_6__0__Impl rule__Process__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_6__1();

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
    // $ANTLR end "rule__Process__Group_6__0"


    // $ANTLR start "rule__Process__Group_6__0__Impl"
    // InternalPDL3.g:514:1: rule__Process__Group_6__0__Impl : ( ';' ) ;
    public final void rule__Process__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:518:1: ( ( ';' ) )
            // InternalPDL3.g:519:1: ( ';' )
            {
            // InternalPDL3.g:519:1: ( ';' )
            // InternalPDL3.g:520:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_6_0()); 

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
    // $ANTLR end "rule__Process__Group_6__0__Impl"


    // $ANTLR start "rule__Process__Group_6__1"
    // InternalPDL3.g:529:1: rule__Process__Group_6__1 : rule__Process__Group_6__1__Impl ;
    public final void rule__Process__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:533:1: ( rule__Process__Group_6__1__Impl )
            // InternalPDL3.g:534:2: rule__Process__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_6__1__Impl();

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
    // $ANTLR end "rule__Process__Group_6__1"


    // $ANTLR start "rule__Process__Group_6__1__Impl"
    // InternalPDL3.g:540:1: rule__Process__Group_6__1__Impl : ( ( rule__Process__WorkDefinitionsAssignment_6_1 ) ) ;
    public final void rule__Process__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:544:1: ( ( ( rule__Process__WorkDefinitionsAssignment_6_1 ) ) )
            // InternalPDL3.g:545:1: ( ( rule__Process__WorkDefinitionsAssignment_6_1 ) )
            {
            // InternalPDL3.g:545:1: ( ( rule__Process__WorkDefinitionsAssignment_6_1 ) )
            // InternalPDL3.g:546:2: ( rule__Process__WorkDefinitionsAssignment_6_1 )
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_6_1()); 
            // InternalPDL3.g:547:2: ( rule__Process__WorkDefinitionsAssignment_6_1 )
            // InternalPDL3.g:547:3: rule__Process__WorkDefinitionsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkDefinitionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkDefinitionsAssignment_6_1()); 

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
    // $ANTLR end "rule__Process__Group_6__1__Impl"


    // $ANTLR start "rule__Process__Group_11__0"
    // InternalPDL3.g:556:1: rule__Process__Group_11__0 : rule__Process__Group_11__0__Impl rule__Process__Group_11__1 ;
    public final void rule__Process__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:560:1: ( rule__Process__Group_11__0__Impl rule__Process__Group_11__1 )
            // InternalPDL3.g:561:2: rule__Process__Group_11__0__Impl rule__Process__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_11__1();

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
    // $ANTLR end "rule__Process__Group_11__0"


    // $ANTLR start "rule__Process__Group_11__0__Impl"
    // InternalPDL3.g:568:1: rule__Process__Group_11__0__Impl : ( ';' ) ;
    public final void rule__Process__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:572:1: ( ( ';' ) )
            // InternalPDL3.g:573:1: ( ';' )
            {
            // InternalPDL3.g:573:1: ( ';' )
            // InternalPDL3.g:574:2: ';'
            {
             before(grammarAccess.getProcessAccess().getSemicolonKeyword_11_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getSemicolonKeyword_11_0()); 

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
    // $ANTLR end "rule__Process__Group_11__0__Impl"


    // $ANTLR start "rule__Process__Group_11__1"
    // InternalPDL3.g:583:1: rule__Process__Group_11__1 : rule__Process__Group_11__1__Impl ;
    public final void rule__Process__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:587:1: ( rule__Process__Group_11__1__Impl )
            // InternalPDL3.g:588:2: rule__Process__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_11__1__Impl();

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
    // $ANTLR end "rule__Process__Group_11__1"


    // $ANTLR start "rule__Process__Group_11__1__Impl"
    // InternalPDL3.g:594:1: rule__Process__Group_11__1__Impl : ( ( rule__Process__WorkSequencesAssignment_11_1 ) ) ;
    public final void rule__Process__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:598:1: ( ( ( rule__Process__WorkSequencesAssignment_11_1 ) ) )
            // InternalPDL3.g:599:1: ( ( rule__Process__WorkSequencesAssignment_11_1 ) )
            {
            // InternalPDL3.g:599:1: ( ( rule__Process__WorkSequencesAssignment_11_1 ) )
            // InternalPDL3.g:600:2: ( rule__Process__WorkSequencesAssignment_11_1 )
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesAssignment_11_1()); 
            // InternalPDL3.g:601:2: ( rule__Process__WorkSequencesAssignment_11_1 )
            // InternalPDL3.g:601:3: rule__Process__WorkSequencesAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__WorkSequencesAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getWorkSequencesAssignment_11_1()); 

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
    // $ANTLR end "rule__Process__Group_11__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL3.g:610:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:614:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL3.g:615:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

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
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDL3.g:622:1: rule__WorkSequence__Group__0__Impl : ( ( rule__WorkSequence__PredecessorAssignment_0 ) ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:626:1: ( ( ( rule__WorkSequence__PredecessorAssignment_0 ) ) )
            // InternalPDL3.g:627:1: ( ( rule__WorkSequence__PredecessorAssignment_0 ) )
            {
            // InternalPDL3.g:627:1: ( ( rule__WorkSequence__PredecessorAssignment_0 ) )
            // InternalPDL3.g:628:2: ( rule__WorkSequence__PredecessorAssignment_0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_0()); 
            // InternalPDL3.g:629:2: ( rule__WorkSequence__PredecessorAssignment_0 )
            // InternalPDL3.g:629:3: rule__WorkSequence__PredecessorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_0()); 

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
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDL3.g:637:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:641:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL3.g:642:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

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
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDL3.g:649:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:653:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDL3.g:654:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDL3.g:654:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDL3.g:655:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDL3.g:656:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDL3.g:656:3: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

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
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDL3.g:664:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:668:1: ( rule__WorkSequence__Group__2__Impl )
            // InternalPDL3.g:669:2: rule__WorkSequence__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2__Impl();

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
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDL3.g:675:1: rule__WorkSequence__Group__2__Impl : ( ( rule__WorkSequence__SuccessorAssignment_2 ) ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:679:1: ( ( ( rule__WorkSequence__SuccessorAssignment_2 ) ) )
            // InternalPDL3.g:680:1: ( ( rule__WorkSequence__SuccessorAssignment_2 ) )
            {
            // InternalPDL3.g:680:1: ( ( rule__WorkSequence__SuccessorAssignment_2 ) )
            // InternalPDL3.g:681:2: ( rule__WorkSequence__SuccessorAssignment_2 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_2()); 
            // InternalPDL3.g:682:2: ( rule__WorkSequence__SuccessorAssignment_2 )
            // InternalPDL3.g:682:3: rule__WorkSequence__SuccessorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_2()); 

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
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__Process__NameAssignment_2"
    // InternalPDL3.g:691:1: rule__Process__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:695:1: ( ( RULE_ID ) )
            // InternalPDL3.g:696:2: ( RULE_ID )
            {
            // InternalPDL3.g:696:2: ( RULE_ID )
            // InternalPDL3.g:697:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Process__NameAssignment_2"


    // $ANTLR start "rule__Process__WorkDefinitionsAssignment_5"
    // InternalPDL3.g:706:1: rule__Process__WorkDefinitionsAssignment_5 : ( RULE_ID ) ;
    public final void rule__Process__WorkDefinitionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:710:1: ( ( RULE_ID ) )
            // InternalPDL3.g:711:2: ( RULE_ID )
            {
            // InternalPDL3.g:711:2: ( RULE_ID )
            // InternalPDL3.g:712:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorkDefinitionsIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Process__WorkDefinitionsAssignment_5"


    // $ANTLR start "rule__Process__WorkDefinitionsAssignment_6_1"
    // InternalPDL3.g:721:1: rule__Process__WorkDefinitionsAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Process__WorkDefinitionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:725:1: ( ( RULE_ID ) )
            // InternalPDL3.g:726:2: ( RULE_ID )
            {
            // InternalPDL3.g:726:2: ( RULE_ID )
            // InternalPDL3.g:727:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getWorkDefinitionsIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getWorkDefinitionsIDTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Process__WorkDefinitionsAssignment_6_1"


    // $ANTLR start "rule__Process__WorkSequencesAssignment_10"
    // InternalPDL3.g:736:1: rule__Process__WorkSequencesAssignment_10 : ( ruleWorkSequence ) ;
    public final void rule__Process__WorkSequencesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:740:1: ( ( ruleWorkSequence ) )
            // InternalPDL3.g:741:2: ( ruleWorkSequence )
            {
            // InternalPDL3.g:741:2: ( ruleWorkSequence )
            // InternalPDL3.g:742:3: ruleWorkSequence
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Process__WorkSequencesAssignment_10"


    // $ANTLR start "rule__Process__WorkSequencesAssignment_11_1"
    // InternalPDL3.g:751:1: rule__Process__WorkSequencesAssignment_11_1 : ( ruleWorkSequence ) ;
    public final void rule__Process__WorkSequencesAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:755:1: ( ( ruleWorkSequence ) )
            // InternalPDL3.g:756:2: ( ruleWorkSequence )
            {
            // InternalPDL3.g:756:2: ( ruleWorkSequence )
            // InternalPDL3.g:757:3: ruleWorkSequence
            {
             before(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Process__WorkSequencesAssignment_11_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_0"
    // InternalPDL3.g:766:1: rule__WorkSequence__PredecessorAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:770:1: ( ( ( RULE_ID ) ) )
            // InternalPDL3.g:771:2: ( ( RULE_ID ) )
            {
            // InternalPDL3.g:771:2: ( ( RULE_ID ) )
            // InternalPDL3.g:772:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_0_0()); 
            // InternalPDL3.g:773:3: ( RULE_ID )
            // InternalPDL3.g:774:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_0_0()); 

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
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_0"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDL3.g:785:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:789:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL3.g:790:2: ( ruleWorkSequenceType )
            {
            // InternalPDL3.g:790:2: ( ruleWorkSequenceType )
            // InternalPDL3.g:791:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_2"
    // InternalPDL3.g:800:1: rule__WorkSequence__SuccessorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL3.g:804:1: ( ( ( RULE_ID ) ) )
            // InternalPDL3.g:805:2: ( ( RULE_ID ) )
            {
            // InternalPDL3.g:805:2: ( ( RULE_ID ) )
            // InternalPDL3.g:806:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_2_0()); 
            // InternalPDL3.g:807:3: ( RULE_ID )
            // InternalPDL3.g:808:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_2_0()); 

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
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007800L});

}