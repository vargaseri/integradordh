package com.batallaAnimusical.Animusical.controller;
import com.batallaAnimusical.Animusical.model.Genero;
import com.batallaAnimusical.Animusical.model.Usuario;
import com.batallaAnimusical.Animusical.repository.GeneroJpaRepository;
import com.batallaAnimusical.Animusical.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@Controller
@RequestMapping("iniciar")
public class InicioController {
    @Autowired
    GeneroJpaRepository generoJpaRepository;
    @Autowired
    UsuarioJpaRepository usuarioJpaRepository;
    @PostMapping("/")
    public String comenzarPartida(Model model, Genero genero, Usuario user){
        String usernameIngresado = user.getUsername();
        Usuario usuario = usuarioJpaRepository.findByUsername(usernameIngresado);
        model.addAttribute("unUsuario",usuario.getUsername());
        Integer generoElegido = genero.getId();
        Optional<Genero> generoEncontrado= generoJpaRepository.findById(generoElegido);
        return "juego";
    }
    @GetMapping ("/new")
    public String reiniciarPartida(Model model, Genero genero, Usuario user){
        String usernameIngresado = user.getUsername();
        Usuario usuario = usuarioJpaRepository.findByUsername(usernameIngresado);
        model.addAttribute("unUsuario",usuario.getUsername());
        Integer generoElegido = genero.getId();
        Optional<Genero> generoEncontrado= generoJpaRepository.findById(generoElegido);
        return "partida";
    }
}
