package com.backend.porfolio.controller;

import com.backend.porfolio.entity.Estudio;
import com.backend.porfolio.service.SEstudio;
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
@RequestMapping("estudio") //ruta localhost:8080/estudio
@CrossOrigin(origins = "http://localhost:4200")
public class CEstudio {
    @Autowired
    SEstudio servStudy;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Estudio> verEstudios() {
        return servStudy.verEstudios();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Estudio buscarEstudios(@PathVariable int id) {
        return servStudy.buscarEstudio(id);
    }
    
    @PostMapping ("/crear")
    public String agregarEstudios (@RequestBody Estudio study){
        servStudy.crearEstudio(study);
        return "El estudio fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarEstudios(@PathVariable int id) {
        servStudy.borrarEstudio(id);
        return "El estudio fue eliminado correctamente";
    } 
    
    //otra forma de editar estudio
    @PutMapping("/editar/{id}")
    public String actualizarEstudio(@PathVariable int id, @RequestBody Estudio study) {
        study.setId(id);
       servStudy.editarEstudio(study);
       return "El estudio fue editado correctamente";
    }
    
        
}
