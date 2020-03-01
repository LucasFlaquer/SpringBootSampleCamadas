package com.example.springdemo.service;

import java.util.Date;

import com.api.email.Email;
import com.example.springdemo.model.Usuario;
import com.example.springdemo.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UsuarioService
 */
@Service
public class UsuarioService {

    @Autowired
    private Email email;

   
    @Autowired
    private UsuarioRepository ur;

    public Mensagem salvar(Usuario usuario) {

        Mensagem  msg = new Mensagem();

        if (validarUsuario(usuario, msg)) {
            if (ur.salvar(usuario)) {
                System.out.println("Usuario salvo: " + usuario);
                email.sendEmail(usuario.getEmail(), "Novo Cadastro usando injeção!", "O seu cadastro foi processado!");
                usuario.setDataCriacao(new Date().toString());
                msg.setCode(200);

            } else {
                System.out.println("Erro, usuario ja existente: " + usuario);
                msg.setCode(400);
                msg.addDetail("login", "Usuario já cadastrado");
            }
        }
        return msg;

    }

    private boolean validarUsuario(Usuario usuario, Mensagem msg) {
        boolean valicao = true;

        if (usuario.getNome() == null) {
            valicao = false;
            msg.addDetail("nome", "nome nullo");
        }
        else
        if (usuario.getNome().length() < 3) {
            valicao = false;
            msg.addDetail("name", "tamanho invalido para o nome");
        }


        if (usuario.getEmail() == null) {
            valicao = false;
            msg.addDetail("email", "email nullo");
        }
        else
        if (usuario.getEmail().indexOf("@") == -1) {
            valicao = false;
            msg.addDetail("email", "tamanho invalido para o nome");
        }

        if(!valicao)
           msg.setCode(500);

        return valicao;
    }

}