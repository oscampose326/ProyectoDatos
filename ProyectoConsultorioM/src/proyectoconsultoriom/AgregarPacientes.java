/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsultoriom;

/**
 *
 * @author ulacit
 */
public class AgregarPacientes extends javax.swing.JFrame {
    
    /**
     * Creates new form AgregarPacientes
     */
    public AgregarPacientes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        cmbtiposangre = new javax.swing.JComboBox<>();
        btnagregarpaciente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpeso = new javax.swing.JTextField();
        txtestatura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnregresar1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setText("MENU DOCTOR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 63, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 98, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tipo de Sangre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 139, 84, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 60, 213, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 98, 170, -1));

        cmbtiposangre.setForeground(new java.awt.Color(204, 204, 255));
        cmbtiposangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel1.add(cmbtiposangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 136, -1, -1));

        btnagregarpaciente.setBackground(new java.awt.Color(204, 204, 255));
        btnagregarpaciente.setText("AGREGAR PACIENTE ");
        btnagregarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarpacienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnagregarpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Edad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 177, -1, -1));
        jPanel1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 174, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Estatura");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 221, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Peso");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 271, -1, -1));
        jPanel1.add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 268, 70, -1));
        jPanel1.add(txtestatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 218, 70, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("AGREGAR PACIENTE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 195, 40));

        btnregresar1.setBackground(new java.awt.Color(204, 204, 255));
        btnregresar1.setText("REGRESAR");
        btnregresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnregresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clinica Fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 570, 440));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnagregarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarpacienteActionPerformed
        // TODO add your handling code here:int id, String nombre, String sangre, int edad, int peso, int estatura
        ProyectoConsultorioM.admin.registrarPaciente(Integer.parseInt(this.txtid.getText()), this.txtnombre.getText(), this.cmbtiposangre.getSelectedItem().toString(), Integer.parseInt(this.txtedad.getText()), Integer.parseInt(this.txtpeso.getText()), Integer.parseInt(this.txtestatura.getText()));
        MenuDoctor menu = new MenuDoctor();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnagregarpacienteActionPerformed

    private void btnregresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresar1ActionPerformed
        // TODO add your handling code here:
        MenuDoctor menu = new MenuDoctor();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregresar1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregarpaciente;
    private javax.swing.JButton btnregresar1;
    private javax.swing.JComboBox<String> cmbtiposangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtestatura;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
