package com.blog.goy_gestion_championnat.dao;

import com.blog.goy_gestion_championnat.projos.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StadeDao extends JpaRepository<Stade, Long> {
    // méthode par dérivation
    Stade findByNom(String nom);
}
