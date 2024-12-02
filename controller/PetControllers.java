package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PetEntities;
import com.example.demo.service.PetServices;

@RestController
@RequestMapping("/Servico")
public class PetControllers {
private final PetServices petServices;
	
	@Autowired
	public PetControllers (PetServices petServices) {
		this.petServices = petServices;
	}
	
	@PostMapping("/criar")
	public PetEntities criarServico(@RequestBody PetEntities petEntities) {
		return petServices.salvarPetEntities(petEntities);
	}
	
	@GetMapping
	public List<PetEntities> buscarTodos(){
		return petServices.buscarTodosPetEntities();
	}
	
	@GetMapping("/{id}")
	public PetEntities buscarPorId(@PathVariable Long id) {
		return petServices.buscarPetEntitiesPorId(id);
	}
	

}
