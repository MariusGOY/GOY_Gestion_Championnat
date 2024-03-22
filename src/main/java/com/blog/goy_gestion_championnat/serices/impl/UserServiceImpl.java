package com.blog.goy_gestion_championnat.serices.impl;

import com.blog.goy_gestion_championnat.dao.ChampionnatDao;
import com.blog.goy_gestion_championnat.dao.EquipeDao;
import com.blog.goy_gestion_championnat.dao.LeMatchDao;
import com.blog.goy_gestion_championnat.dao.UserDao;
import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.User;
import com.blog.goy_gestion_championnat.serices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private ChampionnatDao championnatDao;


    @Override
    public User ajouterUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User recupererUser(Long idUser) {
        return userDao.findById(idUser).orElse(null);
    }

    @Override
    public User recupererUser(String pseudo) {
        return userDao.findByPseudo(pseudo);
    }

    @Override
    public List<User> recupererUser() {
        return userDao.findAll();
    }
}
