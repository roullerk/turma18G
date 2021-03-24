package com.arcade.minhalojadegames.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categoria")
public class Categoria {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)    
private long idCategoria;

@NotNull
@Size(min = 3 , max = 200)
private String descricaoCategoria;

@NotNull
@Size(min = 3, max = 25)
private String nomeCategoria;


    public long getIdCategoria() {
        return this.idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescricaoCategoria() {
        return this.descricaoCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }

    public String getNome() {
        return this.nomeCategoria;
    }

    public void setNome(String nome) {
        this.nomeCategoria = nome;
    }

}
