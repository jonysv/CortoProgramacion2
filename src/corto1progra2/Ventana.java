/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corto1progra2;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author elmer
 */
public class Ventana extends javax.swing.JFrame {
    DefaultListModel model = new DefaultListModel();//modelo de la lista a mostrar
     Control acciones = new Control();// objeto de la clase control para accesar a los metodos

    /**
     * Creates new form Control
     */
    public Ventana() {
        this.getContentPane().setBackground(Color.DARK_GRAY);
        initComponents();
        this.setLocationRelativeTo(null);
        txtNombre.requestFocus();
      
        rbtnGuardar.setSelected(true);
        txtCarnet.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrp = new javax.swing.ButtonGroup();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        rbtnGuardar = new javax.swing.JRadioButton();
        rbtnBuscar = new javax.swing.JRadioButton();
        rbtnEliminar = new javax.swing.JRadioButton();
        rbtnEditar = new javax.swing.JRadioButton();
        btnAccion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEstudiantes = new javax.swing.JList<>();
        lblCarnetGenerado = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        txtCarnet = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(19, 7, 7));
        setLocationByPlatform(true);
        setUndecorated(true);

        txtNombre.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });

        rbtnGuardar.setBackground(java.awt.Color.darkGray);
        btnGrp.add(rbtnGuardar);
        rbtnGuardar.setFont(new java.awt.Font("Bitstream Charter", 3, 18)); // NOI18N
        rbtnGuardar.setForeground(new java.awt.Color(237, 242, 243));
        rbtnGuardar.setText("Guardar");
        rbtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnGuardarMouseClicked(evt);
            }
        });
        rbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnGuardarActionPerformed(evt);
            }
        });

        rbtnBuscar.setBackground(java.awt.Color.darkGray);
        btnGrp.add(rbtnBuscar);
        rbtnBuscar.setFont(new java.awt.Font("Bitstream Charter", 3, 18)); // NOI18N
        rbtnBuscar.setForeground(new java.awt.Color(237, 242, 243));
        rbtnBuscar.setText("Buscar");
        rbtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnBuscarMouseClicked(evt);
            }
        });

        rbtnEliminar.setBackground(java.awt.Color.darkGray);
        btnGrp.add(rbtnEliminar);
        rbtnEliminar.setFont(new java.awt.Font("Bitstream Charter", 3, 18)); // NOI18N
        rbtnEliminar.setForeground(new java.awt.Color(237, 242, 243));
        rbtnEliminar.setText("Eliminar");
        rbtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnEliminarMouseClicked(evt);
            }
        });

        rbtnEditar.setBackground(java.awt.Color.darkGray);
        btnGrp.add(rbtnEditar);
        rbtnEditar.setFont(new java.awt.Font("Bitstream Charter", 3, 18)); // NOI18N
        rbtnEditar.setForeground(new java.awt.Color(237, 242, 243));
        rbtnEditar.setText("Editar");
        rbtnEditar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnEditarItemStateChanged(evt);
            }
        });
        rbtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnEditarMouseClicked(evt);
            }
        });

        btnAccion.setBackground(new java.awt.Color(28, 116, 14));
        btnAccion.setForeground(new java.awt.Color(225, 234, 237));
        btnAccion.setText("Accion");
        btnAccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstEstudiantes);

        lblCarnetGenerado.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        lblCarnetGenerado.setForeground(new java.awt.Color(245, 246, 247));

        lblResultado.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(240, 244, 245));

        lblNombre.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(239, 245, 247));
        lblNombre.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(239, 245, 247));
        lblApellido.setText("Apellido");

        btnCerrar.setBackground(new java.awt.Color(119, 13, 31));
        btnCerrar.setForeground(new java.awt.Color(240, 244, 245));
        btnCerrar.setText("Cerrar");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtCarnet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCarnetFocusGained(evt);
            }
        });

        lblNombre1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(239, 245, 247));
        lblNombre1.setText("Carnet:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre)
                            .addComponent(lblNombre1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(txtCarnet))
                        .addGap(24, 24, 24)
                        .addComponent(lblApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 359, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rbtnBuscar)
                                .addGap(45, 45, 45)
                                .addComponent(rbtnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnGuardar)
                                .addGap(43, 43, 43)
                                .addComponent(rbtnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(lblCarnetGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerrar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblApellido)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnGuardar)
                            .addComponent(rbtnEditar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnEliminar)
                            .addComponent(rbtnBuscar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnAccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCarnetGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        // TODO add your handling code here: 
        if (rbtnGuardar.isSelected()) {
            if ((txtNombre.getText().isEmpty()) && (txtApellido.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Relleno los campos de nombre y apellido");
            }else{
            lblResultado.setText(acciones.Agregar(txtNombre.getText(), txtApellido.getText(), "Ninguno", model, lstEstudiantes));
            txtNombre.setText("");
            txtApellido.setText("");
            }
        }else if (rbtnEliminar.isSelected()) {
            if (txtCarnet.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un carnet");
            }else{
            lblResultado.setText(acciones.eliminar(txtCarnet.getText().toUpperCase(), model, lstEstudiantes));
            }
        }else if (rbtnEditar.isSelected()) {
            if (txtCarnet.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un carnet");
            }else{
            acciones.editar(txtCarnet.getText().toUpperCase(), model, lstEstudiantes);
            }
        }else if (rbtnBuscar.isSelected()) {
            if (txtCarnet.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un carnet");
            }else{
            lblResultado.setText(acciones.buscar(txtCarnet.getText().toUpperCase()));
            }
        }


    }//GEN-LAST:event_btnAccionActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:

        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty()) {
            btnAccion.setEnabled(false);
        } else {
            btnAccion.setEnabled(true);
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        // TODO add your handling code here:

        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty()) {
            btnAccion.setEnabled(false);
        } else {
            btnAccion.setEnabled(true);
        }
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void rbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnGuardarActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_rbtnGuardarActionPerformed

    private void rbtnEditarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnEditarItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_rbtnEditarItemStateChanged

    private void rbtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnEditarMouseClicked
        // TODO add your handling code here:
        txtCarnet.setEnabled(true);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
    }//GEN-LAST:event_rbtnEditarMouseClicked

    private void rbtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnEliminarMouseClicked
        // TODO add your handling code here:
        txtCarnet.setEnabled(true);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        lblResultado.setText("");
    }//GEN-LAST:event_rbtnEliminarMouseClicked

    private void rbtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnBuscarMouseClicked
        // TODO add your handling code here:
        txtCarnet.setEnabled(true);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        lblResultado.setText("");
    }//GEN-LAST:event_rbtnBuscarMouseClicked

    private void rbtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnGuardarMouseClicked
        // TODO add your handling code here:
        txtCarnet.setEnabled(false);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        lblResultado.setText("");
    }//GEN-LAST:event_rbtnGuardarMouseClicked

    private void txtCarnetFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCarnetFocusGained
        // TODO add your handling code here:
        txtCarnet.setText("");
    }//GEN-LAST:event_txtCarnetFocusGained

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnCerrar;
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCarnetGenerado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JList<String> lstEstudiantes;
    private javax.swing.JRadioButton rbtnBuscar;
    private javax.swing.JRadioButton rbtnEditar;
    private javax.swing.JRadioButton rbtnEliminar;
    private javax.swing.JRadioButton rbtnGuardar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
