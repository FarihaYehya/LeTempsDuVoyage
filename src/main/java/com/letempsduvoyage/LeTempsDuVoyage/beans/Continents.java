package com.letempsduvoyage.LeTempsDuVoyage.beans;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Continents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributs

    private int id;
    private String nom;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Villes> villes = new ArrayList<>();

    public void ajouterVilles(Villes mavilles) {
        villes.add(mavilles);
    }

    //constructeurs

    public Continents() {
    }

    public Continents(String nom) {
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
        return "Continents{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
