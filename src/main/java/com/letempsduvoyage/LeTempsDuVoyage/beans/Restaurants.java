package com.letempsduvoyage.LeTempsDuVoyage.beans;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Restaurants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributs

    private int idRestaurants;
    private String nom;
    private String type;
    private int prixLePlusBas;
    private int prixLePlusHaut;
    private String adresse;

    private String nomVilles;

    //Ajouter un commentaire à restaurant//
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Commentaires> commentaires = new ArrayList<>();

    public void ajouterCommentairesRestaurants(Commentaires comment) {
        commentaires.add(comment);
    }


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


    public int getIdRestaurants() {
        return idRestaurants;
    }

    public void setIdRestaurants(int idRestaurants) {
        this.idRestaurants = idRestaurants;
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

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNomVilles() {
        return nomVilles;


        public void setNomVilles (String nomVilles){
            this.nomVilles = nomVilles;
        }

        public List<Commentaires> getCommentaires () {
            return commentaires;
        }

        public void setCommentaires (List < Commentaires > commentaires) {
            this.commentaires = commentaires;
        }

        //ToString


        @Override
        public String toString () {
            return "Restaurants{" +
                    "id=" + idRestaurants +
                    ", nom='" + nom + '\'' +
                    ", type='" + type + '\'' +
                    ", prixLePlusBas=" + prixLePlusBas +
                    ", prixLePlusHaut=" + prixLePlusHaut +
                    ", adresse='" + adresse + '\'' +
                    '}';
        }
    }
}
