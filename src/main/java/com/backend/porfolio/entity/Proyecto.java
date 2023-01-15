package com.backend.porfolio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    private String imagen;  

    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, String imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    } 
}
