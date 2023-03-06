package com.banca.mifel.models.services;

import com.banca.mifel.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
