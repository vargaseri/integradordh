package com.batallaAnimusical.Animusical.repository;

import com.batallaAnimusical.Animusical.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaJpaRepository extends JpaRepository <Partida, Integer> {


}
