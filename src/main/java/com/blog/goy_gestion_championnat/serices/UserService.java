package com.blog.goy_gestion_championnat.serices;

import com.blog.goy_gestion_championnat.projos.Championnat;
import com.blog.goy_gestion_championnat.projos.Pays;
import com.blog.goy_gestion_championnat.projos.User;

import java.util.List;

public interface UserService {
    User ajouterUser(User user);
    User recupererUser(Long idUser);
    User recupererUser(String pseudo);

    List<User> recupererUser();

}
