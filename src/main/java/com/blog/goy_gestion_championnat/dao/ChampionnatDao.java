package com.blog.goy_gestion_championnat.dao;

import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.Equipe;
import com.blog.goy_gestion_championnat.projos.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChampionnatDao extends JpaRepository<Championnat, Long> {
    // méthode par dérivation

    Championnat findByNom(String nom);
    List<Championnat> findByPays(Pays pays);

}
