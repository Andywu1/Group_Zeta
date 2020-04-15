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
import javax.swing.JPanel;
import Interface.SysAdminWorkArea.SystemAdminWorkAreaJPanel;


/**
 *
 * @author kathe
 */
public class SysAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network mynetWork, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer,system);
    }
    
    
    public SysAdminRole(){
        this.roleType=this.roleType.SysAdmin;
    }

}
