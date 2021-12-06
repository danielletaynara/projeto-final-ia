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
			new ArbitraryTokenDomain(new VariavelRedeBaysianaString("Um a tres SM", "dez"), 
									 new VariavelRedeBaysianaString("Um a tres SM", "quinze"),
									 new VariavelRedeBaysianaString("Um a tres SM", "vinte"),
									 new VariavelRedeBaysianaString("Um a tres SM", "vinte e cinco"),
									 new VariavelRedeBaysianaString("Um a tres SM", "trinta"),
									 new VariavelRedeBaysianaString("Um a tres SM", "trinta e cinco"),
									 new VariavelRedeBaysianaString("Um a tres SM", "quarenta"),
									 new VariavelRedeBaysianaString("Um a tres SM", "quarenta e cinco"),
									 new VariavelRedeBaysianaString("Um a tres SM", "cinquenta"),
									 new VariavelRedeBaysianaString("Quatro a dez SM", "dez"), 
									 new VariavelRedeBaysianaString("Quatro a dez SM", "quinze"),
									 new VariavelRedeBaysianaString("Quatro a dez SM", "vinte"),
									 new VariavelRedeBaysianaString("Quatro a dez SM", "vinte e cinco"),
									 new VariavelRedeBaysianaString("Quatro a dez SM", "trinta"),
									 new VariavelRedeBaysianaString("Quatro a dez SM", "trinta e cinco"),
									 new VariavelRedeBaysianaString("Quatro a dez SM", "quarenta"),
									 new VariavelRedeBaysianaString("Quatro a dez SM", "quarenta e cinco"),
									 new VariavelRedeBaysianaString("Quatro a dez SM", "cinquenta"),
									 new VariavelRedeBaysianaString("Dez SM acima", "dez"), 
									 new VariavelRedeBaysianaString("Dez SM acima", "quinze"),
									 new VariavelRedeBaysianaString("Dez SM acima", "vinte"),
									 new VariavelRedeBaysianaString("Dez SM acima", "vinte e cinco"),
									 new VariavelRedeBaysianaString("Dez SM acima", "trinta"),
									 new VariavelRedeBaysianaString("Dez SM acima", "trinta e cinco"),
									 new VariavelRedeBaysianaString("Dez SM acima", "quarenta"),
									 new VariavelRedeBaysianaString("Dez SM acima", "quarenta e cinco"),
									 new VariavelRedeBaysianaString("Dez SM acima", "cinquenta")
									 ));
	public static final RandVar CONJUGUE_ESTUDA_IES = new RandVar("ConjugueEstudaIes",
			new ArbitraryTokenDomain(new VariavelRedeBayesianaBoolean(true, "dez"),
									 new VariavelRedeBayesianaBoolean(true, "quinze"),
									 new VariavelRedeBayesianaBoolean(true, "vinte"),
									 new VariavelRedeBayesianaBoolean(true, "vinte e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "trinta"),
									 new VariavelRedeBayesianaBoolean(true, "trinta e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "quarenta"),
									 new VariavelRedeBayesianaBoolean(true, "quarenta e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "cinquenta"),
									 new VariavelRedeBayesianaBoolean(false, "dez"),
									 new VariavelRedeBayesianaBoolean(false, "quinze"),
									 new VariavelRedeBayesianaBoolean(false, "vinte"),
									 new VariavelRedeBayesianaBoolean(false, "vinte e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "trinta"),
									 new VariavelRedeBayesianaBoolean(false, "trinta e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "quarenta"),
									 new VariavelRedeBayesianaBoolean(false, "quarenta e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "cinquenta")));
	public static final RandVar TRABALHA = new RandVar("Trabalha",
			new ArbitraryTokenDomain(new VariavelRedeBayesianaBoolean(true, "dez"),
									 new VariavelRedeBayesianaBoolean(true, "quinze"),
									 new VariavelRedeBayesianaBoolean(true, "vinte"),
									 new VariavelRedeBayesianaBoolean(true, "vinte e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "trinta"),
									 new VariavelRedeBayesianaBoolean(true, "trinta e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "quarenta"),
									 new VariavelRedeBayesianaBoolean(true, "quarenta e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "cinquenta"),
									 new VariavelRedeBayesianaBoolean(false, "dez"),
									 new VariavelRedeBayesianaBoolean(false, "quinze"),
									 new VariavelRedeBayesianaBoolean(false, "vinte"),
									 new VariavelRedeBayesianaBoolean(false, "vinte e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "trinta"),
									 new VariavelRedeBayesianaBoolean(false, "trinta e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "quarenta"),
									 new VariavelRedeBayesianaBoolean(false, "quarenta e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "cinquenta")));
	public static final RandVar IRMAO_ESTUDA_IES = new RandVar("IrmaoEstudaIes",
			new ArbitraryTokenDomain(new VariavelRedeBayesianaBoolean(true, "dez"),
									 new VariavelRedeBayesianaBoolean(true, "quinze"),
									 new VariavelRedeBayesianaBoolean(true, "vinte"),
									 new VariavelRedeBayesianaBoolean(true, "vinte e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "trinta"),
									 new VariavelRedeBayesianaBoolean(true, "trinta e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "quarenta"),
									 new VariavelRedeBayesianaBoolean(true, "quarenta e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "cinquenta"),
									 new VariavelRedeBayesianaBoolean(false, "dez"),
									 new VariavelRedeBayesianaBoolean(false, "quinze"),
									 new VariavelRedeBayesianaBoolean(false, "vinte"),
									 new VariavelRedeBayesianaBoolean(false, "vinte e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "trinta"),
									 new VariavelRedeBayesianaBoolean(false, "trinta e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "quarenta"),
									 new VariavelRedeBayesianaBoolean(false, "quarenta e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "cinquenta")));
	public static final RandVar RESIDE_LAGES = new RandVar("ResideLages",
			new ArbitraryTokenDomain(new VariavelRedeBayesianaBoolean(true, "dez"),
									 new VariavelRedeBayesianaBoolean(true, "quinze"),
									 new VariavelRedeBayesianaBoolean(true, "vinte"),
									 new VariavelRedeBayesianaBoolean(true, "vinte e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "trinta"),
									 new VariavelRedeBayesianaBoolean(true, "trinta e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "quarenta"),
									 new VariavelRedeBayesianaBoolean(true, "quarenta e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "cinquenta"),
									 new VariavelRedeBayesianaBoolean(false, "dez"),
									 new VariavelRedeBayesianaBoolean(false, "quinze"),
									 new VariavelRedeBayesianaBoolean(false, "vinte"),
									 new VariavelRedeBayesianaBoolean(false, "vinte e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "trinta"),
									 new VariavelRedeBayesianaBoolean(false, "trinta e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "quarenta"),
									 new VariavelRedeBayesianaBoolean(false, "quarenta e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "cinquenta")));
	public static final RandVar IMOVEL = new RandVar("Imovel",
			new ArbitraryTokenDomain(new VariavelRedeBayesianaBoolean(true, "dez"),
									 new VariavelRedeBayesianaBoolean(true, "quinze"),
									 new VariavelRedeBayesianaBoolean(true, "vinte"),
									 new VariavelRedeBayesianaBoolean(true, "vinte e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "trinta"),
									 new VariavelRedeBayesianaBoolean(true, "trinta e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "quarenta"),
									 new VariavelRedeBayesianaBoolean(true, "quarenta e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "cinquenta"),
									 new VariavelRedeBayesianaBoolean(false, "dez"),
									 new VariavelRedeBayesianaBoolean(false, "quinze"),
									 new VariavelRedeBayesianaBoolean(false, "vinte"),
									 new VariavelRedeBayesianaBoolean(false, "vinte e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "trinta"),
									 new VariavelRedeBayesianaBoolean(false, "trinta e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "quarenta"),
									 new VariavelRedeBayesianaBoolean(false, "quarenta e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "cinquenta")));
	public static final RandVar DOENCA_GRAVE_FAMILIA = new RandVar("DoencaGraveFamilia",
			new ArbitraryTokenDomain(new VariavelRedeBayesianaBoolean(true, "dez"),
									 new VariavelRedeBayesianaBoolean(true, "quinze"),
									 new VariavelRedeBayesianaBoolean(true, "vinte"),
									 new VariavelRedeBayesianaBoolean(true, "vinte e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "trinta"),
									 new VariavelRedeBayesianaBoolean(true, "trinta e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "quarenta"),
									 new VariavelRedeBayesianaBoolean(true, "quarenta e cinco"),
									 new VariavelRedeBayesianaBoolean(true, "cinquenta"),
									 new VariavelRedeBayesianaBoolean(false, "dez"),
									 new VariavelRedeBayesianaBoolean(false, "quinze"),
									 new VariavelRedeBayesianaBoolean(false, "vinte"),
									 new VariavelRedeBayesianaBoolean(false, "vinte e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "trinta"),
									 new VariavelRedeBayesianaBoolean(false, "trinta e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "quarenta"),
									 new VariavelRedeBayesianaBoolean(false, "quarenta e cinco"),
									 new VariavelRedeBayesianaBoolean(false, "cinquenta")));
	public static final RandVar FASE_ESTUDO = new RandVar("FaseEstudo",
			new ArbitraryTokenDomain(new VariavelRedeBaysianaString("Primeira a quarta", "dez"), 
					 new VariavelRedeBaysianaString("Primeira a quarta", "quinze"),
					 new VariavelRedeBaysianaString("Primeira a quarta", "vinte"),
					 new VariavelRedeBaysianaString("Primeira a quarta", "vinte e cinco"),
					 new VariavelRedeBaysianaString("Primeira a quarta", "trinta"),
					 new VariavelRedeBaysianaString("Primeira a quarta", "trinta e cinco"),
					 new VariavelRedeBaysianaString("Primeira a quarta", "quarenta"),
					 new VariavelRedeBaysianaString("Primeira a quarta", "quarenta e cinco"),
					 new VariavelRedeBaysianaString("Primeira a quarta", "cinquenta"),
					 new VariavelRedeBaysianaString("Quinta a setima", "dez"), 
					 new VariavelRedeBaysianaString("Quinta a setima", "quinze"),
					 new VariavelRedeBaysianaString("Quinta a setima", "vinte"),
					 new VariavelRedeBaysianaString("Quinta a setima", "vinte e cinco"),
					 new VariavelRedeBaysianaString("Quinta a setima", "trinta"),
					 new VariavelRedeBaysianaString("Quinta a setima", "trinta e cinco"),
					 new VariavelRedeBaysianaString("Quinta a setima", "quarenta"),
					 new VariavelRedeBaysianaString("Quinta a setima", "quarenta e cinco"),
					 new VariavelRedeBaysianaString("Quinta a setima", "cinquenta"),
					 new VariavelRedeBaysianaString("Setima acima", "dez"), 
					 new VariavelRedeBaysianaString("Setima acima", "quinze"),
					 new VariavelRedeBaysianaString("Setima acima", "vinte"),
					 new VariavelRedeBaysianaString("Setima acima", "vinte e cinco"),
					 new VariavelRedeBaysianaString("Setima acima", "trinta"),
					 new VariavelRedeBaysianaString("Setima acima", "trinta e cinco"),
					 new VariavelRedeBaysianaString("Setima acima", "quarenta"),
					 new VariavelRedeBaysianaString("Dez SM acima", "quarenta e cinco"),
					 new VariavelRedeBaysianaString("Setima acima", "cinquenta")
					 ));
	public static final RandVar SEGUNDO_GRAU = new RandVar("SegundoGrau",
	new ArbitraryTokenDomain(new VariavelRedeBaysianaString("Escola Publica", "dez"), 
			 new VariavelRedeBaysianaString("Escola Publica", "quinze"),
			 new VariavelRedeBaysianaString("Escola Publica", "vinte"),
			 new VariavelRedeBaysianaString("Escola Publica", "vinte e cinco"),
			 new VariavelRedeBaysianaString("Escola Publica", "trinta"),
			 new VariavelRedeBaysianaString("Escola Publica", "trinta e cinco"),
			 new VariavelRedeBaysianaString("Escola Publica", "quarenta"),
			 new VariavelRedeBaysianaString("Escola Publica", "quarenta e cinco"),
			 new VariavelRedeBaysianaString("Escola Publica", "cinquenta"),
			 new VariavelRedeBaysianaString("Escola Privada", "quinze"),
			 new VariavelRedeBaysianaString("Escola Privada", "vinte"),
			 new VariavelRedeBaysianaString("Escola Privada", "vinte e cinco"),
			 new VariavelRedeBaysianaString("Escola Privada", "trinta"),
			 new VariavelRedeBaysianaString("Escola Privada", "trinta e cinco"),
			 new VariavelRedeBaysianaString("Escola Privada", "quarenta"),
			 new VariavelRedeBaysianaString("Escola Privada", "quarenta e cinco"),
			 new VariavelRedeBaysianaString("Escola Privada", "cinquenta")
			 ));
	

}
