package com.backend.porfolio.service;

import com.backend.porfolio.entity.InfoFooter;
import com.backend.porfolio.repository.RInfoFooter;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SInfoFooter {
     @Autowired 
    public RInfoFooter RepoFooter;
    
    public List<InfoFooter> verFooter() {
     List<InfoFooter> listaFooter = RepoFooter.findAll(); 
     return listaFooter;
    }
    
    //para editar es exactamente lo mismo.
    public void crearInfo(InfoFooter info) {
        RepoFooter.save(info); 
    }
    
    public void borrarInfo(int id) {
        RepoFooter.deleteById(id);
    }
     public InfoFooter buscarInfo(int id) {
         InfoFooter info = RepoFooter.findById(id).orElse(null);
         return info;
     }

     //lo mismo que crear
        public void editarInfo(InfoFooter info) {
        RepoFooter.save(info); 
    }      
    
}
