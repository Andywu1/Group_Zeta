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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
            Object[] row=new Object[8];
            row[0]=vrequest.getRequestId();
            row[1]=vrequest.getSender().getPerson().getName();
            row[2]=vrequest.getToEnterprise()==null?null:vrequest.getToEnterprise().getName();
            row[3]=vrequest.getVolunteer().getCleanerCount();
            row[4]=vrequest.getVolunteer().getServerCount();
            row[5]=vrequest.getStatus();
            row[6]=vrequest;
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(vrequest.getRequestDate());
            row[7]=date;
                      
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
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(192, 233, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        backJButton.setText("<<back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        submitVolunteerJTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        submitVolunteerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Sender", "Charity", "CleanerNum", "ServerNum", "Status", "Results", "Expected Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        submitVolunteerJTable.setRowHeight(30);
        submitVolunteerJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitVolunteerJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(submitVolunteerJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 720, 120));

        submitJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 91, -1));

        charityJComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        charityJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        charityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charityJComboBoxActionPerformed(evt);
            }
        });
        add(charityJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 180, 30));

        cleanerJTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(cleanerJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 180, 30));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Cleaner");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 91, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Server");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 91, 26));

        serverJTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        serverJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverJTextFieldActionPerformed(evt);
            }
        });
        add(serverJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 180, 30));

        updateJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });
        add(updateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));

        deleteJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });
        add(deleteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Charity Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Expected Date");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 180, 30));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\NEU_Study\\INFO 5100 Spring\\Final_Project_Zeta\\Zeta_Images\\volunteer_2.jpg")); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));
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
        
        
        if(cleaner== null ||cleaner.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input the Cleaner Number!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if(server== null ||server.trim().isEmpty()){
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
       
        if(c>=10000||s>=10000){
            JOptionPane.showMessageDialog(null, "Volunteer number can't exceed 10000!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(c==0 && s==0){
            JOptionPane.showMessageDialog(null, "Cleaner Number and Server Number can't be 0 at the same time!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Date currentDate= new Date();

        if(jDateChooser1.getDate()== null ||jDateChooser1.toString().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input the Expected Date!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(jDateChooser1.getDate().compareTo(currentDate)<0){
            JOptionPane.showMessageDialog(null, "Please don't input the expected date before today", "Error", JOptionPane.ERROR_MESSAGE);
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

        volunteerWorkRequest.setRequestDate(jDateChooser1.getDate());
        volunteerWorkRequest.setSender(useraccount);
        volunteerWorkRequest.setStatus("Send");
        volunteerWorkRequest.setFromEnterprise(hospital);
        
        useraccount.getWorkQueue().getWorkRequestList().add(volunteerWorkRequest);
        hospital.getWorkQueue().getWorkRequestList().add(volunteerWorkRequest);
        
        serverJTextField.setText("");
        cleanerJTextField.setText("");  
        jDateChooser1.setCalendar(null);
        
        populateTable();
         JOptionPane.showMessageDialog(null, "This request is submitted successfully!"); 
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
        
        if(selectedRow<0){
           JOptionPane.showMessageDialog(null, "Please select a Row!!"); 
           cleanerJTextField.setText("");
           serverJTextField.setText(""); 
           return;
        } 

        Integer vw = (Integer) submitVolunteerJTable.getValueAt(selectedRow, 0);    
        
        String cleaner =  cleanerJTextField.getText();
        String server = serverJTextField.getText(); 
            
        if(cleaner==null||cleaner.trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please input the Cleaner Number!", "CREATE", JOptionPane.ERROR_MESSAGE);
        return;
        }
       
        if(server==null||server.trim().isEmpty()){
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
        
        if(c>=10000||s>=10000){
            JOptionPane.showMessageDialog(null, "Volunteer number can't exceed 10000!", "CREATE", JOptionPane.ERROR_MESSAGE);
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
           
        if(!vrequest.getStatus().equals("Send")){
            JOptionPane.showMessageDialog(null, "This request is processing or completed,you cannot modify it!", "CREATE", JOptionPane.ERROR_MESSAGE);
            cleanerJTextField.setText("");
            serverJTextField.setText("");
            jDateChooser1.setCalendar(null);
            return;       
         }
            
          if(vrequest!=null){
                vrequest.getVolunteer().setCleanerCount(Integer.parseInt(cleaner));
                vrequest.getVolunteer().setServerCount(Integer.parseInt(server));   
            }
        
         Date currentDate= new Date();
       
        if(jDateChooser1.getDate()== null ||jDateChooser1.toString().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input the Expected Date!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(jDateChooser1.getDate().compareTo(currentDate)<0){
            JOptionPane.showMessageDialog(null, "Please don't input the expected date before today", "Error", JOptionPane.ERROR_MESSAGE);
            //dateJTextField.setText("");
            return;
        }
        
        vrequest.setRequestDate(jDateChooser1.getDate());

        
            populateTable();  
            JOptionPane.showMessageDialog(null, "Updated Successfully!"); 
            cleanerJTextField.setText("");
            serverJTextField.setText("");
            jDateChooser1.setCalendar(null);
        
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void submitVolunteerJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitVolunteerJTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = submitVolunteerJTable.getSelectedRow();
         if(selectedRow >= 0){
              VolunteerWorkRequest vw = (VolunteerWorkRequest) submitVolunteerJTable.getValueAt(selectedRow, 6);
              
              cleanerJTextField.setText(vw.getVolunteer().getCleanerCount()+"");
              serverJTextField.setText(vw.getVolunteer().getServerCount()+"");
              jDateChooser1.setDate(vw.getRequestDate());
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

            if(!vrequest.getStatus().equals("Send")){
                JOptionPane.showMessageDialog(null, "This request is processing or completed,you cannot delete it!", "CREATE", JOptionPane.ERROR_MESSAGE);
                cleanerJTextField.setText("");
                serverJTextField.setText("");
                jDateChooser1.setCalendar(null);
                return;       
             }
            System.out.println("Delete at " + vrequest.getToEnterprise().getName());
            
            vrequest.getToEnterprise().getWorkQueue().getWorkRequestList().remove(vrequest);
            useraccount.getWorkQueue().getWorkRequestList().remove(vrequest);
            System.out.println("Delete at " + useraccount.getUsername());
            
            hospital.getWorkQueue().getWorkRequestList().remove(vrequest);
           System.out.println("Delete at " + hospital.getName());
            
           // 
            populateTable(); 
            cleanerJTextField.setText("");
            serverJTextField.setText("");
            jDateChooser1.setCalendar(null);
            JOptionPane.showMessageDialog(null, "Delete Successfully!");   
            }   
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");  
            cleanerJTextField.setText("");
            serverJTextField.setText("");
            jDateChooser1.setCalendar(null);
            
            
        }
        
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void charityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charityJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_charityJComboBoxActionPerformed

    private void serverJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> charityJComboBox;
    private javax.swing.JTextField cleanerJTextField;
    private javax.swing.JButton deleteJButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField serverJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTable submitVolunteerJTable;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}
