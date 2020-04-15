/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kathe &
 */
public class CharityEnterprise extends Enterprise{
    
    public CharityEnterprise(String name) {
        super(name, EnterpriseType.Charity);
    }
    
    
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        return null;
//    }


}
