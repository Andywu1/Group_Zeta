/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Charity;


import Interface.Hospital.*;
import Business.Ecosystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.People.Person;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yangj
 */
public class CharityAdminWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    private Enterprise enterprise;   
    private UserAccount userAccount;
    private Map<String, ArrayList<String>> allowedTypes;
    private EcoSystem system;
    
    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public CharityAdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount,Enterprise enterprise) {
        initComponents();
        
        allowedTypes = new HashMap<>();      

        ArrayList<String> list = new ArrayList<String>();
        list.add("Aid Worker Organization");
        list.add("Volunteer Organization");
        list.add("Driver Organization");
        list.add("Fundraiser Organization");
        
        allowedTypes.put("Charity Enterprise Admin", list);

       this.userProcessContainer=userProcessContainer;
       this.userAccount=userAccount;
       this.enterprise=enterprise;
      // this.system = system;
        
      //Tab1:Manage Organization
        populateOrganizationTable();
        populateOrganizationTypeComboBox();
        
        //Tab Manage User:
        populateOrganizationComboBox();
        populateUserTable();
        valueLabel.setText(enterprise.getName());
        showpassword.setVisible(false); 
    }
    
     public void populateOrganizationTable() {
        DefaultTableModel model = (DefaultTableModel)organizationJTable.getModel();
        model.setRowCount(0);
        
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            Object row[] = new Object[2];
            row[0] = org.getOrganizationID();
            row[1] = org;
            model.addRow(row);
        }
    }
        
     private void populateOrganizationTypeComboBox(){
        organizationTypeComboBox.removeAllItems();       
          for (String str : allowedTypes.get(userAccount.getRole().toString())) { 
           organizationTypeComboBox.addItem(str);
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

        TabbedPane = new javax.swing.JTabbedPane();
        organizationPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        organizationTypeComboBox = new javax.swing.JComboBox();
        addJButton = new javax.swing.JButton();
        deleteOrgButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        roleComboBox = new javax.swing.JComboBox();
        usernameTextField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        showPasswordCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        showpassword = new javax.swing.JLabel();

        TabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TabbedPaneMousePressed(evt);
            }
        });

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization Id", "Organization Name"
            }
        ));
        jScrollPane1.setViewportView(organizationJTable);

        jLabel2.setText("Organization Type");

        organizationTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationTypeComboBoxActionPerformed(evt);
            }
        });

        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        deleteOrgButton.setText("Delete Organization");
        deleteOrgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrgButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout organizationPanelLayout = new javax.swing.GroupLayout(organizationPanel);
        organizationPanel.setLayout(organizationPanelLayout);
        organizationPanelLayout.setHorizontalGroup(
            organizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(organizationPanelLayout.createSequentialGroup()
                .addGroup(organizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(organizationPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(organizationPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2)
                        .addGap(103, 103, 103)
                        .addComponent(organizationTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(organizationPanelLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(addJButton)
                        .addGap(62, 62, 62)
                        .addComponent(deleteOrgButton)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        organizationPanelLayout.setVerticalGroup(
            organizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(organizationPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(organizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(organizationTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(organizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJButton)
                    .addComponent(deleteOrgButton))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Manage Organization", organizationPanel);

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Organization Id", "Organization", "User Name", "Role"
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(userTable);

        jLabel5.setText("Organization");

        jLabel7.setText("Role");

        jLabel8.setText("User Name");

        jLabel9.setText("Password");

        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        showPasswordCheckBox.setText("show password");
        showPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(organizationComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTextField)
                            .addComponent(usernameTextField)
                            .addComponent(roleComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showPasswordCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(createButton)
                        .addGap(70, 70, 70)
                        .addComponent(deleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(organizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPasswordCheckBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createButton)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteButton)
                        .addComponent(updateButton)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Manage User", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Charity Admin OverView");

        jLabel10.setText("Enterprise:");

        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addComponent(showpassword)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valueLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(showpassword))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        String orgType = (String) organizationTypeComboBox.getSelectedItem();
        
        ArrayList<Organization> orgList = enterprise.getOrganizationDirectory().getOrganizationList();
        
        for(Organization org:orgList){
           
        if(org.getName().equals(orgType)){
            JOptionPane.showMessageDialog(null, "Duplicate Organization!");
            return;        
        }
        }           

        //Charity Organization
        
        if(orgType.equals("Aid Worker Organization"))
        {
           enterprise.getOrganizationDirectory().createOrganization(Organization.Type.AidWorker);
        }else{
                 if(orgType.equals("Volunteer Organization"))
                 {
                     enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Volunteer);  
                     
                 }else{
                     if(orgType.equals("Driver Organization")){
                        enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Driver);   
                     }else{
                         if(orgType.equals("Fundraiser Organization")){
                            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Fundraiser);    
                         }
                     }
                 }
             }
        
        
       
        populateOrganizationTable();

    }//GEN-LAST:event_addJButtonActionPerformed

    
//Tab Manage User
     public void populateUserTable() {
        DefaultTableModel model = (DefaultTableModel)userTable.getModel();
        model.setRowCount(0);
        
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
          for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
            Object row[] = new Object[4];
            row[0] = org.getOrganizationID();
            row[1] = org;
            row[2] = ua;
            row[3] = ua.getRole();
            model.addRow(row);
        }            
        }
       
    }
    
    
    public void populateOrganizationComboBox(){
        organizationComboBox.removeAllItems();
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList()){
            organizationComboBox.addItem(org);
        }
    }
    
     public void populateRoleComboBox(Organization organization){
        roleComboBox.removeAllItems();
        for(Role role:organization.getSupportedRole()){
            roleComboBox.addItem(role);
        }
    }
    

    
    private void organizationTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationTypeComboBoxActionPerformed

        
    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        // TODO add your handling code here:
           Organization org = (Organization) organizationComboBox.getSelectedItem();
           if(org!=null){
               populateRoleComboBox(org);         
           }
                      
 
        
    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
      String name = nameTextField.getText();
      String username = usernameTextField.getText();
      String password = passwordField.getText();

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
          
               for(Organization newOrg: enterprise.getOrganizationDirectory().getOrganizationList())
               {
                   for (UserAccount userAccount : newOrg.getUserAccountDirectory().getUserAccountList())
                   {
                       if(userAccount.getUsername().equals(username)){
                           JOptionPane.showMessageDialog(null, "This username is already registered!");
                           return;
                    }
                }    
               }

      Organization organization = (Organization) organizationComboBox.getSelectedItem();
      Person person =  organization.getPersonDirectory().createPerson(name);
      Role role = (Role) roleComboBox.getSelectedItem();
      
      organization.getUserAccountDirectory().createUserAccount(username, password, person, role);
      populateUserTable();  
      JOptionPane.showMessageDialog(null, "User is created successfully!");
        setTextFiledNull("");
        showPasswordCheckBox.setSelected(false);
    }//GEN-LAST:event_createButtonActionPerformed

     private boolean passwordPatternCorrect(){
        Pattern p = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = p.matcher(passwordField.getText());
        boolean b = m.matches();
        
        return b;
    }  
     
     
    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void showPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxActionPerformed
        // TODO add your handling code here:
         if(showPasswordCheckBox.isSelected()){
            passwordField.setEchoChar((char)0);
        }else{
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordCheckBoxActionPerformed

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = userTable.getSelectedRow();
        if(selectedRow >= 0){
            UserAccount ua = (UserAccount) userTable.getValueAt(selectedRow,2);
            nameTextField.setText(ua.getPerson().getName());
            usernameTextField.setText(ua.getUsername());
            passwordField.setText(ua.getPassword());   
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }        
    }//GEN-LAST:event_userTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = userTable.getSelectedRow();
       
        if(selectedRow >= 0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Warning", selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
              
                UserAccount ua = (UserAccount)userTable.getValueAt(selectedRow, 2);
                
                for(Organization organization :enterprise.getOrganizationDirectory().getOrganizationList())
                {
                    for(UserAccount user : organization.getUserAccountDirectory().getUserAccountList()){
                        if(user.getUsername().equals(ua.getUsername())){
                            organization.getUserAccountDirectory().getUserAccountList().remove(ua);
                            break;
                        }     
                            
                        }                        
                }
                populateUserTable();
                JOptionPane.showMessageDialog(null, "User is deleted successfully!");
                nameTextField.setText("");
                usernameTextField.setText("");
                passwordField.setText("");
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
        String username = usernameTextField.getText();
        String password = String.valueOf(passwordField);
         
        if(name.equals("")||username.equals("")||password.equals("")){
        JOptionPane.showMessageDialog(null, "Please selet a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        int selectedRow = userTable.getSelectedRow();
        UserAccount userAccount = (UserAccount) userTable.getValueAt(selectedRow, 2);
        
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
            for(Organization organization :enterprise.getOrganizationDirectory().getOrganizationList())
                {
                    for(UserAccount u : organization.getUserAccountDirectory().getUserAccountList()){
                        if(u.getUsername().equals(username)){
                            JOptionPane.showMessageDialog(null, "This username already exists!");
                            setTextFiledNull("");
                            return;
                        }
                 }
             }
            
            //update infomation
            userAccount.getPerson().setName(name);
            userAccount.setUsername(username);
            userAccount.setPassword(password);
             
            populateUserTable();  
            JOptionPane.showMessageDialog(null, "The information is updated successfully!");
            setTextFiledNull("");
            showPasswordCheckBox.setSelected(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please selet a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }  
       
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteOrgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrgButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = organizationJTable.getSelectedRow();
        if(selectedRow >= 0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete this Organization?", "Warning", selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Organization org = (Organization) organizationJTable.getValueAt(selectedRow, 1);
                enterprise.getOrganizationDirectory().getOrganizationList().remove(org);
                populateOrganizationTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteOrgButtonActionPerformed

    private void TabbedPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabbedPaneMousePressed
        // TODO add your handling code here:
         populateOrganizationComboBox();
    }//GEN-LAST:event_TabbedPaneMousePressed

      private void setTextFiledNull(String str){
        nameTextField.setText(str);
        usernameTextField.setText(str);
        passwordField.setText(str);  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteOrgButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JPanel organizationPanel;
    private javax.swing.JComboBox organizationTypeComboBox;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private javax.swing.JLabel showpassword;
    private javax.swing.JButton updateButton;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
