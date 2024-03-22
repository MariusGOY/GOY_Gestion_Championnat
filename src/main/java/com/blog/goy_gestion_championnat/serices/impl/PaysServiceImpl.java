package com.blog.goy_gestion_championnat.serices.impl;

import com.blog.goy_gestion_championnat.dao.ChampionnatDao;
import com.blog.goy_gestion_championnat.dao.LeMatchDao;
import com.blog.goy_gestion_championnat.dao.PaysDao;
import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.Pays;
import com.blog.goy_gestion_championnat.serices.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaysServiceImpl implements PaysService {

    @Autowired
    private PaysDao paysDao;
    @Autowired
    private ChampionnatDao championnatDao;

    @Override
    public Pays ajouterPays(Pays pays) {
        return paysDao.save(pays);
    }

    @Override
    public Pays recupererPays(Long idPays) {
        return paysDao.findById(idPays).orElse(null);
    }

    @Override
    public Pays recupererPays(String nom) {
        return paysDao.findByNom(nom);
    }

    @Override
    public List<Pays> recupererPays() {
        return paysDao.findAll();
    }

    @Override
    public List<Championnat> recupererChampionnat(Pays pays) {
        return championnatDao.findByPays(pays);
    }
}
