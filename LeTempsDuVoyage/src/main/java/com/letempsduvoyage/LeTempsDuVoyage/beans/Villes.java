package com.letempsduvoyage.LeTempsDuVoyage.beans;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Villes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Attributs

    private int idVilles;
    private String nom;
    private String nomContinents;

    //Ajouter un restaurant à ville//
    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Restaurants> restaurants = new ArrayList<>();

    public void ajouterRestaurants (Restaurants resto){
        restaurants.add(resto);
    }
    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Commentaires> commentaires = new ArrayList<>();

    //Ajouter commentaire pour Villes//
    public void ajouterCommentaires (Commentaires comment){
        commentaires.add(comment);
    }
    //Ajouter un transport à ville//

    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Transports> transport = new ArrayList<>();

    public void ajouterTransports (Transports monTransport){
        transport.add(monTransport);
    }

    //Ajouter un site touristique à ville//

    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<SitesTouristiques> sites = new ArrayList<>();

    public void ajouterSitesTouristiques (SitesTouristiques monsite){
        sites.add(monsite);
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


    public int getIdVilles() {
        return idVilles;
    }

    public void setIdVilles(int idVilles) {
        this.idVilles = idVilles;
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

    public String getNomContinents() {
        return nomContinents;
    }

    public void setNomContinents(String nomContinents) {
        this.nomContinents = nomContinents;
    }

    public List<Transports> getTransport() {
        return transport;
    }

    public void setTransport(List<Transports> transport) {
        this.transport = transport;
    }

    public List<SitesTouristiques> getSites() {
        return sites;
    }

    public void setSites(List<SitesTouristiques> sites) {
        this.sites = sites;
    }

    //ToString


    @Override
    public String toString() {
        return "Villes{" +
                "id=" + idVilles +
                ", nom='" + nom + '\'' +
                ", restaurants=" + restaurants +
                '}';
    }
}
