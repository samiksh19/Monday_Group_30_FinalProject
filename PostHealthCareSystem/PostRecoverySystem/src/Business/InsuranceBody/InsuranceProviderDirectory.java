/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.InsuranceBody;

import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class InsuranceProviderDirectory {
    private ArrayList<InsuranceBody> insuranceProviderList;

    public InsuranceProviderDirectory() {
        insuranceProviderList = new ArrayList<InsuranceBody>();
    }
   
    public ArrayList<InsuranceBody> getInsuranceProviderList() {
        return insuranceProviderList;
    }

    public void setInsuranceProviderList(ArrayList<InsuranceBody> insuranceProviderList) {
        this.insuranceProviderList = insuranceProviderList;
    }
    
    public ArrayList<InsuranceBody> addInsuranceProvider(InsuranceBody c){
       
        insuranceProviderList.add(c);
        return insuranceProviderList;
    }
     public ArrayList<InsuranceBody> deleteInsuranceProvider(InsuranceBody c){
       
        insuranceProviderList.remove(c);
        return insuranceProviderList;
    }
}
