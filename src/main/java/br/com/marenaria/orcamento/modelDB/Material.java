package br.com.marenaria.orcamento.modelDB;

public class Material {
	
	private int id;
	private String nome;
	private String marca; 
	private Double preco;
	private String desc;
	private int status;
	
	public Material() {}

	public Material(int id, String nome, String marca, Double preco, String desc, int status) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.desc = desc;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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
		Material other = (Material) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Material [id=" + id + ", nome=" + nome + ", marca=" + marca + ", preco=" + preco + ", desc=" + desc
				+ ", status=" + status + "]";
	}

	
	
	

}
