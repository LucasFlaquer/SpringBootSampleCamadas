package com.example.springdemo.repository;

import java.util.HashMap;

import com.example.springdemo.model.Usuario;

import org.springframework.stereotype.Repository;

/**
 * UsuarioRepository
 */

@Repository
public class UsuarioRepository {

    private HashMap<String, Usuario> map = new HashMap<String, Usuario>();

    public boolean salvar(Usuario usuario) {

        if (map.containsKey(usuario.getLogin())) {
            return false;
        } else {
            map.put(usuario.getLogin(), usuario);
            return true;
        }
    }
}