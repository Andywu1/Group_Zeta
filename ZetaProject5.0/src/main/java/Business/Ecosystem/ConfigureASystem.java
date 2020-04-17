/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ecosystem;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.People.Person;
import Business.Role.EnterpriseAdminHospitalRole;
import Business.Role.AidWorkerRole;
import Business.Role.EnterpriseAdminCharityRole;
import Business.Role.DoctorRole;
import Business.Role.DonorRole;
import Business.Role.DriverRole;
import Business.Role.EnterpriseAdminDonorRole;
import Business.Role.FundraiserRole;
import Business.Role.HospitalBackOfficerRole;
import Business.Role.SysAdminRole;
import Business.Role.VolunteerRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author kathe &
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        //Create a network
        EcoSystem system=EcoSystem.getInstance();
        Network pokemonNetwork=system.createAndAddNetwork();
        pokemonNetwork.setName("pokemon");
        //create an enterprise
        Enterprise raichuHospital=pokemonNetwork.getEnterpriseDirectory().createAndAddEnterprise("raichuHospital", Enterprise.EnterpriseType.Hospital);
        Enterprise pikachuCharity=pokemonNetwork.getEnterpriseDirectory().createAndAddEnterprise("pikachuCharity", Enterprise.EnterpriseType.Charity);
        Enterprise puffCharity=pokemonNetwork.getEnterpriseDirectory().createAndAddEnterprise("puffCharity", Enterprise.EnterpriseType.Charity);      
        Enterprise mewtwoDonor=pokemonNetwork.getEnterpriseDirectory().createAndAddEnterprise("mewtwoDonor", Enterprise.EnterpriseType.Donor);
   
        //initialize some organizations
        Organization donorOrganization=mewtwoDonor.getOrganizationDirectory().createOrganization(Organization.Type.Donor);
        Organization hospitalBackOfficerOrganization=raichuHospital.getOrganizationDirectory().createOrganization(Organization.Type.HospitalBackOfficer);
        
        Organization aidWorkerOrganization=pikachuCharity.getOrganizationDirectory().createOrganization(Organization.Type.AidWorker);
        Organization driverOrganization=pikachuCharity.getOrganizationDirectory().createOrganization(Organization.Type.Driver);
        Organization volunteerOrganization=pikachuCharity.getOrganizationDirectory().createOrganization(Organization.Type.Volunteer);
        
        Organization puffAidWorkerOrganization=puffCharity.getOrganizationDirectory().createOrganization(Organization.Type.AidWorker);
        Organization doctorOrganization=raichuHospital.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
        
        Organization donationOrganization = pikachuCharity.getOrganizationDirectory().createOrganization(Organization.Type.Fundraiser);
             
        //have some employees 
        Person Raichu=doctorOrganization.getPersonDirectory().createPerson("raichu");
        Person Bulbasaur=hospitalBackOfficerOrganization.getPersonDirectory().createPerson("bulbasaur");
        Person Pikachu=aidWorkerOrganization.getPersonDirectory().createPerson("Pikachu");
        Person Squirtle=driverOrganization.getPersonDirectory().createPerson("Squirtle");
        Person Wartortle=driverOrganization.getPersonDirectory().createPerson("Wartortle");
        Person Puff=puffAidWorkerOrganization.getPersonDirectory().createPerson("Puff");
        Person Gengar=volunteerOrganization.getPersonDirectory().createPerson("Gengar");
        Person Mewtwo=donorOrganization.getPersonDirectory().createPerson("Mewtwo");
        
        Person Eevee=donationOrganization.getPersonDirectory().createPerson("Eevee");
        
        //create user account
        UserAccount usRaichu=doctorOrganization.getUserAccountDirectory().createUserAccount("raichu","raichu", Raichu, new DoctorRole());
        UserAccount usBulbasaur=hospitalBackOfficerOrganization.getUserAccountDirectory().createUserAccount("bulbasaur", "bulbasaur", Bulbasaur, new HospitalBackOfficerRole());
        UserAccount usPikachu=aidWorkerOrganization.getUserAccountDirectory().createUserAccount("pikachu", "pikachu", Pikachu, new AidWorkerRole());
        UserAccount usSquirtle=driverOrganization.getUserAccountDirectory().createUserAccount("squirtle", "squirtle", Squirtle, new DriverRole());
        UserAccount usWartortle=driverOrganization.getUserAccountDirectory().createUserAccount("wartortle", "wartortle", Wartortle, new DriverRole());
        UserAccount usPuff=puffAidWorkerOrganization.getUserAccountDirectory().createUserAccount("puff", "puff", Puff, new AidWorkerRole());
        UserAccount usGengar=volunteerOrganization.getUserAccountDirectory().createUserAccount("gengar", "gengar", Gengar, new VolunteerRole());
        UserAccount usMewtwo=donorOrganization.getUserAccountDirectory().createUserAccount("mewtwo", "mewtwo", Mewtwo, new DonorRole());
        
        UserAccount usEevee=donationOrganization.getUserAccountDirectory().createUserAccount("eevee", "eevee", Eevee, new FundraiserRole());
           
        //System admin 
        Person person1=system.getPersonDirectory().createPerson("sysadmin");
        UserAccount ua=system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person1, new SysAdminRole());
 
        //Example Enterprise Administrator:
        //1.Hospital
        Person persondino=raichuHospital.getPersonDirectory().createPerson("dino");
        UserAccount Dino = raichuHospital.getUserAccountDirectory().createUserAccount("dino", "dino", persondino, new EnterpriseAdminHospitalRole());
        
        //2.Charity
        Person personpeter=pikachuCharity.getPersonDirectory().createPerson("peter");
        UserAccount Peter = pikachuCharity.getUserAccountDirectory().createUserAccount("peter", "peter", personpeter, new EnterpriseAdminCharityRole());
        
       // Enterprise xDonor=pokemonNetwork.getEnterpriseDirectory().createAndAddEnterprise("xDonor", Enterprise.EnterpriseType.Donor);      

        //3.Donor
        Person personkal=mewtwoDonor.getPersonDirectory().createPerson("kal");
        UserAccount Kal = mewtwoDonor.getUserAccountDirectory().createUserAccount("kal", "kal", personpeter, new EnterpriseAdminDonorRole());
        
        return system;
    }
}
