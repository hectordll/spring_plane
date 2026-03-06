package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name="AVIONS_LIGNE")
public class AvionsLigne {

    @Id
    @Column(name="ID_AL")
    private String idAl;

    @Column(name="ID_ALFULL")
    private String idAlFull;

    @Column(name="CONSTRUCTEUR")
    private String constructeur;

    @Column(name="FAMILLE")
    private String famille;

    @Column(name="SERIE")
    private String serie;

    @Column(name="MODELE")
    private String modele;

    @Column(name="NBREMOTEURS")
    private Integer nbreMoteurs;

    @Column(name="ID_MOTEUR")
    private String idMoteur;

    @Column(name="ENVERGURE")
    private Double envergure;

    @Column(name="LONGUEUR")
    private Double longueur;

    @Column(name="HAUTEUR")
    private Double hauteur;

    @Column(name="LARGEURFUSELAGE")
    private Double largeurFuselage;

    @Column(name="LARGEURCABINE")
    private Double largeurCabine;

    @Column(name="NBREPASSMIN")
    private Integer nbrePassMin;

    @Column(name="NBREPASSMAX")
    private Integer nbrePassMax;

    @Column(name="VOLUMECARGO")
    private Integer volumeCargo;

    @Column(name="LD3")
    private Integer ld3;

    @Column(name="MISEENSERVICE")
    private Date miseEnService;

    // Getters and Setters
    public String getIdAl() {
        return idAl;
    }

    public void setIdAl(String idAl) {
        this.idAl = idAl;
    }

    public String getIdAlFull() {
        return idAlFull;
    }

    public void setIdAlFull(String idAlFull) {
        this.idAlFull = idAlFull;
    }

    public String getConstructeur() {
        return constructeur;
    }

    public void setConstructeur(String constructeur) {
        this.constructeur = constructeur;
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

    public Integer getNbreMoteurs() {
        return nbreMoteurs;
    }

    public void setNbreMoteurs(Integer nbreMoteurs) {
        this.nbreMoteurs = nbreMoteurs;
    }

    public String getIdMoteur() {
        return idMoteur;
    }

    public void setIdMoteur(String idMoteur) {
        this.idMoteur = idMoteur;
    }

    public Double getEnvergure() {
        return envergure;
    }

    public void setEnvergure(Double envergure) {
        this.envergure = envergure;
    }

    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }

    public Double getHauteur() {
        return hauteur;
    }

    public void setHauteur(Double hauteur) {
        this.hauteur = hauteur;
    }

    public Double getLargeurFuselage() {
        return largeurFuselage;
    }

    public void setLargeurFuselage(Double largeurFuselage) {
        this.largeurFuselage = largeurFuselage;
    }

    public Double getLargeurCabine() {
        return largeurCabine;
    }

    public void setLargeurCabine(Double largeurCabine) {
        this.largeurCabine = largeurCabine;
    }

    public Integer getNbrePassMin() {
        return nbrePassMin;
    }

    public void setNbrePassMin(Integer nbrePassMin) {
        this.nbrePassMin = nbrePassMin;
    }

    public Integer getNbrePassMax() {
        return nbrePassMax;
    }

    public void setNbrePassMax(Integer nbrePassMax) {
        this.nbrePassMax = nbrePassMax;
    }

    public Integer getVolumeCargo() {
        return volumeCargo;
    }

    public void setVolumeCargo(Integer volumeCargo) {
        this.volumeCargo = volumeCargo;
    }

    public Integer getLd3() {
        return ld3;
    }

    public void setLd3(Integer ld3) {
        this.ld3 = ld3;
    }

    public Date getMiseEnService() {
        return miseEnService;
    }

    public void setMiseEnService(Date miseEnService) {
        this.miseEnService = miseEnService;
    }
}
