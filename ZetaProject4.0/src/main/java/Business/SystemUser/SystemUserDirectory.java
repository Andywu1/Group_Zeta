/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SystemUser;

import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class SystemUserDirectory extends UserAccountDirectory{
    public ArrayList<SystemUser> systemUserList;
    
    public SystemUserDirectory(){
        systemUserList=new ArrayList<>();
    }
    
    public ArrayList<SystemUser> getSystemUserList() {
        return systemUserList;
    }

    public void setSystemUserList(ArrayList<SystemUser> systemUserList) {
        this.systemUserList = systemUserList;
    }
    
    public SystemUser createSysUser(String name){
        SystemUser systemUser=new SystemUser();
        systemUser.setName(name);
        systemUserList.add(systemUser);
        return systemUser;
    }
    
}
