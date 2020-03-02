package com.batallaAnimusical.Animusical.controller;

import com.batallaAnimusical.Animusical.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    UsuarioJpaRepository usuarioJpaRepository;


    @GetMapping("inicio")
    public String irAllogin (){

        return "login";

    }

    @PostMapping("inicio")
    public  String loguearse (String nombre){

        usuarioJpaRepository.findBynombre(nombre);

        return "partida";
    }
}
