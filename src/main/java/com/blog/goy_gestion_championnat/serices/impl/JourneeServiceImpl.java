package com.blog.goy_gestion_championnat.serices.impl;

import com.blog.goy_gestion_championnat.dao.ChampionnatDao;
import com.blog.goy_gestion_championnat.dao.JourneeDao;
import com.blog.goy_gestion_championnat.dao.LeMatchDao;
import com.blog.goy_gestion_championnat.projos.Journee;
import com.blog.goy_gestion_championnat.projos.LeMatch;
import com.blog.goy_gestion_championnat.serices.JourneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JourneeServiceImpl implements JourneeService {

    @Autowired
    private JourneeDao journeeDao;
    @Autowired
    private LeMatchDao leMatchDao;

    @Override
    public Journee ajouterJournee(Journee journee) {
        return journeeDao.save(journee);
    }

    @Override
    public Journee recupererJournee(Long idJournee) {
        return journeeDao.findById(idJournee).orElse(null);
    }

    @Override
    public List<Journee> recupererJournee() {
        return journeeDao.findAll();
    }

    @Override
    public List<LeMatch> recupererLeMatch(Journee journee) {
        return leMatchDao.findByJournee(journee);
    }
}
