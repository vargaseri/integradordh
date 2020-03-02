package com.batallaAnimusical.Animusical.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "partidas")
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer puntos;

    public Partida() {
    }

    public Partida(Integer id) {
        this.id = id;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
