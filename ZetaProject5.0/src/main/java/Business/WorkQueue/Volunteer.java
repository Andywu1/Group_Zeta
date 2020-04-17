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
public class Volunteer {
    private int cleanerCount;
    private int serverCount;

    public Volunteer() {
        cleanerCount=0;
        serverCount=0;
    }
    
   
    
    public int getCleanerCount() {
        return cleanerCount;
    }

    public void setCleanerCount(int cleanerCount) {
        this.cleanerCount = cleanerCount;
    }

    public int getServerCount() {
        return serverCount;
    }

    public void setServerCount(int serverCount) {
        this.serverCount = serverCount;
    }
    
}
