/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.People.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author kathe &
 */
public class Enterprise{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private String address;
    private String name;
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private WorkQueue workQueue;

    public Enterprise(String name,EnterpriseType type) {
//        super(name);
        this.name=name;
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        workQueue=new WorkQueue();
    }

//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        return null;
//    }
//    
    public enum EnterpriseType{
        Hospital("Hospital"),
        Charity("Charity"),
        Donor("Donor");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        
        public String getValue() {
            return value;
        }
        
        public String toString(){
            return value;
        }
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public PersonDirectory getPersonDirectory() {
        return personDirectory==null?personDirectory=new PersonDirectory():personDirectory;
    }

    public void setPersonDirectory(PersonDirectory PersonDirectory) {
        this.personDirectory=PersonDirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory==null?userAccountDirectory=new UserAccountDirectory():userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    public OrganizationDirectory getOrganizationDirectory(){
        return organizationDirectory;
    }
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
            return name;
    }
}
