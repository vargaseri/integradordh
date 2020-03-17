package com.batallaAnimusical.Animusical.repository;
import com.batallaAnimusical.Animusical.model.Pregunta;
import com.batallaAnimusical.Animusical.model.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import static org.hibernate.hql.internal.antlr.HqlSqlTokenTypes.FROM;
import static org.hibernate.loader.Loader.SELECT;
public interface RespuestaJpaRepository extends JpaRepository<Respuesta, Integer> {
    @Transactional
    @Query("SELECT r FROM Respuesta r where pregunta_id = :pregunta_id")
    List<Respuesta> selectresp(@Param("pregunta_id") Integer pregunta_id);
   /* @Query( SELECT r from respuesta e where e.eid = :id")
    int selectresp(@Param("num") Integer num);*/
    Respuesta findByRespCorrecta (Boolean respCorrecta);
}