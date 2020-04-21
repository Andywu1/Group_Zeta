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

import Business.Role.EnterpriseAdminCharityRole;
import Business.Role.EnterpriseAdminDonorRole;
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
                    Object[] row = new Object[4];
                    row[0] = enterprise;
                    row[1] = network.getName();
                    row[2] = userAccount;
                    row[3] = enterprise.getEnterpriseType().getValue();
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
        createJButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        showpassword = new javax.swing.JLabel();
        UpdateJButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        showPasswordCheckBox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(136, 195, 234));
        setMinimumSize(new java.awt.Dimension(800, 671));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseAdminJTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        enterpriseAdminJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseAdminJTable.setRowHeight(30);
        enterpriseAdminJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterpriseAdminJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(enterpriseAdminJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 580, 150));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel6.setText("Manage Enterprise Admin");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Enterprise");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        networkComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        networkComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 170, 30));

        enterpriseComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        enterpriseComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 170, 30));

        createJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        createJButton.setText("Create");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });
        add(createJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, -1, -1));

        deleteJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });
        add(deleteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, -1, -1));
        add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 40, 40));

        UpdateJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UpdateJButton.setText("Update");
        UpdateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateJButtonActionPerformed(evt);
            }
        });
        add(UpdateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 94, 170));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 105, 186));

        jLabel7.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Manage Enterprise Admin");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 260, 60));

        jLabel9.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Manage Network");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 160, 40));

        backJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, 30));

        jLabel8.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Manage Enterprise");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 180, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 700));

        nameTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 170, 30));

        usernameTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 170, 30));

        passwordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 170, 30));

        showPasswordCheckBox.setBackground(new java.awt.Color(136, 195, 234));
        showPasswordCheckBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        showPasswordCheckBox.setText("show password");
        showPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxActionPerformed(evt);
            }
        });
        add(showPasswordCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Username");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\NEU_Study\\INFO 5100 Spring\\Final_Project_Zeta\\Zeta_Images\\register.png")); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 540, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseAdminJTable.getSelectedRow();
       
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
            return;
        }
            
        UserAccount useraccount= (UserAccount)enterpriseAdminJTable.getValueAt(selectedRow, 2);
        
        
        int selectionButton = JOptionPane.YES_NO_OPTION;
        int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Warning", selectionButton);
        if(selectionResult == JOptionPane.YES_OPTION){
               // Enterprise enterprise = (Enterprise)enterpriseAdminJTable.getValueAt(selectedRow, 0);
                
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

            JOptionPane.showMessageDialog(null, "Delete Successfully!");
            setTextFiledNull("");
            usernameTextField.setEnabled(true);
            passwordField.setEchoChar('*');
            
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
        
        if(name==null||name.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Name can't be empty!");
            return;
        }
        if(username==null||username.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username can't be empty!");
            return;
        }
        if(password==null||password.trim().isEmpty()){
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
                        usernameTextField.setEnabled(true);
                        return;
                    }
                }
            }
        }
        
       
                    
        Person person = enterprise.getPersonDirectory().createPerson(name);
        
        if(enterprise.getEnterpriseType().toString().equals("Hospital")){
            //HopsitalAdminRole
           enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new EnterpriseAdminHospitalRole()); 
        }else if(enterprise.getEnterpriseType().toString().equals("Charity")){
            
                enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new EnterpriseAdminCharityRole()); 
        }else if(enterprise.getEnterpriseType().toString().equals("Donor")){
                
                    enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new EnterpriseAdminDonorRole()); //AdminRole
        }       
            
        

        JOptionPane.showMessageDialog(null, "Enterprise Admin was created successfully!");
        populateTable();
        
        setTextFiledNull("");
        showPasswordCheckBox.setSelected(false);
        usernameTextField.setEnabled(true);
        passwordField.setEchoChar('*');
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
            usernameTextField.setEnabled(false);
            
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
        int selectedRow = enterpriseAdminJTable.getSelectedRow();
         
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please selet a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;     
        }
        
        UserAccount userAccount = (UserAccount) enterpriseAdminJTable.getValueAt(selectedRow, 2);
        Enterprise enterprise = (Enterprise) enterpriseAdminJTable.getValueAt(selectedRow, 0);
         
        String name = nameTextField.getText();
      //  String username = usernameTextField.getText();
        String password = passwordField.getText();
         
//        if(name== null ||name.trim().isEmpty()||name== null ||username.trim().isEmpty()||username== null ||password.trim().isEmpty()){
//            JOptionPane.showMessageDialog(null, "The data cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }

        if (name== null ||name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Name is empty,please input", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
//            if (username.equals("")) {
//                JOptionPane.showMessageDialog(null, "UserName is empty,please input", "Warning", JOptionPane.WARNING_MESSAGE);
//                showPasswordCheckBox.setSelected(false);
//                return;
//            }
//            

        if (password== null ||password.trim().isEmpty()) {
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
             if(userAccount.getPassword().equals(password)&&userAccount.getPerson().getName().equals(name)){
                 JOptionPane.showMessageDialog(null, "No information is changed!");
                 showPasswordCheckBox.setSelected(false);
                 setTextFiledNull("");
                 usernameTextField.setEnabled(true);
                 return;
             }
         }

        //update infomation
        userAccount.getPerson().setName(name);
        //userAccount.setUsername(username);
        userAccount.setPassword(password);

        populateTable();
        JOptionPane.showMessageDialog(null, "The information is updated successfully!");
        setTextFiledNull("");
        showPasswordCheckBox.setSelected(false);
        showpassword.setVisible(false); 
        usernameTextField.setEnabled(true);
        passwordField.setEchoChar('*');
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

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed
      
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private javax.swing.JLabel showpassword;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
