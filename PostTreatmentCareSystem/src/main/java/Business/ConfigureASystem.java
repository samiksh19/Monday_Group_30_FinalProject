/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Roles.AdminRole;
import Business.Roles.Person;
import Business.UserAccount.UserAccount;
import Business.DBO4OUtil.DB4OUtil;
import Business.Roles.Role;


/**
 *
 * @author samik
 */
public class ConfigureASystem {
    public static Business configure(){
    Business business = Business.getInstance();
    
        Person person = null;
        //Creating sysadmin user account
        UserAccount sysAdmin = business.getUserAccountDirectory().createUserAccount("dsadmin", "dsadmin", person, new AdminRole());       
        return business;
        }
    
    
}
