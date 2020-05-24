package br.com.marenaria.orcamento.modelDB;

import java.util.Date;

public class Marceneiro {
	
	private int id ;
	private String nome ;
	private String email;
	private String telefone;
	private String documento;
	private Date data_nascimento;
	private String perfil;
	private int  status;
	
	public Marceneiro() {}
	
	public Marceneiro(int id, String nome, String email, String telefone, String documento, Date data_nascimento,
			int status) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.documento = documento;
		this.data_nascimento = data_nascimento;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	
	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
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
		Marceneiro other = (Marceneiro) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Marceneiro [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
				+ ", documento=" + documento + ", data_nascimento=" + data_nascimento + ", perfil=" + perfil
				+ ", status=" + status + "]";
	}


}
