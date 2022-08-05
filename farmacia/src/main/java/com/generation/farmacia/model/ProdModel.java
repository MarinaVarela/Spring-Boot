package com.generation.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class ProdModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Nome é obrigatório.")
	private String nomeProduto;

	private int quantidade;

	@Positive(message = "Digite um valor maior do que zero.")
	private BigDecimal preco;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private CategoriaModel categoria;
}
