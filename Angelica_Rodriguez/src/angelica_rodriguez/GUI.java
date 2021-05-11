/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angelica_rodriguez;

import java.awt.Graphics;
import java.awt.Image;
import javafx.scene.paint.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author angel
 */
public class GUI extends javax.swing.JFrame {
     
    int contador = 0;
    int aros = 6;
    
  
   
    public GUI() {
        initComponents();       
       //   setContentPane(image);
        IniciarLabel();
        ColorDePanel();
        this.setLocationRelativeTo(null);//CENTRA EL FRAME
        this.setResizable(false); //NO SE PERMITE AGRANDAR O DISMINUIR EL FRAME
      
    }
    
    private void IniciarLabel()
    {    //ASIGNAMOS LAS IMAGENES A LOS LABEL DE LA TORRE 1 (Panel1)
        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco3.png")));
        lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco4png.png")));
        lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco5.png")));
        lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco6.png")));   
        //CENTRO LOS DISCOS DE LA PRIMER TORRE.
        lbl1.setHorizontalAlignment(lbl1.CENTER);
        lbl2.setHorizontalAlignment(lbl2.CENTER);
        lbl3.setHorizontalAlignment(lbl3.CENTER);
        lbl4.setHorizontalAlignment(lbl4.CENTER);
        lbl5.setHorizontalAlignment(lbl5.CENTER);
        lbl6.setHorizontalAlignment(lbl6.CENTER);
    }
    
