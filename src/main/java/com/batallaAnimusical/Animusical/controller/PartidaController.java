package com.batallaAnimusical.Animusical.controller;

import com.batallaAnimusical.Animusical.repository.PreguntasJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("inicio")
public class PartidaController {

    @Autowired
    PreguntasJpaRepository preguntasJpaRepository;


    @GetMapping("/comenzar")
    public String comenzarJuego(){

        return "juego";
    }


}
