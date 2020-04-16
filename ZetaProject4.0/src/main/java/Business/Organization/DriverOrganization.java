/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DonorRole;
import Business.Role.DriverRole;
import Business.Role.Role;
//import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class DriverOrganization extends Organization{
    
    public DriverOrganization() {
        super(Type.Driver.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>roles=new ArrayList<>();
       roles.add(new DriverRole());
       return roles;
    }
    @Override
    public String toString(){
        return "Driver Organization";
        //return type.getValue();
    }
}
