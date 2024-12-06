/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Roles.Person;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author samik
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

     public UserAccount createUserAccount(String username, String password, Person employee, Role role){
        UserAccount uA = new UserAccount();
        uA.setUsername(username);
        uA.setPassword(password);
        uA.setPerson(employee);
        uA.setRole(role);
        userAccountList.add(uA);
        return uA;
    }
     
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                System.out.println("User account found");
                return ua;
            }
        System.out.println("User account NULL");
        return null;
    }
}
