package com.blog.goy_gestion_championnat.projos;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Equipe {

    // definition attribut (id, nom, logo, nomEntraineur, president, statu, siege, telephone, siteWeb, dateCreation, idStade )
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String logo;
    private String nomEntraineur;
    private String president;
    private String statu;
    private String siege;
    private String telephone;
    private String siteWeb;
    private Date dateCreation;
    private int idStade;



    // liaison (Championat, Stade, LeMatch)
    @ManyToOne
    private Stade stade;

    @ManyToOne
    private Championnat championnat;

    @OneToMany(mappedBy = "equipe1")
    private List<LeMatch> leMatches;



    // contructeur
    public Equipe() {
    }
    public Equipe(String nom, String logo, String nomEntraineur, String president, String statu, String siege, String telephone, String siteWeb, Date dateCreation, int idStade) {
        this.nom = nom;
        this.logo = logo;
        this.nomEntraineur = nomEntraineur;
        this.president = president;
        this.statu = statu;
        this.siege = siege;
        this.telephone = telephone;
        this.siteWeb = siteWeb;
        this.dateCreation = dateCreation;
        this.idStade = idStade;
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

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNomEntraineur() {
        return nomEntraineur;
    }
    public void setNomEntraineur(String nomEntraineur) {
        this.nomEntraineur = nomEntraineur;
    }

    public String getPresident() {
        return president;
    }
    public void setPresident(String president) {
        this.president = president;
    }

    public String getStatu() {
        return statu;
    }
    public void setStatu(String statu) {
        this.statu = statu;
    }

    public String getSiege() {
        return siege;
    }
    public void setSiege(String siege) {
        this.siege = siege;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSiteWeb() {
        return siteWeb;
    }
    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public Date getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getIdStade() {
        return idStade;
    }
    public void setIdStade(int idStade) {
        this.idStade = idStade;
    }

    public Stade getStade() {
        return stade;
    }
    public void setStade(Stade stade) {
        this.stade = stade;
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
        return "Equipe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", logo='" + logo + '\'' +
                ", nomEntraineur='" + nomEntraineur + '\'' +
                ", president='" + president + '\'' +
                ", statu='" + statu + '\'' +
                ", siege='" + siege + '\'' +
                ", telephone='" + telephone + '\'' +
                ", siteWeb='" + siteWeb + '\'' +
                ", dateCreation=" + dateCreation +
                ", idStade=" + idStade +
                '}';
    }
}
