package br.ufs.dcomp.ia;

import aima.core.probability.FiniteProbabilityModel;
import aima.core.probability.bayes.approx.BayesInferenceApproxAdapter;
import aima.core.probability.bayes.approx.GibbsAsk;
import aima.core.probability.bayes.approx.LikelihoodWeighting;
import aima.core.probability.bayes.model.FiniteBayesModel;
import aima.core.probability.example.ExampleRV;
import aima.core.probability.proposition.AssignmentProposition;
import aima.core.probability.proposition.DisjunctiveProposition;

public class ProblemaA {
	public static final int NUM_SAMPLES = 1000;
	public static void main(String[] args) {
		caso1();
		caso2();
		caso3();
	}



	public static void caso1() {
		System.out.println("================================");
		System.out.println("Probabilidade de encontrar um não americaco com idade< 30 e assiste muitos programas de TV");
		
		naoAmericanoIdadeMenorQue30AssisteMuitoLikelihoodWeighting(new FiniteBayesModel(
				RedeBayesianas.constructoAmericanoGostaFutebolAssisteTV(),
				new BayesInferenceApproxAdapter(new LikelihoodWeighting(),
						NUM_SAMPLES)));
		naoAmericanoIdadeMenorQue30AssisteGibbsAsk(new FiniteBayesModel(
				RedeBayesianas.constructoAmericanoGostaFutebolAssisteTV(),
				new BayesInferenceApproxAdapter(new GibbsAsk(), NUM_SAMPLES)));
		System.out.println("================================");

	}
	
	public static void caso2() {
		System.out.println("================================");
		System.out.println("Probabilidade de encontrar um  americaco com idade entre 31 a 40 anos e"
				+ " assiste alguns programas de TV gosta de futebol");
		
		naoAmericanoIdadeentre31A40AssisteAlgunsLikelihoodWeighting(new FiniteBayesModel(
				RedeBayesianas.constructoAmericanoGostaFutebolAssisteTV(),
				new BayesInferenceApproxAdapter(new LikelihoodWeighting(),
						NUM_SAMPLES)));
		naoAmericanoIdadeentre31A40AssisteAlgunsGibbsAsk(new FiniteBayesModel(
				RedeBayesianas.constructoAmericanoGostaFutebolAssisteTV(),
				new BayesInferenceApproxAdapter(new GibbsAsk(), NUM_SAMPLES)));
		System.out.println("================================");

	}

	public static void caso3() {
		System.out.println("================================");
		System.out.println("Probabilidade de encontrar algém com idade maior que 40 anos"
				+ " e  nunca assiste programas de TV que goste de futebol");
		
		algurmIdadeMaior4Nunca0AssisteLikelihoodWeighting(new FiniteBayesModel(
				RedeBayesianas.constructoAmericanoGostaFutebolAssisteTV(),
				new BayesInferenceApproxAdapter(new LikelihoodWeighting(),
						NUM_SAMPLES)));
		algurmIdadeMaior4Nunca0AssisteGibbsAsk(new FiniteBayesModel(
				RedeBayesianas.constructoAmericanoGostaFutebolAssisteTV(),
				new BayesInferenceApproxAdapter(new GibbsAsk(), NUM_SAMPLES)));
		System.out.println("================================");

	}
	
	private static void naoAmericanoIdadeMenorQue30AssisteMuitoLikelihoodWeighting(
			FiniteProbabilityModel model) {
		System.out.println("----------------------------------");
		AssignmentProposition nacionalidade = new AssignmentProposition(
				Variaveis.NACIONALIDADE, Boolean.FALSE);
		AssignmentProposition gostaFutebol = new AssignmentProposition(
				Variaveis.GOSTA_FUTEBOL, Boolean.TRUE);		
		AssignmentProposition idade = new AssignmentProposition(
				Variaveis.IDADE, "0-30 anos");		
		AssignmentProposition assisteTV = new AssignmentProposition(
				Variaveis.ASSISTE_TV, "muito");

		System.out.println("Algoritmo da Figura 14.15 Likelihood-Weighting");
		System.out.println("Probabilidade a prior");
		System.out.println("P(não americado AND idade menor que 30 AND"
				+ " gosta de futebol AND assiste muito) = " + model.prior(nacionalidade, 
						idade, gostaFutebol, assisteTV)
				);
		/*System.out.println("\n");
		System.out.println("Probabilidade a posterior");
		System.out.println("P(assisteTV | não americado AND idade menor que 30 AND gosta de futebol) = "
				+ model.posterior(assisteTV, nacionalidade, idade, gostaFutebol));*/
	
	}
	
