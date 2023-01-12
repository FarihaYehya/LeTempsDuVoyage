package com.letempsduvoyage.LeTempsDuVoyage.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Attributs

    private int id;
    private String typeTransports;

    //constructeurs

    public Transports() {
    }

    public Transports(String typeTransports) {
        this.typeTransports = typeTransports;
    }
//Getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeTransports() {
        return typeTransports;
    }

    public void setTypeTransports(String typeTransports) {
        this.typeTransports = typeTransports;
    }

    //ToString

    @Override
    public String toString() {
        return "Transports{" +
                "id=" + id +
                ", typeTransports='" + typeTransports + '\'' +
                '}';
    }
}
