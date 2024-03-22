package com.blog.goy_gestion_championnat.serices.impl;

import com.blog.goy_gestion_championnat.dao.ChampionnatDao;
import com.blog.goy_gestion_championnat.dao.EquipeDao;
import com.blog.goy_gestion_championnat.dao.LeMatchDao;
import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.Equipe;
import com.blog.goy_gestion_championnat.projos.LeMatch;
import com.blog.goy_gestion_championnat.serices.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeServiceImpl implements EquipeService {


    @Autowired
    private EquipeDao equipeDao;
    @Autowired
    private ChampionnatDao championnatDao;
    @Autowired
    private LeMatchDao leMatchDao;

    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return equipeDao.save(equipe);
    }

    @Override
    public Equipe recupererEquipe(Long idEquipe) {
        return equipeDao.findById(idEquipe).orElse(null);
    }

    @Override
    public Equipe recupererEquipe(String nom) {
        return equipeDao.findByNom(nom);
    }

    @Override
    public List<Equipe> recupererEquipe() {
        return equipeDao.findAll();
    }

}
