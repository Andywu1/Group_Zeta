/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ecosystem;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.People.Person;
import Business.Role.EnterpriseAdminHospitalRole;
import Business.Role.AidWorkerRole;
import Business.Role.CharityAdministratorRole;
import Business.Role.EnterpriseAdminCharityRole;
import Business.Role.DoctorRole;
import Business.Role.DonorRole;
import Business.Role.DriverRole;
import Business.Role.EnterpriseAdminDonorRole;
import Business.Role.HospitalBackOfficerRole;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;
import Interface.Hospital.SubmitDemandGoodJPanel;

/**
 *
 * @author kathe &
 */
public class ConfigureASystem {
    private CharityAdministratorRole role;
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
    
        //initialize some organizations
        Organization doctorOrganization=raichuHospital.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
        Organization hospitalBackOfficerOrganization=raichuHospital.getOrganizationDirectory().createOrganization(Organization.Type.HospitalBackOfficer);
        
        Organization aidWorkerOrganization=pikachuCharity.getOrganizationDirectory().createOrganization(Organization.Type.AidWorker);
        Organization driverOrganization=pikachuCharity.getOrganizationDirectory().createOrganization(Organization.Type.Driver);   
        Organization puffAidWorkerOrganization=puffCharity.getOrganizationDirectory().createOrganization(Organization.Type.AidWorker);

        
        //have some employees 
        Person Raichu=doctorOrganization.getPersonDirectory().createPerson("raichu");
        Person Bulbasaur=hospitalBackOfficerOrganization.getPersonDirectory().createPerson("bulbasaur");
        Person Pikachu=aidWorkerOrganization.getPersonDirectory().createPerson("Pikachu");
        Person Squirtle=driverOrganization.getPersonDirectory().createPerson("Squirtle");
        Person Wartortle=driverOrganization.getPersonDirectory().createPerson("Wartortle");
        Person Puff=puffAidWorkerOrganization.getPersonDirectory().createPerson("Puff");
        
        //create user account
        UserAccount usRaichu=doctorOrganization.getUserAccountDirectory().createUserAccount("raichu","raichu", Raichu, new DoctorRole());
        UserAccount usBulbasaur=hospitalBackOfficerOrganization.getUserAccountDirectory().createUserAccount("bulbasaur", "bulbasaur", Bulbasaur, new HospitalBackOfficerRole());
        UserAccount usPikachu=aidWorkerOrganization.getUserAccountDirectory().createUserAccount("pikachu", "pikachu", Pikachu, new AidWorkerRole());
        UserAccount usSquirtle=driverOrganization.getUserAccountDirectory().createUserAccount("squirtle", "squirtle", Squirtle, new DriverRole());
        UserAccount usWartortle=driverOrganization.getUserAccountDirectory().createUserAccount("wartortle", "wartortle", Wartortle, new DriverRole());
        UserAccount usPuff=puffAidWorkerOrganization.getUserAccountDirectory().createUserAccount("puff", "puff", Puff, new AidWorkerRole());

        
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
        
        //3.Donor
        Enterprise xDonor=pokemonNetwork.getEnterpriseDirectory().createAndAddEnterprise("xDonor", Enterprise.EnterpriseType.Donor);      
        Person personkal=xDonor.getPersonDirectory().createPerson("kal");
        UserAccount Kal = xDonor.getUserAccountDirectory().createUserAccount("kal", "kal", personpeter, new EnterpriseAdminDonorRole());
        
        return system;
    }
}
