package com.batallaAnimusical.Animusical.controller;

import com.batallaAnimusical.Animusical.model.Usuario;
import com.batallaAnimusical.Animusical.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("registro")
public class RegisterController {

    @Autowired
    UsuarioJpaRepository usuarioJpaRepository;

    @GetMapping("add")
    public String registerForm (){

        return "register";
    }

    @PostMapping("add")
    public String registrarse(Usuario usuario){
        usuarioJpaRepository.save(usuario);

        return "partida";
    }


}
