/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.UserAccount.UserAccount;
import Business.Business;
import javax.swing.JPanel;

/**
 *
 * @author dalea
 */
public abstract class Role {
    
    public enum RoleType{
        PharmacyAdmin("PharmacyAdmin"),
        Patient("Patient"),
        Reception("Reception"),
        GovernmentAdmin("GovernmentAdmin"),
        HospitalAdmin("HospitalAdmin"),
        PharmaceuticalAdmin("PharmaceuticalAdmin"),
        Doctor("Doctor"),
        DeliveryMan("Delivery"),
        AmbulanceDriver("AmbulanceDriver"),
        Lab("Lab"),
        InsuranceAdmin("InsuranceAdmin"),
        SysAdmin("Sysadmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,
            Business business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
