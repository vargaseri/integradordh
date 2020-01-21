package com.company;

public class Partida {
    private Usuario usuario;
    private Personaje personaje;
    private Pregunta pregunta;

    public Partida(Usuario usuario, Personaje personaje, Pregunta pregunta) {
        this.usuario = usuario;
        this.personaje = personaje;

        this.pregunta = pregunta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public void preguntar(){

    }

    public void puntos(){

    }

    public void restarVida(){

    }
}
