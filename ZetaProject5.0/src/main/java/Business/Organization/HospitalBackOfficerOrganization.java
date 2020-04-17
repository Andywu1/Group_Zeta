/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalBackOfficerRole;
import Business.Role.Role;
//import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class HospitalBackOfficerOrganization extends Organization{
    
    public HospitalBackOfficerOrganization() {
        super(Type.HospitalBackOfficer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>roles=new ArrayList<>();
       roles.add(new HospitalBackOfficerRole());
       return roles;
    }
    
    @Override
    public String toString(){
        return "Hospital Back Officer Organization";
        //return type.getValue();
    }
}
