package com.backend.porfolio.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String institucion;
    @Temporal(TemporalType.DATE)
    private Date inicio;
   @Temporal(TemporalType.DATE)
    private Date finalizacion;
    private String descripcion; 

    public Estudio() {
    }

    public Estudio(String titulo, String institucion, Date inicio, Date finalizacion, String descripcion) {
        this.titulo = titulo;
        this.institucion = institucion;
        this.inicio = inicio;
        this.finalizacion = finalizacion;
        this.descripcion = descripcion;
    }
    
    
}
