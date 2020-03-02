package com.batallaAnimusical.Animusical.repository;


import com.batallaAnimusical.Animusical.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioJpaRepository extends JpaRepository<Usuario, Integer> {

    Usuario findBynombre (String nombre);

}
