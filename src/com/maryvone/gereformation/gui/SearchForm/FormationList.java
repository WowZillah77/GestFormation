/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maryvone.gereformation.gui.SearchForm;

import com.maryvone.gereformation.dao.FormationDAO;
import com.maryvone.gereformation.dao.PersonnelDAO;
import com.maryvone.gereformation.dao.StagiaireDAO;
import com.maryvone.gereformation.model.Formation;
import java.sql.SQLException;
import java.util.ArrayList;
import com.maryvone.gereformation.gui.Home;
import com.maryvone.gereformation.model.Personnel;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;

/**
 *
 * @author david
 */
public class FormationList extends javax.swing.JPanel {
private Home home;
    /**
     * Creates new form FormationList
     */
    public FormationList(Home home) throws SQLException {
        this.home = home;
        
       
        
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

        StagiaireJDialog = new javax.swing.JDialog();
        formationName = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        stagiaireInFormation = new javax.swing.JTable();
        codeFormation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        formationList = new javax.swing.JTable();
        formationDetails = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ATextDescription = new javax.swing.JTextArea();
        TfieldLabel = new javax.swing.JTextField();
        TFieldCode = new javax.swing.JTextField();
        TFieldHrs = new javax.swing.JTextField();
        ButtonUpdate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxFormateur = new javax.swing.JComboBox<>();
        date = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        TfieldLieu = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        ButtonStagiaires = new javax.swing.JButton();
        ButtonModules = new javax.swing.JButton();
        ButtonSequences = new javax.swing.JButton();
        ButtonECF = new javax.swing.JButton();

        StagiaireJDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        StagiaireJDialog.setTitle("Stagiaires");

        formationName.setText("Nom Formation");

        stagiaireInFormation.setModel(modelStagiaire);
        jScrollPane3.setViewportView(stagiaireInFormation);

        codeFormation.setText("Code Formation");

        javax.swing.GroupLayout StagiaireJDialogLayout = new javax.swing.GroupLayout(StagiaireJDialog.getContentPane());
        StagiaireJDialog.getContentPane().setLayout(StagiaireJDialogLayout);
        StagiaireJDialogLayout.setHorizontalGroup(
            StagiaireJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StagiaireJDialogLayout.createSequentialGroup()
                .addComponent(formationName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codeFormation)
                .addGap(229, 229, 229))
            .addGroup(StagiaireJDialogLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        StagiaireJDialogLayout.setVerticalGroup(
            StagiaireJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StagiaireJDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StagiaireJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formationName)
                    .addComponent(codeFormation))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        formationList.setModel(model
        );
        formationList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formationListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(formationList);

        formationDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("Libellés:");

        jLabel2.setText("Code formation:");

        jLabel3.setText("Date de début:");

        jLabel4.setText("Formateur:");

        jLabel5.setText("Nb d'heures:");

        jLabel6.setText("Description:");

        ATextDescription.setColumns(20);
        ATextDescription.setRows(5);
        jScrollPane2.setViewportView(ATextDescription);

        ButtonUpdate.setText("Update");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/maryvone/gereformation/gui/Icon/edit.png"))); // NOI18N
        jLabel7.setText("Edit");

        Formateurs=PersonnelDAO.findAll();
        for(int i=0;i<Formateurs.size();i++){
            jComboBoxFormateur.addItem(Formateurs.get(i).getNom());
        }

        jLabel8.setText("Lieu:");

        javax.swing.GroupLayout formationDetailsLayout = new javax.swing.GroupLayout(formationDetails);
        formationDetails.setLayout(formationDetailsLayout);
        formationDetailsLayout.setHorizontalGroup(
            formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formationDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formationDetailsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonUpdate))
                    .addGroup(formationDetailsLayout.createSequentialGroup()
                        .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formationDetailsLayout.createSequentialGroup()
                                .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TfieldLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)))
                            .addGroup(formationDetailsLayout.createSequentialGroup()
                                .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formationDetailsLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(formationDetailsLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(TFieldHrs, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61)))
                        .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFieldCode)
                            .addComponent(jComboBoxFormateur, 0, 109, Short.MAX_VALUE)
                            .addComponent(TfieldLieu))
                        .addGap(67, 67, 67)))
                .addContainerGap())
        );
        formationDetailsLayout.setVerticalGroup(
            formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formationDetailsLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TfieldLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(TFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formationDetailsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TFieldHrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(TfieldLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(formationDetailsLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxFormateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(formationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonUpdate)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ButtonStagiaires.setText("Stagiaires");
        ButtonStagiaires.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStagiairesActionPerformed(evt);
            }
        });

        ButtonModules.setText("Modules");
        ButtonModules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModulesActionPerformed(evt);
            }
        });

        ButtonSequences.setText("Sequences");
        ButtonSequences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSequencesActionPerformed(evt);
            }
        });

        ButtonECF.setText("ECF");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonModules)
                    .addComponent(ButtonSequences)
                    .addComponent(ButtonECF)
                    .addComponent(ButtonStagiaires))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonStagiaires)
                .addGap(18, 18, 18)
                .addComponent(ButtonModules)
                .addGap(18, 18, 18)
                .addComponent(ButtonSequences)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonECF)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(formationDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(formationDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonModulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModulesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonModulesActionPerformed

    private void ButtonSequencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSequencesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSequencesActionPerformed

    private void formationListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formationListMouseClicked
       int index = formationList.getSelectedRow();
       Formation form = model.getFormation(index);
       
       TfieldLabel.setText(form.getLibelle());
       date.setDate(form.getDateDebut());
       TFieldHrs.setText(Integer.toString(form.getNbheures()));
       ATextDescription.setText(form.getDescription());
       TFieldCode.setText(Integer.toString(form.getCodeFormation()));
       //jComboBoxFormateur.setSelectedItem(form.getFormateur());
       
       
       TfieldLieu.setText(form.getLieu());
       
        
    }//GEN-LAST:event_formationListMouseClicked

    private void ButtonStagiairesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStagiairesActionPerformed
      int index =formationList.getSelectedRow();
       Formation form = model.getFormation(index);
    try {
        modelStagiaire.setModel(StagiaireDAO.findByFormationId(form.getId()));
    } catch (SQLException ex) {
        Logger.getLogger(FormationList.class.getName()).log(Level.SEVERE, null, ex);
    }
     
      formationName.setText(form.getLibelle());
      codeFormation.setText(Integer.toString(form.getCodeFormation()));
     StagiaireJDialog.pack();
     
    
     StagiaireJDialog.setVisible(true);
     
    }//GEN-LAST:event_ButtonStagiairesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ATextDescription;
    private javax.swing.JButton ButtonECF;
    private javax.swing.JButton ButtonModules;
    private javax.swing.JButton ButtonSequences;
    private javax.swing.JButton ButtonStagiaires;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JDialog StagiaireJDialog;
    private javax.swing.JTextField TFieldCode;
    private javax.swing.JTextField TFieldHrs;
    private javax.swing.JTextField TfieldLabel;
    private javax.swing.JTextField TfieldLieu;
    private javax.swing.JLabel codeFormation;
    private org.jdesktop.swingx.JXDatePicker date;
    private javax.swing.JPanel formationDetails;
    private FormationTableModel model = new FormationTableModel();
    private javax.swing.JTable formationList;
    private javax.swing.JLabel formationName;
    private javax.swing.JComboBox<String> jComboBoxFormateur;
    private ArrayList<Personnel> Formateurs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private StagiaireTableModel modelStagiaire= new StagiaireTableModel();
    private javax.swing.JTable stagiaireInFormation;
    // End of variables declaration//GEN-END:variables
}
