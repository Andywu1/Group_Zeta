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
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author kathe
 */
public abstract class Role {
    
    public enum RoleType{
        //
        SysAdmin("SysAdmin"),
        //Enterprise Admin
        HospitalEntAdmin("Hospital Enterprise Admin"),
        CharityEntAdmin("Charity Enterprise Admin"),
        DonorEntAdmin("Donor Enterprise Admin"),
        
        //
        //CharityAdministrator("Charity Administrator"),
        AidWorker("Aid Worker"),
        Volunteer("Volunteer"),
        Driver("Driver"),
        Fundraiser("Fundraiser"),
        //
        Doctor("Doctor"),
        //HospitalAdministrator("Hospital Administrator"),
        HospitalBackOfficer("Hospital Back Officer"),
        //
        Donor("Donor");
        
        private String value;
        
        private RoleType(String value){
            this.value=value;
        }
        
        public String getValue(){
            return value;
        }
        
        public String toString(){
            return value;
        }
    }
    
    RoleType roleType;

    public RoleType getRoleType() {
        if(roleType==null){
            return roleType.SysAdmin;
        }
        return roleType;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Network mynetWork,
            EcoSystem system);
    
    
    public String toString(){
        return this.getRoleType().getValue();
    }
    
}
