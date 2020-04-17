/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Hospital;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalWorkRequest;
//import Business.WorkQueue.HospitalWorkRequest;
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
public class SubmitVolunteerJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount useraccount;
    private HospitalEnterprise hospital;
    
    private Network network;
    /**
     * Creates new form SubmitVolunteerPanel
     */
    public SubmitVolunteerJPanel(JPanel userProcessContainer, UserAccount useraccount,HospitalEnterprise hospital,Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.useraccount=useraccount;
        this.hospital=hospital;
        this.network=network;
        
        populateTable();
        populateEnterpriseJComboBox();
    }
    
    public void populateEnterpriseJComboBox(){
        charityJComboBox.removeAllItems();
        for(Enterprise charity:network.getEnterpriseDirectory().getEnterpriseList()){
            if(charity.getEnterpriseType().toString().equals("Charity")){
                charityJComboBox.addItem(charity.toString());
            }
        }
        
    }
   
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)submitVolunteerJTable.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request:useraccount.getWorkQueue().getWorkRequestList()){
            if (request.getClass().getName().contains("HospitalWorkRequest")) {
                continue;
            }
            VolunteerWorkRequest vrequest=(VolunteerWorkRequest)request;
            Object[] row=new Object[7];
            row[0]=vrequest.getRequestId();
            row[1]=vrequest.getSender().getPerson().getName();
            row[2]=vrequest.getToEnterprise()==null?null:vrequest.getToEnterprise().getName();
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
        submitJButton = new javax.swing.JButton();
        charityJComboBox = new javax.swing.JComboBox<>();
        cleanerJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        serverJTextField = new javax.swing.JTextField();
        updateJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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
                "Id", "Sender", "Charity", "CleanerNum", "ServerNum", "Status", "Results"
            }
        ));
        submitVolunteerJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitVolunteerJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(submitVolunteerJTable);

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        charityJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        charityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charityJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Cleaner");

        jLabel2.setText("Server");

        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });

        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Charity Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cleanerJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serverJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(charityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(updateJButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteJButton)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(backJButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(charityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleanerJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(serverJTextField)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton)
                    .addComponent(updateJButton)
                    .addComponent(deleteJButton))
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        String cleaner= String.valueOf(cleanerJTextField.getText());
        String server=String.valueOf(serverJTextField.getText());
        
        VolunteerWorkRequest volunteerWorkRequest=new VolunteerWorkRequest();
        
        if(volunteerWorkRequest.getSender()!=null){
            JOptionPane.showMessageDialog(this, "You can't submit twice!", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        if(cleaner==null||cleaner.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input the Cleaner Number!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        
        if(server==null||server.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input the Server Number!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Integer c;
        try {
            c= Integer.parseInt(cleaner);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number format! ");
            return;
        }
        
        Integer s;
        try {
            s= Integer.parseInt(server);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number format! ");
            return;
        }
        
        if(c<0 || s<0){
            JOptionPane.showMessageDialog(null, "Please don't input the Cleaner Number or Server Number less than 0!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(c==0 && s==0){
            JOptionPane.showMessageDialog(null, "Cleaner Number and Server Number can't be 0 at the same time!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        volunteerWorkRequest.getVolunteer().setCleanerCount(Integer.parseInt(cleaner));
        volunteerWorkRequest.getVolunteer().setServerCount(Integer.parseInt(server));;
        
         Enterprise toEnterprise=null;
        
        for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
            if(charityJComboBox.getSelectedItem().toString().equals(enterprise.toString())){
                toEnterprise=enterprise;
                volunteerWorkRequest.setToEnterprise(toEnterprise);
                toEnterprise.getWorkQueue().getWorkRequestList().add(volunteerWorkRequest);
                
            }
        }
        //volunteerWorkRequest.setStatus("Send");
        volunteerWorkRequest.setSender(useraccount);
        volunteerWorkRequest.setStatus("Send");
        volunteerWorkRequest.setFromEnterprise(hospital);
        
        useraccount.getWorkQueue().getWorkRequestList().add(volunteerWorkRequest);
        hospital.getWorkQueue().getWorkRequestList().add(volunteerWorkRequest);
        
        serverJTextField.setText("");
        cleanerJTextField.setText("");
        populateTable();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = submitVolunteerJTable.getSelectedRow();
        Integer vw = (Integer) submitVolunteerJTable.getValueAt(selectedRow, 0);


        if(selectedRow<0){
           JOptionPane.showMessageDialog(null, "Please select a Row!!"); 
           cleanerJTextField.setText("");
           serverJTextField.setText(""); 
           return;
        } 
             
        String cleaner =  cleanerJTextField.getText();
        String server = serverJTextField.getText(); 
            
        if(cleaner==null||cleaner.isEmpty()){
        JOptionPane.showMessageDialog(null, "Please input the Cleaner Number!", "CREATE", JOptionPane.ERROR_MESSAGE);
        return;
        }
       
        if(server==null||server.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input the Server Number!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Integer c;
        try {
            c= Integer.parseInt(cleanerJTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number format! ");
            return;
        }
        
        Integer s;
        try {
            s= Integer.parseInt(serverJTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number format! ");
            return;
        }
        
        if(c<0 || s<0){
            JOptionPane.showMessageDialog(null, "Please don't input the Cleaner Number or Server Number less than 0!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(c==0 && s==0){
            JOptionPane.showMessageDialog(null, "Cleaner Number and Server Number can't be 0 at the same time!", "CREATE", JOptionPane.ERROR_MESSAGE);
            cleanerJTextField.setText("");
            serverJTextField.setText("");
            return;
        }    
              
        VolunteerWorkRequest vrequest=null;
        
         for(WorkRequest request:useraccount.getWorkQueue().getWorkRequestList()){
             
            if(request.getClass().getName().contains("HospitalWorkRequest")){
                continue;
            }
             if(request==null){
         }
             VolunteerWorkRequest newrequest=(VolunteerWorkRequest)request;
             if(vw.equals(newrequest.getRequestId())){
                 vrequest=newrequest;
                 break;
             }
         } 
         
//      
//         
         System.out.println(vrequest.getVolunteer().getCleanerCount());
           
          if(vrequest!=null){
                vrequest.getVolunteer().setCleanerCount(Integer.parseInt(cleaner));
                vrequest.getVolunteer().setServerCount(Integer.parseInt(server));   
            }
            
            populateTable();  
            JOptionPane.showMessageDialog(null, "Updated Successfully!"); 
            cleanerJTextField.setText("");
            serverJTextField.setText("");        
        
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void submitVolunteerJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitVolunteerJTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = submitVolunteerJTable.getSelectedRow();
         if(selectedRow >= 0){
              VolunteerWorkRequest vw = (VolunteerWorkRequest) submitVolunteerJTable.getValueAt(selectedRow, 6);
              
              cleanerJTextField.setText(vw.getVolunteer().getCleanerCount()+"");
              serverJTextField.setText(vw.getVolunteer().getServerCount()+"");
          }   
    }//GEN-LAST:event_submitVolunteerJTableMouseClicked

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = submitVolunteerJTable.getSelectedRow();
        if(selectedRow >= 0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Warning", selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
            
            Integer vw = (Integer) submitVolunteerJTable.getValueAt(selectedRow, 0);
           // hospital.getWorkQueue().getWorkRequestList().remove(vw);
            //vw.getVolunteerDirectory()
            VolunteerWorkRequest vrequest=null;
            for(WorkRequest request:useraccount.getWorkQueue().getWorkRequestList()){
                if(request.getClass().getName().contains("HospitalWorkRequest")){
                    continue;
                }
                VolunteerWorkRequest newrequest=(VolunteerWorkRequest)request;
                if(vw.equals(newrequest.getRequestId())){
                    vrequest=newrequest;
                    break;
                }
            }
            
            vrequest.getToEnterprise().getWorkQueue().getWorkRequestList().remove(vrequest);
            useraccount.getWorkQueue().getWorkRequestList().remove(vrequest);
            hospital.getWorkQueue().getWorkRequestList().remove(vrequest);
           
           // 
            populateTable(); 
            cleanerJTextField.setText("");
            serverJTextField.setText("");
            JOptionPane.showMessageDialog(null, "Delete Successfully!");   
            }   
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");  
            cleanerJTextField.setText("");
            serverJTextField.setText("");   
        }
        
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void charityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charityJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_charityJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> charityJComboBox;
    private javax.swing.JTextField cleanerJTextField;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField serverJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTable submitVolunteerJTable;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}
