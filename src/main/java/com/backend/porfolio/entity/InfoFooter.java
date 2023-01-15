package com.backend.porfolio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class InfoFooter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String marca;
    private String telefono;    

    public InfoFooter() {
    }

    public InfoFooter(String email, String marca, String telefono) {
        this.email = email;
        this.marca = marca;
        this.telefono = telefono;
    }
}
