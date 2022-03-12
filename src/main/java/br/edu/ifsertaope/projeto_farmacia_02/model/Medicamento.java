package br.edu.ifsertaope.projeto_farmacia_02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicamento {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="bula")
	private String bula;
	
	@Column(name="quantidade")
	private int quantidade;
	
	@Column(name="receitaDoUsuario")
	private String receitaDoUsuario;
	
	public Medicamento() {
		
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

	public String getBula() {
		return bula;
	}

	public void setBula(String bula) {
		this.bula = bula;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getReceitaDoUsuario() {
		return receitaDoUsuario;
	}

	public void setReceitaDoUsuario(String receitaDoUsuario) {
		this.receitaDoUsuario = receitaDoUsuario;
	}
}
