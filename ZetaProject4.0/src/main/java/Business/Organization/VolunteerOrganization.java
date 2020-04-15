/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VolunteerRole;
//import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class VolunteerOrganization extends Organization {
    
    public VolunteerOrganization() {
        super(Type.Volunteer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>roles=new ArrayList<>();
       roles.add(new VolunteerRole());
       return roles;
    }
    
    @Override
    public String toString(){
        return "Volunteer Organization";
        //return type.getValue();
    }
}
