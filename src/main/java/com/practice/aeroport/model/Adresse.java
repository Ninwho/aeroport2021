package com.practice.aeroport.model;

import lombok.Data;

@Data
public class Adresse {

    private String adresse;
    private String codePostal;
    private String ville;
    private String pays;

    public Adresse() {
    }

    public Adresse(String adresse,String codePostal, String ville,String pays) {
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

}
