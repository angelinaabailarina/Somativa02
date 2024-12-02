package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PetEntities;
import com.example.demo.repository.PetRepositories;

@Service
public class PetServices {
private final PetRepositories petRepositories;
    
    @Autowired
    public PetServices(PetRepositories petRepositories) {
        this.petRepositories = petRepositories;
    }
    
    public PetEntities salvarPetEntities(PetEntities petEntities) {
        return petRepositories.save(petEntities);
    }
    
    public PetEntities buscarPetEntitiesPorId(Long id) {
        return petRepositories.findById(id).orElse(null);
    }
    
    public List<PetEntities> buscarTodosPetEntities(){
        return petRepositories.findAll();
    }
    
}
