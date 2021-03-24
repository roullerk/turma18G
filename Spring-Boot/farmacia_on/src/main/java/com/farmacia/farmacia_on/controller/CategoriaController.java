package com.farmacia.farmacia_on.controller;

import java.util.List;

import javax.validation.Valid;

import com.farmacia.farmacia_on.model.Categoria;
import com.farmacia.farmacia_on.repository.CategoriaRepository;


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
@RequestMapping("/api/v1/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaRepository categoriarepository;

    @GetMapping("/todas")
    public ResponseEntity<List<Categoria>> findAllCategoria() {
        return ResponseEntity.ok(categoriarepository.findAll());
    }

    @GetMapping("/buscarporid/{idCategoria}")
    public ResponseEntity<Categoria> findById(@PathVariable Long idCategoria){
        return categoriarepository.findById(idCategoria)
        .map(resp -> ResponseEntity.ok(resp))
        .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{descricao}")
    public ResponseEntity<List<Categoria>> findByDescricaoCategoria(@PathVariable String descricao){
      return ResponseEntity.ok(categoriarepository.findAllByDescricaoContainingIgnoreCase(descricao));
    }

    @PostMapping("/criar")
    public Categoria postCategoria(@Valid @RequestBody Categoria categoria ){
        return categoriarepository.save(categoria);
    }

    @PutMapping("/editar")
    public ResponseEntity<Categoria>  putCategoria(@Valid @RequestBody Categoria categoria){
        return ResponseEntity.status(HttpStatus.OK).body(categoriarepository.save(categoria));
    }

    @DeleteMapping("/deletar/{idCategoria}")
    public void deleteCategoria(@PathVariable long idCategoria){
        categoriarepository.deleteById(idCategoria);
    }

}
