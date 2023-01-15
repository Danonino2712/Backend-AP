package com.backend.porfolio.controller;

import com.backend.porfolio.entity.Experiencia;
import com.backend.porfolio.service.SExperiencia;
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
@RequestMapping("experiencia") //ruta localhost:8080/experiencia
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    @Autowired
    SExperiencia servExp;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return servExp.verExperiencias();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Experiencia buscarExperiencias(@PathVariable int id) {
        return servExp.buscarExperiencia(id);
    }
    
        @GetMapping("/detalle/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id) {
       Experiencia exp = SExperiencia.getOne(id);
       return new ResponseEntity(exp, HttpStatus.OK);
    }
    
    @PostMapping ("/crear")
    public String agregarExperiencia (@RequestBody Experiencia exp){
        servExp.crearExperiencia(exp);
        return "La experiencia fue creada correctamente";
    }
    
    //otra forma de editar experiencia
    @PutMapping("/editar/{id}")
    public String actualizarExperiencia (@PathVariable int id, @RequestBody Experiencia exp) {
        exp.setId(id);
       servExp.editarExperiencia(exp);
       return "La experiencia fue editada correctamente";
    }
    
        @DeleteMapping ("/borrar/{id}")
    public String eliminarExperiencia(@PathVariable int id) {
        servExp.borrarExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    } 
}
