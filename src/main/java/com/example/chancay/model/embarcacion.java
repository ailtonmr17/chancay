package com.example.chancay.model;
import jakarta.persistence.*;
@Entity
@Table(name="embarcacion")
public class embarcacion {

    //creacion de la clave primaria id auto_icremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (length = 50, nullable = false)
    private String nombre;

    //columna capacidad en toneladas para la carga
    @Column (nullable = false)
    private double capacidad;

    //Descripcion de la embarcacion
    @Column(length = 250,nullable = true)
    private String descripcion;
    
    //getter and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}