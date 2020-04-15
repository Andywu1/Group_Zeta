/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author kathe
 */
public class HospitalWorkRequest extends WorkRequest{
    private DemandGoodDirectory demandGoodDirectory;
    
    public HospitalWorkRequest(DemandGoodDirectory dgd){
        this.demandGoodDirectory = dgd;
    }
    public HospitalWorkRequest(){
        
    }
    public DemandGoodDirectory getDemandGoodDirectory() {
        return demandGoodDirectory==null?demandGoodDirectory=new DemandGoodDirectory():demandGoodDirectory;
    }

    public void setDemandGoodDirectory(DemandGoodDirectory demandGoodDirectory) {
        this.demandGoodDirectory = demandGoodDirectory;
    }
  
}
