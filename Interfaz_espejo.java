/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete;

/**
 *
 * @author USER
 */
public class Interfaz_espejo extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz_espejlo
     */
    public Interfaz_espejo() {
        initComponents();
        
        buttonGroup1.add(this.rdb1Original);
        buttonGroup1.add(this.rdb2Original);
        buttonGroup1.add(this.rdb3Original);
        
        buttonGroup2.add(this.rdb1Imitacion);
        buttonGroup2.add(this.rdb2Imitacion);
        buttonGroup2.add(this.rdb3Imitacion);
        
        buttonGroup3.add(this.cbk1Original);
        buttonGroup3.add(this.cbk2Original);
        buttonGroup3.add(this.cbk3Original);
        
        buttonGroup4.add(this.cbk1Imitacion);
        buttonGroup4.add(this.cbk2Imitacion);
        buttonGroup4.add(this.cbk3Imitacion);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rdb1Original = new javax.swing.JRadioButton();
        rdb2Original = new javax.swing.JRadioButton();
        rdb3Original = new javax.swing.JRadioButton();
        cbk1Original = new javax.swing.JCheckBox();
        cbk2Original = new javax.swing.JCheckBox();
        cbk3Original = new javax.swing.JCheckBox();
        txtOriginal = new javax.swing.JTextField();
        cmbOriginal = new javax.swing.JComboBox<>();
        spnOriginal = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        rdb1Imitacion = new javax.swing.JRadioButton();
        rdb2Imitacion = new javax.swing.JRadioButton();
        rdb3Imitacion = new javax.swing.JRadioButton();
        cbk1Imitacion = new javax.swing.JCheckBox();
        cbk2Imitacion = new javax.swing.JCheckBox();
        cbk3Imitacion = new javax.swing.JCheckBox();
        txtImitacion = new javax.swing.JTextField();
        cmbImitacion = new javax.swing.JComboBox<>();
        spnImitacion = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Original");

        rdb1Original.setText("Opcion 1");
        rdb1Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1OriginalActionPerformed(evt);
            }
        });

        rdb2Original.setText("Opcion 2");
        rdb2Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb2OriginalActionPerformed(evt);
            }
        });

        rdb3Original.setText("Opcion 3");
        rdb3Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb3OriginalActionPerformed(evt);
            }
        });

        cbk1Original.setText("Opcion 4");
        cbk1Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbk1OriginalActionPerformed(evt);
            }
        });

        cbk2Original.setText("Opcion 5");
        cbk2Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbk2OriginalActionPerformed(evt);
            }
        });

        cbk3Original.setText("Opcion 6");
        cbk3Original.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbk3OriginalActionPerformed(evt);
            }
        });

        txtOriginal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOriginalKeyTyped(evt);
            }
        });

        cmbOriginal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOriginal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOriginalItemStateChanged(evt);
            }
        });
        cmbOriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOriginalActionPerformed(evt);
            }
        });

        spnOriginal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnOriginalStateChanged(evt);
            }
        });

        jLabel2.setText("Espejo");

        rdb1Imitacion.setText("Opcion 1");
        rdb1Imitacion.setEnabled(false);
        rdb1Imitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1ImitacionActionPerformed(evt);
            }
        });

        rdb2Imitacion.setText("Opcion 2");
        rdb2Imitacion.setEnabled(false);

        rdb3Imitacion.setText("Opcion 3");
        rdb3Imitacion.setEnabled(false);

        cbk1Imitacion.setText("Opcion 4");
        cbk1Imitacion.setEnabled(false);

        cbk2Imitacion.setText("Opcion 5");
        cbk2Imitacion.setEnabled(false);

        cbk3Imitacion.setText("Opcion 6");
        cbk3Imitacion.setEnabled(false);

        txtImitacion.setEnabled(false);

        cmbImitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbImitacion.setEnabled(false);

        spnImitacion.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rdb3Original, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdb2Original, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(rdb1Original, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbk2Original, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbk3Original, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(spnOriginal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbk1Original, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(txtOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdb1Imitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbk1Imitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdb2Imitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbk2Imitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdb3Imitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbk3Imitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtImitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(spnImitacion))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb1Original)
                    .addComponent(cbk1Original)
                    .addComponent(txtOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb2Original)
                    .addComponent(cbk2Original)
                    .addComponent(cmbOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb3Original)
                    .addComponent(cbk3Original)
                    .addComponent(spnOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb1Imitacion)
                    .addComponent(cbk1Imitacion)
                    .addComponent(txtImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb2Imitacion)
                    .addComponent(cbk2Imitacion)
                    .addComponent(cmbImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb3Imitacion)
                    .addComponent(cbk3Imitacion)
                    .addComponent(spnImitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdb1OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1OriginalActionPerformed
        // TODO add your handling code here:
        this.rdb1Imitacion.setSelected(this.rdb1Original.isSelected());
        
    }//GEN-LAST:event_rdb1OriginalActionPerformed

    private void cbk1OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbk1OriginalActionPerformed
        // TODO add your handling code here:
        
        this.cbk1Imitacion.setSelected(this.cbk1Original.isSelected());
    }//GEN-LAST:event_cbk1OriginalActionPerformed

    private void cmbOriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOriginalActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_cmbOriginalActionPerformed

    private void rdb1ImitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1ImitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb1ImitacionActionPerformed

    private void rdb2OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb2OriginalActionPerformed
        // TODO add your handling code here:
        
        this.rdb2Imitacion.setSelected(this.rdb2Original.isSelected());
    }//GEN-LAST:event_rdb2OriginalActionPerformed

    private void rdb3OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb3OriginalActionPerformed
        // TODO add your handling code here:
        this.rdb3Imitacion.setSelected(this.rdb3Original.isSelected());
        
    }//GEN-LAST:event_rdb3OriginalActionPerformed

    private void cbk2OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbk2OriginalActionPerformed
        // TODO add your handling code here:
        
        this.cbk2Imitacion.setSelected(this.cbk2Original.isSelected());
    }//GEN-LAST:event_cbk2OriginalActionPerformed

    private void cbk3OriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbk3OriginalActionPerformed
        // TODO add your handling code here:
        this.cbk3Imitacion.setSelected(this.cbk3Original.isSelected());
        
    }//GEN-LAST:event_cbk3OriginalActionPerformed

    private void txtOriginalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOriginalKeyTyped
        // TODO add your handling code here:
        
        this.txtImitacion.setText(this.txtOriginal.getText());
    }//GEN-LAST:event_txtOriginalKeyTyped

    private void cmbOriginalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOriginalItemStateChanged
        // TODO add your handling code here:
        
        this.cmbImitacion.setSelectedIndex(this.cmbOriginal.getSelectedIndex());
    }//GEN-LAST:event_cmbOriginalItemStateChanged

    private void spnOriginalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnOriginalStateChanged
        // TODO add your handling code here:
        this.spnImitacion.setValue((Integer)this.spnOriginal.getValue());
    }//GEN-LAST:event_spnOriginalStateChanged

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
            java.util.logging.Logger.getLogger(Interfaz_espejo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_espejo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_espejo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_espejo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_espejo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBox cbk1Imitacion;
    private javax.swing.JCheckBox cbk1Original;
    private javax.swing.JCheckBox cbk2Imitacion;
    private javax.swing.JCheckBox cbk2Original;
    private javax.swing.JCheckBox cbk3Imitacion;
    private javax.swing.JCheckBox cbk3Original;
    private javax.swing.JComboBox<String> cmbImitacion;
    private javax.swing.JComboBox<String> cmbOriginal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdb1Imitacion;
    private javax.swing.JRadioButton rdb1Original;
    private javax.swing.JRadioButton rdb2Imitacion;
    private javax.swing.JRadioButton rdb2Original;
    private javax.swing.JRadioButton rdb3Imitacion;
    private javax.swing.JRadioButton rdb3Original;
    private javax.swing.JSpinner spnImitacion;
    private javax.swing.JSpinner spnOriginal;
    private javax.swing.JTextField txtImitacion;
    private javax.swing.JTextField txtOriginal;
    // End of variables declaration//GEN-END:variables
}
