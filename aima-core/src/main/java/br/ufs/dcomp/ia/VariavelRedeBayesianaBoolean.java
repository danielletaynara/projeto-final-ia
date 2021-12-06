package br.ufs.dcomp.ia;

public class VariavelRedeBayesianaBoolean {
	private boolean variavel;
	private String bolsa;
	
	public VariavelRedeBayesianaBoolean(boolean variavel, String bolsa) {
		this.variavel = variavel;
		this.bolsa = bolsa;
	}

	public boolean isTrabalha() {
		return variavel;
	}

	public void setTrabalha(boolean variavel) {
		this.variavel = variavel;
	}

	public String getBolsa() {
		return bolsa;
	}

	public void setBolsa(String bolsa) {
		this.bolsa = bolsa;
	}
	
}
