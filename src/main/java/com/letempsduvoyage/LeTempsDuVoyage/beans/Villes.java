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

    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Restaurants> restaurants = new ArrayList<>();

    public void ajouterRestaurants (Restaurants resto){
        restaurants.add(resto);
    }



    //constructeurs

    public Villes() {
    }

    public Villes(String nom) {
        this.nom = nom;
    }

    public Villes(String nom, List<Restaurants> restaurants) {
        this.nom = nom;
        this.restaurants = restaurants;
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

    public List<Restaurants> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurants> restaurants) {
        this.restaurants = restaurants;
    }
//ToString


    @Override
    public String toString() {
        return "Villes{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", restaurants=" + restaurants +
                '}';
    }
}
