package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.PascalitoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalitoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'programa'", "'{'", "'}'", "'var'", "','", "';'", "'procedimento'", "'Inicio'", "'Fim'", "'('", "')'", "'->'", "'if'", "'else'", "'Loop'", "'.'", "'Comutativa'", "'ExpBinLogica'", "'Prioridade'", "'Operador'", "'operandoEsq'", "'operandoDir'", "'ExpBin'", "'ExpNeg'", "'nega'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPascalitoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalitoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalitoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPascalito.g"; }



     	private PascalitoGrammarAccess grammarAccess;

        public InternalPascalitoParser(TokenStream input, PascalitoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Programa";
       	}

       	@Override
       	protected PascalitoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrograma"
    // InternalPascalito.g:64:1: entryRulePrograma returns [EObject current=null] : iv_rulePrograma= rulePrograma EOF ;
    public final EObject entryRulePrograma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrograma = null;


        try {
            // InternalPascalito.g:64:49: (iv_rulePrograma= rulePrograma EOF )
            // InternalPascalito.g:65:2: iv_rulePrograma= rulePrograma EOF
            {
             newCompositeNode(grammarAccess.getProgramaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrograma=rulePrograma();

            state._fsp--;

             current =iv_rulePrograma; 
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
    // $ANTLR end "entryRulePrograma"


    // $ANTLR start "rulePrograma"
    // InternalPascalito.g:71:1: rulePrograma returns [EObject current=null] : (otherlv_0= 'programa' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_bloco_3_0= ruleBloco ) ) otherlv_4= '}' ) ;
    public final EObject rulePrograma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_Ident_1_0 = null;

        EObject lv_bloco_3_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:77:2: ( (otherlv_0= 'programa' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_bloco_3_0= ruleBloco ) ) otherlv_4= '}' ) )
            // InternalPascalito.g:78:2: (otherlv_0= 'programa' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_bloco_3_0= ruleBloco ) ) otherlv_4= '}' )
            {
            // InternalPascalito.g:78:2: (otherlv_0= 'programa' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_bloco_3_0= ruleBloco ) ) otherlv_4= '}' )
            // InternalPascalito.g:79:3: otherlv_0= 'programa' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_bloco_3_0= ruleBloco ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramaAccess().getProgramaKeyword_0());
            		
            // InternalPascalito.g:83:3: ( (lv_Ident_1_0= ruleEString ) )
            // InternalPascalito.g:84:4: (lv_Ident_1_0= ruleEString )
            {
            // InternalPascalito.g:84:4: (lv_Ident_1_0= ruleEString )
            // InternalPascalito.g:85:5: lv_Ident_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProgramaAccess().getIdentEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_Ident_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramaRule());
            					}
            					set(
            						current,
            						"Ident",
            						lv_Ident_1_0,
            						"org.xtext.example.mydsl.Pascalito.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPascalito.g:106:3: ( (lv_bloco_3_0= ruleBloco ) )
            // InternalPascalito.g:107:4: (lv_bloco_3_0= ruleBloco )
            {
            // InternalPascalito.g:107:4: (lv_bloco_3_0= ruleBloco )
            // InternalPascalito.g:108:5: lv_bloco_3_0= ruleBloco
            {

            					newCompositeNode(grammarAccess.getProgramaAccess().getBlocoBlocoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_bloco_3_0=ruleBloco();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramaRule());
            					}
            					set(
            						current,
            						"bloco",
            						lv_bloco_3_0,
            						"org.xtext.example.mydsl.Pascalito.Bloco");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramaAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePrograma"


    // $ANTLR start "entryRuleComando"
    // InternalPascalito.g:133:1: entryRuleComando returns [EObject current=null] : iv_ruleComando= ruleComando EOF ;
    public final EObject entryRuleComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComando = null;


        try {
            // InternalPascalito.g:133:48: (iv_ruleComando= ruleComando EOF )
            // InternalPascalito.g:134:2: iv_ruleComando= ruleComando EOF
            {
             newCompositeNode(grammarAccess.getComandoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComando=ruleComando();

            state._fsp--;

             current =iv_ruleComando; 
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
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // InternalPascalito.g:140:1: ruleComando returns [EObject current=null] : (this_CallProcedimento_0= ruleCallProcedimento | this_Atribuicao_1= ruleAtribuicao | this_Desvio_2= ruleDesvio | this_Loop_3= ruleLoop ) ;
    public final EObject ruleComando() throws RecognitionException {
        EObject current = null;

        EObject this_CallProcedimento_0 = null;

        EObject this_Atribuicao_1 = null;

        EObject this_Desvio_2 = null;

        EObject this_Loop_3 = null;



        	enterRule();

        try {
            // InternalPascalito.g:146:2: ( (this_CallProcedimento_0= ruleCallProcedimento | this_Atribuicao_1= ruleAtribuicao | this_Desvio_2= ruleDesvio | this_Loop_3= ruleLoop ) )
            // InternalPascalito.g:147:2: (this_CallProcedimento_0= ruleCallProcedimento | this_Atribuicao_1= ruleAtribuicao | this_Desvio_2= ruleDesvio | this_Loop_3= ruleLoop )
            {
            // InternalPascalito.g:147:2: (this_CallProcedimento_0= ruleCallProcedimento | this_Atribuicao_1= ruleAtribuicao | this_Desvio_2= ruleDesvio | this_Loop_3= ruleLoop )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==22) ) {
                    alt1=2;
                }
                else if ( (LA1_1==20) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 25:
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
                    // InternalPascalito.g:148:3: this_CallProcedimento_0= ruleCallProcedimento
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getCallProcedimentoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallProcedimento_0=ruleCallProcedimento();

                    state._fsp--;


                    			current = this_CallProcedimento_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:157:3: this_Atribuicao_1= ruleAtribuicao
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getAtribuicaoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atribuicao_1=ruleAtribuicao();

                    state._fsp--;


                    			current = this_Atribuicao_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPascalito.g:166:3: this_Desvio_2= ruleDesvio
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getDesvioParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Desvio_2=ruleDesvio();

                    state._fsp--;


                    			current = this_Desvio_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPascalito.g:175:3: this_Loop_3= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getLoopParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_3=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleExpressao"
    // InternalPascalito.g:187:1: entryRuleExpressao returns [EObject current=null] : iv_ruleExpressao= ruleExpressao EOF ;
    public final EObject entryRuleExpressao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressao = null;


        try {
            // InternalPascalito.g:187:50: (iv_ruleExpressao= ruleExpressao EOF )
            // InternalPascalito.g:188:2: iv_ruleExpressao= ruleExpressao EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressao=ruleExpressao();

            state._fsp--;

             current =iv_ruleExpressao; 
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
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalPascalito.g:194:1: ruleExpressao returns [EObject current=null] : (this_CallVariavel_0= ruleCallVariavel | this_Number_1= ruleNumber | this_ExpBinLogica_2= ruleExpBinLogica | this_ExpBin_3= ruleExpBin | this_ExpNeg_4= ruleExpNeg ) ;
    public final EObject ruleExpressao() throws RecognitionException {
        EObject current = null;

        EObject this_CallVariavel_0 = null;

        EObject this_Number_1 = null;

        EObject this_ExpBinLogica_2 = null;

        EObject this_ExpBin_3 = null;

        EObject this_ExpNeg_4 = null;



        	enterRule();

        try {
            // InternalPascalito.g:200:2: ( (this_CallVariavel_0= ruleCallVariavel | this_Number_1= ruleNumber | this_ExpBinLogica_2= ruleExpBinLogica | this_ExpBin_3= ruleExpBin | this_ExpNeg_4= ruleExpNeg ) )
            // InternalPascalito.g:201:2: (this_CallVariavel_0= ruleCallVariavel | this_Number_1= ruleNumber | this_ExpBinLogica_2= ruleExpBinLogica | this_ExpBin_3= ruleExpBin | this_ExpNeg_4= ruleExpNeg )
            {
            // InternalPascalito.g:201:2: (this_CallVariavel_0= ruleCallVariavel | this_Number_1= ruleNumber | this_ExpBinLogica_2= ruleExpBinLogica | this_ExpBin_3= ruleExpBin | this_ExpNeg_4= ruleExpNeg )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case RULE_INT:
            case 36:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==28) ) {
                    alt2=3;
                }
                else if ( (LA2_3==33) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 33:
                {
                alt2=4;
                }
                break;
            case 34:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPascalito.g:202:3: this_CallVariavel_0= ruleCallVariavel
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getCallVariavelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallVariavel_0=ruleCallVariavel();

                    state._fsp--;


                    			current = this_CallVariavel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:211:3: this_Number_1= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getNumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_1=ruleNumber();

                    state._fsp--;


                    			current = this_Number_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPascalito.g:220:3: this_ExpBinLogica_2= ruleExpBinLogica
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getExpBinLogicaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpBinLogica_2=ruleExpBinLogica();

                    state._fsp--;


                    			current = this_ExpBinLogica_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPascalito.g:229:3: this_ExpBin_3= ruleExpBin
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getExpBinParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpBin_3=ruleExpBin();

                    state._fsp--;


                    			current = this_ExpBin_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPascalito.g:238:3: this_ExpNeg_4= ruleExpNeg
                    {

                    			newCompositeNode(grammarAccess.getExpressaoAccess().getExpNegParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpNeg_4=ruleExpNeg();

                    state._fsp--;


                    			current = this_ExpNeg_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleEString"
    // InternalPascalito.g:250:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPascalito.g:250:47: (iv_ruleEString= ruleEString EOF )
            // InternalPascalito.g:251:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPascalito.g:257:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPascalito.g:263:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPascalito.g:264:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPascalito.g:264:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascalito.g:265:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:273:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBloco"
    // InternalPascalito.g:284:1: entryRuleBloco returns [EObject current=null] : iv_ruleBloco= ruleBloco EOF ;
    public final EObject entryRuleBloco() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBloco = null;


        try {
            // InternalPascalito.g:284:46: (iv_ruleBloco= ruleBloco EOF )
            // InternalPascalito.g:285:2: iv_ruleBloco= ruleBloco EOF
            {
             newCompositeNode(grammarAccess.getBlocoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBloco=ruleBloco();

            state._fsp--;

             current =iv_ruleBloco; 
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
    // $ANTLR end "entryRuleBloco"


    // $ANTLR start "ruleBloco"
    // InternalPascalito.g:291:1: ruleBloco returns [EObject current=null] : ( () (otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) ) )* otherlv_8= 'Inicio' ( (lv_executa_9_0= ruleComando ) )* otherlv_10= 'Fim' ) ;
    public final EObject ruleBloco() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_defvariavel_2_0 = null;

        EObject lv_defvariavel_4_0 = null;

        EObject lv_defprocedimento_7_0 = null;

        EObject lv_executa_9_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:297:2: ( ( () (otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) ) )* otherlv_8= 'Inicio' ( (lv_executa_9_0= ruleComando ) )* otherlv_10= 'Fim' ) )
            // InternalPascalito.g:298:2: ( () (otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) ) )* otherlv_8= 'Inicio' ( (lv_executa_9_0= ruleComando ) )* otherlv_10= 'Fim' )
            {
            // InternalPascalito.g:298:2: ( () (otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) ) )* otherlv_8= 'Inicio' ( (lv_executa_9_0= ruleComando ) )* otherlv_10= 'Fim' )
            // InternalPascalito.g:299:3: () (otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) ) )* otherlv_8= 'Inicio' ( (lv_executa_9_0= ruleComando ) )* otherlv_10= 'Fim'
            {
            // InternalPascalito.g:299:3: ()
            // InternalPascalito.g:300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlocoAccess().getBlocoAction_0(),
            					current);
            			

            }

            // InternalPascalito.g:306:3: (otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPascalito.g:307:4: otherlv_1= 'var' ( (lv_defvariavel_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )* otherlv_5= ';'
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getBlocoAccess().getVarKeyword_1_0());
            	    			
            	    // InternalPascalito.g:311:4: ( (lv_defvariavel_2_0= ruleVariavel ) )
            	    // InternalPascalito.g:312:5: (lv_defvariavel_2_0= ruleVariavel )
            	    {
            	    // InternalPascalito.g:312:5: (lv_defvariavel_2_0= ruleVariavel )
            	    // InternalPascalito.g:313:6: lv_defvariavel_2_0= ruleVariavel
            	    {

            	    						newCompositeNode(grammarAccess.getBlocoAccess().getDefvariavelVariavelParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_defvariavel_2_0=ruleVariavel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlocoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defvariavel",
            	    							lv_defvariavel_2_0,
            	    							"org.xtext.example.mydsl.Pascalito.Variavel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPascalito.g:330:4: (otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==15) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalPascalito.g:331:5: otherlv_3= ',' ( (lv_defvariavel_4_0= ruleVariavel ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,15,FOLLOW_7); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getBlocoAccess().getCommaKeyword_1_2_0());
            	    	    				
            	    	    // InternalPascalito.g:335:5: ( (lv_defvariavel_4_0= ruleVariavel ) )
            	    	    // InternalPascalito.g:336:6: (lv_defvariavel_4_0= ruleVariavel )
            	    	    {
            	    	    // InternalPascalito.g:336:6: (lv_defvariavel_4_0= ruleVariavel )
            	    	    // InternalPascalito.g:337:7: lv_defvariavel_4_0= ruleVariavel
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getBlocoAccess().getDefvariavelVariavelParserRuleCall_1_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_defvariavel_4_0=ruleVariavel();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getBlocoRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"defvariavel",
            	    	    								lv_defvariavel_4_0,
            	    	    								"org.xtext.example.mydsl.Pascalito.Variavel");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    otherlv_5=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getBlocoAccess().getSemicolonKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalPascalito.g:360:3: (otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascalito.g:361:4: otherlv_6= 'procedimento' ( (lv_defprocedimento_7_0= ruleProcedimento ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_6, grammarAccess.getBlocoAccess().getProcedimentoKeyword_2_0());
            	    			
            	    // InternalPascalito.g:365:4: ( (lv_defprocedimento_7_0= ruleProcedimento ) )
            	    // InternalPascalito.g:366:5: (lv_defprocedimento_7_0= ruleProcedimento )
            	    {
            	    // InternalPascalito.g:366:5: (lv_defprocedimento_7_0= ruleProcedimento )
            	    // InternalPascalito.g:367:6: lv_defprocedimento_7_0= ruleProcedimento
            	    {

            	    						newCompositeNode(grammarAccess.getBlocoAccess().getDefprocedimentoProcedimentoParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_defprocedimento_7_0=ruleProcedimento();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlocoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defprocedimento",
            	    							lv_defprocedimento_7_0,
            	    							"org.xtext.example.mydsl.Pascalito.Procedimento");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getBlocoAccess().getInicioKeyword_3());
            		
            // InternalPascalito.g:389:3: ( (lv_executa_9_0= ruleComando ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==23||LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascalito.g:390:4: (lv_executa_9_0= ruleComando )
            	    {
            	    // InternalPascalito.g:390:4: (lv_executa_9_0= ruleComando )
            	    // InternalPascalito.g:391:5: lv_executa_9_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getBlocoAccess().getExecutaComandoParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_executa_9_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlocoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"executa",
            	    						lv_executa_9_0,
            	    						"org.xtext.example.mydsl.Pascalito.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBlocoAccess().getFimKeyword_5());
            		

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
    // $ANTLR end "ruleBloco"


    // $ANTLR start "entryRuleVariavel"
    // InternalPascalito.g:416:1: entryRuleVariavel returns [EObject current=null] : iv_ruleVariavel= ruleVariavel EOF ;
    public final EObject entryRuleVariavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariavel = null;


        try {
            // InternalPascalito.g:416:49: (iv_ruleVariavel= ruleVariavel EOF )
            // InternalPascalito.g:417:2: iv_ruleVariavel= ruleVariavel EOF
            {
             newCompositeNode(grammarAccess.getVariavelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariavel=ruleVariavel();

            state._fsp--;

             current =iv_ruleVariavel; 
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
    // $ANTLR end "entryRuleVariavel"


    // $ANTLR start "ruleVariavel"
    // InternalPascalito.g:423:1: ruleVariavel returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariavel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalPascalito.g:429:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalPascalito.g:430:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalPascalito.g:430:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalPascalito.g:431:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalPascalito.g:431:3: ()
            // InternalPascalito.g:432:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariavelAccess().getVariavelAction_0(),
            					current);
            			

            }

            // InternalPascalito.g:438:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascalito.g:439:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascalito.g:439:4: (lv_name_1_0= RULE_ID )
            // InternalPascalito.g:440:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariavelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariavelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVariavel"


    // $ANTLR start "entryRuleProcedimento"
    // InternalPascalito.g:460:1: entryRuleProcedimento returns [EObject current=null] : iv_ruleProcedimento= ruleProcedimento EOF ;
    public final EObject entryRuleProcedimento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedimento = null;


        try {
            // InternalPascalito.g:460:53: (iv_ruleProcedimento= ruleProcedimento EOF )
            // InternalPascalito.g:461:2: iv_ruleProcedimento= ruleProcedimento EOF
            {
             newCompositeNode(grammarAccess.getProcedimentoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcedimento=ruleProcedimento();

            state._fsp--;

             current =iv_ruleProcedimento; 
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
    // $ANTLR end "entryRuleProcedimento"


    // $ANTLR start "ruleProcedimento"
    // InternalPascalito.g:467:1: ruleProcedimento returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametro_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleVariavel ) ) )* )? otherlv_5= ')' ) otherlv_6= '{' ( (lv_bloco_7_0= ruleBloco ) ) otherlv_8= '}' ) ;
    public final EObject ruleProcedimento() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parametro_2_0 = null;

        EObject lv_parametro_4_0 = null;

        EObject lv_bloco_7_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:473:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametro_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleVariavel ) ) )* )? otherlv_5= ')' ) otherlv_6= '{' ( (lv_bloco_7_0= ruleBloco ) ) otherlv_8= '}' ) )
            // InternalPascalito.g:474:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametro_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleVariavel ) ) )* )? otherlv_5= ')' ) otherlv_6= '{' ( (lv_bloco_7_0= ruleBloco ) ) otherlv_8= '}' )
            {
            // InternalPascalito.g:474:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametro_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleVariavel ) ) )* )? otherlv_5= ')' ) otherlv_6= '{' ( (lv_bloco_7_0= ruleBloco ) ) otherlv_8= '}' )
            // InternalPascalito.g:475:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametro_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleVariavel ) ) )* )? otherlv_5= ')' ) otherlv_6= '{' ( (lv_bloco_7_0= ruleBloco ) ) otherlv_8= '}'
            {
            // InternalPascalito.g:475:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametro_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleVariavel ) ) )* )? otherlv_5= ')' )
            // InternalPascalito.g:476:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parametro_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleVariavel ) ) )* )? otherlv_5= ')'
            {
            // InternalPascalito.g:476:4: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascalito.g:477:5: (lv_name_0_0= RULE_ID )
            {
            // InternalPascalito.g:477:5: (lv_name_0_0= RULE_ID )
            // InternalPascalito.g:478:6: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            						newLeafNode(lv_name_0_0, grammarAccess.getProcedimentoAccess().getNameIDTerminalRuleCall_0_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getProcedimentoRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_0_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            				newLeafNode(otherlv_1, grammarAccess.getProcedimentoAccess().getLeftParenthesisKeyword_0_1());
            			
            // InternalPascalito.g:498:4: ( ( (lv_parametro_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleVariavel ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascalito.g:499:5: ( (lv_parametro_2_0= ruleVariavel ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleVariavel ) ) )*
                    {
                    // InternalPascalito.g:499:5: ( (lv_parametro_2_0= ruleVariavel ) )
                    // InternalPascalito.g:500:6: (lv_parametro_2_0= ruleVariavel )
                    {
                    // InternalPascalito.g:500:6: (lv_parametro_2_0= ruleVariavel )
                    // InternalPascalito.g:501:7: lv_parametro_2_0= ruleVariavel
                    {

                    							newCompositeNode(grammarAccess.getProcedimentoAccess().getParametroVariavelParserRuleCall_0_2_0_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_parametro_2_0=ruleVariavel();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getProcedimentoRule());
                    							}
                    							add(
                    								current,
                    								"parametro",
                    								lv_parametro_2_0,
                    								"org.xtext.example.mydsl.Pascalito.Variavel");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalPascalito.g:518:5: (otherlv_3= ',' ( (lv_parametro_4_0= ruleVariavel ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalPascalito.g:519:6: otherlv_3= ',' ( (lv_parametro_4_0= ruleVariavel ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_7); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getProcedimentoAccess().getCommaKeyword_0_2_1_0());
                    	    					
                    	    // InternalPascalito.g:523:6: ( (lv_parametro_4_0= ruleVariavel ) )
                    	    // InternalPascalito.g:524:7: (lv_parametro_4_0= ruleVariavel )
                    	    {
                    	    // InternalPascalito.g:524:7: (lv_parametro_4_0= ruleVariavel )
                    	    // InternalPascalito.g:525:8: lv_parametro_4_0= ruleVariavel
                    	    {

                    	    								newCompositeNode(grammarAccess.getProcedimentoAccess().getParametroVariavelParserRuleCall_0_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_13);
                    	    lv_parametro_4_0=ruleVariavel();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getProcedimentoRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"parametro",
                    	    									lv_parametro_4_0,
                    	    									"org.xtext.example.mydsl.Pascalito.Variavel");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_4); 

            				newLeafNode(otherlv_5, grammarAccess.getProcedimentoAccess().getRightParenthesisKeyword_0_3());
            			

            }

            otherlv_6=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getProcedimentoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPascalito.g:553:3: ( (lv_bloco_7_0= ruleBloco ) )
            // InternalPascalito.g:554:4: (lv_bloco_7_0= ruleBloco )
            {
            // InternalPascalito.g:554:4: (lv_bloco_7_0= ruleBloco )
            // InternalPascalito.g:555:5: lv_bloco_7_0= ruleBloco
            {

            					newCompositeNode(grammarAccess.getProcedimentoAccess().getBlocoBlocoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_bloco_7_0=ruleBloco();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedimentoRule());
            					}
            					set(
            						current,
            						"bloco",
            						lv_bloco_7_0,
            						"org.xtext.example.mydsl.Pascalito.Bloco");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getProcedimentoAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleProcedimento"


    // $ANTLR start "entryRuleCallProcedimento"
    // InternalPascalito.g:580:1: entryRuleCallProcedimento returns [EObject current=null] : iv_ruleCallProcedimento= ruleCallProcedimento EOF ;
    public final EObject entryRuleCallProcedimento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallProcedimento = null;


        try {
            // InternalPascalito.g:580:57: (iv_ruleCallProcedimento= ruleCallProcedimento EOF )
            // InternalPascalito.g:581:2: iv_ruleCallProcedimento= ruleCallProcedimento EOF
            {
             newCompositeNode(grammarAccess.getCallProcedimentoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallProcedimento=ruleCallProcedimento();

            state._fsp--;

             current =iv_ruleCallProcedimento; 
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
    // $ANTLR end "entryRuleCallProcedimento"


    // $ANTLR start "ruleCallProcedimento"
    // InternalPascalito.g:587:1: ruleCallProcedimento returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parametro_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleExpressao ) ) )* )? otherlv_5= ')' ) otherlv_6= ';' ) ;
    public final EObject ruleCallProcedimento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parametro_2_0 = null;

        EObject lv_parametro_4_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:593:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parametro_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleExpressao ) ) )* )? otherlv_5= ')' ) otherlv_6= ';' ) )
            // InternalPascalito.g:594:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parametro_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleExpressao ) ) )* )? otherlv_5= ')' ) otherlv_6= ';' )
            {
            // InternalPascalito.g:594:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parametro_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleExpressao ) ) )* )? otherlv_5= ')' ) otherlv_6= ';' )
            // InternalPascalito.g:595:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parametro_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleExpressao ) ) )* )? otherlv_5= ')' ) otherlv_6= ';'
            {
            // InternalPascalito.g:595:3: ( (otherlv_0= RULE_ID ) )
            // InternalPascalito.g:596:4: (otherlv_0= RULE_ID )
            {
            // InternalPascalito.g:596:4: (otherlv_0= RULE_ID )
            // InternalPascalito.g:597:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallProcedimentoRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getCallProcedimentoAccess().getDefinidoProcedimentoCrossReference_0_0());
            				

            }


            }

            // InternalPascalito.g:608:3: (otherlv_1= '(' ( ( (lv_parametro_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleExpressao ) ) )* )? otherlv_5= ')' )
            // InternalPascalito.g:609:4: otherlv_1= '(' ( ( (lv_parametro_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleExpressao ) ) )* )? otherlv_5= ')'
            {
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            				newLeafNode(otherlv_1, grammarAccess.getCallProcedimentoAccess().getLeftParenthesisKeyword_1_0());
            			
            // InternalPascalito.g:613:4: ( ( (lv_parametro_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleExpressao ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||(LA11_0>=27 && LA11_0<=28)||(LA11_0>=33 && LA11_0<=34)||LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascalito.g:614:5: ( (lv_parametro_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_parametro_4_0= ruleExpressao ) ) )*
                    {
                    // InternalPascalito.g:614:5: ( (lv_parametro_2_0= ruleExpressao ) )
                    // InternalPascalito.g:615:6: (lv_parametro_2_0= ruleExpressao )
                    {
                    // InternalPascalito.g:615:6: (lv_parametro_2_0= ruleExpressao )
                    // InternalPascalito.g:616:7: lv_parametro_2_0= ruleExpressao
                    {

                    							newCompositeNode(grammarAccess.getCallProcedimentoAccess().getParametroExpressaoParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_parametro_2_0=ruleExpressao();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCallProcedimentoRule());
                    							}
                    							add(
                    								current,
                    								"parametro",
                    								lv_parametro_2_0,
                    								"org.xtext.example.mydsl.Pascalito.Expressao");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalPascalito.g:633:5: (otherlv_3= ',' ( (lv_parametro_4_0= ruleExpressao ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalPascalito.g:634:6: otherlv_3= ',' ( (lv_parametro_4_0= ruleExpressao ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_15); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getCallProcedimentoAccess().getCommaKeyword_1_1_1_0());
                    	    					
                    	    // InternalPascalito.g:638:6: ( (lv_parametro_4_0= ruleExpressao ) )
                    	    // InternalPascalito.g:639:7: (lv_parametro_4_0= ruleExpressao )
                    	    {
                    	    // InternalPascalito.g:639:7: (lv_parametro_4_0= ruleExpressao )
                    	    // InternalPascalito.g:640:8: lv_parametro_4_0= ruleExpressao
                    	    {

                    	    								newCompositeNode(grammarAccess.getCallProcedimentoAccess().getParametroExpressaoParserRuleCall_1_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_13);
                    	    lv_parametro_4_0=ruleExpressao();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCallProcedimentoRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"parametro",
                    	    									lv_parametro_4_0,
                    	    									"org.xtext.example.mydsl.Pascalito.Expressao");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_16); 

            				newLeafNode(otherlv_5, grammarAccess.getCallProcedimentoAccess().getRightParenthesisKeyword_1_2());
            			

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCallProcedimentoAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleCallProcedimento"


    // $ANTLR start "entryRuleAtribuicao"
    // InternalPascalito.g:672:1: entryRuleAtribuicao returns [EObject current=null] : iv_ruleAtribuicao= ruleAtribuicao EOF ;
    public final EObject entryRuleAtribuicao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtribuicao = null;


        try {
            // InternalPascalito.g:672:51: (iv_ruleAtribuicao= ruleAtribuicao EOF )
            // InternalPascalito.g:673:2: iv_ruleAtribuicao= ruleAtribuicao EOF
            {
             newCompositeNode(grammarAccess.getAtribuicaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtribuicao=ruleAtribuicao();

            state._fsp--;

             current =iv_ruleAtribuicao; 
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
    // $ANTLR end "entryRuleAtribuicao"


    // $ANTLR start "ruleAtribuicao"
    // InternalPascalito.g:679:1: ruleAtribuicao returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_atribuiResultado_2_0= ruleExpressao ) ) otherlv_3= ';' ) ;
    public final EObject ruleAtribuicao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_atribuiResultado_2_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:685:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_atribuiResultado_2_0= ruleExpressao ) ) otherlv_3= ';' ) )
            // InternalPascalito.g:686:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_atribuiResultado_2_0= ruleExpressao ) ) otherlv_3= ';' )
            {
            // InternalPascalito.g:686:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_atribuiResultado_2_0= ruleExpressao ) ) otherlv_3= ';' )
            // InternalPascalito.g:687:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_atribuiResultado_2_0= ruleExpressao ) ) otherlv_3= ';'
            {
            // InternalPascalito.g:687:3: ( (otherlv_0= RULE_ID ) )
            // InternalPascalito.g:688:4: (otherlv_0= RULE_ID )
            {
            // InternalPascalito.g:688:4: (otherlv_0= RULE_ID )
            // InternalPascalito.g:689:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtribuicaoRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getAtribuicaoAccess().getAtribuiVariavelCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAtribuicaoAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalPascalito.g:704:3: ( (lv_atribuiResultado_2_0= ruleExpressao ) )
            // InternalPascalito.g:705:4: (lv_atribuiResultado_2_0= ruleExpressao )
            {
            // InternalPascalito.g:705:4: (lv_atribuiResultado_2_0= ruleExpressao )
            // InternalPascalito.g:706:5: lv_atribuiResultado_2_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getAtribuicaoAccess().getAtribuiResultadoExpressaoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_atribuiResultado_2_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtribuicaoRule());
            					}
            					set(
            						current,
            						"atribuiResultado",
            						lv_atribuiResultado_2_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAtribuicaoAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAtribuicao"


    // $ANTLR start "entryRuleDesvio"
    // InternalPascalito.g:731:1: entryRuleDesvio returns [EObject current=null] : iv_ruleDesvio= ruleDesvio EOF ;
    public final EObject entryRuleDesvio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesvio = null;


        try {
            // InternalPascalito.g:731:47: (iv_ruleDesvio= ruleDesvio EOF )
            // InternalPascalito.g:732:2: iv_ruleDesvio= ruleDesvio EOF
            {
             newCompositeNode(grammarAccess.getDesvioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesvio=ruleDesvio();

            state._fsp--;

             current =iv_ruleDesvio; 
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
    // $ANTLR end "entryRuleDesvio"


    // $ANTLR start "ruleDesvio"
    // InternalPascalito.g:738:1: ruleDesvio returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_se_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_faca_5_0= ruleComando ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_seNao_9_0= ruleComando ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleDesvio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_se_2_0 = null;

        EObject lv_faca_5_0 = null;

        EObject lv_seNao_9_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:744:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_se_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_faca_5_0= ruleComando ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_seNao_9_0= ruleComando ) )* otherlv_10= '}' )? ) )
            // InternalPascalito.g:745:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_se_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_faca_5_0= ruleComando ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_seNao_9_0= ruleComando ) )* otherlv_10= '}' )? )
            {
            // InternalPascalito.g:745:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_se_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_faca_5_0= ruleComando ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_seNao_9_0= ruleComando ) )* otherlv_10= '}' )? )
            // InternalPascalito.g:746:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_se_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_faca_5_0= ruleComando ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_seNao_9_0= ruleComando ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDesvioAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDesvioAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascalito.g:754:3: ( (lv_se_2_0= ruleExpressao ) )
            // InternalPascalito.g:755:4: (lv_se_2_0= ruleExpressao )
            {
            // InternalPascalito.g:755:4: (lv_se_2_0= ruleExpressao )
            // InternalPascalito.g:756:5: lv_se_2_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getDesvioAccess().getSeExpressaoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_se_2_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDesvioRule());
            					}
            					set(
            						current,
            						"se",
            						lv_se_2_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDesvioAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getDesvioAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalPascalito.g:781:3: ( (lv_faca_5_0= ruleComando ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==23||LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascalito.g:782:4: (lv_faca_5_0= ruleComando )
            	    {
            	    // InternalPascalito.g:782:4: (lv_faca_5_0= ruleComando )
            	    // InternalPascalito.g:783:5: lv_faca_5_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getDesvioAccess().getFacaComandoParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_faca_5_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDesvioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"faca",
            	    						lv_faca_5_0,
            	    						"org.xtext.example.mydsl.Pascalito.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getDesvioAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalPascalito.g:804:3: (otherlv_7= 'else' otherlv_8= '{' ( (lv_seNao_9_0= ruleComando ) )* otherlv_10= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascalito.g:805:4: otherlv_7= 'else' otherlv_8= '{' ( (lv_seNao_9_0= ruleComando ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getDesvioAccess().getElseKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getDesvioAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalPascalito.g:813:4: ( (lv_seNao_9_0= ruleComando ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||LA13_0==23||LA13_0==25) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPascalito.g:814:5: (lv_seNao_9_0= ruleComando )
                    	    {
                    	    // InternalPascalito.g:814:5: (lv_seNao_9_0= ruleComando )
                    	    // InternalPascalito.g:815:6: lv_seNao_9_0= ruleComando
                    	    {

                    	    						newCompositeNode(grammarAccess.getDesvioAccess().getSeNaoComandoParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_seNao_9_0=ruleComando();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDesvioRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"seNao",
                    	    							lv_seNao_9_0,
                    	    							"org.xtext.example.mydsl.Pascalito.Comando");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getDesvioAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleDesvio"


    // $ANTLR start "entryRuleLoop"
    // InternalPascalito.g:841:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalPascalito.g:841:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalPascalito.g:842:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalPascalito.g:848:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' otherlv_1= '(' ( (lv_se_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_faca_5_0= ruleComando ) )* otherlv_6= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_se_2_0 = null;

        EObject lv_faca_5_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:854:2: ( (otherlv_0= 'Loop' otherlv_1= '(' ( (lv_se_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_faca_5_0= ruleComando ) )* otherlv_6= '}' ) )
            // InternalPascalito.g:855:2: (otherlv_0= 'Loop' otherlv_1= '(' ( (lv_se_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_faca_5_0= ruleComando ) )* otherlv_6= '}' )
            {
            // InternalPascalito.g:855:2: (otherlv_0= 'Loop' otherlv_1= '(' ( (lv_se_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_faca_5_0= ruleComando ) )* otherlv_6= '}' )
            // InternalPascalito.g:856:3: otherlv_0= 'Loop' otherlv_1= '(' ( (lv_se_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_faca_5_0= ruleComando ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascalito.g:864:3: ( (lv_se_2_0= ruleExpressao ) )
            // InternalPascalito.g:865:4: (lv_se_2_0= ruleExpressao )
            {
            // InternalPascalito.g:865:4: (lv_se_2_0= ruleExpressao )
            // InternalPascalito.g:866:5: lv_se_2_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getSeExpressaoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_se_2_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"se",
            						lv_se_2_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalPascalito.g:891:3: ( (lv_faca_5_0= ruleComando ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==23||LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPascalito.g:892:4: (lv_faca_5_0= ruleComando )
            	    {
            	    // InternalPascalito.g:892:4: (lv_faca_5_0= ruleComando )
            	    // InternalPascalito.g:893:5: lv_faca_5_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getFacaComandoParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_faca_5_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"faca",
            	    						lv_faca_5_0,
            	    						"org.xtext.example.mydsl.Pascalito.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleEBigDecimal"
    // InternalPascalito.g:918:1: entryRuleEBigDecimal returns [String current=null] : iv_ruleEBigDecimal= ruleEBigDecimal EOF ;
    public final String entryRuleEBigDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigDecimal = null;


        try {
            // InternalPascalito.g:918:51: (iv_ruleEBigDecimal= ruleEBigDecimal EOF )
            // InternalPascalito.g:919:2: iv_ruleEBigDecimal= ruleEBigDecimal EOF
            {
             newCompositeNode(grammarAccess.getEBigDecimalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBigDecimal=ruleEBigDecimal();

            state._fsp--;

             current =iv_ruleEBigDecimal.getText(); 
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
    // $ANTLR end "entryRuleEBigDecimal"


    // $ANTLR start "ruleEBigDecimal"
    // InternalPascalito.g:925:1: ruleEBigDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalPascalito.g:931:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalPascalito.g:932:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalPascalito.g:932:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalPascalito.g:933:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalPascalito.g:933:3: (this_INT_0= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascalito.g:934:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,26,FOLLOW_22); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleEBigDecimal"


    // $ANTLR start "entryRuleCallVariavel"
    // InternalPascalito.g:958:1: entryRuleCallVariavel returns [EObject current=null] : iv_ruleCallVariavel= ruleCallVariavel EOF ;
    public final EObject entryRuleCallVariavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallVariavel = null;


        try {
            // InternalPascalito.g:958:53: (iv_ruleCallVariavel= ruleCallVariavel EOF )
            // InternalPascalito.g:959:2: iv_ruleCallVariavel= ruleCallVariavel EOF
            {
             newCompositeNode(grammarAccess.getCallVariavelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallVariavel=ruleCallVariavel();

            state._fsp--;

             current =iv_ruleCallVariavel; 
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
    // $ANTLR end "entryRuleCallVariavel"


    // $ANTLR start "ruleCallVariavel"
    // InternalPascalito.g:965:1: ruleCallVariavel returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleCallVariavel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPascalito.g:971:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPascalito.g:972:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPascalito.g:972:2: ( (otherlv_0= RULE_ID ) )
            // InternalPascalito.g:973:3: (otherlv_0= RULE_ID )
            {
            // InternalPascalito.g:973:3: (otherlv_0= RULE_ID )
            // InternalPascalito.g:974:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCallVariavelRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getCallVariavelAccess().getRepresentaVariavelCrossReference_0());
            			

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
    // $ANTLR end "ruleCallVariavel"


    // $ANTLR start "entryRuleNumber"
    // InternalPascalito.g:988:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalPascalito.g:988:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalPascalito.g:989:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalPascalito.g:995:1: ruleNumber returns [EObject current=null] : ( () ( (lv_Valor_1_0= ruleEInt ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_Valor_1_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1001:2: ( ( () ( (lv_Valor_1_0= ruleEInt ) ) ) )
            // InternalPascalito.g:1002:2: ( () ( (lv_Valor_1_0= ruleEInt ) ) )
            {
            // InternalPascalito.g:1002:2: ( () ( (lv_Valor_1_0= ruleEInt ) ) )
            // InternalPascalito.g:1003:3: () ( (lv_Valor_1_0= ruleEInt ) )
            {
            // InternalPascalito.g:1003:3: ()
            // InternalPascalito.g:1004:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumberAction_0(),
            					current);
            			

            }

            // InternalPascalito.g:1010:3: ( (lv_Valor_1_0= ruleEInt ) )
            // InternalPascalito.g:1011:4: (lv_Valor_1_0= ruleEInt )
            {
            // InternalPascalito.g:1011:4: (lv_Valor_1_0= ruleEInt )
            // InternalPascalito.g:1012:5: lv_Valor_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNumberAccess().getValorEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_Valor_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberRule());
            					}
            					set(
            						current,
            						"Valor",
            						lv_Valor_1_0,
            						"org.xtext.example.mydsl.Pascalito.EInt");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleExpBinLogica"
    // InternalPascalito.g:1033:1: entryRuleExpBinLogica returns [EObject current=null] : iv_ruleExpBinLogica= ruleExpBinLogica EOF ;
    public final EObject entryRuleExpBinLogica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpBinLogica = null;


        try {
            // InternalPascalito.g:1033:53: (iv_ruleExpBinLogica= ruleExpBinLogica EOF )
            // InternalPascalito.g:1034:2: iv_ruleExpBinLogica= ruleExpBinLogica EOF
            {
             newCompositeNode(grammarAccess.getExpBinLogicaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpBinLogica=ruleExpBinLogica();

            state._fsp--;

             current =iv_ruleExpBinLogica; 
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
    // $ANTLR end "entryRuleExpBinLogica"


    // $ANTLR start "ruleExpBinLogica"
    // InternalPascalito.g:1040:1: ruleExpBinLogica returns [EObject current=null] : ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBinLogica' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoEsq' ( (lv_operandoEsq_8_0= ruleExpressao ) ) otherlv_9= 'operandoDir' ( (lv_operandoDir_10_0= ruleExpressao ) ) otherlv_11= '}' ) ;
    public final EObject ruleExpBinLogica() throws RecognitionException {
        EObject current = null;

        Token lv_Comutativa_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_Prioridade_4_0 = null;

        AntlrDatatypeRuleToken lv_Operador_6_0 = null;

        EObject lv_operandoEsq_8_0 = null;

        EObject lv_operandoDir_10_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1046:2: ( ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBinLogica' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoEsq' ( (lv_operandoEsq_8_0= ruleExpressao ) ) otherlv_9= 'operandoDir' ( (lv_operandoDir_10_0= ruleExpressao ) ) otherlv_11= '}' ) )
            // InternalPascalito.g:1047:2: ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBinLogica' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoEsq' ( (lv_operandoEsq_8_0= ruleExpressao ) ) otherlv_9= 'operandoDir' ( (lv_operandoDir_10_0= ruleExpressao ) ) otherlv_11= '}' )
            {
            // InternalPascalito.g:1047:2: ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBinLogica' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoEsq' ( (lv_operandoEsq_8_0= ruleExpressao ) ) otherlv_9= 'operandoDir' ( (lv_operandoDir_10_0= ruleExpressao ) ) otherlv_11= '}' )
            // InternalPascalito.g:1048:3: ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBinLogica' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoEsq' ( (lv_operandoEsq_8_0= ruleExpressao ) ) otherlv_9= 'operandoDir' ( (lv_operandoDir_10_0= ruleExpressao ) ) otherlv_11= '}'
            {
            // InternalPascalito.g:1048:3: ( (lv_Comutativa_0_0= 'Comutativa' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascalito.g:1049:4: (lv_Comutativa_0_0= 'Comutativa' )
                    {
                    // InternalPascalito.g:1049:4: (lv_Comutativa_0_0= 'Comutativa' )
                    // InternalPascalito.g:1050:5: lv_Comutativa_0_0= 'Comutativa'
                    {
                    lv_Comutativa_0_0=(Token)match(input,27,FOLLOW_23); 

                    					newLeafNode(lv_Comutativa_0_0, grammarAccess.getExpBinLogicaAccess().getComutativaComutativaKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpBinLogicaRule());
                    					}
                    					setWithLastConsumed(current, "Comutativa", true, "Comutativa");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExpBinLogicaAccess().getExpBinLogicaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getExpBinLogicaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPascalito.g:1070:3: (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPascalito.g:1071:4: otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpBinLogicaAccess().getPrioridadeKeyword_3_0());
                    			
                    // InternalPascalito.g:1075:4: ( (lv_Prioridade_4_0= ruleEBigDecimal ) )
                    // InternalPascalito.g:1076:5: (lv_Prioridade_4_0= ruleEBigDecimal )
                    {
                    // InternalPascalito.g:1076:5: (lv_Prioridade_4_0= ruleEBigDecimal )
                    // InternalPascalito.g:1077:6: lv_Prioridade_4_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getExpBinLogicaAccess().getPrioridadeEBigDecimalParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_Prioridade_4_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpBinLogicaRule());
                    						}
                    						set(
                    							current,
                    							"Prioridade",
                    							lv_Prioridade_4_0,
                    							"org.xtext.example.mydsl.Pascalito.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascalito.g:1095:3: (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPascalito.g:1096:4: otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpBinLogicaAccess().getOperadorKeyword_4_0());
                    			
                    // InternalPascalito.g:1100:4: ( (lv_Operador_6_0= ruleEString ) )
                    // InternalPascalito.g:1101:5: (lv_Operador_6_0= ruleEString )
                    {
                    // InternalPascalito.g:1101:5: (lv_Operador_6_0= ruleEString )
                    // InternalPascalito.g:1102:6: lv_Operador_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExpBinLogicaAccess().getOperadorEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_Operador_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpBinLogicaRule());
                    						}
                    						set(
                    							current,
                    							"Operador",
                    							lv_Operador_6_0,
                    							"org.xtext.example.mydsl.Pascalito.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getExpBinLogicaAccess().getOperandoEsqKeyword_5());
            		
            // InternalPascalito.g:1124:3: ( (lv_operandoEsq_8_0= ruleExpressao ) )
            // InternalPascalito.g:1125:4: (lv_operandoEsq_8_0= ruleExpressao )
            {
            // InternalPascalito.g:1125:4: (lv_operandoEsq_8_0= ruleExpressao )
            // InternalPascalito.g:1126:5: lv_operandoEsq_8_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getExpBinLogicaAccess().getOperandoEsqExpressaoParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_28);
            lv_operandoEsq_8_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpBinLogicaRule());
            					}
            					set(
            						current,
            						"operandoEsq",
            						lv_operandoEsq_8_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getExpBinLogicaAccess().getOperandoDirKeyword_7());
            		
            // InternalPascalito.g:1147:3: ( (lv_operandoDir_10_0= ruleExpressao ) )
            // InternalPascalito.g:1148:4: (lv_operandoDir_10_0= ruleExpressao )
            {
            // InternalPascalito.g:1148:4: (lv_operandoDir_10_0= ruleExpressao )
            // InternalPascalito.g:1149:5: lv_operandoDir_10_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getExpBinLogicaAccess().getOperandoDirExpressaoParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_operandoDir_10_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpBinLogicaRule());
            					}
            					set(
            						current,
            						"operandoDir",
            						lv_operandoDir_10_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getExpBinLogicaAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleExpBinLogica"


    // $ANTLR start "entryRuleExpBin"
    // InternalPascalito.g:1174:1: entryRuleExpBin returns [EObject current=null] : iv_ruleExpBin= ruleExpBin EOF ;
    public final EObject entryRuleExpBin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpBin = null;


        try {
            // InternalPascalito.g:1174:47: (iv_ruleExpBin= ruleExpBin EOF )
            // InternalPascalito.g:1175:2: iv_ruleExpBin= ruleExpBin EOF
            {
             newCompositeNode(grammarAccess.getExpBinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpBin=ruleExpBin();

            state._fsp--;

             current =iv_ruleExpBin; 
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
    // $ANTLR end "entryRuleExpBin"


    // $ANTLR start "ruleExpBin"
    // InternalPascalito.g:1181:1: ruleExpBin returns [EObject current=null] : ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBin' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoDir' ( (lv_operandoDir_8_0= ruleExpressao ) ) otherlv_9= 'operandoEsq' ( (lv_operandoEsq_10_0= ruleExpressao ) ) otherlv_11= '}' ) ;
    public final EObject ruleExpBin() throws RecognitionException {
        EObject current = null;

        Token lv_Comutativa_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_Prioridade_4_0 = null;

        AntlrDatatypeRuleToken lv_Operador_6_0 = null;

        EObject lv_operandoDir_8_0 = null;

        EObject lv_operandoEsq_10_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1187:2: ( ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBin' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoDir' ( (lv_operandoDir_8_0= ruleExpressao ) ) otherlv_9= 'operandoEsq' ( (lv_operandoEsq_10_0= ruleExpressao ) ) otherlv_11= '}' ) )
            // InternalPascalito.g:1188:2: ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBin' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoDir' ( (lv_operandoDir_8_0= ruleExpressao ) ) otherlv_9= 'operandoEsq' ( (lv_operandoEsq_10_0= ruleExpressao ) ) otherlv_11= '}' )
            {
            // InternalPascalito.g:1188:2: ( ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBin' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoDir' ( (lv_operandoDir_8_0= ruleExpressao ) ) otherlv_9= 'operandoEsq' ( (lv_operandoEsq_10_0= ruleExpressao ) ) otherlv_11= '}' )
            // InternalPascalito.g:1189:3: ( (lv_Comutativa_0_0= 'Comutativa' ) )? otherlv_1= 'ExpBin' otherlv_2= '{' (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )? (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )? otherlv_7= 'operandoDir' ( (lv_operandoDir_8_0= ruleExpressao ) ) otherlv_9= 'operandoEsq' ( (lv_operandoEsq_10_0= ruleExpressao ) ) otherlv_11= '}'
            {
            // InternalPascalito.g:1189:3: ( (lv_Comutativa_0_0= 'Comutativa' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascalito.g:1190:4: (lv_Comutativa_0_0= 'Comutativa' )
                    {
                    // InternalPascalito.g:1190:4: (lv_Comutativa_0_0= 'Comutativa' )
                    // InternalPascalito.g:1191:5: lv_Comutativa_0_0= 'Comutativa'
                    {
                    lv_Comutativa_0_0=(Token)match(input,27,FOLLOW_29); 

                    					newLeafNode(lv_Comutativa_0_0, grammarAccess.getExpBinAccess().getComutativaComutativaKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpBinRule());
                    					}
                    					setWithLastConsumed(current, "Comutativa", true, "Comutativa");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getExpBinAccess().getExpBinKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getExpBinAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPascalito.g:1211:3: (otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascalito.g:1212:4: otherlv_3= 'Prioridade' ( (lv_Prioridade_4_0= ruleEBigDecimal ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpBinAccess().getPrioridadeKeyword_3_0());
                    			
                    // InternalPascalito.g:1216:4: ( (lv_Prioridade_4_0= ruleEBigDecimal ) )
                    // InternalPascalito.g:1217:5: (lv_Prioridade_4_0= ruleEBigDecimal )
                    {
                    // InternalPascalito.g:1217:5: (lv_Prioridade_4_0= ruleEBigDecimal )
                    // InternalPascalito.g:1218:6: lv_Prioridade_4_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getExpBinAccess().getPrioridadeEBigDecimalParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_Prioridade_4_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpBinRule());
                    						}
                    						set(
                    							current,
                    							"Prioridade",
                    							lv_Prioridade_4_0,
                    							"org.xtext.example.mydsl.Pascalito.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascalito.g:1236:3: (otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascalito.g:1237:4: otherlv_5= 'Operador' ( (lv_Operador_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpBinAccess().getOperadorKeyword_4_0());
                    			
                    // InternalPascalito.g:1241:4: ( (lv_Operador_6_0= ruleEString ) )
                    // InternalPascalito.g:1242:5: (lv_Operador_6_0= ruleEString )
                    {
                    // InternalPascalito.g:1242:5: (lv_Operador_6_0= ruleEString )
                    // InternalPascalito.g:1243:6: lv_Operador_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExpBinAccess().getOperadorEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_Operador_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpBinRule());
                    						}
                    						set(
                    							current,
                    							"Operador",
                    							lv_Operador_6_0,
                    							"org.xtext.example.mydsl.Pascalito.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getExpBinAccess().getOperandoDirKeyword_5());
            		
            // InternalPascalito.g:1265:3: ( (lv_operandoDir_8_0= ruleExpressao ) )
            // InternalPascalito.g:1266:4: (lv_operandoDir_8_0= ruleExpressao )
            {
            // InternalPascalito.g:1266:4: (lv_operandoDir_8_0= ruleExpressao )
            // InternalPascalito.g:1267:5: lv_operandoDir_8_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getExpBinAccess().getOperandoDirExpressaoParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
            lv_operandoDir_8_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpBinRule());
            					}
            					set(
            						current,
            						"operandoDir",
            						lv_operandoDir_8_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getExpBinAccess().getOperandoEsqKeyword_7());
            		
            // InternalPascalito.g:1288:3: ( (lv_operandoEsq_10_0= ruleExpressao ) )
            // InternalPascalito.g:1289:4: (lv_operandoEsq_10_0= ruleExpressao )
            {
            // InternalPascalito.g:1289:4: (lv_operandoEsq_10_0= ruleExpressao )
            // InternalPascalito.g:1290:5: lv_operandoEsq_10_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getExpBinAccess().getOperandoEsqExpressaoParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_operandoEsq_10_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpBinRule());
            					}
            					set(
            						current,
            						"operandoEsq",
            						lv_operandoEsq_10_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getExpBinAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleExpBin"


    // $ANTLR start "entryRuleExpNeg"
    // InternalPascalito.g:1315:1: entryRuleExpNeg returns [EObject current=null] : iv_ruleExpNeg= ruleExpNeg EOF ;
    public final EObject entryRuleExpNeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpNeg = null;


        try {
            // InternalPascalito.g:1315:47: (iv_ruleExpNeg= ruleExpNeg EOF )
            // InternalPascalito.g:1316:2: iv_ruleExpNeg= ruleExpNeg EOF
            {
             newCompositeNode(grammarAccess.getExpNegRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpNeg=ruleExpNeg();

            state._fsp--;

             current =iv_ruleExpNeg; 
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
    // $ANTLR end "entryRuleExpNeg"


    // $ANTLR start "ruleExpNeg"
    // InternalPascalito.g:1322:1: ruleExpNeg returns [EObject current=null] : (otherlv_0= 'ExpNeg' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? (otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) ) )? otherlv_6= 'nega' ( (lv_nega_7_0= ruleExpressao ) ) otherlv_8= '}' ) ;
    public final EObject ruleExpNeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_Prioridade_3_0 = null;

        AntlrDatatypeRuleToken lv_Operador_5_0 = null;

        EObject lv_nega_7_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1328:2: ( (otherlv_0= 'ExpNeg' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? (otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) ) )? otherlv_6= 'nega' ( (lv_nega_7_0= ruleExpressao ) ) otherlv_8= '}' ) )
            // InternalPascalito.g:1329:2: (otherlv_0= 'ExpNeg' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? (otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) ) )? otherlv_6= 'nega' ( (lv_nega_7_0= ruleExpressao ) ) otherlv_8= '}' )
            {
            // InternalPascalito.g:1329:2: (otherlv_0= 'ExpNeg' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? (otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) ) )? otherlv_6= 'nega' ( (lv_nega_7_0= ruleExpressao ) ) otherlv_8= '}' )
            // InternalPascalito.g:1330:3: otherlv_0= 'ExpNeg' otherlv_1= '{' (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )? (otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) ) )? otherlv_6= 'nega' ( (lv_nega_7_0= ruleExpressao ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExpNegAccess().getExpNegKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getExpNegAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPascalito.g:1338:3: (otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascalito.g:1339:4: otherlv_2= 'Prioridade' ( (lv_Prioridade_3_0= ruleEBigDecimal ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getExpNegAccess().getPrioridadeKeyword_2_0());
                    			
                    // InternalPascalito.g:1343:4: ( (lv_Prioridade_3_0= ruleEBigDecimal ) )
                    // InternalPascalito.g:1344:5: (lv_Prioridade_3_0= ruleEBigDecimal )
                    {
                    // InternalPascalito.g:1344:5: (lv_Prioridade_3_0= ruleEBigDecimal )
                    // InternalPascalito.g:1345:6: lv_Prioridade_3_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getExpNegAccess().getPrioridadeEBigDecimalParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_Prioridade_3_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpNegRule());
                    						}
                    						set(
                    							current,
                    							"Prioridade",
                    							lv_Prioridade_3_0,
                    							"org.xtext.example.mydsl.Pascalito.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPascalito.g:1363:3: (otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascalito.g:1364:4: otherlv_4= 'Operador' ( (lv_Operador_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpNegAccess().getOperadorKeyword_3_0());
                    			
                    // InternalPascalito.g:1368:4: ( (lv_Operador_5_0= ruleEString ) )
                    // InternalPascalito.g:1369:5: (lv_Operador_5_0= ruleEString )
                    {
                    // InternalPascalito.g:1369:5: (lv_Operador_5_0= ruleEString )
                    // InternalPascalito.g:1370:6: lv_Operador_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExpNegAccess().getOperadorEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_Operador_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpNegRule());
                    						}
                    						set(
                    							current,
                    							"Operador",
                    							lv_Operador_5_0,
                    							"org.xtext.example.mydsl.Pascalito.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,35,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getExpNegAccess().getNegaKeyword_4());
            		
            // InternalPascalito.g:1392:3: ( (lv_nega_7_0= ruleExpressao ) )
            // InternalPascalito.g:1393:4: (lv_nega_7_0= ruleExpressao )
            {
            // InternalPascalito.g:1393:4: (lv_nega_7_0= ruleExpressao )
            // InternalPascalito.g:1394:5: lv_nega_7_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getExpNegAccess().getNegaExpressaoParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_nega_7_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpNegRule());
            					}
            					set(
            						current,
            						"nega",
            						lv_nega_7_0,
            						"org.xtext.example.mydsl.Pascalito.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getExpNegAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleExpNeg"


    // $ANTLR start "entryRuleEInt"
    // InternalPascalito.g:1419:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPascalito.g:1419:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPascalito.g:1420:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPascalito.g:1426:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPascalito.g:1432:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPascalito.g:1433:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPascalito.g:1433:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPascalito.g:1434:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPascalito.g:1434:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascalito.g:1435:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002880020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001618200060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001618000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002802020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000160000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000860000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});

}