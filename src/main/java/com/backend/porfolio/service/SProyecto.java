package com.backend.porfolio.service;

import com.backend.porfolio.entity.Proyecto;
import com.backend.porfolio.repository.RProyecto;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired 
    public RProyecto repoPro;
    
    public List<Proyecto> verProyectos() {
     List<Proyecto> listaProyectos = repoPro.findAll(); 
     return listaProyectos;
    }
    
    //para editar es exactamente lo mismo.
    public void crearProyecto(Proyecto pro) {
        repoPro.save(pro); 
    }
    
    public void borrarProyecto(int id) {
        repoPro.deleteById(id);
    }
     public Proyecto buscarProyecto(int id) {
         Proyecto pro = repoPro.findById(id).orElse(null);
         return pro;
     }

     //lo mismo que crear
        public void editarProyecto(Proyecto pro) {
        repoPro.save(pro); 
    }
        
}
