/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maryvone.gereformation.gui;

import com.maryvone.gereformation.gui.forms.StagiaireCreationForm;
import com.maryvone.gereformation.gui.menus.formationMenu;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        bg = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        personnels = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        formations = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        stagiaire = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        resultPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERE FORMATION");
        setLocationByPlatform(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(63, 103, 112));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personnels.setBackground(new java.awt.Color(117, 151, 157));
        personnels.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maryvone/gereformation/gui/Icon/Personnels.png"))); // NOI18N
        personnels.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 70));

        jLabel2.setText("PERSONNELS");
        personnels.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        sidePanel.add(personnels, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 100));

        formations.setBackground(new java.awt.Color(117, 151, 157));
        formations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formationsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formationsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formationsMouseEntered(evt);
            }
        });
        formations.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maryvone/gereformation/gui/Icon/Formation.png"))); // NOI18N
        formations.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 70));

        jLabel4.setText("FORMATIONS");
        formations.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        sidePanel.add(formations, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 100));

        stagiaire.setBackground(new java.awt.Color(117, 151, 157));
        stagiaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stagiaireMouseClicked(evt);
            }
        });
        stagiaire.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maryvone/gereformation/gui/Icon/Stagiaires.png"))); // NOI18N
        stagiaire.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 70));

        jLabel6.setText("STAGIAIRES");
        stagiaire.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        sidePanel.add(stagiaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 100));

        bg.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 629));

        resultPanel.setBackground(new java.awt.Color(248, 248, 248));

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        bg.add(resultPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 840, 480));

        topPanel.setBackground(new java.awt.Color(81, 121, 130));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        bg.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 840, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formationsMouseClicked
       stagiaire.setBackground(new Color(117,151,157));
        personnels.setBackground(new Color(117,151,157));
        formations.setBackground(new Color(226,240,248));
       formationMenu panel = new formationMenu(this);
       panel.setSize(topPanel.getWidth(),topPanel.getHeight());
       panel.setVisible(true);
       topPanel.add(panel);
       
       topPanel.revalidate();
    }//GEN-LAST:event_formationsMouseClicked

    private void stagiaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stagiaireMouseClicked
         personnels.setBackground(new Color(117,151,157));
        formations.setBackground(new Color(117,151,157));
        stagiaire.setBackground(new Color(226,240,248));
          StagiaireCreationForm panel = new StagiaireCreationForm(this);
          setResultPanel(panel);
    }//GEN-LAST:event_stagiaireMouseClicked

    private void formationsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formationsMouseEntered
       formations.setBackground(new Color(226,240,248)); 
    }//GEN-LAST:event_formationsMouseEntered

    private void formationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formationsMouseExited
        formations.setBackground(new Color(117,151,157));
    }//GEN-LAST:event_formationsMouseExited

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel formations;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel personnels;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel stagiaire;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables

    public JPanel getResultPanel() {
        return resultPanel;
    }

    public void setResultPanel(JPanel result) {
        resultPanel.removeAll();
        resultPanel.repaint();
         result.setSize(resultPanel.getWidth(),resultPanel.getHeight());
       result.setVisible(true);
       resultPanel.add(result);
       
        resultPanel.revalidate();
    }
    
        public void init(){
            resultPanel.removeAll();
            resultPanel.revalidate();
            resultPanel.repaint();
            topPanel.removeAll();
            topPanel.revalidate();
            topPanel.repaint();
            formations.setBackground(new Color(117,151,157));
            stagiaire.setBackground(new Color(117,151,157));
            personnels.setBackground(new Color(117,151,157));
        }

    




}
