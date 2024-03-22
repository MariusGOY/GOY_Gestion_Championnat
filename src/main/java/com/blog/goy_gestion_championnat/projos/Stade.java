package com.blog.goy_gestion_championnat.projos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Stade {

    // definition attribut (id, nom, adresse, telephone, capacite)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;
    private String telephone;
    private int capacite;



    // liaison (Equipe, LeMatch)
    @OneToMany(mappedBy = "stade")
    private List<LeMatch> leMatches;
    @OneToMany(mappedBy = "stade")
    private List<Equipe> equipes;



    // contructeur
    public Stade() {
    }
    public Stade(String nom, String adresse, String telephone, int capacite) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.capacite = capacite;
    }



    // geteur et seteur

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

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getCapacite() {
        return capacite;
    }
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public List<LeMatch> getLeMatches() {
        return leMatches;
    }
    public void setLeMatches(List<LeMatch> leMatches) {
        this.leMatches = leMatches;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }
    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }



    //  Maitre en texte
    @Override
    public String toString() {
        return "Stade{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone='" + telephone + '\'' +
                ", capacite=" + capacite +
                '}';
    }
}
