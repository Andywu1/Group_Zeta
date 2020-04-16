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
public class VolunteerWorkRequest extends WorkRequest{
     private VolunteerDirectory volunteerDirectory;
 
     public VolunteerWorkRequest(VolunteerDirectory volunteerDirectory){
         this.volunteerDirectory=volunteerDirectory;
     }
     
     public VolunteerWorkRequest(){
         
     }
     
     public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory==null?volunteerDirectory=new VolunteerDirectory():volunteerDirectory;
    }

    public void setVolunteerDirectory(VolunteerDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }
}
