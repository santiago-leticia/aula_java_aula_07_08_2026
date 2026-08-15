package com.example.springmvc.dto;

import com.example.springmvc.model.Genero;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.time.LocalDate;

public record LivroRequest (
        @NotBlank(message = "O titulo é obrigatorio") String titulo,
        @NotBlank(message = "O autor é obrigatorio ") String autor,
        @NotNull(message = "O genero é obrigatorio") Genero genero,
        Integer paginas,
        String editora,
        @Pattern(regexp = "^970\\d{7}$|^970\\d{10}$") String isBm,
        LocalDate dataPublicacao,
        BigDecimal preco
) {

}
