package com.example.springmvc.Mapper;

import com.example.springmvc.dto.LivroRequest;
import com.example.springmvc.model.Livro;
import org.springframework.stereotype.Component;

@Component
public class LivroMapper {
    //serve para converte ou transformar um objeto para outro formaro
    public LivroRequest livroToRequest(Livro livro){
        return new LivroRequest(livro.getTitulo(),
                livro.getAutor(),
                livro.getGenero(),
                livro.getPaginas(),
                livro.getEditora(),
                livro.getIsBm(),
                livro.getDataPublicacao(),
                livro.getPreco());
    }
}
