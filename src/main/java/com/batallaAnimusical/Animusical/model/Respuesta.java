package com.batallaAnimusical.Animusical.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;
@Entity
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    @NotBlank
    private String texto;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pregunta_id")
    private Pregunta unaPregunta;
    @Column
    private Boolean respCorrecta= false;
    @Column
    private Integer correcta;
    public Respuesta() {
    }
    public Respuesta(Integer id, String texto, Pregunta unaPregunta, Boolean respCorrecta, Integer correcta) {
        this.id = id;
        this.texto = texto;
        this.unaPregunta= unaPregunta;
        this.respCorrecta = respCorrecta;
        this.correcta=correcta;
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
    public Pregunta getUnaPregunta() {
        return unaPregunta;
    }
    public void setUnaPregunta(Pregunta unaPregunta) {
        this.unaPregunta = unaPregunta;
    }
    public Boolean getRespCorrecta() {
        return respCorrecta;
    }
    public void setRespCorrecta(Boolean respCorrecta) {
        this.respCorrecta = respCorrecta;
    }
    public Integer getCorrecta() {
        return correcta;
    }
    public void setCorrecta(Integer correcta) {
        this.correcta = correcta;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Respuesta respuesta = (Respuesta) o;
        return Objects.equals(id, respuesta.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}