package Desplegables;

import ManejoArchivos.Archivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cooperativa extends javax.swing.JFrame {

    /**
     * Creates new form Cooperativa
     */
    public Cooperativa() {
        initComponents();
    }
    public String Lantigua = "";
    public boolean Modificar = false;
    
    private String dato;
    private String dato1;
    
    public void Dato(String dato){
        this.dato=dato;
        IDemp.setText(dato);
    }
    
    public void Dato1(String dato1){
        this.dato1=dato1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IDemp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtporcent = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtbalance = new javax.swing.JTextField();
        guardarbt = new javax.swing.JButton();
        salirbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cooperativa");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("ID del Empleado");

        IDemp.setEditable(false);
        IDemp.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Porcentaje de Descuento");

        txtporcent.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Balance Acumulado");

        txtbalance.setEditable(false);
        txtbalance.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        guardarbt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        guardarbt.setText("Guardar");
        guardarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtActionPerformed(evt);
            }
        });

        salirbt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        salirbt.setText("Salir");
        salirbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(guardarbt)
                        .addGap(40, 40, 40)
                        .addComponent(salirbt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtbalance))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtporcent, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDemp, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {guardarbt, salirbt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IDemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtporcent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarbt)
                    .addComponent(salirbt))
                .addGap(38, 38, 38))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {guardarbt, salirbt});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void salirbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbtActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirbtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String id_Emp = IDemp.getText();
        boolean encontrado = false;
        Scanner s;
        try {
            File f = new File("D:\\DB\\Cooperativa.txt");

            if (!f.exists()) {
                f.createNewFile();
            } else {
                s = new Scanner(f);

                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);
                    s1.useDelimiter("\\s*;\\s*");

                    if (id_Emp.equals(s1.next())) {
                        txtporcent.setText(s1.next());
                        txtbalance.setText(s1.next());
                        Lantigua = IDemp.getText() + ";" + txtporcent.getText() + ";" + txtbalance.getText();
                        Modificar = true;
                        encontrado = true;
                    } else {
                       
                        txtporcent.setText("");
                        txtbalance.setText("");
                        Modificar = false;
                        encontrado = false;
                    }

                }
                s.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException ex) {
            System.out.println("Error al abrir el archivo");
        }
        
        txtporcent.grabFocus();
        
    }//GEN-LAST:event_formWindowOpened

    private void guardarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtActionPerformed
        Archivos ar = new Archivos();
        String id, coopemp;
        id= IDemp.getText();
        boolean validar = true;
        double slr = Integer.parseInt(dato1);
        double porcentaje = Integer.parseInt(txtporcent.getText());
        
        double balance = slr * (porcentaje/100);
        
        if(txtporcent.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El porcentaje no debe estar vacio");
                validar=false;
                txtporcent.grabFocus();
            }else if(porcentaje==0 || porcentaje>5){
                JOptionPane.showMessageDialog(null, "El el porcentaje debe estar entre 1 a 5");
                validar=false;
                txtporcent.grabFocus(); 
            }
        
        
        File f = new File("D:\\DB\\Cooperativa.txt");
        try{
            if(!f.exists()){
                f.createNewFile();
            }
            coopemp=id+";"+porcentaje+";"+balance;
            
            if(validar){
             if(Modificar){
            ar.ModificarArchivo(Lantigua, coopemp, f);
            }else{
            ar.Guardar(coopemp, f);   
            }  
             this.dispose();
            }
            
            
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_guardarbtActionPerformed

        public boolean Buscar() {
        String id_Emp = IDemp.getText();
        boolean encontrado = false;
        Scanner s;
        try {
            File f = new File("D:\\DB\\Cooperativa.txt");

            if (!f.exists()) {
                f.createNewFile();
            } else {
                s = new Scanner(f);

                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);
                    s1.useDelimiter("\\s*;\\s*");

                    if (id_Emp.equals(s1.next())) {
                        txtporcent.setText(s1.next());
                        txtbalance.setText(s1.next());
                        Lantigua = IDemp.getText() + ";" + txtporcent.getText() + ";" + txtbalance.getText();
                        Modificar = true;
                        encontrado = true;
                    } else {
                        txtporcent.setText("");
                        txtbalance.setText("");
                        Modificar = false;
                        encontrado = false;
                    }

                }
                s.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException ex) {
            System.out.println("Error al abrir el archivo");
        }
        return encontrado;
    }
    
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
            java.util.logging.Logger.getLogger(Cooperativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cooperativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cooperativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cooperativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cooperativa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDemp;
    private javax.swing.JButton guardarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salirbt;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtporcent;
    // End of variables declaration//GEN-END:variables
}
