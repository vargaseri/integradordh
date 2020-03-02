package com.batallaAnimusical.Animusical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class faqCotroller {

    @GetMapping("/pregfrecuentes")
    public String  irAlasPreguntasFrecuentes(){

        return "faq";
    }
}
