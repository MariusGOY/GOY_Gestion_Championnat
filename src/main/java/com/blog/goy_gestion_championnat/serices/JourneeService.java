package com.blog.goy_gestion_championnat.serices;

import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.Equipe;
import com.blog.goy_gestion_championnat.projos.Journee;
import com.blog.goy_gestion_championnat.projos.LeMatch;

import java.util.List;

public interface JourneeService {
    Journee ajouterJournee(Journee journee);
    Journee recupererJournee(Long idJournee);

    List<Journee> recupererJournee();
    List<LeMatch> recupererLeMatch(Journee journee);
}
