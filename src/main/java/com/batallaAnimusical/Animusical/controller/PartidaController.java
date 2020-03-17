package com.batallaAnimusical.Animusical.controller;
import com.batallaAnimusical.Animusical.model.Genero;
import com.batallaAnimusical.Animusical.model.Pregunta;
import com.batallaAnimusical.Animusical.model.Respuesta;
import com.batallaAnimusical.Animusical.model.Usuario;
import com.batallaAnimusical.Animusical.repository.GeneroJpaRepository;
import com.batallaAnimusical.Animusical.repository.PreguntasJpaRepository;
import com.batallaAnimusical.Animusical.repository.RespuestaJpaRepository;
import org.hibernate.sql.ordering.antlr.GeneratedOrderByFragmentParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
@Controller
@RequestMapping("juego")
public class PartidaController {
    @Autowired
    private PreguntasJpaRepository preguntasJpaRepository;
    @Autowired
    private RespuestaJpaRepository respuestaJpaRepository;
    @Autowired
    private GeneroJpaRepository generoJpaRepository;
    @GetMapping("jugar")
    public String getPreguntas(Model model, Genero genero) {
      //  Integer generoElegido = genero.getId();
       // Optional<Genero> generoEncontrado= generoJpaRepository.findById(generoElegido);
      //  model.addAttribute("unGenero",generoEncontrado);
        List<Pregunta> ListPreg = preguntasJpaRepository.findAll();
        Random miRan = new Random();
        Integer num = miRan.nextInt(ListPreg.size());
        Pregunta pregunta = ListPreg.get(num);
        model.addAttribute("Pregunta", pregunta);
        Integer pregunta_id = num;
        List<Respuesta> ListaRespuesta = pregunta.getListaRespuestas();
        model.addAttribute("Respuestas", ListaRespuesta);
        return "juego";
    }
    @PostMapping("jugar")
    public String validarRespuesta(Respuesta respuesta) {
       Integer respUsuario = respuesta.getCorrecta();
       if (respUsuario==1) {
            return "respuestaCorrecta";
        }else{
           return "respuestaIncorrecta";
       }
    }
}