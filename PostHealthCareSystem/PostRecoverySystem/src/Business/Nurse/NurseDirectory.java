/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Nurse;

import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class NurseDirectory {
    private ArrayList<Nurse> nurselist;
    
    public NurseDirectory(){
        nurselist = new ArrayList<>();
    }
    public ArrayList<Nurse> getReceptionList() {
        return nurselist;
        
    }
    
    public ArrayList<Nurse> addReception(Nurse c){
       
        nurselist.add(c);
        return nurselist;
    }
     public ArrayList<Nurse> removeReception(Nurse c){
       
        nurselist.remove(c);
        return nurselist;
    }
}
