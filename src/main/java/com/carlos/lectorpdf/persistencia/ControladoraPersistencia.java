package com.carlos.lectorpdf.persistencia;

import com.carlos.lectorpdf.logica.Matriculado;
import com.carlos.lectorpdf.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ControladoraPersistencia {

    MatriculadoJpaController matriJpa = new MatriculadoJpaController();
    
    public void guardar(Matriculado matri) {
        matriJpa.create(matri);
    }

    public List<Matriculado> traerMatriculados() {
        return matriJpa.findMatriculadoEntities();
    }

    public void eliminar(int id_matri) {
        try {
            matriJpa.destroy(id_matri);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     

    public Matriculado buscarMatriculado(int id_matri) {
        return matriJpa.findMatriculado(id_matri);
    }

    public void modificar(Matriculado matri) {
        try {
            matriJpa.edit(matri);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
