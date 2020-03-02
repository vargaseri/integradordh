package com.batallaAnimusical.Animusical.controller;

import com.batallaAnimusical.Animusical.model.usuario;
import com.batallaAnimusical.Animusical.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("usuarios")
    public class usuarioRestController {

        @Autowired
        private UsuarioJpaRepository usuarioJpaRepository;

        @GetMapping
        public usuario getUsuarioById (){

            return null;
        }

    }
