package Consultas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaEmp extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaEmp
     */
    public ConsultaEmp() {
        initComponents();
        Tabla = (DefaultTableModel) tablaemp.getModel();
    }
    public DefaultTableModel Tabla;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaemp = new javax.swing.JTable();
        consultarbt = new javax.swing.JButton();
        salirbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultas de Empleados");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                WindowClose(evt);
            }
        });

        tablaemp.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tablaemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Dirección", "Teléfono", "Sexo", "ID Departamento", "Fecha de Ingreso", "ID Puesto", "Cooperativa", "Salario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaemp.getTableHeader().setResizingAllowed(false);
        tablaemp.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaemp);
        if (tablaemp.getColumnModel().getColumnCount() > 0) {
            tablaemp.getColumnModel().getColumn(0).setMinWidth(80);
            tablaemp.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablaemp.getColumnModel().getColumn(0).setMaxWidth(80);
            tablaemp.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaemp.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablaemp.getColumnModel().getColumn(6).setMinWidth(45);
            tablaemp.getColumnModel().getColumn(6).setPreferredWidth(45);
            tablaemp.getColumnModel().getColumn(6).setMaxWidth(45);
            tablaemp.getColumnModel().getColumn(7).setPreferredWidth(100);
            tablaemp.getColumnModel().getColumn(8).setPreferredWidth(100);
            tablaemp.getColumnModel().getColumn(11).setMinWidth(110);
            tablaemp.getColumnModel().getColumn(11).setPreferredWidth(110);
            tablaemp.getColumnModel().getColumn(11).setMaxWidth(110);
        }

        consultarbt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        consultarbt.setText("Consultar");
        consultarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarbtActionPerformed(evt);
            }
        });

        salirbt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(consultarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(salirbt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {consultarbt, salirbt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {consultarbt, salirbt});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbtActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirbtActionPerformed

    private void WindowClose(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowClose
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_WindowClose

    private void consultarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarbtActionPerformed
        String idemp, nomemp, apatemp, amatemp, direcemp, telemp, sxemp, iddepart, fechain, idpuest, coop, salario;
        Tabla.getDataVector().removeAllElements();
        Tabla.fireTableDataChanged();
        
        File f = new File("D:\\DB\\Empleados.txt");
        
        try{
            if(!f.exists()){
                JOptionPane.showMessageDialog(null, "ESTE ARCHIVO NO EXISTE");
            }
            else{
                Scanner a = new Scanner(f);
                while(a.hasNextLine()){
                    String linea = a.nextLine();
                    Scanner a1 = new Scanner(linea);

                    a1.useDelimiter("\\s*;\\s*");
                    
                    idemp=a1.next();
                    nomemp=a1.next();
                    apatemp=a1.next();
                    amatemp=a1.next();
                    direcemp=a1.next();
                    telemp=a1.next();
                    sxemp=a1.next();
                    iddepart=a1.next();
                    fechain=a1.next();
                    idpuest=a1.next();
                    coop=a1.next();
                    salario=a1.next();
                    
                    Tabla.addRow(new Object[]{idemp, nomemp, apatemp, amatemp, direcemp, telemp, sxemp, iddepart, fechain, idpuest, coop, "$"+salario});
                }
                a.close();
            }
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_consultarbtActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultarbt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salirbt;
    private javax.swing.JTable tablaemp;
    // End of variables declaration//GEN-END:variables
}
