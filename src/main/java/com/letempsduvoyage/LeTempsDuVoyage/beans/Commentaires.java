package com.letempsduvoyage.LeTempsDuVoyage.beans;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Commentaires {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //attributs
    private int id;
    private String commentaires;
    private String nomPersonnes;
    private String nomVilles;
    private String nomTransports;
    private String nomSitesTouristiques;
    private String nomRestaurants;


    //constructeurs

    public Commentaires() {
    }

    public Commentaires(String commentaires, String nomPersonnes, String nomVilles, String nomTransports, String nomSitesTouristiques, String nomRestaurants) {
        this.commentaires = commentaires;
        this.nomPersonnes = nomPersonnes;
        this.nomVilles = nomVilles;
        this.nomTransports = nomTransports;
        this.nomSitesTouristiques = nomSitesTouristiques;
        this.nomRestaurants = nomRestaurants;
    }

    //Getters et Setters//


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public String getNomPersonnes() {
        return nomPersonnes;
    }

    public void setNomPersonnes(String nomPersonnes) {
        this.nomPersonnes = nomPersonnes;
    }

    public String getNomVilles() {
        return nomVilles;
    }

    public void setNomVilles(String nomVilles) {
        this.nomVilles = nomVilles;
    }

    public String getNomTransports() {
        return nomTransports;
    }

    public void setNomTransports(String nomTransports) {
        this.nomTransports = nomTransports;
    }

    public String getNomSitesTouristiques() {
        return nomSitesTouristiques;
    }

    public void setNomSitesTouristiques(String nomSitesTouristiques) {
        this.nomSitesTouristiques = nomSitesTouristiques;
    }

    public String getNomRestaurants() {
        return nomRestaurants;
    }

    public void setNomRestaurants(String nomRestaurants) {
        this.nomRestaurants = nomRestaurants;
    }



    @Override
    public String toString() {
        return "Commentaires{" +
                "id=" + id +
                ", commentaires='" + commentaires + '\'' +
                ", nomPersonnes='" + nomPersonnes + '\'' +
                ", nomVilles='" + nomVilles + '\'' +
                ", nomTransports='" + nomTransports + '\'' +
                ", nomSitesTouristiques='" + nomSitesTouristiques + '\'' +
                ", nomRestaurants='" + nomRestaurants + '\'' +
                '}';
    }
}




