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
    private int quantity;
    
    
    public enum VolunteerType{
        Cleaner("Cleaner"),
        Server("Server");
        
        private String value;
        
        private VolunteerType(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        public String toString() {
            return this.value;
        }
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
