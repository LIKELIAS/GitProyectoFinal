package Desplegables;

import ManejoArchivos.Archivos;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Puestos extends javax.swing.JFrame {

    /**
     * Creates new form Departamento
     */
    public Puestos() {
        initComponents();
    }
    
    public static String Lantigua;
    boolean modificar = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idpuestolbl = new javax.swing.JLabel();
        txtID_puesto = new javax.swing.JTextField();
        txtpuesto = new javax.swing.JTextField();
        puestolbl = new javax.swing.JLabel();
        etqEstado = new javax.swing.JLabel();
        btLimpiar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Puestos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(142, 205, 221));

        idpuestolbl.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        idpuestolbl.setText("ID Puestos");

        txtID_puesto.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtID_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_puestoActionPerformed(evt);
            }
        });
        txtID_puesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtID_puestoKeyPressed(evt);
            }
        });

        txtpuesto.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        puestolbl.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        puestolbl.setText("Puestos");

        etqEstado.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        etqEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btLimpiar.setBackground(new java.awt.Color(0, 102, 204));
        btLimpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        btGuardar.setBackground(new java.awt.Color(0, 102, 204));
        btGuardar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btSalir.setBackground(new java.awt.Color(0, 102, 204));
        btSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(91, 91, 91)
                        .addComponent(btLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(96, 96, 96)
                        .addComponent(btSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puestolbl)
                            .addComponent(idpuestolbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtID_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idpuestolbl)
                        .addComponent(txtID_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puestolbl)
                    .addComponent(txtpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btLimpiar)
                    .addComponent(btSalir))
                .addContainerGap(40, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        txtID_puesto.setText("");
        btSalir.enable(false);
        txtpuesto.setText("");
        txtpuesto.setEditable(false);
        btGuardar.enable(false);
        etqEstado.setText("");
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
      if(txtID_puesto.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Se debe rellenar el id antes de guardar");
        }else if (txtpuesto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Se debe rellenar el nombre del puesto antes de guardar");
        } else {

            File f = new File("D:\\DB\\Puestos.txt");

            try {
                if (!f.exists()) {
                    f.createNewFile();
                } else {
                    String Lactual = txtID_puesto.getText() + ";" + txtpuesto.getText();
                    Archivos AR = new Archivos();
                    if (modificar) {
                        AR.ModificarArchivo(Lantigua, Lactual, f);
                        JOptionPane.showMessageDialog(null,"Modificado exitosamente");
                        btLimpiarActionPerformed(evt);
                    } else {
                        AR.Guardar(Lactual, f);
                        JOptionPane.showMessageDialog(null,"Guardado exitosamente");
                        btLimpiarActionPerformed(evt);                        
                    }
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }       
    }//GEN-LAST:event_btGuardarActionPerformed

    private void txtID_puestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtID_puestoKeyPressed
        
    }//GEN-LAST:event_txtID_puestoKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void txtID_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_puestoActionPerformed
        try{
            int id = Integer.parseInt(txtID_puesto.getText());
            if(id <=0){
                JOptionPane.showMessageDialog(rootPane, "El Id debe ser un número positivo intente nuevamente");
                btLimpiarActionPerformed(evt);
                txtID_puesto.grabFocus();
            }else{
                txtpuesto.setEditable(true);
                btGuardar.setEnabled(true);
                boolean enct = false;
                Scanner s;
                
                try{
                    File f = new File("D:\\DB\\Puestos.txt");
                    
                    if(!f.exists()){
                        f.createNewFile();
                        etqEstado.setText("Creando");
                    }else{
                        s = new Scanner(f);
                        while(s.hasNextLine() && !enct){
                            String Lactual = s.nextLine();
                             Scanner s1 = new Scanner(Lactual);

                            s1.useDelimiter("\\s*;\\s*");
                            
                            try {

                                if (id == Integer.parseInt(s1.next())) {
                                    txtpuesto.setText(s1.next());
                                    modificar = true;
                                    Lantigua = txtID_puesto.getText() + ";" + txtpuesto.getText();
                                    etqEstado.setText("Modificando");
                                    enct = true;
                                } else {
                                    txtpuesto.setText("");
                                    modificar = false;
                                    etqEstado.setText("Creando");
                                    enct = false;
                                }

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        s.close();
                        txtpuesto.grabFocus();
                    }
                      
                }catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                }catch (IOException ex) {
                    System.out.println("Error: " + ex);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "El Id no permite carácteres, intente nuevamente...");
            btLimpiarActionPerformed(evt);
        }
    }//GEN-LAST:event_txtID_puestoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Puestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puestos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel idpuestolbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel puestolbl;
    private javax.swing.JTextField txtID_puesto;
    private javax.swing.JTextField txtpuesto;
    // End of variables declaration//GEN-END:variables

    private void btnLimpiarActionPerformed(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
