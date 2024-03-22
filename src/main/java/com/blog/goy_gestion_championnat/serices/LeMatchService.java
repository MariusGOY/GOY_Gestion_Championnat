package com.blog.goy_gestion_championnat.serices;

import com.blog.goy_gestion_championnat.projos.Equipe;
import com.blog.goy_gestion_championnat.projos.Journee;
import com.blog.goy_gestion_championnat.projos.LeMatch;

import java.util.List;

public interface LeMatchService {
    LeMatch ajouterLeMatch(LeMatch leMatch);
    LeMatch recupererLeMatch(Long idLeMatch);

    //Equipe recupererEquipe(LeMatch leMatch);

    List<LeMatch> recupererLeMatch();
}
