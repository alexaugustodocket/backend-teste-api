package br.com.docket.desafiobackend.desafiobackend;

import java.util.Objects;
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Certidao certidao = (Certidao) o;
		return Objects.equals(id, certidao.id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
