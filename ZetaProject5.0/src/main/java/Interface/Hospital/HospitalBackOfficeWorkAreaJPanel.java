/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Hospital;

import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.HospitalBackOfficerOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author kathe
 */
public class HospitalBackOfficeWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    //private HospitalBackOfficerOrganization hospitalBackOfficeOrganization;
    private HospitalEnterprise hospitalEnterprise;
    private UserAccount userAccount;
    private Network myNetwork;
    /**
     * Creates new form HospitalBackOfficeWorkArea
     */
    public HospitalBackOfficeWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount,HospitalEnterprise hospital,Network myNetwork) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.hospitalEnterprise=hospital;
        this.myNetwork=myNetwork;
        
        valueLabel.setText(hospital.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AssignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        submitWorkEvaluationJButton = new javax.swing.JButton();
        submitVolunteerJButton = new javax.swing.JButton();
        volunteerEvalJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(192, 233, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valueLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 220, 26));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Back Office Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 360, 39));

        AssignJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AssignJButton.setText("Assign Work Requests");
        AssignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignJButtonActionPerformed(evt);
            }
        });
        add(AssignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 230, 30));

        processJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        processJButton.setText("Process Work Requests");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 230, 30));

        submitWorkEvaluationJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        submitWorkEvaluationJButton.setText("Submit Work Evaluation");
        submitWorkEvaluationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitWorkEvaluationJButtonActionPerformed(evt);
            }
        });
        add(submitWorkEvaluationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 230, 30));

        submitVolunteerJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        submitVolunteerJButton.setText("Submit Volunteer Request");
        submitVolunteerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitVolunteerJButtonActionPerformed(evt);
            }
        });
        add(submitVolunteerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 230, 30));

        volunteerEvalJButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        volunteerEvalJButton.setText("Submit Volunteer Evaluation");
        volunteerEvalJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volunteerEvalJButtonActionPerformed(evt);
            }
        });
        add(volunteerEvalJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 230, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Enterprise:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        // TODO add your handling code here:
        ProcessWorkRequestJPanel processWorkRequestJPanel=new ProcessWorkRequestJPanel(userProcessContainer,userAccount,myNetwork,hospitalEnterprise);
        userProcessContainer.add("ProcessWorkRequestJPanel",processWorkRequestJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void AssignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignJButtonActionPerformed
        // TODO add your handling code here:
        AssignWorkRequestJPanel assignWorkRequestJPanel=new AssignWorkRequestJPanel(userProcessContainer,userAccount,hospitalEnterprise);
        userProcessContainer.add("AssignWorkRequestJPanel",assignWorkRequestJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_AssignJButtonActionPerformed

    private void submitWorkEvaluationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitWorkEvaluationJButtonActionPerformed
        // TODO add your handling code here:
        SubmitWorkEvaluationJPanel submitWorkEvaluationJPanel=new SubmitWorkEvaluationJPanel(userProcessContainer,userAccount,hospitalEnterprise);
        userProcessContainer.add("SubmitWorkEvaluationJPanel",submitWorkEvaluationJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_submitWorkEvaluationJButtonActionPerformed

    private void submitVolunteerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitVolunteerJButtonActionPerformed
        // TODO add your handling code here:
        SubmitVolunteerJPanel submitVolunteerPanel=new SubmitVolunteerJPanel(userProcessContainer,userAccount,hospitalEnterprise,myNetwork);
        userProcessContainer.add("SubmitVolunteerPanel",submitVolunteerPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_submitVolunteerJButtonActionPerformed

    private void volunteerEvalJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volunteerEvalJButtonActionPerformed
        // TODO add your handling code here:
        SubmitVolunteerEvalJPanel submitVolunteerEvalPanel=new SubmitVolunteerEvalJPanel(userProcessContainer,userAccount,hospitalEnterprise);
        userProcessContainer.add("SubmitVolunteerEvalPanel",submitVolunteerEvalPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_volunteerEvalJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton submitVolunteerJButton;
    private javax.swing.JButton submitWorkEvaluationJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton volunteerEvalJButton;
    // End of variables declaration//GEN-END:variables
}
