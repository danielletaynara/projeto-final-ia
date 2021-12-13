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
				//d3=nunca, C=gosta de futebol
				0.1,
				//d3=nunca, C=não gosta de futebol
				0.2,
				// d=muito, C=não gosta de futebol
				0.5,
				// d1=as vezes, C=gosta de futebol
				0.2,
				//d1=as vezes, C=não gosta de futebol
				0.3
				
		}, gostaFutebol);

		return new BayesNet(nacionalidade, idade);
	}
	/*-------------------------------------------------------------------------*/
	
	public static BayesianNetwork contruirBolsaEstudos() {
		FiniteNode bolsa = new FullCPTNode(Variaveis.BOLSA, new double[] {
				//bolsa=10
				0.12,
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
		
		FiniteNode trabalha = new FullCPTNode(Variaveis.TRABALHA, new double[] {
				//Trabalha = sim, 
				//% da bolsa=10
				0.5,
				//Trabalha = nao
				//% da bolsa=10
				0.5,
				//Trabalha = sim, 
				// % da bolsa=15
				0.55,
				//Trabalha = nao
				// % da bolsa=15
				0.45,
				//Trabalha = sim, 
				// % da bolsa=20
				0.60,
				//Trabalha = nao
				// % da bolsa=20
				0.40,
				//Trabalha = sim, 
				// % da bolsa=25
				0.65,
				//Trabalha = nao
				// % da bolsa=25
				0.35,
				//Trabalha = sim, 
				// % da bolsa=30
				0.70,
				//Trabalha = nao
				// % da bolsa=30
				0.30,
				//Trabalha = sim, 
				// % da bolsa=35
				0.75,
				//Trabalha = nao
				// % da bolsa=35
				0.25,
				//Trabalha = sim, 
				// % da bolsa=40
				0.75,
				//Trabalha = nao
				// % da bolsa=40
				0.25,
				//Trabalha = sim, 
				// % da bolsa=45
				0.75,
				//Trabalha = nao
				// % da bolsa=45
				0.25,
				//Trabalha = sim, 
				// % da bolsa=50
				0.75,
				//Trabalha = nao 
				// % da bolsa=50
				0.25
		}, bolsa);

		FiniteNode conjugueEstudaIes = new FullCPTNode(Variaveis.CONJUGUE_ESTUDA_IES, new double[] { 
				//% da bolsa=10 //conjugueEstudaIes = sim, 
				0.5,
				//% da bolsa=10 //conjugueEstudaIes = nao
				0.5,
				// % da bolsa=15 //conjugueEstudaIes = sim, 
				0.5,
				// % da bolsa=15 //conjugueEstudaIes = nao
				0.5,
				// % da bolsa=20//conjugueEstudaIes = sim, 
				0.55,
				// % da bolsa=20 //conjugueEstudaIes = nao
				0.45,
				// % da bolsa=25 //conjugueEstudaIes = sim, 
				0.60,
				// % da bolsa=25 //conjugueEstudaIes = nao
				0.40,
				// % da bolsa=30 //conjugueEstudaIes = sim, 
				0.62,
				// % da bolsa=30 //conjugueEstudaIes = nao
				0.38,
				// % da bolsa=35 //conjugueEstudaIes = sim, 
				0.64,
				// % da bolsa=35 //conjugueEstudaIes = nao
				0.36,
				// % da bolsa=40//conjugueEstudaIes = sim, 
				0.66,
				// % da bolsa=40 //conjugueEstudaIes = nao
				0.34,
				// % da bolsa=45 //conjugueEstudaIes = sim, 
				0.68,
				// % da bolsa=45 //conjugueEstudaIes = nao
				0.32,
				// % da bolsa=50 //conjugueEstudaIes = sim, 
				0.70,		
				// % da bolsa=50 //conjugueEstudaIes = nao
				0.30
		}, bolsa);
		FiniteNode irmaoEstudaIes = new FullCPTNode(Variaveis.IRMAO_ESTUDA_IES, new double[] {
				//irmaoEstudaIes = sim, 
				//% da bolsa=10
				0.5,
				//irmaoEstudaIes = nao
				//% da bolsa=10
				0.5,
				//irmaoEstudaIes = sim, 
				// % da bolsa=15
				0.55,
				//irmaoEstudaIes = nao
				// % da bolsa=15
				0.45,
				//irmaoEstudaIes = sim, 
				// % da bolsa=20
				0.60,
				//irmaoEstudaIes = nao
				// % da bolsa=20
				0.40,
				//irmaoEstudaIes = sim, 
				// % da bolsa=25
				0.62,
				//irmaoEstudaIes = nao
				// % da bolsa=25
				0.38,
				//irmaoEstudaIes = sim, 
				// % da bolsa=30
				0.64,
				//irmaoEstudaIes = nao
				// % da bolsa=30
				0.36,
				//irmaoEstudaIes = sim, 
				// % da bolsa=35
				0.66,
				//irmaoEstudaIes = nao
				// % da bolsa=35
				0.34,
				//irmaoEstudaIes = sim, 
				// % da bolsa=40
				0.68,
				//irmaoEstudaIes = nao
				// % da bolsa=40
				0.32,
				//irmaoEstudaIes = sim, 
				// % da bolsa=45
				0.69,
				//irmaoEstudaIes = nao
				// % da bolsa=45
				0.31,
				//irmaoEstudaIes = sim, 
				// % da bolsa=50
				0.70,
				//irmaoEstudaIes = nao
				// % da bolsa=50
				0.30
		},bolsa);
		FiniteNode resideLages = new FullCPTNode(Variaveis.RESIDE_LAGES, new double[] {
			
				//% da bolsa=10 	//resideLages = sim, 
				0.70,
				//% da bolsa=10 				//resideLages = nao
				0.30,
				// % da bolsa=15 	//resideLages = sim, 
				0.65,
				// % da bolsa=15				//resideLages = nao
				0.35,
				// % da bolsa=20	//resideLages = sim, 
				0.60,
				// % da bolsa=20				//resideLages = nao
				0.40,
				// % da bolsa=25	//resideLages = sim, 
				0.55,
				// % da bolsa=25				//resideLages = nao
				0.45,
				// % da bolsa=30	//resideLages = sim, 
				0.50,
				// % da bolsa=30				//resideLages = nao
				0.50,
				// % da bolsa=35	//resideLages = sim, 
				0.45,
				// % da bolsa=35				//resideLages = nao
				0.55,
				// % da bolsa=40	//resideLages = sim, 
				0.40,
				// % da bolsa=40				//resideLages = nao
				0.60,
				// % da bolsa=45	//resideLages = sim, 
				0.20,
				// % da bolsa=45				//resideLages = nao
				0.80,
				// % da bolsa=50	//resideLages = sim, 
				0.10,
				// % da bolsa=50				//resideLages = nao
				0.90
		}, bolsa);
		FiniteNode terImovel = new FullCPTNode(Variaveis.IMOVEL, new double[] {
				
				//% da bolsa=10//terImovel = sim, 
				0.70,
				//% da bolsa=10//terImovel = nao
				0.30,
				// % da bolsa=15//terImovel = sim, 
				0.65,
				// % da bolsa=15//terImovel = nao
				0.35,
				// % da bolsa=20//terImovel = sim, 
				0.60,
				// % da bolsa=20//terImovel = nao
				0.40,
				// % da bolsa=25//terImovel = sim, 
				0.55,
				// % da bolsa=25//terImovel = nao
				0.45,
				// % da bolsa=30//terImovel = sim, 
				0.50,
				// % da bolsa=30//terImovel = nao
				0.50,
				// % da bolsa=35//terImovel = sim, 
				0.45,
				// % da bolsa=35//terImovel = nao
				0.55,
				// % da bolsa=40//terImovel = sim, 
				0.40,
				// % da bolsa=40//terImovel = nao
				0.60,
				// % da bolsa=45//terImovel = sim, 
				0.20,
				// % da bolsa=45//terImovel = nao
				0.80,
				// % da bolsa=50//terImovel = sim, 
				0.10,
				// % da bolsa=50//terImovel = nao
				0.90
		}, bolsa);
		FiniteNode terDoencaGraveNaFamilia = new FullCPTNode(Variaveis.DOENCA_GRAVE_FAMILIA, new double[] {
				//% da bolsa=10//terDoencaGraveNaFamilia = sim, 
				0.40,
				//% da bolsa=10//terDoencaGraveNaFamilia = nao
				0.60,
				// % da bolsa=15//terDoencaGraveNaFamilia = sim, 
				0.45,
				// % da bolsa=15//terDoencaGraveNaFamilia = nao
				0.55,
				// % da bolsa=20//terDoencaGraveNaFamilia = sim, 
				0.50,
				// % da bolsa=20//terDoencaGraveNaFamilia = nao
				0.50,
				// % da bolsa=25//terDoencaGraveNaFamilia = sim, 
				0.55,
				// % da bolsa=25//terDoencaGraveNaFamilia = nao
				0.45,
				// % da bolsa=30//terDoencaGraveNaFamilia = sim, 
				0.60,
				// % da bolsa=30//terDoencaGraveNaFamilia = nao
				0.40,
				// % da bolsa=35//terDoencaGraveNaFamilia = sim, 
				0.65,
				// % da bolsa=35//terDoencaGraveNaFamilia = nao
				0.35,
				// % da bolsa=40//terDoencaGraveNaFamilia = sim, 
				0.70,
				// % da bolsa=40//terDoencaGraveNaFamilia = nao
				0.30,
				// % da bolsa=45//terDoencaGraveNaFamilia = sim, 
				0.75,
				// % da bolsa=45//terDoencaGraveNaFamilia = nao
				0.25,
				// % da bolsa=50//terDoencaGraveNaFamilia = sim, 
				0.80,
				// % da bolsa=50//terDoencaGraveNaFamilia = nao
				0.20
		}, bolsa);
		FiniteNode cursouSegundoGrau = new FullCPTNode(Variaveis.SEGUNDO_GRAU, new double[] {
				//% da bolsa=10//cursouSegundoGrau = Escola Publica, 
				0.10,
				//% da bolsa=10//cursouSegundoGrau = Escola Privada
				0.90,
				// % da bolsa=15//cursouSegundoGrau = Escola Publica, 
				0.13,
				// % da bolsa=15//cursouSegundoGrau = Escola Privada
				0.87,
				// % da bolsa=20//cursouSegundoGrau = Escola Publica, 
				0.25,
				// % da bolsa=20//cursouSegundoGrau = Escola Privada
				0.75,
				// % da bolsa=25//cursouSegundoGrau = Escola Publica, 
				0.55,
				// % da bolsa=25//cursouSegundoGrau = Escola Privada
				0.45,
				// % da bolsa=30//cursouSegundoGrau = Escola Publica, 
				0.60,
				// % da bolsa=30//cursouSegundoGrau = Escola Privada
				0.40,
				// % da bolsa=35//cursouSegundoGrau = Escola Publica, 
				0.65,
				// % da bolsa=35//cursouSegundoGrau = Escola Privada
				0.35,
				// % da bolsa=40//cursouSegundoGrau = Escola Publica, 
				0.70,
				// % da bolsa=40//cursouSegundoGrau = Escola Privada
				0.30,
				// % da bolsa=45//cursouSegundoGrau = Escola Publica, 
				0.80,	
				// % da bolsa=45//cursouSegundoGrau = Escola Privada
				0.20,
				// % da bolsa=50//cursouSegundoGrau = Escola Publica, 
				0.90,
				// % da bolsa=50//cursouSegundoGrau = Escola Privada
				0.10
		}, bolsa);
		FiniteNode rendaFamiliar = new FullCPTNode(Variaveis.RENDA_FAMILIAR, new double[] {
				//Um a tres SM
				//bolsa=10
				0.01,
				//Quatro a dez SM
				//bolsa=10
				0.29,
				//Dez SM acima
				//bolsa=10
				0.70,
				//Um a tres SM
				// bolsa=15
				0.03,
				//Quatro a dez SM
				// bolsa=15
				0.32,
				//Dez SM acima
				// bolsa=15
				0.65,
				//Um a tres SM
				//bolsa=20
				0.15, 
				//Quatro a dez SM
				//bolsa=20
				0.45, 
				//Dez SM acima
				//bolsa=20
				0.40, 	
				//Um a tres SM
				//bolsa=25
				0.20,
				//Quatro a dez SM
				//bolsa=25
				0.50,
				//Dez SM acima
				//bolsa=25
				0.30,				
				//Um a tres SM
				//bolsa=30
				0.35,
				//Quatro a dez SM
				//bolsa=30
				0.40,
				//Dez SM acima
				//bolsa=30
				0.25,
				//Um a tres SM
				//bolsa=35
				0.52,
				//Quatro a dez SM
				//bolsa=35
				0.33,
				//Dez SM acima
				//bolsa=35
				0.15,
				//Um a tres SM
				//bolsa=40
				0.65,
				//Quatro a dez SM
				//bolsa=40
				0.25,
				//Dez SM acima
				//bolsa=40
				0.10,
				//Um a tres SM
				//bolsa=45
				0.75,
				//Quatro a dez SM
				//bolsa=45
				0.23,
				//Dez SM acima
				//bolsa=45
				0.02,
				//Um a tres SM
				//bolsa=50
				0.80,
				//Quatro a dez SM
				//bolsa=50
				0.19,
				//Dez SM acima
				//bolsa=50
				0.01
		}, bolsa);
		FiniteNode faseEmQueEstuda = new FullCPTNode(Variaveis.FASE_ESTUDO, new double[] {
				 
				//% da bolsa=10//faseEmQueEstuda = Primeira a quarta,
				0.54,
				//% da bolsa=10//faseEmQueEstuda = Quinta a setima
				0.36,
				//% da bolsa=10//faseEmQueEstuda = Setima acima
				0.10,
				// % da bolsa=15//faseEmQueEstuda = Primeira a quarta,
				0.56,
				// % da bolsa=15//faseEmQueEstuda = Quinta a setima
				0.35,
				// % da bolsa=15//faseEmQueEstuda = Setima acima
				0.09,
				// % da bolsa=20//faseEmQueEstuda = Primeira a quarta,
				0.58,
				// % da bolsa=20//faseEmQueEstuda = Quinta a setima
				0.34,
				// % da bolsa=20//faseEmQueEstuda = Setima acima
				0.08,
				// % da bolsa=25//faseEmQueEstuda = Primeira a quarta,
				0.60,
				// % da bolsa=25//faseEmQueEstuda = Quinta a setima
				0.33,
				// % da bolsa=25//faseEmQueEstuda = Setima acima
				0.07,
				// % da bolsa=30//faseEmQueEstuda = Primeira a quarta,
				0.62,
				// % da bolsa=30//faseEmQueEstuda = Quinta a setima
				0.32,
				// % da bolsa=30//faseEmQueEstuda = Setima acima
				0.06,
				// % da bolsa=35//faseEmQueEstuda = Primeira a quarta,
				0.64,
				// % da bolsa=35//faseEmQueEstuda = Quinta a setima
				0.31,
				// % da bolsa=35//faseEmQueEstuda = Setima acima
				0.05,
				// % da bolsa=40//faseEmQueEstuda = Primeira a quarta,
				0.66,
				// % da bolsa=40//faseEmQueEstuda = Quinta a setima
				0.30,
				// % da bolsa=40//faseEmQueEstuda = Setima acima
				0.04,
				// % da bolsa=45//faseEmQueEstuda = Primeira a quarta,
				0.68,
				// % da bolsa=45//faseEmQueEstuda = Quinta a setima
				0.29,
				// % da bolsa=45//faseEmQueEstuda = Setima acima
				0.03,
				// % da bolsa=50//faseEmQueEstuda = Primeira a quarta,
				0.70,
				// % da bolsa=50//faseEmQueEstuda = Quinta a setima
				0.28,
				// % da bolsa=50//faseEmQueEstuda = Setima acima
				0.02
		}, bolsa);
		
		
		return new BayesNet(bolsa, rendaFamiliar, trabalha, conjugueEstudaIes, irmaoEstudaIes,
				resideLages, terImovel, terDoencaGraveNaFamilia, faseEmQueEstuda, cursouSegundoGrau);
	}
}