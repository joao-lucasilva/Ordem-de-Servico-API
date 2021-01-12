package com.example.demo.controeller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.model.Cliente;

@RestController
public class ClienteController {
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João da Silva");
		cliente1.setTelefone("123456");
		cliente1.setEmail("joaodasilva@algaworks.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(1L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("654321");
		cliente2.setEmail("mariadasilva@algaworks.com");
		return Arrays.asList(cliente1, cliente2);
	}
}
