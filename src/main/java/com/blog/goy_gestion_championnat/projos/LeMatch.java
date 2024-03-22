package com.blog.goy_gestion_championnat.projos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class LeMatch {

    // definition attribut (id, pointsEquipe1, pointsEquipe2, idStade, idEquipe1, idEquipe2, idJournee)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int pointsEquipe1;
    private int pointsEquipe2;
    private int idStade;
    private int idEquipe1;
    private int idEquipe2;
    private int idJournee;



    // liaison (Stade, Equipe1, Equipe2, Journee)
    @ManyToOne
    private Stade stade;
    @ManyToOne
    private Journee journee;
    @ManyToOne
    private Equipe equipe1;
    @ManyToOne
    private Equipe equipe2;



    // contructeur
    public LeMatch() {
    }
    public LeMatch(int pointsEquipe1, int pointsEquipe2, int idStade, int idEquipe1, int idEquipe2, int idJournee) {
        this.pointsEquipe1 = pointsEquipe1;
        this.pointsEquipe2 = pointsEquipe2;
        this.idStade = idStade;
        this.idEquipe1 = idEquipe1;
        this.idEquipe2 = idEquipe2;
        this.idJournee = idJournee;
    }



    // geteur et seteur

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public int getPointsEquipe1() {
        return pointsEquipe1;
    }
    public void setPointsEquipe1(int pointsEquipe1) {
        this.pointsEquipe1 = pointsEquipe1;
    }

    public int getPointsEquipe2() {
        return pointsEquipe2;
    }
    public void setPointsEquipe2(int pointsEquipe2) {
        this.pointsEquipe2 = pointsEquipe2;
    }

    public int getIdStade() {
        return idStade;
    }
    public void setIdStade(int idStade) {
        this.idStade = idStade;
    }

    public int getIdEquipe1() {
        return idEquipe1;
    }
    public void setIdEquipe1(int idEquipe1) {
        this.idEquipe1 = idEquipe1;
    }

    public int getIdEquipe2() {
        return idEquipe2;
    }
    public void setIdEquipe2(int idEquipe2) {
        this.idEquipe2 = idEquipe2;
    }

    public int getIdJournee() {
        return idJournee;
    }
    public void setIdJournee(int idJournee) {
        this.idJournee = idJournee;
    }

    public Stade getStade() {
        return stade;
    }
    public void setStade(Stade stade) {
        this.stade = stade;
    }

    public Journee getJournee() {
        return journee;
    }
    public void setJournee(Journee journee) {
        this.journee = journee;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }
    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }
    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }



    //  Maitre en texte
    @Override
    public String toString() {
        return "LeMatch{" +
                "id=" + id +
                ", pointsEquipe1=" + pointsEquipe1 +
                ", pointsEquipe2=" + pointsEquipe2 +
                ", idStade=" + idStade +
                ", idEquipe1=" + idEquipe1 +
                ", idEquipe2=" + idEquipe2 +
                ", idJournee=" + idJournee +
                '}';
    }
}
