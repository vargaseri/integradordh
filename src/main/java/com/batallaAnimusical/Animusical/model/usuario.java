package com.batallaAnimusical.Animusical.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column (nullable=false)
    @Size (min = 3, max =15)
    private String nombre;

    @Column (nullable=false)
    @Size (min = 3, max =15)
    private String apellido;

    @Column (nullable = false)
    @Pattern(regexp = "^[a-zA-Z0-9.-]+$*@*[a-zA-Z0-9.-]+.*[a-zA-Z0-9.-]+")

    private String email;

    @Column (nullable = false, unique = true)
    private String username;

    @Column (nullable = false)
    @Size(min = 5, max = 30)
    private String password;

    @Column
    @NotBlank
    private String pais;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String apellido, String email, String username, String password, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.username = username;
        this.password = password;
        this.pais = pais;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
