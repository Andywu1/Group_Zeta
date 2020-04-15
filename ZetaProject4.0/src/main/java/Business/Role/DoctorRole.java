/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Interface.Hospital.DoctorWorkAreaJPanel;
import Interface.Hospital.SubmitDemandGoodJPanel;

/**
 *
 * @author kathe
 */
public class DoctorRole extends Role{

 @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network mynetWork, EcoSystem system) {
        return new DoctorWorkAreaJPanel(userProcessContainer,account,(HospitalEnterprise)enterprise,mynetWork);
    }
    
    public DoctorRole(){
        this.roleType=this.roleType.Doctor;
    }
}
