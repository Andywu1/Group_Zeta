/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalAdministratorRole;
import Business.Role.Role;
import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class HospitalAdministratorOrganization extends Organization{
    
    public HospitalAdministratorOrganization() {
        super(Type.HospitalAdministrator.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>roles=new ArrayList<>();
       roles.add(new HospitalAdministratorRole());
       return roles;
    }
    
    @Override
    public String toString(){
        return "Hospital Administrator Organization";
        //return type.getValue();
    }
}
