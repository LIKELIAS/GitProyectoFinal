package Login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginUsuario extends javax.swing.JFrame {

    /**
     * Creates new form LoginUsuario
     */
    public LoginUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        etqUsuario = new javax.swing.JLabel();
        etqPassword = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        ingresarBt = new javax.swing.JButton();
        iniciodesesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(142, 205, 221));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 102, 141));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 230));

        etqUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        etqUsuario.setText("Usuario");
        jPanel3.add(etqUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        etqPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        etqPassword.setText("Contraseña");
        jPanel3.add(etqPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));
        jPanel3.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 170, -1));
        jPanel3.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 150, -1));

        ingresarBt.setBackground(new java.awt.Color(0, 102, 204));
        ingresarBt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        ingresarBt.setForeground(new java.awt.Color(255, 255, 255));
        ingresarBt.setText("Ingresar");
        ingresarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBtActionPerformed(evt);
            }
        });
        jPanel3.add(ingresarBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        iniciodesesion.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        iniciodesesion.setText("Inicio de sesión");
        jPanel3.add(iniciodesesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBtActionPerformed
        String usuario = txtusuario.getText();
        String password = txtpassword.getText();
                
        if(usuario.isEmpty() && password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar el usuario y la contraseña");
        }
        else if(usuario.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar el usuario");
        }
        else if(password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar la contraseña");
        }
        File f = new File("D:\\DB\\AdminUsuario.txt");
        boolean encontrado1 = false;
        boolean encontrado2 = false;
        
        try {        
            if(f.exists()){
                Scanner s = new Scanner(f);
                BufferedReader br = new BufferedReader(new FileReader("D:\\DB\\AdminUsuario.txt"));
                while(s.hasNextLine()){
                    s.useDelimiter("\\s*;\\s*");
                    if(usuario.equals(s.nextLine())){
                        encontrado1=true;
                    }
                    if(password.equals(s.nextLine())){
                        encontrado2=true;
                    }
                    if((encontrado1=true) && (encontrado2=true)){
                        AdminPanel AdmP = new AdminPanel();
                        AdmP.setVisible(true);
                    }
                }
            }           
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_ingresarBtActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etqPassword;
    private javax.swing.JLabel etqUsuario;
    private javax.swing.JButton ingresarBt;
    private javax.swing.JLabel iniciodesesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
