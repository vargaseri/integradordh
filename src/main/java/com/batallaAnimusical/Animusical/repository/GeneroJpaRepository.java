package com.batallaAnimusical.Animusical.repository;
import com.batallaAnimusical.Animusical.model.Genero;
import com.batallaAnimusical.Animusical.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface GeneroJpaRepository extends JpaRepository<Genero, Integer> {
    Usuario findByNombre(String generoElegido);
}