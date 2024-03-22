package com.blog.goy_gestion_championnat.dao;

import com.blog.goy_gestion_championnat.projos.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    // méthode par dérivation
    User findByPseudo(String pseudo);
}
