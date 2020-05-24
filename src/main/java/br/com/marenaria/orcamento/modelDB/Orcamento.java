package br.com.marenaria.orcamento.modelDB;

import java.util.Date;

public class Orcamento {
	
	private int id;
	private int id_cliente;
	private int id_marceneiro;
	private String descricao;
	private Date data_criacao;
	private Double valor_final;
	
	public Orcamento() {}
	
	public Orcamento(int id, int id_cliente, int id_marceneiro, String descricao, Date data_criacao,
			Double valor_final) {
		super();
		this.id = id;
		this.id_cliente = id_cliente;
		this.id_marceneiro = id_marceneiro;
		this.descricao = descricao;
		this.data_criacao = data_criacao;
		this.valor_final = valor_final;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_marceneiro() {
		return id_marceneiro;
	}
	public void setId_marceneiro(int id_marceneiro) {
		this.id_marceneiro = id_marceneiro;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData_criacao() {
		return data_criacao;
	}
	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}
	public Double getValor_final() {
		return valor_final;
	}
	public void setValor_final(Double valor_final) {
		this.valor_final = valor_final;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orcamento other = (Orcamento) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Orcamento [id=" + id + ", id_cliente=" + id_cliente + ", id_marceneiro=" + id_marceneiro
				+ ", descricao=" + descricao + ", data_criacao=" + data_criacao + ", valor_final=" + valor_final + "]";
	}

	
}
