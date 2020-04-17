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
     private Volunteer volunteer;
 
     public VolunteerWorkRequest(Volunteer volunteer){
         this.volunteer=volunteer;
     }
     
     public VolunteerWorkRequest(){
         
     }
     
     public Volunteer getVolunteer() {
        return volunteer==null?volunteer=new Volunteer():volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }
}
