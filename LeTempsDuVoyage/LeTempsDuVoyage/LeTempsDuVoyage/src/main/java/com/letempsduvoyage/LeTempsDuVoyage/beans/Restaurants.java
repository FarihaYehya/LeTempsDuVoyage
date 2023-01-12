package com.letempsduvoyage.LeTempsDuVoyage.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributs

    private int id;
    private String nom;
    private String type;
    private int prixLePlusBas;
    private int prixLePlusHaut;
    private String adresse;

    private String nomVilles;

    //constructeurs


    public Restaurants() {
    }

    public Restaurants(String nom, String type, int prixLePlusBas, int prixLePlusHaut, String adresse) {
        this.nom = nom;
        this.type = type;
        this.prixLePlusBas = prixLePlusBas;
        this.prixLePlusHaut = prixLePlusHaut;
        this.adresse = adresse;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrixLePlusBas() {
        return prixLePlusBas;
    }

    public void setPrixLePlusBas(int prixLePlusBas) {
        this.prixLePlusBas = prixLePlusBas;
    }

    public int getPrixLePlusHaut() {
        return prixLePlusHaut;
    }

    public void setPrixLePlusHaut(int prixLePlusHaut) {
        this.prixLePlusHaut = prixLePlusHaut;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNomVilles() {
        return nomVilles;
    }

    public void setNomVille(String nomVille) {
        this.nomVilles = nomVille;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
//ToString


    @Override
    public String toString() {
        return "Restaurants{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                ", prixLePlusBas=" + prixLePlusBas +
                ", prixLePlusHaut=" + prixLePlusHaut +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
