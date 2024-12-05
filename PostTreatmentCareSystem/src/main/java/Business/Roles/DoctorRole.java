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
public class DoctorRole extends Person {
    private int id;
    private ArrayList<PatientRole> patientList ;
    private ArrayList<NurseRole> nurseList ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<PatientRole> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<PatientRole> patientList) {
        this.patientList = patientList;
    }

    public ArrayList<NurseRole> getNurseList() {
        return nurseList;
    }

    public void setNurseList(ArrayList<NurseRole> nurseList) {
        this.nurseList = nurseList;
    }
}
