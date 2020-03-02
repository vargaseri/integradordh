package com.batallaAnimusical.Animusical.model;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;

@Entity(name="preguntas")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column (nullable = false)
    private Integer genero_id;
    @Column(nullable = false)
    private String texto;



    public Pregunta() {
    }

    public Pregunta(Integer id, Integer genero_id, String texto ){
        this.id = id;
        this.genero_id = genero_id;
        this.texto = texto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(Integer genero_id) {
        this.genero_id = genero_id;
    }




    public String getTexto() {
        return texto;
    }




}
