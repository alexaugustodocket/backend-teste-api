package br.com.docket.desafiobackend.desafiobackend;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
class CertidaoNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

}