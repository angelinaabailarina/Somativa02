package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PetEntities;

public interface PetRepositories extends JpaRepository<PetEntities, Long>  {

}
