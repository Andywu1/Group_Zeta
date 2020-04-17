/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ecosystem;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.People.PersonDirectory;
import Business.Role.Role;
import Business.Role.SysAdminRole;
import Business.SystemUser.SystemUserDirectory;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;


/**
 *
 * @author kathe &
 */
public class EcoSystem {
    private static EcoSystem business;
    public ArrayList<Network>networkList;
    private SystemUserDirectory systemUserDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    public int id;
    public int workRequestId;
    public int organizationId;
    
    public EcoSystem() {
        //super(null);
        networkList=new ArrayList<>();
    }

    public static EcoSystem getInstance(){
        if(business==null){
            System.out.println("New ecosystem.");
            business=new EcoSystem();
            business.id=1;
            business.workRequestId=1;
            business.organizationId=1;
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        ArrayList<Role> roleList=new ArrayList<Role>();
//        roleList.add(new SysAdminRole());
//        return roleList;
//    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public PersonDirectory getPersonDirectory() {
        return personDirectory==null?personDirectory=new PersonDirectory():personDirectory;
    }

    public void setPersonDirectory(PersonDirectory PersonDirectory) {
        this.personDirectory=PersonDirectory;
    }
    
    public void deleteNetwork(Network network){
        networkList.remove(network);
    }
    
    public SystemUserDirectory getSystemUserDirectory() {
        return systemUserDirectory==null?systemUserDirectory=new SystemUserDirectory():systemUserDirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory==null?userAccountDirectory=new UserAccountDirectory():userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    public boolean usernameAvailable(String userName){
      if(!this.getUserAccountDirectory().isUsernameAvailable(userName)){
          return false;
      }
      if (!this.getSystemUserDirectory().isUsernameAvailable(userName)) {
          return false;
      }
      for(Network network:networkList){
          
      }
      return true;
    }
    
}
