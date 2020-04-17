/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CharityAdministratorRole;
import Business.Role.Role;
//import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class CharityAdministratorOrganization extends Organization{
    
    public CharityAdministratorOrganization() {
        super(Type.CharityAdministrator.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>roles=new ArrayList<>();
       roles.add(new CharityAdministratorRole());
       return roles;
    }
    
    @Override
    public String toString(){
        return "Charity Administrator Organization";
        //return type.getValue();
    }
}
