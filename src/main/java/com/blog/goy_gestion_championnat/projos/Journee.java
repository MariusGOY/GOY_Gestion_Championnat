package com.blog.goy_gestion_championnat.projos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Journee {

    // definition attribut (id, numero, idChampionnat) :
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private int idChampionnat;



    // liaison
    @ManyToOne
    private Championnat championnat;
    @OneToMany(mappedBy = "journee")
    private List<LeMatch> leMatches;



    // contructeur (id, numero, idChampionnat, championnat, leMatches) :
    public Journee() {
    }

    public Journee(int numero, int idChampionnat) {
        this.numero = numero;
        this.idChampionnat = idChampionnat;
    }



    // geteur et seteur

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdChampionnat() {
        return idChampionnat;
    }
    public void setIdChampionnat(int idChampionnat) {
        this.idChampionnat = idChampionnat;
    }

    public Championnat getChampionnat() {
        return championnat;
    }
    public void setChampionnat(Championnat championnat) {
        this.championnat = championnat;
    }

    public List<LeMatch> getLeMatches() {
        return leMatches;
    }
    public void setLeMatches(List<LeMatch> leMatches) {
        this.leMatches = leMatches;
    }



    //  Maitre en texte
    @Override
    public String toString() {
        return "Journee{" +
                "id=" + id +
                ", numero=" + numero +
                ", idChampionnat=" + idChampionnat +
                '}';
    }
}
