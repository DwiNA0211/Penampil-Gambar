/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;

/**
 *
 * @author ASUS
 */
public class PenampilGambar extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambar
     */
    public PenampilGambar() {
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

        button = new javax.swing.JPanel();
        THOR = new javax.swing.JButton();
        GROOT = new javax.swing.JButton();
        SPIDER = new javax.swing.JButton();
        KELUAR = new javax.swing.JButton();
        image = new javax.swing.JPanel();
        thor = new javax.swing.JLabel();
        groot = new javax.swing.JLabel();
        spider = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button.setBackground(new java.awt.Color(255, 153, 255));

        THOR.setBackground(new java.awt.Color(66, 71, 224));
        THOR.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        THOR.setText("THOR");
        THOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THORActionPerformed(evt);
            }
        });
        button.add(THOR);

        GROOT.setBackground(new java.awt.Color(144, 102, 45));
        GROOT.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        GROOT.setText("GROOT");
        GROOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GROOTActionPerformed(evt);
            }
        });
        button.add(GROOT);

        SPIDER.setBackground(new java.awt.Color(255, 0, 51));
        SPIDER.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SPIDER.setText("SPIDERMAN");
        SPIDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPIDERActionPerformed(evt);
            }
        });
        button.add(SPIDER);

        KELUAR.setBackground(new java.awt.Color(51, 51, 51));
        KELUAR.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        KELUAR.setText("KELUAR");
        KELUAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KELUARActionPerformed(evt);
            }
        });
        button.add(KELUAR);

        getContentPane().add(button, java.awt.BorderLayout.PAGE_START);

        image.setLayout(new java.awt.CardLayout());

        thor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/thorrr.jpg"))); // NOI18N
        image.add(thor, "0");

        groot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/babygroot.jpg"))); // NOI18N
        image.add(groot, "1");

        spider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/spider.jpeg"))); // NOI18N
        image.add(spider, "2");

        getContentPane().add(image, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void THORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THORActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(image.getLayout());
        c1.show(image, "0");
    }//GEN-LAST:event_THORActionPerformed

    private void GROOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GROOTActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(image.getLayout());
        c1.show(image, "1");
    }//GEN-LAST:event_GROOTActionPerformed

    private void SPIDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPIDERActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(image.getLayout());
        c1.show(image, "2");
    }//GEN-LAST:event_SPIDERActionPerformed

    private void KELUARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KELUARActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_KELUARActionPerformed

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
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenampilGambar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GROOT;
    private javax.swing.JButton KELUAR;
    private javax.swing.JButton SPIDER;
    private javax.swing.JButton THOR;
    private javax.swing.JPanel button;
    private javax.swing.JLabel groot;
    private javax.swing.JPanel image;
    private javax.swing.JLabel spider;
    private javax.swing.JLabel thor;
    // End of variables declaration//GEN-END:variables
}
