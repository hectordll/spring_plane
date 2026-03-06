package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FLOTTES_PASSAGERS")
public class FlottesPassagers {

    @Id
    @Column(name="ID_FPASS")
    private String idFPass;

    @Column(name="ID_COMPAGNIE")
    private String idCompagnie;

    @Column(name="ID_AL")
    private String idAl;

    @Column(name="NOMBRE")
    private Integer nombre;

    // Getters and Setters
    public String getIdFPass() {
        return idFPass;
    }

    public void setIdFPass(String idFPass) {
        this.idFPass = idFPass;
    }

    public String getIdCompagnie() {
        return idCompagnie;
    }

    public void setIdCompagnie(String idCompagnie) {
        this.idCompagnie = idCompagnie;
    }

    public String getIdAl() {
        return idAl;
    }

    public void setIdAl(String idAl) {
        this.idAl = idAl;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }
}
