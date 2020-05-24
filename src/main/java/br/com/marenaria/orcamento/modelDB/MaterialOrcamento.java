package br.com.marenaria.orcamento.modelDB;

public class MaterialOrcamento {
	
	private int id_material;
	private int qtd;
	private Double valor_material;
	private int orcamento;
	
	public MaterialOrcamento() {}

	public MaterialOrcamento(int id_material, int qtd, Double valor_material, int orcamento) {
		super();
		this.id_material = id_material;
		this.qtd = qtd;
		this.valor_material = valor_material;
		this.orcamento = orcamento;
	}

	public int getId_material() {
		return id_material;
	}

	public void setId_material(int id_material) {
		this.id_material = id_material;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public Double getValor_material() {
		return valor_material;
	}

	public void setValor_material(Double valor_material) {
		this.valor_material = valor_material;
	}

	public int getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(int orcamento) {
		this.orcamento = orcamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_material;
		result = prime * result + orcamento;
		result = prime * result + qtd;
		result = prime * result + ((valor_material == null) ? 0 : valor_material.hashCode());
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
		MaterialOrcamento other = (MaterialOrcamento) obj;
		if (id_material != other.id_material)
			return false;
		if (orcamento != other.orcamento)
			return false;
		if (qtd != other.qtd)
			return false;
		if (valor_material == null) {
			if (other.valor_material != null)
				return false;
		} else if (!valor_material.equals(other.valor_material))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MaterialOrcamento [id_material=" + id_material + ", qtd=" + qtd + ", valor_material=" + valor_material
				+ ", orcamento=" + orcamento + "]";
	}
	
	

}