    private void CentrarLabel(){
        //METODO QUE ME PERMITE CENTRAR LOS LABEL DE LAS TORRES AUXILIAR Y DESTINO.
        lbl7.setHorizontalAlignment(lbl7.CENTER);
        lbl8.setHorizontalAlignment(lbl8.CENTER);
        lbl9.setHorizontalAlignment(lbl9.CENTER);
        lbl10.setHorizontalAlignment(lbl10.CENTER);
        lbl11.setHorizontalAlignment(lbl11.CENTER);
        lbl12.setHorizontalAlignment(lbl12.CENTER);
        lbl13.setHorizontalAlignment(lbl13.CENTER);
        lbl14.setHorizontalAlignment(lbl14.CENTER);
        lbl15.setHorizontalAlignment(lbl15.CENTER);
        lbl16.setHorizontalAlignment(lbl16.CENTER);
        lbl17.setHorizontalAlignment(lbl17.CENTER);
        lbl18.setHorizontalAlignment(lbl18.CENTER);
    }
    private void LimpiarLabel()
    {   
        //PROCEDO A LIMPIAR LOS LABEL DE LA ULTIMA TORRE PARA DAR UNA APARIENCIA DE VACIO.  
        lbl13.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        lbl14.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        lbl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        lbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));    
    }
    
    private void ColorDePanel()
    {   //AGREGO COLOR A MIS TORRES.
        Panel1.setBackground(java.awt.Color.WHITE);
        Panel2.setBackground(java.awt.Color.WHITE);
        Panel3.setBackground(java.awt.Color.WHITE);
    }
   
     private void Recursividad(int NumDiscos, int Origen, int Aux, int Destino) {

    
      
        if (NumDiscos == 1) {
             
            //VISUALIZAR LOS MOVIMIENTOS ENTRE TORRES.
           //CREO UNAVENTANA EMERGENTE PARA PODER COLOCARLA EN UN LUGAR ESPECIFICO
            JOptionPane mensaje = new JOptionPane("Moviendo de torre: " + Origen + " a torre : " + Destino);
              final JDialog dialog =  mensaje.createDialog(null,"MOVIMIENTOS");
              dialog.setLocation(0,0);
              dialog.setVisible(true);
             contador++;//INCREMENTO EL CONTADOR QUE ME PERMITE SABER QUE DISCO MOVER.
            //METODO QUE PERMITE MOVER LOS DISCOS
           MueveDiscos();
           
        } else {
         
             
            Recursividad(NumDiscos - 1, Origen, Destino, Aux);
             //CREO UNAVENTANA EMERGENTE PARA PODER COLOCARLA EN UN LUGAR ESPECIFICO
             JOptionPane mensaje = new JOptionPane("Moviendo de torre: " + Origen + " a torre : " + Destino);
             final JDialog dialog =  mensaje.createDialog(null,"MOVIMIENTOS");
             dialog.setLocation(0,0);
             dialog.setVisible(true);
            //FUNCION PARA MOVER LOS DICOS ENTRE TORRES.
              contador++;//INCREMENTO EL CONTADOR QUE ME PERMITE SABER QUE DISCO MOVER.
              
             
            //METODO QUE PERMITE VISUALIZAR LOS MOVIMIENTOS DE CADA DISCO ENTRE LOS PANELES.
             MueveDiscos();
            //LLAMAMOS AL METODO PARA EFECTUAR EL MOVIMIENTO DE LOS DISCOS.
            Recursividad(NumDiscos - 1, Aux, Origen, Destino);         
        }

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new Fondo();
        Panel3 = new javax.swing.JPanel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        lbl8 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btbIniciar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel3.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 180, 30));
        Panel3.add(lbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 120, 180, 30));
        Panel3.add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, 180, 30));
        Panel3.add(lbl16, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 180, 180, 30));
        Panel3.add(lbl17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 210, 180, 30));
        Panel3.add(lbl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 240, 180, 30));

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        Panel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 10, 290));

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Panel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, 10));

        panelFondo.add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 200, 300));

        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel2.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 120, 180, 30));
        Panel2.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 180, 30));
        Panel2.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, 180, 30));
        Panel2.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 180, 180, 30));
        Panel2.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 210, 180, 30));
        Panel2.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 240, 180, 30));

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        Panel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 10, 290));

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Panel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, 10));

        panelFondo.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 200, 290));

        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 180, 30));
        Panel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 120, 180, 30));
        Panel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, 180, 30));
        Panel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 180, 180, 30));
        Panel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 210, 180, 30));
        Panel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 240, 180, 30));

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        Panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 10, 290));

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Panel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, 10));

        panelFondo.add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, 290));

        btbIniciar.setBackground(new java.awt.Color(255, 204, 51));
        btbIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JUGAR.png"))); // NOI18N
        btbIniciar.setMaximumSize(new java.awt.Dimension(71, 32));
        btbIniciar.setMinimumSize(new java.awt.Dimension(71, 32));
        btbIniciar.setPreferredSize(new java.awt.Dimension(71, 32));
        btbIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbIniciarActionPerformed(evt);
            }
        });
        panelFondo.add(btbIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 150, 40));

        btnReiniciar.setBackground(new java.awt.Color(255, 204, 51));
        btnReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REINICIAR.png"))); // NOI18N
        btnReiniciar.setMaximumSize(new java.awt.Dimension(71, 32));
        btnReiniciar.setMinimumSize(new java.awt.Dimension(71, 32));
        btnReiniciar.setPreferredSize(new java.awt.Dimension(71, 32));
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        panelFondo.add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, 40));

        btnSalir.setBackground(new java.awt.Color(255, 204, 51));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIR.png"))); // NOI18N
        btnSalir.setMaximumSize(new java.awt.Dimension(71, 32));
        btnSalir.setMinimumSize(new java.awt.Dimension(71, 32));
        btnSalir.setPreferredSize(new java.awt.Dimension(71, 32));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelFondo.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbIniciarActionPerformed
        // TODO add your handling code here:
     
        //SE LLAMA AL METODO RECURSIVO UNICAMENTE YA QUE DENTRO DE ESTE TENEMOS
        //EL METODO ENCARGADO DE MOVER LOS DISCOS, PASAMOS LAS TORRES Y NUMERO DE AROS.
        Recursividad(aros,1,2,3);
         btbIniciar.setEnabled(false);
    }//GEN-LAST:event_btbIniciarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
       btbIniciar.setEnabled(true);
        //SE LIMPIA LA ULTIMA TORRE PARA EVITAR ERRORES AL MOMENTO DE JUGAR DE NUEVO.
        LimpiarLabel();
        contador=0;//SE REINICIA CONTADOR PARA INICIAR MOVIENDO LOS DISCOS.
        IniciarLabel();//COMO SE HABIA INICIADO LOS DISCOS DE LA TORRE 1 EN EL initcomponets 
        //PARA PODER VISUALIZAR TODO DE FORMA CORRECTA SE LLAMA NUEVAMENTE EL METODO.
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        //SE SALE DEL PROGRAMA.   
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void MueveDiscos() {
        //METODO QUE NOS PERMITE MOVER LOS DISCOS, ESTE PROCESO SE LLEVO A CABO DE FORMA MANUAL.
        
        //PRIMERO SE CREARON LOS DISCOS NECESARIOS.
        //APUNTE LOS MOVIMIENTOS ENTRE TORRES Y LOS DSICOS QUE SE MOVIAN EN CADA CASO.
        //DE ESTA MANERA LOS ACOMODE EN SU LABEL RESPECTIVO Y LIMPIE EL LABEL ANTERIOS (AL QUE PERTENECIA EL DISCO EN UN INICIO).
        CentrarLabel();
        if (contador == 1) {
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));

        }
        if (contador == 2) {
            lbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 3) {
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 4) {
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco3.png")));
            lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 5) {
            lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 6) {
            lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 7) {
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 8) {
            lbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco4png.png")));
            lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 9) {
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 10) {
            lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 11) {
            lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 12) {
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco3.png")));
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 13) {
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 14) {
            lbl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 15) {
            lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 16) {
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco5.png")));
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 17) {
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 18) {
            lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 19) {
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 20) {
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco3.png")));
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 21) {
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 22) {
            lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 23) {
            lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 24) {
            lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco4png.png")));
            lbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 25) {
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 26) {
            lbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 27) {
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 28) {
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco3.png")));
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 29) {
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 30) {
            lbl9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 31) {
            lbl8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 32) {
            lbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco6.png")));
            lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 33) {
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl8.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 34) {
            lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl9.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 35) {
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 36) {
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco3.png")));
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 37) {
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 38) {
            lbl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 39) {
            lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 40) {
            lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco4png.png")));
            lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 41) {
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 42) {
            lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 43) {
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 44) {
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco3.png")));
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 45) {
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 46) {
            lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 47) {
            lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 48) {
            lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco5.png")));
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 49) {
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 50) {
            lbl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 51) {
            lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 52) {
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco3.png")));
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 53) {
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 54) {
            lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 55) {
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 56) {
            lbl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco4png.png")));
            lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 57) {
            lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 58) {
            lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 59) {
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 60) {
            lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco3.png")));
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 61) {
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 62) {
            lbl14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Disco2png.png")));
            lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador == 63) {
            lbl13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco1.png")));
            lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        }
        if (contador >= 63) {
            JOptionPane.showMessageDialog(null, "¡FIN DEL JUEGO!");
        }
       
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JButton btbIniciar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}

//CLASE CREADA PARA COLOCAR LA IMAGEN DE FONDO AL PANEL.
 class Fondo extends JPanel {
      
        private Image imagen;
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Torre.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

 
