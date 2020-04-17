/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AidWorkerRole;
import Business.Role.Role;
//import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class AidWorkerOrganization extends Organization{
    
    public AidWorkerOrganization() {
        super(Type.AidWorker.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>roles=new ArrayList<>();
       roles.add(new AidWorkerRole());
       return roles;
    }
    @Override
    public String toString(){
        return "Aid Worker Organization";
        //return type.getValue();
    }
}
