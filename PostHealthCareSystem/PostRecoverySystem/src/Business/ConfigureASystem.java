/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author prach
 */
public class ConfigureASystem {
    public static Business configure(){
        
        Business system = Business.getInstance();
        System.out.println("ConfigureSystem: "+system);
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
       Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
       UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SysAdminRole());
        
        return system;
    }
}
