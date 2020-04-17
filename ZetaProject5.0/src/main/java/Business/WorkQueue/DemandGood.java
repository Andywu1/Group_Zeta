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
public class DemandGood {
    private String name;
    private int value;
    
    private DemandGood(){
        
    }
    
    public DemandGood(String name, int value){
        this.name=name;
        this.value=value;
    }
    
    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

}