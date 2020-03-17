
  package com.batallaAnimusical.Animusical.controller; import
  com.batallaAnimusical.Animusical.model.Pregunta; import
  com.batallaAnimusical.Animusical.model.Respuesta; import
  com.batallaAnimusical.Animusical.repository.PreguntasJpaRepository; import
  com.batallaAnimusical.Animusical.repository.RespuestaJpaRepository; import
  org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Controller; import
  org.springframework.ui.Model; import
  org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.bind.annotation.PostMapping; import
  org.springframework.web.bind.annotation.RequestMapping; import
  java.util.List;
  
  @Controller
  
  @RequestMapping("respuesta") 
  public class RespuestaController {
  
  @Autowired PreguntasJpaRepository preguntasJpaRepository;
  
  @Autowired RespuestaJpaRepository respuestaJpaRepository;
  
  @GetMapping("add") 
  public String formRespuesta(Model model ){ List<Pregunta>
  ListPreg = preguntasJpaRepository.findAll(); 
  model.addAttribute("Pregunta", ListPreg); return "add-respuestas"; }
  
  @PostMapping("add") 
  public String enviarRespuesta(Respuesta respuesta){
  respuestaJpaRepository.save(respuesta); 
  return "add-respuestas"; }
  }
 