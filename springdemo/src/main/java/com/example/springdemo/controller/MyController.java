package com.example.springdemo.controller;

import java.util.Date;

import com.api.email.Email;
import com.example.springdemo.model.Usuario;
import com.example.springdemo.repository.UsuarioRepository;
import com.example.springdemo.service.Mensagem;
import com.example.springdemo.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MyController
 * Ver melhores praticas com restful
 *   https://florimond.dev/blog/articles/2018/08/restful-api-design-13-best-practices-to-make-your-users-happy/
 */

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private UsuarioService servico;

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @PostMapping("/usuario")
    public Mensagem saveUsuario(@RequestBody Usuario usuario) {
        return servico.salvar(usuario);
    }

}