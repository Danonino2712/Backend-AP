package com.backend.porfolio.controller;

import com.backend.porfolio.entity.InfoFooter;
import com.backend.porfolio.service.SInfoFooter;
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
@RequestMapping("info") //ruta localhost:8080/info
@CrossOrigin(origins = "http://localhost:4200")
public class CInfoFooter {
     @Autowired
    SInfoFooter infoServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List<InfoFooter> verInfo() {
        return infoServ.verFooter();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public InfoFooter buscarInfo(@PathVariable int id) {
        return infoServ.buscarInfo(id);
    }
    
    @GetMapping("/detalle/{id}")
    public ResponseEntity<InfoFooter> getById(@PathVariable("id") int id) {
       InfoFooter info = SInfoFooter.getOne(id);
       return new ResponseEntity(info, HttpStatus.OK);
    }
    
    @PostMapping ("/crear")
    public String agregarInfo (@RequestBody InfoFooter info){
        infoServ.crearInfo(info);
        return "La información del footer fue creada correctamente";
    }
    
    //otra forma de editar persona 
        @PutMapping("/editar/{id}")
    public String actualizarInfo(@PathVariable int id, @RequestBody InfoFooter info) {
        info.setId(id);
        infoServ.editarInfo(info);
        return "La información del footer fue editada correctamente";
    }
    
        @DeleteMapping ("/borrar/{id}")
    public String eliminarInfo(@PathVariable int id) {
        infoServ.borrarInfo(id);
        return "La información del footer fue eliminada correctamente";
    }
}
