package com.arcade.minhalojadegames.controller;

import java.util.List;

import com.arcade.minhalojadegames.model.Categoria;
import com.arcade.minhalojadegames.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/games/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaRepository repository;

    @GetMapping("/todas")
    public ResponseEntity<List<Categoria>> findAllCategoria(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/buscarporid/{id}")
    public ResponseEntity<Categoria> findByIdCategoria(@PathVariable Long idCategoria){
        return repository.findById(idCategoria)
        .map(resp -> ResponseEntity.ok(resp))
        .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/descricao/{descricao}")
    public ResponseEntity<List<Categoria>> findByDescricaoCategoria(@PathVariable String descricaoCategoria){
        return ResponseEntity.ok(repository.findAllByDescricaoCategoriaContainingIgnoreCase(descricaoCategoria));
    }
    @PostMapping("/criar")
    public ResponseEntity<Categoria> postCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
    }
    @PostMapping("/editar")
    public ResponseEntity<Categoria> putCategoria(@RequestBody Categoria categoria){
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
    }
    @DeleteMapping("/deletar/{id}")
    public void deleteCategoria(@PathVariable Long idCategoria){
        repository.deleteById(idCategoria);
    }
}
