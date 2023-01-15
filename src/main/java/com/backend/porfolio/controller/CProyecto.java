package com.backend.porfolio.controller;

import com.backend.porfolio.entity.Proyecto;
import com.backend.porfolio.service.SProyecto;
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
@RequestMapping("proyectos") //ruta localhost:8080/proyectos
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto { 
    @Autowired
    SProyecto servPro;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return servPro.verProyectos();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Proyecto buscarProyectos(@PathVariable int id) {
        return servPro.buscarProyecto(id);
    }
    
         @GetMapping("/detalle/{id}")
    public ResponseEntity<Proyecto> getById(@PathVariable("id") int id) {
       Proyecto pro = SProyecto.getOne(id);
       return new ResponseEntity(pro, HttpStatus.OK);
    }
    
    @PostMapping ("/crear")
    public String agregarProyecto (@RequestBody Proyecto pro){
        servPro.crearProyecto(pro);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarProyecto(@PathVariable int id) {
        servPro.borrarProyecto(id);
        return "El proyecto fue eliminado correctamente";
    } 
    
    //otra forma de editar persona    
    @PutMapping("/editar/{id}")
    public String actualizarProyecto(@PathVariable int id, @RequestBody Proyecto pro) {
        pro.setId(id);
        servPro.editarProyecto(pro);
        return "El proyecto fue editado correctamente";
    }
}
