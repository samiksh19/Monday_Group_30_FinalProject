/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Business;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.LabAssistant.LabAssistantWorkArea;

/**
 *
 * @author dalea
 */
public class LabExaminerRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Business business) {
        return new LabAssistantWorkArea(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
    }
}
