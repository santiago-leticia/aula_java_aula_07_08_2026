package com.example.springmvc.controller;

import com.example.springmvc.model.Genero;
import com.example.springmvc.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/livros")
public class LivroController {
    @GetMapping("/cadastro")
    public String cadastro(Model model) {
        model.addAttribute("livro", new Livro());
        model.addAttribute("generos", Arrays.asList(Genero.values()));
        return "livroCadastro";
    }
}
