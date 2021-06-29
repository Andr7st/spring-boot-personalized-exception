package com.andr7st.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.andr7st.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioServiceInterface {

	private List<Usuario> lista;

	public UsuarioServiceImpl() {

		this.lista = new ArrayList<>();

		this.lista.add(new Usuario(1, "Andres", "Segura"));
		this.lista.add(new Usuario(2, "Diana", "Sambrano"));
		this.lista.add(new Usuario(3, "Lina", "Ramirez"));
		this.lista.add(new Usuario(4, "Jose", "Marin"));
		this.lista.add(new Usuario(5, "Sara", "Gutierrez"));
		this.lista.add(new Usuario(6, "Jotge", "Zambrano"));
		this.lista.add(new Usuario(7, "Luis", "Ruiz"));

	}

	@Override
	public List<Usuario> listar() {
		
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		
		Usuario resultado = null;
		
		for(Usuario u: this.lista) {
			
			if(u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		
		return resultado;
	}

	
	
	// Propio de java8
	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {

		Usuario usuario = this.obtenerPorId(id);
		
		return Optional.ofNullable(usuario); // explicacion en video 
	}

}










