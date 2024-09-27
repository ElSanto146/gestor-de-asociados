package com.carlos.lectorpdf.logica;

import com.carlos.lectorpdf.persistencia.ControladoraPersistencia;
import java.util.List;



public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void modificar(Matriculado matri, String apellido, String nombre, int matricula, String categoria, 
            String direccion, String localidad, String telefono, String observacion) {
        
         //Setear al objeto viejo los nuevos valores
         matri.setApellido(apellido);
         matri.setNombre(nombre);
         matri.setMatricula(matricula);
         matri.setCategoria(categoria);
         matri.setDireccion(direccion);
         matri.setLocalidad(localidad);
         matri.setTelefono(telefono);
         matri.setObservaciones(observacion);
         
         //llamar al método modificar y le pasamos el nuevo matriculado modificado
         controlPersis.modificar(matri);
    }

    public void guardar(String apellido, String nombre, int matricula, String categoria, 
            String direccion, String localidad, String telefono, String observacion) {
        Matriculado matri = new Matriculado(matricula, nombre, apellido, categoria, 
                direccion, localidad, telefono, observacion);
        
        controlPersis.guardar(matri);
        
        //Control de duplicidad 
    }

    public List<Matriculado> traerMatriculados() {
        return controlPersis.traerMatriculados();
    }

    public void eliminar(int id_matri) {
        controlPersis.eliminar(id_matri);
    }

    public Matriculado buscarMatriculado(int id_matri) {
        return controlPersis.buscarMatriculado(id_matri);
    }
    
    
}
