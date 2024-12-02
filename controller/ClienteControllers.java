package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ClienteEntities;
import com.example.demo.service.ClienteServices;

@RestController
@RequestMapping("/Cliente")
public class ClienteControllers {
private final ClienteServices clienteServices;
	
	@Autowired
	public ClienteControllers (ClienteServices clienteServices) {
		this.clienteServices = clienteServices;
	}
	
	@PostMapping("/criar")
	public ClienteEntities criarAgendamento(@RequestBody ClienteEntities clienteEntities) {
		return clienteServices.salvarAgendamento(clienteEntities);
	}
	
	@GetMapping
	public List<ClienteEntities> buscarTodos(){
		return clienteServices.buscarTodosAgendamento();
	}
	
	@GetMapping("/{id}")
	public ClienteEntities buscarPorId(@PathVariable Long id) {
		return clienteServices.buscarAgendamentoPorId(id);
	}
	
}
