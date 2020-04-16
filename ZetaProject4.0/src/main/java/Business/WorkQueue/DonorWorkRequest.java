/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author lgfx0
 */
public class DonorWorkRequest extends WorkRequest{
    private Donor donor;

    public DonorWorkRequest(Donor donor){
        this.donor=donor;
    }
    
    public DonorWorkRequest(){
        
    }
    
    public Donor getDonor() {
        return donor==null?donor=new Donor():donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }
    
    
}
