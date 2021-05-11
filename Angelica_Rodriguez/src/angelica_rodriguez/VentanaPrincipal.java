
package angelica_rodriguez;


public class VentanaPrincipal extends javax.swing.JFrame {

    
    public VentanaPrincipal() {
        initComponents();
         this.setResizable(false);//NO SE PERMITE AGRANDARLO
         this.setLocationRelativeTo(null);//SE CENTRA.
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSALIR = new javax.swing.JButton();
        btnCONTINUAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSALIR.setBackground(new java.awt.Color(196, 179, 179));
        btnSALIR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSALIR.setForeground(new java.awt.Color(186, 158, 158));
        btnSALIR.setText("SALIR");
        btnSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSALIRActionPerformed(evt);
            }
        });
        getContentPane().add(btnSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 180, 40));

        btnCONTINUAR.setBackground(new java.awt.Color(196, 179, 179));
        btnCONTINUAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCONTINUAR.setForeground(new java.awt.Color(186, 158, 158));
        btnCONTINUAR.setText("INICIAR");
        btnCONTINUAR.setPreferredSize(new java.awt.Dimension(85, 38));
        btnCONTINUAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCONTINUARActionPerformed(evt);
            }
        });
        getContentPane().add(btnCONTINUAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCONTINUARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCONTINUARActionPerformed
        // TODO add your handling code here:

      //  LLAMO AL FORMULARIO QUE CONTIENE LAS TORRES Y LO CONCERNIENTE AL JUEGO EN SI.
        GUI form1 = new GUI();
        form1.setVisible(true);
       

        this.dispose();//SE OCULTA EL FORMULARIO ACTUAL.
    }//GEN-LAST:event_btnCONTINUARActionPerformed

    private void btnSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSALIRActionPerformed
        // TODO add your handling code here:
        //SALIMOS DEL PROGRAMA
        System.exit(0);
    }//GEN-LAST:event_btnSALIRActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCONTINUAR;
    private javax.swing.JButton btnSALIR;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
