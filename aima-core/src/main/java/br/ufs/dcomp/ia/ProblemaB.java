package br.ufs.dcomp.ia;

import java.util.Scanner;

import aima.core.probability.FiniteProbabilityModel;
import aima.core.probability.bayes.approx.BayesInferenceApproxAdapter;
import aima.core.probability.bayes.approx.GibbsAsk;
import aima.core.probability.bayes.approx.LikelihoodWeighting;
import aima.core.probability.bayes.model.FiniteBayesModel;
import aima.core.probability.example.BayesNetExampleFactory;
import aima.core.probability.example.ExampleRV;
import aima.core.probability.proposition.AssignmentProposition;
import aima.core.probability.proposition.DisjunctiveProposition;

public class ProblemaB {
	public static final int NUM_SAMPLES = 1000;
	static AssignmentProposition bolsa;
	static AssignmentProposition rendaFamiliar;
	static AssignmentProposition trabalha;
	static AssignmentProposition conjugueEstudaIes;
	static AssignmentProposition irmaoEstudaIes;
	static AssignmentProposition resideLages;
	static AssignmentProposition terImovel;
	static AssignmentProposition terDoencaGraveFamilia;
	static AssignmentProposition faseEstudo;
	static AssignmentProposition segundoGrau;
	
	public static void main(String[] args) {
		lerEntrada();
		calcularProbabilidadeBolsa();
		
	}
	
	private static void calcularProbabilidadeBolsa() {
		System.out.println("Algoritimo Likelihood-Weighting");
		demoProbabilidadeBolsaLikelihoodWeighting(new FiniteBayesModel(
				RedeBayesianas.contruirBolsaEstudos(),
				new BayesInferenceApproxAdapter(new LikelihoodWeighting(),
						NUM_SAMPLES)));
		System.out.println("================================");
		calcularProbabilidadeBolsaGibbsAsk(new FiniteBayesModel(
				RedeBayesianas.contruirBolsaEstudos(),
				new BayesInferenceApproxAdapter(new GibbsAsk(),
						NUM_SAMPLES)));
	}
	
	private static void demoProbabilidadeBolsaLikelihoodWeighting(
			FiniteProbabilityModel model) {
		System.out.println("Resultado da Bayesiana a priori.");
	
		System.out.println("P("+ rendaFamiliar.toString() +") = " + model.prior(rendaFamiliar));
		System.out.println("P("+ trabalha.toString() +") = " + model.prior(trabalha));
		System.out.println("P("+ conjugueEstudaIes.toString() +") = " + model.prior(conjugueEstudaIes));
		System.out.println("P("+ irmaoEstudaIes.toString() +") = " + model.prior(irmaoEstudaIes));
		System.out.println("P("+ resideLages.toString() +") = " + model.prior(resideLages));
		System.out.println("P("+ terImovel.toString() +") = " + model.prior(terImovel));
		System.out.println("P("+ terDoencaGraveFamilia.toString() +") = " + model.prior(terDoencaGraveFamilia));
		System.out.println("P("+ faseEstudo.toString() +") = " + model.prior(faseEstudo));
		System.out.println("P("+ segundoGrau.toString() +") = " + model.prior(segundoGrau));
		


		// AIMA3e pg. 497
		// P<>(Cavity | toothache AND catch) = <0.871, 0.129>
		System.out.println("P<>(Bolsa) = "
				+ model.posteriorDistribution(Variaveis.BOLSA, rendaFamiliar, trabalha, conjugueEstudaIes, irmaoEstudaIes, 
						resideLages, terImovel, terDoencaGraveFamilia, faseEstudo, segundoGrau));
	}
	
	private static void calcularProbabilidadeBolsaGibbsAsk(FiniteProbabilityModel model) {
		System.out.println("Algoritimo Gibbs-Ask");
		System.out.println("P("+ rendaFamiliar.toString() +") = " + model.prior(rendaFamiliar));
		System.out.println("P("+ trabalha.toString() +") = " + model.prior(trabalha));
		System.out.println("P("+ conjugueEstudaIes.toString() +") = " + model.prior(conjugueEstudaIes));
		System.out.println("P("+ irmaoEstudaIes.toString() +") = " + model.prior(irmaoEstudaIes));
		System.out.println("P("+ resideLages.toString() +") = " + model.prior(resideLages));
		System.out.println("P("+ terImovel.toString() +") = " + model.prior(terImovel));
		System.out.println("P("+ terDoencaGraveFamilia.toString() +") = " + model.prior(terDoencaGraveFamilia));
		System.out.println("P("+ faseEstudo.toString() +") = " + model.prior(faseEstudo));
		System.out.println("P("+ segundoGrau.toString() +") = " + model.prior(segundoGrau));
		


		// AIMA3e pg. 497
		// P<>(Cavity | toothache AND catch) = <0.871, 0.129>
		System.out.println("P<>(Bolsa) = "
				+ model.posteriorDistribution(Variaveis.BOLSA, rendaFamiliar, trabalha, conjugueEstudaIes, irmaoEstudaIes, 
						resideLages, terImovel, terDoencaGraveFamilia, faseEstudo, segundoGrau));
		
	}
	
