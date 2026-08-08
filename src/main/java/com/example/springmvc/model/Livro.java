package com.example.springmvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.rmi.server.UID;
import java.time.LocalDate;

@Entity
public class Livro {
    //Como é um id, utilizar um UID
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UID id;
    //nao aceita nem null ou nem vazio
    @NotBlank(message = "O titulo é obrigatorio")
    private String titulo;
    @NotBlank(message = "O autor é obrigatorio ")
    private String autor;
    @NotNull(message = "O genero é obrigatorio")
    private Genero genero;
    private Integer paginas;
    private String editora;
    @Pattern(regexp = "^970\\d{7}$|^970\\d{10}$") //ISBN 10 ou 13 iniciado em 970
    private  String isBm;
    private LocalDate dataPublicacao;
    private BigDecimal preco;

    public UID getId() {
        return id;
    }

    public void setId(UID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsBm() {
        return isBm;
    }

    public void setIsBm(String isBm) {
        this.isBm = isBm;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
