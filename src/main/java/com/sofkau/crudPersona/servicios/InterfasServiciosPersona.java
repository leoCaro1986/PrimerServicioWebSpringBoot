package com.sofkau.crudPersona.servicios;

import com.sofkau.crudPersona.entidades.Persona;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface InterfasServiciosPersona {

    public List<Persona> listar();
    public Persona listarId(int id);
    public Persona guardar(Persona persona);
    public void borrar(int id);
    public Persona actualizar(Persona persona);
}
