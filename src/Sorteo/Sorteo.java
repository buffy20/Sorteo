/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorteo;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Sorteo extends javax.swing.JFrame {

    /**
     * Creates new form Sorteo
     */
    public Sorteo() {
        initComponents();
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
        jLabel5 = new javax.swing.JLabel();
        jTextFieldMaximo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 255, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 80)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sorteo de Navidad ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 25, 1094, 113));

        jTextFieldMaximo.setFont(new java.awt.Font("Verdana", 0, 50)); // NOI18N
        jTextFieldMaximo.setForeground(new java.awt.Color(153, 204, 255));
        jPanel1.add(jTextFieldMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 317, 364, 62));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Número máximo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 317, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 60)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 806, 1094, 120));

        jLabel6.setFont(new java.awt.Font("Verdana", 2, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 204, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("IES Ntra Sra de los Remedios");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 144, 1094, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 450)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 350, 370));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 450)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 350, 370));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 450)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 350, 370));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/christmas-wallpaper-hd.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 1010));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Random generaNumero = new Random();
            int numeroMaximo = Integer.valueOf(jTextFieldMaximo.getText());
            int numeroElegido = generaNumero.nextInt(numeroMaximo) + 1;
            String numero = String.valueOf(numeroElegido);
            String primerNumero = numero.substring(0, 1);
            String segundoNumero = numero.substring(1, 2);
            String tercerNumero = numero.substring(2, 3);
            int vueltas = 15;
            if (numeroMaximo >= 1 && numeroMaximo <= 999) {
                for (int i = 0; i <= vueltas; i++) {
                    try {
                        int mostrarNumeros = generaNumero.nextInt(10);
                        jLabel4.setText("" + mostrarNumeros);
                        jLabel4.paintImmediately(0, 0, jLabel4.getWidth(), jLabel4.getHeight());
                        jLabel4.setText("" + primerNumero);
                        Thread.sleep(300);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Sorteo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                for (int i = 0; i <= vueltas; i++) {
                    try {
                        int mostrarNumeros = generaNumero.nextInt(10);
                        jLabel10.setText("" + mostrarNumeros);
                        jLabel10.paintImmediately(0, 0, jLabel10.getWidth(), jLabel10.getHeight());
                        jLabel10.setText("" + segundoNumero);
                        Thread.sleep(300);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Sorteo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                for (int i = 0; i <= vueltas; i++) {
                    try {
                        int mostrarNumeros = generaNumero.nextInt(10);
                        jLabel9.setText("" + mostrarNumeros);
                        jLabel9.paintImmediately(0, 0, jLabel9.getWidth(), jLabel9.getHeight());
                        jLabel9.setText("" + tercerNumero);
                        Thread.sleep(300);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Sorteo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else{
               JOptionPane.showMessageDialog(this, "Debe introducir un número hasta el 999", "Error", JOptionPane.WARNING_MESSAGE); 
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe introducir un número entero", "Error", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sorteo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldMaximo;
    // End of variables declaration//GEN-END:variables
}
