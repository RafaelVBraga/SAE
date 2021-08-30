package com.rvbraga.sae.services;

import java.util.List;
import java.util.UUID;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rvbraga.sae.models.Cliente;
import com.rvbraga.sae.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public Cliente findById(UUID id) {
		return repository.findById(id).get();
	}

	public Cliente save(Cliente cliente) {		
		return repository.save(cliente);
	}
	
	public void delete(Cliente cliente) {
		repository.delete(cliente);
	}
	
	public List<Cliente> findAll(){
		return repository.findAll();
	}
 
	public List<Cliente> findByNome(String nome) {
		JSONObject json = new JSONObject(nome);	
		//return repository.findAll();
		return repository.findByNomeContainingIgnoreCase(json.getString("nome"));
	}
	
	
}
