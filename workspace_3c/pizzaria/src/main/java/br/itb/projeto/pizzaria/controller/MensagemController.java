package br.itb.projeto.pizzaria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {

    @GetMapping("/ola")
    public String ola() {
        String mensagem = "Olá, INF3CM!";
        return mensagem;
    }

}
