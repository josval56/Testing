package com.testing.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.testing.demo.User.Usuarios_nuevos;


@RestController
@RequestMapping("/Usuarios")
public class Usuarios {

	@GetMapping
		public String Hola() {
		return "Hola Mundo";
	}
	
	@PostMapping
	public ResponseEntity<Usuarios_nuevos>postUsuario(@RequestBody Usuarios_nuevos u){
		Usuarios_nuevos usuario = new Usuarios_nuevos ();
		usuario.setId(u.getId());
		usuario.setNombre(u.getNombre());
		usuario.setApellido(u.getApellido());
		
		return ResponseEntity.ok(usuario);
	
	}
	
	@RequestMapping(value="listado", method = RequestMethod.GET)

	public String Empleado() {
		return "Listado de empleados";
	}
	
	@RequestMapping(value="Saludo", method = RequestMethod.POST)

	public String Saludar(@RequestBody String s) {
		return "Hola " + s.toUpperCase();
	}
}
