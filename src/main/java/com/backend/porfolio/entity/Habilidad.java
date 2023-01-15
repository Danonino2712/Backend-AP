package com.backend.porfolio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String habilidad;
    private int porcentaje;  

    public Habilidad() {
    }

    public Habilidad(String habilidad, int porcentaje) {
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }
}
