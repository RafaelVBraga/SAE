package com.rvbraga.sae.controllers;

import java.util.List;
import java.util.UUID;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rvbraga.sae.models.Cliente;
import com.rvbraga.sae.services.ClienteService;

@RestController
@RequestMapping("sae/cliente/")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("{clienteId}")
	public ResponseEntity<Cliente> find(@PathVariable("clienteId") UUID clienteId) {
		
		return ResponseEntity.status(HttpStatus.OK).body(clienteService.findById(clienteId));
	}
	
	@PostMapping("")
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(cliente));
	}
	
	@GetMapping("")
	public ResponseEntity<List<Cliente>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(clienteService.findAll());
	}
	@GetMapping("procurar")
	public ResponseEntity<List<Cliente>> findByNome(@RequestBody String nome) {
		
		return ResponseEntity.status(HttpStatus.OK).body(clienteService.findByNome(nome));
	}
}
