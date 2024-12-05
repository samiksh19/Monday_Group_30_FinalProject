/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.UserAccount.UserAccount;

/**
 *
 * @author samik
 */
public class ConfigureASystem {
    Business business = Business.getInstance();
        Person person = null;
        //Creating sysadmin user account
        UserAccount sysAdmin = business.getUserAccountDirectory().createUserAccount("dsadmin", "dsadmin", person, new SystemAdminRole());       
        return business;
    
}
