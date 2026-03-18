package br.itb.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestConroller {

    @GetMapping("/hello")
    public String hello() {
        String mensagem = "Olá, galera. Vamos estudar?";
        return mensagem;
    }

    @GetMapping("/ola/{nome}")
    public String ola(@PathVariable String nome) {
        return "Olá, " + nome + "!";

    }
 

    @GetMapping("/email/{email}")
    public String email(@PathVariable String email) {
        return "Acesso liberado! Bem - vindo " + email + "!";
        
    }
    @GetMapping("/mensagem")
    public String getMessage (@RequestParam String texto){          
         return texto;

    }

    @GetMapping("/calc/soma")
    public String soma(@RequestParam int a, @RequestParam int b){
        int resultado = a + b; 

        return "A soma de " + a + " + " + b +  " = " +  resultado; 
    }
     
    @GetMapping("/calc/area")
    public String area(@RequestParam int a, @RequestParam int b ){
        int resultado = a * b; 
        return "A área do quadrado é igual " + a + " * " + b + " = " + resultado; 

    }

      

}
