package com.arcade.minhalojadegames.repository;

import java.util.List;

import com.arcade.minhalojadegames.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    public List<Produto>findAllByDescricaoTituloProdutoContainingIgnoreCase(String tituloProduto);
}
