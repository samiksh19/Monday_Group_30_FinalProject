/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Account.AccountDirectory;
import Business.AmbulanceDriver.AmbulanceDriverDirectory;
import Business.Doctors.DoctorDirectory;
import Business.Hospital.HospitalAdminDirectory;
import Business.LabAssistant.LabAssistantDirectory;
import Business.MedicalInformation.MedicalInformationDirectory;
import Business.Nurse.NurseDirectory;
import Business.Patients.PatientDirectory;
import Business.Pharmaceutical.PharmaceuticalDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Porter.PorterDirectory;
import Business.WorkRequest.WorkList;
import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author samik
 */
public class Business extends Organization{
   
    private static Business business;
    private PharmacyDirectory pharmacyDirectory;
    private PatientDirectory patientDirectory;
    private PorterDirectory deliveryManDirectory;
    private HospitalAdminDirectory hospitalDirectory;
    private PharmaceuticalDirectory pharmaceuticalDirectory;
    private DoctorDirectory doctorDirectory;
    private NurseDirectory nurseDirectory;
    private AmbulanceDriverDirectory ambulanceDriverDirectory;
    private LabAssistantDirectory labAssistantDirectory;
    private AccountDirectory accountDirectory;
    private MedicalInformationDirectory medInfoDirectory; 
    private WorkList workQueue;
    
     public Business(PharmacyDirectory pharmacyDirectory, MedicalInformationDirectory medInfoDirectory, AccountDirectory accountDirectory, LabAssistantDirectory labAssistantDirectory, AmbulanceDriverDirectory ambulanceDriverDirectory, PatientDirectory patientDirectory, PorterDirectory deliveryManDirectory,HospitalAdminDirectory hospitalDirectory,PharmaceuticalDirectory pharmaceuticalDirectory, DoctorDirectory doctorDirectory, NurseDirectory receptionDirectory, WorkList workQueue) {
        this.pharmacyDirectory = pharmacyDirectory;
        this.patientDirectory = patientDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.pharmaceuticalDirectory = pharmaceuticalDirectory;
        this.doctorDirectory = doctorDirectory;
        this.nurseDirectory = receptionDirectory;
        this.ambulanceDriverDirectory = ambulanceDriverDirectory;
        this.labAssistantDirectory = labAssistantDirectory;
        this.accountDirectory = accountDirectory;
        this.medInfoDirectory = medInfoDirectory;
        this.workQueue = workQueue;
    }
    
      public static Business getInstance(){
        if(business == null){
            business = new Business();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        //roleList.add(new SysAdminRole());
        return roleList;
    }
    private Business(){
        super(null);
        //networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
      if (!this.getUserAccountDirectory().checkUsernameUnique(userName)){
            return false;
        }
       return true;
    }
    
}
