/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author prach
 */
public class HospitalAdminDirectory {
     private ArrayList<HospitalAdmin> hospitalList;

    public HospitalAdminDirectory() {
        hospitalList = new ArrayList<HospitalAdmin>();
    }
    
    public ArrayList<HospitalAdmin> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<HospitalAdmin> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    public ArrayList<HospitalAdmin> addHospital(HospitalAdmin c){
       
        hospitalList.add(c);
        return hospitalList;
    }
     public ArrayList<HospitalAdmin> deleteHospital(HospitalAdmin c){
       
        hospitalList.remove(c);
        return hospitalList;
    }
}
