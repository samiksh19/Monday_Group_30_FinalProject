/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.RoleMain;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.RoleMain.Patient;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author dalea
 */
public abstract class Role {
    public enum RoleType{
        Patient("Patient");
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
    
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, Business business, Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
