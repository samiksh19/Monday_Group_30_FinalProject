/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class NurseRole extends Person {

    private int id;
    private int doctorId;
    private ArrayList<PatientRole> patientList ;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public ArrayList<PatientRole> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<PatientRole> patientList) {
        this.patientList = patientList;
    }
}
