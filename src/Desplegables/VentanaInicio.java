package Desplegables;

import Consultas.ConsultaDepart;
import Consultas.ConsultaEmp;
import Consultas.ConsultaEmpDepart;
import Consultas.ConsultaEmpFecha;
import Consultas.ConsultaEmpPuesto;
import Consultas.ConsultaNominaFecha;
import Consultas.ConsultaNominaIdEmp;
import Consultas.ConsultaPuestos;
import Consultas.ConsultaUsuario;
import Consultas.ConsultaUsuarioAdm;
import Login.LoginUsuario;
import Procesos.GenerarNomina;
import Procesos.ReversarNomina;
import javax.swing.JOptionPane;

public class VentanaInicio extends javax.swing.JFrame {

    public VentanaInicio() {
        initComponents();
    }
    private int ventana;
    
    public void Dato(int ventana){
        this.ventana=ventana;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLetrero = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menMantenimientos = new javax.swing.JMenu();
        itmUsuario = new javax.swing.JMenuItem();
        itmDepart = new javax.swing.JMenuItem();
        itmPuesto = new javax.swing.JMenuItem();
        itmEmpleado = new javax.swing.JMenuItem();
        menProcesos = new javax.swing.JMenu();
        generarnomina = new javax.swing.JMenuItem();
        reversarnomina = new javax.swing.JMenuItem();
        consulta = new javax.swing.JMenu();
        itmUsuarioCon = new javax.swing.JMenuItem();
        Departamentos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Empleados = new javax.swing.JMenuItem();
        EmpDepart = new javax.swing.JMenuItem();
        EmpPuestos = new javax.swing.JMenuItem();
        EmpFecha = new javax.swing.JMenuItem();
        NominaFecha = new javax.swing.JMenuItem();
        NominaIDEmp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana de Inicio");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(168, 205, 159));

        lblLetrero.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/face-smiling-hands (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(lblLetrero, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLetrero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        menMantenimientos.setText("Mantenimientos");
        menMantenimientos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        itmUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        itmUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/users (1).png"))); // NOI18N
        itmUsuario.setText("Usuarios");
        itmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUsuarioActionPerformed(evt);
            }
        });
        menMantenimientos.add(itmUsuario);

