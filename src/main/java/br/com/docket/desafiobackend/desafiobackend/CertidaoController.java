package br.com.docket.desafiobackend.desafiobackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/v1/certidoes")
public class CertidaoController {
	
	private final CertidaoService certidoes;
	
	public CertidaoController(CertidaoService certidoes) {
		this.certidoes = certidoes;
	}
	
	@GetMapping
	public Collection<Certidao> certidoes() {
		return certidoes.listarTodas();
	}
	
	@GetMapping("/{id}")
	public Certidao certidoesId(@PathVariable Long id) {
		return certidoes.buscarId(id);
	}
}
