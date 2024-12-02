package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ClienteEntities;
import com.example.demo.repository.ClienteRepositories;

@Service
public class ClienteServices {
		
		private final ClienteRepositories clienteRepositories;
			
			@Autowired
			public ClienteServices(ClienteRepositories clienteRepositories) {
				this.clienteRepositories = clienteRepositories;
			}
			
			public ClienteEntities salvarAgendamento(ClienteEntities clienteEntities) {
				return clienteRepositories.save(clienteEntities);
			}
			
			public ClienteEntities buscarAgendamentoPorId(Long Id) {
				return clienteRepositories.findById(Id).orElse(null);
			}
			
			public List<ClienteEntities> buscarTodosAgendamento(){
				return clienteRepositories.findAll();
			}
			
			
			

		

		


}
