package com.letempsduvoyage.LeTempsDuVoyage.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Commentaires {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //attributs
    private int id;
    private String Commentaires;
    private String nomPersonne;

    private String nomTransports;
    private String nomSitesTouristiques;
    private String nomRestaurants;
    private String nomVilles;



    //constructeurs

    public Commentaires() {
    }

    public Commentaires(String Commentaires, String nomPersonne, String nomTransports, String nomSitesTouristiques, String nomRestaurants, String nomVilles) {
        this.Commentaires = Commentaires;
        this.nomPersonne = nomPersonne;
        this.nomTransports = nomTransports;
        this.nomSitesTouristiques = nomSitesTouristiques;
        this.nomRestaurants = nomRestaurants;
        this.nomVilles = nomVilles;
    }

    //Getter/setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentaires() {
        return Commentaires;
    }

    public void setCommentaires(String Commentaires) {
        this.Commentaires = Commentaires;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
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

    public String getNomVilles() {
        return nomVilles;
    }

    public void setNomVilles(String nomVilles) {
        this.nomVilles = nomVilles;
    }

    // ToString

    @Override
    public String toString() {
        return "Commentaires{" +
                "id=" + id +
                ", commentaires='" + Commentaires + '\'' +
                ", nomPersonne='" + nomPersonne + '\'' +
                ", nomTransports='" + nomTransports + '\'' +
                ", nomSitesTouristiques='" + nomSitesTouristiques + '\'' +
                ", nomRestaurants='" + nomRestaurants + '\'' +
                ", nomVilles='" + nomVilles + '\'' +
                '}';
    }

    public void add(Commentaires commentaires) {
    }
}
