/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import java.util.UUID;

/**
 *
 * @author samik
 */
<<<<<<< HEAD
public class InsuranceWorkRequest {
=======
public class InsuranceWorkRequest extends WorkRequest{
>>>>>>> 4362381352b9cc7356dff0fad4c9efed18034a37
    private String patientName;
    private String id;
    private int claimAmount;
    private String treatment;

    public InsuranceWorkRequest() {
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
    }
    
    

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(int claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    
    
}
