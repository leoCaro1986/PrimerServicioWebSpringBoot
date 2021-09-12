package com.sofkau.crudPersona.controlador;

import com.sofkau.crudPersona.entidades.Persona;
import com.sofkau.crudPersona.servicios.InterfasServiciosPersona;
import com.sofkau.crudPersona.servicios.ServicioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class ControladorPersona {

    @Autowired
    private InterfasServiciosPersona servicio;

    @GetMapping(value = "/listarPersonas")
    public Iterable<Persona>listarPersonas(){
        return servicio.listar();
    }

    @GetMapping(value= "/listarPersonaPorId/{id}")
    public Optional<Persona> listarId(@PathVariable int id){
        return servicio.listarId(id);
    }

    @PostMapping(value = "/guardarPersona")
    public  Persona guardarPersona(@RequestBody Persona persona){
        return servicio.guardar(persona);
    }
    @DeleteMapping(value = "borrarPorId/{id}")
    public void borrar(@PathVariable int id){
        servicio.borrar(id);
    }
    @PutMapping(value = "/actualizar")
    public Persona actualizar(@RequestBody Persona persona){
        return servicio.actualizar(persona);
    }


}
