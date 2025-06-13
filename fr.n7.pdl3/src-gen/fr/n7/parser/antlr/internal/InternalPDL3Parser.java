package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.PDL3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDL3Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "':'", "'workdefinitions'", "';'", "'worksequences'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
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

        public InternalPDL3Parser(TokenStream input, PDL3GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Process";
       	}

       	@Override
       	protected PDL3GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProcess"
    // InternalPDL3.g:65:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPDL3.g:65:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPDL3.g:66:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL3.g:72:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= RULE_ID ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= RULE_ID ) ) )* otherlv_8= ';' otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* (otherlv_14= ';' )? ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_workDefinitions_5_0=null;
        Token otherlv_6=null;
        Token lv_workDefinitions_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_workSequences_11_0 = null;

        EObject lv_workSequences_13_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:78:2: ( (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= RULE_ID ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= RULE_ID ) ) )* otherlv_8= ';' otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* (otherlv_14= ';' )? ) )
            // InternalPDL3.g:79:2: (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= RULE_ID ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= RULE_ID ) ) )* otherlv_8= ';' otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* (otherlv_14= ';' )? )
            {
            // InternalPDL3.g:79:2: (otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= RULE_ID ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= RULE_ID ) ) )* otherlv_8= ';' otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* (otherlv_14= ';' )? )
            // InternalPDL3.g:80:3: otherlv_0= 'process' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'workdefinitions' otherlv_4= ':' ( (lv_workDefinitions_5_0= RULE_ID ) ) (otherlv_6= ';' ( (lv_workDefinitions_7_0= RULE_ID ) ) )* otherlv_8= ';' otherlv_9= 'worksequences' otherlv_10= ':' ( (lv_workSequences_11_0= ruleWorkSequence ) ) (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )* (otherlv_14= ';' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getColonKeyword_1());
            		
            // InternalPDL3.g:88:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalPDL3.g:89:4: (lv_name_2_0= RULE_ID )
            {
            // InternalPDL3.g:89:4: (lv_name_2_0= RULE_ID )
            // InternalPDL3.g:90:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getWorkdefinitionsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getColonKeyword_4());
            		
            // InternalPDL3.g:114:3: ( (lv_workDefinitions_5_0= RULE_ID ) )
            // InternalPDL3.g:115:4: (lv_workDefinitions_5_0= RULE_ID )
            {
            // InternalPDL3.g:115:4: (lv_workDefinitions_5_0= RULE_ID )
            // InternalPDL3.g:116:5: lv_workDefinitions_5_0= RULE_ID
            {
            lv_workDefinitions_5_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_workDefinitions_5_0, grammarAccess.getProcessAccess().getWorkDefinitionsIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					addWithLastConsumed(
            						current,
            						"workDefinitions",
            						lv_workDefinitions_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPDL3.g:132:3: (otherlv_6= ';' ( (lv_workDefinitions_7_0= RULE_ID ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_ID) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalPDL3.g:133:4: otherlv_6= ';' ( (lv_workDefinitions_7_0= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getSemicolonKeyword_6_0());
            	    			
            	    // InternalPDL3.g:137:4: ( (lv_workDefinitions_7_0= RULE_ID ) )
            	    // InternalPDL3.g:138:5: (lv_workDefinitions_7_0= RULE_ID )
            	    {
            	    // InternalPDL3.g:138:5: (lv_workDefinitions_7_0= RULE_ID )
            	    // InternalPDL3.g:139:6: lv_workDefinitions_7_0= RULE_ID
            	    {
            	    lv_workDefinitions_7_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    						newLeafNode(lv_workDefinitions_7_0, grammarAccess.getProcessAccess().getWorkDefinitionsIDTerminalRuleCall_6_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getProcessRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"workDefinitions",
            	    							lv_workDefinitions_7_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getProcessAccess().getSemicolonKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getWorksequencesKeyword_8());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getColonKeyword_9());
            		
            // InternalPDL3.g:168:3: ( (lv_workSequences_11_0= ruleWorkSequence ) )
            // InternalPDL3.g:169:4: (lv_workSequences_11_0= ruleWorkSequence )
            {
            // InternalPDL3.g:169:4: (lv_workSequences_11_0= ruleWorkSequence )
            // InternalPDL3.g:170:5: lv_workSequences_11_0= ruleWorkSequence
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_8);
            lv_workSequences_11_0=ruleWorkSequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					add(
            						current,
            						"workSequences",
            						lv_workSequences_11_0,
            						"fr.n7.PDL3.WorkSequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDL3.g:187:3: (otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_ID) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalPDL3.g:188:4: otherlv_12= ';' ( (lv_workSequences_13_0= ruleWorkSequence ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FOLLOW_4); 

            	    				newLeafNode(otherlv_12, grammarAccess.getProcessAccess().getSemicolonKeyword_11_0());
            	    			
            	    // InternalPDL3.g:192:4: ( (lv_workSequences_13_0= ruleWorkSequence ) )
            	    // InternalPDL3.g:193:5: (lv_workSequences_13_0= ruleWorkSequence )
            	    {
            	    // InternalPDL3.g:193:5: (lv_workSequences_13_0= ruleWorkSequence )
            	    // InternalPDL3.g:194:6: lv_workSequences_13_0= ruleWorkSequence
            	    {

            	    						newCompositeNode(grammarAccess.getProcessAccess().getWorkSequencesWorkSequenceParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_workSequences_13_0=ruleWorkSequence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessRule());
            	    						}
            	    						add(
            	    							current,
            	    							"workSequences",
            	    							lv_workSequences_13_0,
            	    							"fr.n7.PDL3.WorkSequence");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalPDL3.g:212:3: (otherlv_14= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPDL3.g:213:4: otherlv_14= ';'
                    {
                    otherlv_14=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getProcessAccess().getSemicolonKeyword_12());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL3.g:222:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalPDL3.g:222:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalPDL3.g:223:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL3.g:229:1: ruleWorkSequence returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_linkType_1_0 = null;



        	enterRule();

        try {
            // InternalPDL3.g:235:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalPDL3.g:236:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalPDL3.g:236:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalPDL3.g:237:3: ( (otherlv_0= RULE_ID ) ) ( (lv_linkType_1_0= ruleWorkSequenceType ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalPDL3.g:237:3: ( (otherlv_0= RULE_ID ) )
            // InternalPDL3.g:238:4: (otherlv_0= RULE_ID )
            {
            // InternalPDL3.g:238:4: (otherlv_0= RULE_ID )
            // InternalPDL3.g:239:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalPDL3.g:250:3: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // InternalPDL3.g:251:4: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // InternalPDL3.g:251:4: (lv_linkType_1_0= ruleWorkSequenceType )
            // InternalPDL3.g:252:5: lv_linkType_1_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_1_0,
            						"fr.n7.PDL3.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPDL3.g:269:3: ( (otherlv_2= RULE_ID ) )
            // InternalPDL3.g:270:4: (otherlv_2= RULE_ID )
            {
            // InternalPDL3.g:270:4: (otherlv_2= RULE_ID )
            // InternalPDL3.g:271:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL3.g:286:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPDL3.g:292:2: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) ) )
            // InternalPDL3.g:293:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            {
            // InternalPDL3.g:293:2: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 'f2s' ) | (enumLiteral_2= 's2f' ) | (enumLiteral_3= 'f2f' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPDL3.g:294:3: (enumLiteral_0= 's2s' )
                    {
                    // InternalPDL3.g:294:3: (enumLiteral_0= 's2s' )
                    // InternalPDL3.g:295:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getS2sEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getS2sEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL3.g:302:3: (enumLiteral_1= 'f2s' )
                    {
                    // InternalPDL3.g:302:3: (enumLiteral_1= 'f2s' )
                    // InternalPDL3.g:303:4: enumLiteral_1= 'f2s'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getF2sEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getF2sEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL3.g:310:3: (enumLiteral_2= 's2f' )
                    {
                    // InternalPDL3.g:310:3: (enumLiteral_2= 's2f' )
                    // InternalPDL3.g:311:4: enumLiteral_2= 's2f'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getS2fEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getS2fEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL3.g:318:3: (enumLiteral_3= 'f2f' )
                    {
                    // InternalPDL3.g:318:3: (enumLiteral_3= 'f2f' )
                    // InternalPDL3.g:319:4: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getF2fEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getF2fEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000F0000L});

}