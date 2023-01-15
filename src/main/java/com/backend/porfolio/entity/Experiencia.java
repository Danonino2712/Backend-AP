
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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String empresa;
    private String puesto;
    @Temporal(TemporalType.DATE)
    private Date inicio;
   @Temporal(TemporalType.DATE)
    private Date finalizacion;
    private String descripcion; 

    public Experiencia() {
    }

    public Experiencia(String empresa, String puesto, Date inicio, Date finalizacion, String descripcion) {
        this.empresa = empresa;
        this.puesto = puesto;
        this.inicio = inicio;
        this.finalizacion = finalizacion;
        this.descripcion = descripcion;
    }

  
}
