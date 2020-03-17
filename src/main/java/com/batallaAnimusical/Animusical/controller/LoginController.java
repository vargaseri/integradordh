package com.batallaAnimusical.Animusical.controller;
import com.batallaAnimusical.Animusical.model.Usuario;
import com.batallaAnimusical.Animusical.repository.UsuarioJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    UsuarioJpaRepository usuarioJpaRepository;
    @GetMapping()
    public String irAllogin (){
        return "login";
    }
    @PostMapping()
    public String loguearse (Model model, Usuario user){
            String usernameIngresado = user.getUsername();
            String passwordIngresada = user.getPassword();
            Usuario usuarioEncontrado= usuarioJpaRepository.findByUsername(usernameIngresado);
            if (usuarioEncontrado.getPassword().equals(passwordIngresada)){
                model.addAttribute("username", usuarioEncontrado.getUsername());
                return "partida";
            } else {
                return "404";
            }
    }
}
