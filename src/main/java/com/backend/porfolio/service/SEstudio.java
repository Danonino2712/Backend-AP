package com.backend.porfolio.service;

import com.backend.porfolio.entity.Estudio;
import com.backend.porfolio.repository.REstudio;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEstudio {

    public static Estudio getOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Autowired 
    public REstudio RepoStudies;
    
    public List<Estudio> verEstudios() {
     List<Estudio> listaEstudios = RepoStudies.findAll(); 
     return listaEstudios;
    }
    
    //para editar es exactamente lo mismo.
    public void crearEstudio(Estudio study) {
        RepoStudies.save(study); 
    }
    
    public void borrarEstudio(int id) {
        RepoStudies.deleteById(id);
    }
     public Estudio buscarEstudio(int id) {
         Estudio study = RepoStudies.findById(id).orElse(null);
         return study;
     }

     //lo mismo que crear
        public void editarEstudio(Estudio study) {
        RepoStudies.save(study); 
    }
    
        
}
