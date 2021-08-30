package com.rvbraga.sae.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Endereco implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	private String tipoEndereco;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente clienteId;
	

}
