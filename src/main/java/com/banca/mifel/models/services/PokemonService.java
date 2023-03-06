package com.banca.mifel.models.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService extends AbstractPokemonService implements IPokemonService{
	
	public PokemonService(RestTemplate restTemplate) {
		super(restTemplate);
	}

	@Override
	public Object consultarPokemon() {

		String uri ="https://pokeapi.co/api/v2/pokemon/ditto";
		//log.info("Traemlos la información de la API: {}", uri);
		Object responsePokemon = restTemplate.getForObject(uri, Object.class);
		return responsePokemon;
	}

}
