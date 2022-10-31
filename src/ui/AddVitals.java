/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.PatientData;
import model.PatientHistory;
import model.PersonData;
import model.PersonHistory;

/**
 *
 * @author movvakodandram
 */
public class AddVitals extends javax.swing.JPanel {

    /**
     * Creates new form AddVitals
     */
    
    PatientHistory pathis;
    PersonHistory perHis;
    
    public AddVitals(PatientHistory pathis) {
        initComponents();
        this.pathis=pathis;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblTemp = new javax.swing.JLabel();
        lblBP = new javax.swing.JLabel();
        lblRR = new javax.swing.JLabel();
        lblDiagnosis = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtTemp = new javax.swing.JTextField();
        txtBP = new javax.swing.JTextField();
        txtRR = new javax.swing.JTextField();
        txtDiagnosis = new javax.swing.JTextField();
        submitAddVitals = new javax.swing.JButton();

        lblID.setText("Person ID");

        lblWeight.setText("Weight");

        lblTemp.setText("Temperature");

        lblBP.setText("Blood Pressure");

        lblRR.setText("Respiration Rate");

        lblDiagnosis.setText("Diagnosis");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempActionPerformed(evt);
            }
        });

        txtDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnosisActionPerformed(evt);
            }
        });

        submitAddVitals.setText("SUBMIT");
        submitAddVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitAddVitalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitAddVitals)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDiagnosis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID)
                            .addComponent(txtWeight)
                            .addComponent(txtTemp)
                            .addComponent(txtBP)
                            .addComponent(txtRR)
                            .addComponent(txtDiagnosis, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemp)
                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBP)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRR)
                    .addComponent(txtRR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiagnosis)
                    .addComponent(txtDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitAddVitals)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempActionPerformed

    private void txtDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnosisActionPerformed

    private void submitAddVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitAddVitalsActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().equals("")||txtWeight.getText().equals("")||txtTemp.getText().equals("")||txtBP.getText().equals("")||txtRR.getText().equals("")||
               txtDiagnosis.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Please fill all the information");
            
        }
        else if(validateData()){
            int Id=Integer.parseInt(txtID.getText().trim());
            int weight=Integer.parseInt(txtWeight.getText().trim());
            int temp=Integer.parseInt(txtTemp.getText().trim());
            String bp=txtBP.getText();
            int rr=Integer.parseInt(txtRR.getText().trim());
            String diagnosis=txtDiagnosis.getText();
           
            
            PatientData pd= pathis.addNewData();
            pd.setPatId(Id);
            pd.setWeight(weight);
            pd.setTemperature(temp);
            pd.setbP(bp);
            pd.setrR(rr);
            pd.setDiagnosis(diagnosis);
          
            
            JOptionPane.showMessageDialog(this,"New Patient Vitals Created");
            txtID.setText("");
            txtWeight.setText("");
            txtTemp.setText("");
            txtBP.setText("");
            txtRR.setText("");
            txtDiagnosis.setText("");
         
            
            
        }



    }//GEN-LAST:event_submitAddVitalsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblDiagnosis;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblRR;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JButton submitAddVitals;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtDiagnosis;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtRR;
    private javax.swing.JTextField txtTemp;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

    private boolean validateData() {
        
           if (!txtID.getText().matches("[0-9]+")  ){
            JOptionPane.showMessageDialog(this, "Enter proper ID");
        }
          
        if (!txtWeight.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper weight");
            return false;
        }
        
        if (!txtTemp.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper temperature");
            return false;
        }
        
        if (!txtRR.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper Respiratory rate");
            return false;
        }

        if (txtDiagnosis.getText().length() < 2 || !txtDiagnosis.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Enter proper diagnosis");
            return false;
        }
        
        if (!txtBP.getText().matches("^\\d{1,3}\\/\\d{1,3}$")) {
            JOptionPane.showMessageDialog(this, "Enter proper BP");
            return false;
        }
        
        

        return true;
    }
}
