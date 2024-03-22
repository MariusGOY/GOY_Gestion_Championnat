package com.blog.goy_gestion_championnat.serices;

import com.blog.goy_gestion_championnat.projos.*;

import java.util.List;

public interface StadeService {
    Stade ajouterStade(Stade stade);
    Stade recupererStade(Long idStade);
    Stade recupererStade(String nom);

    List<Stade> recupererStade();
    List<Equipe> recupererEquipe(Stade stade);
    List<LeMatch> recupererLeMatch(Stade stade);
}
