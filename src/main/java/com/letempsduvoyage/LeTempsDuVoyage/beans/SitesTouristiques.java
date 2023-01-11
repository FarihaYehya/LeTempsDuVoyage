package com.letempsduvoyage.LeTempsDuVoyage.beans;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SitesTouristiques {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributs

    private int id;
    private String nom;
    private String typeTourisme;
    private int prix;



    //constructeurs

    public SitesTouristiques() {
    }

    public SitesTouristiques(String nom, String typeTourisme, int prix) {
        this.nom = nom;
        this.typeTourisme = typeTourisme;
        this.prix = prix;
    }
//Getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTypeTourisme() {
        return typeTourisme;
    }

    public void setTypeTourisme(String typeTourisme) {
        this.typeTourisme = typeTourisme;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }


//ToString


    @Override
    public String toString() {
        return "SitesTouristiques{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", typeTourisme='" + typeTourisme + '\'' +
                ", prix=" + prix +
                '}';
    }
}
