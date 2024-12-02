package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ClienteEntities;

public interface ClienteRepositories extends JpaRepository<ClienteEntities, Long> {

}
