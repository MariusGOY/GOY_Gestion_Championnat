package com.blog.goy_gestion_championnat.serices;

import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.Equipe;
import com.blog.goy_gestion_championnat.projos.LeMatch;

import java.util.List;

public interface EquipeService {
    Equipe ajouterEquipe(Equipe equipe);
    Equipe recupererEquipe(Long idEquipe);
    Equipe recupererEquipe(String nom);

    List<Equipe> recupererEquipe();

}
