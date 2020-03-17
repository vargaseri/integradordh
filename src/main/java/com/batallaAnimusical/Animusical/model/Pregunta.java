package com.batallaAnimusical.Animusical.model;
import org.springframework.web.bind.annotation.ModelAttribute;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity(name="preguntas")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String texto;
    @ManyToOne
    @JoinColumn(name="genero_id")
    private Genero genero;
    @OneToMany(fetch=FetchType.LAZY, mappedBy="unaPregunta")
    private List<Respuesta> listaRespuestas;
    public Pregunta() {
    }
    public Pregunta(Integer id, String texto, Genero genero) {
        this.id = id;
        this.texto = texto;
        this.genero = genero;
        this.listaRespuestas = new ArrayList<Respuesta>();
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public List<Respuesta> getListaRespuestas() { return listaRespuestas;
    }
    public void setListaRespuestas(List<Respuesta> listaRespuestas) {
        this.listaRespuestas = listaRespuestas;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pregunta pregunta = (Pregunta) o;
        return id.equals(pregunta.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
