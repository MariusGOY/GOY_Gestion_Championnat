package com.blog.goy_gestion_championnat.dao;

import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.Equipe;
import com.blog.goy_gestion_championnat.projos.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipeDao extends JpaRepository<Equipe, Long> {
    // méthode par dérivation
    Equipe findByNom(String nom);

    List<Equipe> findByChampionnat(Championnat championnat);

    List<Equipe> findByStade(Stade stade);

}
