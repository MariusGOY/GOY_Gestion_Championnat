package com.blog.goy_gestion_championnat.serices.impl;

import com.blog.goy_gestion_championnat.dao.ChampionnatDao;
import com.blog.goy_gestion_championnat.dao.EquipeDao;
import com.blog.goy_gestion_championnat.dao.LeMatchDao;
import com.blog.goy_gestion_championnat.dao.StadeDao;
import com.blog.goy_gestion_championnat.projos.Equipe;
import com.blog.goy_gestion_championnat.projos.LeMatch;
import com.blog.goy_gestion_championnat.projos.Stade;
import com.blog.goy_gestion_championnat.serices.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StadeServiceImpl implements StadeService {

    @Autowired
    private StadeDao stadeDao;
    @Autowired
    private EquipeDao equipeDao;
    @Autowired
    private LeMatchDao leMatchDao;

    @Override
    public Stade ajouterStade(Stade stade) {
        return stadeDao.save(stade);
    }

    @Override
    public Stade recupererStade(Long idStade) {
        return stadeDao.findById(idStade).orElse(null);
    }

    @Override
    public Stade recupererStade(String nom) {
        return stadeDao.findByNom(nom);
    }

    @Override
    public List<Stade> recupererStade() {
        return stadeDao.findAll();
    }

    @Override
    public List<Equipe> recupererEquipe(Stade stade) {
        return equipeDao.findByStade(stade);
    }

    @Override
    public List<LeMatch> recupererLeMatch(Stade stade) {
        return leMatchDao.findByStade(stade);
    }
}
