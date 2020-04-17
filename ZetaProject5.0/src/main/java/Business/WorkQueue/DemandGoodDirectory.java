/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.HashMap;

/**
 *
 * @author kathe
 */
public class DemandGoodDirectory {
    private HashMap<String, DemandGood> DemandGoodMap;
    public DemandGoodDirectory() {
        DemandGoodMap = new HashMap<>();
    }
    public HashMap<String, DemandGood> getDemandGoodMap() {
        return DemandGoodMap==null?DemandGoodMap=new HashMap<>():DemandGoodMap;
    }

    public void setDemandValue(String name, int need) {
        DemandGoodMap.get(name).setValue(need);
    }
    
    public void addDemandGood(DemandGood dg) {
        DemandGoodMap.put(dg.getName(), dg);
    }
    
    public boolean haveDemandGood(String name) {
        return DemandGoodMap.containsKey(name);
    }
    
    public void deleteDemandGood(String name){
        DemandGoodMap.remove(name);
    }
}
