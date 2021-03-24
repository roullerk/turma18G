package com.farmacia.farmacia_on.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduto;

    @NotNull
    @Size(min = 3, max = 5)
    private String nomeProduto;

    @NotNull
    private Double valorProduto;

    @NotNull
    @Size(min = 3, max = 500)
    private String descricaoTitulo;


    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;

    public long getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getValorProduto() {
        return this.valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getDescricaoTitulo() {
        return this.descricaoTitulo;
    }

    public void setDescricaoTitulo(String descricaoTitulo) {
        this.descricaoTitulo = descricaoTitulo;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
