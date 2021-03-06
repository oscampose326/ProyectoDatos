/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsultoriom;

import static proyectoconsultoriom.Cita.paciente;
import static proyectoconsultoriom.ProyectoConsultorioM.admin;

/**
 *
 * @author ulacit
 */
public class BuscarPaciente extends javax.swing.JFrame {

    /**
     * Creates new form BuscarPaciente
     */
    Paciente actual;
    public BuscarPaciente() {
        initComponents();
        this.setLocationRelativeTo(null);
        actual=null;
        this.btncita.setEnabled(false);
        this.btnrecetario.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnregresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btncita = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnrecetario = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblnoexiste = new javax.swing.JLabel();
        btnregresar1 = new javax.swing.JButton();
        txtTS = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        btnregresar.setBackground(new java.awt.Color(204, 204, 255));
        btnregresar.setText("REGRESAR");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Busqueda de Pacientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("ID PACIENTE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 85, -1, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 82, 270, -1));

        btncita.setText("VER O PROGRAMAR CITA");
        btncita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncitaActionPerformed(evt);
            }
        });
        jPanel1.add(btncita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 81, 90, -1));

        btnrecetario.setText("CREAR O MODIFICAR RECETARIO");
        btnrecetario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecetarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnrecetario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Edad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nombre");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Estatura");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Peso");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tipo de Sangre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        lblnoexiste.setForeground(new java.awt.Color(255, 51, 0));
        jPanel1.add(lblnoexiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 210, 20));

        btnregresar1.setBackground(new java.awt.Color(204, 204, 255));
        btnregresar1.setText("REGRESAR");
        btnregresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnregresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        txtTS.setEnabled(false);
        txtTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTSActionPerformed(evt);
            }
        });
        jPanel1.add(txtTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 260, -1));

        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 260, -1));

        txtPeso.setEnabled(false);
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 260, -1));

        txtEdad.setEnabled(false);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 260, -1));

        txtEstatura.setEnabled(false);
        txtEstatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstaturaActionPerformed(evt);
            }
        });
        jPanel1.add(txtEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 260, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinica Fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 570, 390));

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

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
        AgregarPacientes agregar = new AgregarPacientes();
        agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtidActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        Paciente encontrado = admin.buscarPaciente(Integer.parseInt(this.txtid.getText()));
        if(encontrado!=null){
            this.txtTS.setText(encontrado.getSangre());
            this.txtNombre.setText(encontrado.getNombre());
            this.txtEdad.setText(""+encontrado.getEdad());
            this.txtPeso.setText(""+encontrado.getPeso());
            this.txtEstatura.setText(""+encontrado.getEstatura());
            
            this.actual=encontrado;
            this.btncita.setEnabled(true);
            this.btnrecetario.setEnabled(true);
                    
        }else{
            this.lblnoexiste.setText("Este paciente no está registrado");
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnrecetarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecetarioActionPerformed
        // TODO add your handling code here:
        RecetarioMedico recetario = new RecetarioMedico();
        paciente=this.actual;
        recetario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnrecetarioActionPerformed

    private void btncitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncitaActionPerformed
        // TODO add your handling code here:
        Cita cita = new Cita();
        paciente=this.actual;
        cita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncitaActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed

    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnregresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresar1ActionPerformed
        // TODO add your handling code here:
        MenuDoctor menu = new MenuDoctor();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregresar1ActionPerformed

    private void txtTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTSActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtEstaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstaturaActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncita;
    private javax.swing.JButton btnrecetario;
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnregresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblnoexiste;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTS;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
