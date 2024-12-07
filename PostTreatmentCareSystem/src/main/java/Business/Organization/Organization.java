/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Roles.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author samik
 */
public abstract class Organization {

    private String name;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private int organizationID;
    private static int counter = 0;
    
    public Organization(String name) {
        this.name = name;
        userAccountDirectory = new UserAccountDirectory();      
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        organizationID = counter;
        ++counter;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public enum OrganizationType {
        AdminOrg("Admin Organization"),
        ClinicalSupportOrg("Clinical Support Organization"),
        NursingOrg("Nursing Organization"),
        PatientSupportOrg("Patient Support Organization"),
        HospitalOrg("Hospital Organization"),
        PharmacyOrg("Medical Organization");

        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
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

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
