package Desplegables;

import ManejoArchivos.Archivos;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Empleados extends javax.swing.JFrame {

    /**
     * Creates new form Empleados
     */
    public Empleados() {
        initComponents();
    }
    
    public static String Lantigua;
    public boolean Modificar = false;
    public final String Sexo = "H";
    public final String Coop = "S";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        Grupo2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        etqEstado = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        nombrelbl = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellidopat = new javax.swing.JTextField();
        apellidomatlbl = new javax.swing.JLabel();
        txtapellidomat = new javax.swing.JTextField();
        apellidopatlbl = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        hombrebt = new javax.swing.JRadioButton();
        mujerbt = new javax.swing.JRadioButton();
        direccionlbl = new javax.swing.JLabel();
        telefonolbl = new javax.swing.JLabel();
        sexolbl = new javax.swing.JLabel();
        iddepartlbl = new javax.swing.JLabel();
        fechalbl = new javax.swing.JLabel();
        txtfechaingreso = new com.toedter.calendar.JDateChooser();
        idpuestolbl = new javax.swing.JLabel();
        sibt = new javax.swing.JRadioButton();
        nobt = new javax.swing.JRadioButton();
        cooperativalbl = new javax.swing.JLabel();
        txtsalario = new javax.swing.JTextField();
        salariolbl = new javax.swing.JLabel();
        guardarbt = new javax.swing.JButton();
        limpiarbt = new javax.swing.JButton();
        salirbt = new javax.swing.JButton();
        IDdptCB = new javax.swing.JComboBox<>();
        IDpCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleados");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        etqEstado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        etqEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        idlbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        idlbl.setText("ID");

        txtid.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        nombrelbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        nombrelbl.setText("Nombre");

        txtnombre.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreKeyPressed(evt);
            }
        });

        txtapellidopat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtapellidopat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidopatKeyPressed(evt);
            }
        });

        apellidomatlbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        apellidomatlbl.setText("Apellido Materno");

        txtapellidomat.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtapellidomat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtapellidomatKeyPressed(evt);
            }
        });

        apellidopatlbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        apellidopatlbl.setText("Apellido Paterno");

        txtdireccion.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdireccionKeyPressed(evt);
            }
        });

        txttelefono.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        Grupo1.add(hombrebt);
        hombrebt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        hombrebt.setText("Hombre");

        Grupo1.add(mujerbt);
        mujerbt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mujerbt.setText("Mujer");

        direccionlbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        direccionlbl.setText("Dirección");

        telefonolbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        telefonolbl.setText("Teléfono");

        sexolbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        sexolbl.setText("Sexo");

        iddepartlbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        iddepartlbl.setText("ID Departamento");

        fechalbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        fechalbl.setText("Fecha de Ingreso");

        txtfechaingreso.setDateFormatString("d-MM-y");
        txtfechaingreso.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        idpuestolbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        idpuestolbl.setText("ID Puesto");

        Grupo2.add(sibt);
        sibt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        sibt.setText("Si");
        sibt.setEnabled(false);
        sibt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sibtActionPerformed(evt);
            }
        });

        Grupo2.add(nobt);
        nobt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        nobt.setText("No");
        nobt.setEnabled(false);

        cooperativalbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cooperativalbl.setText("Cooperativa");

        txtsalario.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtsalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalarioActionPerformed(evt);
            }
        });

        salariolbl.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        salariolbl.setText("Salario");

        guardarbt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        guardarbt.setText("Guardar");
        guardarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtActionPerformed(evt);
            }
        });

        limpiarbt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        limpiarbt.setText("Limpiar");
        limpiarbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarbtActionPerformed(evt);
            }
        });

        salirbt.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        salirbt.setText("Salir");
        salirbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbtActionPerformed(evt);
            }
        });

        IDpCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDpCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(idlbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nombrelbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(direccionlbl)
                                            .addComponent(telefonolbl))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                            .addComponent(txttelefono)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(apellidomatlbl)
                                            .addComponent(apellidopatlbl))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtapellidopat, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtapellidomat, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sexolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hombrebt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mujerbt))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(iddepartlbl)
                                            .addComponent(fechalbl))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IDdptCB, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(idpuestolbl)
                                            .addComponent(cooperativalbl))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(sibt)
                                                .addGap(18, 18, 18)
                                                .addComponent(nobt))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(IDpCB, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(guardarbt)
                                        .addGap(49, 49, 49)
                                        .addComponent(limpiarbt)
                                        .addGap(41, 41, 41)
                                        .addComponent(salirbt))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(salariolbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrelbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellidopat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidopatlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellidomat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidomatlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonolbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hombrebt)
                    .addComponent(mujerbt)
                    .addComponent(sexolbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iddepartlbl)
                    .addComponent(IDdptCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechalbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idpuestolbl)
                    .addComponent(IDpCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salariolbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sibt)
                    .addComponent(nobt)
                    .addComponent(cooperativalbl))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarbt)
                    .addComponent(limpiarbt)
                    .addComponent(salirbt))
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void salirbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbtActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirbtActionPerformed

    private void limpiarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarbtActionPerformed
        etqEstado.setText("");
        txtid.setText("");
        txtnombre.setText("");
        txtapellidopat.setText("");
        txtapellidomat.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        Grupo1.clearSelection();
        Grupo2.clearSelection();
        txtfechaingreso.setDate(null);
        if(sibt.isSelected()){
            sibt.setSelected(false);
        }else if(nobt.isSelected()){
            nobt.setSelected(false);
        }
        txtsalario.setText("");
        IDdptCB.setSelectedIndex(0);
        IDpCB.setSelectedIndex(0);
    }//GEN-LAST:event_limpiarbtActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void guardarbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtActionPerformed
        Archivos ar = new Archivos();
        File emp = new File("D:\\DB\\Empleados.txt");
        String id, nombre, apellidopat, apellidomat, direc, telefono, sexo = null, iddp, fechain, idp, coop = null, salario, empleado;
        boolean validar = true;
        
        if(txtid.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo de ID no debe estar vacio");
                validar=false;
                txtid.grabFocus();
            }else if(txtnombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo de Nombre no debe estar vacio");
                validar=false;
                txtnombre.grabFocus();
            }else if(txtapellidopat.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo de Apellido Paterno no debe estar vacio");
                validar=false;
                txtapellidopat.grabFocus();
            }else if(txtapellidomat.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo de Apellido Materno no debe estar vacio");
                validar=false;
                txtapellidomat.grabFocus();
            }else if(txtdireccion.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo de Direccion no debe estar vacio");
                validar=false;
                txtdireccion.grabFocus();
            }else if(txttelefono.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo de Telefono no debe estar vacio");
                validar=false;
                txttelefono.grabFocus();
            }else if(!hombrebt.isSelected()&& !mujerbt.isSelected()){
                JOptionPane.showMessageDialog(null, "Seleccione el sexo");
                validar=false;
            }else if(txtfechaingreso.getDate()== null){
                JOptionPane.showMessageDialog(null, "El campo de Fecha de no debe estar vacio");
                validar=false;
                txtfechaingreso.grabFocus();
            }else if(txtsalario.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo de Salario no debe estar vacio");
                validar=false;
                txtsalario.grabFocus();
            }else if(!sibt.isSelected()&& !nobt.isSelected()){
                JOptionPane.showMessageDialog(null, "Seleccione si esta en cooperativa o no");
                validar=false;
                txtsalario.grabFocus();
            }
            
        
        try{
            if(!emp.exists()){
                emp.createNewFile();
            }
            id=txtid.getText();
            nombre=txtnombre.getText();
            apellidopat=txtapellidopat.getText();
            apellidomat=txtapellidomat.getText();
            direc=txtdireccion.getText();
            telefono=txttelefono.getText();
            if(hombrebt.isSelected()){
                sexo="H";
            }else if(mujerbt.isSelected()){
                sexo="M";
            }
            iddp=(String) IDdptCB.getSelectedItem();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-y");
            fechain=sdf.format(txtfechaingreso.getDate());
            idp=(String) IDpCB.getSelectedItem();
            if(sibt.isSelected()){
                coop="S";
            }else if(nobt.isSelected()){
                coop="N";
            }
            salario=txtsalario.getText();
            empleado=id+";"+nombre+";"+apellidopat+";"+apellidomat+";"+direc+";"+telefono+";"+sexo+";"+iddp+";"+fechain+";"+idp+";"+coop+";"+salario;
            
            if(validar){
                 if(Modificar){
                    ar.ModificarArchivo(Lantigua,empleado, emp);
            }   else{
                    ar.Guardar(empleado, emp);    
                } 
            limpiarbtActionPerformed(evt);
            }
            
           
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_guardarbtActionPerformed

    private void sibtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sibtActionPerformed
        Cooperativa cop = new Cooperativa();
        String id = txtid.getText();
        String salario = txtsalario.getText();
        
        cop.Dato(id);
        cop.Dato1(salario);
        cop.setVisible(true);
        
    }//GEN-LAST:event_sibtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String id, descrip;
        File f = new File("D:\\DB\\Departamentos.txt");
        
        try{
            if(!f.exists()){
                JOptionPane.showMessageDialog(null, "ESTE ARCHIVO NO EXISTE");
            }
            else{
                Scanner a = new Scanner(f);
                while(a.hasNextLine()){
                    String linea = a.nextLine();
                    Scanner a1 =new Scanner(linea);
                    
                    a1.useDelimiter("\\s*;\\s*");
                    
                    id=a1.next();
                    descrip=a1.next();
                    
                    IDdptCB.addItem(id);
                }
                a.close();
            }
            
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        String id1, descrip1;
        File f1 = new File("D:\\DB\\Puestos.txt");
        
        try{
            if(!f1.exists()){
                JOptionPane.showMessageDialog(null, "ESTE ARCHIVO NO EXISTE");
            }
            else{
                Scanner s = new Scanner(f1);
                while(s.hasNextLine()){
                    String linea = s.nextLine();
                    Scanner s1 =new Scanner(linea);
                    
                    s1.useDelimiter("\\s*;\\s*");
                    
                    id1=s1.next();
                    descrip1=s1.next();
                    
                    IDpCB.addItem(id1);
                }
                s.close();
            }
            
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtsalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalarioActionPerformed
        sibt.setEnabled(true);
        nobt.setEnabled(true);
    }//GEN-LAST:event_txtsalarioActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
     try {
            String auxid = txtid.getText();
            int id_Emp = Integer.parseInt(auxid);
            if (id_Emp <= 0) {
                JOptionPane.showMessageDialog(rootPane, "El Id debe ser un número positivo intente nuevamente");
                limpiarbtActionPerformed(evt);
            } else {
                nobt.setEnabled(true);
                boolean encontrado = false;
                Scanner s;
                try {
                    File f = new File("D:\\DB\\Empleados.txt");

                    if (!f.exists()) {
                        f.createNewFile();
                        etqEstado.setText("Creando");
                    } else {
                        s = new Scanner(f);
                        while (s.hasNextLine() && !encontrado) {

                            String linea = s.nextLine();
                            Scanner s1 = new Scanner(linea);

                            s1.useDelimiter("\\s*;\\s*");

                            try {
                                if (id_Emp == Integer.parseInt(s1.next())) {
                                    txtnombre.setText(s1.next());
                                    txtapellidopat.setText(s1.next());
                                    txtapellidomat.setText(s1.next());
                                    txtdireccion.setText(s1.next());
                                    txttelefono.setText(s1.next());
                                    String auxSex = "";
                                    if (Sexo.equals(s1.next())) {
                                        hombrebt.setSelected(true);
                                        auxSex = "H";
                                    } else {
                                        mujerbt.setSelected(true);
                                        auxSex = "M";
                                    }
                                    IDdptCB.setSelectedItem(s1.next());
                                    SimpleDateFormat format = new SimpleDateFormat("dd-MM-y"); 
                                    Date date = format.parse(s1.next());
                                    txtfechaingreso.setDate(date);
                                    IDpCB.setSelectedItem(s1.next());
                                    String auxCoop = "";
                                   if (Coop.equals(s1.next())) {
                                        sibt.setSelected(true);
                                        Cooperativa c = new Cooperativa();
                                        
                                        c.Dato(txtid.getText());
                                        boolean enc = c.Buscar();
                                        
                                        if(enc){
                                           // if(Double.parseDouble(c.txtbalance.getText())>0){
                                                nobt.setEnabled(false);
                                           // }
                                        }
                                        
                                        c.dispose();
                                        auxCoop = "S";
                                    } else {
                                        nobt.setSelected(true);
                                        auxCoop = "N";
                                    }
                                    txtsalario.setText(s1.next());
                                    Lantigua = txtid.getText() + ";" + txtnombre.getText() + ";" + txtapellidopat.getText() + ";" + txtapellidomat.getText()
                                            + ";" + txtdireccion.getText() + ";" + txttelefono.getText() + ";" + auxSex + ";" + IDdptCB.getSelectedItem() + ";" + txtfechaingreso.getDate()
                                            + ";" + IDpCB.getSelectedItem() + ";" + auxCoop + ";" + txtsalario.getText();
                                    etqEstado.setText("Modificando");
                                    Modificar = true;
                                    encontrado = true;
                                } else {
                                    limpiarbtActionPerformed(evt);
                                    txtid.setText(auxid);
                                    etqEstado.setText("Creando");
                                    Modificar = false;
                                    encontrado = false;
                                }
                            } catch (Exception e) {
                                //JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                                System.out.println(e);
                            }
                        }
                        s.close();
                        txtnombre.grabFocus();
                    }
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(this, "No se encontró el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (IOException e) {
                    System.out.println("Error al crear el archivo\n" + e);
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "El Id no permite carácteres, intente nuevamente...");
            limpiarbtActionPerformed(evt);
        } 
        
    }//GEN-LAST:event_txtidActionPerformed

    private void IDpCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDpCBActionPerformed
       txtsalario.grabFocus();
    }//GEN-LAST:event_IDpCBActionPerformed

    private void txtnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyPressed
     if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        txtapellidopat.grabFocus();
     }
    }//GEN-LAST:event_txtnombreKeyPressed

    private void txtapellidopatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidopatKeyPressed
     if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        txtapellidomat.grabFocus();
     }
    }//GEN-LAST:event_txtapellidopatKeyPressed

    private void txtapellidomatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidomatKeyPressed
     if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        txtdireccion.grabFocus();
     }        
    }//GEN-LAST:event_txtapellidomatKeyPressed

    private void txtdireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyPressed
     if(evt.getKeyCode()== KeyEvent.VK_ENTER){
       txttelefono.grabFocus();
     }
    }//GEN-LAST:event_txtdireccionKeyPressed
    
    public static void main(String args[]) {
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.ButtonGroup Grupo2;
    private javax.swing.JComboBox<String> IDdptCB;
    private javax.swing.JComboBox<String> IDpCB;
    private javax.swing.JLabel apellidomatlbl;
    private javax.swing.JLabel apellidopatlbl;
    private javax.swing.JLabel cooperativalbl;
    private javax.swing.JLabel direccionlbl;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel fechalbl;
    private javax.swing.JButton guardarbt;
    private javax.swing.JRadioButton hombrebt;
    private javax.swing.JLabel iddepartlbl;
    private javax.swing.JLabel idlbl;
    private javax.swing.JLabel idpuestolbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiarbt;
    private javax.swing.JRadioButton mujerbt;
    private javax.swing.JRadioButton nobt;
    private javax.swing.JLabel nombrelbl;
    private javax.swing.JLabel salariolbl;
    private javax.swing.JButton salirbt;
    private javax.swing.JLabel sexolbl;
    private javax.swing.JRadioButton sibt;
    private javax.swing.JLabel telefonolbl;
    private javax.swing.JTextField txtapellidomat;
    private javax.swing.JTextField txtapellidopat;
    private javax.swing.JTextField txtdireccion;
    private com.toedter.calendar.JDateChooser txtfechaingreso;
    public javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsalario;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
