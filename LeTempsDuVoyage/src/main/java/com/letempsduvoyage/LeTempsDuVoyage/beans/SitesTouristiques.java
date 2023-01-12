package com.letempsduvoyage.LeTempsDuVoyage.beans;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class SitesTouristiques {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributs

    private int idSitesTouristiques;
    private String nom;
    private String typeTourisme;
    private int prix;

    private String nomVilles;

    //Ajouter un commentaire à sites touristiques//
    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Commentaires> commentaires = new ArrayList<>();

    public void ajouterCommentairesSitesTouristiques (Commentaires comment){
        commentaires.add(comment);
    }


    //constructeurs

    public SitesTouristiques() {
    }

    public SitesTouristiques(String nom, String typeTourisme, int prix) {
        this.nom = nom;
        this.typeTourisme = typeTourisme;
        this.prix = prix;
    }
//Getter/setter

    public int getIdSitesTouristiques() {
        return idSitesTouristiques;
    }

    public void setIdSitesTouristiques(int idSitesTouristiques) {
        this.idSitesTouristiques = idSitesTouristiques;
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

    public String getNomVilles() {
        return nomVilles;
    }

    public void setNomVilles(String nomVilles) {
        this.nomVilles = nomVilles;
    }

    public List<Commentaires> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaires> commentaires) {
        this.commentaires = commentaires;
    }


    //ToString


    @Override
    public String toString() {
        return "SitesTouristiques{" +
                "idSitesTouristiques=" + idSitesTouristiques +
                ", nom='" + nom + '\'' +
                ", typeTourisme='" + typeTourisme + '\'' +
                ", prix=" + prix +
                ", nomVilles='" + nomVilles + '\'' +
                ", commentaires=" + commentaires +
                '}';
    }
}
