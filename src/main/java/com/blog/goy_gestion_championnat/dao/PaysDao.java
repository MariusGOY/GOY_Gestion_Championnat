package com.blog.goy_gestion_championnat.dao;

import com.blog.goy_gestion_championnat.projos.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysDao extends JpaRepository<Pays, Long> {
    // méthode par dérivation
    Pays findByNom(String nom);
}
