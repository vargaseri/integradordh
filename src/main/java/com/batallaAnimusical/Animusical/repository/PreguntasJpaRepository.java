package com.batallaAnimusical.Animusical.repository;

import com.batallaAnimusical.Animusical.model.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntasJpaRepository extends JpaRepository<Pregunta, Integer>{



}