	private static void lerEntrada() {
		Scanner cx=new Scanner(System.in);
		
		System.out.println("Preenchimento de formulário de bolsa");
		//System.out.println("\n");
		//1lerBolsa(cx);		
		lerRendaFamiliar(cx);		
		lerTrabalha(cx);		
		lerConjugeEstudaIes(cx);		
		lerIrmaoEstudaIes(cx);		
		lerResideLages(cx);		
		lerTemImovel(cx);
		lerTemDoencaGraveFamilia(cx);		
		lerFaseEstudo(cx);		
		lerCursouSegundoGrau(cx);
		
	}

	private static void lerCursouSegundoGrau(Scanner cx) {
		int lerEntrada;
		System.out.println("\n");
		System.out.println("Onde cursou segundo grau?");
		System.out.println("1 - Escola Publica");
		System.out.println("2 - Escola Privada");
		System.out.println("Digite o número correspondente: ");
		lerEntrada = cx.nextInt();
		
		switch (lerEntrada){
			case 1:
				segundoGrau = new AssignmentProposition(
	        			Variaveis.SEGUNDO_GRAU, "Escola Publica");      	
	            break;
	        case 2:
	        	segundoGrau = new AssignmentProposition(
	        			Variaveis.SEGUNDO_GRAU, "Escola Privada");
	            break;
	        default:
	        	System.out.println("Opção inválida");
	        	lerCursouSegundoGrau(cx);
		}
	}

	private static void lerFaseEstudo(Scanner cx) {
		int lerEntrada;
		System.out.println("\n");
		System.out.println("Qual a fase de estudo?");
		System.out.println("1 - Primeira a quarta");
		System.out.println("2 - Quinta a setima");
		System.out.println("3 - Setima acima");
		System.out.println("Digite o número correspondente: ");
		lerEntrada = cx.nextInt();
		switch (lerEntrada){
			case 1:
				faseEstudo = new AssignmentProposition(
	        			Variaveis.FASE_ESTUDO, "Primeira a quarta");      	
	            break;
	        case 2:
	        	faseEstudo = new AssignmentProposition(
	        			Variaveis.FASE_ESTUDO, "Quinta a setima");
	            break;
	        case 3:
	        	faseEstudo = new AssignmentProposition(
	        			Variaveis.FASE_ESTUDO, "Setima acima");
	            break;
	        default:
	        	System.out.println("Opção inválida");
	        	lerFaseEstudo(cx);
		}
	}

