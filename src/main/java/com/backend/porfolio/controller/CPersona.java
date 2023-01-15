package com.backend.porfolio.controller;

import com.backend.porfolio.entity.Persona;
import com.backend.porfolio.service.SPersona;
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
@RequestMapping("persona") //ruta localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
    @Autowired
    SPersona servPerson;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Persona> verPersonas() {
        return servPerson.verPersonas();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Persona buscarPersonas(@PathVariable int id) {
        return servPerson.buscarPersona(id);
    }
    
    @PostMapping ("/crear")
    public String agregarPersona (@RequestBody Persona pers){
        servPerson.crearPersona(pers);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarPersona(@PathVariable int id) {
        servPerson.borrarPersona(id);
        return "La persona fue eliminada correctamente";
    } 
    
    //otra forma de editar persona
    @PutMapping("/editar/{id}")
    public String actualizarPersona(@PathVariable int id, @RequestBody Persona pers) {
        pers.setId(id);
        servPerson.editarPersona(pers);
        return "La persona fue editada correctamente";
    }
}
