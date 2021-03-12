package com.practice.aeroport.model;

import org.springframework.data.annotation.Id;

public class Aeroport {

    @Id
    private Long id;
    private String nom;
    private Ville ville;

    public Aeroport() {
    }

    public Aeroport(String nom, Ville ville) {
        this.nom = nom;
        this.ville = ville;
    }

}
