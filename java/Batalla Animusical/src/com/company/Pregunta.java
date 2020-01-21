package com.company;

import java.util.List;

public class Pregunta {
    private String pregunta;
    private Integer idRespuestaCorrecta;
    private List<Respuesta> respuestaOpciones;
    private Categoria categoria;

    public Pregunta(String pregunta, Integer idRespuestaCorrecta, List<Respuesta> respuestaOpciones, Categoria categoria) {
        this.pregunta = pregunta;
        this.idRespuestaCorrecta = idRespuestaCorrecta;
        this.respuestaOpciones = respuestaOpciones;
        this.categoria = categoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Integer getIdRespuestaCorrecta() {
        return idRespuestaCorrecta;
    }

    public void setIdRespuestaCorrecta(Integer idRespuestaCorrecta) {
        this.idRespuestaCorrecta = idRespuestaCorrecta;
    }

    public List<Respuesta> getRespuestaOpciones() {
        return respuestaOpciones;
    }

    public void setRespuestaOpciones(List<Respuesta> respuestaOpciones) {
        this.respuestaOpciones = respuestaOpciones;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
