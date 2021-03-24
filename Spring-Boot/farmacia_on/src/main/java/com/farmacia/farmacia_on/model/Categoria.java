package com.farmacia.farmacia_on.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {
 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)    
private long id;

@NotNull
@Size(min = 3 , max = 30)
private String nomeCategoria;

@NotNull
@Size(min = 3 , max = 30)
private String tipoCategoria;

@NotNull
@Size(min = 3 , max = 500)
private String descricao;

@OneToMany(mappedBy= "categoria", cascade = CascadeType.ALL)
@JsonIgnoreProperties("categoria")
private List<Produto> produto;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCategoria() {
        return this.nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getTipoCategoria() {
        return this.tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;    
           
    }


}
