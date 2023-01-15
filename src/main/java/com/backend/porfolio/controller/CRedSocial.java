package com.backend.porfolio.controller;

import com.backend.porfolio.entity.RedSocial;
import com.backend.porfolio.service.SRedSocial;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redes") //ruta localhost:8080/redes
@CrossOrigin(origins = "http://localhost:4200")
public class CRedSocial {
     @Autowired
    SRedSocial servRedes;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<RedSocial> verRedes() {
        return servRedes.verRedes();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public RedSocial buscarRedes(@PathVariable int id) {
        return servRedes.buscarRed(id);
    }
    
    @PostMapping ("/crear")
    public String agregarRed (@RequestBody RedSocial red){
        servRedes.crearRed(red);
        return "La red social fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarRed(@PathVariable int id) {
        servRedes.borrarRed(id);
        return "La red social fue eliminada correctamente";
    } 
    
    //otra forma de editar persona
        @PutMapping("/editar/{id}")
    public String actualizarRed(@PathVariable int id, @RequestBody RedSocial red) {
        red.setId(id);
        servRedes.editarRed(red);
        return "La red social fue editada correctamente";
    }
}
