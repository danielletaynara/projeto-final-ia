package br.ufs.dcomp.ia;

import aima.core.probability.FiniteProbabilityModel;
import aima.core.probability.bayes.approx.BayesInferenceApproxAdapter;
import aima.core.probability.bayes.approx.LikelihoodWeighting;
import aima.core.probability.bayes.model.FiniteBayesModel;
import aima.core.probability.example.ExampleRV;
import aima.core.probability.proposition.AssignmentProposition;
import aima.core.probability.proposition.DisjunctiveProposition;

public class ProblemaA {
	public static final int NUM_SAMPLES = 1000;




	public static void LikelihoodWeightingA() {
		System.out.println("Probabilidade de encontrar um não americaco com idade< 30 e assiste muitos programas de TV");
		System.out.println("================================");
		naoAmericanoIdadeMenorQue30AssisteMuito(new FiniteBayesModel(
				RedeBayesianas.constructoAmericanoGostaFutebolAssisteTV(),
				new BayesInferenceApproxAdapter(new LikelihoodWeighting(),
						NUM_SAMPLES)));

		System.out.println("================================");
	}

	private static void naoAmericanoIdadeMenorQue30AssisteMuito(
			FiniteProbabilityModel model) {
		//System.out.println("Toothache, Cavity, and Catch Model");
		System.out.println("----------------------------------");
		AssignmentProposition nacionalidade = new AssignmentProposition(
				Variaveis.NACIONALIDADE, Boolean.FALSE);
		AssignmentProposition gostaFutebol = new AssignmentProposition(
				Variaveis.GOSTA_FUTEBOL, Boolean.TRUE);		
		AssignmentProposition idade = new AssignmentProposition(
				Variaveis.IDADE, "0-30 anos");		
		AssignmentProposition assisteTV = new AssignmentProposition(
				Variaveis.ASSISTE_TV, "muito");

		System.out.println("P(não americado AND idade menor que 30 AND gosta de futebol AND assiste muito) = "
				);
		System.out.println("P(assisteTV | não americado AND idade menor que 30 AND gosta de futebo) = "
				);


	}
}