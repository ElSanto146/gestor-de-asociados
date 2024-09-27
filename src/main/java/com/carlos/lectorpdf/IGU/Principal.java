package com.carlos.lectorpdf.IGU;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCargarRecorrido = new javax.swing.JButton();
        btnVerMatriculados = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCargarMatriculado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 28)); // NOI18N
        jLabel1.setText("BIENVENIDO AL SISTEMA GESTOR DE ASOCIADOS");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 21)); // NOI18N
        jLabel2.setText("¿Qué desea hacer?");

        btnCargarRecorrido.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        btnCargarRecorrido.setText("CARGAR RECORRIDO");
        btnCargarRecorrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarRecorridoActionPerformed(evt);
            }
        });

        btnVerMatriculados.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        btnVerMatriculados.setText("VER ASOCIADOS");
        btnVerMatriculados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMatriculadosActionPerformed(evt);
            }
        });

        jLabel3.setText("foto ");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCargarMatriculado.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        btnCargarMatriculado.setText("CARGAR UN NUEVO ASOCIADO");
        btnCargarMatriculado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarMatriculadoActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCargarMatriculado)
                            .addComponent(jLabel1)
                            .addComponent(btnCargarRecorrido)
                            .addComponent(btnVerMatriculados)
                            .addComponent(btnSalir)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(btnCargarRecorrido)
                .addGap(18, 18, 18)
                .addComponent(btnCargarMatriculado)
                .addGap(18, 18, 18)
                .addComponent(btnVerMatriculados)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarRecorridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarRecorridoActionPerformed
        CargaRecorridos pantalla = new CargaRecorridos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCargarRecorridoActionPerformed

    private void btnVerMatriculadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMatriculadosActionPerformed
        VerAsociados pantalla = new VerAsociados();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_btnVerMatriculadosActionPerformed

    private void btnCargarMatriculadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarMatriculadoActionPerformed
        CargarMatriculado pantalla = new CargarMatriculado();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCargarMatriculadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarMatriculado;
    private javax.swing.JButton btnCargarRecorrido;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerMatriculados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
