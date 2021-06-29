package com.andr7st.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.andr7st.app.errors.UsuarioNoEncontradoEception;
import com.andr7st.app.models.domain.Usuario;
import com.andr7st.app.services.UsuarioServiceImpl;
//import com.andr7st.app.services.UsuarioServiceInterface;

@Controller
public class AppController {

	@Autowired
	private UsuarioServiceImpl usuarioService;
	
	@GetMapping({"","/index"})
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id, Model model) {
		/*
		Usuario usuario = usuarioService.obtenerPorId(id);
		if(usuario == null) {
			throw new UsuarioNoEncontradoEception(id.toString());
		}*/
		
		
		Usuario usuario = usuarioService.obtenerPorIdOptional(id)
				.orElseThrow(() -> new UsuarioNoEncontradoEception(id.toString()));

		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Detalle usuario: ".concat(usuario.getNombre()));
		
		return "ver";
	}
}
