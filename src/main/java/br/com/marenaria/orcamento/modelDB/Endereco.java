package br.com.marenaria.orcamento.modelDB;

public class Endereco {
	
	private int id;
	private String estado;
	private String cidade;
	private String logradouro;
	private String endereco;
	private String numero;
	private String complemento;
	private int id_cliente;
	
	public Endereco() {}
	
	
	public Endereco(int id, String estado, String cidade, String logradouro, String endereco, String numero,
			String complemento, int id_cliente) {
		super();
		this.id = id;
		this.estado = estado;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.id_cliente = id_cliente;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
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
		Endereco other = (Endereco) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Endereco [id=" + id + ", estado=" + estado + ", cidade=" + cidade + ", logradouro=" + logradouro
				+ ", endereco=" + endereco + ", numero=" + numero + ", complemento=" + complemento + ", id_cliente="
				+ id_cliente + "]";
	}
	
	

}
