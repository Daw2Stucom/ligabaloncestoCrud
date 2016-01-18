package com.example.ligabaloncesto.repository;

import com.example.ligabaloncesto.domain.Equipo;
import com.example.ligabaloncesto.domain.Jugador;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Spring Data JPA repository for the Equipo entity.
 */
public interface EquipoRepository extends JpaRepository<Equipo,Long> {

   /* @Query("SELECT j from Jugador j where j.equipo.id=:id order by j.CanastasTotales desc");

    List<Jugador> findByEquipoOrderByCanastasTotales(@Param("id")Long id);*/

}
