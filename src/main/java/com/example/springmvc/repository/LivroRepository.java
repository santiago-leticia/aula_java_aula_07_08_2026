package com.example.springmvc.repository;

import ch.qos.logback.core.model.Model;
import com.example.springmvc.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;
//Repositorio
public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
