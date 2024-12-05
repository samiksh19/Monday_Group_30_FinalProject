/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.CaregiverRole;

/**
 *
 * @author samik
 */
public class ClinicalSupportOrganization extends Organization {
    
    private CaregiverRole caregiver;

    public CaregiverRole getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(CaregiverRole caregiver) {
        this.caregiver = caregiver;
    }
    public ClinicalSupportOrganization() {
        
        super(Organization.OrganizationType.ClinicalSupportOrg.getValue());
     }
     
}
