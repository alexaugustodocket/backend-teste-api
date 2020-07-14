package br.com.docket.desafiobackend.desafiobackend;

import java.util.UUID;

public class Certidao {
	
	final Long id;
	final String nome;
	
	public Certidao(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Long getId() {
		return id;
	}
}
