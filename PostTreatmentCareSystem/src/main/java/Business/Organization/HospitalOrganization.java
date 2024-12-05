/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.DoctorRole;
import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class HospitalOrganization extends Organization{
    private DoctorRole getDoctor;
    
     public HospitalOrganization() {
        
        super(OrganizationType.HospitalOrg.getValue());
     }
     
     public DoctorRole getDoctor() {
        return getDoctor;
    }
     
}
