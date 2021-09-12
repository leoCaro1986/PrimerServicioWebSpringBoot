package com.sofkau.crudPersona.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
    private Integer id;
    private String nombre;
}
