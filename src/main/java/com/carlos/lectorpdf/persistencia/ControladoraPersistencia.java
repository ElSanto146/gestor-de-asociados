package com.carlos.lectorpdf.persistencia;

import com.carlos.lectorpdf.logica.Matriculado;
import com.carlos.lectorpdf.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladoraPersistencia {

    MatriculadoJpaController matJPA = new MatriculadoJpaController();

    public void guardar(Matriculado matri) {
        try {
            matJPA.create(matri);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Matriculado> traerMatriculados() {
       return matJPA.findMatriculadoEntities();
    }

    public void eliminar(int id_matri) {
        try {
            matJPA.destroy(id_matri);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Matriculado buscarMatriculado(int id_matri) {
        return matJPA.findMatriculado(id_matri);
    }

    public void modificar(Matriculado matri) {
        try {
            matJPA.edit(matri);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
