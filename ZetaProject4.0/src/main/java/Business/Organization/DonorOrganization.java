/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DonorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class DonorOrganization extends Organization{
    
    public DonorOrganization() {
        super(Type.Donor.getValue());
    }
    
   public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>roles=new ArrayList();
       roles.add(new DonorRole());
       return roles;
    }
    
   @Override
   public String toString(){
        return "Donor Organization";
        //return type.getValue();
    }
}
