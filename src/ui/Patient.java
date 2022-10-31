/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.DoctorHistory;
import model.PersonHistory;
import ui.AddPerson;
/**
 *
 * @author movvakodandram
 */
public class Patient extends javax.swing.JPanel {

    /**
     * Creates new form Patient
     */
    PersonHistory perhis;
    DoctorHistory dochis;
    
    
    public Patient() {
        initComponents();
        perhis= new PersonHistory();
        dochis= new DoctorHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane7 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        addPerson = new javax.swing.JButton();
        editPerson = new javax.swing.JButton();
        searchDoc = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();

        addPerson.setText("ADD PERSON");
        addPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonActionPerformed(evt);
            }
        });

        editPerson.setText("EDIT PERSON");
        editPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPersonActionPerformed(evt);
            }
        });

        searchDoc.setText("SEARCH");
        searchDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPerson)
                    .addComponent(editPerson))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(searchDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(addPerson)
                .addGap(82, 82, 82)
                .addComponent(editPerson)
                .addGap(78, 78, 78)
                .addComponent(searchDoc)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        splitPane7.setLeftComponent(jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        splitPane7.setRightComponent(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane7)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonActionPerformed
        // TODO add your handling code here:
        AddPerson addperson = new AddPerson(perhis);
        splitPane7.setRightComponent(addperson);
    }//GEN-LAST:event_addPersonActionPerformed

    private void editPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPersonActionPerformed
        // TODO add your handling code here:
        EditPerson editperson = new EditPerson(perhis);
        splitPane7.setRightComponent(editperson);
    }//GEN-LAST:event_editPersonActionPerformed

    private void searchDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDocActionPerformed
        // TODO add your handling code here:
        Search search=new Search(dochis);
        splitPane7.setRightComponent(search);

    }//GEN-LAST:event_searchDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPerson;
    private javax.swing.JButton editPerson;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton searchDoc;
    private javax.swing.JSplitPane splitPane7;
    // End of variables declaration//GEN-END:variables
}
