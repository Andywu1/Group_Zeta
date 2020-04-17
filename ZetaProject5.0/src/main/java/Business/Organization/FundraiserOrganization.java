/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FundraiserRole;
import Business.Role.Role;
//import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class FundraiserOrganization extends Organization{
    
    public FundraiserOrganization() {
        super(Type.Fundraiser.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>roles=new ArrayList<>();
       roles.add(new FundraiserRole());
       return roles;
    }
    
    @Override
    public String toString(){
        return "Fundraiser Organization";
        //return type.getValue();
    }
}
