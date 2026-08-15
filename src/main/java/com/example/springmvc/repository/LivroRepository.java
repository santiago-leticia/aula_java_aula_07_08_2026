package com.example.springmvc.repository;

import com.example.springmvc.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
//Repositorio
public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
