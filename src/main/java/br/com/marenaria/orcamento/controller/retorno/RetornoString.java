package br.com.marenaria.orcamento.controller.retorno;

public class RetornoString {

	private String menssagem;
	
	public RetornoString() {}
	
	public RetornoString(String retorno) {
		this.menssagem = retorno;	
	}

	public String getRetorno() {
		return menssagem;
	}

	public void setRetorno(String retorno) {
		this.menssagem = retorno;
	}
	
	
}
