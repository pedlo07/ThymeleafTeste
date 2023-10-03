package com.senac.SenacTeste;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PessoaController {

    
    @GetMapping("/")
    public String inicial (Model model){
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Jeferson"));
        pessoas.add(new Pessoa("João"));
        pessoas.add(new Pessoa("Allyson"));
        pessoas.add(new Pessoa("Gustavo"));
        pessoas.add(new Pessoa("Pedro"));

        model.addAttribute("pessoas", pessoas);
        return "index";
    }

//    public String adicionaPessoas(String nome){
//        if (nome != null && !nome.equals("")){
//
//        }
//        return "";
//    }
}
