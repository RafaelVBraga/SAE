package com.rvbraga.sae.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rvbraga.sae.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,UUID>{

	List<Cliente> findByNomeContainingIgnoreCase(String nome);

}
