package Procesos;

import ManejoArchivos.Archivos;
import ManejoArchivos.ProcesoNomina;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.TextAlignment;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GenerarNomina extends javax.swing.JFrame {

    public GenerarNomina() {
        initComponents();
    }
    
    public ArrayList<ArrayList<String>> Empleados = new ArrayList<>();
    public int Nómina;
    public int contador;
    public String ID_Empleado;
    public double Salario_Bruto;
    public double Valor_AFP;
    public double Valor_ARS;
    public double Valor_Coop;
    public double Valor_ISR;
    public double Sueldo_Neto;
    public boolean Status_Nómina;
    public double Coop_Porc;
    public double Coop_Balance_Acum;
    public DecimalFormat formato = new DecimalFormat("#,###,###,###,##0.00");
    public String Coop_LineaAntigua;
    public boolean Coop_Modificar;

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
        jlabelId_nomina = new javax.swing.JLabel();
        jTextID_nomina = new javax.swing.JTextField();

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

        jlabelId_nomina.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jlabelId_nomina.setText("ID de Nomina");

        jTextID_nomina.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlabelId_nomina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextID_nomina, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {generarbt, salirbt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlabelId_nomina)
                            .addComponent(jTextID_nomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
        ProcesoNomina ProcN = new ProcesoNomina();
        int Año;
        
            Año = txtyear.getYear();

            if (ProcN.BuscarFechaNómina((mesesCB.getSelectedIndex()+1), Año)) {
                JOptionPane.showMessageDialog(rootPane, "Error la Fecha Ingresada ya está guardada en otra nómina, cambie el mes o el año");
                mesesCB.grabFocus();
                return;
            }

            try {
                PdfWriter wr = new PdfWriter("D:\\PDF\\Nomina - " + mesesCB.getSelectedItem() + " " + Año + ".pdf");
                PdfDocument pdf = new PdfDocument(wr);
                Document documento = new Document(pdf);
                documento.setMargins(40, 50, 75, 50);
                for (ArrayList<String> Empleado : Empleados) {

                    ID_Empleado = Empleado.get(0);
                    Salario_Bruto = Double.parseDouble(Empleado.get(11));

                    ArrayList<String> DatosCoop = ProcN.BuscarDatosCoop(Empleado.get(0));
                    if (DatosCoop == null) {
                        Coop_Modificar = false;
                        Coop_Porc = 0;
                        Coop_Balance_Acum = 0;
                    } else {
                        Coop_Modificar = true;
                        Coop_LineaAntigua = ID_Empleado + ";" + DatosCoop.get(1) + ";" + DatosCoop.get(2);
                        Coop_Porc = Double.parseDouble(DatosCoop.get(1));
                        Coop_Balance_Acum = Double.parseDouble((DatosCoop.get(2)));
                    }

                    ProcesarNómina();
                    GuardarDatosNómina();
                    Paragraph parrafo = CrearParrafoPDF(Empleado);
                    documento.add(new Paragraph("Empleado " + ID_Empleado).setBold().setFontSize(20).setTextAlignment(TextAlignment.CENTER));
                    documento.add(parrafo);
                    documento.add(new LineSeparator(new SolidLine()));
                    documento.add(new Paragraph());
                }
                documento.close();
                JOptionPane.showMessageDialog(rootPane, "Se ha Generado la Nómina Correctamente\nSi deseea ver el volante en PDF dirigáse a la carpeta Volantes de Cobros en el Disco Local (C:)");
                Nómina++;
                jTextID_nomina.setText(Nómina + "");
                //txtyear.set
                mesesCB.setSelectedIndex(0);
            } catch (IOException e) {
                System.out.println(e);
            }
              
    }//GEN-LAST:event_generarbtActionPerformed
    
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            File archEmp = new File("D:\\DB\\Empleados.txt");
            Scanner s = new Scanner(archEmp);

            while (s.hasNextLine()) {
                String línea = s.nextLine();
                Scanner s1 = new Scanner(línea);
                s1.useDelimiter("\\s*;\\s*");
                ArrayList<String> Datos_Emp = new ArrayList<>();
                
                while (s1.hasNext()) {
                    Datos_Emp.add(s1.next());
                }

                Empleados.add(Datos_Emp);

            }

            s.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "No se encontró ningun empleado en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
            return;
        }

        Nómina = 0;
        try {
            File archNóm = new File("D:\\DB\\Nominas.txt");
            if (!archNóm.exists()) {
                archNóm.createNewFile();
                Nómina++;
            } else {
                Scanner s = new Scanner(archNóm);
                while (s.hasNextLine()) {
                    String linea = s.nextLine();
                    Scanner s1 = new Scanner(linea);
                    s1.useDelimiter("\\s*;\\s*");

                    Nómina = Integer.parseInt(s1.next());
                }

                s.close();
                Nómina++;
            }

        } catch (Exception e) {
            System.out.println("Error al leer el archivo de Nómina");
        }

        jTextID_nomina.setText(Nómina + "");
        Status_Nómina = true;     
        
    }//GEN-LAST:event_formWindowOpened

    private void mesesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesesCBActionPerformed
       if(mesesCB.getSelectedItem().equals("Febrero")){
           txtdia.setText("28");
       }
       else{
           txtdia.setText("30");
       }
    }//GEN-LAST:event_mesesCBActionPerformed
     public void ProcesarNómina() {

        Valor_AFP = (Salario_Bruto * 2.87) / 100;
        Valor_ARS = (Salario_Bruto * 3.10) / 100;
        Valor_Coop = (Salario_Bruto * Coop_Porc) / 100;

        Coop_Balance_Acum += Valor_Coop;

        if (Coop_Modificar) {
            String LineaActual = ID_Empleado + ";" + Coop_Porc + ";" + Coop_Balance_Acum;
            try {
                File f = new File("D:\\DB\\Cooperativa.txt");
                if (!f.exists()) {
                    f.createNewFile();
                    System.out.println("Error, El archivo de Cooperativas no existe");
                } else {
                    Archivos AR = new Archivos();
                    AR.ModificarArchivo(Coop_LineaAntigua, LineaActual, f);
                }
            } catch (IOException e) {
                System.out.println(e);
            }

        }

        double porciento = 0, balance = 0, agregado = 0;

        balance = Salario_Bruto - Valor_AFP - Valor_ARS;

        if (balance <= 34685) {
            porciento = 0;
            agregado = 0;
        } else if (balance <= 52027.42) {
            porciento = 0.15;
            balance -= 34685;
            agregado = 0;
        } else if (balance <= 72260.25) {
            porciento = 0.20;
            balance -= 52027.42;
            agregado = 2601.33;
        } else {
            porciento = 0.25;
            balance -= 72260.25;
            agregado = 6648;
        }

        Valor_ISR = (balance * porciento) + agregado;

        Sueldo_Neto = Salario_Bruto - Valor_AFP - Valor_ARS - Valor_Coop - Valor_ISR;

    }

    public void GuardarDatosNómina() {
        File f = new File("D:\\DB\\Nominas.txt");
        try {
            if (!f.exists()) {
                f.createNewFile();
            }

            String linea = jTextID_nomina.getText() + ";"
                    + ID_Empleado + ";"
                    +  txtdia.getText()+ ";"
                    + (mesesCB.getSelectedIndex()+1) + ";"
                    + txtyear.getYear()+ ";"
                    + Salario_Bruto + ";"
                    + Valor_AFP + ";"
                    + Valor_ARS + ";"
                    + Valor_Coop + ";"
                    + Valor_ISR + ";"
                    + Sueldo_Neto + ";"
                    + Status_Nómina;

            Archivos AR = new Archivos();
            AR.Guardar(linea, f);

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    public Paragraph CrearParrafoPDF(ArrayList<String> Empleado) {
        Paragraph parrafo = new Paragraph();
        ProcesoNomina ProcN = new ProcesoNomina();

        parrafo.add(new Paragraph().setFontSize(14)
                .add(new Text("\nNombre Completo: ").setBold())
                .add(new Text(Empleado.get(1) + " " + Empleado.get(2) + " " + Empleado.get(3)))
                .add(new Text("\nDirección: ").setBold())
                .add(new Text(Empleado.get(4)))
                .add(new Text("\nTeléfono: ").setBold())
                .add(new Text(Empleado.get(5)))
                .add(new Text("\nSexo: ").setBold())
                .add(new Text(Empleado.get(6)))
                .add(new Text("\nFecha de Ingreso: ").setBold())
                .add(new Text(Empleado.get(8)))
                .add(new Text("\nDepartamento: ").setBold())
                .add(new Text(ProcN.BuscarDepartamento(Empleado.get(7))))
                .add(new Text("\nPuesto: ").setBold())
                .add(new Text(ProcN.BuscarPuesto(Empleado.get(9))))
                .add(new Text("\nSalario Bruto: ").setBold())
                .add(new Text("RD$" + formato.format(Salario_Bruto)))
                .add(new Text("\nValor de la AFP: ").setBold())
                .add(new Text("RD$" + formato.format(Valor_AFP)))
                .add(new Text("\nValor de la ARS: ").setBold())
                .add(new Text("RD$" + formato.format(Valor_ARS)))
                .add(new Text("\nValor de la Cooperativa: ").setBold())
                .add(new Text("RD$" + formato.format(Valor_Coop)))
                .add(new Text("\nValor de la ISR: ").setBold())
                .add(new Text("RD$" + formato.format(Valor_ISR)))
                .add(new Text("\nSueldo Neto: ").setBold())
                .add(new Text("RD$" + formato.format(Sueldo_Neto))));

        return parrafo;
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
    private javax.swing.JTextField jTextID_nomina;
    private javax.swing.JLabel jlabelId_nomina;
    private javax.swing.JComboBox<String> mesesCB;
    private javax.swing.JButton salirbt;
    private javax.swing.JTextField txtdia;
    private com.toedter.calendar.JYearChooser txtyear;
    // End of variables declaration//GEN-END:variables
}
