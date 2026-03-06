package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MOTEURS")
public class Moteur {

    @Id
    @Column(name="ID_MOTEUR")
    private String idMoteur;

    @Column(name="ID_MOTEURFULL")
    private String idMoteurFull;

    @Column(name="TYPE")
    private String type;

    @Column(name="FABRICANT")
    private String fabricant;

    @Column(name="FAMILLE")
    private String famille;

    @Column(name="SERIE")
    private String serie;

    @Column(name="MODELE")
    private String modele;

    @Column(name="POUSSEE")
    private Double poussee;

    @Column(name="LONGUEUR")
    private Integer longueur;

    // Getters and Setters
    public String getIdMoteur() {
        return idMoteur;
    }

    public void setIdMoteur(String idMoteur) {
        this.idMoteur = idMoteur;
    }

    public String getIdMoteurFull() {
        return idMoteurFull;
    }

    public void setIdMoteurFull(String idMoteurFull) {
        this.idMoteurFull = idMoteurFull;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Double getPoussee() {
        return poussee;
    }

    public void setPoussee(Double poussee) {
        this.poussee = poussee;
    }

    public Integer getLongueur() {
        return longueur;
    }

    public void setLongueur(Integer longueur) {
        this.longueur = longueur;
    }
}
