package com.backend.porfolio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class RedSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String icono;
    private String url;

    public RedSocial() {
    }

    public RedSocial(String icono, String url) {
        this.icono = icono;
        this.url = url;
    }
    
    
}
