package com.banca.mifel.models.services;

import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public class AbstractPokemonService {
	
	protected final RestTemplate restTemplate;
	protected AbstractPokemonService(RestTemplate restTemplate) {this.restTemplate = restTemplate;}
	
	protected HttpHeaders buildAuthToken(String token) {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		return headers;
	}

}
