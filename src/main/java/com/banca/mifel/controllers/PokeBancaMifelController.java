package com.banca.mifel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banca.mifel.models.services.IPokemonService;

@CrossOrigin(origins = { "http://localhost:8080/**" })
@RestController
@RequestMapping("/api")
public class PokeBancaMifelController {
	
	
	@Autowired
	IPokemonService pokemonService;
	
	@GetMapping("/pokemonDitto")
	public Object getPokemonDitton() {
		return pokemonService.consultarPokemon();
	}

}
