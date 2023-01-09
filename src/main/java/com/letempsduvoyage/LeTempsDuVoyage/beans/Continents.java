package com.letempsduvoyage.LeTempsDuVoyage.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Continents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributs
    private int id;
    private String nom;


    //constructeurs
    //Getter/setter
    //ToString
}
