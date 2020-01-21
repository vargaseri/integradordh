package com.company;

public class Usuario {
    private String nombre;
    private String apellido;
    private String username;
    private String email;
    private String password;
    private String pais;

    public Usuario(String nombre, String apellido, String username, String email, String password, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.email = email;
        this.password = password;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public String getUsername() {
        return username;
    }


    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }



    public String getPais() {
        return pais;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void iniciarSesion(String username, String password){

    }

    public void iniciarPartida (){

    }

    public void seleccionarPersonaje(){

    }

    public void consultarPuntos (){

    }

}
