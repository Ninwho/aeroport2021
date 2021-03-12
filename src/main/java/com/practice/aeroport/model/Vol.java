package com.practice.aeroport.model;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class Vol {

    private Long id;
    private Date dateDepart;
    private Date dateArrivee;
    private Date heureDepart;
    private Date heureArrivee;
    private Aeroport aeroportArrivee;
    private Aeroport aeroportDepart;
    private List<Escale> escales;

}
