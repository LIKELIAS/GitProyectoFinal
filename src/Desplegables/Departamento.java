package Desplegables;

import ManejoArchivos.Archivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;

public class Departamento extends javax.swing.JFrame {

    public Departamento() {
        initComponents();
    }
    public static String Lantigua;
    boolean modificar = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqID_depart = new javax.swing.JLabel();
        txtID_depart = new javax.swing.JTextField();
        txtDepart = new javax.swing.JTextField();
        etqDepart = new javax.swing.JLabel();
        etqEstado = new javax.swing.JLabel();
        btLimpiar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Departamentos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(142, 205, 221));

        etqID_depart.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        etqID_depart.setText("ID Departamento");

        txtID_depart.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtID_depart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_departActionPerformed(evt);
            }
        });
        txtID_depart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtID_departKeyPressed(evt);
            }
        });

        txtDepart.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        etqDepart.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        etqDepart.setText("Departamento");

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
                            .addComponent(etqDepart)
                            .addComponent(etqID_depart))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtID_depart, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etqID_depart)
                        .addComponent(txtID_depart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDepart)
                    .addComponent(txtDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        txtID_depart.setText("");
        btSalir.enable(false);
        txtDepart.setText("");
        btGuardar.enable(false);
        etqEstado.setText("");
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        if(txtID_depart.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Se debe rellenar el id antes de guardar");
        }else if (txtDepart.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Se debe rellenar el nombre del puesto antes de guardar");
        } else {

            File f = new File("D:\\DB\\Departamentos.txt");

            try {
                if (!f.exists()) {
                    f.createNewFile();
                } else {
                    String Lactual = txtID_depart.getText() + ";" + txtDepart.getText();
                    Archivos AR = new Archivos();
                    if (modificar) {
                        AR.ModificarArchivo(Lantigua, Lactual, f);
                        btLimpiarActionPerformed(evt);
                    } else {
                        AR.Guardar(Lactual, f);
                        btLimpiarActionPerformed(evt);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void txtID_departKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtID_departKeyPressed
        
    }//GEN-LAST:event_txtID_departKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void txtID_departActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_departActionPerformed
        try{
            int id = Integer.parseInt(txtID_depart.getText());
            if(id <=0){
                JOptionPane.showMessageDialog(rootPane, "El Id debe ser un número positivo intente nuevamente");
                btLimpiarActionPerformed(evt);
                txtID_depart.grabFocus();
            }else{
                txtDepart.setEditable(true);
                btGuardar.setEnabled(true);
                boolean enct = false;
                Scanner s;
                
                try{
                    File f = new File("D:\\DB\\Departamentos.txt");
                    
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
                                    txtDepart.setText(s1.next());
                                    modificar = true;
                                    Lantigua = txtID_depart.getText() + ";" + txtDepart.getText();
                                    etqEstado.setText("Modificando");
                                    enct = true;
                                } else {
                                    txtDepart.setText("");
                                    modificar = false;
                                    etqEstado.setText("Creando");
                                    enct = false;
                                }

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        s.close();
                        txtDepart.grabFocus();
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
    }//GEN-LAST:event_txtID_departActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Departamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel etqDepart;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqID_depart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDepart;
    private javax.swing.JTextField txtID_depart;
    // End of variables declaration//GEN-END:variables
}
