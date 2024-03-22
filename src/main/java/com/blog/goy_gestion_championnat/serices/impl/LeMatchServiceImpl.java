package com.blog.goy_gestion_championnat.serices.impl;

import com.blog.goy_gestion_championnat.dao.LeMatchDao;
import com.blog.goy_gestion_championnat.projos.LeMatch;
import com.blog.goy_gestion_championnat.serices.LeMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeMatchServiceImpl implements LeMatchService {

    @Autowired
    private LeMatchDao leMatchDao;

    @Override
    public LeMatch ajouterLeMatch(LeMatch leMatch) {
        return leMatchDao.save(leMatch);
    }

    @Override
    public LeMatch recupererLeMatch(Long idLeMatch) {
        return leMatchDao.findById(idLeMatch).orElse(null);
    }

    @Override
    public List<LeMatch> recupererLeMatch() {
        return leMatchDao.findAll();
    }
}
