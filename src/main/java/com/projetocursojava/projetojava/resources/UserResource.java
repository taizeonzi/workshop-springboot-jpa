package com.projetocursojava.projetojava.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetocursojava.projetojava.entities.User;

@RestController //para marcar que essa classe é um recurso web, implementado por um controlador rest
@RequestMapping(value = "/users")//nome do recurso
public class UserResource {

	@GetMapping //indica que esse método responde a requisição do tipo GET do HTTP
	public ResponseEntity<User> findAll() { //endpoint para acessar os usuários
		User u = new User(1L, "Maria", "maria@gmail.com", "998815", "12345");
		return ResponseEntity.ok().body(u);
	}
}
