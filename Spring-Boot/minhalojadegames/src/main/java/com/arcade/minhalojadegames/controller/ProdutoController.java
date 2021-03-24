package com.arcade.minhalojadegames.controller;

import java.util.List;

import com.arcade.minhalojadegames.model.Produto;
import com.arcade.minhalojadegames.repository.ProdutoRepository;

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
@RequestMapping("/produto")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/todos")
    public ResponseEntity<List<Produto>> findAllProduto(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/buscarporid/{id}")
    public ResponseEntity<Produto> findByIdProduto(@PathVariable Long idProduto){
    return repository.findById(idProduto)
        .map(resp -> ResponseEntity.ok(resp))
        .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/titulo/{}")
    public ResponseEntity<List<Produto>> findByDescricaoTitulo(@PathVariable String tituloProduto){
        return ResponseEntity.ok(repository.findAllByDescricaoTituloProdutoContainingIgnoreCase(tituloProduto));
    }

    @PostMapping("/criar")
    public ResponseEntity<Produto> postProduto(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
    }

    @PutMapping("/editar")
    public ResponseEntity<Produto> putProduto(@RequestBody Produto produto){
       return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
    }

    @DeleteMapping("/deletar/{idProduto}") 
    public void deleteProduto(@PathVariable Long idProduto){
        repository.deleteById(idProduto);
    }

}
