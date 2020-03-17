package com.batallaAnimusical.Animusical.model;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity(name = "generos")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column (nullable = false)
    private String nombre;
    @OneToMany(mappedBy="genero" )
    private List<Pregunta> listaPreguntas;
    public Genero() {
    }
    public Genero(Integer id, String nombre, List<Pregunta> listaPreguntas) {
        this.id = id;
        this.nombre = nombre;
        this.listaPreguntas = listaPreguntas;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Pregunta> getListaPreguntas() {
        return listaPreguntas;
    }
    public void setListaPreguntas(List<Pregunta> listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genero genero = (Genero) o;
        return Objects.equals(id, genero.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}