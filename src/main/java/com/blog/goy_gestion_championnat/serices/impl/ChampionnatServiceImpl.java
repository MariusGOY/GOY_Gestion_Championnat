package com.blog.goy_gestion_championnat.serices.impl;

import com.blog.goy_gestion_championnat.dao.ChampionnatDao;
import com.blog.goy_gestion_championnat.dao.EquipeDao;
import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.Equipe;
import com.blog.goy_gestion_championnat.serices.ChampionnatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionnatServiceImpl implements ChampionnatService {


    @Autowired
    private ChampionnatDao championnatDao;
    @Autowired
    private EquipeDao equipeDao;

    @Override
    public Championnat ajouterChampionnat(Championnat championnat) {
        return championnatDao.save(championnat);
    }

    @Override
    public Championnat recupererChampionnat(Long idChampionnat) {
        return championnatDao.findById(idChampionnat).orElse(null);
    }

    @Override
    public Championnat recupererChampionnat(String nom) {
        return championnatDao.findByNom(nom);
    }

    @Override
    public List<Championnat> recupererChampionnat() {
        return championnatDao.findAll();
    }

    @Override
    public List<Equipe> recupererEquipe(Championnat championnat) {
        return equipeDao.findByChampionnat(championnat);
    }
}
