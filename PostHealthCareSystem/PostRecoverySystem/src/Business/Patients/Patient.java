/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Patients;

import Business.CareGiver.CareGiver;
import Business.UserAccount.UserAccount;

/**
 *
 * @author samik
 */
public class Patient extends UserAccount{
    
    private String patientName;
    private String heartRate;
    private String age;
    private String address;
    private String phone;
    private CareGiver caregiver;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public CareGiver getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(CareGiver caregiver) {
        this.caregiver = caregiver;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getOxygenlevel() {
        return oxygenlevel;
    }

    public void setOxygenlevel(String oxygenlevel) {
        this.oxygenlevel = oxygenlevel;
    }
    private String height;
    private String weight;
    private String oxygenlevel;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    private String bloodPressure;
    private String severity;
    private String email;
    private String orderId;

    public String getName() {
        return patientName;
    }

    public void setName(String customerName) {
        this.patientName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return patientName;
    }
}
