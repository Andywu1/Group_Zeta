/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SysAdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Ecosystem.EcoSystem;
import javax.swing.table.DefaultTableModel;
import Business.People.Person;
import Business.Role.EnterpriseAdminHospitalRole;
import javax.swing.JOptionPane;
import Business.Role.CharityAdministratorRole;
import Business.Role.EnterpriseAdminCharityRole;
import Business.Role.EnterpriseAdminDonorRole;
import Business.Role.HospitalAdministratorRole;
import Business.Role.SysAdminRole;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
/**
 *
 * @author yangj
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
        populateTable();
        populateNetworkComboBox();
        showpassword.setVisible(false); 
    }
    
     private void populateTable() {
      DefaultTableModel model = (DefaultTableModel) enterpriseAdminJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()){
                    Object[] row = new Object[3];
                    row[0] = enterprise;
                    row[1] = network.getName();
                    row[2] = userAccount;

                    model.addRow(row);
                }
            }
        }
     }
     
    //Network ComboBox
    private void populateNetworkComboBox() {
        networkComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkComboBox.addItem(network);
        }
     }

    private void populateEnterpriseComboBox(Network network){
        enterpriseComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseComboBox.addItem(enterprise);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseAdminJTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        networkComboBox = new javax.swing.JComboBox();
        enterpriseComboBox = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        showPasswordCheckBox = new javax.swing.JCheckBox();
        createJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        showpassword = new javax.swing.JLabel();
        UpdateJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(192, 233, 255));
        setMinimumSize(new java.awt.Dimension(800, 671));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseAdminJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ));
        enterpriseAdminJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterpriseAdminJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(enterpriseAdminJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 42, 375, 103));

        jLabel6.setText("Manage Enterprise Admin");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 11, -1, -1));

        jLabel1.setText("Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 185, -1, -1));

        jLabel2.setText("Enterprise");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 228, -1, -1));

        networkComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 182, 170, -1));

        enterpriseComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 228, 170, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enterprise Admin Information"));

        jLabel3.setText("Name");

        jLabel4.setText("Username");

        jLabel5.setText("Password");

        showPasswordCheckBox.setText("show password");
        showPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(showPasswordCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(showPasswordCheckBox)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 370, 300));

        createJButton.setText("Create");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });
        add(createJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });
        add(deleteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, -1, -1));
        add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 40, 40));

        UpdateJButton.setText("Update");
        UpdateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateJButtonActionPerformed(evt);
            }
        });
        add(UpdateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseAdminJTable.getSelectedRow();
       
        if(selectedRow >= 0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Warning", selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
               // Enterprise enterprise = (Enterprise)enterpriseAdminJTable.getValueAt(selectedRow, 0);
                UserAccount useraccount= (UserAccount)enterpriseAdminJTable.getValueAt(selectedRow, 2);
                
                
                for(Network network :system.getNetworkList())
                {
                    for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                        for(UserAccount u :enterprise.getUserAccountDirectory().getUserAccountList()){
                            if(u.getUsername().equals(useraccount.getUsername())){
                            enterprise.getUserAccountDirectory().getUserAccountList().remove(useraccount);
                            break;
                            }      
                        }     
                    }                        
                }
            populateTable();
            setTextFiledNull("");
            JOptionPane.showMessageDialog(null, "Delete Successfully!");
            
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkComboBox.getSelectedItem();
        
        Enterprise enterprise = null;
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
            if (enterpriseComboBox.getSelectedItem().toString().equals(e.toString())) {
                enterprise = e;
                break;
            }
        }

        String name = nameTextField.getText();
        String username = usernameTextField.getText();
        String password = String.valueOf(passwordField.getPassword());
        
        if(name.equals("")||name==null){
            JOptionPane.showMessageDialog(null, "Name can't be empty!");
            return;
        }
        if(username.equals("")||username==null){
            JOptionPane.showMessageDialog(null, "Username can't be empty!");
            return;
        }
        if(password.equals("")||password==null){
            JOptionPane.showMessageDialog(null, "Password can't be empty!");
            return;
        }
         if(!passwordPatternCorrect()){
            JOptionPane.showMessageDialog(null, "Password must follow the format");
            return;
        }
        
        for (Network net : system.getNetworkList()) {
           for (Enterprise newEnterprise : net.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : newEnterprise.getUserAccountDirectory().getUserAccountList()) {
                    if(userAccount.getUsername().equals(username)){
                        JOptionPane.showMessageDialog(null, "This username is already registered!");
                        return;
                    }
                }
            }
        }
        
       
                    
        Person person = enterprise.getPersonDirectory().createPerson(name);
        
        if(enterprise.getEnterpriseType().toString().equals("Hospital"))
        {
            //HopsitalAdminRole
           enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new EnterpriseAdminHospitalRole()); 
        }else{
            //CharityAdminRole
            if(enterprise.getEnterpriseType().toString().equals("Charity")){
                enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new EnterpriseAdminCharityRole()); 
            }else
            {if(enterprise.getEnterpriseType().toString().equals("Donor")){
                    enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new EnterpriseAdminDonorRole()); //AdminRole
                }       
            }
        }

        
        JOptionPane.showMessageDialog(null, "Enterprise Admin was created successfully!");
        populateTable();
        
        setTextFiledNull("");
        showPasswordCheckBox.setSelected(false);
    }//GEN-LAST:event_createJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void enterpriseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseComboBoxActionPerformed

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed
        // TODO add your handling code here:enterpriseComboBox.getSelectedItem().toString()
        Network network = (Network) networkComboBox.getSelectedItem();
        if(network==null){
            return;
        }
      
        populateEnterpriseComboBox(network);  
    }//GEN-LAST:event_networkComboBoxActionPerformed

    private void enterpriseAdminJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterpriseAdminJTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = enterpriseAdminJTable.getSelectedRow();
        if(selectedRow >= 0){
            UserAccount ua = (UserAccount) enterpriseAdminJTable.getValueAt(selectedRow,2);
            nameTextField.setText(ua.getPerson().getName());
            usernameTextField.setText(ua.getUsername());
            passwordField.setText(ua.getPassword());
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        
    }//GEN-LAST:event_enterpriseAdminJTableMouseClicked

    private boolean passwordPatternCorrect(){
        Pattern p = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = p.matcher(passwordField.getText());
        boolean b = m.matches();
        
        return b;
    }    

    private void UpdateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateJButtonActionPerformed
        // TODO add your handling code here:
       
        String name = nameTextField.getText();
        String username = usernameTextField.getText();
        String password = String.valueOf(passwordField);
         
        if(name.equals("")||username.equals("")||password.equals("")){
        JOptionPane.showMessageDialog(null, "The data cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        int selectedRow = enterpriseAdminJTable.getSelectedRow();
        UserAccount userAccount = (UserAccount) enterpriseAdminJTable.getValueAt(selectedRow, 2);
        Enterprise enterprise = (Enterprise) enterpriseAdminJTable.getValueAt(selectedRow, 0);
          
        if (selectedRow >= 0) {
            
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is empty,please input", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            
            
            if (username.equals("")) {
                JOptionPane.showMessageDialog(null, "UserName is empty,please input", "Warning", JOptionPane.WARNING_MESSAGE);
                showPasswordCheckBox.setSelected(false);
                return;
            }
            
           
            if (password.equals("")) {
                JOptionPane.showMessageDialog(null, "Password is empty,please input", "Warning", JOptionPane.WARNING_MESSAGE);
                showPasswordCheckBox.setSelected(false);
                return;
            }
            
            if(!passwordPatternCorrect()){
            JOptionPane.showMessageDialog(null, "Password must follow the format");
            showPasswordCheckBox.setSelected(false);
            return;
            }

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to update this information?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {


            //Check duplicated user name      
             for (UserAccount u :enterprise.getUserAccountDirectory().getUserAccountList() ){
                 if(u.getUsername().equals(username)&&userAccount.getPassword().equals(password)&&userAccount.getPerson().getName().equals(name)){
                     JOptionPane.showMessageDialog(null, "No information is changed!");
                     showPasswordCheckBox.setSelected(false);
                     setTextFiledNull("");   
                     return;
                 }
             }
            
            //update infomation
            userAccount.getPerson().setName(name);
            userAccount.setUsername(username);
            userAccount.setPassword(password);
             
            populateTable();
            JOptionPane.showMessageDialog(null, "The information is updated successfully!");
            setTextFiledNull("");
            showPasswordCheckBox.setSelected(false);
            showpassword.setVisible(false); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please selet a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }  
    }//GEN-LAST:event_UpdateJButtonActionPerformed

    private void showPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxActionPerformed
        // TODO add your handling code here:
        if(showPasswordCheckBox.isSelected()){
            passwordField.setEchoChar((char)0);
        }else{
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordCheckBoxActionPerformed
      
    private void setTextFiledNull(String str){
        nameTextField.setText(str);
        usernameTextField.setText(str);
        passwordField.setText(str);  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JTable enterpriseAdminJTable;
    private javax.swing.JComboBox enterpriseComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private javax.swing.JLabel showpassword;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