	private static void lerTemDoencaGraveFamilia(Scanner cx) {
		int lerEntrada;
		System.out.println("\n");
		System.out.println("Tem doença grave na família?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.println("Digite o número correspondente: ");
		lerEntrada = cx.nextInt();

		switch (lerEntrada){
			case 1:
				terDoencaGraveFamilia = new AssignmentProposition(
	        			Variaveis.DOENCA_GRAVE_FAMILIA, Boolean.TRUE);      	
	            break;
	        case 2:
	        	terDoencaGraveFamilia = new AssignmentProposition(
	        			Variaveis.DOENCA_GRAVE_FAMILIA, Boolean.FALSE);
	            break;
	        default:
	        	System.out.println("Opção inválida");
	        	lerTemDoencaGraveFamilia(cx);
		}
	}

	private static void lerTemImovel(Scanner cx) {
		int lerEntrada;
		System.out.println("\n");
		System.out.println("Tem imóvel?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.println("Digite o número correspondente: ");
		lerEntrada = cx.nextInt();
		
		switch (lerEntrada){
			case 1:
				terImovel = new AssignmentProposition(
	        			Variaveis.IMOVEL, Boolean.TRUE);      	
	            break;
	        case 2:
	        	terImovel = new AssignmentProposition(
	        			Variaveis.IMOVEL, Boolean.FALSE);
	            break;
	        default:
	        	System.out.println("Opção inválida");
	        	lerTemImovel(cx);
		}
	}

	private static void lerResideLages(Scanner cx) {
		int lerEntrada;
		System.out.println("\n");
		System.out.println("Reside em Lages?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.println("Digite o número correspondente:");
		lerEntrada = cx.nextInt();
		
		switch (lerEntrada){
			case 1:
				resideLages = new AssignmentProposition(
	        			Variaveis.RESIDE_LAGES, Boolean.TRUE);      	
	            break;
	        case 2:
	        	resideLages = new AssignmentProposition(
	        			Variaveis.RESIDE_LAGES, Boolean.FALSE);
	            break;
	        default:
	        	System.out.println("Opção inválida");
	        	lerResideLages(cx);
		}
	}

	private static void lerIrmaoEstudaIes(Scanner cx) {
		int lerEntrada;
		System.out.println("\n");
		System.out.println("Irmão estuda no IES?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.println("Digite o número correspondente:");
		lerEntrada = cx.nextInt();

		switch (lerEntrada){
			case 1:
				irmaoEstudaIes = new AssignmentProposition(
	        			Variaveis.IRMAO_ESTUDA_IES, Boolean.TRUE);      	
	            break;
	        case 2:
	        	irmaoEstudaIes = new AssignmentProposition(
	        			Variaveis.IRMAO_ESTUDA_IES, Boolean.FALSE);
	            break;
	        default:
	        	System.out.println("Opção inválida");
	        	lerIrmaoEstudaIes(cx);
		}
	}

	private static void lerConjugeEstudaIes(Scanner cx) {
		int lerEntrada;
		System.out.println("\n");
		System.out.println("Cônjuge estuda no IES?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.println("Digite o número correspondente:");
		lerEntrada = cx.nextInt();

		switch (lerEntrada){
			case 1:
				conjugueEstudaIes = new AssignmentProposition(
	        			Variaveis.CONJUGUE_ESTUDA_IES, Boolean.TRUE);      	
	            break;
	        case 2:
	        	conjugueEstudaIes = new AssignmentProposition(
	        			Variaveis.CONJUGUE_ESTUDA_IES, Boolean.FALSE);
	            break;
	        default:
	        	System.out.println("Opção inválida");
	        	lerConjugeEstudaIes(cx);
		}
	}

	private static void lerTrabalha(Scanner cx) {
		int lerEntrada;
		System.out.println("\n");
		System.out.println("Trabalha?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.println("Digite o número correspondente:");
		lerEntrada = cx.nextInt();

		switch (lerEntrada){
			case 1:
				trabalha = new AssignmentProposition(
	        			Variaveis.TRABALHA,  Boolean.TRUE);      	
	            break;
	        case 2:
	        	trabalha = new AssignmentProposition(
	        			Variaveis.TRABALHA, Boolean.FALSE);
	            break;
	        default:
	        	System.out.println("Opção inválida");
	        	lerTrabalha(cx);
	        	
		}
	}

	private static void lerRendaFamiliar(Scanner cx) {
		int lerEntrada;
		System.out.println("\n");
		System.out.println("Qual Renda familiar (total da renda da família do requerente)?");
		System.out.println("1 - Um a Três Salários Mínimo");
		System.out.println("2 - Quatro a Dez Salários Mínimo");
		System.out.println("3 - Dez Salários Mínimo acima");
		System.out.println("Digite o número correspondente:");
		lerEntrada = cx.nextInt();

		switch (lerEntrada){
			case 1:
	        	rendaFamiliar = new AssignmentProposition(
	        			Variaveis.RENDA_FAMILIAR, "Um a tres SM");      	
	            break;
	        case 2:
	        	rendaFamiliar = new AssignmentProposition(
	        			Variaveis.RENDA_FAMILIAR,  "Quatro a dez SM");
	            break;
	        case 3:
	        	rendaFamiliar = new AssignmentProposition(
	        			Variaveis.RENDA_FAMILIAR, "Dez SM acima");
	        	break;
	        default:
	        	System.out.println("Opção inválida");
	        	lerRendaFamiliar(cx);
		}
	}

	private static void lerBolsa(Scanner cx) {
		int lerEntrada;
		System.out.println("Qual Bolsa desejada?");
		System.out.println("1 - Dez");
		System.out.println("2 - Quinze");
		System.out.println("3 - Vinte");
		System.out.println("4 - Vinte e cinco");
		System.out.println("5 - Trinta");
		System.out.println("6 - Trinta e cinco");
		System.out.println("7 - Quarenta");
		System.out.println("8 - Quarenta e cinco");
		System.out.println("9 - Cinquenta");
		System.out.println("Digite o número correspondente:");
		lerEntrada  = cx.nextInt();

		String stringBolsa = "";
		switch (lerEntrada){
		case 1:
			stringBolsa = "dez";
			bolsa = new AssignmentProposition(Variaveis.BOLSA, "dez");      	
            break;
        case 2:
        	stringBolsa = "quinze";
        	bolsa = new AssignmentProposition(Variaveis.BOLSA, "quinze"); 
            break;
        case 3:
        	stringBolsa = "vinte";
        	bolsa = new AssignmentProposition(Variaveis.BOLSA, "vinte"); 
        	break;
        case 4:
        	stringBolsa = "vinte e cinco";
        	bolsa = new AssignmentProposition(Variaveis.BOLSA, "vinte e cinco"); 
        	break;
        case 5:
        	stringBolsa = "trinta";
        	bolsa = new AssignmentProposition(Variaveis.BOLSA, "trinta"); 
        	break;
        case 6:
        	stringBolsa = "trinta e cinco";
        	bolsa = new AssignmentProposition(Variaveis.BOLSA, "trinta e cinco"); 
        	break;
        case 7:
        	stringBolsa = "quarenta";
        	bolsa = new AssignmentProposition(Variaveis.BOLSA, "quarenta"); 
        	break;
        case 8:
        	stringBolsa = "quarenta e cinco";
        	bolsa = new AssignmentProposition(Variaveis.BOLSA, "quarenta e cinco"); 
        	break;
        case 9:
        	stringBolsa = "cinquenta";
        	bolsa = new AssignmentProposition(Variaveis.BOLSA, "cinquenta"); 
        	break;
        default:
        	System.out.println("Opção inválida");
        	lerBolsa(cx);
        	break;
	}
	}
		
	
	
	

}
