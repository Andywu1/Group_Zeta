/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem.EcoSystem;
import Business.Enterprise.DonorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.Donor.DonorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kathe
 */
public class DonorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network mynetWork, EcoSystem system) {
        //System.out.println(enterprise);
        return new DonorWorkAreaJPanel(userProcessContainer,(DonorEnterprise)enterprise,account,mynetWork); //To change body of generated methods, choose Tools | Templates.
    }
    
    public DonorRole(){
        this.roleType=this.roleType.Donor;
    }
}
