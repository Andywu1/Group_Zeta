/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise>enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList==null?enterpriseList=new ArrayList<>():enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    public Enterprise createAndAddEnterprise(String name, EnterpriseType type){
        Enterprise enterprise=null;
        
        if(type==type.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }else if(type==type.Charity){
            enterprise=new CharityEnterprise(name);
            enterpriseList.add(enterprise);
        }else if(type==type.Donor){
            enterprise=new DonorEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}
