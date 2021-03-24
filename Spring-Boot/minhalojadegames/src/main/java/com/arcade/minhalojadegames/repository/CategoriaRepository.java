package com.arcade.minhalojadegames.repository;

import java.util.List;

import com.arcade.minhalojadegames.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria,Long>{
        public List<Categoria>findAllByDescricaoCategoriaContainingIgnoreCase(String descricaoCategoria);
     
        public List<Categoria>findAllByNomeCategoriaContainingIgnoreCase(String nomeCategoria);

    }
    

