/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SysAdminWorkArea;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem.EcoSystem;
import Business.People.Person;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kathe
 */
public class RegisterSysadminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterSysadminJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public RegisterSysadminJPanel(JPanel userProcessContainer,EcoSystem system ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void populateTable(){
        DefaultTableModel model=(DefaultTableModel)sysadminJTable.getModel();
        model.setRowCount(0);
        
        for(UserAccount userAccount:system.getSystemUserDirectory().getUserAccountList()){
            Object[]row=new Object[4];
            row[0]=userAccount.getPerson().getId();
            row[1]=userAccount.getPerson();
            row[2]=userAccount;
            row[3]=userAccount.getPassword();
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        departureJlabel1 = new javax.swing.JLabel();
        nameJtext = new javax.swing.JTextField();
        departureJlabel = new javax.swing.JLabel();
        usernameJtext = new javax.swing.JTextField();
        arrivalJlabel = new javax.swing.JLabel();
        passwordJtext = new javax.swing.JTextField();
        departureJlabel2 = new javax.swing.JLabel();
        departureJlabel3 = new javax.swing.JLabel();
        arrivalJlabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        createJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sysadminJTable = new javax.swing.JTable();
        showPasswordCheckBox = new javax.swing.JCheckBox();
        passwordField = new javax.swing.JPasswordField();
        nameTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        departureJlabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel1.setText("Name:");

        nameJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        nameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameJtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJtextActionPerformed(evt);
            }
        });

        departureJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel.setText("User Name:");

        usernameJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        usernameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        arrivalJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalJlabel.setText("Password:");

        passwordJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        passwordJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        departureJlabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel2.setText("Name:");

        departureJlabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel3.setText("User Name:");

        arrivalJlabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalJlabel1.setText("Password:");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        createJButton.setText("Create");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("System User Registration");

        sysadminJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "User Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sysadminJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sysadminJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sysadminJTable);

        showPasswordCheckBox.setText("show password");
        showPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arrivalJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(departureJlabel3))
                            .addComponent(departureJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(createJButton)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(showPasswordCheckBox))
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(deleteButton)
                                .addGap(26, 26, 26)
                                .addComponent(updateButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departureJlabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(departureJlabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrivalJlabel1)
                    .addComponent(showPasswordCheckBox)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createJButton)
                    .addComponent(deleteButton)
                    .addComponent(updateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameJtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJtextActionPerformed

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
        String username = usernameTextField.getText();
        String password = String.valueOf(passwordField.getText());
        
        if (!system.usernameAvailable(username)) {
            // BU unique
            // TODO: DUIHUAKUANG here.
            JOptionPane.showMessageDialog(null, "Username Has Been Used! ");
            setTextFiledNull("");
            return;
        }
         if (username== null ||username.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input the Username!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
         if (password== null ||password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input the Password!", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
         if(!passwordPatternCorrect()){
            JOptionPane.showMessageDialog(null, "Password must follow the format");
            return;
        } 
         
        Person person=system.getPersonDirectory().createPerson(name);    
        system.getSystemUserDirectory().createUserAccount(username, password, person, new SysAdminRole());
        
        JOptionPane.showMessageDialog(null, "The information is updated successfully!");
        setTextFiledNull("");
        populateTable();
        showPasswordCheckBox.setSelected(false);
        
    }//GEN-LAST:event_createJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        //Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);   
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void showPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxActionPerformed
        // TODO add your handling code here:
        if(showPasswordCheckBox.isSelected()){
            passwordField.setEchoChar((char)0);
        }else{
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordCheckBoxActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = sysadminJTable.getSelectedRow();
       
        if(selectedRow >= 0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Warning", selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                UserAccount userAccount = (UserAccount)sysadminJTable.getValueAt(selectedRow, 2);

                system.getSystemUserDirectory().getUserAccountList().remove(userAccount);
                }
            populateTable();
            setTextFiledNull("");
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        } 
        
        
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = sysadminJTable.getSelectedRow();
        UserAccount userAccount = (UserAccount) sysadminJTable.getValueAt(selectedRow, 2);
        
        if (selectedRow >= 0) {
            String name = nameTextField.getText();
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is empty,please input", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String username = usernameTextField.getText();
            
            if (username.equals("")) {
                JOptionPane.showMessageDialog(null, "UserName is empty,please input", "Warning", JOptionPane.WARNING_MESSAGE);
                showPasswordCheckBox.setSelected(false);
                return;
            }
            
            String password = passwordField.getText();
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
             for (UserAccount u :system.getSystemUserDirectory().getUserAccountList() ){
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
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please selet a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_updateButtonActionPerformed

    private void sysadminJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sysadminJTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = sysadminJTable.getSelectedRow();
        if(selectedRow >= 0){
            UserAccount ua = (UserAccount) sysadminJTable.getValueAt(selectedRow,2);
            nameTextField.setText(ua.getPerson().getName());
            usernameTextField.setText(ua.getUsername());
            passwordField.setText(ua.getPassword());
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        
    }//GEN-LAST:event_sysadminJTableMouseClicked

    private boolean passwordPatternCorrect(){
        Pattern p = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = p.matcher(passwordField.getText());
        boolean b = m.matches();
        
        return b;
    } 
        
    private void setTextFiledNull(String str){
        nameTextField.setText(str);
        usernameTextField.setText(str);
        passwordField.setText(str);  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrivalJlabel;
    private javax.swing.JLabel arrivalJlabel1;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createJButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel departureJlabel;
    private javax.swing.JLabel departureJlabel1;
    private javax.swing.JLabel departureJlabel2;
    private javax.swing.JLabel departureJlabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJtext;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField passwordJtext;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private javax.swing.JTable sysadminJTable;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameJtext;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}