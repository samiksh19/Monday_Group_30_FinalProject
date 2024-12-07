/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Account.AccountDirectory;
import Business.AmbulanceDriver.AmbulanceDriverDirectory;
import Business.Doctors.DoctorDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Hospital.HospitalAdminDirectory;
import Business.InsuranceBody.InsuranceProviderDirectory;
import Business.LabAssistant.LabAssistantDirectory;
import Business.MedicalInformation.MedicalInformationDirectory;
import Business.Nurse.NurseDirectory;
import Business.Patients.PatientDirectory;
import Business.Pharmaceuticals.PharmaceuticalDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Porter.PorterDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkRequest.PharmacyInventory;
import Business.WorkRequest.WorkList;
import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author samik
 */
public abstract class Organization {
    private String name;
    private WorkList workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PatientDirectory patientDirectory;
    private PorterDirectory deliveryManDirectory;
    private PharmacyDirectory pharmacyDirectory;
    private PharmaceuticalDirectory pharmaceuticalDirectory;
    private HospitalAdminDirectory hospitalDirectory;
    private DoctorDirectory doctorDirectory;
    private NurseDirectory nurseDirectory;
    private AmbulanceDriverDirectory ambulanceDirectory;
    private LabAssistantDirectory labAssistantDirectory;
    private AccountDirectory accountDirectory; 
    private MedicalInformationDirectory medInfoDirectory;
    private PharmacyInventory itemList;
    private InsuranceProviderDirectory insuranceProviderDirectory;
    
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        PharmacyAdmin("PharmacyAdmin"),
        HospitalAdmin("HospitalAdmin"),
        PharmaceuticalAdmin("PharmaceuticalAdmin"),
        GovernmentAdmin("GovernmentAdmin"),
        Patient("Patient"),
        Doctor("Doctor"),
        Nurse("Nurse"),
        Ambulance("Ambulance"),
        Lab("Lab"),
        Account("Account"),
        DeliveryMan("Delivery"),
        InsuranceAdmin("InsuranceAdmin"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkList();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory = new PatientDirectory();
        deliveryManDirectory = new PorterDirectory();
        pharmacyDirectory = new PharmacyDirectory();
        doctorDirectory = new DoctorDirectory();
        nurseDirectory = new NurseDirectory();
        ambulanceDirectory = new AmbulanceDriverDirectory();
        labAssistantDirectory = new LabAssistantDirectory();
        accountDirectory = new AccountDirectory();
        hospitalDirectory = new HospitalAdminDirectory();
        pharmaceuticalDirectory = new PharmaceuticalDirectory();
        medInfoDirectory = new MedicalInformationDirectory();
        insuranceProviderDirectory = new InsuranceProviderDirectory();
        itemList = new PharmacyInventory();
        organizationID = counter;
        ++counter;
    }

    public AccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(AccountDirectory accountDirectory) {
        this.accountDirectory = accountDirectory;
    }

    public LabAssistantDirectory getLabAssistantDirectory() {
        return labAssistantDirectory;
    }

    public MedicalInformationDirectory getMedInfoDirectory() {
        return medInfoDirectory;
    }

    public void setMedInfoDirectory(MedicalInformationDirectory medInfoDirectory) {
        this.medInfoDirectory = medInfoDirectory;
    }
    
    public void setLabAssistantDirectory(LabAssistantDirectory labAssistantDirectory) {
        this.labAssistantDirectory = labAssistantDirectory;
    }

    public AmbulanceDriverDirectory getAmbulanceDirectory() {
        return ambulanceDirectory;
    }

    public void setAmbulanceDirectory(AmbulanceDriverDirectory ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    public NurseDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public void setReceptionDirectory(NurseDirectory receptionDirectory) {
        this.nurseDirectory = receptionDirectory;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkList getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkList workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PorterDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(PorterDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    
    public PharmaceuticalDirectory getPharmaceuticalDirectory() {
        return pharmaceuticalDirectory;
    }

    public void setPharmaceuticalDirectory(PharmaceuticalDirectory pharmaceuticalDirectory) {
        this.pharmaceuticalDirectory = pharmaceuticalDirectory;
    }

    public PharmacyInventory getItemList() {
        return itemList;
    }

    public void setItemList(PharmacyInventory itemList) {
        this.itemList = itemList;
    }

    public HospitalAdminDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalAdminDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public InsuranceProviderDirectory getInsuranceProviderDirectory() {
        return insuranceProviderDirectory;
    }

    public void setInsuranceProviderDirectory(InsuranceProviderDirectory insuranceProviderDirectory) {
        this.insuranceProviderDirectory = insuranceProviderDirectory;
    }
}
