/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Enterprise.Enterprise;
import Business.People.Person;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;



/**
 *
 * @author kathe
 */
public class UserAccount {
    private String username;
    private String password;
    private Person person;
    private Role role;
    private WorkQueue workQueue;
    private Enterprise enterprise;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue == null ? workQueue = new WorkQueue() : workQueue;
    }

    public String toString(){
        return username;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }   
}
