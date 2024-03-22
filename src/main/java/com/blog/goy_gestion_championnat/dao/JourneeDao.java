package com.blog.goy_gestion_championnat.dao;

import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.Journee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JourneeDao extends JpaRepository<Journee, Long> {
    // méthode par dérivation
    List<Journee> findByChampionnat(Championnat championnat);
}

