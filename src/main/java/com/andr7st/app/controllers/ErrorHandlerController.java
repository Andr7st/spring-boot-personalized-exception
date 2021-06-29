package com.andr7st.app.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.andr7st.app.errors.UsuarioNoEncontradoEception;

@ControllerAdvice
public class ErrorHandlerController {
	
	@ExceptionHandler(UsuarioNoEncontradoEception.class)
	public String usuarioNoEncontradoEception(UsuarioNoEncontradoEception ex, Model model) {
		
		//model.addAttribute(null, model);
		model.addAttribute("error", "Usuario no existe");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());


		return "error/usuario";
	}

}
