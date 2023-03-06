package com.banca.mifel.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banca.mifel.models.services.ICodificacionService;

@CrossOrigin(origins = { "http://localhost:8080/**" })
@RestController
@RequestMapping("/api")
public class CodificacionController {
	

	@Autowired
	ICodificacionService codificacionService;
	
	@GetMapping("/codificar")
	public ResponseEntity<Map<String, Object>> codificar(@RequestParam(value="cadena", required=false) String cadena) {
		
		Map<String, Object> response = new HashMap<>();
		try {
			response.put("Cadena Codificada", codificacionService.codificar(cadena.getBytes()).toString());
		}catch (Exception e) {
			response.put("mensaje", "Error al codificar la cadena");
			response.put("error", e.getMessage().concat(": ").concat(e.getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

}
