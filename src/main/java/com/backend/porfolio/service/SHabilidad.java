package com.backend.porfolio.service;

import com.backend.porfolio.entity.Habilidad;
import com.backend.porfolio.repository.RHabilidad;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad {

    public static Habilidad getOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Autowired 
    public RHabilidad repoSkill;
    
    public List<Habilidad> verHabilidades() {
     List<Habilidad> listaHabilidades = repoSkill.findAll(); 
     return listaHabilidades;
    }
    
    //para editar es exactamente lo mismo.
    public void crearHabilidad(Habilidad skill) {
        repoSkill.save(skill); 
    }
    
    public void borrarHabilidad(int id) {
        repoSkill.deleteById(id);
    }
     public Habilidad buscarHabilidad(int id) {
         Habilidad skill = repoSkill.findById(id).orElse(null);
         return skill;
     }

     //lo mismo que crear
        public void editarHabilidad(Habilidad skill) {
        repoSkill.save(skill); 
    }    
}
