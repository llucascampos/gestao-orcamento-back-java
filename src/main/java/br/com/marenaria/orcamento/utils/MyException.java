package br.com.marenaria.orcamento.utils;

public class MyException extends RuntimeException {
	
	public MyException(String mensagem) {
		super(mensagem);
	}
	
	public MyException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
