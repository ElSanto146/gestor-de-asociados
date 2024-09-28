package com.carlos.lectorpdf.IGU;

import com.carlos.lectorpdf.logica.Controladora;
import com.carlos.lectorpdf.logica.Matriculado;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public class CargaRecorridos extends javax.swing.JFrame {
    
    Controladora control = new Controladora();

    public CargaRecorridos() {
        initComponents();
        txtCargaPdf.setEditable(false);//No editable
        txtMostrarNombrePDF.setEditable(false);//No editable
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarPDF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCargaPdf = new javax.swing.JTextArea();
        txtMostrarNombrePDF = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMatriculados = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Ingrese el recorrido");

        btnBuscarPDF.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnBuscarPDF.setText("Buscar pdf");
        btnBuscarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPDFActionPerformed(evt);
            }
        });

        txtCargaPdf.setColumns(20);
        txtCargaPdf.setRows(5);
        jScrollPane1.setViewportView(txtCargaPdf);

        txtMostrarNombrePDF.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        btnLimpiar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlos\\OneDrive\\Documentos\\JAVA 2\\LectorPDF\\src\\main\\java\\com\\carlos\\lectorpdf\\IGU\\img\\wipe-29x30.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtMatriculados.setColumns(20);
        txtMatriculados.setRows(5);
        jScrollPane2.setViewportView(txtMatriculados);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Matriculados de UPROGASF");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Nombre del archivo:");

        btnVolver.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlos\\OneDrive\\Documentos\\JAVA 2\\LectorPDF\\src\\main\\java\\com\\carlos\\lectorpdf\\IGU\\img\\return-31x31.png")); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscarPDF)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMostrarNombrePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpiar)
                                    .addComponent(btnVolver)))
                            .addComponent(jLabel3))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarPDF)
                    .addComponent(txtMostrarNombrePDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnLimpiar)
                        .addGap(60, 60, 60)
                        .addComponent(btnVolver)))
                .addContainerGap(10, Short.MAX_VALUE))
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

    private void btnBuscarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPDFActionPerformed

        //Crea una instancia de JFileChooser que abre el cuadro de diálogo para seleccionar archivos.
        JFileChooser fileChooser = new JFileChooser();

        // Establecer un filtro para aceptar solo archivos PDF
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File f) {
                // Acepta directorios y archivos que terminan en .pdf
                return f.isDirectory() || f.getName().toLowerCase().endsWith(".pdf");
            }
            @Override
            public String getDescription() {
                return "Archivos PDF (*.pdf)";
            }
        });

        // Mostrar el cuadro de diálogo para abrir archivo
        int result = fileChooser.showOpenDialog(null);//'null' para que aparezca en el centro de la pantalla
        if (result == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado
            File selectedFile = fileChooser.getSelectedFile();
            // Mostrar la ruta del archivo en el JTextField (o donde quieras)
            txtMostrarNombrePDF.setText(selectedFile.getName());
            //Implementar el método leerMostrar
            leerMostrar(selectedFile);
        } else {
            // Si el usuario cancela, cartel de cancelación
            JOptionPane.showMessageDialog(null, "Selección de archivo cancelada", "Información", 1);
        }
        
        //BUSCAR Y MOSTRAR LOS MATRICULADOS
        //Carga de los datos desde la base de datos. Los guardamos en una lista
        List<Matriculado> listaMatriculados = control.traerMatriculados();
        
        //Crear una lista para guardar los número de matrícula
        List<String> numeroMatriculas = new ArrayList<>();
        //Agregar las matrículas a la nueva lista
        for (Matriculado matri : listaMatriculados ) {
            numeroMatriculas.add(String.valueOf(matri.getMatricula()));
        }

        // Obtener el texto del JTextArea y pasarlo a mayúsculas
        String pdfText = txtCargaPdf.getText().toUpperCase();

        // Dividir el texto en líneas
        String[] lines = pdfText.split("\n");

        // Crear una lista para guardar las filas donde se encuentran las matrículas
        List<String> foundLines = new ArrayList<>();

        // Buscar cada número de matrícula en el texto
        for (String number : numeroMatriculas) {
            for (String line : lines) {
                if (line.contains(number)) {
                    foundLines.add(line);  // Guardar la línea completa si contiene el número de matrícula
                }
            }
        }

        // Mostrar las filas encontradas en el textAreaBuscar
        if (!foundLines.isEmpty()) {
            StringBuilder resultado = new StringBuilder();
            for (String line : foundLines) {
                resultado.append(line).append(System.lineSeparator()).append(System.lineSeparator());
            }
            txtMatriculados.setText(resultado.toString());
            txtMatriculados.setCaretPosition(0);
        } else {
            txtMatriculados.setText("No se encontró a ningún asociado en el recorrido");
        }
    }//GEN-LAST:event_btnBuscarPDFActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCargaPdf.setText("");
        txtMatriculados.setText("");
        txtMostrarNombrePDF.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal panta = new Principal();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPDF;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtCargaPdf;
    private javax.swing.JTextArea txtMatriculados;
    private javax.swing.JTextField txtMostrarNombrePDF;
    // End of variables declaration//GEN-END:variables

    private void leerMostrar(File selectedFile) {
        try {
            String pdfText = readPDF(selectedFile);//Abajo está el método readPDF
            txtCargaPdf.setText(pdfText);  // Mostrar el texto en el JTextArea
            txtCargaPdf.setCaretPosition(0);//Colocar el cursor al inicio del texto
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al leer el archivo PDF", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Método para leer el contenido de un archivo PDF usando PDFBox
    private String readPDF(File selectedFile) throws IOException {
        // Cargar el archivo PDF
        PDDocument document = PDDocument.load(selectedFile);
        // Usar PDFTextStripper para extraer el texto
        PDFTextStripper pdfStripper = new PDFTextStripper();
        String text = pdfStripper.getText(document);
        document.close();  // Cerrar el documento después de leerlo
        return text;
    }
}
