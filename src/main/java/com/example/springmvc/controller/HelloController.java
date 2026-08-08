package com.example.springmvc.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    //Transporta os dados para a vi
    //retornando a view que deseja retorna
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "hello World");
        return "hello";
    }
}
