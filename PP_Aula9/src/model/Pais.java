package model;

import java.io.Serializable;

public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private String populacao;
	private String area;

	public Pais() {
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

	public String getFone() {
		return populacao;
	}

	public void setFone(String populacao) {
		this.populacao = populacao;
	}

	public String getEmail() {
		return area;
	}

	public void setEmail(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", populacao=" + populacao
				+ ", area=" + area + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (populacao == null) {
			if (other.populacao != null)
				return false;
		} else if (!populacao.equals(other.populacao))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public void setPopulacao(String string) {
	
		
	}

	public void setArea(String string) {
		
		
	}

	public String getPopulacao() {
	
		return null;
	}

	public String getArea() {
	
		return null;
	}
}