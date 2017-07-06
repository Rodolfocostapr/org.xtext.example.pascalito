/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.PascalitoGrammarAccess;
import pascalito.Atribuicao;
import pascalito.Bloco;
import pascalito.CallProcedimento;
import pascalito.CallVariavel;
import pascalito.Desvio;
import pascalito.ExpBin;
import pascalito.ExpBinLogica;
import pascalito.ExpNeg;
import pascalito.Loop;
import pascalito.PascalitoPackage;
import pascalito.Procedimento;
import pascalito.Programa;
import pascalito.Variavel;

@SuppressWarnings("all")
public class PascalitoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PascalitoGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PascalitoPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PascalitoPackage.ATRIBUICAO:
				sequence_Atribuicao(context, (Atribuicao) semanticObject); 
				return; 
			case PascalitoPackage.BLOCO:
				sequence_Bloco(context, (Bloco) semanticObject); 
				return; 
			case PascalitoPackage.CALL_PROCEDIMENTO:
				sequence_CallProcedimento(context, (CallProcedimento) semanticObject); 
				return; 
			case PascalitoPackage.CALL_VARIAVEL:
				sequence_CallVariavel(context, (CallVariavel) semanticObject); 
				return; 
			case PascalitoPackage.DESVIO:
				sequence_Desvio(context, (Desvio) semanticObject); 
				return; 
			case PascalitoPackage.EXP_BIN:
				sequence_ExpBin(context, (ExpBin) semanticObject); 
				return; 
			case PascalitoPackage.EXP_BIN_LOGICA:
				sequence_ExpBinLogica(context, (ExpBinLogica) semanticObject); 
				return; 
			case PascalitoPackage.EXP_NEG:
				sequence_ExpNeg(context, (ExpNeg) semanticObject); 
				return; 
			case PascalitoPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case PascalitoPackage.NUMBER:
				sequence_Number(context, (pascalito.Number) semanticObject); 
				return; 
			case PascalitoPackage.PROCEDIMENTO:
				sequence_Procedimento(context, (Procedimento) semanticObject); 
				return; 
			case PascalitoPackage.PROGRAMA:
				sequence_Programa(context, (Programa) semanticObject); 
				return; 
			case PascalitoPackage.VARIAVEL:
				sequence_Variavel(context, (Variavel) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Comando returns Atribuicao
	 *     Atribuicao returns Atribuicao
	 *
	 * Constraint:
	 *     (atribui=[Variavel|ID] atribuiResultado=Expressao)
	 */
	protected void sequence_Atribuicao(ISerializationContext context, Atribuicao semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalitoPackage.Literals.ATRIBUICAO__ATRIBUI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalitoPackage.Literals.ATRIBUICAO__ATRIBUI));
			if (transientValues.isValueTransient(semanticObject, PascalitoPackage.Literals.ATRIBUICAO__ATRIBUI_RESULTADO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalitoPackage.Literals.ATRIBUICAO__ATRIBUI_RESULTADO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtribuicaoAccess().getAtribuiVariavelIDTerminalRuleCall_0_0_1(), semanticObject.getAtribui());
		feeder.accept(grammarAccess.getAtribuicaoAccess().getAtribuiResultadoExpressaoParserRuleCall_2_0(), semanticObject.getAtribuiResultado());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Bloco returns Bloco
	 *
	 * Constraint:
	 *     ((defvariavel+=Variavel defvariavel+=Variavel*)* defprocedimento+=Procedimento* executa+=Comando*)
	 */
	protected void sequence_Bloco(ISerializationContext context, Bloco semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comando returns CallProcedimento
	 *     CallProcedimento returns CallProcedimento
	 *
	 * Constraint:
	 *     (definido=[Procedimento|EString] (parametro+=Expressao parametro+=Expressao*)?)
	 */
	protected void sequence_CallProcedimento(ISerializationContext context, CallProcedimento semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expressao returns CallVariavel
	 *     CallVariavel returns CallVariavel
	 *
	 * Constraint:
	 *     (Prioridade=EBigDecimal? representa=[Variavel|EString])
	 */
	protected void sequence_CallVariavel(ISerializationContext context, CallVariavel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comando returns Desvio
	 *     Desvio returns Desvio
	 *
	 * Constraint:
	 *     (se=Expressao faca+=Comando* seNao+=Comando*)
	 */
	protected void sequence_Desvio(ISerializationContext context, Desvio semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expressao returns ExpBinLogica
	 *     ExpBinLogica returns ExpBinLogica
	 *
	 * Constraint:
	 *     (Comutativa?='Comutativa'? Prioridade=EBigDecimal? Operador=EString? operandoEsq=Expressao operandoDir=Expressao)
	 */
	protected void sequence_ExpBinLogica(ISerializationContext context, ExpBinLogica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expressao returns ExpBin
	 *     ExpBin returns ExpBin
	 *
	 * Constraint:
	 *     (Comutativa?='Comutativa'? Prioridade=EBigDecimal? Operador=EString? operandoDir=Expressao operandoEsq=Expressao)
	 */
	protected void sequence_ExpBin(ISerializationContext context, ExpBin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expressao returns ExpNeg
	 *     ExpNeg returns ExpNeg
	 *
	 * Constraint:
	 *     (Prioridade=EBigDecimal? Operador=EString? nega=Expressao)
	 */
	protected void sequence_ExpNeg(ISerializationContext context, ExpNeg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comando returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (se=Expressao faca+=Comando*)
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expressao returns Number
	 *     Number returns Number
	 *
	 * Constraint:
	 *     Valor=EInt
	 */
	protected void sequence_Number(ISerializationContext context, pascalito.Number semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalitoPackage.Literals.NUMBER__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalitoPackage.Literals.NUMBER__VALOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getValorEIntParserRuleCall_1_0(), semanticObject.getValor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Procedimento returns Procedimento
	 *
	 * Constraint:
	 *     (name=ID (parametro+=Variavel parametro+=Variavel*)? bloco=Bloco)
	 */
	protected void sequence_Procedimento(ISerializationContext context, Procedimento semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Programa returns Programa
	 *
	 * Constraint:
	 *     (Ident=EString bloco=Bloco)
	 */
	protected void sequence_Programa(ISerializationContext context, Programa semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalitoPackage.Literals.PROGRAMA__IDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalitoPackage.Literals.PROGRAMA__IDENT));
			if (transientValues.isValueTransient(semanticObject, PascalitoPackage.Literals.PROGRAMA__BLOCO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalitoPackage.Literals.PROGRAMA__BLOCO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgramaAccess().getIdentEStringParserRuleCall_1_0(), semanticObject.getIdent());
		feeder.accept(grammarAccess.getProgramaAccess().getBlocoBlocoParserRuleCall_3_0(), semanticObject.getBloco());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variavel returns Variavel
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Variavel(ISerializationContext context, Variavel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PascalitoPackage.Literals.VARIAVEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PascalitoPackage.Literals.VARIAVEL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariavelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
