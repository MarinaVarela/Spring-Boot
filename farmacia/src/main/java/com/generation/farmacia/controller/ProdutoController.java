package com.generation.farmacia.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.farmacia.model.ProdModel;
import com.generation.farmacia.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping("/preco_incial/{inicio}/preco_final/{fim}")
	public ResponseEntity<List<ProdModel>> getByPrecoEntre(@PathVariable BigDecimal inicio,
			@PathVariable BigDecimal fim) {
		return ResponseEntity.ok(produtoRepository.buscarProdutosEntre(inicio, fim));
	}

}
