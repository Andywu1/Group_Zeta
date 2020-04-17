/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class OrganizationDirectory {
    public ArrayList<Organization>organizationList;
    
    public OrganizationDirectory(){
        organizationList=new ArrayList<>();
    }
    
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization=null;
        
        if(type.getValue().equals(Type.AidWorker.getValue())){
            organization=new AidWorkerOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.Doctor.getValue())){
            organization=new DoctorOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.Donor.getValue())){
            organization=new DonorOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.Driver.getValue())){
            organization=new DriverOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.Fundraiser.getValue())){
            organization=new FundraiserOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.HospitalBackOfficer.getValue())){
            organization=new HospitalBackOfficerOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.Volunteer.getValue())){
            organization=new VolunteerOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}