	private static void naoAmericanoIdadeMenorQue30AssisteGibbsAsk(
			FiniteProbabilityModel model) {
		System.out.println("----------------------------------");
		AssignmentProposition nacionalidade = new AssignmentProposition(
				Variaveis.NACIONALIDADE, Boolean.FALSE);
		AssignmentProposition gostaFutebol = new AssignmentProposition(
				Variaveis.GOSTA_FUTEBOL, Boolean.TRUE);		
		AssignmentProposition idade = new AssignmentProposition(
				Variaveis.IDADE, "0-30 anos");		
		AssignmentProposition assisteTV = new AssignmentProposition(
				Variaveis.ASSISTE_TV, "muito");


		System.out.println("Algoritmo da Figura 14.16 Gibbs-Ask");
		System.out.println("Probabilidade a prior");
		System.out.println("P(não americado AND idade menor que 30 AND"
				+ " gosta de futebol AND assiste muito) = " + model.prior(nacionalidade, 
						idade, gostaFutebol, assisteTV)
				);
		/*System.out.println("\n");
		System.out.println("Probabilidade a posterior");
		System.out.println("P(assisteTV | não americado AND idade menor que 30 AND gosta de futebol) = "
				+ model.posterior(assisteTV, nacionalidade, idade, gostaFutebol));*/

	}
	
	private static void naoAmericanoIdadeentre31A40AssisteAlgunsLikelihoodWeighting(
			FiniteProbabilityModel model) {
		System.out.println("----------------------------------");
		AssignmentProposition nacionalidade = new AssignmentProposition(
				Variaveis.NACIONALIDADE, Boolean.TRUE);
		AssignmentProposition gostaFutebol = new AssignmentProposition(
				Variaveis.GOSTA_FUTEBOL, Boolean.TRUE);		
		AssignmentProposition idade = new AssignmentProposition(
				Variaveis.IDADE, "31-40 anos");		
		AssignmentProposition assisteTV = new AssignmentProposition(
				Variaveis.ASSISTE_TV, "as vezes");
		
		System.out.println("Algoritmo da Figura 14.15 Likelihood-Weighting");
		System.out.println("Probabilidade a posterior");
		System.out.println("P(gosta de futebol | americado AND idade entre 31 a 40 AND gosta de assiste as vezes) = "
				+ model.posterior(gostaFutebol, nacionalidade, idade, assisteTV));
		
	}
	
	private static void naoAmericanoIdadeentre31A40AssisteAlgunsGibbsAsk(
			FiniteProbabilityModel model) {
		System.out.println("----------------------------------");
		AssignmentProposition nacionalidade = new AssignmentProposition(
				Variaveis.NACIONALIDADE, Boolean.TRUE);
		AssignmentProposition gostaFutebol = new AssignmentProposition(
				Variaveis.GOSTA_FUTEBOL, Boolean.TRUE);		
		AssignmentProposition idade = new AssignmentProposition(
				Variaveis.IDADE, "31-40 anos");		
		AssignmentProposition assisteTV = new AssignmentProposition(
				Variaveis.ASSISTE_TV, "as vezes");
		
		System.out.println("Algoritmo da Figura 14.16 Gibbs-Ask");
		System.out.println("Probabilidade a posterior");
		System.out.println("P(gosta de futebol | americado AND idade entre 31 a 40 AND gosta de assiste as vezes) = "
				+ model.posterior(gostaFutebol, nacionalidade, idade, assisteTV));
		
	}
	
	private static void algurmIdadeMaior4Nunca0AssisteGibbsAsk(
			FiniteProbabilityModel model) {
		System.out.println("----------------------------------");
	
		AssignmentProposition gostaFutebol = new AssignmentProposition(
				Variaveis.GOSTA_FUTEBOL, Boolean.TRUE);		
		AssignmentProposition idade = new AssignmentProposition(
				Variaveis.IDADE, "41-100 anos");		
		AssignmentProposition assisteTV = new AssignmentProposition(
				Variaveis.ASSISTE_TV, "nunca");
		
		System.out.println("Algoritmo da Figura 14.15 Likelihood-Weighting");
		System.out.println("Probabilidade a posterior");
		System.out.println("P(gosta de futebol | americado AND idade maior que 40 AND gosta de assiste as vezes) = "
				+ model.posterior(gostaFutebol,  idade, assisteTV));
		
	}
	
	private static void algurmIdadeMaior4Nunca0AssisteLikelihoodWeighting(
			FiniteProbabilityModel model) {
		System.out.println("----------------------------------");
	
		AssignmentProposition gostaFutebol = new AssignmentProposition(
				Variaveis.GOSTA_FUTEBOL, Boolean.TRUE);		
		AssignmentProposition idade = new AssignmentProposition(
				Variaveis.IDADE, "41-100 anos");		
		AssignmentProposition assisteTV = new AssignmentProposition(
				Variaveis.ASSISTE_TV, "nunca");
		
		System.out.println("Algoritmo da Figura 14.16 Gibbs-Ask");
		System.out.println("Probabilidade a posterior");
		System.out.println("P(gosta de futebol | americado AND idade maior que 40 AND gosta de assiste as vezes) = "
				+ model.posterior(gostaFutebol,  idade, assisteTV));
		
	}
}