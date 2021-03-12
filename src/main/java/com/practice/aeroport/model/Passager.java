package com.practice.aeroport.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name="passagers")
public class Passager {

    private Long id;
    private String nom;
    private String prenom;
    private Adresse adresse;

}
