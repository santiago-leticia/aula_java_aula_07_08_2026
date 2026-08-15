package com.example.springmvc.service;

import com.example.springmvc.dto.LivroRequest;
import com.example.springmvc.model.Livro;
import com.example.springmvc.repository.LivroRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LivroService {

    private  final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }
    //Crud
    //O que temos ter um dto ou um id. Ou um livro request
    //criar o livro
    public Livro create(Livro livro ){
        //Livro livro = new Livro();
        //BeanUtils.copyProperties(livroRequest, livro);
        return livroRepository.save(livro);
    }

    //ele so vai a vill quando isso
    public Livro readById(UUID id){
        return livroRepository.findById(id).orElse(null);
    }

    //ler todos
    public List<Livro> readAll(){
        return livroRepository.findAll();
    }

    //update
    public Livro update(UUID id, LivroRequest livroRequest){
        Optional<Livro> livroOptional = livroRepository.findById(id);
        //primeiro verificar se o livro existe
        if(livroOptional.isEmpty()){
            return null;
        }
        Livro livroUpdate = livroOptional.get();
        BeanUtils.copyProperties(livroRequest, livroUpdate);
        //para garantir que ta pegando livro certo
        livroUpdate.setId(id);
        return livroRepository.save(livroUpdate);
    }
    //Por fim, o delete
    public boolean delete(UUID id){
        livroRepository.deleteById(id);
        return readById(id) == null;
    }
/*
    public Livro livroMapper(LivroRequest livroRequest){
        // vai utlizar tudo do livro mas nao o id
        //e sim vai mandar direncionando para o livro para guardaar
        Livro livro = new Livro();
        livro.setAutor(livroRequest.autor());
        livro.setEditora(livroRequest.editora());

        //..
        return livro;
    }*/

}
