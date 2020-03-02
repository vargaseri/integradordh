package com.batallaAnimusical.Animusical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/faq")
public class faqController {

    @GetMapping("/pregfrecuentes")
    public String  irAlasPreguntasFrecuentes(){

        return "faq";
    }
}
