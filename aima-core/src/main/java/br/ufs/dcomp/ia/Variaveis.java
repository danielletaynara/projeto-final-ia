package br.ufs.dcomp.ia;

import aima.core.probability.domain.ArbitraryTokenDomain;
import aima.core.probability.domain.BooleanDomain;
import aima.core.probability.util.RandVar;

public class Variaveis {
	//Problema A	
	public static final RandVar NACIONALIDADE = new RandVar("Nacionalidade",
			new BooleanDomain());
	
	public static final RandVar GOSTA_FUTEBOL = new RandVar("GostaFutebol",
			new BooleanDomain());
	
	public static final RandVar ASSISTE_TV = new RandVar("AssisteTV",
			new ArbitraryTokenDomain("muito", "as vezes", "nunca"));
	
	public static final RandVar IDADE = new RandVar("Idade",
			new ArbitraryTokenDomain("0-30 anos", "31-40 anos", "41-100 anos"));
	/*-------------------------------------------------------------------------------*/
	//Problema B
	public static final RandVar BOLSA = new RandVar("Bolsa",
			new ArbitraryTokenDomain("dez", "quinze", "vinte", "vinte e cinco", "trinta",
					"trinta e cinco", "quarenta", "quarenta e cinco", "cinquenta"));
	public static final RandVar RENDA_FAMILIAR = new RandVar("RendaFamiliar",
			new ArbitraryTokenDomain("Um a tres SM", "Quatro a dez SM", "Dez SM acima"));
	
	public static final RandVar CONJUGUE_ESTUDA_IES = new RandVar("ConjugueEstudaIes",
			new BooleanDomain());
	
	public static final RandVar TRABALHA = new RandVar("Trabalha",
			new BooleanDomain());
	
	public static final RandVar IRMAO_ESTUDA_IES = new RandVar("IrmaoEstudaIes",
			new BooleanDomain());
	public static final RandVar RESIDE_LAGES = new RandVar("ResideLages",
			new BooleanDomain());
	public static final RandVar IMOVEL = new RandVar("Imovel",
			new BooleanDomain());
	public static final RandVar DOENCA_GRAVE_FAMILIA = new RandVar("DoencaGraveFamilia",
			new BooleanDomain());
	public static final RandVar FASE_ESTUDO = new RandVar("FaseEstudo",
			new ArbitraryTokenDomain("Primeira a quarta", "Quinta a setima", "Setima acima"));
	public static final RandVar SEGUNDO_GRAU = new RandVar("SegundoGrau",
			new ArbitraryTokenDomain("Escola Publica", "Escola Privada"));
	
	

}
