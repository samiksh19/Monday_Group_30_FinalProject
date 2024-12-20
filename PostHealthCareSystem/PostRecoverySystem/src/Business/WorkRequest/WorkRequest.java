/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import Business.Account.Account;
import Business.AmbulanceDriver.AmbulanceDriver;
import Business.Doctors.Doctor;
import Business.Hospital.HospitalAdmin;
import Business.InsuranceBody.InsuranceBody;
import Business.LabAssistant.LabAssistant;
import Business.MedicalInformation.MedicalInformation;
import Business.Nurse.Nurse;
import Business.Patients.Patient;
import Business.Pharmaceutical.Pharmaceutical;
import Business.Pharmacy.Pharmacy;
import Business.Porter.Porter;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author samik
 */
public class WorkRequest extends UserAccount{
     private String message;
    private String zoomLink;
    private String testType;
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    private Patient patient;
    private Pharmacy pharmacy;
    private Porter deliverMan;
    private Nurse nurse;
    private Doctor doctor;
    private InsuranceBody insurance;
    private HospitalAdmin hospitalAdmin;
    private LabAssistant labAssistant;
    private AmbulanceDriver ambulanceDriver;
    private Account account;
    private Pharmaceutical pharmaceutical;
    private MedicalInformation medInfo;
    private String status;
    private String bill;
    private Date requestDate;
    private Date resolveDate;
  
    
    public WorkRequest(){
        requestDate = new Date();
    }
    
     public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getZoomLink() {
        return zoomLink;
    }

    public void setZoomLink(String zoomLink) {
        this.zoomLink = zoomLink;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public InsuranceBody getInsurance() {
        return insurance;
    }

    public void setInsurance(InsuranceBody insurance) {
        this.insurance = insurance;
    }
    
    
    
    
    

    public MedicalInformation getMedInfo() {
        return medInfo;
    }

    public void setMedInfo(MedicalInformation medInfo) {
        this.medInfo = medInfo;
    }    
       
    public HospitalAdmin getHospitalAdmin() {
        return hospitalAdmin;
    }

    public void setHospitalAdmin(HospitalAdmin hospitalAdmin) {
        this.hospitalAdmin = hospitalAdmin;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public LabAssistant getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(LabAssistant labAssistant) {
        this.labAssistant = labAssistant;
    }

    public AmbulanceDriver getAmbulanceDriver() {
        return ambulanceDriver;
    }

    public void setAmbulanceDriver(AmbulanceDriver ambulanceDriver) {
        this.ambulanceDriver = ambulanceDriver;
    }
    
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    public Nurse getReception() {
        return nurse;
    }

    public void setReception(Nurse reception) {
        this.nurse = reception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient customer) {
        this.patient = customer;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public Porter getDeliverMan() {
        return deliverMan;
    }

    public void setDeliverMan(Porter deliverMan) {
        this.deliverMan = deliverMan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pharmaceutical getPharmaceutical() {
        return pharmaceutical;
    }

    public void setPharmaceutical(Pharmaceutical pharmaceutical) {
        this.pharmaceutical = pharmaceutical;
    }
    
    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    @Override
    public String toString(){
        return this.message;
    }
    
}
