
package com.backend.porfolio.service;

import com.backend.porfolio.entity.RedSocial;
import com.backend.porfolio.repository.RRedSocial;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SRedSocial {
     @Autowired 
    public RRedSocial repoRedes;
    
    public List<RedSocial> verRedes() {
     List<RedSocial> listaRedes = repoRedes.findAll(); 
     return listaRedes;
    }
    
    //para editar es exactamente lo mismo.
    public void crearRed(RedSocial redes) {
        repoRedes.save(redes); 
    }
    
    public void borrarRed(int id) {
        repoRedes.deleteById(id);
    }
     public RedSocial buscarRed(int id) {
         RedSocial redes = repoRedes.findById(id).orElse(null);
         return redes;
     }

     //lo mismo que crear
        public void editarRed(RedSocial redes) {
        repoRedes.save(redes); 
    }       
}
