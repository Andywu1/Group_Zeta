/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Charity;

import Business.Enterprise.CharityEnterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Volunteer;
import Business.WorkQueue.VolunteerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kathe
 */
public class AssignVolunteerJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount useraccount;
    private CharityEnterprise charity;
    /**
     * Creates new form ProcessVolunteerJPanel
     */
    public AssignVolunteerJPanel(JPanel userProcessContainer,UserAccount useraccount,CharityEnterprise charity) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.useraccount=useraccount;
        this.charity=charity;
        
        populateTable();
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)submitVolunteerJTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request:charity.getWorkQueue().getWorkRequestList()){
            if(request.getClass().getName().contains("HospitalWorkRequest")){
                continue;
            }
            if(request.getClass().getName().contains("DonorWorkRequest")){
                continue;
            }
            VolunteerWorkRequest vrequest=(VolunteerWorkRequest)request;
            Object[]row=new Object[7];
            row[0]=vrequest.getRequestId();
            row[1]=vrequest.getFromEnterprise();
            row[2]=vrequest.getReceiver()==null?null:vrequest.getReceiver().getPerson().getName();
            
            row[3]=vrequest.getVolunteer().getCleanerCount();
            row[4]=vrequest.getVolunteer().getServerCount();
            row[5]=vrequest.getStatus();
            row[6]=vrequest;
                 
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        submitVolunteerJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();

        backJButton.setText("<<back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitVolunteerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Hospital", "Worker", "CleanerNum", "ServerNum", "Status", "Results"
            }
        ));
        jScrollPane1.setViewportView(submitVolunteerJTable);

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processJButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backJButton)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(backJButton)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(processJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(assignJButton)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow =submitVolunteerJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least a row.", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }

        VolunteerWorkRequest volunteerWorkRequest=(VolunteerWorkRequest)submitVolunteerJTable.getValueAt(selectedRow, 6);

        if(volunteerWorkRequest.getReceiver()!=null){
            JOptionPane.showMessageDialog(this, "You can't assign twice!", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }

        volunteerWorkRequest.setReceiver(useraccount);
        volunteerWorkRequest.setStatus("Charity Begin");

        useraccount.getWorkQueue().getWorkRequestList().add(volunteerWorkRequest);
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = submitVolunteerJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select at least a row.", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        VolunteerWorkRequest volunteerWorkRequest=(VolunteerWorkRequest)submitVolunteerJTable.getValueAt(selectedRow, 6);
        
        if(volunteerWorkRequest.getReceiver()==null){
            JOptionPane.showMessageDialog(this, "You haven't assigned worker!", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(volunteerWorkRequest.getResult()!=null){
            JOptionPane.showMessageDialog(this, "You can't submit result twice!", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        volunteerWorkRequest.setStatus("Process");
        ProcessVolunteerJPanel processVolunteerJPanel=new ProcessVolunteerJPanel(userProcessContainer,volunteerWorkRequest);
        userProcessContainer.add("ProcessVolunteerJPanel",processVolunteerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        populateTable();
    }//GEN-LAST:event_processJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable submitVolunteerJTable;
    // End of variables declaration//GEN-END:variables
}
