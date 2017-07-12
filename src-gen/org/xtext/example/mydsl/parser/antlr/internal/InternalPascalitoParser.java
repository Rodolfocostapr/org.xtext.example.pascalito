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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'{'", "'}'", "'var'", "','", "';'", "'procedure'", "'start'", "'end'", "'('", "')'", "'if'", "'else'", "'Loop'", "'.'", "'<'", "'>'", "'=<'", "'>='", "'=='", "'AND'", "'OR'", "'XOR'", "'-'", "'+'", "'*'", "'/'", "'->'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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
        	return "Program";
       	}

       	@Override
       	protected PascalitoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalPascalito.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalPascalito.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalPascalito.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalPascalito.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_block_3_0= ruleBlock ) ) otherlv_4= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_Ident_1_0 = null;

        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:77:2: ( (otherlv_0= 'program' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_block_3_0= ruleBlock ) ) otherlv_4= '}' ) )
            // InternalPascalito.g:78:2: (otherlv_0= 'program' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_block_3_0= ruleBlock ) ) otherlv_4= '}' )
            {
            // InternalPascalito.g:78:2: (otherlv_0= 'program' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_block_3_0= ruleBlock ) ) otherlv_4= '}' )
            // InternalPascalito.g:79:3: otherlv_0= 'program' ( (lv_Ident_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_block_3_0= ruleBlock ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalPascalito.g:83:3: ( (lv_Ident_1_0= ruleEString ) )
            // InternalPascalito.g:84:4: (lv_Ident_1_0= ruleEString )
            {
            // InternalPascalito.g:84:4: (lv_Ident_1_0= ruleEString )
            // InternalPascalito.g:85:5: lv_Ident_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getIdentEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_Ident_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
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

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPascalito.g:106:3: ( (lv_block_3_0= ruleBlock ) )
            // InternalPascalito.g:107:4: (lv_block_3_0= ruleBlock )
            {
            // InternalPascalito.g:107:4: (lv_block_3_0= ruleBlock )
            // InternalPascalito.g:108:5: lv_block_3_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_block_3_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_3_0,
            						"org.xtext.example.mydsl.Pascalito.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleCommand"
    // InternalPascalito.g:133:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalPascalito.g:133:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalPascalito.g:134:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalPascalito.g:140:1: ruleCommand returns [EObject current=null] : (this_CallProc_0= ruleCallProc | this_Atribuition_1= ruleAtribuition | this_If_2= ruleIf | this_Loop_3= ruleLoop ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_CallProc_0 = null;

        EObject this_Atribuition_1 = null;

        EObject this_If_2 = null;

        EObject this_Loop_3 = null;



        	enterRule();

        try {
            // InternalPascalito.g:146:2: ( (this_CallProc_0= ruleCallProc | this_Atribuition_1= ruleAtribuition | this_If_2= ruleIf | this_Loop_3= ruleLoop ) )
            // InternalPascalito.g:147:2: (this_CallProc_0= ruleCallProc | this_Atribuition_1= ruleAtribuition | this_If_2= ruleIf | this_Loop_3= ruleLoop )
            {
            // InternalPascalito.g:147:2: (this_CallProc_0= ruleCallProc | this_Atribuition_1= ruleAtribuition | this_If_2= ruleIf | this_Loop_3= ruleLoop )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==20) ) {
                    alt1=1;
                }
                else if ( (LA1_1==38) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case 24:
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
                    // InternalPascalito.g:148:3: this_CallProc_0= ruleCallProc
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCallProcParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallProc_0=ruleCallProc();

                    state._fsp--;


                    			current = this_CallProc_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:157:3: this_Atribuition_1= ruleAtribuition
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getAtribuitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atribuition_1=ruleAtribuition();

                    state._fsp--;


                    			current = this_Atribuition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPascalito.g:166:3: this_If_2= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getIfParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_2=ruleIf();

                    state._fsp--;


                    			current = this_If_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPascalito.g:175:3: this_Loop_3= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getLoopParserRuleCall_3());
                    		
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleExpression"
    // InternalPascalito.g:187:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPascalito.g:187:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPascalito.g:188:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalPascalito.g:194:1: ruleExpression returns [EObject current=null] : (this_ExpNeg_0= ruleExpNeg | this_ExpBinNv0_1= ruleExpBinNv0 ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpNeg_0 = null;

        EObject this_ExpBinNv0_1 = null;



        	enterRule();

        try {
            // InternalPascalito.g:200:2: ( (this_ExpNeg_0= ruleExpNeg | this_ExpBinNv0_1= ruleExpBinNv0 ) )
            // InternalPascalito.g:201:2: (this_ExpNeg_0= ruleExpNeg | this_ExpBinNv0_1= ruleExpBinNv0 )
            {
            // InternalPascalito.g:201:2: (this_ExpNeg_0= ruleExpNeg | this_ExpBinNv0_1= ruleExpBinNv0 )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==34) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascalito.g:202:3: this_ExpNeg_0= ruleExpNeg
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getExpNegParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpNeg_0=ruleExpNeg();

                    state._fsp--;


                    			current = this_ExpNeg_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:211:3: this_ExpBinNv0_1= ruleExpBinNv0
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getExpBinNv0ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpBinNv0_1=ruleExpBinNv0();

                    state._fsp--;


                    			current = this_ExpBinNv0_1;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEString"
    // InternalPascalito.g:223:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPascalito.g:223:47: (iv_ruleEString= ruleEString EOF )
            // InternalPascalito.g:224:2: iv_ruleEString= ruleEString EOF
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
    // InternalPascalito.g:230:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPascalito.g:236:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPascalito.g:237:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPascalito.g:237:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalPascalito.g:238:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:246:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleBlock"
    // InternalPascalito.g:257:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalPascalito.g:257:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalPascalito.g:258:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalPascalito.g:264:1: ruleBlock returns [EObject current=null] : ( () (otherlv_1= 'var' ( (lv_defVariable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_defVariable_4_0= ruleVariable ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedure' ( (lv_defprocedure_7_0= ruleProcedure ) ) )* otherlv_8= 'start' ( (lv_execute_9_0= ruleCommand ) )* otherlv_10= 'end' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_defVariable_2_0 = null;

        EObject lv_defVariable_4_0 = null;

        EObject lv_defprocedure_7_0 = null;

        EObject lv_execute_9_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:270:2: ( ( () (otherlv_1= 'var' ( (lv_defVariable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_defVariable_4_0= ruleVariable ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedure' ( (lv_defprocedure_7_0= ruleProcedure ) ) )* otherlv_8= 'start' ( (lv_execute_9_0= ruleCommand ) )* otherlv_10= 'end' ) )
            // InternalPascalito.g:271:2: ( () (otherlv_1= 'var' ( (lv_defVariable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_defVariable_4_0= ruleVariable ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedure' ( (lv_defprocedure_7_0= ruleProcedure ) ) )* otherlv_8= 'start' ( (lv_execute_9_0= ruleCommand ) )* otherlv_10= 'end' )
            {
            // InternalPascalito.g:271:2: ( () (otherlv_1= 'var' ( (lv_defVariable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_defVariable_4_0= ruleVariable ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedure' ( (lv_defprocedure_7_0= ruleProcedure ) ) )* otherlv_8= 'start' ( (lv_execute_9_0= ruleCommand ) )* otherlv_10= 'end' )
            // InternalPascalito.g:272:3: () (otherlv_1= 'var' ( (lv_defVariable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_defVariable_4_0= ruleVariable ) ) )* otherlv_5= ';' )* (otherlv_6= 'procedure' ( (lv_defprocedure_7_0= ruleProcedure ) ) )* otherlv_8= 'start' ( (lv_execute_9_0= ruleCommand ) )* otherlv_10= 'end'
            {
            // InternalPascalito.g:272:3: ()
            // InternalPascalito.g:273:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            // InternalPascalito.g:279:3: (otherlv_1= 'var' ( (lv_defVariable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_defVariable_4_0= ruleVariable ) ) )* otherlv_5= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPascalito.g:280:4: otherlv_1= 'var' ( (lv_defVariable_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_defVariable_4_0= ruleVariable ) ) )* otherlv_5= ';'
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getVarKeyword_1_0());
            	    			
            	    // InternalPascalito.g:284:4: ( (lv_defVariable_2_0= ruleVariable ) )
            	    // InternalPascalito.g:285:5: (lv_defVariable_2_0= ruleVariable )
            	    {
            	    // InternalPascalito.g:285:5: (lv_defVariable_2_0= ruleVariable )
            	    // InternalPascalito.g:286:6: lv_defVariable_2_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getDefVariableVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_defVariable_2_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defVariable",
            	    							lv_defVariable_2_0,
            	    							"org.xtext.example.mydsl.Pascalito.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPascalito.g:303:4: (otherlv_3= ',' ( (lv_defVariable_4_0= ruleVariable ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==15) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalPascalito.g:304:5: otherlv_3= ',' ( (lv_defVariable_4_0= ruleVariable ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,15,FOLLOW_7); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getCommaKeyword_1_2_0());
            	    	    				
            	    	    // InternalPascalito.g:308:5: ( (lv_defVariable_4_0= ruleVariable ) )
            	    	    // InternalPascalito.g:309:6: (lv_defVariable_4_0= ruleVariable )
            	    	    {
            	    	    // InternalPascalito.g:309:6: (lv_defVariable_4_0= ruleVariable )
            	    	    // InternalPascalito.g:310:7: lv_defVariable_4_0= ruleVariable
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getBlockAccess().getDefVariableVariableParserRuleCall_1_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_defVariable_4_0=ruleVariable();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"defVariable",
            	    	    								lv_defVariable_4_0,
            	    	    								"org.xtext.example.mydsl.Pascalito.Variable");
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

            	    				newLeafNode(otherlv_5, grammarAccess.getBlockAccess().getSemicolonKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalPascalito.g:333:3: (otherlv_6= 'procedure' ( (lv_defprocedure_7_0= ruleProcedure ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPascalito.g:334:4: otherlv_6= 'procedure' ( (lv_defprocedure_7_0= ruleProcedure ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_6, grammarAccess.getBlockAccess().getProcedureKeyword_2_0());
            	    			
            	    // InternalPascalito.g:338:4: ( (lv_defprocedure_7_0= ruleProcedure ) )
            	    // InternalPascalito.g:339:5: (lv_defprocedure_7_0= ruleProcedure )
            	    {
            	    // InternalPascalito.g:339:5: (lv_defprocedure_7_0= ruleProcedure )
            	    // InternalPascalito.g:340:6: lv_defprocedure_7_0= ruleProcedure
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getDefprocedureProcedureParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_defprocedure_7_0=ruleProcedure();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"defprocedure",
            	    							lv_defprocedure_7_0,
            	    							"org.xtext.example.mydsl.Pascalito.Procedure");
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

            			newLeafNode(otherlv_8, grammarAccess.getBlockAccess().getStartKeyword_3());
            		
            // InternalPascalito.g:362:3: ( (lv_execute_9_0= ruleCommand ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==22||LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascalito.g:363:4: (lv_execute_9_0= ruleCommand )
            	    {
            	    // InternalPascalito.g:363:4: (lv_execute_9_0= ruleCommand )
            	    // InternalPascalito.g:364:5: lv_execute_9_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getExecuteCommandParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_execute_9_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"execute",
            	    						lv_execute_9_0,
            	    						"org.xtext.example.mydsl.Pascalito.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBlockAccess().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleVariable"
    // InternalPascalito.g:389:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPascalito.g:389:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPascalito.g:390:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalPascalito.g:396:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalPascalito.g:402:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalPascalito.g:403:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalPascalito.g:403:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalPascalito.g:404:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalPascalito.g:404:3: ()
            // InternalPascalito.g:405:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalPascalito.g:411:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascalito.g:412:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascalito.g:412:4: (lv_name_1_0= RULE_ID )
            // InternalPascalito.g:413:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleProcedure"
    // InternalPascalito.g:433:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // InternalPascalito.g:433:50: (iv_ruleProcedure= ruleProcedure EOF )
            // InternalPascalito.g:434:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
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
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalPascalito.g:440:1: ruleProcedure returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleVariable ) ) )* )? otherlv_5= ')' ) otherlv_6= '{' ( (lv_block_7_0= ruleBlock ) ) otherlv_8= '}' ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_parameter_4_0 = null;

        EObject lv_block_7_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:446:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleVariable ) ) )* )? otherlv_5= ')' ) otherlv_6= '{' ( (lv_block_7_0= ruleBlock ) ) otherlv_8= '}' ) )
            // InternalPascalito.g:447:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleVariable ) ) )* )? otherlv_5= ')' ) otherlv_6= '{' ( (lv_block_7_0= ruleBlock ) ) otherlv_8= '}' )
            {
            // InternalPascalito.g:447:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleVariable ) ) )* )? otherlv_5= ')' ) otherlv_6= '{' ( (lv_block_7_0= ruleBlock ) ) otherlv_8= '}' )
            // InternalPascalito.g:448:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleVariable ) ) )* )? otherlv_5= ')' ) otherlv_6= '{' ( (lv_block_7_0= ruleBlock ) ) otherlv_8= '}'
            {
            // InternalPascalito.g:448:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleVariable ) ) )* )? otherlv_5= ')' )
            // InternalPascalito.g:449:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleVariable ) ) )* )? otherlv_5= ')'
            {
            // InternalPascalito.g:449:4: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascalito.g:450:5: (lv_name_0_0= RULE_ID )
            {
            // InternalPascalito.g:450:5: (lv_name_0_0= RULE_ID )
            // InternalPascalito.g:451:6: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            						newLeafNode(lv_name_0_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_0_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getProcedureRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_0_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            				newLeafNode(otherlv_1, grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_0_1());
            			
            // InternalPascalito.g:471:4: ( ( (lv_parameter_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleVariable ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascalito.g:472:5: ( (lv_parameter_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleVariable ) ) )*
                    {
                    // InternalPascalito.g:472:5: ( (lv_parameter_2_0= ruleVariable ) )
                    // InternalPascalito.g:473:6: (lv_parameter_2_0= ruleVariable )
                    {
                    // InternalPascalito.g:473:6: (lv_parameter_2_0= ruleVariable )
                    // InternalPascalito.g:474:7: lv_parameter_2_0= ruleVariable
                    {

                    							newCompositeNode(grammarAccess.getProcedureAccess().getParameterVariableParserRuleCall_0_2_0_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_parameter_2_0=ruleVariable();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getProcedureRule());
                    							}
                    							add(
                    								current,
                    								"parameter",
                    								lv_parameter_2_0,
                    								"org.xtext.example.mydsl.Pascalito.Variable");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalPascalito.g:491:5: (otherlv_3= ',' ( (lv_parameter_4_0= ruleVariable ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalPascalito.g:492:6: otherlv_3= ',' ( (lv_parameter_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_7); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getProcedureAccess().getCommaKeyword_0_2_1_0());
                    	    					
                    	    // InternalPascalito.g:496:6: ( (lv_parameter_4_0= ruleVariable ) )
                    	    // InternalPascalito.g:497:7: (lv_parameter_4_0= ruleVariable )
                    	    {
                    	    // InternalPascalito.g:497:7: (lv_parameter_4_0= ruleVariable )
                    	    // InternalPascalito.g:498:8: lv_parameter_4_0= ruleVariable
                    	    {

                    	    								newCompositeNode(grammarAccess.getProcedureAccess().getParameterVariableParserRuleCall_0_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameter_4_0=ruleVariable();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getProcedureRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"parameter",
                    	    									lv_parameter_4_0,
                    	    									"org.xtext.example.mydsl.Pascalito.Variable");
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

            				newLeafNode(otherlv_5, grammarAccess.getProcedureAccess().getRightParenthesisKeyword_0_3());
            			

            }

            otherlv_6=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalPascalito.g:526:3: ( (lv_block_7_0= ruleBlock ) )
            // InternalPascalito.g:527:4: (lv_block_7_0= ruleBlock )
            {
            // InternalPascalito.g:527:4: (lv_block_7_0= ruleBlock )
            // InternalPascalito.g:528:5: lv_block_7_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getProcedureAccess().getBlockBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_block_7_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_7_0,
            						"org.xtext.example.mydsl.Pascalito.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleCallProc"
    // InternalPascalito.g:553:1: entryRuleCallProc returns [EObject current=null] : iv_ruleCallProc= ruleCallProc EOF ;
    public final EObject entryRuleCallProc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallProc = null;


        try {
            // InternalPascalito.g:553:49: (iv_ruleCallProc= ruleCallProc EOF )
            // InternalPascalito.g:554:2: iv_ruleCallProc= ruleCallProc EOF
            {
             newCompositeNode(grammarAccess.getCallProcRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallProc=ruleCallProc();

            state._fsp--;

             current =iv_ruleCallProc; 
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
    // $ANTLR end "entryRuleCallProc"


    // $ANTLR start "ruleCallProc"
    // InternalPascalito.g:560:1: ruleCallProc returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) otherlv_6= ';' ) ;
    public final EObject ruleCallProc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_parameter_4_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:566:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) otherlv_6= ';' ) )
            // InternalPascalito.g:567:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) otherlv_6= ';' )
            {
            // InternalPascalito.g:567:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) otherlv_6= ';' )
            // InternalPascalito.g:568:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) otherlv_6= ';'
            {
            // InternalPascalito.g:568:3: ( (otherlv_0= RULE_ID ) )
            // InternalPascalito.g:569:4: (otherlv_0= RULE_ID )
            {
            // InternalPascalito.g:569:4: (otherlv_0= RULE_ID )
            // InternalPascalito.g:570:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallProcRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getCallProcAccess().getDefinedProcedureCrossReference_0_0());
            				

            }


            }

            // InternalPascalito.g:581:3: (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalPascalito.g:582:4: otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            				newLeafNode(otherlv_1, grammarAccess.getCallProcAccess().getLeftParenthesisKeyword_1_0());
            			
            // InternalPascalito.g:586:4: ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==20||LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPascalito.g:587:5: ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )*
                    {
                    // InternalPascalito.g:587:5: ( (lv_parameter_2_0= ruleExpression ) )
                    // InternalPascalito.g:588:6: (lv_parameter_2_0= ruleExpression )
                    {
                    // InternalPascalito.g:588:6: (lv_parameter_2_0= ruleExpression )
                    // InternalPascalito.g:589:7: lv_parameter_2_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getCallProcAccess().getParameterExpressionParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_parameter_2_0=ruleExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCallProcRule());
                    							}
                    							add(
                    								current,
                    								"parameter",
                    								lv_parameter_2_0,
                    								"org.xtext.example.mydsl.Pascalito.Expression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalPascalito.g:606:5: (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalPascalito.g:607:6: otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_15); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getCallProcAccess().getCommaKeyword_1_1_1_0());
                    	    					
                    	    // InternalPascalito.g:611:6: ( (lv_parameter_4_0= ruleExpression ) )
                    	    // InternalPascalito.g:612:7: (lv_parameter_4_0= ruleExpression )
                    	    {
                    	    // InternalPascalito.g:612:7: (lv_parameter_4_0= ruleExpression )
                    	    // InternalPascalito.g:613:8: lv_parameter_4_0= ruleExpression
                    	    {

                    	    								newCompositeNode(grammarAccess.getCallProcAccess().getParameterExpressionParserRuleCall_1_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameter_4_0=ruleExpression();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCallProcRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"parameter",
                    	    									lv_parameter_4_0,
                    	    									"org.xtext.example.mydsl.Pascalito.Expression");
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

            				newLeafNode(otherlv_5, grammarAccess.getCallProcAccess().getRightParenthesisKeyword_1_2());
            			

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCallProcAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleCallProc"


    // $ANTLR start "entryRuleAtribuition"
    // InternalPascalito.g:645:1: entryRuleAtribuition returns [EObject current=null] : iv_ruleAtribuition= ruleAtribuition EOF ;
    public final EObject entryRuleAtribuition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtribuition = null;


        try {
            // InternalPascalito.g:645:52: (iv_ruleAtribuition= ruleAtribuition EOF )
            // InternalPascalito.g:646:2: iv_ruleAtribuition= ruleAtribuition EOF
            {
             newCompositeNode(grammarAccess.getAtribuitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtribuition=ruleAtribuition();

            state._fsp--;

             current =iv_ruleAtribuition; 
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
    // $ANTLR end "entryRuleAtribuition"


    // $ANTLR start "ruleAtribuition"
    // InternalPascalito.g:652:1: ruleAtribuition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ruleOP_ASSIGNMENT ( (lv_atribuiResultado_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleAtribuition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_atribuiResultado_2_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:658:2: ( ( ( (otherlv_0= RULE_ID ) ) ruleOP_ASSIGNMENT ( (lv_atribuiResultado_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalPascalito.g:659:2: ( ( (otherlv_0= RULE_ID ) ) ruleOP_ASSIGNMENT ( (lv_atribuiResultado_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalPascalito.g:659:2: ( ( (otherlv_0= RULE_ID ) ) ruleOP_ASSIGNMENT ( (lv_atribuiResultado_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalPascalito.g:660:3: ( (otherlv_0= RULE_ID ) ) ruleOP_ASSIGNMENT ( (lv_atribuiResultado_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalPascalito.g:660:3: ( (otherlv_0= RULE_ID ) )
            // InternalPascalito.g:661:4: (otherlv_0= RULE_ID )
            {
            // InternalPascalito.g:661:4: (otherlv_0= RULE_ID )
            // InternalPascalito.g:662:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtribuitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getAtribuitionAccess().getSetsVariableCrossReference_0_0());
            				

            }


            }


            			newCompositeNode(grammarAccess.getAtribuitionAccess().getOP_ASSIGNMENTParserRuleCall_1());
            		
            pushFollow(FOLLOW_15);
            ruleOP_ASSIGNMENT();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalPascalito.g:680:3: ( (lv_atribuiResultado_2_0= ruleExpression ) )
            // InternalPascalito.g:681:4: (lv_atribuiResultado_2_0= ruleExpression )
            {
            // InternalPascalito.g:681:4: (lv_atribuiResultado_2_0= ruleExpression )
            // InternalPascalito.g:682:5: lv_atribuiResultado_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAtribuitionAccess().getAtribuiResultadoExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_atribuiResultado_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtribuitionRule());
            					}
            					set(
            						current,
            						"atribuiResultado",
            						lv_atribuiResultado_2_0,
            						"org.xtext.example.mydsl.Pascalito.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAtribuitionAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAtribuition"


    // $ANTLR start "entryRuleIf"
    // InternalPascalito.g:707:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalPascalito.g:707:43: (iv_ruleIf= ruleIf EOF )
            // InternalPascalito.g:708:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalPascalito.g:714:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifExp_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleCommand ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseCmd_9_0= ruleCommand ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_ifExp_2_0 = null;

        EObject lv_do_5_0 = null;

        EObject lv_elseCmd_9_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:720:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifExp_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleCommand ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseCmd_9_0= ruleCommand ) )* otherlv_10= '}' )? ) )
            // InternalPascalito.g:721:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifExp_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleCommand ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseCmd_9_0= ruleCommand ) )* otherlv_10= '}' )? )
            {
            // InternalPascalito.g:721:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifExp_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleCommand ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseCmd_9_0= ruleCommand ) )* otherlv_10= '}' )? )
            // InternalPascalito.g:722:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_ifExp_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleCommand ) )* otherlv_6= '}' (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseCmd_9_0= ruleCommand ) )* otherlv_10= '}' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascalito.g:730:3: ( (lv_ifExp_2_0= ruleExpression ) )
            // InternalPascalito.g:731:4: (lv_ifExp_2_0= ruleExpression )
            {
            // InternalPascalito.g:731:4: (lv_ifExp_2_0= ruleExpression )
            // InternalPascalito.g:732:5: lv_ifExp_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getIfExpExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_ifExp_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"ifExp",
            						lv_ifExp_2_0,
            						"org.xtext.example.mydsl.Pascalito.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalPascalito.g:757:3: ( (lv_do_5_0= ruleCommand ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==22||LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPascalito.g:758:4: (lv_do_5_0= ruleCommand )
            	    {
            	    // InternalPascalito.g:758:4: (lv_do_5_0= ruleCommand )
            	    // InternalPascalito.g:759:5: lv_do_5_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getDoCommandParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_do_5_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"do",
            	    						lv_do_5_0,
            	    						"org.xtext.example.mydsl.Pascalito.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalPascalito.g:780:3: (otherlv_7= 'else' otherlv_8= '{' ( (lv_elseCmd_9_0= ruleCommand ) )* otherlv_10= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPascalito.g:781:4: otherlv_7= 'else' otherlv_8= '{' ( (lv_elseCmd_9_0= ruleCommand ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getIfAccess().getElseKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalPascalito.g:789:4: ( (lv_elseCmd_9_0= ruleCommand ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||LA13_0==22||LA13_0==24) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPascalito.g:790:5: (lv_elseCmd_9_0= ruleCommand )
                    	    {
                    	    // InternalPascalito.g:790:5: (lv_elseCmd_9_0= ruleCommand )
                    	    // InternalPascalito.g:791:6: lv_elseCmd_9_0= ruleCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfAccess().getElseCmdCommandParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_elseCmd_9_0=ruleCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIfRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elseCmd",
                    	    							lv_elseCmd_9_0,
                    	    							"org.xtext.example.mydsl.Pascalito.Command");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleLoop"
    // InternalPascalito.g:817:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalPascalito.g:817:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalPascalito.g:818:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalPascalito.g:824:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' otherlv_1= '(' ( (lv_while_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleCommand ) )* otherlv_6= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_while_2_0 = null;

        EObject lv_do_5_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:830:2: ( (otherlv_0= 'Loop' otherlv_1= '(' ( (lv_while_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleCommand ) )* otherlv_6= '}' ) )
            // InternalPascalito.g:831:2: (otherlv_0= 'Loop' otherlv_1= '(' ( (lv_while_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleCommand ) )* otherlv_6= '}' )
            {
            // InternalPascalito.g:831:2: (otherlv_0= 'Loop' otherlv_1= '(' ( (lv_while_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleCommand ) )* otherlv_6= '}' )
            // InternalPascalito.g:832:3: otherlv_0= 'Loop' otherlv_1= '(' ( (lv_while_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_do_5_0= ruleCommand ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascalito.g:840:3: ( (lv_while_2_0= ruleExpression ) )
            // InternalPascalito.g:841:4: (lv_while_2_0= ruleExpression )
            {
            // InternalPascalito.g:841:4: (lv_while_2_0= ruleExpression )
            // InternalPascalito.g:842:5: lv_while_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getWhileExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_while_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					set(
            						current,
            						"while",
            						lv_while_2_0,
            						"org.xtext.example.mydsl.Pascalito.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalPascalito.g:867:3: ( (lv_do_5_0= ruleCommand ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==22||LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPascalito.g:868:4: (lv_do_5_0= ruleCommand )
            	    {
            	    // InternalPascalito.g:868:4: (lv_do_5_0= ruleCommand )
            	    // InternalPascalito.g:869:5: lv_do_5_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getLoopAccess().getDoCommandParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_do_5_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"do",
            	    						lv_do_5_0,
            	    						"org.xtext.example.mydsl.Pascalito.Command");
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


    // $ANTLR start "entryRuleCallProcExp"
    // InternalPascalito.g:894:1: entryRuleCallProcExp returns [EObject current=null] : iv_ruleCallProcExp= ruleCallProcExp EOF ;
    public final EObject entryRuleCallProcExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallProcExp = null;


        try {
            // InternalPascalito.g:894:52: (iv_ruleCallProcExp= ruleCallProcExp EOF )
            // InternalPascalito.g:895:2: iv_ruleCallProcExp= ruleCallProcExp EOF
            {
             newCompositeNode(grammarAccess.getCallProcExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallProcExp=ruleCallProcExp();

            state._fsp--;

             current =iv_ruleCallProcExp; 
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
    // $ANTLR end "entryRuleCallProcExp"


    // $ANTLR start "ruleCallProcExp"
    // InternalPascalito.g:901:1: ruleCallProcExp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ) ;
    public final EObject ruleCallProcExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameter_2_0 = null;

        EObject lv_parameter_4_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:907:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ) )
            // InternalPascalito.g:908:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            {
            // InternalPascalito.g:908:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalPascalito.g:909:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalPascalito.g:909:3: ( (otherlv_0= RULE_ID ) )
            // InternalPascalito.g:910:4: (otherlv_0= RULE_ID )
            {
            // InternalPascalito.g:910:4: (otherlv_0= RULE_ID )
            // InternalPascalito.g:911:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallProcExpRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getCallProcExpAccess().getRepresentProcedureCrossReference_0_0());
            				

            }


            }

            // InternalPascalito.g:922:3: (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalPascalito.g:923:4: otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            				newLeafNode(otherlv_1, grammarAccess.getCallProcExpAccess().getLeftParenthesisKeyword_1_0());
            			
            // InternalPascalito.g:927:4: ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==20||LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascalito.g:928:5: ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )*
                    {
                    // InternalPascalito.g:928:5: ( (lv_parameter_2_0= ruleExpression ) )
                    // InternalPascalito.g:929:6: (lv_parameter_2_0= ruleExpression )
                    {
                    // InternalPascalito.g:929:6: (lv_parameter_2_0= ruleExpression )
                    // InternalPascalito.g:930:7: lv_parameter_2_0= ruleExpression
                    {

                    							newCompositeNode(grammarAccess.getCallProcExpAccess().getParameterExpressionParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_13);
                    lv_parameter_2_0=ruleExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCallProcExpRule());
                    							}
                    							add(
                    								current,
                    								"parameter",
                    								lv_parameter_2_0,
                    								"org.xtext.example.mydsl.Pascalito.Expression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalPascalito.g:947:5: (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalPascalito.g:948:6: otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_15); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getCallProcExpAccess().getCommaKeyword_1_1_1_0());
                    	    					
                    	    // InternalPascalito.g:952:6: ( (lv_parameter_4_0= ruleExpression ) )
                    	    // InternalPascalito.g:953:7: (lv_parameter_4_0= ruleExpression )
                    	    {
                    	    // InternalPascalito.g:953:7: (lv_parameter_4_0= ruleExpression )
                    	    // InternalPascalito.g:954:8: lv_parameter_4_0= ruleExpression
                    	    {

                    	    								newCompositeNode(grammarAccess.getCallProcExpAccess().getParameterExpressionParserRuleCall_1_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameter_4_0=ruleExpression();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCallProcExpRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"parameter",
                    	    									lv_parameter_4_0,
                    	    									"org.xtext.example.mydsl.Pascalito.Expression");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            				newLeafNode(otherlv_5, grammarAccess.getCallProcExpAccess().getRightParenthesisKeyword_1_2());
            			

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
    // $ANTLR end "ruleCallProcExp"


    // $ANTLR start "entryRuleCallVariable"
    // InternalPascalito.g:982:1: entryRuleCallVariable returns [EObject current=null] : iv_ruleCallVariable= ruleCallVariable EOF ;
    public final EObject entryRuleCallVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallVariable = null;


        try {
            // InternalPascalito.g:982:53: (iv_ruleCallVariable= ruleCallVariable EOF )
            // InternalPascalito.g:983:2: iv_ruleCallVariable= ruleCallVariable EOF
            {
             newCompositeNode(grammarAccess.getCallVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallVariable=ruleCallVariable();

            state._fsp--;

             current =iv_ruleCallVariable; 
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
    // $ANTLR end "entryRuleCallVariable"


    // $ANTLR start "ruleCallVariable"
    // InternalPascalito.g:989:1: ruleCallVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleCallVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalPascalito.g:995:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalPascalito.g:996:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalPascalito.g:996:2: ( (otherlv_0= RULE_ID ) )
            // InternalPascalito.g:997:3: (otherlv_0= RULE_ID )
            {
            // InternalPascalito.g:997:3: (otherlv_0= RULE_ID )
            // InternalPascalito.g:998:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCallVariableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getCallVariableAccess().getRepresentVariableCrossReference_0());
            			

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
    // $ANTLR end "ruleCallVariable"


    // $ANTLR start "entryRuleExpBinNv0"
    // InternalPascalito.g:1012:1: entryRuleExpBinNv0 returns [EObject current=null] : iv_ruleExpBinNv0= ruleExpBinNv0 EOF ;
    public final EObject entryRuleExpBinNv0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpBinNv0 = null;


        try {
            // InternalPascalito.g:1012:50: (iv_ruleExpBinNv0= ruleExpBinNv0 EOF )
            // InternalPascalito.g:1013:2: iv_ruleExpBinNv0= ruleExpBinNv0 EOF
            {
             newCompositeNode(grammarAccess.getExpBinNv0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpBinNv0=ruleExpBinNv0();

            state._fsp--;

             current =iv_ruleExpBinNv0; 
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
    // $ANTLR end "entryRuleExpBinNv0"


    // $ANTLR start "ruleExpBinNv0"
    // InternalPascalito.g:1019:1: ruleExpBinNv0 returns [EObject current=null] : (this_ExpBinNv1_0= ruleExpBinNv1 ( () ruleOP_ARIT_PRIO_0 ( (lv_right_3_0= ruleExpBinNv1 ) ) )* ) ;
    public final EObject ruleExpBinNv0() throws RecognitionException {
        EObject current = null;

        EObject this_ExpBinNv1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1025:2: ( (this_ExpBinNv1_0= ruleExpBinNv1 ( () ruleOP_ARIT_PRIO_0 ( (lv_right_3_0= ruleExpBinNv1 ) ) )* ) )
            // InternalPascalito.g:1026:2: (this_ExpBinNv1_0= ruleExpBinNv1 ( () ruleOP_ARIT_PRIO_0 ( (lv_right_3_0= ruleExpBinNv1 ) ) )* )
            {
            // InternalPascalito.g:1026:2: (this_ExpBinNv1_0= ruleExpBinNv1 ( () ruleOP_ARIT_PRIO_0 ( (lv_right_3_0= ruleExpBinNv1 ) ) )* )
            // InternalPascalito.g:1027:3: this_ExpBinNv1_0= ruleExpBinNv1 ( () ruleOP_ARIT_PRIO_0 ( (lv_right_3_0= ruleExpBinNv1 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpBinNv0Access().getExpBinNv1ParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_ExpBinNv1_0=ruleExpBinNv1();

            state._fsp--;


            			current = this_ExpBinNv1_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPascalito.g:1035:3: ( () ruleOP_ARIT_PRIO_0 ( (lv_right_3_0= ruleExpBinNv1 ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=34 && LA18_0<=35)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPascalito.g:1036:4: () ruleOP_ARIT_PRIO_0 ( (lv_right_3_0= ruleExpBinNv1 ) )
            	    {
            	    // InternalPascalito.g:1036:4: ()
            	    // InternalPascalito.g:1037:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpBinNv0Access().getExpBinNv0LeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getExpBinNv0Access().getOP_ARIT_PRIO_0ParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_15);
            	    ruleOP_ARIT_PRIO_0();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalPascalito.g:1050:4: ( (lv_right_3_0= ruleExpBinNv1 ) )
            	    // InternalPascalito.g:1051:5: (lv_right_3_0= ruleExpBinNv1 )
            	    {
            	    // InternalPascalito.g:1051:5: (lv_right_3_0= ruleExpBinNv1 )
            	    // InternalPascalito.g:1052:6: lv_right_3_0= ruleExpBinNv1
            	    {

            	    						newCompositeNode(grammarAccess.getExpBinNv0Access().getRightExpBinNv1ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleExpBinNv1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpBinNv0Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Pascalito.ExpBinNv1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "ruleExpBinNv0"


    // $ANTLR start "entryRuleExpBinNv1"
    // InternalPascalito.g:1074:1: entryRuleExpBinNv1 returns [EObject current=null] : iv_ruleExpBinNv1= ruleExpBinNv1 EOF ;
    public final EObject entryRuleExpBinNv1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpBinNv1 = null;


        try {
            // InternalPascalito.g:1074:50: (iv_ruleExpBinNv1= ruleExpBinNv1 EOF )
            // InternalPascalito.g:1075:2: iv_ruleExpBinNv1= ruleExpBinNv1 EOF
            {
             newCompositeNode(grammarAccess.getExpBinNv1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpBinNv1=ruleExpBinNv1();

            state._fsp--;

             current =iv_ruleExpBinNv1; 
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
    // $ANTLR end "entryRuleExpBinNv1"


    // $ANTLR start "ruleExpBinNv1"
    // InternalPascalito.g:1081:1: ruleExpBinNv1 returns [EObject current=null] : (this_ExpBinLogical_0= ruleExpBinLogical ( () ruleOP_ARIT_PRIO_1 ( (lv_right_3_0= ruleExpBinLogical ) ) )* ) ;
    public final EObject ruleExpBinNv1() throws RecognitionException {
        EObject current = null;

        EObject this_ExpBinLogical_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1087:2: ( (this_ExpBinLogical_0= ruleExpBinLogical ( () ruleOP_ARIT_PRIO_1 ( (lv_right_3_0= ruleExpBinLogical ) ) )* ) )
            // InternalPascalito.g:1088:2: (this_ExpBinLogical_0= ruleExpBinLogical ( () ruleOP_ARIT_PRIO_1 ( (lv_right_3_0= ruleExpBinLogical ) ) )* )
            {
            // InternalPascalito.g:1088:2: (this_ExpBinLogical_0= ruleExpBinLogical ( () ruleOP_ARIT_PRIO_1 ( (lv_right_3_0= ruleExpBinLogical ) ) )* )
            // InternalPascalito.g:1089:3: this_ExpBinLogical_0= ruleExpBinLogical ( () ruleOP_ARIT_PRIO_1 ( (lv_right_3_0= ruleExpBinLogical ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpBinNv1Access().getExpBinLogicalParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_ExpBinLogical_0=ruleExpBinLogical();

            state._fsp--;


            			current = this_ExpBinLogical_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPascalito.g:1097:3: ( () ruleOP_ARIT_PRIO_1 ( (lv_right_3_0= ruleExpBinLogical ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=36 && LA19_0<=37)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPascalito.g:1098:4: () ruleOP_ARIT_PRIO_1 ( (lv_right_3_0= ruleExpBinLogical ) )
            	    {
            	    // InternalPascalito.g:1098:4: ()
            	    // InternalPascalito.g:1099:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpBinNv1Access().getExpBinNv1LeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getExpBinNv1Access().getOP_ARIT_PRIO_1ParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_15);
            	    ruleOP_ARIT_PRIO_1();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalPascalito.g:1112:4: ( (lv_right_3_0= ruleExpBinLogical ) )
            	    // InternalPascalito.g:1113:5: (lv_right_3_0= ruleExpBinLogical )
            	    {
            	    // InternalPascalito.g:1113:5: (lv_right_3_0= ruleExpBinLogical )
            	    // InternalPascalito.g:1114:6: lv_right_3_0= ruleExpBinLogical
            	    {

            	    						newCompositeNode(grammarAccess.getExpBinNv1Access().getRightExpBinLogicalParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleExpBinLogical();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpBinNv1Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Pascalito.ExpBinLogical");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "ruleExpBinNv1"


    // $ANTLR start "entryRuleExpBinLogical"
    // InternalPascalito.g:1136:1: entryRuleExpBinLogical returns [EObject current=null] : iv_ruleExpBinLogical= ruleExpBinLogical EOF ;
    public final EObject entryRuleExpBinLogical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpBinLogical = null;


        try {
            // InternalPascalito.g:1136:54: (iv_ruleExpBinLogical= ruleExpBinLogical EOF )
            // InternalPascalito.g:1137:2: iv_ruleExpBinLogical= ruleExpBinLogical EOF
            {
             newCompositeNode(grammarAccess.getExpBinLogicalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpBinLogical=ruleExpBinLogical();

            state._fsp--;

             current =iv_ruleExpBinLogical; 
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
    // $ANTLR end "entryRuleExpBinLogical"


    // $ANTLR start "ruleExpBinLogical"
    // InternalPascalito.g:1143:1: ruleExpBinLogical returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ruleOP_COMPARISON ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleExpBinLogical() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1149:2: ( (this_Primary_0= rulePrimary ( () ruleOP_COMPARISON ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalPascalito.g:1150:2: (this_Primary_0= rulePrimary ( () ruleOP_COMPARISON ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalPascalito.g:1150:2: (this_Primary_0= rulePrimary ( () ruleOP_COMPARISON ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalPascalito.g:1151:3: this_Primary_0= rulePrimary ( () ruleOP_COMPARISON ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpBinLogicalAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPascalito.g:1159:3: ( () ruleOP_COMPARISON ( (lv_right_3_0= rulePrimary ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=26 && LA20_0<=33)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPascalito.g:1160:4: () ruleOP_COMPARISON ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalPascalito.g:1160:4: ()
            	    // InternalPascalito.g:1161:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpBinLogicalAccess().getExpBinLogicalLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getExpBinLogicalAccess().getOP_COMPARISONParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_15);
            	    ruleOP_COMPARISON();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalPascalito.g:1174:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalPascalito.g:1175:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalPascalito.g:1175:5: (lv_right_3_0= rulePrimary )
            	    // InternalPascalito.g:1176:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getExpBinLogicalAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpBinLogicalRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Pascalito.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "ruleExpBinLogical"


    // $ANTLR start "entryRulePrimary"
    // InternalPascalito.g:1198:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalPascalito.g:1198:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalPascalito.g:1199:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalPascalito.g:1205:1: rulePrimary returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_CallProcExp_1= ruleCallProcExp | this_CallVariable_2= ruleCallVariable | (otherlv_3= '(' this_ExpBinNv0_4= ruleExpBinNv0 otherlv_5= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_NumberLiteral_0 = null;

        EObject this_CallProcExp_1 = null;

        EObject this_CallVariable_2 = null;

        EObject this_ExpBinNv0_4 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1211:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_CallProcExp_1= ruleCallProcExp | this_CallVariable_2= ruleCallVariable | (otherlv_3= '(' this_ExpBinNv0_4= ruleExpBinNv0 otherlv_5= ')' ) ) )
            // InternalPascalito.g:1212:2: (this_NumberLiteral_0= ruleNumberLiteral | this_CallProcExp_1= ruleCallProcExp | this_CallVariable_2= ruleCallVariable | (otherlv_3= '(' this_ExpBinNv0_4= ruleExpBinNv0 otherlv_5= ')' ) )
            {
            // InternalPascalito.g:1212:2: (this_NumberLiteral_0= ruleNumberLiteral | this_CallProcExp_1= ruleCallProcExp | this_CallVariable_2= ruleCallVariable | (otherlv_3= '(' this_ExpBinNv0_4= ruleExpBinNv0 otherlv_5= ')' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt21=1;
                }
                break;
            case RULE_ID:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==20) ) {
                    alt21=2;
                }
                else if ( (LA21_2==EOF||(LA21_2>=15 && LA21_2<=16)||LA21_2==21||(LA21_2>=26 && LA21_2<=37)) ) {
                    alt21=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalPascalito.g:1213:3: this_NumberLiteral_0= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:1222:3: this_CallProcExp_1= ruleCallProcExp
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getCallProcExpParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallProcExp_1=ruleCallProcExp();

                    state._fsp--;


                    			current = this_CallProcExp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPascalito.g:1231:3: this_CallVariable_2= ruleCallVariable
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getCallVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallVariable_2=ruleCallVariable();

                    state._fsp--;


                    			current = this_CallVariable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPascalito.g:1240:3: (otherlv_3= '(' this_ExpBinNv0_4= ruleExpBinNv0 otherlv_5= ')' )
                    {
                    // InternalPascalito.g:1240:3: (otherlv_3= '(' this_ExpBinNv0_4= ruleExpBinNv0 otherlv_5= ')' )
                    // InternalPascalito.g:1241:4: otherlv_3= '(' this_ExpBinNv0_4= ruleExpBinNv0 otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpBinNv0ParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_ExpBinNv0_4=ruleExpBinNv0();

                    state._fsp--;


                    				current = this_ExpBinNv0_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalPascalito.g:1262:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalPascalito.g:1262:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalPascalito.g:1263:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalPascalito.g:1269:1: ruleNumberLiteral returns [EObject current=null] : ( () ruleEBigDecimal ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalPascalito.g:1275:2: ( ( () ruleEBigDecimal ) )
            // InternalPascalito.g:1276:2: ( () ruleEBigDecimal )
            {
            // InternalPascalito.g:1276:2: ( () ruleEBigDecimal )
            // InternalPascalito.g:1277:3: () ruleEBigDecimal
            {
            // InternalPascalito.g:1277:3: ()
            // InternalPascalito.g:1278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getNumberLiteralAccess().getEBigDecimalParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            ruleEBigDecimal();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleEBigDecimal"
    // InternalPascalito.g:1295:1: entryRuleEBigDecimal returns [String current=null] : iv_ruleEBigDecimal= ruleEBigDecimal EOF ;
    public final String entryRuleEBigDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigDecimal = null;


        try {
            // InternalPascalito.g:1295:51: (iv_ruleEBigDecimal= ruleEBigDecimal EOF )
            // InternalPascalito.g:1296:2: iv_ruleEBigDecimal= ruleEBigDecimal EOF
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
    // InternalPascalito.g:1302:1: ruleEBigDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleEBigDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalPascalito.g:1308:2: ( (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ) )
            // InternalPascalito.g:1309:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            {
            // InternalPascalito.g:1309:2: (this_INT_0= RULE_INT | (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||(LA22_1>=15 && LA22_1<=16)||LA22_1==21||(LA22_1>=26 && LA22_1<=37)) ) {
                    alt22=1;
                }
                else if ( (LA22_1==25) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascalito.g:1310:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:1318:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    {
                    // InternalPascalito.g:1318:3: (this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
                    // InternalPascalito.g:1319:4: this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,25,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1_1());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_1_2());
                    			

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
    // $ANTLR end "ruleEBigDecimal"


    // $ANTLR start "entryRuleExpNeg"
    // InternalPascalito.g:1343:1: entryRuleExpNeg returns [EObject current=null] : iv_ruleExpNeg= ruleExpNeg EOF ;
    public final EObject entryRuleExpNeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpNeg = null;


        try {
            // InternalPascalito.g:1343:47: (iv_ruleExpNeg= ruleExpNeg EOF )
            // InternalPascalito.g:1344:2: iv_ruleExpNeg= ruleExpNeg EOF
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
    // InternalPascalito.g:1350:1: ruleExpNeg returns [EObject current=null] : ( ruleOP_NEGATE ( (lv_negate_1_0= ruleExpression ) ) ) ;
    public final EObject ruleExpNeg() throws RecognitionException {
        EObject current = null;

        EObject lv_negate_1_0 = null;



        	enterRule();

        try {
            // InternalPascalito.g:1356:2: ( ( ruleOP_NEGATE ( (lv_negate_1_0= ruleExpression ) ) ) )
            // InternalPascalito.g:1357:2: ( ruleOP_NEGATE ( (lv_negate_1_0= ruleExpression ) ) )
            {
            // InternalPascalito.g:1357:2: ( ruleOP_NEGATE ( (lv_negate_1_0= ruleExpression ) ) )
            // InternalPascalito.g:1358:3: ruleOP_NEGATE ( (lv_negate_1_0= ruleExpression ) )
            {

            			newCompositeNode(grammarAccess.getExpNegAccess().getOP_NEGATEParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            ruleOP_NEGATE();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalPascalito.g:1365:3: ( (lv_negate_1_0= ruleExpression ) )
            // InternalPascalito.g:1366:4: (lv_negate_1_0= ruleExpression )
            {
            // InternalPascalito.g:1366:4: (lv_negate_1_0= ruleExpression )
            // InternalPascalito.g:1367:5: lv_negate_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpNegAccess().getNegateExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_negate_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpNegRule());
            					}
            					set(
            						current,
            						"negate",
            						lv_negate_1_0,
            						"org.xtext.example.mydsl.Pascalito.Expression");
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
    // $ANTLR end "ruleExpNeg"


    // $ANTLR start "entryRuleOP_COMPARISON"
    // InternalPascalito.g:1388:1: entryRuleOP_COMPARISON returns [String current=null] : iv_ruleOP_COMPARISON= ruleOP_COMPARISON EOF ;
    public final String entryRuleOP_COMPARISON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOP_COMPARISON = null;


        try {
            // InternalPascalito.g:1388:53: (iv_ruleOP_COMPARISON= ruleOP_COMPARISON EOF )
            // InternalPascalito.g:1389:2: iv_ruleOP_COMPARISON= ruleOP_COMPARISON EOF
            {
             newCompositeNode(grammarAccess.getOP_COMPARISONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOP_COMPARISON=ruleOP_COMPARISON();

            state._fsp--;

             current =iv_ruleOP_COMPARISON.getText(); 
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
    // $ANTLR end "entryRuleOP_COMPARISON"


    // $ANTLR start "ruleOP_COMPARISON"
    // InternalPascalito.g:1395:1: ruleOP_COMPARISON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '=<' | kw= '>=' | kw= '==' | kw= 'AND' | kw= 'OR' | kw= 'XOR' ) ;
    public final AntlrDatatypeRuleToken ruleOP_COMPARISON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascalito.g:1401:2: ( (kw= '<' | kw= '>' | kw= '=<' | kw= '>=' | kw= '==' | kw= 'AND' | kw= 'OR' | kw= 'XOR' ) )
            // InternalPascalito.g:1402:2: (kw= '<' | kw= '>' | kw= '=<' | kw= '>=' | kw= '==' | kw= 'AND' | kw= 'OR' | kw= 'XOR' )
            {
            // InternalPascalito.g:1402:2: (kw= '<' | kw= '>' | kw= '=<' | kw= '>=' | kw= '==' | kw= 'AND' | kw= 'OR' | kw= 'XOR' )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt23=1;
                }
                break;
            case 27:
                {
                alt23=2;
                }
                break;
            case 28:
                {
                alt23=3;
                }
                break;
            case 29:
                {
                alt23=4;
                }
                break;
            case 30:
                {
                alt23=5;
                }
                break;
            case 31:
                {
                alt23=6;
                }
                break;
            case 32:
                {
                alt23=7;
                }
                break;
            case 33:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalPascalito.g:1403:3: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_COMPARISONAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:1409:3: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_COMPARISONAccess().getGreaterThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPascalito.g:1415:3: kw= '=<'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_COMPARISONAccess().getEqualsSignLessThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPascalito.g:1421:3: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_COMPARISONAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPascalito.g:1427:3: kw= '=='
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_COMPARISONAccess().getEqualsSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPascalito.g:1433:3: kw= 'AND'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_COMPARISONAccess().getANDKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPascalito.g:1439:3: kw= 'OR'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_COMPARISONAccess().getORKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalPascalito.g:1445:3: kw= 'XOR'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_COMPARISONAccess().getXORKeyword_7());
                    		

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
    // $ANTLR end "ruleOP_COMPARISON"


    // $ANTLR start "entryRuleOP_ARIT_PRIO_0"
    // InternalPascalito.g:1454:1: entryRuleOP_ARIT_PRIO_0 returns [String current=null] : iv_ruleOP_ARIT_PRIO_0= ruleOP_ARIT_PRIO_0 EOF ;
    public final String entryRuleOP_ARIT_PRIO_0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOP_ARIT_PRIO_0 = null;


        try {
            // InternalPascalito.g:1454:54: (iv_ruleOP_ARIT_PRIO_0= ruleOP_ARIT_PRIO_0 EOF )
            // InternalPascalito.g:1455:2: iv_ruleOP_ARIT_PRIO_0= ruleOP_ARIT_PRIO_0 EOF
            {
             newCompositeNode(grammarAccess.getOP_ARIT_PRIO_0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOP_ARIT_PRIO_0=ruleOP_ARIT_PRIO_0();

            state._fsp--;

             current =iv_ruleOP_ARIT_PRIO_0.getText(); 
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
    // $ANTLR end "entryRuleOP_ARIT_PRIO_0"


    // $ANTLR start "ruleOP_ARIT_PRIO_0"
    // InternalPascalito.g:1461:1: ruleOP_ARIT_PRIO_0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOP_ARIT_PRIO_0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascalito.g:1467:2: ( (kw= '-' | kw= '+' ) )
            // InternalPascalito.g:1468:2: (kw= '-' | kw= '+' )
            {
            // InternalPascalito.g:1468:2: (kw= '-' | kw= '+' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            else if ( (LA24_0==35) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascalito.g:1469:3: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_ARIT_PRIO_0Access().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:1475:3: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_ARIT_PRIO_0Access().getPlusSignKeyword_1());
                    		

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
    // $ANTLR end "ruleOP_ARIT_PRIO_0"


    // $ANTLR start "entryRuleOP_ARIT_PRIO_1"
    // InternalPascalito.g:1484:1: entryRuleOP_ARIT_PRIO_1 returns [String current=null] : iv_ruleOP_ARIT_PRIO_1= ruleOP_ARIT_PRIO_1 EOF ;
    public final String entryRuleOP_ARIT_PRIO_1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOP_ARIT_PRIO_1 = null;


        try {
            // InternalPascalito.g:1484:54: (iv_ruleOP_ARIT_PRIO_1= ruleOP_ARIT_PRIO_1 EOF )
            // InternalPascalito.g:1485:2: iv_ruleOP_ARIT_PRIO_1= ruleOP_ARIT_PRIO_1 EOF
            {
             newCompositeNode(grammarAccess.getOP_ARIT_PRIO_1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOP_ARIT_PRIO_1=ruleOP_ARIT_PRIO_1();

            state._fsp--;

             current =iv_ruleOP_ARIT_PRIO_1.getText(); 
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
    // $ANTLR end "entryRuleOP_ARIT_PRIO_1"


    // $ANTLR start "ruleOP_ARIT_PRIO_1"
    // InternalPascalito.g:1491:1: ruleOP_ARIT_PRIO_1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOP_ARIT_PRIO_1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascalito.g:1497:2: ( (kw= '*' | kw= '/' ) )
            // InternalPascalito.g:1498:2: (kw= '*' | kw= '/' )
            {
            // InternalPascalito.g:1498:2: (kw= '*' | kw= '/' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            else if ( (LA25_0==37) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascalito.g:1499:3: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_ARIT_PRIO_1Access().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPascalito.g:1505:3: kw= '/'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP_ARIT_PRIO_1Access().getSolidusKeyword_1());
                    		

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
    // $ANTLR end "ruleOP_ARIT_PRIO_1"


    // $ANTLR start "entryRuleOP_ASSIGNMENT"
    // InternalPascalito.g:1514:1: entryRuleOP_ASSIGNMENT returns [String current=null] : iv_ruleOP_ASSIGNMENT= ruleOP_ASSIGNMENT EOF ;
    public final String entryRuleOP_ASSIGNMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOP_ASSIGNMENT = null;


        try {
            // InternalPascalito.g:1514:53: (iv_ruleOP_ASSIGNMENT= ruleOP_ASSIGNMENT EOF )
            // InternalPascalito.g:1515:2: iv_ruleOP_ASSIGNMENT= ruleOP_ASSIGNMENT EOF
            {
             newCompositeNode(grammarAccess.getOP_ASSIGNMENTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOP_ASSIGNMENT=ruleOP_ASSIGNMENT();

            state._fsp--;

             current =iv_ruleOP_ASSIGNMENT.getText(); 
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
    // $ANTLR end "entryRuleOP_ASSIGNMENT"


    // $ANTLR start "ruleOP_ASSIGNMENT"
    // InternalPascalito.g:1521:1: ruleOP_ASSIGNMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '->' ;
    public final AntlrDatatypeRuleToken ruleOP_ASSIGNMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascalito.g:1527:2: (kw= '->' )
            // InternalPascalito.g:1528:2: kw= '->'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getOP_ASSIGNMENTAccess().getHyphenMinusGreaterThanSignKeyword());
            	

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
    // $ANTLR end "ruleOP_ASSIGNMENT"


    // $ANTLR start "entryRuleOP_NEGATE"
    // InternalPascalito.g:1536:1: entryRuleOP_NEGATE returns [String current=null] : iv_ruleOP_NEGATE= ruleOP_NEGATE EOF ;
    public final String entryRuleOP_NEGATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOP_NEGATE = null;


        try {
            // InternalPascalito.g:1536:49: (iv_ruleOP_NEGATE= ruleOP_NEGATE EOF )
            // InternalPascalito.g:1537:2: iv_ruleOP_NEGATE= ruleOP_NEGATE EOF
            {
             newCompositeNode(grammarAccess.getOP_NEGATERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOP_NEGATE=ruleOP_NEGATE();

            state._fsp--;

             current =iv_ruleOP_NEGATE.getText(); 
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
    // $ANTLR end "entryRuleOP_NEGATE"


    // $ANTLR start "ruleOP_NEGATE"
    // InternalPascalito.g:1543:1: ruleOP_NEGATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleOP_NEGATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPascalito.g:1549:2: (kw= '-' )
            // InternalPascalito.g:1550:2: kw= '-'
            {
            kw=(Token)match(input,34,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getOP_NEGATEAccess().getHyphenMinusKeyword());
            	

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
    // $ANTLR end "ruleOP_NEGATE"

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001480020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400300060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400100060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001402020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000003FC000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});

}