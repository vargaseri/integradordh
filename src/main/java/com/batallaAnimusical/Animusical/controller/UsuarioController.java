package com.batallaAnimusical.Animusical.controller;

import com.batallaAnimusical.Animusical.model.Usuario;
import com.batallaAnimusical.Animusical.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


    @Controller
    @RequestMapping("usuarios")
    public class UsuarioController {

        @Autowired
        private UsuarioJpaRepository usuarioJpaRepository;

        @GetMapping
        public Usuario getUsuarioById (){
                usuarioJpaRepository.findByUsername("nombre");
            return null;
        }

    }
