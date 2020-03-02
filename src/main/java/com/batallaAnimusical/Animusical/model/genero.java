package com.batallaAnimusical.Animusical.model;

import javax.persistence.*;

@Entity(name = "generos")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column (nullable = false)
    private String nombre;

    public Genero() {
    }

    public Genero(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
