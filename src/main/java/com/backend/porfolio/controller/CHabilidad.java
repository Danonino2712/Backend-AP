package com.backend.porfolio.controller;

import com.backend.porfolio.entity.Habilidad;
import com.backend.porfolio.service.SHabilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("habilidades") //ruta localhost:8080/habilidades
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidad {
    @Autowired
    SHabilidad servSkill;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Habilidad> verHabilidades() {
        return servSkill.verHabilidades();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Habilidad buscarHabilidades(@PathVariable int id) {
        return servSkill.buscarHabilidad(id);
    }
    
    @GetMapping("/detalle/{id}")
    public ResponseEntity<Habilidad> getById(@PathVariable("id") int id) {
       Habilidad skill = SHabilidad.getOne(id);
       return new ResponseEntity(skill, HttpStatus.OK);
    }
    
    @PostMapping ("/crear")
    public String agregarHabilidad (@RequestBody Habilidad skill){
        servSkill.crearHabilidad(skill);
        return "La habilidad fue creada correctamente";
    }
    
    //otra forma de editar persona 
    @PutMapping("/editar/{id}")
    public String actualizarHabilidad(@PathVariable int id, @RequestBody Habilidad skill) {
        skill.setId(id);
        servSkill.editarHabilidad(skill);
        return "La habilidad fue editada correctamente";
    }
        
    @DeleteMapping ("/borrar/{id}")
    public String eliminarHabilidad(@PathVariable int id) {
        servSkill.borrarHabilidad(id);
        return "La habilidad fue eliminada correctamente";
    } 
}
