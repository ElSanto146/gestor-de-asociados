package com.carlos.lectorpdf.IGU;


import com.carlos.lectorpdf.logica.Controladora;
import com.carlos.lectorpdf.logica.Matriculado;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VerAsociados extends javax.swing.JFrame {
    
    //Instancia global
    Controladora control;


    public VerAsociados() {
        //inicia una nueva instancia de la controladora cuando inicia VerDatos
        control = new Controladora();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMatriculados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        jLabel1.setText("Visualización de Datos");
        jLabel1.setToolTipText("");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaMatriculados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMatriculados);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Datos de los asociados");

        btnEliminar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar)
                            .addComponent(btnVolver)))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento de Ventana. Cuando abre la ventana inicia el método cargarTabla()
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Controlamos que la tabla no esté vacia. Cuenta la cantidad de filas
        if (tablaMatriculados.getRowCount()>0) {
            //Controlamos que haya una fila seleccionada
            if (tablaMatriculados.getSelectedRow()!=-1) {
                //convertimos a string el objeto que traemos desde la fila seleccionada y la columna 0, luego lo parseamos
                int id_matri = Integer.parseInt(String.valueOf(tablaMatriculados.getValueAt(tablaMatriculados.getSelectedRow(),0)));
                control.eliminar(id_matri); 
                //aviso al usuario que borró correctamente
                cartel("Se eliminó con éxito", "info", "Eliminación exitosa");
                //Vuelve a cargar la tabla sin el regristro eliminado
                cargarTabla();
            }
            else{
                //aviso al usuario que error al borrar
                cartel("Selecciona un regristro para eliminar", "", "Error al Eliminar");
            }            
        } 
        else{
            //aviso al usuario que error al borrar
            cartel("La tabla está vacía", "", "Error al Eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

         //Controlamos que la tabla no esté vacia. Cuenta la cantidad de filas
        if (tablaMatriculados.getRowCount()>0) {
            //Controlamos que haya una fila seleccionada
            if (tablaMatriculados.getSelectedRow()!=-1) {
                //convertimos a string el objeto que traemos desde la fila seleccionada y la columna 0, luego lo parseamos
                int id_matri = Integer.parseInt(String.valueOf(tablaMatriculados.getValueAt(tablaMatriculados.getSelectedRow(),0)));
                 
                //Abre la pantalla de Modificar datos y le pasamos el id de la fila seleccionada
                ModificarMatriculado pantallaModif = new ModificarMatriculado(id_matri);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
            }
            else{
                //aviso al usuario que error al modificar
                cartel("Selecciona un matriculado para modificar", "", "Error al Modificar");
            }            
        } 
        else{
            //aviso al usuario que error al modificar
            cartel("Tabla Vacía.\nNo hay matriculados para modificar", "", "Error al Modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal panta = new Principal();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMatriculados;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //Definir el modelo que queremos que tenga la tabla
        DefaultTableModel Modelotabla = new DefaultTableModel(){
            //Parámetro para que filas y col no sean editables
            @Override
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };//Todo esto es la instancia de la Tabla
        
        //Establecemos los nombres de los encabezados de las columnas
        String titulos[]={"Registro", "Apellido", "Nombre", "Matrícula", "Categoría", 
            "Dirección", "Localidad", "Teléfono", "Observaciones" };
        Modelotabla.setColumnIdentifiers(titulos);
        
        //Carga de los datos desde la base de datos. Los guardamos en una lista
        List<Matriculado> listaMatriculados = control.traerMatriculados();
        
        //Recorrer la lista y mostrar cada uno de los objetos en la tabla
        //Con un if chequeamos que la lista no esté vacía
        if (listaMatriculados!=null) {
            for (Matriculado matri : listaMatriculados) {
                //Crear un Array de tipo objeto
                Object[] mascota = {matri.getId(), matri.getApellido(), matri.getNombre(), matri.getMatricula(),
                matri.getCategoria(), matri.getDireccion(), matri.getLocalidad(), matri.getTelefono(),
                matri.getObservaciones()};
                
                //Agregar la fila a la tabla seteada con cada mascota
                Modelotabla.addRow(mascota);
            }
        } else {
            cartel("No hay datos que mostrar\nPor favor Carga un Asociado", "info", "No hay nada que mostrar");
        }
        //Agregar el modelo de la tabla a la variable Tabla. para que se haga visible
        tablaMatriculados.setModel(Modelotabla);
    }
    
    private void cartel(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equalsIgnoreCase("info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
}