        itmDepart.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        itmDepart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/department.png"))); // NOI18N
        itmDepart.setText("Departamentos");
        itmDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDepartActionPerformed(evt);
            }
        });
        menMantenimientos.add(itmDepart);

        itmPuesto.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        itmPuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/rank.png"))); // NOI18N
        itmPuesto.setText("Puestos");
        itmPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPuestoActionPerformed(evt);
            }
        });
        menMantenimientos.add(itmPuesto);

        itmEmpleado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        itmEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/employee-man-alt.png"))); // NOI18N
        itmEmpleado.setText("Empleados");
        itmEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEmpleadoActionPerformed(evt);
            }
        });
        menMantenimientos.add(itmEmpleado);

        jMenuBar1.add(menMantenimientos);

        menProcesos.setText("Procesos");
        menProcesos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        generarnomina.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        generarnomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/deposit-alt.png"))); // NOI18N
        generarnomina.setText("Generar Nómina");
        generarnomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarnominaActionPerformed(evt);
            }
        });
        menProcesos.add(generarnomina);

        reversarnomina.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        reversarnomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/rotate-left (1).png"))); // NOI18N
        reversarnomina.setText("Reversar Nómina");
        reversarnomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reversarnominaActionPerformed(evt);
            }
        });
        menProcesos.add(reversarnomina);

        jMenuBar1.add(menProcesos);

        consulta.setText("Consultas");
        consulta.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });

        itmUsuarioCon.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        itmUsuarioCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/users (1).png"))); // NOI18N
        itmUsuarioCon.setText("Usuarios");
        itmUsuarioCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmUsuarioConActionPerformed(evt);
            }
        });
        consulta.add(itmUsuarioCon);

        Departamentos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Departamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/department.png"))); // NOI18N
        Departamentos.setText("Departamentos");
        Departamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartamentosActionPerformed(evt);
            }
        });
        consulta.add(Departamentos);

        jMenuItem1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/rank.png"))); // NOI18N
        jMenuItem1.setText("Puestos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        consulta.add(jMenuItem1);

        Empleados.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/employee-man-alt.png"))); // NOI18N
        Empleados.setText("Empleados");
        Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosActionPerformed(evt);
            }
        });
        consulta.add(Empleados);

        EmpDepart.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        EmpDepart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/corporate.png"))); // NOI18N
        EmpDepart.setText("Empleados por Departamento");
        EmpDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpDepartActionPerformed(evt);
            }
        });
        consulta.add(EmpDepart);

        EmpPuestos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        EmpPuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/employees.png"))); // NOI18N
        EmpPuestos.setText("Empleados por Puestos");
        EmpPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpPuestosActionPerformed(evt);
            }
        });
        consulta.add(EmpPuestos);

        EmpFecha.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        EmpFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/calendar-clock.png"))); // NOI18N
        EmpFecha.setText("Empleados por Fecha de Ingreso");
        EmpFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpFechaActionPerformed(evt);
            }
        });
        consulta.add(EmpFecha);

        NominaFecha.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        NominaFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/payroll-calendar.png"))); // NOI18N
        NominaFecha.setText("Nómina por Fecha");
        NominaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NominaFechaActionPerformed(evt);
            }
        });
        consulta.add(NominaFecha);

        NominaIDEmp.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        NominaIDEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/user-salary.png"))); // NOI18N
        NominaIDEmp.setText("Nómona por ID_Empleado");
        NominaIDEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NominaIDEmpActionPerformed(evt);
            }
        });
        consulta.add(NominaIDEmp);

        jMenuBar1.add(consulta);

        setJMenuBar(jMenuBar1);

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

    private void itmUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUsuarioActionPerformed
        Usuarios us = new Usuarios();
        us.setVisible(true);
    }//GEN-LAST:event_itmUsuarioActionPerformed

    private void itmEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEmpleadoActionPerformed
        Empleados emp = new Empleados();
        emp.setVisible(true);
    }//GEN-LAST:event_itmEmpleadoActionPerformed

    private void itmDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDepartActionPerformed
        Departamento dep = new Departamento();
        dep.setVisible(true);
    }//GEN-LAST:event_itmDepartActionPerformed

    private void itmPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPuestoActionPerformed
        Puestos pu = new Puestos();
        pu.setVisible(true);
    }//GEN-LAST:event_itmPuestoActionPerformed

    private void DepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartamentosActionPerformed
        ConsultaDepart cdp = new ConsultaDepart();
        cdp.setVisible(true);
    }//GEN-LAST:event_DepartamentosActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
        ConsultaPuestos cp = new ConsultaPuestos();
        cp.setVisible(true);
    }//GEN-LAST:event_consultaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ConsultaPuestos cp = new ConsultaPuestos();
        cp.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosActionPerformed
        ConsultaEmp cemp = new ConsultaEmp();
        cemp.setVisible(true);
    }//GEN-LAST:event_EmpleadosActionPerformed

    private void EmpDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpDepartActionPerformed

        ConsultaEmpDepart cempdepart = new ConsultaEmpDepart();
        cempdepart.setVisible(true);
    }//GEN-LAST:event_EmpDepartActionPerformed

    private void EmpPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpPuestosActionPerformed
        ConsultaEmpPuesto cemppuesto = new ConsultaEmpPuesto();
        cemppuesto.setVisible(true);
    }//GEN-LAST:event_EmpPuestosActionPerformed

    private void EmpFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpFechaActionPerformed
        ConsultaEmpFecha cempfecha = new ConsultaEmpFecha();
        cempfecha.setVisible(true);
    }//GEN-LAST:event_EmpFechaActionPerformed

    private void NominaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NominaFechaActionPerformed
        ConsultaNominaFecha cnominafecha = new ConsultaNominaFecha();
        cnominafecha.setVisible(true);
    }//GEN-LAST:event_NominaFechaActionPerformed

    private void NominaIDEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NominaIDEmpActionPerformed
       ConsultaNominaIdEmp cnominaid = new ConsultaNominaIdEmp();
       cnominaid.setVisible(true);
    }//GEN-LAST:event_NominaIDEmpActionPerformed

    private void generarnominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarnominaActionPerformed
        GenerarNomina gn = new GenerarNomina();
        gn.setVisible(true);
    }//GEN-LAST:event_generarnominaActionPerformed

    private void reversarnominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reversarnominaActionPerformed
        ReversarNomina rvg = new ReversarNomina();
        rvg.setVisible(true);
    }//GEN-LAST:event_reversarnominaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        LoginUsuario lg = new LoginUsuario();      
        int n = JOptionPane.showConfirmDialog(null, "Desea regresar al login?", "Seleccione",JOptionPane.YES_NO_OPTION);
        
        switch (n) {
            case JOptionPane.YES_OPTION -> {
                lg.setVisible(true);
                this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
            case JOptionPane.NO_OPTION -> this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            case JOptionPane.CLOSED_OPTION -> this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            default -> {
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void itmUsuarioConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmUsuarioConActionPerformed
        ConsultaUsuario cn = new ConsultaUsuario();
        ConsultaUsuarioAdm cna = new ConsultaUsuarioAdm();
        if(ventana==0){
            cna.setVisible(true);
        }else{
           cn.setVisible(true); 
        }  
    }//GEN-LAST:event_itmUsuarioConActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Departamentos;
    private javax.swing.JMenuItem EmpDepart;
    private javax.swing.JMenuItem EmpFecha;
    private javax.swing.JMenuItem EmpPuestos;
    private javax.swing.JMenuItem Empleados;
    private javax.swing.JMenuItem NominaFecha;
    private javax.swing.JMenuItem NominaIDEmp;
    private javax.swing.JMenu consulta;
    private javax.swing.JMenuItem generarnomina;
    private javax.swing.JMenuItem itmDepart;
    private javax.swing.JMenuItem itmEmpleado;
    private javax.swing.JMenuItem itmPuesto;
    public javax.swing.JMenuItem itmUsuario;
    private javax.swing.JMenuItem itmUsuarioCon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblLetrero;
    public javax.swing.JMenu menMantenimientos;
    public javax.swing.JMenu menProcesos;
    private javax.swing.JMenuItem reversarnomina;
    // End of variables declaration//GEN-END:variables
}
