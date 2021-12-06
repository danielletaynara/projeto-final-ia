package br.ufs.dcomp.ia;

import aima.core.probability.bayes.BayesianNetwork;
import aima.core.probability.bayes.FiniteNode;
import aima.core.probability.bayes.impl.BayesNet;
import aima.core.probability.bayes.impl.FullCPTNode;

public class RedeBayesianas {
	public static BayesianNetwork constructoAmericanoGostaFutebolAssisteTV() {
		FiniteNode nacionalidade = new FullCPTNode(Variaveis.NACIONALIDADE, new double[] {
				//b1 = Americano
				0.2,
				//b2 = Não americano
				0.8 });

		FiniteNode idade = new FullCPTNode(Variaveis.IDADE, new double[] {
				//a1 = 0-30
				0.3, 
				//a2 = 31-40
				0.6, 
				//a3 = 41-100
				0.1 });

		@SuppressWarnings("unused")
		FiniteNode gostaFutebol = new FullCPTNode(Variaveis.GOSTA_FUTEBOL,
				new double[] {
						// C=gosta de futebol, a1b1
						0.5,
						// C=não gosta de futebol, a1b1
						0.5,
						// C=gosta de futebol, a1b2
						0.7,
						// C=não gosta de futebol, a1b2
						0.3,
						// C=gosta de futebol, a2b1
						0.6,
						// C=não gosta de futebol, a2b1
						0.4,
						// C=gosta de futebol, a2b2
						0.8,
						// C=não gosta de futebol, a2b2
						0.2,
						// C=gosta de futebol, a3b1
						0.4,
						// C=não gosta de futebol, a3b1
						0.6,
						// C=gosta de futebol, a3b2
						0.1,
						// C=não gosta de futebol, a3b2
						0.9


		}, idade, nacionalidade);
		@SuppressWarnings("unused")
		FiniteNode assisteTV = new FullCPTNode(Variaveis.ASSISTE_TV, new double[] {
				//d=muito
				//d1=as vezes
				//d3=nunca
				// d=muito, C=gosta de futebol
				0.7,
				// d=muito, C=não gosta de futebol
				0.5,
				// d1=as vezes, C=gosta de futebol
				0.2,
				//d1=as vezes, C=não gosta de futebol
				0.3,
				//d3=nunca, C=gosta de futebol
				0.1,
				//d3=nunca, C=não gosta de futebol
				0.2
		}, gostaFutebol);

		return new BayesNet(nacionalidade, idade);
	}
	/*-------------------------------------------------------------------------*/
	public static BayesianNetwork contruirBolsaEstudos() {
		FiniteNode bolsa = new FullCPTNode(Variaveis.BOLSA, new double[] {
				//bolsa=10
				0.11,
				// bolsa=15
				0.11,
				//bolsa=20
				0.11, 
				//bolsa=25
				0.11,
				//bolsa=30
				0.11,
				//bolsa=35
				0.11,
				//bolsa=40
				0.11,
				//bolsa=45
				0.11,
				//bolsa=50
				0.11});
		FiniteNode rendaFamiliar = new FullCPTNode(Variaveis.RENDA_FAMILIAR, new double[] {
				//Um a tres SM
				//bolsa=10
				0.01,
				// bolsa=15
				0.03,
				//bolsa=20
				0.15, 
				//bolsa=25
				0.20,
				//bolsa=30
				0.35,
				//bolsa=35
				0.52,
				//bolsa=40
				0.65,
				//bolsa=45
				0.75,
				//bolsa=50
				0.80,
				//Quatro a dez SM
				//bolsa=10
				0.29,
				// bolsa=15
				0.32,
				//bolsa=20
				0.45, 
				//bolsa=25
				0.50,
				//bolsa=30
				0.40,
				//bolsa=35
				0.33,
				//bolsa=40
				0.25,
				//bolsa=45
				0.23,
				//bolsa=50
				0.19,
				//Dez SM acima
				//bolsa=10
				0.70,
				// bolsa=15
				0.65,
				//bolsa=20
				0.40, 
				//bolsa=25
				0.30,
				//bolsa=30
				0.25,
				//bolsa=35
				0.15,
				//bolsa=40
				0.10,
				//bolsa=45
				0.02,
				//bolsa=50
				0.01
		});
		FiniteNode trabalha = new FullCPTNode(Variaveis.TRABALHA, new double[] {
				//Trabalha = sim, 
				//% da bolsa=10
				0.5,
				// % da bolsa=15
				0.55,
				// % da bolsa=20
				0.60,
				// % da bolsa=25
				0.65,
				// % da bolsa=30
				0.70,
				// % da bolsa=35
				0.75,
				// % da bolsa=40
				0.75,
				// % da bolsa=45
				0.75,
				// % da bolsa=50
				0.75,
				//Trabalha = nao 
				//% da bolsa=10
				0.5,
				// % da bolsa=15
				0.45,
				// % da bolsa=20
				0.40,
				// % da bolsa=25
				0.35,
				// % da bolsa=30
				0.30,
				// % da bolsa=35
				0.25,
				// % da bolsa=40
				0.25,
				// % da bolsa=45
				0.25,
				// % da bolsa=50
				0.25
		});

		FiniteNode conjugueEstudaIes = new FullCPTNode(Variaveis.CONJUGUE_ESTUDA_IES, new double[] {
				//conjugueEstudaIes = sim, 
				//% da bolsa=10
				0.5,
				// % da bolsa=15
				0.5,
				// % da bolsa=20
				0.55,
				// % da bolsa=25
				0.60,
				// % da bolsa=30
				0.62,
				// % da bolsa=35
				0.64,
				// % da bolsa=40
				0.66,
				// % da bolsa=45
				0.68,
				// % da bolsa=50
				0.70,
				//conjugueEstudaIes = nao
				//% da bolsa=10
				0.5,
				// % da bolsa=15
				0.5,
				// % da bolsa=20
				0.45,
				// % da bolsa=25
				0.40,
				// % da bolsa=30
				0.38,
				// % da bolsa=35
				0.36,
				// % da bolsa=40
				0.34,
				// % da bolsa=45
				0.32,
				// % da bolsa=50
				0.30
		});
		FiniteNode irmaoEstudaIes = new FullCPTNode(Variaveis.IRMAO_ESTUDA_IES, new double[] {
				//irmaoEstudaIes = sim, 
				//% da bolsa=10
				0.5,
				// % da bolsa=15
				0.55,
				// % da bolsa=20
				0.60,
				// % da bolsa=25
				0.62,
				// % da bolsa=30
				0.64,
				// % da bolsa=35
				0.66,
				// % da bolsa=40
				0.68,
				// % da bolsa=45
				0.69,
				// % da bolsa=50
				0.70,
				//irmaoEstudaIes = nao
				//% da bolsa=10
				0.5,
				// % da bolsa=15
				0.45,
				// % da bolsa=20
				0.40,
				// % da bolsa=25
				0.38,
				// % da bolsa=30
				0.36,
				// % da bolsa=35
				0.34,
				// % da bolsa=40
				0.32,
				// % da bolsa=45
				0.31,
				// % da bolsa=50
				0.30
		});
		FiniteNode resideLages = new FullCPTNode(Variaveis.RESIDE_LAGES, new double[] {
				//resideLages = sim, 
				//% da bolsa=10
				0.70,
				// % da bolsa=15
				0.65,
				// % da bolsa=20
				0.60,
				// % da bolsa=25
				0.55,
				// % da bolsa=30
				0.50,
				// % da bolsa=35
				0.45,
				// % da bolsa=40
				0.40,
				// % da bolsa=45
				0.20,
				// % da bolsa=50
				0.10,
				//resideLages = nao
				//% da bolsa=10
				0.30,
				// % da bolsa=15
				0.35,
				// % da bolsa=20
				0.40,
				// % da bolsa=25
				0.45,
				// % da bolsa=30
				0.50,
				// % da bolsa=35
				0.55,
				// % da bolsa=40
				0.60,
				// % da bolsa=45
				0.65,
				// % da bolsa=50
				0.70
		});
		FiniteNode terImovel = new FullCPTNode(Variaveis.IMOVEL, new double[] {
				//terImovel = sim, 
				//% da bolsa=10
				0.70,
				// % da bolsa=15
				0.65,
				// % da bolsa=20
				0.60,
				// % da bolsa=25
				0.55,
				// % da bolsa=30
				0.50,
				// % da bolsa=35
				0.45,
				// % da bolsa=40
				0.40,
				// % da bolsa=45
				0.20,
				// % da bolsa=50
				0.10,
				//terImovel = nao
				//% da bolsa=10
				0.30,
				// % da bolsa=15
				0.35,
				// % da bolsa=20
				0.40,
				// % da bolsa=25
				0.45,
				// % da bolsa=30
				0.50,
				// % da bolsa=35
				0.55,
				// % da bolsa=40
				0.60,
				// % da bolsa=45
				0.65,
				// % da bolsa=50
				0.70
		});
		FiniteNode terDoencaGraveNaFamilia = new FullCPTNode(Variaveis.DOENCA_GRAVE_FAMILIA, new double[] {
				//terDoencaGraveNaFamilia = sim, 
				//% da bolsa=10
				0.40,
				// % da bolsa=15
				0.65,
				// % da bolsa=20
				0.60,
				// % da bolsa=25
				0.55,
				// % da bolsa=30
				0.50,
				// % da bolsa=35
				0.45,
				// % da bolsa=40
				0.40,
				// % da bolsa=45
				0.20,
				// % da bolsa=50
				0.10,
				//terDoencaGraveNaFamilia = nao
				//% da bolsa=10
				0.30,
				// % da bolsa=15
				0.35,
				// % da bolsa=20
				0.40,
				// % da bolsa=25
				0.45,
				// % da bolsa=30
				0.50,
				// % da bolsa=35
				0.55,
				// % da bolsa=40
				0.60,
				// % da bolsa=45
				0.65,
				// % da bolsa=50
				0.70
		});
		FiniteNode faseEmQueEstuda = new FullCPTNode(Variaveis.FASE_ESTUDO, new double[] {
				//faseEmQueEstuda = Primeira a quarta, 
				//% da bolsa=10
				0.54,
				// % da bolsa=15
				0.56,
				// % da bolsa=20
				0.58,
				// % da bolsa=25
				0.60,
				// % da bolsa=30
				0.62,
				// % da bolsa=35
				0.64,
				// % da bolsa=40
				0.66,
				// % da bolsa=45
				0.68,
				// % da bolsa=50
				0.70,
				//faseEmQueEstuda = Quinta a setima
				//% da bolsa=10
				0.36,
				// % da bolsa=15
				0.35,
				// % da bolsa=20
				0.34,
				// % da bolsa=25
				0.33,
				// % da bolsa=30
				0.32,
				// % da bolsa=35
				0.31,
				// % da bolsa=40
				0.30,
				// % da bolsa=45
				0.29,
				// % da bolsa=50
				0.28,
				//faseEmQueEstuda = Setima acima
				//% da bolsa=10
				0.10,
				// % da bolsa=15
				0.09,
				// % da bolsa=20
				0.08,
				// % da bolsa=25
				0.07,
				// % da bolsa=30
				0.06,
				// % da bolsa=35
				0.05,
				// % da bolsa=40
				0.04,
				// % da bolsa=45
				0.03,
				// % da bolsa=50
				0.02
		});
		FiniteNode cursouSegundoGrau = new FullCPTNode(Variaveis.SEGUNDO_GRAU, new double[] {
				//cursouSegundoGrau = Escola Publica, 
				//% da bolsa=10
				0.10,
				// % da bolsa=15
				0.13,
				// % da bolsa=20
				0.25,
				// % da bolsa=25
				0.55,
				// % da bolsa=30
				0.60,
				// % da bolsa=35
				0.65,
				// % da bolsa=40
				0.70,
				// % da bolsa=45
				0.80,
				// % da bolsa=50
				0.90,
				//cursouSegundoGrau = Escola Privada
				//% da bolsa=10
				0.90,
				// % da bolsa=15
				0.87,
				// % da bolsa=20
				0.75,
				// % da bolsa=25
				0.45,
				// % da bolsa=30
				0.40,
				// % da bolsa=35
				0.35,
				// % da bolsa=40
				0.30,
				// % da bolsa=45
				0.20,
				// % da bolsa=50
				0.10
		});
		
		return new BayesNet(bolsa, rendaFamiliar, trabalha, conjugueEstudaIes, irmaoEstudaIes,
				resideLages, terImovel, terDoencaGraveNaFamilia, faseEmQueEstuda, cursouSegundoGrau);
	}
}