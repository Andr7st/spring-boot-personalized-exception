package com.andr7st.app.errors;

public class UsuarioNoEncontradoEception extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuarioNoEncontradoEception(String id) {
		super("El usuario con id ".concat(id).concat(" no existe en el sistema"));
	}
	
	
	
	
	
	
	

}
