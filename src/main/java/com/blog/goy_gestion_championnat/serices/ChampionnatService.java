package com.blog.goy_gestion_championnat.serices;

import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.Equipe;
import jdk.jfr.Category;

import java.util.List;

public interface ChampionnatService {
    Championnat ajouterChampionnat(Championnat championnat);
    Championnat recupererChampionnat(Long idChampionnat);
    Championnat recupererChampionnat(String nom);

    List<Championnat> recupererChampionnat();
    List<Equipe> recupererEquipe(Championnat championnat);
}

