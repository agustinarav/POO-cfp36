
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;



// Inhabilitar boton hasta que no se completen correctamente los campos 
// No enviar el dato si no se completo correctamente el campo
// Corregir bucle 


public class Ventas extends javax.swing.JInternalFrame {

    private static void setAlwaysOnTop(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    //enum tam { cuartoKilo, medioKilo, kilo } ; 
    //tam tamSeleccionados; 
    //int saboresContar; 
    //int saboresPote; 
    
    
    

    
    
    
    public Ventas() {
        initComponents();
        impFecha.setText (fechaActual()); 
      
        
    
      
    
      
        
        //tamSeleccionados = tam.cuartoKilo; 
        // int saboresPote; 
        
  
         
       
         
         
         
    }

  
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        mailValido = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        check9 = new javax.swing.JCheckBox();
        check1 = new javax.swing.JCheckBox();
        check2 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check4 = new javax.swing.JCheckBox();
        check5 = new javax.swing.JCheckBox();
        check6 = new javax.swing.JCheckBox();
        check7 = new javax.swing.JCheckBox();
        check8 = new javax.swing.JCheckBox();
        advertencia = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        impTick = new javax.swing.JButton();
        delivery = new javax.swing.JButton();
        pedido = new javax.swing.JLabel();
        imprimir1 = new javax.swing.JLabel();
        imprimir2 = new javax.swing.JLabel();
        imprimir3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        impNumPedido = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        impFecha = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(850, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null), "Datos del cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel2.setText("E-Mail");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 40));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 257, -1));

        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mailKeyTyped(evt);
            }
        });
        jPanel1.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 257, -1));

        mailValido.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        mailValido.setForeground(new java.awt.Color(153, 0, 51));
        jPanel1.add(mailValido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 260, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Elegí tu producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grupo1.add(radio1);
        radio1.setText("1/4 de Kg");
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });
        jPanel3.add(radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        grupo1.add(radio2);
        radio2.setText("1/2 de Kg");
        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });
        jPanel3.add(radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        grupo1.add(radio3);
        radio3.setText("1 Kg");
        radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio3ActionPerformed(evt);
            }
        });
        jPanel3.add(radio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 82, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))), "Elegí tus sabores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        check9.setText("Honk If U Don't Exist");
        jPanel2.add(check9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        check1.setText("Anime Was A Mistake ");
        jPanel2.add(check1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        check2.setText("Autistic Psycho");
        check2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check2ActionPerformed(evt);
            }
        });
        jPanel2.add(check2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        check3.setText("Sadboy Monstercore");
        jPanel2.add(check3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        check4.setText("Bonk From Hell");
        jPanel2.add(check4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        check5.setText("U Have Bad Taste ");
        jPanel2.add(check5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        check6.setText("Buy Me A Burrito");
        jPanel2.add(check6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        check7.setText("Aaaanxiety");
        jPanel2.add(check7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        check8.setText("No God Please No");
        check8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check8ActionPerformed(evt);
            }
        });
        jPanel2.add(check8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        advertencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        advertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(advertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 410, 30));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Detalles de tu pedido ");

        impTick.setText("IMPRIMIR TICKET");
        impTick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impTickActionPerformed(evt);
            }
        });

        delivery.setForeground(new java.awt.Color(255, 102, 0));
        delivery.setText("DELIVERY");
        delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryActionPerformed(evt);
            }
        });

        pedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imprimir1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imprimir2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imprimir3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("E-Mail");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Producto");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Sabores");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("Pedido nº");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Fecha");

        impFecha.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(impFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imprimir2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imprimir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(impNumPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(pedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(imprimir3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addComponent(impTick, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(17, 17, 17))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(impFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(imprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imprimir2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(impNumPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(imprimir3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(impTick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delivery)
                .addGap(17, 17, 17))
        );

        borrar.setForeground(new java.awt.Color(153, 0, 51));
        borrar.setText("BORRAR PEDIDO");
        borrar.setBorderPainted(false);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        guardar.setForeground(new java.awt.Color(0, 153, 204));
        guardar.setText("GUARDAR");
        guardar.setBorderPainted(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(borrar)
                            .addComponent(guardar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio3ActionPerformed
            advertencia.setText ("Seleccioná 4 sabores");
            
            
            
    }//GEN-LAST:event_radio3ActionPerformed

    private void check8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check8ActionPerformed

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
                    
        advertencia.setText ("Seleccioná 2 sabores");
   
        
     
        
       
        
        
        
        //saboresPote = 2; 
        //tamSeleccionados   = tam.cuartoKilo ; 
        
        
        //Ventas sabores = new Ventas (); 
        //sabores.setSabores ( 2 ); 
        
        
        
  
        
        
        
        
    }//GEN-LAST:event_radio1ActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
       
            //borar nombre
            nombre.setText("");
           
            //borrar mail
             mail.setText("");
            
            //borrar radio
             grupo1.clearSelection();
            
          
             mailValido.setText("");
             
    
            // borrar check    
            JCheckBox[] checkBoxes = {check1, check2,check3,check4,check5,check6,check7,check8,check9}; 
           
            for (int i = 0; i < checkBoxes.length; i++) {
           
                
                
            //solo imprime 1 checkbox no todos los seleccionados 
               
            if (checkBoxes [i].isSelected ()) {
               
            checkBoxes [i].setSelected(false);    }
                
                
                } 
                
                           
                    
                    
        
        
    }//GEN-LAST:event_borrarActionPerformed

    private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed
                   
        advertencia.setText ("Seleccioná 3 sabores");
        
    }//GEN-LAST:event_radio2ActionPerformed

    private void check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check2ActionPerformed

    
    
    private int contador = 0; 
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
       
        
        
          /* 
        Esto deberia habilitar el boton guardar solo si se completa el campo nombre (?)
        
        if ( nombre.getText().isEmpty () )  {    guardar.setEnabled(false);  } 
              
        else if ( nombre.getText().matches ("Solo")  ) { guardar.setEnabled (true); } ; */
         
          
          
          
          
          
           
            
         
                  
           // CONT PEDIDO 
            contador ++ ;     
            String numero= String.valueOf (contador); 
                    
            impNumPedido.setText (numero); 
          
           
          
            // INFO DATOS 
            imprimir1.setText (nombre.getText());
            imprimir2.setText (mail.getText());
          
          
         
            // INFO DE RADIOS 

             if (radio1.isSelected ()) {

                 pedido.setText ("1/4 de Kg ");

              }

             else if (radio2.isSelected ()) {

                 pedido.setText ("1/2 de Kg ");

              }

             else if (radio3.isSelected ()) {

                 pedido.setText ("1 Kg ");

              }


           
           
           
            JCheckBox[] checkBoxes = {check1, check2,check3,check4,check5,check6,check7,check8,check9}; 
           
            for (int i = 0; i < checkBoxes.length; i++) {
           
                
                
                //solo imprime 1 checkbox no todos los seleccionados 
               
                if (checkBoxes [i].isSelected ()) {
               
                imprimir3.setText (checkBoxes [i].getText());    }
                
                
                } 
                
                
                
                
                /* 
            
                  NOPE 
            
                  do {

                    imprimir3.setText (checkBoxes [i].getText());   
                    } while(checkBoxes [i].isSelected ()) ;

                    break; */
            
           
            
         
                /* 
                    version 1 checkbox individual 

                    if (check1.isSelected ()) {
                    imprimir3.setText (check1.getText()); */

                 
              
                

                
           
    }//GEN-LAST:event_guardarActionPerformed

        
   

        
    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
     
    }//GEN-LAST:event_mailActionPerformed

    
    
    private void mailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailKeyTyped
        
        
   
        
        if ( mail.getText().contains ( "@" )  ) { mailValido.setText( "");  }
        
        else { mailValido.setText( " Inrgese mail válido ");  }
        
        
        if ( mail.getText().contains ( "." ) ) { mailValido.setText( "");  }
        
        else { mailValido.setText( " Inrgese mail válido ");  }
        
        
        
    }//GEN-LAST:event_mailKeyTyped

    private void impTickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impTickActionPerformed
      
        
        
                // Se genera el JOptionPane con la informacion siguiente
        
                String fecha1 = "<html><p style='font:10px;font-weight: bold'>Fecha</p></html>";  
                String numPedido1 = "<html><p style='font:10px;font-weight: bold'>Nº de Pedido </p></html>";  
                String nombre1= "<html><p style='font:10px;font-weight: bold'>Nombre</p></html>";  
                String mail1= "<html><p style='font:10px;font-weight: bold'>E-Mail</p></html>";   
                String pedido1= "<html><p style='font:10px;font-weight: bold'>Producto</p></html>";  
                String sabores1= "<html><p style='font:10px;font-weight: bold'>Tus sabores</p></html>";  
                
               
            
                
                
                
                Object[] ticket = { fecha1, impFecha, nombre1, nombre.getText(), "\n", mail1, mail.getText(),"\n", numPedido1, impNumPedido, "\n",  pedido1, pedido.getText () , "\n", sabores1, imprimir3.getText()};

                //ImageIcon imagen = new ImageIcon(""); 
                
                  
           
                JOptionPane.showMessageDialog(rootPane, ticket, "Gracias por tu compra!", JOptionPane.PLAIN_MESSAGE);
        
        
                
                
                //Si se selecciona delivery 
                boolean selDelivery; 
              
                
                if ( delivery.isSelected () )   {
                
                   selDelivery = true; 
                              
                
                
                
                }
                    
                else { selDelivery = false;      }     
                String deliveryTxt =String.valueOf(selDelivery);  
                
                
                //Generador de txt 
                
                 String nombreV = imprimir1.getText (); 
                 String mailV = imprimir2.getText (); 
                 String productoV = pedido.getText(); 
                 String saboresV = imprimir3.getText(); 
                 String pedidoV = impNumPedido.getText(); 
                 String fechaV = impFecha.getText (); 
              
                 
                 
                 try

                {



                FileWriter archivoVentas = new FileWriter ( "ArchivoVentas.txt", true); 
 
                archivoVentas.write ( "\t \n Fecha: " + fechaV + 
                                        " Delivery: " + selDelivery + 
                                        " Nº de Pedido: "+ pedidoV + 
                                        " Nombre: " + nombreV + 
                                        " E-Mail: " +  mailV + 
                                        " Producto: " +  productoV +
                                        " Sabores: " + saboresV); 

                      

                JOptionPane.showMessageDialog( null , "El archivo fue creado con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);


                archivoVentas.close();





                }

                catch ( Exception e )

                {


                 JOptionPane.showInternalMessageDialog( null , "Error");



                } 


                
                
                
                
                
                
                
                
                
        
    }//GEN-LAST:event_impTickActionPerformed

    private void deliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryActionPerformed
       
        
        /*
        Delivery aparece detras de Ventas 
        
        Delivery deliveryVentana = new Delivery (); 
        Gestor.panel1.add ( deliveryVentana );
      
        deliveryVentana.setVisible(true);
        deliveryVentana.toFront();
        
        */
        
        
        DeliveryNew F1 = new DeliveryNew (); 
        F1.setLocationRelativeTo (null); 
        F1.setVisible (true); 
        
        
        //envio de datos de un form a otro
        DeliveryNew.nombre1.setText ( nombre.getText () ); 
        DeliveryNew.mail1.setText ( nombre.getText () ); 
        DeliveryNew.fechaDel.setText ( impFecha .getText () ); 
        DeliveryNew.PedDel.setText ( impNumPedido.getText () ); 
        
       
    }//GEN-LAST:event_deliveryActionPerformed


    public void cantSabores ( String sabores ) {
    
    advertencia.setText (sabores);
    
    
    }
     
    public static String fechaActual () {
    
    Date fecha = new Date (); 
    SimpleDateFormat formatoFecha = new SimpleDateFormat ("dd/MM/YYYY"); 
    
    return formatoFecha.format (fecha); 
     
    
    }
      
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertencia;
    private javax.swing.JButton borrar;
    private javax.swing.JCheckBox check1;
    private javax.swing.JCheckBox check2;
    private javax.swing.JCheckBox check3;
    private javax.swing.JCheckBox check4;
    private javax.swing.JCheckBox check5;
    private javax.swing.JCheckBox check6;
    private javax.swing.JCheckBox check7;
    private javax.swing.JCheckBox check8;
    private javax.swing.JCheckBox check9;
    private javax.swing.JButton delivery;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel impFecha;
    private javax.swing.JLabel impNumPedido;
    private javax.swing.JButton impTick;
    private javax.swing.JLabel imprimir1;
    private javax.swing.JLabel imprimir2;
    private javax.swing.JLabel imprimir3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField mail;
    private javax.swing.JLabel mailValido;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel pedido;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    // End of variables declaration//GEN-END:variables
}
