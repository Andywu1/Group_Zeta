/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem.EcoSystem;
import Business.Enterprise.CharityEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.Charity.VolunteerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kathe
 */
public class VolunteerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network mynetWork, EcoSystem system) {
        return new VolunteerWorkAreaJPanel(userProcessContainer,account,(CharityEnterprise)enterprise); //To change body of generated methods, choose Tools | Templates.
    }
    public VolunteerRole(){
        this.roleType=this.roleType.Volunteer;
    }
}
