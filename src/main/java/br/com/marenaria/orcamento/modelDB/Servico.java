package br.com.marenaria.orcamento.modelDB;

import java.util.Date;

public class Servico {

	private int id;
	private int id_orcamento;
	private Date data_inicio;
	private Date data_fim;
	private String observacao;
	
	public Servico() {}

	public Servico(int id, int id_orcamento, Date data_inicio, Date data_fim, String observacao) {
		super();
		this.id = id;
		this.id_orcamento = id_orcamento;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.observacao = observacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_orcamento() {
		return id_orcamento;
	}

	public void setId_orcamento(int id_orcamento) {
		this.id_orcamento = id_orcamento;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_fim == null) ? 0 : data_fim.hashCode());
		result = prime * result + ((data_inicio == null) ? 0 : data_inicio.hashCode());
		result = prime * result + id;
		result = prime * result + id_orcamento;
		result = prime * result + ((observacao == null) ? 0 : observacao.hashCode());
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
		Servico other = (Servico) obj;
		if (data_fim == null) {
			if (other.data_fim != null)
				return false;
		} else if (!data_fim.equals(other.data_fim))
			return false;
		if (data_inicio == null) {
			if (other.data_inicio != null)
				return false;
		} else if (!data_inicio.equals(other.data_inicio))
			return false;
		if (id != other.id)
			return false;
		if (id_orcamento != other.id_orcamento)
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Servico [id=" + id + ", id_orcamento=" + id_orcamento + ", data_inicio=" + data_inicio + ", data_fim="
				+ data_fim + ", observacao=" + observacao + "]";
	}
	
	
}
