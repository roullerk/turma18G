package com.farmacia.farmacia_on.controller;

import java.util.List;

import com.farmacia.farmacia_on.model.Produto;
import com.farmacia.farmacia_on.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1/produto")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/todos")
    public ResponseEntity<List<Produto>> findAllProduto(){
        return ResponseEntity.ok(produtoRepository.findAll());
    }

    @GetMapping("/buscarporid/{idProduto}")
    public ResponseEntity<Produto> findByIdProduto(@PathVariable Long idProduto){
        return produtoRepository.findById(idProduto)
        .map(resp -> ResponseEntity.ok(resp))
        .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/descricao/{descricao}")
    public ResponseEntity<List<Produto>> findByDescricaoTitulo(@PathVariable String descricaoTitulo){
        return ResponseEntity.ok(produtoRepository.findAllByDescricaoTituloContainingIgnoreCase(descricaoTitulo));
    }
    @PostMapping("/criar")
    public Produto postProduto(@PathVariable Produto produto){
        return produtoRepository.save(produto);
    }

    @PutMapping("/editar")
    public ResponseEntity<Produto> putProduto(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto));
    }

    @DeleteMapping("/deletar/{idProduto}")
    public void deleteProduto(@PathVariable Long idProduto){
        produtoRepository.deleteById(idProduto);
    }
}
