/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.People.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int count=1;
    
    public enum Type{
        //
        SysAdmin("SysAdmin Organization"),
        //
        CharityAdministrator("Charity Administrator Organization"),
        AidWorker("Aid Worker Organization"),
        Volunteer("Volunteer Organization"),
        Driver("Driver Organization"),
        Fundraiser("Fundraiser Organization"),
        //
        Doctor("Doctor Organization"),
        HospitalBackOfficer("Hospital Back Officer Organization"),
        HospitalAdministrator("Hospital Administrator Organization"),
        //
        Donor("Donor Organization");
        
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }
    
    public Organization(String name){
        this.name=name;
        workQueue = new WorkQueue();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = count;
        System.out.println("Org: count = " + count);
        count++;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }
    
    public static void setCurrentId(int n){
        count=n;
        
        System.out.println("Org: set count = " + count);
    }
    
    public static int getCurrentId(){
        
        System.out.println("Org: get count = " + count);
        return count;
        
    }
    
    public String toString(){
        return "Generec org.";
        //return type.getValue();
    }
    
    
}
