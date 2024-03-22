package com.blog.goy_gestion_championnat.serices;

import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.Equipe;
import com.blog.goy_gestion_championnat.projos.Pays;

import java.util.List;

public interface PaysService {
    Pays ajouterPays(Pays pays);
    Pays recupererPays(Long idPays);
    Pays recupererPays(String nom);

    List<Pays> recupererPays();
    List<Championnat> recupererChampionnat(Pays pays);
}
