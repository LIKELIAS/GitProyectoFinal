package Procesos;

import ManejoArchivos.Archivos;
import ManejoArchivos.ProcesoNomina;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GenerarNomina extends javax.swing.JFrame {

    public GenerarNomina() {
        initComponents();
    }
    public boolean validar = true;
    public String Month;
    public String Year;
    
    public ArrayList<ArrayList<String>> Emp = new ArrayList<>();
    public String ID_Empleado;
    public double Salario_Bruto;
    public double Valor_AFP;
    public double Valor_ARS;
    public double Valor_Coop;
    public double Valor_ISR;
    public double Sueldo_Neto;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtdia = new javax.swing.JTextField();
        txtyear = new com.toedter.calendar.JYearChooser();
        mesesCB = new javax.swing.JComboBox<>();
        salirbt = new javax.swing.JButton();
        generarbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generar Nómina");
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
        jLabel1.setText("Fecha de Nómina:");

        txtdia.setEditable(false);
        txtdia.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtdia.setText("30");

        mesesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        mesesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesesCBActionPerformed(evt);
            }
        });

        salirbt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        salirbt.setText("Salir");
        salirbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbtActionPerformed(evt);
            }
        });

        generarbt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        generarbt.setText("Generar");
        generarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(generarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salirbt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mesesCB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtyear, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                .addGap(104, 104, 104)))
                        .addGap(35, 35, 35))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {generarbt, salirbt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mesesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generarbt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirbt))
                .addGap(26, 26, 26))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {generarbt, salirbt});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void generarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarbtActionPerformed
        Archivos ar = new Archivos();
        File f = new File("D:\\DB\\Nomina.txt");
        ProcesoNomina pnm = new ProcesoNomina();
        String dia, mes, year, nom = null;
        int aux;
        
        dia=txtdia.getText();
        aux=mesesCB.getSelectedIndex()+1;
        mes=Integer.toString(aux);
        year=Integer.toString(txtyear.getYear());
        nom=dia+";"+mes+";"+year;        
               
        Month=mes;
        Year=year;
        verificar();
        
        for(ArrayList<String> Emp : Emp){
            ID_Empleado=Emp.get(0);
            Salario_Bruto=Double.parseDouble(Emp.get(12));            
        }
        
        
        if(validar){
            ar.Guardar(nom, f);
            JOptionPane.showMessageDialog(null, "NOMINA GENERADA");
        }        
    }//GEN-LAST:event_generarbtActionPerformed
    
    public void ProcesoNom(){
        Valor_AFP = (Salario_Bruto) * (2.87/100);
        Valor_ARS = (Salario_Bruto) * (3.04/100);
        
        double balance, agregado = 0, porcent = 0;
        
        balance = Salario_Bruto - Valor_AFP - Valor_ARS;
        if(Salario_Bruto<=34865){
            //Nada XD
        }else if(Salario_Bruto > 34685 && Salario_Bruto <= 52027.42){
            balance = balance - 34685;
            porcent = 0.15;
        }else if(Salario_Bruto > 52027.42 && Salario_Bruto <= 72260.25){
            balance = balance - 52027.42;
            agregado = 2601.33;
            porcent = 0.20;
        }else if(Salario_Bruto > 72260.25){
            balance = balance - 72260.25;
            agregado = 6648;
            porcent = 0.25;
        }
        Valor_ISR = (balance * porcent) + agregado;
        
        Sueldo_Neto = Salario_Bruto - Valor_AFP - Valor_ARS - Valor_ISR;
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try{
            File f = new File("D:\\DB\\Empleados.txt");
            
            Scanner a = new Scanner(f);
            while(a.hasNextLine()){
                String ln = a.nextLine();
                Scanner a1 = new Scanner(ln);
                ArrayList<String> Datos_emp = new ArrayList<>();
                
                while(a1.hasNext()){
                    Datos_emp.add(a1.next());
                }
                Emp.add(Datos_emp);
            }
            a.close();
        }
        catch(IOException e){
            
        }      
        
    }//GEN-LAST:event_formWindowOpened

    private void mesesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesesCBActionPerformed
       if(mesesCB.getSelectedItem().equals("Febrero")){
           txtdia.setText("28");
       }
       else{
           txtdia.setText("30");
       }
    }//GEN-LAST:event_mesesCBActionPerformed
    public void verificar(){
        File f = new File("D:\\DB\\Nomina.txt");
        
        String dia, mes, year;
        try{
            if(!f.exists()){
                JOptionPane.showMessageDialog(null, "ESTE ARCHIVO NO EXISTE");
            }
            else{
                Scanner a = new Scanner(f);
                while(a.hasNextLine()){
                    String ln = a.nextLine();
                    Scanner a1 = new Scanner(ln);
                    
                    a1.useDelimiter("\\s*;\\s*");
                    
                    dia=a1.next();
                    mes=a1.next();
                    year=a1.next();
                    
                    if(mes.equals(Month) && year.equals(Year)){
                        JOptionPane.showMessageDialog(null, "ESTA NOMINA YA ESTA GENERADA");
                        validar = false;
                    }
                }
                a.close();
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
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
            java.util.logging.Logger.getLogger(GenerarNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarNomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarNomina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generarbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> mesesCB;
    private javax.swing.JButton salirbt;
    private javax.swing.JTextField txtdia;
    private com.toedter.calendar.JYearChooser txtyear;
    // End of variables declaration//GEN-END:variables
}
