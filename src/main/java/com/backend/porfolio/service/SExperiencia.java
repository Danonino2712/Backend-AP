package com.backend.porfolio.service;

import com.backend.porfolio.entity.Experiencia;
import com.backend.porfolio.repository.RExperiencia;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {

    public static Experiencia getOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Autowired 
    public RExperiencia repoExp;
    
    public List<Experiencia> verExperiencias() {
     List<Experiencia> listaExperiencias = repoExp.findAll(); 
     return listaExperiencias;
    }
    
    //para editar es exactamente lo mismo.
    public void crearExperiencia(Experiencia exp) {
        repoExp.save(exp); 
    }
    
    public void borrarExperiencia(int id) {
        repoExp.deleteById(id);
    }
     public Experiencia buscarExperiencia(int id) {
         Experiencia exp = repoExp.findById(id).orElse(null);
         return exp;
     }

     //lo mismo que crear
        public void editarExperiencia(Experiencia exp) {
        repoExp.save(exp); 
    }
    
        
    
}
