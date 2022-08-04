package com.generation.blogpessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.TemaModel;

public interface TemaRepository extends JpaRepository <TemaModel, Long>{
	
	public List <TemaModel> findAllByDescricaoContainingIgnoreCase (String descricao);

    public Optional<TemaModel> findByDescricao(String descricao);

}
