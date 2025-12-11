/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author gagan
 */
public class VitalSignHistory {
    
    ArrayList<VitalSign> history;
    
    public VitalSignHistory(){
        this.history = new ArrayList<>();
    }

    public ArrayList<VitalSign> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }
    
    public VitalSign addNewVital(){
        //Step 1: Instantiate the Vital Sign
        VitalSign newVital = new VitalSign();
        //Step 2: Put newly created object to arraylist
        history.add(newVital);
        //Step 3: return the Vital Sign
        return newVital;
    }
    
    public void deleteVital(VitalSign vs){
        history.remove(vs);
    }
    
}
