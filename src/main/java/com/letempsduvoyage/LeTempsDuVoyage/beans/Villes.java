package com.letempsduvoyage.LeTempsDuVoyage.beans;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Villes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Attributs

    private int id;
    private String nom;



    //constructeurs

    public Villes() {
    }

    public Villes(String nom) {
        this.nom = nom;
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

    //ToString

    @Override
    public String toString() {
        return "Villes{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
