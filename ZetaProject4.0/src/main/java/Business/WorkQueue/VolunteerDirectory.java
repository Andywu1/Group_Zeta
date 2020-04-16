/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkQueue.Volunteer.VolunteerType;

/**
 *
 * @author kathe
 */
public class VolunteerDirectory {

    private int cleanerCnt, serverCnt;
    public VolunteerDirectory() {
        cleanerCnt = 0;
        serverCnt = 0;
    }
    public int addVolunteer(int quantity, VolunteerType type) {
        if (type.equals(Volunteer.VolunteerType.Cleaner)) {
            cleanerCnt += quantity;
            return cleanerCnt;
        } else if(type.equals(Volunteer.VolunteerType.Server)){
            serverCnt  += quantity;
            return serverCnt;
        }
        return 0;
    }
    
    public int getVolunteer (VolunteerType type) {
        return addVolunteer(0, type);
    }
}
