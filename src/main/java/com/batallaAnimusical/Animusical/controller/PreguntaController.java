package com.batallaAnimusical.Animusical.controller;
import com.batallaAnimusical.Animusical.model.Pregunta;
import com.batallaAnimusical.Animusical.model.Respuesta;
import com.batallaAnimusical.Animusical.repository.PreguntasJpaRepository;
import com.batallaAnimusical.Animusical.repository.RespuestaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Controller
@RequestMapping("preguntas")
public class PreguntaController {
    @Autowired
    PreguntasJpaRepository preguntasJpaRepository;
    @Autowired
    RespuestaJpaRepository respuestaJpaRepository;
    @GetMapping("add")
    public String preguntaForm(){
        return "add-preguntas";
    }
    @PostMapping("add")
    public String agregarPreguntas(Pregunta pregunta){
        preguntasJpaRepository.save(pregunta);
        return "home";
    }
}
 