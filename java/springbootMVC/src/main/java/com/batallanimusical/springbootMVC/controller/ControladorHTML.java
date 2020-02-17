package com.batallanimusical.springbootMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ControladorHTML {

    @GetMapping("faq.html")
        public String irAPregFrecuentes (){

                return"faq";

        }
    @GetMapping("login.html")
    public String loguearse (){

        return"login";

    }
    @GetMapping("register.html")
    public String registrarse (){

        return"register";

    }
    @GetMapping("home.html")
    public String irAlHome (){

        return"home";

    }


}
