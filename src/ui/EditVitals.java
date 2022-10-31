/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PatientData;
import model.PatientHistory;
import model.PersonData;

/**
 *
 * @author movvakodandram
 */
public class EditVitals extends javax.swing.JPanel {

    /**
     * Creates new form EditVitals
     */
    PatientHistory pathis;
    PatientData pd;
    
    public EditVitals(PatientHistory pathis) {
        initComponents();
        this.pathis=pathis;
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        vitalsTable = new javax.swing.JTable();
        lblDiagnosisEdit = new javax.swing.JLabel();
        txtIDEdit = new javax.swing.JTextField();
        txtWeightEdit = new javax.swing.JTextField();
        txtTempEdit = new javax.swing.JTextField();
        txtBPEdit = new javax.swing.JTextField();
        lblIDEdit = new javax.swing.JLabel();
        txtRREdit = new javax.swing.JTextField();
        lblWeightEdit = new javax.swing.JLabel();
        txtDiagnosisEdit = new javax.swing.JTextField();
        lblTempEdit = new javax.swing.JLabel();
        lblBPEdit = new javax.swing.JLabel();
        lblRREdit = new javax.swing.JLabel();
        submitUpdateVitals = new javax.swing.JButton();
        submitDeleteVitals = new javax.swing.JButton();
        submitVIewVitals = new javax.swing.JButton();

        vitalsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Vitals Object", "Person ID", "Weight", "Temperature", "Blood Pressure", "Respiratory Rate", "Diagnosis"
            }
        ));
        jScrollPane1.setViewportView(vitalsTable);

        lblDiagnosisEdit.setText("Diagnosis");

        txtIDEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDEditActionPerformed(evt);
            }
        });

        txtTempEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempEditActionPerformed(evt);
            }
        });

        lblIDEdit.setText("Person ID");

        lblWeightEdit.setText("Weight");

        txtDiagnosisEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnosisEditActionPerformed(evt);
            }
        });

        lblTempEdit.setText("Temperature");

        lblBPEdit.setText("Blood Pressure");

        lblRREdit.setText("Respiration Rate");

        submitUpdateVitals.setText("UPDATE");
        submitUpdateVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitUpdateVitalsActionPerformed(evt);
            }
        });

        submitDeleteVitals.setText("DELETE");
        submitDeleteVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitDeleteVitalsActionPerformed(evt);
            }
        });

        submitVIewVitals.setText("VIEW");
        submitVIewVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitVIewVitalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRREdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDiagnosisEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIDEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWeightEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTempEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBPEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDEdit)
                            .addComponent(txtWeightEdit)
                            .addComponent(txtTempEdit)
                            .addComponent(txtBPEdit)
                            .addComponent(txtRREdit)
                            .addComponent(txtDiagnosisEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(submitVIewVitals)
                        .addGap(18, 18, 18)
                        .addComponent(submitUpdateVitals)
                        .addGap(18, 18, 18)
                        .addComponent(submitDeleteVitals)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDEdit)
                    .addComponent(txtIDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeightEdit)
                    .addComponent(txtWeightEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempEdit)
                    .addComponent(txtTempEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBPEdit)
                    .addComponent(txtBPEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRREdit)
                    .addComponent(txtRREdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiagnosisEdit)
                    .addComponent(txtDiagnosisEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitVIewVitals)
                    .addComponent(submitDeleteVitals)
                    .addComponent(submitUpdateVitals))
                .addGap(0, 23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDEditActionPerformed

    private void txtTempEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempEditActionPerformed

    private void txtDiagnosisEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnosisEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnosisEditActionPerformed

    private void submitDeleteVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitDeleteVitalsActionPerformed
        // TODO add your handling code here:
        
         int selectedRowIndex=vitalsTable.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        
                DefaultTableModel model= (DefaultTableModel) vitalsTable.getModel();
                PatientData selectedPerson=(PatientData) model.getValueAt(selectedRowIndex,0 );
                pathis.deleteData(selectedPerson);
                
                JOptionPane.showMessageDialog(this, "Vitals Data deleted");
                
                populateTable();






    }//GEN-LAST:event_submitDeleteVitalsActionPerformed

    private void submitVIewVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitVIewVitalsActionPerformed
        // TODO add your handling code here:
               int selectedRowIndex=vitalsTable.getSelectedRow();
               if(selectedRowIndex<0){
               JOptionPane.showMessageDialog(this, "Please select a row to view");
               return;
        }
        
                DefaultTableModel model= (DefaultTableModel) vitalsTable.getModel();
                PatientData selectedPerson=(PatientData) model.getValueAt(selectedRowIndex,0 );
                txtIDEdit.setText(String.valueOf(selectedPerson.getPatId()));
                txtWeightEdit.setText(String.valueOf(selectedPerson.getWeight()));
                txtTempEdit.setText(String.valueOf(selectedPerson.getTemperature()));
                txtBPEdit.setText(String.valueOf(selectedPerson.getbP()));
                txtRREdit.setText(String.valueOf(selectedPerson.getrR()));
                txtDiagnosisEdit.setText(String.valueOf(selectedPerson.getDiagnosis()));

    }//GEN-LAST:event_submitVIewVitalsActionPerformed

    private void submitUpdateVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitUpdateVitalsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex= vitalsTable.getSelectedRow();
              if(selectedRowIndex<0){
                   JOptionPane.showMessageDialog(this, "Please select view/modify  for the row you want to update");
                      return;
                         }
              
               DefaultTableModel model= (DefaultTableModel) vitalsTable.getModel();
               PatientData pd=(PatientData) model.getValueAt(selectedRowIndex, 0);
        
            for(PatientData i: pathis.getPatienthistory()){
              if(i.getPatId()==pd.getPatId()){

            i.setPatId(Integer.parseInt(txtIDEdit.getText()));
            i.setWeight(Integer.parseInt(txtWeightEdit.getText()));
            i.setTemperature(Integer.parseInt(txtTempEdit.getText()));
            i.setbP(txtBPEdit.getText());
            i.setrR(Integer.parseInt(txtRREdit.getText()));
            i.setDiagnosis(txtDiagnosisEdit.getText());
           
            
            populateTable();


            }



            }
    }//GEN-LAST:event_submitUpdateVitalsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBPEdit;
    private javax.swing.JLabel lblDiagnosisEdit;
    private javax.swing.JLabel lblIDEdit;
    private javax.swing.JLabel lblRREdit;
    private javax.swing.JLabel lblTempEdit;
    private javax.swing.JLabel lblWeightEdit;
    private javax.swing.JButton submitDeleteVitals;
    private javax.swing.JButton submitUpdateVitals;
    private javax.swing.JButton submitVIewVitals;
    private javax.swing.JTextField txtBPEdit;
    private javax.swing.JTextField txtDiagnosisEdit;
    private javax.swing.JTextField txtIDEdit;
    private javax.swing.JTextField txtRREdit;
    private javax.swing.JTextField txtTempEdit;
    private javax.swing.JTextField txtWeightEdit;
    private javax.swing.JTable vitalsTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
                
        DefaultTableModel model= (DefaultTableModel) vitalsTable.getModel();
        
        model.setRowCount(0);
        for (PatientData pd : pathis.getPatienthistory()){
            Object[] row= new Object[7];
            row[0]=pd;
            row[1]=pd.getPatId();
            row[2]=pd.getWeight();
            row[3]=pd.getTemperature();
            row[4]=pd.getbP();
            row[5]=pd.getrR();
            row[6]=pd.getDiagnosis();
            
            model.addRow(row);
            
        }
        
    }
}
