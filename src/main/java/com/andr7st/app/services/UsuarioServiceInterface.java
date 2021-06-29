package com.andr7st.app.services;

import java.util.List;
import java.util.Optional;

import com.andr7st.app.models.domain.Usuario;

public interface UsuarioServiceInterface {
	
	public List<Usuario> listar();
	public Usuario obtenerPorId(Integer id);
	
	
	public Optional<Usuario> obtenerPorIdOptional(Integer id);

}
