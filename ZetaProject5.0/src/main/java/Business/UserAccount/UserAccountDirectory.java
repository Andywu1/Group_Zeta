/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.People.Person;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount>userAccountList;

    public UserAccountDirectory(){
        userAccountList=this.userAccountList;
    }
    
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList == null ? userAccountList = new ArrayList<>() : userAccountList;
    }
    
    public UserAccount authenticateUser(String username,String password){
        for(UserAccount ua:this.getUserAccountList()){
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        }
        return null;
    }
    
     public UserAccount createUserAccount(String username, String password, Person person, Role role, boolean add){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        if (add) {
            this.getUserAccountList().add(userAccount);
        }
        return userAccount;
    }
    public UserAccount createUserAccount(String username, String password, Person person, Role role) {
        UserAccount ua = createUserAccount(username, password, person, role, true);
        return ua;
    }
    
    public boolean isUsernameAvailable(String username){
        for (UserAccount ua : this.getUserAccountList()){
            if (ua.getUsername().equals(username)){
                 return false;
            }
        }
        return true;
    }
    
}
