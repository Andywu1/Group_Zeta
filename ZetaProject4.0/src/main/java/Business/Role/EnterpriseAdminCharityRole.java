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
import Interface.Charity.CharityAdminWorkAreaJPanel;
import Interface.Hospital.HospitalAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author yangj
 */
public class EnterpriseAdminCharityRole extends Role {
        public EnterpriseAdminCharityRole(){
        this.roleType=this.roleType.CharityEntAdmin;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network mynetWork, EcoSystem system) {
          return new CharityAdminWorkAreaJPanel(userProcessContainer,account,enterprise);  
// 
//        
   
    } 
}
