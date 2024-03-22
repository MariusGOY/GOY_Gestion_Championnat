package com.blog.goy_gestion_championnat.projos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pays {

    // definition attribut (id, nom, logo)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String logo;



    // liaison
    @OneToMany(mappedBy = "pays")
    private List<Championnat> championnats;



    // contructeur
    public Pays() {
    }

    public Pays(String nom, String logo) {
        this.nom = nom;
        this.logo = logo;
    }



    // geteur et seteur :

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

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<Championnat> getChampionnats() {
        return championnats;
    }
    public void setChampionnats(List<Championnat> championnats) {
        this.championnats = championnats;
    }



    //  Maitre en texte
    @Override
    public String toString() {
        return "Pays{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
