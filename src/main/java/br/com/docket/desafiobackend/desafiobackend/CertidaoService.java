package br.com.docket.desafiobackend.desafiobackend;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CertidaoService {
	
	private static final Map<Long, Certidao> certidoes = new LinkedHashMap<>();
	
	static {
		certidoes.put(1L, new Certidao (1L, "2° Via de Certidão de Casamento"));
		certidoes.put(2L, new Certidao (2L, "2° Via de Certidão de Nascimento"));
		certidoes.put(3L, new Certidao (3L, "2° Via de Certidão de Óbito"));
	}
	
	public Collection<Certidao> listarTodas() {
		return certidoes.values();
	}
	
	public Certidao buscarId(Long id) {
		Certidao certidao = certidoes.get(id);
		
		if (certidao == null) {
			throw new CertidaoNaoEncontradaException();
		}
		
		return certidao;
	}
}
