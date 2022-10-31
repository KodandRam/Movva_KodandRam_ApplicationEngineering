/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HospitalData;
import model.HospitalHistory;

/**
 *
 * @author movvakodandram
 */
public class EditHospital extends javax.swing.JPanel {

    /**
     * Creates new form EditHospital
     */
    HospitalHistory hosHis;
    public EditHospital(HospitalHistory hosHis) {
        initComponents();
        this.hosHis=hosHis;
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

        txtHosName1 = new javax.swing.JTextField();
        submitUpdateHos = new javax.swing.JButton();
        submitDeleteHos = new javax.swing.JButton();
        submitVIewHos = new javax.swing.JButton();
        lblHosName1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hosTable = new javax.swing.JTable();
        txtCommZipHsptl1 = new javax.swing.JTextField();
        lblCommNameHsptl1 = new javax.swing.JLabel();
        lblCommZipHsptl1 = new javax.swing.JLabel();
        txtCommNameHsptl1 = new javax.swing.JTextField();

        txtHosName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHosName1ActionPerformed(evt);
            }
        });

        submitUpdateHos.setText("UPDATE");
        submitUpdateHos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitUpdateHosActionPerformed(evt);
            }
        });

        submitDeleteHos.setText("DELETE");
        submitDeleteHos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitDeleteHosActionPerformed(evt);
            }
        });

        submitVIewHos.setText("VIEW");
        submitVIewHos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitVIewHosActionPerformed(evt);
            }
        });

        lblHosName1.setText("Hospital Name");

        hosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital Object", "Hospital Name", "Community Name", "ZipCode"
            }
        ));
        jScrollPane1.setViewportView(hosTable);

        txtCommZipHsptl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommZipHsptl1ActionPerformed(evt);
            }
        });

        lblCommNameHsptl1.setText("Community Name");

        lblCommZipHsptl1.setText("Zip Code");

        txtCommNameHsptl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommNameHsptl1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submitVIewHos)
                                .addGap(18, 18, 18)
                                .addComponent(submitUpdateHos)
                                .addGap(18, 18, 18)
                                .addComponent(submitDeleteHos))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCommZipHsptl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCommNameHsptl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHosName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHosName1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCommNameHsptl1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(txtCommZipHsptl1))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHosName1)
                    .addComponent(txtHosName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommNameHsptl1)
                    .addComponent(txtCommNameHsptl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommZipHsptl1)
                    .addComponent(txtCommZipHsptl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitVIewHos)
                    .addComponent(submitDeleteHos)
                    .addComponent(submitUpdateHos))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHosName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHosName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHosName1ActionPerformed

    private void submitDeleteHosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitDeleteHosActionPerformed
        // TODO add your handling code here:
            int selectedRowIndex=hosTable.getSelectedRow();
            if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        
                DefaultTableModel model= (DefaultTableModel) hosTable.getModel();
                HospitalData selectedPerson=(HospitalData) model.getValueAt(selectedRowIndex,0 );
                hosHis.deleteData(selectedPerson);
                
                JOptionPane.showMessageDialog(this, "Hospital Data deleted");
                
                populateTable();


    }//GEN-LAST:event_submitDeleteHosActionPerformed

    private void txtCommZipHsptl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommZipHsptl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommZipHsptl1ActionPerformed

    private void txtCommNameHsptl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommNameHsptl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommNameHsptl1ActionPerformed

    private void submitVIewHosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitVIewHosActionPerformed
        // TODO add your handling code here:
               int selectedRowIndex=hosTable.getSelectedRow();
               if(selectedRowIndex<0){
               JOptionPane.showMessageDialog(this, "Please select a row to view");
               return;
        }
        
                DefaultTableModel model= (DefaultTableModel) hosTable.getModel();
                HospitalData selectedPerson=(HospitalData) model.getValueAt(selectedRowIndex,0 );
                txtHosName1.setText(String.valueOf(selectedPerson.getHosName()));
                txtCommNameHsptl1.setText(String.valueOf(selectedPerson.getCommName()));
                txtCommZipHsptl1.setText(String.valueOf(selectedPerson.getZip()));
    }//GEN-LAST:event_submitVIewHosActionPerformed

    private void submitUpdateHosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitUpdateHosActionPerformed
        // TODO add your handling code here:
              int selectedRowIndex= hosTable.getSelectedRow();
              if(selectedRowIndex<0){
                   JOptionPane.showMessageDialog(this, "Please select view/modify  for the row you want to update");
                      return;
                         }
              
               DefaultTableModel model= (DefaultTableModel) hosTable.getModel();
               HospitalData hd=(HospitalData) model.getValueAt(selectedRowIndex, 0);
        
            for(HospitalData i: hosHis.getHospitalhistory()){
              if(i.getHosName()==hd.getHosName()){
                i.setHosName(txtHosName1.getText());
                i.setCommName(txtCommNameHsptl1.getText());
                i.setZip(txtCommZipHsptl1.getText());
        
            populateTable();

            }

            }


    }//GEN-LAST:event_submitUpdateHosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable hosTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommNameHsptl1;
    private javax.swing.JLabel lblCommZipHsptl1;
    private javax.swing.JLabel lblHosName1;
    private javax.swing.JButton submitDeleteHos;
    private javax.swing.JButton submitUpdateHos;
    private javax.swing.JButton submitVIewHos;
    private javax.swing.JTextField txtCommNameHsptl1;
    private javax.swing.JTextField txtCommZipHsptl1;
    private javax.swing.JTextField txtHosName1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
         DefaultTableModel model= (DefaultTableModel) hosTable.getModel();
        
        model.setRowCount(0);
        for (HospitalData hd : hosHis.getHospitalhistory()){
            Object[] row= new Object[4];
            row[0]=hd;
            row[1]=hd.getHosName();
            row[2]=hd.getCommName();
            row[3]=hd.getZip();
            
            
            model.addRow(row);
            
        }
        
        
    }
}
