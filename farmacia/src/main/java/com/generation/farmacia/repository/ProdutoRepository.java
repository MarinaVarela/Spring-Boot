package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.ProdModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdModel, Long> {
	public List <ProdModel> buscarProdutosEntre(@Param("inicio") 
	BigDecimal inicio, @Param("fim") BigDecimal fim);
}