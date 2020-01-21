package com.company;

public class Respuesta {
    private Integer  numeroDeRespuesta;
    private String textoDeRespuesta;

    public Respuesta(Integer numeroDeRespuesta, String textoDeRespuesta) {
        this.numeroDeRespuesta = numeroDeRespuesta;
        this.textoDeRespuesta = textoDeRespuesta;
    }

    public Integer getNumeroDeRespuesta() {
        return numeroDeRespuesta;
    }

    public void setNumeroDeRespuesta(Integer numeroDeRespuesta) {
        this.numeroDeRespuesta = numeroDeRespuesta;
    }

    public String getTextoDeRespuesta() {
        return textoDeRespuesta;
    }

    public void setTextoDeRespuesta(String textoDeRespuesta) {
        this.textoDeRespuesta = textoDeRespuesta;
    }
}
