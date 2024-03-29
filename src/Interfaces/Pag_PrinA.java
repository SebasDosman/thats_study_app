/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author User
 */
public class Pag_PrinA extends javax.swing.JFrame {

    

    /**
     * Creates new form Pag_Principal
     */
    public Pag_PrinA() {
        initComponents();
        this.setLocationRelativeTo(null);
        botontransparente();
    }
    
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
       return retValue;
    }
    
    public void botontransparente(){
        Cerrar.setOpaque(false);
        Cerrar.setContentAreaFilled(false);
        Cerrar.setBorderPainted(false);
        Minimizar.setOpaque(false);
        Minimizar.setContentAreaFilled(false);
        Minimizar.setBorderPainted(false);
        Imagen.setOpaque(false);
        Imagen.setContentAreaFilled(false);
        Imagen.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Imagen = new javax.swing.JButton();
        Salir = new javax.swing.JLabel();
        Inicio = new javax.swing.JLabel();
        Materias = new javax.swing.JLabel();
        Clase = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Minimizar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(168, 201, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen.png"))); // NOI18N
        Imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagenActionPerformed(evt);
            }
        });
        jPanel1.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 160));

        Salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        Salir.setText("Cerrar sesión");
        Salir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SalirMouseMoved(evt);
            }
        });
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        Inicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png"))); // NOI18N
        Inicio.setText("Inicio");
        Inicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                InicioMouseMoved(evt);
            }
        });
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InicioMouseExited(evt);
            }
        });
        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, -1));

        Materias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Materias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/educacion.png"))); // NOI18N
        Materias.setText("Crear grupos");
        Materias.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MateriasMouseMoved(evt);
            }
        });
        Materias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MateriasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MateriasMouseExited(evt);
            }
        });
        jPanel1.add(Materias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 130, 40));

        Clase.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Clase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/presentacion.png"))); // NOI18N
        Clase.setText("Crear matriculas");
        Clase.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ClaseMouseMoved(evt);
            }
        });
        Clase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClaseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClaseMouseExited(evt);
            }
        });
        jPanel1.add(Clase, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 430));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar.png"))); // NOI18N
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
            }
        });
        jPanel3.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 40, 40));

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel3.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 800, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(143, 170, 220));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Bienvenido a That's Study coordinador");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel9)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Recuerda que elegiste nuestra plataforma gracias a que");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("That's Study tiene...");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-correcta.png"))); // NOI18N
        jLabel13.setText("Una fácil interacción al momento de utilizar.");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-correcta.png"))); // NOI18N
        jLabel17.setText("Información de la actividad o proyecto para realizar.");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-correcta.png"))); // NOI18N
        jLabel18.setText("Organización con todos los archivos.");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-correcta.png"))); // NOI18N
        jLabel19.setText("El propósito de brindar la tranquilidad para manejar la educación virtual.");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Online Education Isometric    Il.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 800, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagenActionPerformed
        
    }//GEN-LAST:event_ImagenActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed
        this.setState (Pag_PrinA.ICONIFIED);
    }//GEN-LAST:event_MinimizarActionPerformed

    private void SalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseMoved
        Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_SalirMouseMoved

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        this.setVisible(false);
        Final v= new Final();
        v.setVisible(true);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_SalirMouseExited

    private void InicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseMoved
        Inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_InicioMouseMoved

    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
        this.setVisible(false);
        Pag_PrinA v= new Pag_PrinA();
        v.setVisible(true);
    }//GEN-LAST:event_InicioMouseClicked

    private void InicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseExited
        Inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_InicioMouseExited

    private void MateriasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasMouseMoved
        Materias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_MateriasMouseMoved

    private void MateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasMouseClicked
        this.setVisible(false);
        Crea_grupos v= new Crea_grupos();
        v.setVisible(true);
    }//GEN-LAST:event_MateriasMouseClicked

    private void MateriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasMouseExited
        Materias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_MateriasMouseExited

    private void ClaseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClaseMouseMoved
        Clase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143,170,220)));
    }//GEN-LAST:event_ClaseMouseMoved

    private void ClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClaseMouseClicked
      this.setVisible(false); 
      Crea_Matri v = new Crea_Matri();
        v.setVisible(true);
    }//GEN-LAST:event_ClaseMouseClicked

    private void ClaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClaseMouseExited
        Clase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168,201,255)));
    }//GEN-LAST:event_ClaseMouseExited

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
            java.util.logging.Logger.getLogger(Pag_PrinA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pag_PrinA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pag_PrinA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pag_PrinA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pag_PrinA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel Clase;
    private javax.swing.JButton Imagen;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel Materias;
    private javax.swing.JButton Minimizar;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
