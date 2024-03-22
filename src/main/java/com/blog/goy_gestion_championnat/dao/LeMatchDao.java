package com.blog.goy_gestion_championnat.dao;

import com.blog.goy_gestion_championnat.projos.Journee;
import com.blog.goy_gestion_championnat.projos.LeMatch;
import com.blog.goy_gestion_championnat.projos.Stade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeMatchDao extends JpaRepository<LeMatch, Long> {
    // méthode par dérivation
    List<LeMatch> findByJournee(Journee journee);
    List<LeMatch> findByStade(Stade stade);
}

