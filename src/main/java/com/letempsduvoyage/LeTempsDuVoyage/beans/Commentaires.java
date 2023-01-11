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
    private String commentaires;
    private int idPersonne;
    private int idVilles;
    private int idtransports;
    private int idsitesTouristiques;
    private int idrestaurants;



    //constructeurs

    public Commentaires() {
    }

    public Commentaires(String commentaires, int idPersonne, int idVilles, int idtransports, int idsitesTouristiques, int idrestaurants) {
        this.commentaires = commentaires;
        this.idPersonne = idPersonne;
        this.idVilles = idVilles;
        this.idtransports = idtransports;
        this.idsitesTouristiques = idsitesTouristiques;
        this.idrestaurants = idrestaurants;
    }


    //Getter/setter

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

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public int getIdVilles() {
        return idVilles;
    }

    public void setIdVilles(int idVilles) {
        this.idVilles = idVilles;
    }

    public int getIdtransports() {
        return idtransports;
    }

    public void setIdtransports(int idtransports) {
        this.idtransports = idtransports;
    }

    public int getIdsitesTouristiques() {
        return idsitesTouristiques;
    }

    public void setIdsitesTouristiques(int idsitesTouristiques) {
        this.idsitesTouristiques = idsitesTouristiques;
    }

    public int getIdrestaurants() {
        return idrestaurants;
    }

    public void setIdrestaurants(int idrestaurants) {
        this.idrestaurants = idrestaurants;
    }

    //ToString

    @Override
    public String toString() {
        return "Commentaires{" +
                "id=" + id +
                ", commentaires='" + commentaires + '\'' +
                ", idPersonne=" + idPersonne +
                ", idVilles=" + idVilles +
                ", idtransports=" + idtransports +
                ", idsitesTouristiques=" + idsitesTouristiques +
                ", idrestaurants=" + idrestaurants +
                '}';
    }
}
