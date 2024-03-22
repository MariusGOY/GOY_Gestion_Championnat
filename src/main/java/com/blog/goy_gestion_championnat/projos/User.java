package com.blog.goy_gestion_championnat.projos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class User {

    // definition attribut (id, nom, prenom, pseudo, login, mdp, email) :
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Le champ nom est obligatoire")
    @NotNull(message = "Le champ nom ne peu pas être null")
    private String nom;
    @NotBlank(message = "Le champ prenom est obligatoire")
    @NotNull(message = "Le champ prenom ne peu pas être null")
    private String prenom;
    @NotBlank(message = "Le champ pseudo est obligatoire")
    @NotNull(message = "Le champ pseudo ne peu pas être null")
    private String pseudo;
    @NotBlank(message = "Le champ prenom est obligatoire")
    @NotNull(message = "Le champ prenom ne peu pas être null")
    private String login;
    @NotBlank(message = "Le champ mot de passe est obligatoire")
    @NotNull(message = "Le champ pseudo ne peu pas être null")
    @Size(min = 6, message = "Le mot de passe doit contenir au moins 6 caractères")
    private String mdp;
    @NotBlank(message = "Le champ email est obligatoire")
    @NotNull(message = "Le champ email ne peu pas être null")
    @Email(message = "L'email n'est pas correct")
    private String email;



    // constructeur
    public User() {
    }

    public User(String nom, String prenom, String pseudo, String login, String mdp, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.login = login;
        this.mdp = mdp;
        this.email = email;
    }



    // maitre en text
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", login='" + login + '\'' +
                ", mdp='" + mdp + '\'' +
                ", email='" + email + '\'' +
                '}';
    }



    // geteur end seteur (id, nom, prenom, pseudo, login, mdp, email)

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
