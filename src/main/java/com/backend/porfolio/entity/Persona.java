package com.backend.porfolio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String descripcion;
    private String foto;
    private String banner;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String descripcion, String foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.foto = foto;
    }
}

