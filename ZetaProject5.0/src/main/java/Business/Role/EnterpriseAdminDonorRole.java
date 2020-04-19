/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.Donor.DonorAdminWorkAreaJPanel;
import javax.swing.JPanel;
import Interface.Hospital.HospitalAdminWorkAreaJPanel;

/**
 *
 * @author yangj
 */
public class EnterpriseAdminDonorRole extends Role{
    
    public EnterpriseAdminDonorRole(){
        this.roleType=this.roleType.DonorEntAdmin;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network mynetWork, EcoSystem system) {
          return new DonorAdminWorkAreaJPanel(userProcessContainer,account,enterprise,system);  
 
        
    }   
}
