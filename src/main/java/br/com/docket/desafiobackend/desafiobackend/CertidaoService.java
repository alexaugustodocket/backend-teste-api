package br.com.docket.desafiobackend.desafiobackend;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CertidaoService {
	
	private final List<Certidao> certidoes = Arrays.asList(
			new Certidao (1L, "2° Via de Certidão de Casamento"),
			new Certidao (2L, "2° Via de Certidão de Nascimento"),
			new Certidao (3L, "2° Via de Certidão de Óbito")
	);
	
	public List<Certidao> listarTodas() {
		return certidoes;
	}
}
