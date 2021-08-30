package com.rvbraga.sae.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String nome;
	private String rg;
	private String cpf;
	private String nomeMae;
	private LocalDate dataNascimento;
	private LocalDate dataCadastro;
	
	@OneToMany(mappedBy = "clienteId")
	private List<Endereco> enderecos;	

}
