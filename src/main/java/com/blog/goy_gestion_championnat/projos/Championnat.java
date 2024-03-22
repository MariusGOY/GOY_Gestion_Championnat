package com.blog.goy_gestion_championnat.projos;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Championnat {

    // definition attribut (id, nom, logo, dateDebut, dateFin, pointGagne, pointPerdu, pointNul, typeClassement) :
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String logo;
    private String typeClassement;
    private int pointGagne;
    private int pointPerdu;
    private int pointNul;
    private Date dateDebut;
    private Date dateFin;



    // liaison (Pays, Equipe, Journee) :
    @ManyToOne
    private Pays pays;
    @OneToMany(mappedBy = "championnat")
    private List<Equipe> equipes;
    @OneToMany(mappedBy = "championnat")
    private List<Journee> journees;



    // contructeur
    public Championnat() {
    }

    public Championnat(String nom, String logo, String typeClassement, int pointGagne, int pointPerdu, int pointNul, Date dateDebut, Date dateFin) {
        this.nom = nom;
        this.logo = logo;
        this.typeClassement = typeClassement;
        this.pointGagne = pointGagne;
        this.pointPerdu = pointPerdu;
        this.pointNul = pointNul;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

// geteur et seteur (id, nom, logo, dateDebut, dateFin, pointGagne, pointPerdu, pointNul, typeClassement...) :

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

    public String getTypeClassement() {
        return typeClassement;
    }
    public void setTypeClassement(String typeClassement) {
        this.typeClassement = typeClassement;
    }

    public int getPointGagne() {
        return pointGagne;
    }
    public void setPointGagne(int pointGagne) {
        this.pointGagne = pointGagne;
    }

    public int getPointPerdu() {
        return pointPerdu;
    }
    public void setPointPerdu(int pointPerdu) {
        this.pointPerdu = pointPerdu;
    }

    public int getPointNul() {
        return pointNul;
    }
    public void setPointNul(int pointNul) {
        this.pointNul = pointNul;
    }

    public Date getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Pays getPays() {
        return pays;
    }
    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }
    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    public List<Journee> getJournees() {
        return journees;
    }
    public void setJournees(List<Journee> journees) {
        this.journees = journees;
    }

    //  Maitre en texte
    @Override
    public String toString() {
        return "Championnat{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", logo='" + logo + '\'' +
                ", typeClassement='" + typeClassement + '\'' +
                ", pointGagne=" + pointGagne +
                ", pointPerdu=" + pointPerdu +
                ", pointNul=" + pointNul +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                '}';
    }
}

