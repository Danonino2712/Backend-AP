package com.backend.porfolio.service;

import com.backend.porfolio.entity.Persona;
import com.backend.porfolio.repository.RPersona;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {

    public static Persona getOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Autowired 
    public RPersona repoPers;
    
    public List<Persona> verPersonas() {
     List<Persona> listaPersonas = repoPers.findAll(); 
     return listaPersonas;
    }
    
    //para editar es exactamente lo mismo.
    public void crearPersona(Persona perso) {
        repoPers.save(perso); 
    }
    
    public void borrarPersona(int id) {
        repoPers.deleteById(id);
    }
     public Persona buscarPersona(int id) {
         Persona perso = repoPers.findById(id).orElse(null);
         return perso;
     }

     //lo mismo que crear
        public void editarPersona(Persona perso) {
        repoPers.save(perso); 
    }
    
    
}
