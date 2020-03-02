package com.batallaAnimusical.Animusical.model;

import javax.persistence.*;

@Entity(name="respuestas")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String respuesta;

    public Respuesta() {
    }

    public Respuesta(Integer id, String respuesta) {
        this.id = id;
        this.respuesta = respuesta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
