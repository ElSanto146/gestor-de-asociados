package com.carlos.lectorpdf.logica;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matriculados")
public class Matriculado implements Serializable {
    
    @Id
    private int matricula;
    private String nombre;
    private String apellido;
    private String categoria;
    private String direccion;
    private String localidad;
    private String telefono;
    private String observaciones;

    public Matriculado() {
    }  

    public Matriculado(int matricula, String nombre, String apellido, String categoria, String direccion, String localidad, String telefono, String observaciones) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.direccion = direccion;
        this.localidad = localidad;
        this.telefono = telefono;
        this.observaciones = observaciones;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }    
}